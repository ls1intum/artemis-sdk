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
 * ManagedUserVM
 */
@JsonPropertyOrder({
  ManagedUserVM.JSON_PROPERTY_CREATED_BY,
  ManagedUserVM.JSON_PROPERTY_CREATED_DATE,
  ManagedUserVM.JSON_PROPERTY_LAST_MODIFIED_BY,
  ManagedUserVM.JSON_PROPERTY_LAST_MODIFIED_DATE,
  ManagedUserVM.JSON_PROPERTY_ID,
  ManagedUserVM.JSON_PROPERTY_LOGIN,
  ManagedUserVM.JSON_PROPERTY_NAME,
  ManagedUserVM.JSON_PROPERTY_FIRST_NAME,
  ManagedUserVM.JSON_PROPERTY_LAST_NAME,
  ManagedUserVM.JSON_PROPERTY_EMAIL,
  ManagedUserVM.JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER,
  ManagedUserVM.JSON_PROPERTY_IMAGE_URL,
  ManagedUserVM.JSON_PROPERTY_ACTIVATED,
  ManagedUserVM.JSON_PROPERTY_LANG_KEY,
  ManagedUserVM.JSON_PROPERTY_LAST_NOTIFICATION_READ,
  ManagedUserVM.JSON_PROPERTY_AUTHORITIES,
  ManagedUserVM.JSON_PROPERTY_GROUPS,
  ManagedUserVM.JSON_PROPERTY_GUIDED_TOUR_SETTINGS,
  ManagedUserVM.JSON_PROPERTY_ORGANIZATIONS,
  ManagedUserVM.JSON_PROPERTY_VCS_ACCESS_TOKEN,
  ManagedUserVM.JSON_PROPERTY_PASSWORD,
  ManagedUserVM.JSON_PROPERTY_INTERNAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ManagedUserVM {
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
  private Set<String> authorities = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Set<String> groups = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_GUIDED_TOUR_SETTINGS = "guidedTourSettings";
  private Set<GuidedTourSetting> guidedTourSettings = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ORGANIZATIONS = "organizations";
  private Set<Organization> organizations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VCS_ACCESS_TOKEN = "vcsAccessToken";
  private String vcsAccessToken;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  private Boolean internal;

  public ManagedUserVM() { 
  }

  public ManagedUserVM createdBy(String createdBy) {
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


  public ManagedUserVM createdDate(OffsetDateTime createdDate) {
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


  public ManagedUserVM lastModifiedBy(String lastModifiedBy) {
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


  public ManagedUserVM lastModifiedDate(OffsetDateTime lastModifiedDate) {
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


  public ManagedUserVM id(Long id) {
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


  public ManagedUserVM login(String login) {
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


  public ManagedUserVM name(String name) {
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


  public ManagedUserVM firstName(String firstName) {
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


  public ManagedUserVM lastName(String lastName) {
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


  public ManagedUserVM email(String email) {
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


  public ManagedUserVM visibleRegistrationNumber(String visibleRegistrationNumber) {
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


  public ManagedUserVM imageUrl(String imageUrl) {
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


  public ManagedUserVM activated(Boolean activated) {
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


  public ManagedUserVM langKey(String langKey) {
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


  public ManagedUserVM lastNotificationRead(OffsetDateTime lastNotificationRead) {
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


  public ManagedUserVM authorities(Set<String> authorities) {
    this.authorities = authorities;
    return this;
  }

  public ManagedUserVM addAuthoritiesItem(String authoritiesItem) {
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


  public ManagedUserVM groups(Set<String> groups) {
    this.groups = groups;
    return this;
  }

  public ManagedUserVM addGroupsItem(String groupsItem) {
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


  public ManagedUserVM guidedTourSettings(Set<GuidedTourSetting> guidedTourSettings) {
    this.guidedTourSettings = guidedTourSettings;
    return this;
  }

  public ManagedUserVM addGuidedTourSettingsItem(GuidedTourSetting guidedTourSettingsItem) {
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


  public ManagedUserVM organizations(Set<Organization> organizations) {
    this.organizations = organizations;
    return this;
  }

  public ManagedUserVM addOrganizationsItem(Organization organizationsItem) {
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


  public ManagedUserVM vcsAccessToken(String vcsAccessToken) {
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


  public ManagedUserVM password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public ManagedUserVM internal(Boolean internal) {
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
   * Return true if this ManagedUserVM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedUserVM managedUserVM = (ManagedUserVM) o;
    return Objects.equals(this.createdBy, managedUserVM.createdBy) &&
        Objects.equals(this.createdDate, managedUserVM.createdDate) &&
        Objects.equals(this.lastModifiedBy, managedUserVM.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, managedUserVM.lastModifiedDate) &&
        Objects.equals(this.id, managedUserVM.id) &&
        Objects.equals(this.login, managedUserVM.login) &&
        Objects.equals(this.name, managedUserVM.name) &&
        Objects.equals(this.firstName, managedUserVM.firstName) &&
        Objects.equals(this.lastName, managedUserVM.lastName) &&
        Objects.equals(this.email, managedUserVM.email) &&
        Objects.equals(this.visibleRegistrationNumber, managedUserVM.visibleRegistrationNumber) &&
        Objects.equals(this.imageUrl, managedUserVM.imageUrl) &&
        Objects.equals(this.activated, managedUserVM.activated) &&
        Objects.equals(this.langKey, managedUserVM.langKey) &&
        Objects.equals(this.lastNotificationRead, managedUserVM.lastNotificationRead) &&
        Objects.equals(this.authorities, managedUserVM.authorities) &&
        Objects.equals(this.groups, managedUserVM.groups) &&
        Objects.equals(this.guidedTourSettings, managedUserVM.guidedTourSettings) &&
        Objects.equals(this.organizations, managedUserVM.organizations) &&
        Objects.equals(this.vcsAccessToken, managedUserVM.vcsAccessToken) &&
        Objects.equals(this.password, managedUserVM.password) &&
        Objects.equals(this.internal, managedUserVM.internal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, lastModifiedBy, lastModifiedDate, id, login, name, firstName, lastName, email, visibleRegistrationNumber, imageUrl, activated, langKey, lastNotificationRead, authorities, groups, guidedTourSettings, organizations, vcsAccessToken, password, internal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedUserVM {\n");
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
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

