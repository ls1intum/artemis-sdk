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
 * TextExerciseAllOf
 */
@JsonPropertyOrder({
  TextExerciseAllOf.JSON_PROPERTY_EXAMPLE_SOLUTION,
  TextExerciseAllOf.JSON_PROPERTY_AUTOMATIC_ASSESSMENT_ENABLED
})
@JsonTypeName("TextExercise_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TextExerciseAllOf {
  public static final String JSON_PROPERTY_EXAMPLE_SOLUTION = "exampleSolution";
  private String exampleSolution;

  public static final String JSON_PROPERTY_AUTOMATIC_ASSESSMENT_ENABLED = "automaticAssessmentEnabled";
  private Boolean automaticAssessmentEnabled;

  public TextExerciseAllOf() { 
  }

  public TextExerciseAllOf exampleSolution(String exampleSolution) {
    this.exampleSolution = exampleSolution;
    return this;
  }

   /**
   * Get exampleSolution
   * @return exampleSolution
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExampleSolution() {
    return exampleSolution;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExampleSolution(String exampleSolution) {
    this.exampleSolution = exampleSolution;
  }


  public TextExerciseAllOf automaticAssessmentEnabled(Boolean automaticAssessmentEnabled) {
    this.automaticAssessmentEnabled = automaticAssessmentEnabled;
    return this;
  }

   /**
   * Get automaticAssessmentEnabled
   * @return automaticAssessmentEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATIC_ASSESSMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutomaticAssessmentEnabled() {
    return automaticAssessmentEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATIC_ASSESSMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomaticAssessmentEnabled(Boolean automaticAssessmentEnabled) {
    this.automaticAssessmentEnabled = automaticAssessmentEnabled;
  }


  /**
   * Return true if this TextExercise_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextExerciseAllOf textExerciseAllOf = (TextExerciseAllOf) o;
    return Objects.equals(this.exampleSolution, textExerciseAllOf.exampleSolution) &&
        Objects.equals(this.automaticAssessmentEnabled, textExerciseAllOf.automaticAssessmentEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleSolution, automaticAssessmentEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextExerciseAllOf {\n");
    sb.append("    exampleSolution: ").append(toIndentedString(exampleSolution)).append("\n");
    sb.append("    automaticAssessmentEnabled: ").append(toIndentedString(automaticAssessmentEnabled)).append("\n");
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
