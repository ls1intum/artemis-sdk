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
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SubmissionPenaltyPolicyAllOf
 */
@JsonPropertyOrder({
  SubmissionPenaltyPolicyAllOf.JSON_PROPERTY_PROGRAMMING_EXERCISE,
  SubmissionPenaltyPolicyAllOf.JSON_PROPERTY_EXCEEDING_PENALTY
})
@JsonTypeName("SubmissionPenaltyPolicy_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class SubmissionPenaltyPolicyAllOf {
  public static final String JSON_PROPERTY_PROGRAMMING_EXERCISE = "programmingExercise";
  private ProgrammingExercise programmingExercise;

  public static final String JSON_PROPERTY_EXCEEDING_PENALTY = "exceedingPenalty";
  private Double exceedingPenalty;

  public SubmissionPenaltyPolicyAllOf() { 
  }

  public SubmissionPenaltyPolicyAllOf programmingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
    return this;
  }

   /**
   * Get programmingExercise
   * @return programmingExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProgrammingExercise getProgrammingExercise() {
    return programmingExercise;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgrammingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
  }


  public SubmissionPenaltyPolicyAllOf exceedingPenalty(Double exceedingPenalty) {
    this.exceedingPenalty = exceedingPenalty;
    return this;
  }

   /**
   * Get exceedingPenalty
   * @return exceedingPenalty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEEDING_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getExceedingPenalty() {
    return exceedingPenalty;
  }


  @JsonProperty(JSON_PROPERTY_EXCEEDING_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceedingPenalty(Double exceedingPenalty) {
    this.exceedingPenalty = exceedingPenalty;
  }


  /**
   * Return true if this SubmissionPenaltyPolicy_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionPenaltyPolicyAllOf submissionPenaltyPolicyAllOf = (SubmissionPenaltyPolicyAllOf) o;
    return Objects.equals(this.programmingExercise, submissionPenaltyPolicyAllOf.programmingExercise) &&
        Objects.equals(this.exceedingPenalty, submissionPenaltyPolicyAllOf.exceedingPenalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programmingExercise, exceedingPenalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionPenaltyPolicyAllOf {\n");
    sb.append("    programmingExercise: ").append(toIndentedString(programmingExercise)).append("\n");
    sb.append("    exceedingPenalty: ").append(toIndentedString(exceedingPenalty)).append("\n");
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

