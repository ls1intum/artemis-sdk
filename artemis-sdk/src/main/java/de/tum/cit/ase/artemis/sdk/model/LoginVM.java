/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.tum.cit.ase.artemis.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * LoginVM
 */
@JsonPropertyOrder({
  LoginVM.JSON_PROPERTY_USERNAME,
  LoginVM.JSON_PROPERTY_PASSWORD,
  LoginVM.JSON_PROPERTY_REMEMBER_ME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class LoginVM {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_REMEMBER_ME = "rememberMe";
  private Boolean rememberMe;

  public LoginVM() { 
  }

  public LoginVM username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public LoginVM password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public LoginVM rememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
    return this;
  }

   /**
   * Get rememberMe
   * @return rememberMe
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMEMBER_ME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRememberMe() {
    return rememberMe;
  }


  @JsonProperty(JSON_PROPERTY_REMEMBER_ME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
  }


  /**
   * Return true if this LoginVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginVM loginVM = (LoginVM) o;
    return Objects.equals(this.username, loginVM.username) &&
        Objects.equals(this.password, loginVM.password) &&
        Objects.equals(this.rememberMe, loginVM.rememberMe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, rememberMe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginVM {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

