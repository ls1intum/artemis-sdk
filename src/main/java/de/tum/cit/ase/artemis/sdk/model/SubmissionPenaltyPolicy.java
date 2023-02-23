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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.SubmissionPolicy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SubmissionPenaltyPolicy
 */
@JsonPropertyOrder({
  SubmissionPenaltyPolicy.JSON_PROPERTY_PROGRAMMING_EXERCISE,
  SubmissionPenaltyPolicy.JSON_PROPERTY_EXCEEDING_PENALTY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class SubmissionPenaltyPolicy extends SubmissionPolicy {
  public static final String JSON_PROPERTY_PROGRAMMING_EXERCISE = "programmingExercise";
  private ProgrammingExercise programmingExercise;

  public static final String JSON_PROPERTY_EXCEEDING_PENALTY = "exceedingPenalty";
  private Double exceedingPenalty;

  public SubmissionPenaltyPolicy() { 
  }

  public SubmissionPenaltyPolicy programmingExercise(ProgrammingExercise programmingExercise) {
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


  public SubmissionPenaltyPolicy exceedingPenalty(Double exceedingPenalty) {
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
   * Return true if this SubmissionPenaltyPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionPenaltyPolicy submissionPenaltyPolicy = (SubmissionPenaltyPolicy) o;
    return Objects.equals(this.programmingExercise, submissionPenaltyPolicy.programmingExercise) &&
        Objects.equals(this.exceedingPenalty, submissionPenaltyPolicy.exceedingPenalty) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programmingExercise, exceedingPenalty, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionPenaltyPolicy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("SubmissionPenaltyPolicy", SubmissionPenaltyPolicy.class);
  JSON.registerDiscriminator(SubmissionPenaltyPolicy.class, "type", mappings);
}
}

