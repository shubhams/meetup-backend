/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-01-14 17:53:03 UTC)
 * on 2015-02-14 at 10:04:43 UTC 
 * Modify at your own risk.
 */

package com.appspot.intense_terra_821.users_api;

/**
 * Service definition for UsersApi (v1).
 *
 * <p>
 * Handle Users and Accounts for Meetups Apps.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UsersApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class UsersApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.19.1 of the users_api library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://intense-terra-821.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "users_api/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public UsersApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  UsersApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "first_login".
   *
   * This request holds the parameters needed by the users_api server.  After setting any optional
   * parameters, call the {@link FirstLogin#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.intense_terra_821.users_api.model.ApiAuthenticationFirstLoginMessage}
   * @return the request
   */
  public FirstLogin firstLogin(com.appspot.intense_terra_821.users_api.model.ApiAuthenticationFirstLoginMessage content) throws java.io.IOException {
    FirstLogin result = new FirstLogin(content);
    initialize(result);
    return result;
  }

  public class FirstLogin extends UsersApiRequest<com.appspot.intense_terra_821.users_api.model.ApiCommonApiReply> {

    private static final String REST_PATH = "first_login";

    /**
     * Create a request for the method "first_login".
     *
     * This request holds the parameters needed by the the users_api server.  After setting any
     * optional parameters, call the {@link FirstLogin#execute()} method to invoke the remote
     * operation. <p> {@link
     * FirstLogin#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.intense_terra_821.users_api.model.ApiAuthenticationFirstLoginMessage}
     * @since 1.13
     */
    protected FirstLogin(com.appspot.intense_terra_821.users_api.model.ApiAuthenticationFirstLoginMessage content) {
      super(UsersApi.this, "POST", REST_PATH, content, com.appspot.intense_terra_821.users_api.model.ApiCommonApiReply.class);
    }

    @Override
    public FirstLogin setAlt(java.lang.String alt) {
      return (FirstLogin) super.setAlt(alt);
    }

    @Override
    public FirstLogin setFields(java.lang.String fields) {
      return (FirstLogin) super.setFields(fields);
    }

    @Override
    public FirstLogin setKey(java.lang.String key) {
      return (FirstLogin) super.setKey(key);
    }

    @Override
    public FirstLogin setOauthToken(java.lang.String oauthToken) {
      return (FirstLogin) super.setOauthToken(oauthToken);
    }

    @Override
    public FirstLogin setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (FirstLogin) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public FirstLogin setQuotaUser(java.lang.String quotaUser) {
      return (FirstLogin) super.setQuotaUser(quotaUser);
    }

    @Override
    public FirstLogin setUserIp(java.lang.String userIp) {
      return (FirstLogin) super.setUserIp(userIp);
    }

    @Override
    public FirstLogin set(String parameterName, Object value) {
      return (FirstLogin) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "ping_hello".
   *
   * This request holds the parameters needed by the users_api server.  After setting any optional
   * parameters, call the {@link PingHello#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public PingHello pingHello() throws java.io.IOException {
    PingHello result = new PingHello();
    initialize(result);
    return result;
  }

  public class PingHello extends UsersApiRequest<com.appspot.intense_terra_821.users_api.model.ApiCommonApiReply> {

    private static final String REST_PATH = "ping_hello";

    /**
     * Create a request for the method "ping_hello".
     *
     * This request holds the parameters needed by the the users_api server.  After setting any
     * optional parameters, call the {@link PingHello#execute()} method to invoke the remote
     * operation. <p> {@link
     * PingHello#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected PingHello() {
      super(UsersApi.this, "GET", REST_PATH, null, com.appspot.intense_terra_821.users_api.model.ApiCommonApiReply.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public PingHello setAlt(java.lang.String alt) {
      return (PingHello) super.setAlt(alt);
    }

    @Override
    public PingHello setFields(java.lang.String fields) {
      return (PingHello) super.setFields(fields);
    }

    @Override
    public PingHello setKey(java.lang.String key) {
      return (PingHello) super.setKey(key);
    }

    @Override
    public PingHello setOauthToken(java.lang.String oauthToken) {
      return (PingHello) super.setOauthToken(oauthToken);
    }

    @Override
    public PingHello setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (PingHello) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public PingHello setQuotaUser(java.lang.String quotaUser) {
      return (PingHello) super.setQuotaUser(quotaUser);
    }

    @Override
    public PingHello setUserIp(java.lang.String userIp) {
      return (PingHello) super.setUserIp(userIp);
    }

    @Override
    public PingHello set(String parameterName, Object value) {
      return (PingHello) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "print_contacts".
   *
   * This request holds the parameters needed by the users_api server.  After setting any optional
   * parameters, call the {@link PrintContacts#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public PrintContacts printContacts() throws java.io.IOException {
    PrintContacts result = new PrintContacts();
    initialize(result);
    return result;
  }

  public class PrintContacts extends UsersApiRequest<Void> {

    private static final String REST_PATH = "print_contacts";

    /**
     * Create a request for the method "print_contacts".
     *
     * This request holds the parameters needed by the the users_api server.  After setting any
     * optional parameters, call the {@link PrintContacts#execute()} method to invoke the remote
     * operation. <p> {@link PrintContacts#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected PrintContacts() {
      super(UsersApi.this, "POST", REST_PATH, null, Void.class);
    }

    @Override
    public PrintContacts setAlt(java.lang.String alt) {
      return (PrintContacts) super.setAlt(alt);
    }

    @Override
    public PrintContacts setFields(java.lang.String fields) {
      return (PrintContacts) super.setFields(fields);
    }

    @Override
    public PrintContacts setKey(java.lang.String key) {
      return (PrintContacts) super.setKey(key);
    }

    @Override
    public PrintContacts setOauthToken(java.lang.String oauthToken) {
      return (PrintContacts) super.setOauthToken(oauthToken);
    }

    @Override
    public PrintContacts setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (PrintContacts) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public PrintContacts setQuotaUser(java.lang.String quotaUser) {
      return (PrintContacts) super.setQuotaUser(quotaUser);
    }

    @Override
    public PrintContacts setUserIp(java.lang.String userIp) {
      return (PrintContacts) super.setUserIp(userIp);
    }

    @Override
    public PrintContacts set(String parameterName, Object value) {
      return (PrintContacts) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link UsersApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link UsersApi}. */
    @Override
    public UsersApi build() {
      return new UsersApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UsersApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUsersApiRequestInitializer(
        UsersApiRequestInitializer usersapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(usersapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
