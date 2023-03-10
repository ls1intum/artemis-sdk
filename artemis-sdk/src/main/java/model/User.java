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


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.Authority;
import org.openapitools.client.model.GuidedTourSetting;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.TutorialGroupRegistration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACTIVATED = "activated";
  @SerializedName(SERIALIZED_NAME_ACTIVATED)
  private Boolean activated;

  public static final String SERIALIZED_NAME_LANG_KEY = "langKey";
  @SerializedName(SERIALIZED_NAME_LANG_KEY)
  private String langKey;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_RESET_DATE = "resetDate";
  @SerializedName(SERIALIZED_NAME_RESET_DATE)
  private OffsetDateTime resetDate;

  public static final String SERIALIZED_NAME_LAST_NOTIFICATION_READ = "lastNotificationRead";
  @SerializedName(SERIALIZED_NAME_LAST_NOTIFICATION_READ)
  private OffsetDateTime lastNotificationRead;

  public static final String SERIALIZED_NAME_HIDE_NOTIFICATIONS_UNTIL = "hideNotificationsUntil";
  @SerializedName(SERIALIZED_NAME_HIDE_NOTIFICATIONS_UNTIL)
  private OffsetDateTime hideNotificationsUntil;

  public static final String SERIALIZED_NAME_VCS_ACCESS_TOKEN = "vcsAccessToken";
  @SerializedName(SERIALIZED_NAME_VCS_ACCESS_TOKEN)
  private String vcsAccessToken;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Set<String> groups = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_GUIDED_TOUR_SETTINGS = "guidedTourSettings";
  @SerializedName(SERIALIZED_NAME_GUIDED_TOUR_SETTINGS)
  private Set<GuidedTourSetting> guidedTourSettings = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_AUTHORITIES = "authorities";
  @SerializedName(SERIALIZED_NAME_AUTHORITIES)
  private Set<Authority> authorities = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private Set<Organization> organizations = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TUTORIAL_GROUP_REGISTRATIONS = "tutorialGroupRegistrations";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_GROUP_REGISTRATIONS)
  private Set<TutorialGroupRegistration> tutorialGroupRegistrations = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_PARTICIPANT_IDENTIFIER = "participantIdentifier";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_IDENTIFIER)
  private String participantIdentifier;

  public static final String SERIALIZED_NAME_VISIBLE_REGISTRATION_NUMBER = "visibleRegistrationNumber";
  @SerializedName(SERIALIZED_NAME_VISIBLE_REGISTRATION_NUMBER)
  private String visibleRegistrationNumber;

  public User() {
  }

  public User id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public User login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nonnull

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User activated(Boolean activated) {
    
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @javax.annotation.Nonnull

  public Boolean getActivated() {
    return activated;
  }


  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  public User langKey(String langKey) {
    
    this.langKey = langKey;
    return this;
  }

   /**
   * Get langKey
   * @return langKey
  **/
  @javax.annotation.Nullable

  public String getLangKey() {
    return langKey;
  }


  public void setLangKey(String langKey) {
    this.langKey = langKey;
  }


  public User imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public User resetDate(OffsetDateTime resetDate) {
    
    this.resetDate = resetDate;
    return this;
  }

   /**
   * Get resetDate
   * @return resetDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getResetDate() {
    return resetDate;
  }


  public void setResetDate(OffsetDateTime resetDate) {
    this.resetDate = resetDate;
  }


  public User lastNotificationRead(OffsetDateTime lastNotificationRead) {
    
    this.lastNotificationRead = lastNotificationRead;
    return this;
  }

   /**
   * Get lastNotificationRead
   * @return lastNotificationRead
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastNotificationRead() {
    return lastNotificationRead;
  }


  public void setLastNotificationRead(OffsetDateTime lastNotificationRead) {
    this.lastNotificationRead = lastNotificationRead;
  }


  public User hideNotificationsUntil(OffsetDateTime hideNotificationsUntil) {
    
    this.hideNotificationsUntil = hideNotificationsUntil;
    return this;
  }

   /**
   * Get hideNotificationsUntil
   * @return hideNotificationsUntil
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getHideNotificationsUntil() {
    return hideNotificationsUntil;
  }


  public void setHideNotificationsUntil(OffsetDateTime hideNotificationsUntil) {
    this.hideNotificationsUntil = hideNotificationsUntil;
  }


  public User vcsAccessToken(String vcsAccessToken) {
    
    this.vcsAccessToken = vcsAccessToken;
    return this;
  }

   /**
   * Get vcsAccessToken
   * @return vcsAccessToken
  **/
  @javax.annotation.Nullable

  public String getVcsAccessToken() {
    return vcsAccessToken;
  }


  public void setVcsAccessToken(String vcsAccessToken) {
    this.vcsAccessToken = vcsAccessToken;
  }


  public User groups(Set<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public User addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable

  public Set<String> getGroups() {
    return groups;
  }


  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }


  public User guidedTourSettings(Set<GuidedTourSetting> guidedTourSettings) {
    
    this.guidedTourSettings = guidedTourSettings;
    return this;
  }

  public User addGuidedTourSettingsItem(GuidedTourSetting guidedTourSettingsItem) {
    if (this.guidedTourSettings == null) {
      this.guidedTourSettings = new LinkedHashSet<>();
    }
    this.guidedTourSettings.add(guidedTourSettingsItem);
    return this;
  }

   /**
   * Get guidedTourSettings
   * @return guidedTourSettings
  **/
  @javax.annotation.Nullable

  public Set<GuidedTourSetting> getGuidedTourSettings() {
    return guidedTourSettings;
  }


  public void setGuidedTourSettings(Set<GuidedTourSetting> guidedTourSettings) {
    this.guidedTourSettings = guidedTourSettings;
  }


  public User authorities(Set<Authority> authorities) {
    
    this.authorities = authorities;
    return this;
  }

  public User addAuthoritiesItem(Authority authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new LinkedHashSet<>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @javax.annotation.Nullable

  public Set<Authority> getAuthorities() {
    return authorities;
  }


  public void setAuthorities(Set<Authority> authorities) {
    this.authorities = authorities;
  }


  public User organizations(Set<Organization> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public User addOrganizationsItem(Organization organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new LinkedHashSet<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Get organizations
   * @return organizations
  **/
  @javax.annotation.Nullable

  public Set<Organization> getOrganizations() {
    return organizations;
  }


  public void setOrganizations(Set<Organization> organizations) {
    this.organizations = organizations;
  }


  public User tutorialGroupRegistrations(Set<TutorialGroupRegistration> tutorialGroupRegistrations) {
    
    this.tutorialGroupRegistrations = tutorialGroupRegistrations;
    return this;
  }

  public User addTutorialGroupRegistrationsItem(TutorialGroupRegistration tutorialGroupRegistrationsItem) {
    if (this.tutorialGroupRegistrations == null) {
      this.tutorialGroupRegistrations = new LinkedHashSet<>();
    }
    this.tutorialGroupRegistrations.add(tutorialGroupRegistrationsItem);
    return this;
  }

   /**
   * Get tutorialGroupRegistrations
   * @return tutorialGroupRegistrations
  **/
  @javax.annotation.Nullable

  public Set<TutorialGroupRegistration> getTutorialGroupRegistrations() {
    return tutorialGroupRegistrations;
  }


  public void setTutorialGroupRegistrations(Set<TutorialGroupRegistration> tutorialGroupRegistrations) {
    this.tutorialGroupRegistrations = tutorialGroupRegistrations;
  }


  public User name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public User internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nullable

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public User participantIdentifier(String participantIdentifier) {
    
    this.participantIdentifier = participantIdentifier;
    return this;
  }

   /**
   * Get participantIdentifier
   * @return participantIdentifier
  **/
  @javax.annotation.Nullable

  public String getParticipantIdentifier() {
    return participantIdentifier;
  }


  public void setParticipantIdentifier(String participantIdentifier) {
    this.participantIdentifier = participantIdentifier;
  }


  public User visibleRegistrationNumber(String visibleRegistrationNumber) {
    
    this.visibleRegistrationNumber = visibleRegistrationNumber;
    return this;
  }

   /**
   * Get visibleRegistrationNumber
   * @return visibleRegistrationNumber
  **/
  @javax.annotation.Nullable

  public String getVisibleRegistrationNumber() {
    return visibleRegistrationNumber;
  }


  public void setVisibleRegistrationNumber(String visibleRegistrationNumber) {
    this.visibleRegistrationNumber = visibleRegistrationNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.activated, user.activated) &&
        Objects.equals(this.langKey, user.langKey) &&
        Objects.equals(this.imageUrl, user.imageUrl) &&
        Objects.equals(this.resetDate, user.resetDate) &&
        Objects.equals(this.lastNotificationRead, user.lastNotificationRead) &&
        Objects.equals(this.hideNotificationsUntil, user.hideNotificationsUntil) &&
        Objects.equals(this.vcsAccessToken, user.vcsAccessToken) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.guidedTourSettings, user.guidedTourSettings) &&
        Objects.equals(this.authorities, user.authorities) &&
        Objects.equals(this.organizations, user.organizations) &&
        Objects.equals(this.tutorialGroupRegistrations, user.tutorialGroupRegistrations) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.internal, user.internal) &&
        Objects.equals(this.participantIdentifier, user.participantIdentifier) &&
        Objects.equals(this.visibleRegistrationNumber, user.visibleRegistrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, firstName, lastName, email, activated, langKey, imageUrl, resetDate, lastNotificationRead, hideNotificationsUntil, vcsAccessToken, groups, guidedTourSettings, authorities, organizations, tutorialGroupRegistrations, name, internal, participantIdentifier, visibleRegistrationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    resetDate: ").append(toIndentedString(resetDate)).append("\n");
    sb.append("    lastNotificationRead: ").append(toIndentedString(lastNotificationRead)).append("\n");
    sb.append("    hideNotificationsUntil: ").append(toIndentedString(hideNotificationsUntil)).append("\n");
    sb.append("    vcsAccessToken: ").append(toIndentedString(vcsAccessToken)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    guidedTourSettings: ").append(toIndentedString(guidedTourSettings)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    tutorialGroupRegistrations: ").append(toIndentedString(tutorialGroupRegistrations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    participantIdentifier: ").append(toIndentedString(participantIdentifier)).append("\n");
    sb.append("    visibleRegistrationNumber: ").append(toIndentedString(visibleRegistrationNumber)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("login");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("activated");
    openapiFields.add("langKey");
    openapiFields.add("imageUrl");
    openapiFields.add("resetDate");
    openapiFields.add("lastNotificationRead");
    openapiFields.add("hideNotificationsUntil");
    openapiFields.add("vcsAccessToken");
    openapiFields.add("groups");
    openapiFields.add("guidedTourSettings");
    openapiFields.add("authorities");
    openapiFields.add("organizations");
    openapiFields.add("tutorialGroupRegistrations");
    openapiFields.add("name");
    openapiFields.add("internal");
    openapiFields.add("participantIdentifier");
    openapiFields.add("visibleRegistrationNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("login");
    openapiRequiredFields.add("activated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to User
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("langKey") != null && !jsonObj.get("langKey").isJsonNull()) && !jsonObj.get("langKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `langKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("langKey").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("vcsAccessToken") != null && !jsonObj.get("vcsAccessToken").isJsonNull()) && !jsonObj.get("vcsAccessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vcsAccessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vcsAccessToken").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      if (jsonObj.get("guidedTourSettings") != null && !jsonObj.get("guidedTourSettings").isJsonNull()) {
        JsonArray jsonArrayguidedTourSettings = jsonObj.getAsJsonArray("guidedTourSettings");
        if (jsonArrayguidedTourSettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("guidedTourSettings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `guidedTourSettings` to be an array in the JSON string but got `%s`", jsonObj.get("guidedTourSettings").toString()));
          }

          // validate the optional field `guidedTourSettings` (array)
          for (int i = 0; i < jsonArrayguidedTourSettings.size(); i++) {
            GuidedTourSetting.validateJsonObject(jsonArrayguidedTourSettings.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("authorities") != null && !jsonObj.get("authorities").isJsonNull()) {
        JsonArray jsonArrayauthorities = jsonObj.getAsJsonArray("authorities");
        if (jsonArrayauthorities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authorities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authorities` to be an array in the JSON string but got `%s`", jsonObj.get("authorities").toString()));
          }

          // validate the optional field `authorities` (array)
          for (int i = 0; i < jsonArrayauthorities.size(); i++) {
            Authority.validateJsonObject(jsonArrayauthorities.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("organizations") != null && !jsonObj.get("organizations").isJsonNull()) {
        JsonArray jsonArrayorganizations = jsonObj.getAsJsonArray("organizations");
        if (jsonArrayorganizations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("organizations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `organizations` to be an array in the JSON string but got `%s`", jsonObj.get("organizations").toString()));
          }

          // validate the optional field `organizations` (array)
          for (int i = 0; i < jsonArrayorganizations.size(); i++) {
            Organization.validateJsonObject(jsonArrayorganizations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("tutorialGroupRegistrations") != null && !jsonObj.get("tutorialGroupRegistrations").isJsonNull()) {
        JsonArray jsonArraytutorialGroupRegistrations = jsonObj.getAsJsonArray("tutorialGroupRegistrations");
        if (jsonArraytutorialGroupRegistrations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tutorialGroupRegistrations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tutorialGroupRegistrations` to be an array in the JSON string but got `%s`", jsonObj.get("tutorialGroupRegistrations").toString()));
          }

          // validate the optional field `tutorialGroupRegistrations` (array)
          for (int i = 0; i < jsonArraytutorialGroupRegistrations.size(); i++) {
            TutorialGroupRegistration.validateJsonObject(jsonArraytutorialGroupRegistrations.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("participantIdentifier") != null && !jsonObj.get("participantIdentifier").isJsonNull()) && !jsonObj.get("participantIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participantIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participantIdentifier").toString()));
      }
      if ((jsonObj.get("visibleRegistrationNumber") != null && !jsonObj.get("visibleRegistrationNumber").isJsonNull()) && !jsonObj.get("visibleRegistrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibleRegistrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibleRegistrationNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

