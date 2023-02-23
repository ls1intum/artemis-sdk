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
 * TutorEffort
 */
@JsonPropertyOrder({
  TutorEffort.JSON_PROPERTY_USER_ID,
  TutorEffort.JSON_PROPERTY_NUMBER_OF_SUBMISSIONS_ASSESSED,
  TutorEffort.JSON_PROPERTY_TOTAL_TIME_SPENT_MINUTES,
  TutorEffort.JSON_PROPERTY_EXERCISE_ID,
  TutorEffort.JSON_PROPERTY_COURSE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TutorEffort {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_NUMBER_OF_SUBMISSIONS_ASSESSED = "numberOfSubmissionsAssessed";
  private Integer numberOfSubmissionsAssessed;

  public static final String JSON_PROPERTY_TOTAL_TIME_SPENT_MINUTES = "totalTimeSpentMinutes";
  private Double totalTimeSpentMinutes;

  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_COURSE_ID = "courseId";
  private Long courseId;

  public TutorEffort() { 
  }

  public TutorEffort userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public TutorEffort numberOfSubmissionsAssessed(Integer numberOfSubmissionsAssessed) {
    this.numberOfSubmissionsAssessed = numberOfSubmissionsAssessed;
    return this;
  }

   /**
   * Get numberOfSubmissionsAssessed
   * @return numberOfSubmissionsAssessed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SUBMISSIONS_ASSESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfSubmissionsAssessed() {
    return numberOfSubmissionsAssessed;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SUBMISSIONS_ASSESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfSubmissionsAssessed(Integer numberOfSubmissionsAssessed) {
    this.numberOfSubmissionsAssessed = numberOfSubmissionsAssessed;
  }


  public TutorEffort totalTimeSpentMinutes(Double totalTimeSpentMinutes) {
    this.totalTimeSpentMinutes = totalTimeSpentMinutes;
    return this;
  }

   /**
   * Get totalTimeSpentMinutes
   * @return totalTimeSpentMinutes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME_SPENT_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalTimeSpentMinutes() {
    return totalTimeSpentMinutes;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TIME_SPENT_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalTimeSpentMinutes(Double totalTimeSpentMinutes) {
    this.totalTimeSpentMinutes = totalTimeSpentMinutes;
  }


  public TutorEffort exerciseId(Long exerciseId) {
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


  public TutorEffort courseId(Long courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Get courseId
   * @return courseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCourseId() {
    return courseId;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }


  /**
   * Return true if this TutorEffort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorEffort tutorEffort = (TutorEffort) o;
    return Objects.equals(this.userId, tutorEffort.userId) &&
        Objects.equals(this.numberOfSubmissionsAssessed, tutorEffort.numberOfSubmissionsAssessed) &&
        Objects.equals(this.totalTimeSpentMinutes, tutorEffort.totalTimeSpentMinutes) &&
        Objects.equals(this.exerciseId, tutorEffort.exerciseId) &&
        Objects.equals(this.courseId, tutorEffort.courseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, numberOfSubmissionsAssessed, totalTimeSpentMinutes, exerciseId, courseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorEffort {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    numberOfSubmissionsAssessed: ").append(toIndentedString(numberOfSubmissionsAssessed)).append("\n");
    sb.append("    totalTimeSpentMinutes: ").append(toIndentedString(totalTimeSpentMinutes)).append("\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
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

