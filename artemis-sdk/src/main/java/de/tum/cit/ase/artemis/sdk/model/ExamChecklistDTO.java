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
 * ExamChecklistDTO
 */
@JsonPropertyOrder({
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_GENERATED_STUDENT_EXAMS,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_TEST_RUNS,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_TOTAL_EXAM_ASSESSMENTS_FINISHED_BY_CORRECTION_ROUND,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_TOTAL_PARTICIPATIONS_FOR_ASSESSMENT,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_EXAMS_SUBMITTED,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_EXAMS_STARTED,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS,
  ExamChecklistDTO.JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS_DONE,
  ExamChecklistDTO.JSON_PROPERTY_ALL_EXAM_EXERCISES_ALL_STUDENTS_PREPARED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ExamChecklistDTO {
  public static final String JSON_PROPERTY_NUMBER_OF_GENERATED_STUDENT_EXAMS = "numberOfGeneratedStudentExams";
  private Long numberOfGeneratedStudentExams;

  public static final String JSON_PROPERTY_NUMBER_OF_TEST_RUNS = "numberOfTestRuns";
  private Long numberOfTestRuns;

  public static final String JSON_PROPERTY_NUMBER_OF_TOTAL_EXAM_ASSESSMENTS_FINISHED_BY_CORRECTION_ROUND = "numberOfTotalExamAssessmentsFinishedByCorrectionRound";
  private List<Long> numberOfTotalExamAssessmentsFinishedByCorrectionRound;

  public static final String JSON_PROPERTY_NUMBER_OF_TOTAL_PARTICIPATIONS_FOR_ASSESSMENT = "numberOfTotalParticipationsForAssessment";
  private Long numberOfTotalParticipationsForAssessment;

  public static final String JSON_PROPERTY_NUMBER_OF_EXAMS_SUBMITTED = "numberOfExamsSubmitted";
  private Long numberOfExamsSubmitted;

  public static final String JSON_PROPERTY_NUMBER_OF_EXAMS_STARTED = "numberOfExamsStarted";
  private Long numberOfExamsStarted;

  public static final String JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS = "numberOfAllComplaints";
  private Long numberOfAllComplaints;

  public static final String JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS_DONE = "numberOfAllComplaintsDone";
  private Long numberOfAllComplaintsDone;

  public static final String JSON_PROPERTY_ALL_EXAM_EXERCISES_ALL_STUDENTS_PREPARED = "allExamExercisesAllStudentsPrepared";
  private Boolean allExamExercisesAllStudentsPrepared;

  public ExamChecklistDTO() { 
  }

  public ExamChecklistDTO numberOfGeneratedStudentExams(Long numberOfGeneratedStudentExams) {
    this.numberOfGeneratedStudentExams = numberOfGeneratedStudentExams;
    return this;
  }

   /**
   * Get numberOfGeneratedStudentExams
   * @return numberOfGeneratedStudentExams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_GENERATED_STUDENT_EXAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfGeneratedStudentExams() {
    return numberOfGeneratedStudentExams;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_GENERATED_STUDENT_EXAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfGeneratedStudentExams(Long numberOfGeneratedStudentExams) {
    this.numberOfGeneratedStudentExams = numberOfGeneratedStudentExams;
  }


  public ExamChecklistDTO numberOfTestRuns(Long numberOfTestRuns) {
    this.numberOfTestRuns = numberOfTestRuns;
    return this;
  }

   /**
   * Get numberOfTestRuns
   * @return numberOfTestRuns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TEST_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfTestRuns() {
    return numberOfTestRuns;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TEST_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfTestRuns(Long numberOfTestRuns) {
    this.numberOfTestRuns = numberOfTestRuns;
  }


  public ExamChecklistDTO numberOfTotalExamAssessmentsFinishedByCorrectionRound(List<Long> numberOfTotalExamAssessmentsFinishedByCorrectionRound) {
    this.numberOfTotalExamAssessmentsFinishedByCorrectionRound = numberOfTotalExamAssessmentsFinishedByCorrectionRound;
    return this;
  }

  public ExamChecklistDTO addNumberOfTotalExamAssessmentsFinishedByCorrectionRoundItem(Long numberOfTotalExamAssessmentsFinishedByCorrectionRoundItem) {
    if (this.numberOfTotalExamAssessmentsFinishedByCorrectionRound == null) {
      this.numberOfTotalExamAssessmentsFinishedByCorrectionRound = new ArrayList<>();
    }
    this.numberOfTotalExamAssessmentsFinishedByCorrectionRound.add(numberOfTotalExamAssessmentsFinishedByCorrectionRoundItem);
    return this;
  }

   /**
   * Get numberOfTotalExamAssessmentsFinishedByCorrectionRound
   * @return numberOfTotalExamAssessmentsFinishedByCorrectionRound
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TOTAL_EXAM_ASSESSMENTS_FINISHED_BY_CORRECTION_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getNumberOfTotalExamAssessmentsFinishedByCorrectionRound() {
    return numberOfTotalExamAssessmentsFinishedByCorrectionRound;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TOTAL_EXAM_ASSESSMENTS_FINISHED_BY_CORRECTION_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfTotalExamAssessmentsFinishedByCorrectionRound(List<Long> numberOfTotalExamAssessmentsFinishedByCorrectionRound) {
    this.numberOfTotalExamAssessmentsFinishedByCorrectionRound = numberOfTotalExamAssessmentsFinishedByCorrectionRound;
  }


  public ExamChecklistDTO numberOfTotalParticipationsForAssessment(Long numberOfTotalParticipationsForAssessment) {
    this.numberOfTotalParticipationsForAssessment = numberOfTotalParticipationsForAssessment;
    return this;
  }

   /**
   * Get numberOfTotalParticipationsForAssessment
   * @return numberOfTotalParticipationsForAssessment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TOTAL_PARTICIPATIONS_FOR_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfTotalParticipationsForAssessment() {
    return numberOfTotalParticipationsForAssessment;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TOTAL_PARTICIPATIONS_FOR_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfTotalParticipationsForAssessment(Long numberOfTotalParticipationsForAssessment) {
    this.numberOfTotalParticipationsForAssessment = numberOfTotalParticipationsForAssessment;
  }


  public ExamChecklistDTO numberOfExamsSubmitted(Long numberOfExamsSubmitted) {
    this.numberOfExamsSubmitted = numberOfExamsSubmitted;
    return this;
  }

   /**
   * Get numberOfExamsSubmitted
   * @return numberOfExamsSubmitted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXAMS_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfExamsSubmitted() {
    return numberOfExamsSubmitted;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXAMS_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfExamsSubmitted(Long numberOfExamsSubmitted) {
    this.numberOfExamsSubmitted = numberOfExamsSubmitted;
  }


  public ExamChecklistDTO numberOfExamsStarted(Long numberOfExamsStarted) {
    this.numberOfExamsStarted = numberOfExamsStarted;
    return this;
  }

   /**
   * Get numberOfExamsStarted
   * @return numberOfExamsStarted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXAMS_STARTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfExamsStarted() {
    return numberOfExamsStarted;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXAMS_STARTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfExamsStarted(Long numberOfExamsStarted) {
    this.numberOfExamsStarted = numberOfExamsStarted;
  }


  public ExamChecklistDTO numberOfAllComplaints(Long numberOfAllComplaints) {
    this.numberOfAllComplaints = numberOfAllComplaints;
    return this;
  }

   /**
   * Get numberOfAllComplaints
   * @return numberOfAllComplaints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfAllComplaints() {
    return numberOfAllComplaints;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAllComplaints(Long numberOfAllComplaints) {
    this.numberOfAllComplaints = numberOfAllComplaints;
  }


  public ExamChecklistDTO numberOfAllComplaintsDone(Long numberOfAllComplaintsDone) {
    this.numberOfAllComplaintsDone = numberOfAllComplaintsDone;
    return this;
  }

   /**
   * Get numberOfAllComplaintsDone
   * @return numberOfAllComplaintsDone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfAllComplaintsDone() {
    return numberOfAllComplaintsDone;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ALL_COMPLAINTS_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAllComplaintsDone(Long numberOfAllComplaintsDone) {
    this.numberOfAllComplaintsDone = numberOfAllComplaintsDone;
  }


  public ExamChecklistDTO allExamExercisesAllStudentsPrepared(Boolean allExamExercisesAllStudentsPrepared) {
    this.allExamExercisesAllStudentsPrepared = allExamExercisesAllStudentsPrepared;
    return this;
  }

   /**
   * Get allExamExercisesAllStudentsPrepared
   * @return allExamExercisesAllStudentsPrepared
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_EXAM_EXERCISES_ALL_STUDENTS_PREPARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllExamExercisesAllStudentsPrepared() {
    return allExamExercisesAllStudentsPrepared;
  }


  @JsonProperty(JSON_PROPERTY_ALL_EXAM_EXERCISES_ALL_STUDENTS_PREPARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllExamExercisesAllStudentsPrepared(Boolean allExamExercisesAllStudentsPrepared) {
    this.allExamExercisesAllStudentsPrepared = allExamExercisesAllStudentsPrepared;
  }


  /**
   * Return true if this ExamChecklistDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExamChecklistDTO examChecklistDTO = (ExamChecklistDTO) o;
    return Objects.equals(this.numberOfGeneratedStudentExams, examChecklistDTO.numberOfGeneratedStudentExams) &&
        Objects.equals(this.numberOfTestRuns, examChecklistDTO.numberOfTestRuns) &&
        Objects.equals(this.numberOfTotalExamAssessmentsFinishedByCorrectionRound, examChecklistDTO.numberOfTotalExamAssessmentsFinishedByCorrectionRound) &&
        Objects.equals(this.numberOfTotalParticipationsForAssessment, examChecklistDTO.numberOfTotalParticipationsForAssessment) &&
        Objects.equals(this.numberOfExamsSubmitted, examChecklistDTO.numberOfExamsSubmitted) &&
        Objects.equals(this.numberOfExamsStarted, examChecklistDTO.numberOfExamsStarted) &&
        Objects.equals(this.numberOfAllComplaints, examChecklistDTO.numberOfAllComplaints) &&
        Objects.equals(this.numberOfAllComplaintsDone, examChecklistDTO.numberOfAllComplaintsDone) &&
        Objects.equals(this.allExamExercisesAllStudentsPrepared, examChecklistDTO.allExamExercisesAllStudentsPrepared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfGeneratedStudentExams, numberOfTestRuns, numberOfTotalExamAssessmentsFinishedByCorrectionRound, numberOfTotalParticipationsForAssessment, numberOfExamsSubmitted, numberOfExamsStarted, numberOfAllComplaints, numberOfAllComplaintsDone, allExamExercisesAllStudentsPrepared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamChecklistDTO {\n");
    sb.append("    numberOfGeneratedStudentExams: ").append(toIndentedString(numberOfGeneratedStudentExams)).append("\n");
    sb.append("    numberOfTestRuns: ").append(toIndentedString(numberOfTestRuns)).append("\n");
    sb.append("    numberOfTotalExamAssessmentsFinishedByCorrectionRound: ").append(toIndentedString(numberOfTotalExamAssessmentsFinishedByCorrectionRound)).append("\n");
    sb.append("    numberOfTotalParticipationsForAssessment: ").append(toIndentedString(numberOfTotalParticipationsForAssessment)).append("\n");
    sb.append("    numberOfExamsSubmitted: ").append(toIndentedString(numberOfExamsSubmitted)).append("\n");
    sb.append("    numberOfExamsStarted: ").append(toIndentedString(numberOfExamsStarted)).append("\n");
    sb.append("    numberOfAllComplaints: ").append(toIndentedString(numberOfAllComplaints)).append("\n");
    sb.append("    numberOfAllComplaintsDone: ").append(toIndentedString(numberOfAllComplaintsDone)).append("\n");
    sb.append("    allExamExercisesAllStudentsPrepared: ").append(toIndentedString(allExamExercisesAllStudentsPrepared)).append("\n");
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

