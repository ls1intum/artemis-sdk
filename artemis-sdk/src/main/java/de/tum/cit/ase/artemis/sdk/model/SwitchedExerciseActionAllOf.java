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
 * SwitchedExerciseActionAllOf
 */
@JsonPropertyOrder({
  SwitchedExerciseActionAllOf.JSON_PROPERTY_EXERCISE_ID
})
@JsonTypeName("SwitchedExerciseAction_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class SwitchedExerciseActionAllOf {
  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public SwitchedExerciseActionAllOf() { 
  }

  public SwitchedExerciseActionAllOf exerciseId(Long exerciseId) {
    this.exerciseId = exerciseId;
    return this;
  }

   /**
   * Get exerciseId
   * @return exerciseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExerciseId() {
    return exerciseId;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseId(Long exerciseId) {
    this.exerciseId = exerciseId;
  }


  /**
   * Return true if this SwitchedExerciseAction_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchedExerciseActionAllOf switchedExerciseActionAllOf = (SwitchedExerciseActionAllOf) o;
    return Objects.equals(this.exerciseId, switchedExerciseActionAllOf.exerciseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchedExerciseActionAllOf {\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
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

