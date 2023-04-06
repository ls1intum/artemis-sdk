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
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExerciseUnitAllOf
 */
@JsonPropertyOrder({
  ExerciseUnitAllOf.JSON_PROPERTY_EXERCISE
})
@JsonTypeName("ExerciseUnit_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ExerciseUnitAllOf {
  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private Exercise exercise;

  public ExerciseUnitAllOf() { 
  }

  public ExerciseUnitAllOf exercise(Exercise exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Exercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  /**
   * Return true if this ExerciseUnit_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseUnitAllOf exerciseUnitAllOf = (ExerciseUnitAllOf) o;
    return Objects.equals(this.exercise, exerciseUnitAllOf.exercise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exercise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseUnitAllOf {\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
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

