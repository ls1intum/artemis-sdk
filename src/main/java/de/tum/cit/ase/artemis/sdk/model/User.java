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
import de.tum.cit.ase.artemis.sdk.model.Authority;
import de.tum.cit.ase.artemis.sdk.model.GuidedTourSetting;
import de.tum.cit.ase.artemis.sdk.model.Organization;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupRegistration;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_LOGIN,
  User.JSON_PROPERTY_FIRST_NAME,
  User.JSON_PROPERTY_LAST_NAME,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_ACTIVATED,
  User.JSON_PROPERTY_LANG_KEY,
  User.JSON_PROPERTY_IMAGE_URL,
  User.JSON_PROPERTY_RESET_DATE,
  User.JSON_PROPERTY_LAST_NOTIFICATION_READ,
  User.JSON_PROPERTY_HIDE_NOTIFICATIONS_UNTIL,
  User.JSON_PROPERTY_VCS_ACCESS_TOKEN,
  User.JSON_PROPERTY_GROUPS,
  User.JSON_PROPERTY_GUIDED_TOUR_SETTINGS,
  User.JSON_PROPERTY_AUTHORITIES,
  User.JSON_PROPERTY_ORGANIZATIONS,
  User.JSON_PROPERTY_TUTORIAL_GROUP_REGISTRATIONS,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_INTERNAL,
  User.JSON_PROPERTY_PARTICIPANT_IDENTIFIER,
  User.JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class User {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ACTIVATED = "activated";
  private Boolean activated;

  public static final String JSON_PROPERTY_LANG_KEY = "langKey";
  private String langKey;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public static final String JSON_PROPERTY_RESET_DATE = "resetDate";
  private OffsetDateTime resetDate;

  public static final String JSON_PROPERTY_LAST_NOTIFICATION_READ = "lastNotificationRead";
  private OffsetDateTime lastNotificationRead;

  public static final String JSON_PROPERTY_HIDE_NOTIFICATIONS_UNTIL = "hideNotificationsUntil";
  private OffsetDateTime hideNotificationsUntil;

  public static final String JSON_PROPERTY_VCS_ACCESS_TOKEN = "vcsAccessToken";
  private String vcsAccessToken;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Set<String> groups = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_GUIDED_TOUR_SETTINGS = "guidedTourSettings";
  private Set<GuidedTourSetting> guidedTourSettings = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AUTHORITIES = "authorities";
  private Set<Authority> authorities = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ORGANIZATIONS = "organizations";
  private Set<Organization> organizations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TUTORIAL_GROUP_REGISTRATIONS = "tutorialGroupRegistrations";
  private Set<TutorialGroupRegistration> tutorialGroupRegistrations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  private Boolean internal;

  public static final String JSON_PROPERTY_PARTICIPANT_IDENTIFIER = "participantIdentifier";
  private String participantIdentifier;

  public static final String JSON_PROPERTY_VISIBLE_REGISTRATION_NUMBER = "visibleRegistrationNumber";
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


  public User login(String login) {
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


  public User firstName(String firstName) {
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


  public User lastName(String lastName) {
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


  public User email(String email) {
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


  public User activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActivated() {
    return activated;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


  public User imageUrl(String imageUrl) {
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


  public User resetDate(OffsetDateTime resetDate) {
    this.resetDate = resetDate;
    return this;
  }

   /**
   * Get resetDate
   * @return resetDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESET_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getResetDate() {
    return resetDate;
  }


  @JsonProperty(JSON_PROPERTY_RESET_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


  public User hideNotificationsUntil(OffsetDateTime hideNotificationsUntil) {
    this.hideNotificationsUntil = hideNotificationsUntil;
    return this;
  }

   /**
   * Get hideNotificationsUntil
   * @return hideNotificationsUntil
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_NOTIFICATIONS_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHideNotificationsUntil() {
    return hideNotificationsUntil;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_NOTIFICATIONS_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Authority> getAuthorities() {
    return authorities;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_REGISTRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TutorialGroupRegistration> getTutorialGroupRegistrations() {
    return tutorialGroupRegistrations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_REGISTRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


  public User internal(Boolean internal) {
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


  public User participantIdentifier(String participantIdentifier) {
    this.participantIdentifier = participantIdentifier;
    return this;
  }

   /**
   * Get participantIdentifier
   * @return participantIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParticipantIdentifier() {
    return participantIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


  /**
   * Return true if this User object is equal to o.
   */
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

}
