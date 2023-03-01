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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExerciseManagementStatisticsDTO
 */
@JsonPropertyOrder({
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_AVERAGE_SCORE_OF_EXERCISE,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_MAX_POINTS_OF_EXERCISE,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_SCORE_DISTRIBUTION,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_NUMBER_OF_EXERCISE_SCORES,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_NUMBER_OF_PARTICIPATIONS,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_NUMBER_OF_STUDENTS_OR_TEAMS_IN_COURSE,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_NUMBER_OF_POSTS,
  ExerciseManagementStatisticsDTO.JSON_PROPERTY_NUMBER_OF_RESOLVED_POSTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class ExerciseManagementStatisticsDTO {
  public static final String JSON_PROPERTY_AVERAGE_SCORE_OF_EXERCISE = "averageScoreOfExercise";
  private Double averageScoreOfExercise;

  public static final String JSON_PROPERTY_MAX_POINTS_OF_EXERCISE = "maxPointsOfExercise";
  private Double maxPointsOfExercise;

  public static final String JSON_PROPERTY_SCORE_DISTRIBUTION = "scoreDistribution";
  private List<Integer> scoreDistribution = new ArrayList<>();

  public static final String JSON_PROPERTY_NUMBER_OF_EXERCISE_SCORES = "numberOfExerciseScores";
  private Integer numberOfExerciseScores;

  public static final String JSON_PROPERTY_NUMBER_OF_PARTICIPATIONS = "numberOfParticipations";
  private Long numberOfParticipations;

  public static final String JSON_PROPERTY_NUMBER_OF_STUDENTS_OR_TEAMS_IN_COURSE = "numberOfStudentsOrTeamsInCourse";
  private Long numberOfStudentsOrTeamsInCourse;

  public static final String JSON_PROPERTY_NUMBER_OF_POSTS = "numberOfPosts";
  private Long numberOfPosts;

  public static final String JSON_PROPERTY_NUMBER_OF_RESOLVED_POSTS = "numberOfResolvedPosts";
  private Long numberOfResolvedPosts;

  public ExerciseManagementStatisticsDTO() { 
  }

  public ExerciseManagementStatisticsDTO averageScoreOfExercise(Double averageScoreOfExercise) {
    this.averageScoreOfExercise = averageScoreOfExercise;
    return this;
  }

   /**
   * Get averageScoreOfExercise
   * @return averageScoreOfExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_OF_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageScoreOfExercise() {
    return averageScoreOfExercise;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_OF_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScoreOfExercise(Double averageScoreOfExercise) {
    this.averageScoreOfExercise = averageScoreOfExercise;
  }


  public ExerciseManagementStatisticsDTO maxPointsOfExercise(Double maxPointsOfExercise) {
    this.maxPointsOfExercise = maxPointsOfExercise;
    return this;
  }

   /**
   * Get maxPointsOfExercise
   * @return maxPointsOfExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_POINTS_OF_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxPointsOfExercise() {
    return maxPointsOfExercise;
  }


  @JsonProperty(JSON_PROPERTY_MAX_POINTS_OF_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPointsOfExercise(Double maxPointsOfExercise) {
    this.maxPointsOfExercise = maxPointsOfExercise;
  }


  public ExerciseManagementStatisticsDTO scoreDistribution(List<Integer> scoreDistribution) {
    this.scoreDistribution = scoreDistribution;
    return this;
  }

  public ExerciseManagementStatisticsDTO addScoreDistributionItem(Integer scoreDistributionItem) {
    if (this.scoreDistribution == null) {
      this.scoreDistribution = new ArrayList<>();
    }
    this.scoreDistribution.add(scoreDistributionItem);
    return this;
  }

   /**
   * Get scoreDistribution
   * @return scoreDistribution
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getScoreDistribution() {
    return scoreDistribution;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreDistribution(List<Integer> scoreDistribution) {
    this.scoreDistribution = scoreDistribution;
  }


  public ExerciseManagementStatisticsDTO numberOfExerciseScores(Integer numberOfExerciseScores) {
    this.numberOfExerciseScores = numberOfExerciseScores;
    return this;
  }

   /**
   * Get numberOfExerciseScores
   * @return numberOfExerciseScores
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXERCISE_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfExerciseScores() {
    return numberOfExerciseScores;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXERCISE_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfExerciseScores(Integer numberOfExerciseScores) {
    this.numberOfExerciseScores = numberOfExerciseScores;
  }


  public ExerciseManagementStatisticsDTO numberOfParticipations(Long numberOfParticipations) {
    this.numberOfParticipations = numberOfParticipations;
    return this;
  }

   /**
   * Get numberOfParticipations
   * @return numberOfParticipations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PARTICIPATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfParticipations() {
    return numberOfParticipations;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PARTICIPATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfParticipations(Long numberOfParticipations) {
    this.numberOfParticipations = numberOfParticipations;
  }


  public ExerciseManagementStatisticsDTO numberOfStudentsOrTeamsInCourse(Long numberOfStudentsOrTeamsInCourse) {
    this.numberOfStudentsOrTeamsInCourse = numberOfStudentsOrTeamsInCourse;
    return this;
  }

   /**
   * Get numberOfStudentsOrTeamsInCourse
   * @return numberOfStudentsOrTeamsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS_OR_TEAMS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfStudentsOrTeamsInCourse() {
    return numberOfStudentsOrTeamsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS_OR_TEAMS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfStudentsOrTeamsInCourse(Long numberOfStudentsOrTeamsInCourse) {
    this.numberOfStudentsOrTeamsInCourse = numberOfStudentsOrTeamsInCourse;
  }


  public ExerciseManagementStatisticsDTO numberOfPosts(Long numberOfPosts) {
    this.numberOfPosts = numberOfPosts;
    return this;
  }

   /**
   * Get numberOfPosts
   * @return numberOfPosts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_POSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfPosts() {
    return numberOfPosts;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_POSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfPosts(Long numberOfPosts) {
    this.numberOfPosts = numberOfPosts;
  }


  public ExerciseManagementStatisticsDTO numberOfResolvedPosts(Long numberOfResolvedPosts) {
    this.numberOfResolvedPosts = numberOfResolvedPosts;
    return this;
  }

   /**
   * Get numberOfResolvedPosts
   * @return numberOfResolvedPosts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_RESOLVED_POSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfResolvedPosts() {
    return numberOfResolvedPosts;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_RESOLVED_POSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfResolvedPosts(Long numberOfResolvedPosts) {
    this.numberOfResolvedPosts = numberOfResolvedPosts;
  }


  /**
   * Return true if this ExerciseManagementStatisticsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseManagementStatisticsDTO exerciseManagementStatisticsDTO = (ExerciseManagementStatisticsDTO) o;
    return Objects.equals(this.averageScoreOfExercise, exerciseManagementStatisticsDTO.averageScoreOfExercise) &&
        Objects.equals(this.maxPointsOfExercise, exerciseManagementStatisticsDTO.maxPointsOfExercise) &&
        Objects.equals(this.scoreDistribution, exerciseManagementStatisticsDTO.scoreDistribution) &&
        Objects.equals(this.numberOfExerciseScores, exerciseManagementStatisticsDTO.numberOfExerciseScores) &&
        Objects.equals(this.numberOfParticipations, exerciseManagementStatisticsDTO.numberOfParticipations) &&
        Objects.equals(this.numberOfStudentsOrTeamsInCourse, exerciseManagementStatisticsDTO.numberOfStudentsOrTeamsInCourse) &&
        Objects.equals(this.numberOfPosts, exerciseManagementStatisticsDTO.numberOfPosts) &&
        Objects.equals(this.numberOfResolvedPosts, exerciseManagementStatisticsDTO.numberOfResolvedPosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageScoreOfExercise, maxPointsOfExercise, scoreDistribution, numberOfExerciseScores, numberOfParticipations, numberOfStudentsOrTeamsInCourse, numberOfPosts, numberOfResolvedPosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseManagementStatisticsDTO {\n");
    sb.append("    averageScoreOfExercise: ").append(toIndentedString(averageScoreOfExercise)).append("\n");
    sb.append("    maxPointsOfExercise: ").append(toIndentedString(maxPointsOfExercise)).append("\n");
    sb.append("    scoreDistribution: ").append(toIndentedString(scoreDistribution)).append("\n");
    sb.append("    numberOfExerciseScores: ").append(toIndentedString(numberOfExerciseScores)).append("\n");
    sb.append("    numberOfParticipations: ").append(toIndentedString(numberOfParticipations)).append("\n");
    sb.append("    numberOfStudentsOrTeamsInCourse: ").append(toIndentedString(numberOfStudentsOrTeamsInCourse)).append("\n");
    sb.append("    numberOfPosts: ").append(toIndentedString(numberOfPosts)).append("\n");
    sb.append("    numberOfResolvedPosts: ").append(toIndentedString(numberOfResolvedPosts)).append("\n");
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
