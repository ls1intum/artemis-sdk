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
 * LtiLaunchRequestDTO
 */
@JsonPropertyOrder({
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_PERSON_SOURCEDID,
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_PERSON_NAME_GIVEN,
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_PERSON_NAME_FAMILY,
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_PERSON_NAME_FULL,
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_PERSON_CONTACT_EMAIL_PRIMARY,
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_OUTCOME_SERVICE_URL,
  LtiLaunchRequestDTO.JSON_PROPERTY_LTI_MESSAGE_TYPE,
  LtiLaunchRequestDTO.JSON_PROPERTY_LTI_VERSION,
  LtiLaunchRequestDTO.JSON_PROPERTY_EXT_USER_USERNAME,
  LtiLaunchRequestDTO.JSON_PROPERTY_CONTEXT_ID,
  LtiLaunchRequestDTO.JSON_PROPERTY_CONTEXT_LABEL,
  LtiLaunchRequestDTO.JSON_PROPERTY_OAUTH_VERSION,
  LtiLaunchRequestDTO.JSON_PROPERTY_OAUTH_SIGNATURE_METHOD,
  LtiLaunchRequestDTO.JSON_PROPERTY_OAUTH_TIMESTAMP,
  LtiLaunchRequestDTO.JSON_PROPERTY_ROLES,
  LtiLaunchRequestDTO.JSON_PROPERTY_LAUNCH_PRESENTATION_LOCALE,
  LtiLaunchRequestDTO.JSON_PROPERTY_CUSTOM_COMPONENT_DISPLAY_NAME,
  LtiLaunchRequestDTO.JSON_PROPERTY_LAUNCH_PRESENTATION_RETURN_URL,
  LtiLaunchRequestDTO.JSON_PROPERTY_LIS_RESULT_SOURCEDID,
  LtiLaunchRequestDTO.JSON_PROPERTY_RESOURCE_LINK_ID,
  LtiLaunchRequestDTO.JSON_PROPERTY_USER_ID,
  LtiLaunchRequestDTO.JSON_PROPERTY_OAUTH_NONCE,
  LtiLaunchRequestDTO.JSON_PROPERTY_OAUTH_CONSUMER_KEY,
  LtiLaunchRequestDTO.JSON_PROPERTY_OAUTH_SIGNATURE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class LtiLaunchRequestDTO {
  public static final String JSON_PROPERTY_LIS_PERSON_SOURCEDID = "lis_person_sourcedid";
  private String lisPersonSourcedid;

  public static final String JSON_PROPERTY_LIS_PERSON_NAME_GIVEN = "lis_person_name_given";
  private String lisPersonNameGiven;

  public static final String JSON_PROPERTY_LIS_PERSON_NAME_FAMILY = "lis_person_name_family";
  private String lisPersonNameFamily;

  public static final String JSON_PROPERTY_LIS_PERSON_NAME_FULL = "lis_person_name_full";
  private String lisPersonNameFull;

  public static final String JSON_PROPERTY_LIS_PERSON_CONTACT_EMAIL_PRIMARY = "lis_person_contact_email_primary";
  private String lisPersonContactEmailPrimary;

  public static final String JSON_PROPERTY_LIS_OUTCOME_SERVICE_URL = "lis_outcome_service_url";
  private String lisOutcomeServiceUrl;

  public static final String JSON_PROPERTY_LTI_MESSAGE_TYPE = "lti_message_type";
  private String ltiMessageType;

  public static final String JSON_PROPERTY_LTI_VERSION = "lti_version";
  private String ltiVersion;

  public static final String JSON_PROPERTY_EXT_USER_USERNAME = "ext_user_username";
  private String extUserUsername;

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private String contextId;

  public static final String JSON_PROPERTY_CONTEXT_LABEL = "context_label";
  private String contextLabel;

  public static final String JSON_PROPERTY_OAUTH_VERSION = "oauth_version";
  private String oauthVersion;

  public static final String JSON_PROPERTY_OAUTH_SIGNATURE_METHOD = "oauth_signature_method";
  private String oauthSignatureMethod;

  public static final String JSON_PROPERTY_OAUTH_TIMESTAMP = "oauth_timestamp";
  private Long oauthTimestamp;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private String roles;

  public static final String JSON_PROPERTY_LAUNCH_PRESENTATION_LOCALE = "launch_presentation_locale";
  private String launchPresentationLocale;

  public static final String JSON_PROPERTY_CUSTOM_COMPONENT_DISPLAY_NAME = "custom_component_display_name";
  private String customComponentDisplayName;

  public static final String JSON_PROPERTY_LAUNCH_PRESENTATION_RETURN_URL = "launch_presentation_return_url";
  private String launchPresentationReturnUrl;

  public static final String JSON_PROPERTY_LIS_RESULT_SOURCEDID = "lis_result_sourcedid";
  private String lisResultSourcedid;

  public static final String JSON_PROPERTY_RESOURCE_LINK_ID = "resource_link_id";
  private String resourceLinkId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_OAUTH_NONCE = "oauth_nonce";
  private String oauthNonce;

  public static final String JSON_PROPERTY_OAUTH_CONSUMER_KEY = "oauth_consumer_key";
  private String oauthConsumerKey;

  public static final String JSON_PROPERTY_OAUTH_SIGNATURE = "oauth_signature";
  private String oauthSignature;

  public LtiLaunchRequestDTO() { 
  }

  public LtiLaunchRequestDTO lisPersonSourcedid(String lisPersonSourcedid) {
    this.lisPersonSourcedid = lisPersonSourcedid;
    return this;
  }

   /**
   * Get lisPersonSourcedid
   * @return lisPersonSourcedid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_PERSON_SOURCEDID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisPersonSourcedid() {
    return lisPersonSourcedid;
  }


  @JsonProperty(JSON_PROPERTY_LIS_PERSON_SOURCEDID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisPersonSourcedid(String lisPersonSourcedid) {
    this.lisPersonSourcedid = lisPersonSourcedid;
  }


  public LtiLaunchRequestDTO lisPersonNameGiven(String lisPersonNameGiven) {
    this.lisPersonNameGiven = lisPersonNameGiven;
    return this;
  }

   /**
   * Get lisPersonNameGiven
   * @return lisPersonNameGiven
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_PERSON_NAME_GIVEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisPersonNameGiven() {
    return lisPersonNameGiven;
  }


  @JsonProperty(JSON_PROPERTY_LIS_PERSON_NAME_GIVEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisPersonNameGiven(String lisPersonNameGiven) {
    this.lisPersonNameGiven = lisPersonNameGiven;
  }


  public LtiLaunchRequestDTO lisPersonNameFamily(String lisPersonNameFamily) {
    this.lisPersonNameFamily = lisPersonNameFamily;
    return this;
  }

   /**
   * Get lisPersonNameFamily
   * @return lisPersonNameFamily
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_PERSON_NAME_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisPersonNameFamily() {
    return lisPersonNameFamily;
  }


  @JsonProperty(JSON_PROPERTY_LIS_PERSON_NAME_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisPersonNameFamily(String lisPersonNameFamily) {
    this.lisPersonNameFamily = lisPersonNameFamily;
  }


  public LtiLaunchRequestDTO lisPersonNameFull(String lisPersonNameFull) {
    this.lisPersonNameFull = lisPersonNameFull;
    return this;
  }

   /**
   * Get lisPersonNameFull
   * @return lisPersonNameFull
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_PERSON_NAME_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisPersonNameFull() {
    return lisPersonNameFull;
  }


  @JsonProperty(JSON_PROPERTY_LIS_PERSON_NAME_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisPersonNameFull(String lisPersonNameFull) {
    this.lisPersonNameFull = lisPersonNameFull;
  }


  public LtiLaunchRequestDTO lisPersonContactEmailPrimary(String lisPersonContactEmailPrimary) {
    this.lisPersonContactEmailPrimary = lisPersonContactEmailPrimary;
    return this;
  }

   /**
   * Get lisPersonContactEmailPrimary
   * @return lisPersonContactEmailPrimary
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_PERSON_CONTACT_EMAIL_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisPersonContactEmailPrimary() {
    return lisPersonContactEmailPrimary;
  }


  @JsonProperty(JSON_PROPERTY_LIS_PERSON_CONTACT_EMAIL_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisPersonContactEmailPrimary(String lisPersonContactEmailPrimary) {
    this.lisPersonContactEmailPrimary = lisPersonContactEmailPrimary;
  }


  public LtiLaunchRequestDTO lisOutcomeServiceUrl(String lisOutcomeServiceUrl) {
    this.lisOutcomeServiceUrl = lisOutcomeServiceUrl;
    return this;
  }

   /**
   * Get lisOutcomeServiceUrl
   * @return lisOutcomeServiceUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_OUTCOME_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisOutcomeServiceUrl() {
    return lisOutcomeServiceUrl;
  }


  @JsonProperty(JSON_PROPERTY_LIS_OUTCOME_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisOutcomeServiceUrl(String lisOutcomeServiceUrl) {
    this.lisOutcomeServiceUrl = lisOutcomeServiceUrl;
  }


  public LtiLaunchRequestDTO ltiMessageType(String ltiMessageType) {
    this.ltiMessageType = ltiMessageType;
    return this;
  }

   /**
   * Get ltiMessageType
   * @return ltiMessageType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LTI_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLtiMessageType() {
    return ltiMessageType;
  }


  @JsonProperty(JSON_PROPERTY_LTI_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLtiMessageType(String ltiMessageType) {
    this.ltiMessageType = ltiMessageType;
  }


  public LtiLaunchRequestDTO ltiVersion(String ltiVersion) {
    this.ltiVersion = ltiVersion;
    return this;
  }

   /**
   * Get ltiVersion
   * @return ltiVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LTI_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLtiVersion() {
    return ltiVersion;
  }


  @JsonProperty(JSON_PROPERTY_LTI_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLtiVersion(String ltiVersion) {
    this.ltiVersion = ltiVersion;
  }


  public LtiLaunchRequestDTO extUserUsername(String extUserUsername) {
    this.extUserUsername = extUserUsername;
    return this;
  }

   /**
   * Get extUserUsername
   * @return extUserUsername
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXT_USER_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtUserUsername() {
    return extUserUsername;
  }


  @JsonProperty(JSON_PROPERTY_EXT_USER_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtUserUsername(String extUserUsername) {
    this.extUserUsername = extUserUsername;
  }


  public LtiLaunchRequestDTO contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public LtiLaunchRequestDTO contextLabel(String contextLabel) {
    this.contextLabel = contextLabel;
    return this;
  }

   /**
   * Get contextLabel
   * @return contextLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextLabel() {
    return contextLabel;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextLabel(String contextLabel) {
    this.contextLabel = contextLabel;
  }


  public LtiLaunchRequestDTO oauthVersion(String oauthVersion) {
    this.oauthVersion = oauthVersion;
    return this;
  }

   /**
   * Get oauthVersion
   * @return oauthVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthVersion() {
    return oauthVersion;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthVersion(String oauthVersion) {
    this.oauthVersion = oauthVersion;
  }


  public LtiLaunchRequestDTO oauthSignatureMethod(String oauthSignatureMethod) {
    this.oauthSignatureMethod = oauthSignatureMethod;
    return this;
  }

   /**
   * Get oauthSignatureMethod
   * @return oauthSignatureMethod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_SIGNATURE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthSignatureMethod() {
    return oauthSignatureMethod;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_SIGNATURE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthSignatureMethod(String oauthSignatureMethod) {
    this.oauthSignatureMethod = oauthSignatureMethod;
  }


  public LtiLaunchRequestDTO oauthTimestamp(Long oauthTimestamp) {
    this.oauthTimestamp = oauthTimestamp;
    return this;
  }

   /**
   * Get oauthTimestamp
   * @return oauthTimestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOauthTimestamp() {
    return oauthTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthTimestamp(Long oauthTimestamp) {
    this.oauthTimestamp = oauthTimestamp;
  }


  public LtiLaunchRequestDTO roles(String roles) {
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(String roles) {
    this.roles = roles;
  }


  public LtiLaunchRequestDTO launchPresentationLocale(String launchPresentationLocale) {
    this.launchPresentationLocale = launchPresentationLocale;
    return this;
  }

   /**
   * Get launchPresentationLocale
   * @return launchPresentationLocale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAUNCH_PRESENTATION_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLaunchPresentationLocale() {
    return launchPresentationLocale;
  }


  @JsonProperty(JSON_PROPERTY_LAUNCH_PRESENTATION_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLaunchPresentationLocale(String launchPresentationLocale) {
    this.launchPresentationLocale = launchPresentationLocale;
  }


  public LtiLaunchRequestDTO customComponentDisplayName(String customComponentDisplayName) {
    this.customComponentDisplayName = customComponentDisplayName;
    return this;
  }

   /**
   * Get customComponentDisplayName
   * @return customComponentDisplayName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_COMPONENT_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomComponentDisplayName() {
    return customComponentDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_COMPONENT_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomComponentDisplayName(String customComponentDisplayName) {
    this.customComponentDisplayName = customComponentDisplayName;
  }


  public LtiLaunchRequestDTO launchPresentationReturnUrl(String launchPresentationReturnUrl) {
    this.launchPresentationReturnUrl = launchPresentationReturnUrl;
    return this;
  }

   /**
   * Get launchPresentationReturnUrl
   * @return launchPresentationReturnUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAUNCH_PRESENTATION_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLaunchPresentationReturnUrl() {
    return launchPresentationReturnUrl;
  }


  @JsonProperty(JSON_PROPERTY_LAUNCH_PRESENTATION_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLaunchPresentationReturnUrl(String launchPresentationReturnUrl) {
    this.launchPresentationReturnUrl = launchPresentationReturnUrl;
  }


  public LtiLaunchRequestDTO lisResultSourcedid(String lisResultSourcedid) {
    this.lisResultSourcedid = lisResultSourcedid;
    return this;
  }

   /**
   * Get lisResultSourcedid
   * @return lisResultSourcedid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIS_RESULT_SOURCEDID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLisResultSourcedid() {
    return lisResultSourcedid;
  }


  @JsonProperty(JSON_PROPERTY_LIS_RESULT_SOURCEDID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLisResultSourcedid(String lisResultSourcedid) {
    this.lisResultSourcedid = lisResultSourcedid;
  }


  public LtiLaunchRequestDTO resourceLinkId(String resourceLinkId) {
    this.resourceLinkId = resourceLinkId;
    return this;
  }

   /**
   * Get resourceLinkId
   * @return resourceLinkId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceLinkId() {
    return resourceLinkId;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceLinkId(String resourceLinkId) {
    this.resourceLinkId = resourceLinkId;
  }


  public LtiLaunchRequestDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public LtiLaunchRequestDTO oauthNonce(String oauthNonce) {
    this.oauthNonce = oauthNonce;
    return this;
  }

   /**
   * Get oauthNonce
   * @return oauthNonce
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthNonce() {
    return oauthNonce;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthNonce(String oauthNonce) {
    this.oauthNonce = oauthNonce;
  }


  public LtiLaunchRequestDTO oauthConsumerKey(String oauthConsumerKey) {
    this.oauthConsumerKey = oauthConsumerKey;
    return this;
  }

   /**
   * Get oauthConsumerKey
   * @return oauthConsumerKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthConsumerKey() {
    return oauthConsumerKey;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthConsumerKey(String oauthConsumerKey) {
    this.oauthConsumerKey = oauthConsumerKey;
  }


  public LtiLaunchRequestDTO oauthSignature(String oauthSignature) {
    this.oauthSignature = oauthSignature;
    return this;
  }

   /**
   * Get oauthSignature
   * @return oauthSignature
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthSignature() {
    return oauthSignature;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthSignature(String oauthSignature) {
    this.oauthSignature = oauthSignature;
  }


  /**
   * Return true if this LtiLaunchRequestDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtiLaunchRequestDTO ltiLaunchRequestDTO = (LtiLaunchRequestDTO) o;
    return Objects.equals(this.lisPersonSourcedid, ltiLaunchRequestDTO.lisPersonSourcedid) &&
        Objects.equals(this.lisPersonNameGiven, ltiLaunchRequestDTO.lisPersonNameGiven) &&
        Objects.equals(this.lisPersonNameFamily, ltiLaunchRequestDTO.lisPersonNameFamily) &&
        Objects.equals(this.lisPersonNameFull, ltiLaunchRequestDTO.lisPersonNameFull) &&
        Objects.equals(this.lisPersonContactEmailPrimary, ltiLaunchRequestDTO.lisPersonContactEmailPrimary) &&
        Objects.equals(this.lisOutcomeServiceUrl, ltiLaunchRequestDTO.lisOutcomeServiceUrl) &&
        Objects.equals(this.ltiMessageType, ltiLaunchRequestDTO.ltiMessageType) &&
        Objects.equals(this.ltiVersion, ltiLaunchRequestDTO.ltiVersion) &&
        Objects.equals(this.extUserUsername, ltiLaunchRequestDTO.extUserUsername) &&
        Objects.equals(this.contextId, ltiLaunchRequestDTO.contextId) &&
        Objects.equals(this.contextLabel, ltiLaunchRequestDTO.contextLabel) &&
        Objects.equals(this.oauthVersion, ltiLaunchRequestDTO.oauthVersion) &&
        Objects.equals(this.oauthSignatureMethod, ltiLaunchRequestDTO.oauthSignatureMethod) &&
        Objects.equals(this.oauthTimestamp, ltiLaunchRequestDTO.oauthTimestamp) &&
        Objects.equals(this.roles, ltiLaunchRequestDTO.roles) &&
        Objects.equals(this.launchPresentationLocale, ltiLaunchRequestDTO.launchPresentationLocale) &&
        Objects.equals(this.customComponentDisplayName, ltiLaunchRequestDTO.customComponentDisplayName) &&
        Objects.equals(this.launchPresentationReturnUrl, ltiLaunchRequestDTO.launchPresentationReturnUrl) &&
        Objects.equals(this.lisResultSourcedid, ltiLaunchRequestDTO.lisResultSourcedid) &&
        Objects.equals(this.resourceLinkId, ltiLaunchRequestDTO.resourceLinkId) &&
        Objects.equals(this.userId, ltiLaunchRequestDTO.userId) &&
        Objects.equals(this.oauthNonce, ltiLaunchRequestDTO.oauthNonce) &&
        Objects.equals(this.oauthConsumerKey, ltiLaunchRequestDTO.oauthConsumerKey) &&
        Objects.equals(this.oauthSignature, ltiLaunchRequestDTO.oauthSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lisPersonSourcedid, lisPersonNameGiven, lisPersonNameFamily, lisPersonNameFull, lisPersonContactEmailPrimary, lisOutcomeServiceUrl, ltiMessageType, ltiVersion, extUserUsername, contextId, contextLabel, oauthVersion, oauthSignatureMethod, oauthTimestamp, roles, launchPresentationLocale, customComponentDisplayName, launchPresentationReturnUrl, lisResultSourcedid, resourceLinkId, userId, oauthNonce, oauthConsumerKey, oauthSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtiLaunchRequestDTO {\n");
    sb.append("    lisPersonSourcedid: ").append(toIndentedString(lisPersonSourcedid)).append("\n");
    sb.append("    lisPersonNameGiven: ").append(toIndentedString(lisPersonNameGiven)).append("\n");
    sb.append("    lisPersonNameFamily: ").append(toIndentedString(lisPersonNameFamily)).append("\n");
    sb.append("    lisPersonNameFull: ").append(toIndentedString(lisPersonNameFull)).append("\n");
    sb.append("    lisPersonContactEmailPrimary: ").append(toIndentedString(lisPersonContactEmailPrimary)).append("\n");
    sb.append("    lisOutcomeServiceUrl: ").append(toIndentedString(lisOutcomeServiceUrl)).append("\n");
    sb.append("    ltiMessageType: ").append(toIndentedString(ltiMessageType)).append("\n");
    sb.append("    ltiVersion: ").append(toIndentedString(ltiVersion)).append("\n");
    sb.append("    extUserUsername: ").append(toIndentedString(extUserUsername)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextLabel: ").append(toIndentedString(contextLabel)).append("\n");
    sb.append("    oauthVersion: ").append(toIndentedString(oauthVersion)).append("\n");
    sb.append("    oauthSignatureMethod: ").append(toIndentedString(oauthSignatureMethod)).append("\n");
    sb.append("    oauthTimestamp: ").append(toIndentedString(oauthTimestamp)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    launchPresentationLocale: ").append(toIndentedString(launchPresentationLocale)).append("\n");
    sb.append("    customComponentDisplayName: ").append(toIndentedString(customComponentDisplayName)).append("\n");
    sb.append("    launchPresentationReturnUrl: ").append(toIndentedString(launchPresentationReturnUrl)).append("\n");
    sb.append("    lisResultSourcedid: ").append(toIndentedString(lisResultSourcedid)).append("\n");
    sb.append("    resourceLinkId: ").append(toIndentedString(resourceLinkId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    oauthNonce: ").append(toIndentedString(oauthNonce)).append("\n");
    sb.append("    oauthConsumerKey: ").append(toIndentedString(oauthConsumerKey)).append("\n");
    sb.append("    oauthSignature: ").append(toIndentedString(oauthSignature)).append("\n");
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

