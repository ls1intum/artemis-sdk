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
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupsConfiguration;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TutorialGroupFreePeriod
 */
@JsonPropertyOrder({
  TutorialGroupFreePeriod.JSON_PROPERTY_ID,
  TutorialGroupFreePeriod.JSON_PROPERTY_TUTORIAL_GROUPS_CONFIGURATION,
  TutorialGroupFreePeriod.JSON_PROPERTY_START,
  TutorialGroupFreePeriod.JSON_PROPERTY_END,
  TutorialGroupFreePeriod.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class TutorialGroupFreePeriod {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TUTORIAL_GROUPS_CONFIGURATION = "tutorialGroupsConfiguration";
  private TutorialGroupsConfiguration tutorialGroupsConfiguration;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public TutorialGroupFreePeriod() { 
  }

  public TutorialGroupFreePeriod id(Long id) {
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


  public TutorialGroupFreePeriod tutorialGroupsConfiguration(TutorialGroupsConfiguration tutorialGroupsConfiguration) {
    this.tutorialGroupsConfiguration = tutorialGroupsConfiguration;
    return this;
  }

   /**
   * Get tutorialGroupsConfiguration
   * @return tutorialGroupsConfiguration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUPS_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TutorialGroupsConfiguration getTutorialGroupsConfiguration() {
    return tutorialGroupsConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUPS_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorialGroupsConfiguration(TutorialGroupsConfiguration tutorialGroupsConfiguration) {
    this.tutorialGroupsConfiguration = tutorialGroupsConfiguration;
  }


  public TutorialGroupFreePeriod start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public TutorialGroupFreePeriod end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public TutorialGroupFreePeriod reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  /**
   * Return true if this TutorialGroupFreePeriod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupFreePeriod tutorialGroupFreePeriod = (TutorialGroupFreePeriod) o;
    return Objects.equals(this.id, tutorialGroupFreePeriod.id) &&
        Objects.equals(this.tutorialGroupsConfiguration, tutorialGroupFreePeriod.tutorialGroupsConfiguration) &&
        Objects.equals(this.start, tutorialGroupFreePeriod.start) &&
        Objects.equals(this.end, tutorialGroupFreePeriod.end) &&
        Objects.equals(this.reason, tutorialGroupFreePeriod.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tutorialGroupsConfiguration, start, end, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupFreePeriod {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tutorialGroupsConfiguration: ").append(toIndentedString(tutorialGroupsConfiguration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

