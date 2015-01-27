from atom.auth import EndpointsAuth
from common import *


class UserModel(EndpointsModel):
    """
    The default user model.
    """
    user = ndb.UserProperty()
    email = ndb.StringProperty(required=True)

    # Name
    nickname = ndb.StringProperty()

    def update_name(self, name):
        self.nickname = name
        return name

    # Meetups
    meetups = ndb.KeyProperty(repeated=True, kind='Meetup')

    def add_meetup(self, a_meetup):
        self.meetups.append(a_meetup)
        self.put()
        return a_meetup

    # GCM Registration ID of Location uploading device.
    gcm_main = ndb.StringProperty()
    gcm_list = ndb.StringProperty(repeated=True)

    def add_device(self, id, main=True):
        if main:
            self.gcm_main = id
        if id not in self.gcm_list:
            self.gcm_list.append(id)
        self.put()
        return self.gcm_main

    phone = ndb.StringProperty()

    # Friends
    friends = ndb.KeyProperty(repeated=True, kind='UserModel')  # NDB Hack. No other way.

    def add_friend(self, friend):
        if friend not in self.friends:
            self.friends.append(friend)
            self.put()
            return self.friends
        return


def check_user():
    """
    Checks if a UserModel exists against current OAuth token.
    Returns NULL/None if none found.
    :return: UserModel corresponding to given auth token.
    """
    user = endpoints.get_current_user()
    email = user.email()
    userqry = UserModel.query(UserModel.email == email)
    if userqry.count():
        return userqry.get()
    return None


def check_or_make():
    """
    Will return a user, or make the current user one.
    Maps to E-Mail ID.
    :return: A User, retrieved or created.
    """
    user = check_user()
    if not user:
        user = endpoints.get_current_user()
        user = UserModel(user=user,
                         email=user.email(),
                         nickname=user.nickname(),
                         id=user.user_id())
        user.put()
    return user


import atom.data
import gdata.data
import gdata.contacts
import gdata.contacts.client
import gdata.contacts.data


@endpoints.api(name='users_api',
               version='v1',
               description="Handle Users and Accounts for Meetups Apps.",
               audiences=client_ids.allowed_client_ids,
               scopes=[  # Get email and Details
                         endpoints.EMAIL_SCOPE,
                         # Get Contacts
                         client_ids.CONTACTS_SCOPE
               ])
class UserApi(remote.Service):
    """
    All the API endponts for User Accounts for Meetup - WayHome app.
    """

    @UserModel.method(path='check_make_user',
                      request_fields=('email', 'user',),
                      name='user.fetch',
                      user_required=True)
    def check_or_make_user(self, query):
        return check_or_make()

    FIRST_LOGIN_RESOURCE = endpoints.ResourceContainer(
        name=messages.StringField(1, required=True),
        phNumber=messages.StringField(2, required=True),
        regID=messages.StringField(3, required=True)
    )

    @endpoints.method(FIRST_LOGIN_RESOURCE,  # Goes in
                      api_reply,  # Comes out
                      path='firstLogin/{name}/{phNumber}/{regID}',
                      name='user.firstLogin',
                      http_method='POST')
    def first_login(self, request):
        e_user = endpoints.get_current_user()
        if e_user:
            if check_user():
                return api_reply(str_value="Account already exists.",
                                 int_value=2)
            user = UserModel(nickname=request.name,
                             phone=request.phNumber,
                             gcm_main=request.regID,
                             email=e_user.email(),
                             id=e_user.user_id(),
                             user=e_user)
            user.put()
            return api_reply(str_value="Created Account for " + user.nickname,
                             int_value=1)
        return api_reply(str_value="Unauthenticated. Please login.",
                         int_value=0)

    # @endpoints.method(message_types.VoidMessage,
    # api_reply,
    # path="auth_web_session",
    #                   name="auth_web_session")
    # def auth_web_session(self, request):
    #     # print self.request_state.headers._headers
    #     # all_contacts(gd_client)
    #     flow = OAuth2WebServerFlow(
    #         client_id = "812458715891-p8e6e4oqph65matkdr1v06r02vtri1du.apps.googleusercontent.com",
    #         client_secret= "RI_-U5vqK-Do6MoVTLrw838n",
    #         scope=client_ids.CONTACTS_SCOPE,
    #         redirect_uri='http://localhost:8080/_ah/api/users_api/v1/auth_web_session_step2',
    #     )
    #     auth_uri = flow.step1_get_authorize_url()
    #     return api_reply(str_value=auth_uri)

    @endpoints.method(path="print_contacts",
                      name="print_contacts")
    def auth_web_session_step2(self, request):
        e_user = endpoints.get_current_user()
        if e_user:
            gd_client = gdata.contacts.client.ContactsClient(source='<var>intense-terra-821</var>',
                                                             auth_token=EndpointsAuth())
            #all_contacts(gd_client)
            all_contacts(gd_client)
        return message_types.VoidMessage()


def all_contacts(gd_client):
    """
    Takes an authentication gdata client and prints all contacts neatly.
    :param gd_client: gdata client object with authentication token thrown in.
    :return: Null.
    """
    query = gdata.contacts.client.ContactsQuery()
    # updated_min = '2008-01-01'
    # query.updated_min = updated_min
    query.max_results = 1500
    feed = gd_client.GetContacts(q=query)
    for i, entry in enumerate(feed.entry):
        print "Contact {0} + {1}".format(i, '*' * 50)
        try:
            if entry.name:
                if entry.name.full_name:
                    print '\n%s' % (entry.name.full_name.text)
            if entry.content:
                print '    %s' % (entry.content.text)
            # Display the primary email address for the contact.
            for email in entry.email:
                if email.primary and email.primary == 'true':
                    print '    %s' % (email.address)
            # Show the contact groups that this contact is a member of.
            for group in entry.group_membership_info:
                print '    Member of group: %s' % (group.href)
            # Display extended properties.
            for extended_property in entry.extended_property:
                if extended_property.value:
                    value = extended_property.value
                else:
                    value = extended_property.GetXmlBlob()
                print '    Extended Property - %s: %s' % (extended_property.name, value)
        except Exception as e:
            print e

