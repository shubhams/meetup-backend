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
 * on 2015-02-16 at 12:37:19 UTC 
 * Modify at your own risk.
 */

package com.appspot.intense_terra_821.users_api.model;

/**
 * A standard reply. Because Proto_RPC. Yay.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the users_api. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApiCommonApiReply extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("int_value") @com.google.api.client.json.JsonString
  private java.lang.Long intValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("str_value")
  private java.lang.String strValue;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntValue() {
    return intValue;
  }

  /**
   * @param intValue intValue or {@code null} for none
   */
  public ApiCommonApiReply setIntValue(java.lang.Long intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStrValue() {
    return strValue;
  }

  /**
   * @param strValue strValue or {@code null} for none
   */
  public ApiCommonApiReply setStrValue(java.lang.String strValue) {
    this.strValue = strValue;
    return this;
  }

  @Override
  public ApiCommonApiReply set(String fieldName, Object value) {
    return (ApiCommonApiReply) super.set(fieldName, value);
  }

  @Override
  public ApiCommonApiReply clone() {
    return (ApiCommonApiReply) super.clone();
  }

}
