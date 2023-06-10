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
import de.tum.cit.ase.artemis.sdk.model.GetExercise200Response;
import de.tum.cit.ase.artemis.sdk.model.GradingInstruction;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * GradingCriterion
 */
@JsonPropertyOrder({
  GradingCriterion.JSON_PROPERTY_ID,
  GradingCriterion.JSON_PROPERTY_STRUCTURED_GRADING_INSTRUCTIONS,
  GradingCriterion.JSON_PROPERTY_EXERCISE,
  GradingCriterion.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class GradingCriterion {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STRUCTURED_GRADING_INSTRUCTIONS = "structuredGradingInstructions";
  private List<GradingInstruction> structuredGradingInstructions;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private GetExercise200Response exercise;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public GradingCriterion() { 
  }

  public GradingCriterion id(Long id) {
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


  public GradingCriterion structuredGradingInstructions(List<GradingInstruction> structuredGradingInstructions) {
    this.structuredGradingInstructions = structuredGradingInstructions;
    return this;
  }

  public GradingCriterion addStructuredGradingInstructionsItem(GradingInstruction structuredGradingInstructionsItem) {
    if (this.structuredGradingInstructions == null) {
      this.structuredGradingInstructions = new ArrayList<>();
    }
    this.structuredGradingInstructions.add(structuredGradingInstructionsItem);
    return this;
  }

   /**
   * Get structuredGradingInstructions
   * @return structuredGradingInstructions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRUCTURED_GRADING_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GradingInstruction> getStructuredGradingInstructions() {
    return structuredGradingInstructions;
  }


  @JsonProperty(JSON_PROPERTY_STRUCTURED_GRADING_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructuredGradingInstructions(List<GradingInstruction> structuredGradingInstructions) {
    this.structuredGradingInstructions = structuredGradingInstructions;
  }


  public GradingCriterion exercise(GetExercise200Response exercise) {
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

  public GetExercise200Response getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(GetExercise200Response exercise) {
    this.exercise = exercise;
  }


  public GradingCriterion title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this GradingCriterion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradingCriterion gradingCriterion = (GradingCriterion) o;
    return Objects.equals(this.id, gradingCriterion.id) &&
        Objects.equals(this.structuredGradingInstructions, gradingCriterion.structuredGradingInstructions) &&
        Objects.equals(this.exercise, gradingCriterion.exercise) &&
        Objects.equals(this.title, gradingCriterion.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, structuredGradingInstructions, exercise, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradingCriterion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    structuredGradingInstructions: ").append(toIndentedString(structuredGradingInstructions)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

