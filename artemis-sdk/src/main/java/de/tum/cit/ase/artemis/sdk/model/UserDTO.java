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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.GuidedTourSetting;
import de.tum.cit.ase.artemis.sdk.model.Organization;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * UserDTO
 */
@JsonPropertyOrder({
  UserDTO.JSON_PROPERTY_CREATED_BY,
  UserDTO.JSON_PROPERTY_CREATED_DATE,
  UserDTO.JSON_PROPERTY_LAST_MODIFIED_BY,
  UserDTO.JSON_PROPERTY_LAST_MODIFIED_DATE,
  UserDTO.JSON_PROPERTY_ID,
  UserDTO.JSON_PROPERTY_LOGIN,
  UserDTO.JSON_PROPERTY_NAME,
  UserDTO.JSON_PROPERTY_FIRST_NAME,
  UserDTO.JSON_PROPERTY_LAST_NAME,
  UserDTO.JSON_PROPERTY_EMAIL,
  UserDTO.JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER,
  UserDTO.JSON_PROPERTY_IMAGE_URL,
  UserDTO.JSON_PROPERTY_ACTIVATED,
  UserDTO.JSON_PROPERTY_LANG_KEY,
  UserDTO.JSON_PROPERTY_LAST_NOTIFICATION_READ,
  UserDTO.JSON_PROPERTY_AUTHORITIES,
  UserDTO.JSON_PROPERTY_GROUPS,
  UserDTO.JSON_PROPERTY_GUIDED_TOUR_SETTINGS,
  UserDTO.JSON_PROPERTY_ORGANIZATIONS,
  UserDTO.JSON_PROPERTY_VCS_ACCESS_TOKEN,
  UserDTO.JSON_PROPERTY_INTERNAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class UserDTO {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "lastModifiedBy";
  private String lastModifiedBy;

  public static final String JSON_PROPERTY_LAST_MODIFIED_DATE = "lastModifiedDate";
  private OffsetDateTime lastModifiedDate;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER = "visibleRegistrationNumber";
  private String visibleRegistrationNumber;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public static final String JSON_PROPERTY_ACTIVATED = "activated";
  private Boolean activated;

  public static final String JSON_PROPERTY_LANG_KEY = "langKey";
  private String langKey;

  public static final String JSON_PROPERTY_LAST_NOTIFICATION_READ = "lastNotificationRead";
  private OffsetDateTime lastNotificationRead;

  public static final String JSON_PROPERTY_AUTHORITIES = "authorities";
  private Set<String> authorities;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Set<String> groups;

  public static final String JSON_PROPERTY_GUIDED_TOUR_SETTINGS = "guidedTourSettings";
  private Set<GuidedTourSetting> guidedTourSettings;

  public static final String JSON_PROPERTY_ORGANIZATIONS = "organizations";
  private Set<Organization> organizations;

  public static final String JSON_PROPERTY_VCS_ACCESS_TOKEN = "vcsAccessToken";
  private String vcsAccessToken;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


  public UserDTO login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogin() {
    return login;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleRegistrationNumber() {
    return visibleRegistrationNumber;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActivated() {
    return activated;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLangKey() {
    return langKey;
  }


  @JsonProperty(JSON_PROPERTY_LANG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NOTIFICATION_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastNotificationRead() {
    return lastNotificationRead;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NOTIFICATION_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAuthorities() {
    return authorities;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getGroups() {
    return groups;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUIDED_TOUR_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<GuidedTourSetting> getGuidedTourSettings() {
    return guidedTourSettings;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_GUIDED_TOUR_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Organization> getOrganizations() {
    return organizations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VCS_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVcsAccessToken() {
    return vcsAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_VCS_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  /**
   * Return true if this UserDTO object is equal to o.
   */
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

}

