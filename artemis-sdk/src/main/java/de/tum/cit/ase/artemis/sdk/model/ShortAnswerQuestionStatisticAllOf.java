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
import de.tum.cit.ase.artemis.sdk.model.ShortAnswerSpotCounter;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ShortAnswerQuestionStatisticAllOf
 */
@JsonPropertyOrder({
  ShortAnswerQuestionStatisticAllOf.JSON_PROPERTY_SHORT_ANSWER_SPOT_COUNTERS
})
@JsonTypeName("ShortAnswerQuestionStatistic_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ShortAnswerQuestionStatisticAllOf {
  public static final String JSON_PROPERTY_SHORT_ANSWER_SPOT_COUNTERS = "shortAnswerSpotCounters";
  private Set<ShortAnswerSpotCounter> shortAnswerSpotCounters;

  public ShortAnswerQuestionStatisticAllOf() { 
  }

  public ShortAnswerQuestionStatisticAllOf shortAnswerSpotCounters(Set<ShortAnswerSpotCounter> shortAnswerSpotCounters) {
    this.shortAnswerSpotCounters = shortAnswerSpotCounters;
    return this;
  }

  public ShortAnswerQuestionStatisticAllOf addShortAnswerSpotCountersItem(ShortAnswerSpotCounter shortAnswerSpotCountersItem) {
    if (this.shortAnswerSpotCounters == null) {
      this.shortAnswerSpotCounters = new LinkedHashSet<>();
    }
    this.shortAnswerSpotCounters.add(shortAnswerSpotCountersItem);
    return this;
  }

   /**
   * Get shortAnswerSpotCounters
   * @return shortAnswerSpotCounters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_ANSWER_SPOT_COUNTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ShortAnswerSpotCounter> getShortAnswerSpotCounters() {
    return shortAnswerSpotCounters;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SHORT_ANSWER_SPOT_COUNTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortAnswerSpotCounters(Set<ShortAnswerSpotCounter> shortAnswerSpotCounters) {
    this.shortAnswerSpotCounters = shortAnswerSpotCounters;
  }


  /**
   * Return true if this ShortAnswerQuestionStatistic_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortAnswerQuestionStatisticAllOf shortAnswerQuestionStatisticAllOf = (ShortAnswerQuestionStatisticAllOf) o;
    return Objects.equals(this.shortAnswerSpotCounters, shortAnswerQuestionStatisticAllOf.shortAnswerSpotCounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortAnswerSpotCounters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortAnswerQuestionStatisticAllOf {\n");
    sb.append("    shortAnswerSpotCounters: ").append(toIndentedString(shortAnswerSpotCounters)).append("\n");
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
