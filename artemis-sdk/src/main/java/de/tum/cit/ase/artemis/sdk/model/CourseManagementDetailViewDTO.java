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
 * CourseManagementDetailViewDTO
 */
@JsonPropertyOrder({
  CourseManagementDetailViewDTO.JSON_PROPERTY_NUMBER_OF_STUDENTS_IN_COURSE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_NUMBER_OF_TEACHING_ASSISTANTS_IN_COURSE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_NUMBER_OF_EDITORS_IN_COURSE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_NUMBER_OF_INSTRUCTORS_IN_COURSE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_PERCENTAGE_ASSESSMENTS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_ABSOLUTE_ASSESSMENTS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_MAX_ASSESSMENTS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_PERCENTAGE_COMPLAINTS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_ABSOLUTE_COMPLAINTS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_MAX_COMPLAINTS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_PERCENTAGE_MORE_FEEDBACKS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_ABSOLUTE_MORE_FEEDBACKS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_MAX_MORE_FEEDBACKS,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_PERCENTAGE_AVERAGE_SCORE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_ABSOLUTE_AVERAGE_SCORE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_CURRENT_MAX_AVERAGE_SCORE,
  CourseManagementDetailViewDTO.JSON_PROPERTY_ACTIVE_STUDENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class CourseManagementDetailViewDTO {
  public static final String JSON_PROPERTY_NUMBER_OF_STUDENTS_IN_COURSE = "numberOfStudentsInCourse";
  private Integer numberOfStudentsInCourse;

  public static final String JSON_PROPERTY_NUMBER_OF_TEACHING_ASSISTANTS_IN_COURSE = "numberOfTeachingAssistantsInCourse";
  private Integer numberOfTeachingAssistantsInCourse;

  public static final String JSON_PROPERTY_NUMBER_OF_EDITORS_IN_COURSE = "numberOfEditorsInCourse";
  private Integer numberOfEditorsInCourse;

  public static final String JSON_PROPERTY_NUMBER_OF_INSTRUCTORS_IN_COURSE = "numberOfInstructorsInCourse";
  private Integer numberOfInstructorsInCourse;

  public static final String JSON_PROPERTY_CURRENT_PERCENTAGE_ASSESSMENTS = "currentPercentageAssessments";
  private Double currentPercentageAssessments;

  public static final String JSON_PROPERTY_CURRENT_ABSOLUTE_ASSESSMENTS = "currentAbsoluteAssessments";
  private Long currentAbsoluteAssessments;

  public static final String JSON_PROPERTY_CURRENT_MAX_ASSESSMENTS = "currentMaxAssessments";
  private Long currentMaxAssessments;

  public static final String JSON_PROPERTY_CURRENT_PERCENTAGE_COMPLAINTS = "currentPercentageComplaints";
  private Double currentPercentageComplaints;

  public static final String JSON_PROPERTY_CURRENT_ABSOLUTE_COMPLAINTS = "currentAbsoluteComplaints";
  private Long currentAbsoluteComplaints;

  public static final String JSON_PROPERTY_CURRENT_MAX_COMPLAINTS = "currentMaxComplaints";
  private Long currentMaxComplaints;

  public static final String JSON_PROPERTY_CURRENT_PERCENTAGE_MORE_FEEDBACKS = "currentPercentageMoreFeedbacks";
  private Double currentPercentageMoreFeedbacks;

  public static final String JSON_PROPERTY_CURRENT_ABSOLUTE_MORE_FEEDBACKS = "currentAbsoluteMoreFeedbacks";
  private Long currentAbsoluteMoreFeedbacks;

  public static final String JSON_PROPERTY_CURRENT_MAX_MORE_FEEDBACKS = "currentMaxMoreFeedbacks";
  private Long currentMaxMoreFeedbacks;

  public static final String JSON_PROPERTY_CURRENT_PERCENTAGE_AVERAGE_SCORE = "currentPercentageAverageScore";
  private Double currentPercentageAverageScore;

  public static final String JSON_PROPERTY_CURRENT_ABSOLUTE_AVERAGE_SCORE = "currentAbsoluteAverageScore";
  private Double currentAbsoluteAverageScore;

  public static final String JSON_PROPERTY_CURRENT_MAX_AVERAGE_SCORE = "currentMaxAverageScore";
  private Double currentMaxAverageScore;

  public static final String JSON_PROPERTY_ACTIVE_STUDENTS = "activeStudents";
  private List<Integer> activeStudents;

  public CourseManagementDetailViewDTO() { 
  }

  public CourseManagementDetailViewDTO numberOfStudentsInCourse(Integer numberOfStudentsInCourse) {
    this.numberOfStudentsInCourse = numberOfStudentsInCourse;
    return this;
  }

   /**
   * Get numberOfStudentsInCourse
   * @return numberOfStudentsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfStudentsInCourse() {
    return numberOfStudentsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfStudentsInCourse(Integer numberOfStudentsInCourse) {
    this.numberOfStudentsInCourse = numberOfStudentsInCourse;
  }


  public CourseManagementDetailViewDTO numberOfTeachingAssistantsInCourse(Integer numberOfTeachingAssistantsInCourse) {
    this.numberOfTeachingAssistantsInCourse = numberOfTeachingAssistantsInCourse;
    return this;
  }

   /**
   * Get numberOfTeachingAssistantsInCourse
   * @return numberOfTeachingAssistantsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TEACHING_ASSISTANTS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfTeachingAssistantsInCourse() {
    return numberOfTeachingAssistantsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TEACHING_ASSISTANTS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfTeachingAssistantsInCourse(Integer numberOfTeachingAssistantsInCourse) {
    this.numberOfTeachingAssistantsInCourse = numberOfTeachingAssistantsInCourse;
  }


  public CourseManagementDetailViewDTO numberOfEditorsInCourse(Integer numberOfEditorsInCourse) {
    this.numberOfEditorsInCourse = numberOfEditorsInCourse;
    return this;
  }

   /**
   * Get numberOfEditorsInCourse
   * @return numberOfEditorsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EDITORS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfEditorsInCourse() {
    return numberOfEditorsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EDITORS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfEditorsInCourse(Integer numberOfEditorsInCourse) {
    this.numberOfEditorsInCourse = numberOfEditorsInCourse;
  }


  public CourseManagementDetailViewDTO numberOfInstructorsInCourse(Integer numberOfInstructorsInCourse) {
    this.numberOfInstructorsInCourse = numberOfInstructorsInCourse;
    return this;
  }

   /**
   * Get numberOfInstructorsInCourse
   * @return numberOfInstructorsInCourse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTRUCTORS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfInstructorsInCourse() {
    return numberOfInstructorsInCourse;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTRUCTORS_IN_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfInstructorsInCourse(Integer numberOfInstructorsInCourse) {
    this.numberOfInstructorsInCourse = numberOfInstructorsInCourse;
  }


  public CourseManagementDetailViewDTO currentPercentageAssessments(Double currentPercentageAssessments) {
    this.currentPercentageAssessments = currentPercentageAssessments;
    return this;
  }

   /**
   * Get currentPercentageAssessments
   * @return currentPercentageAssessments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentPercentageAssessments() {
    return currentPercentageAssessments;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPercentageAssessments(Double currentPercentageAssessments) {
    this.currentPercentageAssessments = currentPercentageAssessments;
  }


  public CourseManagementDetailViewDTO currentAbsoluteAssessments(Long currentAbsoluteAssessments) {
    this.currentAbsoluteAssessments = currentAbsoluteAssessments;
    return this;
  }

   /**
   * Get currentAbsoluteAssessments
   * @return currentAbsoluteAssessments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentAbsoluteAssessments() {
    return currentAbsoluteAssessments;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAbsoluteAssessments(Long currentAbsoluteAssessments) {
    this.currentAbsoluteAssessments = currentAbsoluteAssessments;
  }


  public CourseManagementDetailViewDTO currentMaxAssessments(Long currentMaxAssessments) {
    this.currentMaxAssessments = currentMaxAssessments;
    return this;
  }

   /**
   * Get currentMaxAssessments
   * @return currentMaxAssessments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentMaxAssessments() {
    return currentMaxAssessments;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentMaxAssessments(Long currentMaxAssessments) {
    this.currentMaxAssessments = currentMaxAssessments;
  }


  public CourseManagementDetailViewDTO currentPercentageComplaints(Double currentPercentageComplaints) {
    this.currentPercentageComplaints = currentPercentageComplaints;
    return this;
  }

   /**
   * Get currentPercentageComplaints
   * @return currentPercentageComplaints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentPercentageComplaints() {
    return currentPercentageComplaints;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPercentageComplaints(Double currentPercentageComplaints) {
    this.currentPercentageComplaints = currentPercentageComplaints;
  }


  public CourseManagementDetailViewDTO currentAbsoluteComplaints(Long currentAbsoluteComplaints) {
    this.currentAbsoluteComplaints = currentAbsoluteComplaints;
    return this;
  }

   /**
   * Get currentAbsoluteComplaints
   * @return currentAbsoluteComplaints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentAbsoluteComplaints() {
    return currentAbsoluteComplaints;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAbsoluteComplaints(Long currentAbsoluteComplaints) {
    this.currentAbsoluteComplaints = currentAbsoluteComplaints;
  }


  public CourseManagementDetailViewDTO currentMaxComplaints(Long currentMaxComplaints) {
    this.currentMaxComplaints = currentMaxComplaints;
    return this;
  }

   /**
   * Get currentMaxComplaints
   * @return currentMaxComplaints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentMaxComplaints() {
    return currentMaxComplaints;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentMaxComplaints(Long currentMaxComplaints) {
    this.currentMaxComplaints = currentMaxComplaints;
  }


  public CourseManagementDetailViewDTO currentPercentageMoreFeedbacks(Double currentPercentageMoreFeedbacks) {
    this.currentPercentageMoreFeedbacks = currentPercentageMoreFeedbacks;
    return this;
  }

   /**
   * Get currentPercentageMoreFeedbacks
   * @return currentPercentageMoreFeedbacks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_MORE_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentPercentageMoreFeedbacks() {
    return currentPercentageMoreFeedbacks;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_MORE_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPercentageMoreFeedbacks(Double currentPercentageMoreFeedbacks) {
    this.currentPercentageMoreFeedbacks = currentPercentageMoreFeedbacks;
  }


  public CourseManagementDetailViewDTO currentAbsoluteMoreFeedbacks(Long currentAbsoluteMoreFeedbacks) {
    this.currentAbsoluteMoreFeedbacks = currentAbsoluteMoreFeedbacks;
    return this;
  }

   /**
   * Get currentAbsoluteMoreFeedbacks
   * @return currentAbsoluteMoreFeedbacks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_MORE_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentAbsoluteMoreFeedbacks() {
    return currentAbsoluteMoreFeedbacks;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_MORE_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAbsoluteMoreFeedbacks(Long currentAbsoluteMoreFeedbacks) {
    this.currentAbsoluteMoreFeedbacks = currentAbsoluteMoreFeedbacks;
  }


  public CourseManagementDetailViewDTO currentMaxMoreFeedbacks(Long currentMaxMoreFeedbacks) {
    this.currentMaxMoreFeedbacks = currentMaxMoreFeedbacks;
    return this;
  }

   /**
   * Get currentMaxMoreFeedbacks
   * @return currentMaxMoreFeedbacks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_MORE_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentMaxMoreFeedbacks() {
    return currentMaxMoreFeedbacks;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_MORE_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentMaxMoreFeedbacks(Long currentMaxMoreFeedbacks) {
    this.currentMaxMoreFeedbacks = currentMaxMoreFeedbacks;
  }


  public CourseManagementDetailViewDTO currentPercentageAverageScore(Double currentPercentageAverageScore) {
    this.currentPercentageAverageScore = currentPercentageAverageScore;
    return this;
  }

   /**
   * Get currentPercentageAverageScore
   * @return currentPercentageAverageScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentPercentageAverageScore() {
    return currentPercentageAverageScore;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PERCENTAGE_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPercentageAverageScore(Double currentPercentageAverageScore) {
    this.currentPercentageAverageScore = currentPercentageAverageScore;
  }


  public CourseManagementDetailViewDTO currentAbsoluteAverageScore(Double currentAbsoluteAverageScore) {
    this.currentAbsoluteAverageScore = currentAbsoluteAverageScore;
    return this;
  }

   /**
   * Get currentAbsoluteAverageScore
   * @return currentAbsoluteAverageScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentAbsoluteAverageScore() {
    return currentAbsoluteAverageScore;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ABSOLUTE_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAbsoluteAverageScore(Double currentAbsoluteAverageScore) {
    this.currentAbsoluteAverageScore = currentAbsoluteAverageScore;
  }


  public CourseManagementDetailViewDTO currentMaxAverageScore(Double currentMaxAverageScore) {
    this.currentMaxAverageScore = currentMaxAverageScore;
    return this;
  }

   /**
   * Get currentMaxAverageScore
   * @return currentMaxAverageScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentMaxAverageScore() {
    return currentMaxAverageScore;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_MAX_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentMaxAverageScore(Double currentMaxAverageScore) {
    this.currentMaxAverageScore = currentMaxAverageScore;
  }


  public CourseManagementDetailViewDTO activeStudents(List<Integer> activeStudents) {
    this.activeStudents = activeStudents;
    return this;
  }

  public CourseManagementDetailViewDTO addActiveStudentsItem(Integer activeStudentsItem) {
    if (this.activeStudents == null) {
      this.activeStudents = new ArrayList<>();
    }
    this.activeStudents.add(activeStudentsItem);
    return this;
  }

   /**
   * Get activeStudents
   * @return activeStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getActiveStudents() {
    return activeStudents;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveStudents(List<Integer> activeStudents) {
    this.activeStudents = activeStudents;
  }


  /**
   * Return true if this CourseManagementDetailViewDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseManagementDetailViewDTO courseManagementDetailViewDTO = (CourseManagementDetailViewDTO) o;
    return Objects.equals(this.numberOfStudentsInCourse, courseManagementDetailViewDTO.numberOfStudentsInCourse) &&
        Objects.equals(this.numberOfTeachingAssistantsInCourse, courseManagementDetailViewDTO.numberOfTeachingAssistantsInCourse) &&
        Objects.equals(this.numberOfEditorsInCourse, courseManagementDetailViewDTO.numberOfEditorsInCourse) &&
        Objects.equals(this.numberOfInstructorsInCourse, courseManagementDetailViewDTO.numberOfInstructorsInCourse) &&
        Objects.equals(this.currentPercentageAssessments, courseManagementDetailViewDTO.currentPercentageAssessments) &&
        Objects.equals(this.currentAbsoluteAssessments, courseManagementDetailViewDTO.currentAbsoluteAssessments) &&
        Objects.equals(this.currentMaxAssessments, courseManagementDetailViewDTO.currentMaxAssessments) &&
        Objects.equals(this.currentPercentageComplaints, courseManagementDetailViewDTO.currentPercentageComplaints) &&
        Objects.equals(this.currentAbsoluteComplaints, courseManagementDetailViewDTO.currentAbsoluteComplaints) &&
        Objects.equals(this.currentMaxComplaints, courseManagementDetailViewDTO.currentMaxComplaints) &&
        Objects.equals(this.currentPercentageMoreFeedbacks, courseManagementDetailViewDTO.currentPercentageMoreFeedbacks) &&
        Objects.equals(this.currentAbsoluteMoreFeedbacks, courseManagementDetailViewDTO.currentAbsoluteMoreFeedbacks) &&
        Objects.equals(this.currentMaxMoreFeedbacks, courseManagementDetailViewDTO.currentMaxMoreFeedbacks) &&
        Objects.equals(this.currentPercentageAverageScore, courseManagementDetailViewDTO.currentPercentageAverageScore) &&
        Objects.equals(this.currentAbsoluteAverageScore, courseManagementDetailViewDTO.currentAbsoluteAverageScore) &&
        Objects.equals(this.currentMaxAverageScore, courseManagementDetailViewDTO.currentMaxAverageScore) &&
        Objects.equals(this.activeStudents, courseManagementDetailViewDTO.activeStudents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfStudentsInCourse, numberOfTeachingAssistantsInCourse, numberOfEditorsInCourse, numberOfInstructorsInCourse, currentPercentageAssessments, currentAbsoluteAssessments, currentMaxAssessments, currentPercentageComplaints, currentAbsoluteComplaints, currentMaxComplaints, currentPercentageMoreFeedbacks, currentAbsoluteMoreFeedbacks, currentMaxMoreFeedbacks, currentPercentageAverageScore, currentAbsoluteAverageScore, currentMaxAverageScore, activeStudents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseManagementDetailViewDTO {\n");
    sb.append("    numberOfStudentsInCourse: ").append(toIndentedString(numberOfStudentsInCourse)).append("\n");
    sb.append("    numberOfTeachingAssistantsInCourse: ").append(toIndentedString(numberOfTeachingAssistantsInCourse)).append("\n");
    sb.append("    numberOfEditorsInCourse: ").append(toIndentedString(numberOfEditorsInCourse)).append("\n");
    sb.append("    numberOfInstructorsInCourse: ").append(toIndentedString(numberOfInstructorsInCourse)).append("\n");
    sb.append("    currentPercentageAssessments: ").append(toIndentedString(currentPercentageAssessments)).append("\n");
    sb.append("    currentAbsoluteAssessments: ").append(toIndentedString(currentAbsoluteAssessments)).append("\n");
    sb.append("    currentMaxAssessments: ").append(toIndentedString(currentMaxAssessments)).append("\n");
    sb.append("    currentPercentageComplaints: ").append(toIndentedString(currentPercentageComplaints)).append("\n");
    sb.append("    currentAbsoluteComplaints: ").append(toIndentedString(currentAbsoluteComplaints)).append("\n");
    sb.append("    currentMaxComplaints: ").append(toIndentedString(currentMaxComplaints)).append("\n");
    sb.append("    currentPercentageMoreFeedbacks: ").append(toIndentedString(currentPercentageMoreFeedbacks)).append("\n");
    sb.append("    currentAbsoluteMoreFeedbacks: ").append(toIndentedString(currentAbsoluteMoreFeedbacks)).append("\n");
    sb.append("    currentMaxMoreFeedbacks: ").append(toIndentedString(currentMaxMoreFeedbacks)).append("\n");
    sb.append("    currentPercentageAverageScore: ").append(toIndentedString(currentPercentageAverageScore)).append("\n");
    sb.append("    currentAbsoluteAverageScore: ").append(toIndentedString(currentAbsoluteAverageScore)).append("\n");
    sb.append("    currentMaxAverageScore: ").append(toIndentedString(currentMaxAverageScore)).append("\n");
    sb.append("    activeStudents: ").append(toIndentedString(activeStudents)).append("\n");
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

