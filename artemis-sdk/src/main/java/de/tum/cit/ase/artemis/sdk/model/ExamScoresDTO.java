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
import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;
import de.tum.cit.ase.artemis.sdk.model.StudentResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExamScoresDTO
 */
@JsonPropertyOrder({
  ExamScoresDTO.JSON_PROPERTY_EXAM_ID,
  ExamScoresDTO.JSON_PROPERTY_TITLE,
  ExamScoresDTO.JSON_PROPERTY_MAX_POINTS,
  ExamScoresDTO.JSON_PROPERTY_AVERAGE_POINTS_ACHIEVED,
  ExamScoresDTO.JSON_PROPERTY_HAS_SECOND_CORRECTION_AND_STARTED,
  ExamScoresDTO.JSON_PROPERTY_EXERCISE_GROUPS,
  ExamScoresDTO.JSON_PROPERTY_STUDENT_RESULTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class ExamScoresDTO {
  public static final String JSON_PROPERTY_EXAM_ID = "examId";
  private Long examId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_MAX_POINTS = "maxPoints";
  private Integer maxPoints;

  public static final String JSON_PROPERTY_AVERAGE_POINTS_ACHIEVED = "averagePointsAchieved";
  private Double averagePointsAchieved;

  public static final String JSON_PROPERTY_HAS_SECOND_CORRECTION_AND_STARTED = "hasSecondCorrectionAndStarted";
  private Boolean hasSecondCorrectionAndStarted;

  public static final String JSON_PROPERTY_EXERCISE_GROUPS = "exerciseGroups";
  private List<ExerciseGroup> exerciseGroups = new ArrayList<>();

  public static final String JSON_PROPERTY_STUDENT_RESULTS = "studentResults";
  private List<StudentResult> studentResults = new ArrayList<>();

  public ExamScoresDTO() { 
  }

  public ExamScoresDTO examId(Long examId) {
    this.examId = examId;
    return this;
  }

   /**
   * Get examId
   * @return examId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExamId() {
    return examId;
  }


  @JsonProperty(JSON_PROPERTY_EXAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamId(Long examId) {
    this.examId = examId;
  }


  public ExamScoresDTO title(String title) {
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


  public ExamScoresDTO maxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

   /**
   * Get maxPoints
   * @return maxPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxPoints() {
    return maxPoints;
  }


  @JsonProperty(JSON_PROPERTY_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
  }


  public ExamScoresDTO averagePointsAchieved(Double averagePointsAchieved) {
    this.averagePointsAchieved = averagePointsAchieved;
    return this;
  }

   /**
   * Get averagePointsAchieved
   * @return averagePointsAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_POINTS_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAveragePointsAchieved() {
    return averagePointsAchieved;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_POINTS_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAveragePointsAchieved(Double averagePointsAchieved) {
    this.averagePointsAchieved = averagePointsAchieved;
  }


  public ExamScoresDTO hasSecondCorrectionAndStarted(Boolean hasSecondCorrectionAndStarted) {
    this.hasSecondCorrectionAndStarted = hasSecondCorrectionAndStarted;
    return this;
  }

   /**
   * Get hasSecondCorrectionAndStarted
   * @return hasSecondCorrectionAndStarted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SECOND_CORRECTION_AND_STARTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasSecondCorrectionAndStarted() {
    return hasSecondCorrectionAndStarted;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SECOND_CORRECTION_AND_STARTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasSecondCorrectionAndStarted(Boolean hasSecondCorrectionAndStarted) {
    this.hasSecondCorrectionAndStarted = hasSecondCorrectionAndStarted;
  }


  public ExamScoresDTO exerciseGroups(List<ExerciseGroup> exerciseGroups) {
    this.exerciseGroups = exerciseGroups;
    return this;
  }

  public ExamScoresDTO addExerciseGroupsItem(ExerciseGroup exerciseGroupsItem) {
    if (this.exerciseGroups == null) {
      this.exerciseGroups = new ArrayList<>();
    }
    this.exerciseGroups.add(exerciseGroupsItem);
    return this;
  }

   /**
   * Get exerciseGroups
   * @return exerciseGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExerciseGroup> getExerciseGroups() {
    return exerciseGroups;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseGroups(List<ExerciseGroup> exerciseGroups) {
    this.exerciseGroups = exerciseGroups;
  }


  public ExamScoresDTO studentResults(List<StudentResult> studentResults) {
    this.studentResults = studentResults;
    return this;
  }

  public ExamScoresDTO addStudentResultsItem(StudentResult studentResultsItem) {
    if (this.studentResults == null) {
      this.studentResults = new ArrayList<>();
    }
    this.studentResults.add(studentResultsItem);
    return this;
  }

   /**
   * Get studentResults
   * @return studentResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StudentResult> getStudentResults() {
    return studentResults;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentResults(List<StudentResult> studentResults) {
    this.studentResults = studentResults;
  }


  /**
   * Return true if this ExamScoresDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExamScoresDTO examScoresDTO = (ExamScoresDTO) o;
    return Objects.equals(this.examId, examScoresDTO.examId) &&
        Objects.equals(this.title, examScoresDTO.title) &&
        Objects.equals(this.maxPoints, examScoresDTO.maxPoints) &&
        Objects.equals(this.averagePointsAchieved, examScoresDTO.averagePointsAchieved) &&
        Objects.equals(this.hasSecondCorrectionAndStarted, examScoresDTO.hasSecondCorrectionAndStarted) &&
        Objects.equals(this.exerciseGroups, examScoresDTO.exerciseGroups) &&
        Objects.equals(this.studentResults, examScoresDTO.studentResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examId, title, maxPoints, averagePointsAchieved, hasSecondCorrectionAndStarted, exerciseGroups, studentResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamScoresDTO {\n");
    sb.append("    examId: ").append(toIndentedString(examId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    averagePointsAchieved: ").append(toIndentedString(averagePointsAchieved)).append("\n");
    sb.append("    hasSecondCorrectionAndStarted: ").append(toIndentedString(hasSecondCorrectionAndStarted)).append("\n");
    sb.append("    exerciseGroups: ").append(toIndentedString(exerciseGroups)).append("\n");
    sb.append("    studentResults: ").append(toIndentedString(studentResults)).append("\n");
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

