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
 * CourseManagementOverviewExerciseStatisticsDTO
 */
@JsonPropertyOrder({
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_EXERCISE_ID,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_EXERCISE_MAX_POINTS,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_AVERAGE_SCORE_IN_PERCENT,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_NO_OF_PARTICIPATING_STUDENTS_OR_TEAMS,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_PARTICIPATION_RATE_IN_PERCENT,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_NO_OF_STUDENTS_IN_COURSE,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_NO_OF_TEAMS_IN_COURSE,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_NO_OF_RATED_ASSESSMENTS,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_NO_OF_SUBMISSIONS_IN_TIME,
  CourseManagementOverviewExerciseStatisticsDTO.JSON_PROPERTY_NO_OF_ASSESSMENTS_DONE_IN_PERCENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class CourseManagementOverviewExerciseStatisticsDTO {
  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_EXERCISE_MAX_POINTS = "exerciseMaxPoints";
  private Double exerciseMaxPoints;

  public static final String JSON_PROPERTY_AVERAGE_SCORE_IN_PERCENT = "averageScoreInPercent";
  private Double averageScoreInPercent;

  public static final String JSON_PROPERTY_NO_OF_PARTICIPATING_STUDENTS_OR_TEAMS = "noOfParticipatingStudentsOrTeams";
  private Integer noOfParticipatingStudentsOrTeams;

  public static final String JSON_PROPERTY_PARTICIPATION_RATE_IN_PERCENT = "participationRateInPercent";
  private Double participationRateInPercent;

  public static final String JSON_PROPERTY_NO_OF_STUDENTS_IN_COURSE = "noOfStudentsInCourse";
  private Integer noOfStudentsInCourse;

  public static final String JSON_PROPERTY_NO_OF_TEAMS_IN_COURSE = "noOfTeamsInCourse";
  private Integer noOfTeamsInCourse;

  public static final String JSON_PROPERTY_NO_OF_RATED_ASSESSMENTS = "noOfRatedAssessments";
  private Long noOfRatedAssessments;

  public static final String JSON_PROPERTY_NO_OF_SUBMISSIONS_IN_TIME = "noOfSubmissionsInTime";
  private Long noOfSubmissionsInTime;

  public static final String JSON_PROPERTY_NO_OF_ASSESSMENTS_DONE_IN_PERCENT = "noOfAssessmentsDoneInPercent";
  private Double noOfAssessmentsDoneInPercent;

  public CourseManagementOverviewExerciseStatisticsDTO() { 
  }

  public CourseManagementOverviewExerciseStatisticsDTO exerciseId(Long exerciseId) {
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


  public CourseManagementOverviewExerciseStatisticsDTO exerciseMaxPoints(Double exerciseMaxPoints) {
    this.exerciseMaxPoints = exerciseMaxPoints;
    return this;
  }

   /**
   * Get exerciseMaxPoints
   * @return exerciseMaxPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getExerciseMaxPoints() {
    return exerciseMaxPoints;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseMaxPoints(Double exerciseMaxPoints) {
    this.exerciseMaxPoints = exerciseMaxPoints;
  }


  public CourseManagementOverviewExerciseStatisticsDTO averageScoreInPercent(Double averageScoreInPercent) {
    this.averageScoreInPercent = averageScoreInPercent;
    return this;
  }

   /**
   * Get averageScoreInPercent
   * @return averageScoreInPercent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_IN_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageScoreInPercent() {
    return averageScoreInPercent;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_IN_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScoreInPercent(Double averageScoreInPercent) {
    this.averageScoreInPercent = averageScoreInPercent;
  }


  public CourseManagementOverviewExerciseStatisticsDTO noOfParticipatingStudentsOrTeams(Integer noOfParticipatingStudentsOrTeams) {
    this.noOfParticipatingStudentsOrTeams = noOfParticipatingStudentsOrTeams;
    return this;
  }

   /**
   * Get noOfParticipatingStudentsOrTeams
   * @return noOfParticipatingStudentsOrTeams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_OF_PARTICIPATING_STUDENTS_OR_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoOfParticipatingStudentsOrTeams() {
    return noOfParticipatingStudentsOrTeams;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_PARTICIPATING_STUDENTS_OR_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfParticipatingStudentsOrTeams(Integer noOfParticipatingStudentsOrTeams) {
    this.noOfParticipatingStudentsOrTeams = noOfParticipatingStudentsOrTeams;
  }


  public CourseManagementOverviewExerciseStatisticsDTO participationRateInPercent(Double participationRateInPercent) {
    this.participationRateInPercent = participationRateInPercent;
    return this;
  }

   /**
   * Get participationRateInPercent
   * @return participationRateInPercent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPATION_RATE_IN_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getParticipationRateInPercent() {
    return participationRateInPercent;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION_RATE_IN_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipationRateInPercent(Double participationRateInPercent) {
    this.participationRateInPercent = participationRateInPercent;
  }


  public CourseManagementOverviewExerciseStatisticsDTO noOfStudentsInCourse(Integer noOfStudentsInCourse) {
    this.noOfStudentsInCourse = noOfStudentsInCourse;
    return this;
  }

   /**
   * Get noOfStudentsInCourse
   * @return noOfStudentsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_OF_STUDENTS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoOfStudentsInCourse() {
    return noOfStudentsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_STUDENTS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfStudentsInCourse(Integer noOfStudentsInCourse) {
    this.noOfStudentsInCourse = noOfStudentsInCourse;
  }


  public CourseManagementOverviewExerciseStatisticsDTO noOfTeamsInCourse(Integer noOfTeamsInCourse) {
    this.noOfTeamsInCourse = noOfTeamsInCourse;
    return this;
  }

   /**
   * Get noOfTeamsInCourse
   * @return noOfTeamsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_OF_TEAMS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoOfTeamsInCourse() {
    return noOfTeamsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_TEAMS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfTeamsInCourse(Integer noOfTeamsInCourse) {
    this.noOfTeamsInCourse = noOfTeamsInCourse;
  }


  public CourseManagementOverviewExerciseStatisticsDTO noOfRatedAssessments(Long noOfRatedAssessments) {
    this.noOfRatedAssessments = noOfRatedAssessments;
    return this;
  }

   /**
   * Get noOfRatedAssessments
   * @return noOfRatedAssessments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_OF_RATED_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNoOfRatedAssessments() {
    return noOfRatedAssessments;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_RATED_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfRatedAssessments(Long noOfRatedAssessments) {
    this.noOfRatedAssessments = noOfRatedAssessments;
  }


  public CourseManagementOverviewExerciseStatisticsDTO noOfSubmissionsInTime(Long noOfSubmissionsInTime) {
    this.noOfSubmissionsInTime = noOfSubmissionsInTime;
    return this;
  }

   /**
   * Get noOfSubmissionsInTime
   * @return noOfSubmissionsInTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_OF_SUBMISSIONS_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNoOfSubmissionsInTime() {
    return noOfSubmissionsInTime;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_SUBMISSIONS_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfSubmissionsInTime(Long noOfSubmissionsInTime) {
    this.noOfSubmissionsInTime = noOfSubmissionsInTime;
  }


  public CourseManagementOverviewExerciseStatisticsDTO noOfAssessmentsDoneInPercent(Double noOfAssessmentsDoneInPercent) {
    this.noOfAssessmentsDoneInPercent = noOfAssessmentsDoneInPercent;
    return this;
  }

   /**
   * Get noOfAssessmentsDoneInPercent
   * @return noOfAssessmentsDoneInPercent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_OF_ASSESSMENTS_DONE_IN_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNoOfAssessmentsDoneInPercent() {
    return noOfAssessmentsDoneInPercent;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_ASSESSMENTS_DONE_IN_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfAssessmentsDoneInPercent(Double noOfAssessmentsDoneInPercent) {
    this.noOfAssessmentsDoneInPercent = noOfAssessmentsDoneInPercent;
  }


  /**
   * Return true if this CourseManagementOverviewExerciseStatisticsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseManagementOverviewExerciseStatisticsDTO courseManagementOverviewExerciseStatisticsDTO = (CourseManagementOverviewExerciseStatisticsDTO) o;
    return Objects.equals(this.exerciseId, courseManagementOverviewExerciseStatisticsDTO.exerciseId) &&
        Objects.equals(this.exerciseMaxPoints, courseManagementOverviewExerciseStatisticsDTO.exerciseMaxPoints) &&
        Objects.equals(this.averageScoreInPercent, courseManagementOverviewExerciseStatisticsDTO.averageScoreInPercent) &&
        Objects.equals(this.noOfParticipatingStudentsOrTeams, courseManagementOverviewExerciseStatisticsDTO.noOfParticipatingStudentsOrTeams) &&
        Objects.equals(this.participationRateInPercent, courseManagementOverviewExerciseStatisticsDTO.participationRateInPercent) &&
        Objects.equals(this.noOfStudentsInCourse, courseManagementOverviewExerciseStatisticsDTO.noOfStudentsInCourse) &&
        Objects.equals(this.noOfTeamsInCourse, courseManagementOverviewExerciseStatisticsDTO.noOfTeamsInCourse) &&
        Objects.equals(this.noOfRatedAssessments, courseManagementOverviewExerciseStatisticsDTO.noOfRatedAssessments) &&
        Objects.equals(this.noOfSubmissionsInTime, courseManagementOverviewExerciseStatisticsDTO.noOfSubmissionsInTime) &&
        Objects.equals(this.noOfAssessmentsDoneInPercent, courseManagementOverviewExerciseStatisticsDTO.noOfAssessmentsDoneInPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseId, exerciseMaxPoints, averageScoreInPercent, noOfParticipatingStudentsOrTeams, participationRateInPercent, noOfStudentsInCourse, noOfTeamsInCourse, noOfRatedAssessments, noOfSubmissionsInTime, noOfAssessmentsDoneInPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseManagementOverviewExerciseStatisticsDTO {\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    exerciseMaxPoints: ").append(toIndentedString(exerciseMaxPoints)).append("\n");
    sb.append("    averageScoreInPercent: ").append(toIndentedString(averageScoreInPercent)).append("\n");
    sb.append("    noOfParticipatingStudentsOrTeams: ").append(toIndentedString(noOfParticipatingStudentsOrTeams)).append("\n");
    sb.append("    participationRateInPercent: ").append(toIndentedString(participationRateInPercent)).append("\n");
    sb.append("    noOfStudentsInCourse: ").append(toIndentedString(noOfStudentsInCourse)).append("\n");
    sb.append("    noOfTeamsInCourse: ").append(toIndentedString(noOfTeamsInCourse)).append("\n");
    sb.append("    noOfRatedAssessments: ").append(toIndentedString(noOfRatedAssessments)).append("\n");
    sb.append("    noOfSubmissionsInTime: ").append(toIndentedString(noOfSubmissionsInTime)).append("\n");
    sb.append("    noOfAssessmentsDoneInPercent: ").append(toIndentedString(noOfAssessmentsDoneInPercent)).append("\n");
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

