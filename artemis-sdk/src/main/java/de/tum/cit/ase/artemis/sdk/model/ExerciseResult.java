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
 * ExerciseResult
 */
@JsonPropertyOrder({
  ExerciseResult.JSON_PROPERTY_EXERCISE_ID,
  ExerciseResult.JSON_PROPERTY_TITLE,
  ExerciseResult.JSON_PROPERTY_MAX_SCORE,
  ExerciseResult.JSON_PROPERTY_ACHIEVED_SCORE,
  ExerciseResult.JSON_PROPERTY_ACHIEVED_POINTS,
  ExerciseResult.JSON_PROPERTY_HAS_NON_EMPTY_SUBMISSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ExerciseResult {
  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_MAX_SCORE = "maxScore";
  private Double maxScore;

  public static final String JSON_PROPERTY_ACHIEVED_SCORE = "achievedScore";
  private Double achievedScore;

  public static final String JSON_PROPERTY_ACHIEVED_POINTS = "achievedPoints";
  private Double achievedPoints;

  public static final String JSON_PROPERTY_HAS_NON_EMPTY_SUBMISSION = "hasNonEmptySubmission";
  private Boolean hasNonEmptySubmission;

  public ExerciseResult() { 
  }

  public ExerciseResult exerciseId(Long exerciseId) {
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


  public ExerciseResult title(String title) {
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


  public ExerciseResult maxScore(Double maxScore) {
    this.maxScore = maxScore;
    return this;
  }

   /**
   * Get maxScore
   * @return maxScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxScore() {
    return maxScore;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxScore(Double maxScore) {
    this.maxScore = maxScore;
  }


  public ExerciseResult achievedScore(Double achievedScore) {
    this.achievedScore = achievedScore;
    return this;
  }

   /**
   * Get achievedScore
   * @return achievedScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACHIEVED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAchievedScore() {
    return achievedScore;
  }


  @JsonProperty(JSON_PROPERTY_ACHIEVED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAchievedScore(Double achievedScore) {
    this.achievedScore = achievedScore;
  }


  public ExerciseResult achievedPoints(Double achievedPoints) {
    this.achievedPoints = achievedPoints;
    return this;
  }

   /**
   * Get achievedPoints
   * @return achievedPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACHIEVED_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAchievedPoints() {
    return achievedPoints;
  }


  @JsonProperty(JSON_PROPERTY_ACHIEVED_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAchievedPoints(Double achievedPoints) {
    this.achievedPoints = achievedPoints;
  }


  public ExerciseResult hasNonEmptySubmission(Boolean hasNonEmptySubmission) {
    this.hasNonEmptySubmission = hasNonEmptySubmission;
    return this;
  }

   /**
   * Get hasNonEmptySubmission
   * @return hasNonEmptySubmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_NON_EMPTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNonEmptySubmission() {
    return hasNonEmptySubmission;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NON_EMPTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNonEmptySubmission(Boolean hasNonEmptySubmission) {
    this.hasNonEmptySubmission = hasNonEmptySubmission;
  }


  /**
   * Return true if this ExerciseResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseResult exerciseResult = (ExerciseResult) o;
    return Objects.equals(this.exerciseId, exerciseResult.exerciseId) &&
        Objects.equals(this.title, exerciseResult.title) &&
        Objects.equals(this.maxScore, exerciseResult.maxScore) &&
        Objects.equals(this.achievedScore, exerciseResult.achievedScore) &&
        Objects.equals(this.achievedPoints, exerciseResult.achievedPoints) &&
        Objects.equals(this.hasNonEmptySubmission, exerciseResult.hasNonEmptySubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseId, title, maxScore, achievedScore, achievedPoints, hasNonEmptySubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseResult {\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
    sb.append("    achievedScore: ").append(toIndentedString(achievedScore)).append("\n");
    sb.append("    achievedPoints: ").append(toIndentedString(achievedPoints)).append("\n");
    sb.append("    hasNonEmptySubmission: ").append(toIndentedString(hasNonEmptySubmission)).append("\n");
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

