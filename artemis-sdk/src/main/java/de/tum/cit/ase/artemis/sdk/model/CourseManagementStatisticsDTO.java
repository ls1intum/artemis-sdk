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
import de.tum.cit.ase.artemis.sdk.model.CourseStatisticsAverageScore;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CourseManagementStatisticsDTO
 */
@JsonPropertyOrder({
  CourseManagementStatisticsDTO.JSON_PROPERTY_AVERAGE_SCORE_OF_COURSE,
  CourseManagementStatisticsDTO.JSON_PROPERTY_AVERAGE_SCORES_OF_EXERCISES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class CourseManagementStatisticsDTO {
  public static final String JSON_PROPERTY_AVERAGE_SCORE_OF_COURSE = "averageScoreOfCourse";
  private Double averageScoreOfCourse;

  public static final String JSON_PROPERTY_AVERAGE_SCORES_OF_EXERCISES = "averageScoresOfExercises";
  private List<CourseStatisticsAverageScore> averageScoresOfExercises;

  public CourseManagementStatisticsDTO() { 
  }

  public CourseManagementStatisticsDTO averageScoreOfCourse(Double averageScoreOfCourse) {
    this.averageScoreOfCourse = averageScoreOfCourse;
    return this;
  }

   /**
   * Get averageScoreOfCourse
   * @return averageScoreOfCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_OF_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageScoreOfCourse() {
    return averageScoreOfCourse;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_OF_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScoreOfCourse(Double averageScoreOfCourse) {
    this.averageScoreOfCourse = averageScoreOfCourse;
  }


  public CourseManagementStatisticsDTO averageScoresOfExercises(List<CourseStatisticsAverageScore> averageScoresOfExercises) {
    this.averageScoresOfExercises = averageScoresOfExercises;
    return this;
  }

  public CourseManagementStatisticsDTO addAverageScoresOfExercisesItem(CourseStatisticsAverageScore averageScoresOfExercisesItem) {
    if (this.averageScoresOfExercises == null) {
      this.averageScoresOfExercises = new ArrayList<>();
    }
    this.averageScoresOfExercises.add(averageScoresOfExercisesItem);
    return this;
  }

   /**
   * Get averageScoresOfExercises
   * @return averageScoresOfExercises
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORES_OF_EXERCISES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CourseStatisticsAverageScore> getAverageScoresOfExercises() {
    return averageScoresOfExercises;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORES_OF_EXERCISES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScoresOfExercises(List<CourseStatisticsAverageScore> averageScoresOfExercises) {
    this.averageScoresOfExercises = averageScoresOfExercises;
  }


  /**
   * Return true if this CourseManagementStatisticsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseManagementStatisticsDTO courseManagementStatisticsDTO = (CourseManagementStatisticsDTO) o;
    return Objects.equals(this.averageScoreOfCourse, courseManagementStatisticsDTO.averageScoreOfCourse) &&
        Objects.equals(this.averageScoresOfExercises, courseManagementStatisticsDTO.averageScoresOfExercises);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageScoreOfCourse, averageScoresOfExercises);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseManagementStatisticsDTO {\n");
    sb.append("    averageScoreOfCourse: ").append(toIndentedString(averageScoreOfCourse)).append("\n");
    sb.append("    averageScoresOfExercises: ").append(toIndentedString(averageScoresOfExercises)).append("\n");
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

