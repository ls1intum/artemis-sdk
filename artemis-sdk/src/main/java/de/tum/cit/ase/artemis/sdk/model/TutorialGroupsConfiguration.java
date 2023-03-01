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
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupFreePeriod;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TutorialGroupsConfiguration
 */
@JsonPropertyOrder({
  TutorialGroupsConfiguration.JSON_PROPERTY_ID,
  TutorialGroupsConfiguration.JSON_PROPERTY_TUTORIAL_PERIOD_START_INCLUSIVE,
  TutorialGroupsConfiguration.JSON_PROPERTY_TUTORIAL_PERIOD_END_INCLUSIVE,
  TutorialGroupsConfiguration.JSON_PROPERTY_TUTORIAL_GROUP_FREE_PERIODS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TutorialGroupsConfiguration {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TUTORIAL_PERIOD_START_INCLUSIVE = "tutorialPeriodStartInclusive";
  private String tutorialPeriodStartInclusive;

  public static final String JSON_PROPERTY_TUTORIAL_PERIOD_END_INCLUSIVE = "tutorialPeriodEndInclusive";
  private String tutorialPeriodEndInclusive;

  public static final String JSON_PROPERTY_TUTORIAL_GROUP_FREE_PERIODS = "tutorialGroupFreePeriods";
  private Set<TutorialGroupFreePeriod> tutorialGroupFreePeriods = new LinkedHashSet<>();

  public TutorialGroupsConfiguration() { 
  }

  public TutorialGroupsConfiguration id(Long id) {
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


  public TutorialGroupsConfiguration tutorialPeriodStartInclusive(String tutorialPeriodStartInclusive) {
    this.tutorialPeriodStartInclusive = tutorialPeriodStartInclusive;
    return this;
  }

   /**
   * Get tutorialPeriodStartInclusive
   * @return tutorialPeriodStartInclusive
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TUTORIAL_PERIOD_START_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTutorialPeriodStartInclusive() {
    return tutorialPeriodStartInclusive;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_PERIOD_START_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTutorialPeriodStartInclusive(String tutorialPeriodStartInclusive) {
    this.tutorialPeriodStartInclusive = tutorialPeriodStartInclusive;
  }


  public TutorialGroupsConfiguration tutorialPeriodEndInclusive(String tutorialPeriodEndInclusive) {
    this.tutorialPeriodEndInclusive = tutorialPeriodEndInclusive;
    return this;
  }

   /**
   * Get tutorialPeriodEndInclusive
   * @return tutorialPeriodEndInclusive
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TUTORIAL_PERIOD_END_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTutorialPeriodEndInclusive() {
    return tutorialPeriodEndInclusive;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_PERIOD_END_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTutorialPeriodEndInclusive(String tutorialPeriodEndInclusive) {
    this.tutorialPeriodEndInclusive = tutorialPeriodEndInclusive;
  }


  public TutorialGroupsConfiguration tutorialGroupFreePeriods(Set<TutorialGroupFreePeriod> tutorialGroupFreePeriods) {
    this.tutorialGroupFreePeriods = tutorialGroupFreePeriods;
    return this;
  }

  public TutorialGroupsConfiguration addTutorialGroupFreePeriodsItem(TutorialGroupFreePeriod tutorialGroupFreePeriodsItem) {
    if (this.tutorialGroupFreePeriods == null) {
      this.tutorialGroupFreePeriods = new LinkedHashSet<>();
    }
    this.tutorialGroupFreePeriods.add(tutorialGroupFreePeriodsItem);
    return this;
  }

   /**
   * Get tutorialGroupFreePeriods
   * @return tutorialGroupFreePeriods
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_FREE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TutorialGroupFreePeriod> getTutorialGroupFreePeriods() {
    return tutorialGroupFreePeriods;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_FREE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorialGroupFreePeriods(Set<TutorialGroupFreePeriod> tutorialGroupFreePeriods) {
    this.tutorialGroupFreePeriods = tutorialGroupFreePeriods;
  }


  /**
   * Return true if this TutorialGroupsConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupsConfiguration tutorialGroupsConfiguration = (TutorialGroupsConfiguration) o;
    return Objects.equals(this.id, tutorialGroupsConfiguration.id) &&
        Objects.equals(this.tutorialPeriodStartInclusive, tutorialGroupsConfiguration.tutorialPeriodStartInclusive) &&
        Objects.equals(this.tutorialPeriodEndInclusive, tutorialGroupsConfiguration.tutorialPeriodEndInclusive) &&
        Objects.equals(this.tutorialGroupFreePeriods, tutorialGroupsConfiguration.tutorialGroupFreePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tutorialPeriodStartInclusive, tutorialPeriodEndInclusive, tutorialGroupFreePeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupsConfiguration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tutorialPeriodStartInclusive: ").append(toIndentedString(tutorialPeriodStartInclusive)).append("\n");
    sb.append("    tutorialPeriodEndInclusive: ").append(toIndentedString(tutorialPeriodEndInclusive)).append("\n");
    sb.append("    tutorialGroupFreePeriods: ").append(toIndentedString(tutorialGroupFreePeriods)).append("\n");
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
