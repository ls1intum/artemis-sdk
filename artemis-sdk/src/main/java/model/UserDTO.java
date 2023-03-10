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
import org.openapitools.client.model.GuidedTourSetting;
import org.openapitools.client.model.Organization;

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
 * UserDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class UserDTO {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_VISIBLE_REGISTRATION_NUMBER = "visibleRegistrationNumber";
  @SerializedName(SERIALIZED_NAME_VISIBLE_REGISTRATION_NUMBER)
  private String visibleRegistrationNumber;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_ACTIVATED = "activated";
  @SerializedName(SERIALIZED_NAME_ACTIVATED)
  private Boolean activated;

  public static final String SERIALIZED_NAME_LANG_KEY = "langKey";
  @SerializedName(SERIALIZED_NAME_LANG_KEY)
  private String langKey;

  public static final String SERIALIZED_NAME_LAST_NOTIFICATION_READ = "lastNotificationRead";
  @SerializedName(SERIALIZED_NAME_LAST_NOTIFICATION_READ)
  private OffsetDateTime lastNotificationRead;

  public static final String SERIALIZED_NAME_AUTHORITIES = "authorities";
  @SerializedName(SERIALIZED_NAME_AUTHORITIES)
  private Set<String> authorities = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Set<String> groups = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_GUIDED_TOUR_SETTINGS = "guidedTourSettings";
  @SerializedName(SERIALIZED_NAME_GUIDED_TOUR_SETTINGS)
  private Set<GuidedTourSetting> guidedTourSettings = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private Set<Organization> organizations = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_VCS_ACCESS_TOKEN = "vcsAccessToken";
  @SerializedName(SERIALIZED_NAME_VCS_ACCESS_TOKEN)
  private String vcsAccessToken;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public UserDTO() {
  }

  public UserDTO createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public UserDTO createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public UserDTO lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public UserDTO lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public UserDTO id(Long id) {
    
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


  public UserDTO login(String login) {
    
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


  public UserDTO name(String name) {
    
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


  public UserDTO firstName(String firstName) {
    
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


  public UserDTO lastName(String lastName) {
    
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


  public UserDTO email(String email) {
    
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


  public UserDTO visibleRegistrationNumber(String visibleRegistrationNumber) {
    
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


  public UserDTO imageUrl(String imageUrl) {
    
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


  public UserDTO activated(Boolean activated) {
    
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @javax.annotation.Nullable

  public Boolean getActivated() {
    return activated;
  }


  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  public UserDTO langKey(String langKey) {
    
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


  public UserDTO lastNotificationRead(OffsetDateTime lastNotificationRead) {
    
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


  public UserDTO authorities(Set<String> authorities) {
    
    this.authorities = authorities;
    return this;
  }

  public UserDTO addAuthoritiesItem(String authoritiesItem) {
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

  public Set<String> getAuthorities() {
    return authorities;
  }


  public void setAuthorities(Set<String> authorities) {
    this.authorities = authorities;
  }


  public UserDTO groups(Set<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public UserDTO addGroupsItem(String groupsItem) {
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


  public UserDTO guidedTourSettings(Set<GuidedTourSetting> guidedTourSettings) {
    
    this.guidedTourSettings = guidedTourSettings;
    return this;
  }

  public UserDTO addGuidedTourSettingsItem(GuidedTourSetting guidedTourSettingsItem) {
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


  public UserDTO organizations(Set<Organization> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public UserDTO addOrganizationsItem(Organization organizationsItem) {
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


  public UserDTO vcsAccessToken(String vcsAccessToken) {
    
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


  public UserDTO internal(Boolean internal) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.createdBy, userDTO.createdBy) &&
        Objects.equals(this.createdDate, userDTO.createdDate) &&
        Objects.equals(this.lastModifiedBy, userDTO.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, userDTO.lastModifiedDate) &&
        Objects.equals(this.id, userDTO.id) &&
        Objects.equals(this.login, userDTO.login) &&
        Objects.equals(this.name, userDTO.name) &&
        Objects.equals(this.firstName, userDTO.firstName) &&
        Objects.equals(this.lastName, userDTO.lastName) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.visibleRegistrationNumber, userDTO.visibleRegistrationNumber) &&
        Objects.equals(this.imageUrl, userDTO.imageUrl) &&
        Objects.equals(this.activated, userDTO.activated) &&
        Objects.equals(this.langKey, userDTO.langKey) &&
        Objects.equals(this.lastNotificationRead, userDTO.lastNotificationRead) &&
        Objects.equals(this.authorities, userDTO.authorities) &&
        Objects.equals(this.groups, userDTO.groups) &&
        Objects.equals(this.guidedTourSettings, userDTO.guidedTourSettings) &&
        Objects.equals(this.organizations, userDTO.organizations) &&
        Objects.equals(this.vcsAccessToken, userDTO.vcsAccessToken) &&
        Objects.equals(this.internal, userDTO.internal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, lastModifiedBy, lastModifiedDate, id, login, name, firstName, lastName, email, visibleRegistrationNumber, imageUrl, activated, langKey, lastNotificationRead, authorities, groups, guidedTourSettings, organizations, vcsAccessToken, internal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    visibleRegistrationNumber: ").append(toIndentedString(visibleRegistrationNumber)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    lastNotificationRead: ").append(toIndentedString(lastNotificationRead)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    guidedTourSettings: ").append(toIndentedString(guidedTourSettings)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    vcsAccessToken: ").append(toIndentedString(vcsAccessToken)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
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
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("lastModifiedBy");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("id");
    openapiFields.add("login");
    openapiFields.add("name");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("visibleRegistrationNumber");
    openapiFields.add("imageUrl");
    openapiFields.add("activated");
    openapiFields.add("langKey");
    openapiFields.add("lastNotificationRead");
    openapiFields.add("authorities");
    openapiFields.add("groups");
    openapiFields.add("guidedTourSettings");
    openapiFields.add("organizations");
    openapiFields.add("vcsAccessToken");
    openapiFields.add("internal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("login");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserDTO is not found in the empty JSON string", UserDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("lastModifiedBy") != null && !jsonObj.get("lastModifiedBy").isJsonNull()) && !jsonObj.get("lastModifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedBy").toString()));
      }
      if (!jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      if ((jsonObj.get("visibleRegistrationNumber") != null && !jsonObj.get("visibleRegistrationNumber").isJsonNull()) && !jsonObj.get("visibleRegistrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibleRegistrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibleRegistrationNumber").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("langKey") != null && !jsonObj.get("langKey").isJsonNull()) && !jsonObj.get("langKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `langKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("langKey").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("authorities") != null && !jsonObj.get("authorities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorities` to be an array in the JSON string but got `%s`", jsonObj.get("authorities").toString()));
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
      if ((jsonObj.get("vcsAccessToken") != null && !jsonObj.get("vcsAccessToken").isJsonNull()) && !jsonObj.get("vcsAccessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vcsAccessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vcsAccessToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UserDTO>() {
           @Override
           public void write(JsonWriter out, UserDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserDTO
  * @throws IOException if the JSON string is invalid with respect to UserDTO
  */
  public static UserDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserDTO.class);
  }

 /**
  * Convert an instance of UserDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

