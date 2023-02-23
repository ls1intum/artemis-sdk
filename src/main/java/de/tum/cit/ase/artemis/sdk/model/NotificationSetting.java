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
import de.tum.cit.ase.artemis.sdk.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * NotificationSetting
 */
@JsonPropertyOrder({
  NotificationSetting.JSON_PROPERTY_ID,
  NotificationSetting.JSON_PROPERTY_SETTING_ID,
  NotificationSetting.JSON_PROPERTY_WEBAPP,
  NotificationSetting.JSON_PROPERTY_EMAIL,
  NotificationSetting.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class NotificationSetting {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SETTING_ID = "settingId";
  private String settingId;

  public static final String JSON_PROPERTY_WEBAPP = "webapp";
  private Boolean webapp;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private Boolean email;

  public static final String JSON_PROPERTY_USER = "user";
  private User user;

  public NotificationSetting() { 
  }

  public NotificationSetting id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public NotificationSetting settingId(String settingId) {
    this.settingId = settingId;
    return this;
  }

   /**
   * Get settingId
   * @return settingId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSettingId() {
    return settingId;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettingId(String settingId) {
    this.settingId = settingId;
  }


  public NotificationSetting webapp(Boolean webapp) {
    this.webapp = webapp;
    return this;
  }

   /**
   * Get webapp
   * @return webapp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBAPP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebapp() {
    return webapp;
  }


  @JsonProperty(JSON_PROPERTY_WEBAPP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebapp(Boolean webapp) {
    this.webapp = webapp;
  }


  public NotificationSetting email(Boolean email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(Boolean email) {
    this.email = email;
  }


  public NotificationSetting user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(User user) {
    this.user = user;
  }


  /**
   * Return true if this NotificationSetting object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSetting notificationSetting = (NotificationSetting) o;
    return Objects.equals(this.id, notificationSetting.id) &&
        Objects.equals(this.settingId, notificationSetting.settingId) &&
        Objects.equals(this.webapp, notificationSetting.webapp) &&
        Objects.equals(this.email, notificationSetting.email) &&
        Objects.equals(this.user, notificationSetting.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, settingId, webapp, email, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSetting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
    sb.append("    webapp: ").append(toIndentedString(webapp)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
