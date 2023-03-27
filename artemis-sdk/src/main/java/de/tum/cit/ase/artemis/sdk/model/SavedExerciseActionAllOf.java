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
 * SavedExerciseActionAllOf
 */
@JsonPropertyOrder({
  SavedExerciseActionAllOf.JSON_PROPERTY_FORCED,
  SavedExerciseActionAllOf.JSON_PROPERTY_FAILED,
  SavedExerciseActionAllOf.JSON_PROPERTY_AUTOMATICALLY,
  SavedExerciseActionAllOf.JSON_PROPERTY_SUBMISSION_ID,
  SavedExerciseActionAllOf.JSON_PROPERTY_EXERCISE_ID
})
@JsonTypeName("SavedExerciseAction_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class SavedExerciseActionAllOf {
  public static final String JSON_PROPERTY_FORCED = "forced";
  private Boolean forced;

  public static final String JSON_PROPERTY_FAILED = "failed";
  private Boolean failed;

  public static final String JSON_PROPERTY_AUTOMATICALLY = "automatically";
  private Boolean automatically;

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submissionId";
  private Long submissionId;

  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public SavedExerciseActionAllOf() { 
  }

  public SavedExerciseActionAllOf forced(Boolean forced) {
    this.forced = forced;
    return this;
  }

   /**
   * Get forced
   * @return forced
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForced() {
    return forced;
  }


  @JsonProperty(JSON_PROPERTY_FORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForced(Boolean forced) {
    this.forced = forced;
  }


  public SavedExerciseActionAllOf failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFailed() {
    return failed;
  }


  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }


  public SavedExerciseActionAllOf automatically(Boolean automatically) {
    this.automatically = automatically;
    return this;
  }

   /**
   * Get automatically
   * @return automatically
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATICALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutomatically() {
    return automatically;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATICALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomatically(Boolean automatically) {
    this.automatically = automatically;
  }


  public SavedExerciseActionAllOf submissionId(Long submissionId) {
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubmissionId() {
    return submissionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionId(Long submissionId) {
    this.submissionId = submissionId;
  }


  public SavedExerciseActionAllOf exerciseId(Long exerciseId) {
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
   * Return true if this SavedExerciseAction_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedExerciseActionAllOf savedExerciseActionAllOf = (SavedExerciseActionAllOf) o;
    return Objects.equals(this.forced, savedExerciseActionAllOf.forced) &&
        Objects.equals(this.failed, savedExerciseActionAllOf.failed) &&
        Objects.equals(this.automatically, savedExerciseActionAllOf.automatically) &&
        Objects.equals(this.submissionId, savedExerciseActionAllOf.submissionId) &&
        Objects.equals(this.exerciseId, savedExerciseActionAllOf.exerciseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forced, failed, automatically, submissionId, exerciseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedExerciseActionAllOf {\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    automatically: ").append(toIndentedString(automatically)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
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

