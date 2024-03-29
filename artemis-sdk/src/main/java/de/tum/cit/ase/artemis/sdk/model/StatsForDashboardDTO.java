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
import de.tum.cit.ase.artemis.sdk.model.DueDateStat;
import de.tum.cit.ase.artemis.sdk.model.TutorLeaderboardDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * StatsForDashboardDTO
 */
@JsonPropertyOrder({
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_STUDENTS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_SUBMISSIONS,
  StatsForDashboardDTO.JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENTS,
  StatsForDashboardDTO.JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENT_LOCKS,
  StatsForDashboardDTO.JSON_PROPERTY_COMPLAINTS_ENABLED,
  StatsForDashboardDTO.JSON_PROPERTY_FEEDBACK_REQUEST_ENABLED,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_ASSESSMENTS_OF_CORRECTION_ROUNDS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_LOCKED_ASSESSMENT_BY_OTHER_TUTORS_OF_CORRECTION_ROUND,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_AUTOMATIC_ASSISTED_ASSESSMENTS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_COMPLAINTS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_OPEN_COMPLAINTS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_MORE_FEEDBACK_REQUESTS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_OPEN_MORE_FEEDBACK_REQUESTS,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_ASSESSMENT_LOCKS,
  StatsForDashboardDTO.JSON_PROPERTY_TUTOR_LEADERBOARD_ENTRIES,
  StatsForDashboardDTO.JSON_PROPERTY_NUMBER_OF_RATINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class StatsForDashboardDTO {
  public static final String JSON_PROPERTY_NUMBER_OF_STUDENTS = "numberOfStudents";
  private Long numberOfStudents;

  public static final String JSON_PROPERTY_NUMBER_OF_SUBMISSIONS = "numberOfSubmissions";
  private DueDateStat numberOfSubmissions;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENTS = "totalNumberOfAssessments";
  private DueDateStat totalNumberOfAssessments;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENT_LOCKS = "totalNumberOfAssessmentLocks";
  private Long totalNumberOfAssessmentLocks;

  public static final String JSON_PROPERTY_COMPLAINTS_ENABLED = "complaintsEnabled";
  private Boolean complaintsEnabled;

  public static final String JSON_PROPERTY_FEEDBACK_REQUEST_ENABLED = "feedbackRequestEnabled";
  private Boolean feedbackRequestEnabled;

  public static final String JSON_PROPERTY_NUMBER_OF_ASSESSMENTS_OF_CORRECTION_ROUNDS = "numberOfAssessmentsOfCorrectionRounds";
  private List<DueDateStat> numberOfAssessmentsOfCorrectionRounds;

  public static final String JSON_PROPERTY_NUMBER_OF_LOCKED_ASSESSMENT_BY_OTHER_TUTORS_OF_CORRECTION_ROUND = "numberOfLockedAssessmentByOtherTutorsOfCorrectionRound";
  private List<DueDateStat> numberOfLockedAssessmentByOtherTutorsOfCorrectionRound;

  public static final String JSON_PROPERTY_NUMBER_OF_AUTOMATIC_ASSISTED_ASSESSMENTS = "numberOfAutomaticAssistedAssessments";
  private DueDateStat numberOfAutomaticAssistedAssessments;

  public static final String JSON_PROPERTY_NUMBER_OF_COMPLAINTS = "numberOfComplaints";
  private Long numberOfComplaints;

  public static final String JSON_PROPERTY_NUMBER_OF_OPEN_COMPLAINTS = "numberOfOpenComplaints";
  private Long numberOfOpenComplaints;

  public static final String JSON_PROPERTY_NUMBER_OF_MORE_FEEDBACK_REQUESTS = "numberOfMoreFeedbackRequests";
  private Long numberOfMoreFeedbackRequests;

  public static final String JSON_PROPERTY_NUMBER_OF_OPEN_MORE_FEEDBACK_REQUESTS = "numberOfOpenMoreFeedbackRequests";
  private Long numberOfOpenMoreFeedbackRequests;

  public static final String JSON_PROPERTY_NUMBER_OF_ASSESSMENT_LOCKS = "numberOfAssessmentLocks";
  private Long numberOfAssessmentLocks;

  public static final String JSON_PROPERTY_TUTOR_LEADERBOARD_ENTRIES = "tutorLeaderboardEntries";
  private List<TutorLeaderboardDTO> tutorLeaderboardEntries;

  public static final String JSON_PROPERTY_NUMBER_OF_RATINGS = "numberOfRatings";
  private Long numberOfRatings;

  public StatsForDashboardDTO() { 
  }

  public StatsForDashboardDTO numberOfStudents(Long numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
    return this;
  }

   /**
   * Get numberOfStudents
   * @return numberOfStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfStudents() {
    return numberOfStudents;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfStudents(Long numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }


  public StatsForDashboardDTO numberOfSubmissions(DueDateStat numberOfSubmissions) {
    this.numberOfSubmissions = numberOfSubmissions;
    return this;
  }

   /**
   * Get numberOfSubmissions
   * @return numberOfSubmissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DueDateStat getNumberOfSubmissions() {
    return numberOfSubmissions;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfSubmissions(DueDateStat numberOfSubmissions) {
    this.numberOfSubmissions = numberOfSubmissions;
  }


  public StatsForDashboardDTO totalNumberOfAssessments(DueDateStat totalNumberOfAssessments) {
    this.totalNumberOfAssessments = totalNumberOfAssessments;
    return this;
  }

   /**
   * Get totalNumberOfAssessments
   * @return totalNumberOfAssessments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DueDateStat getTotalNumberOfAssessments() {
    return totalNumberOfAssessments;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumberOfAssessments(DueDateStat totalNumberOfAssessments) {
    this.totalNumberOfAssessments = totalNumberOfAssessments;
  }


  public StatsForDashboardDTO totalNumberOfAssessmentLocks(Long totalNumberOfAssessmentLocks) {
    this.totalNumberOfAssessmentLocks = totalNumberOfAssessmentLocks;
    return this;
  }

   /**
   * Get totalNumberOfAssessmentLocks
   * @return totalNumberOfAssessmentLocks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENT_LOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalNumberOfAssessmentLocks() {
    return totalNumberOfAssessmentLocks;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_ASSESSMENT_LOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumberOfAssessmentLocks(Long totalNumberOfAssessmentLocks) {
    this.totalNumberOfAssessmentLocks = totalNumberOfAssessmentLocks;
  }


  public StatsForDashboardDTO complaintsEnabled(Boolean complaintsEnabled) {
    this.complaintsEnabled = complaintsEnabled;
    return this;
  }

   /**
   * Get complaintsEnabled
   * @return complaintsEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLAINTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComplaintsEnabled() {
    return complaintsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintsEnabled(Boolean complaintsEnabled) {
    this.complaintsEnabled = complaintsEnabled;
  }


  public StatsForDashboardDTO feedbackRequestEnabled(Boolean feedbackRequestEnabled) {
    this.feedbackRequestEnabled = feedbackRequestEnabled;
    return this;
  }

   /**
   * Get feedbackRequestEnabled
   * @return feedbackRequestEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_REQUEST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFeedbackRequestEnabled() {
    return feedbackRequestEnabled;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_REQUEST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackRequestEnabled(Boolean feedbackRequestEnabled) {
    this.feedbackRequestEnabled = feedbackRequestEnabled;
  }


  public StatsForDashboardDTO numberOfAssessmentsOfCorrectionRounds(List<DueDateStat> numberOfAssessmentsOfCorrectionRounds) {
    this.numberOfAssessmentsOfCorrectionRounds = numberOfAssessmentsOfCorrectionRounds;
    return this;
  }

  public StatsForDashboardDTO addNumberOfAssessmentsOfCorrectionRoundsItem(DueDateStat numberOfAssessmentsOfCorrectionRoundsItem) {
    if (this.numberOfAssessmentsOfCorrectionRounds == null) {
      this.numberOfAssessmentsOfCorrectionRounds = new ArrayList<>();
    }
    this.numberOfAssessmentsOfCorrectionRounds.add(numberOfAssessmentsOfCorrectionRoundsItem);
    return this;
  }

   /**
   * Get numberOfAssessmentsOfCorrectionRounds
   * @return numberOfAssessmentsOfCorrectionRounds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ASSESSMENTS_OF_CORRECTION_ROUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DueDateStat> getNumberOfAssessmentsOfCorrectionRounds() {
    return numberOfAssessmentsOfCorrectionRounds;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ASSESSMENTS_OF_CORRECTION_ROUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAssessmentsOfCorrectionRounds(List<DueDateStat> numberOfAssessmentsOfCorrectionRounds) {
    this.numberOfAssessmentsOfCorrectionRounds = numberOfAssessmentsOfCorrectionRounds;
  }


  public StatsForDashboardDTO numberOfLockedAssessmentByOtherTutorsOfCorrectionRound(List<DueDateStat> numberOfLockedAssessmentByOtherTutorsOfCorrectionRound) {
    this.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound = numberOfLockedAssessmentByOtherTutorsOfCorrectionRound;
    return this;
  }

  public StatsForDashboardDTO addNumberOfLockedAssessmentByOtherTutorsOfCorrectionRoundItem(DueDateStat numberOfLockedAssessmentByOtherTutorsOfCorrectionRoundItem) {
    if (this.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound == null) {
      this.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound = new ArrayList<>();
    }
    this.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound.add(numberOfLockedAssessmentByOtherTutorsOfCorrectionRoundItem);
    return this;
  }

   /**
   * Get numberOfLockedAssessmentByOtherTutorsOfCorrectionRound
   * @return numberOfLockedAssessmentByOtherTutorsOfCorrectionRound
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_LOCKED_ASSESSMENT_BY_OTHER_TUTORS_OF_CORRECTION_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DueDateStat> getNumberOfLockedAssessmentByOtherTutorsOfCorrectionRound() {
    return numberOfLockedAssessmentByOtherTutorsOfCorrectionRound;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_LOCKED_ASSESSMENT_BY_OTHER_TUTORS_OF_CORRECTION_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfLockedAssessmentByOtherTutorsOfCorrectionRound(List<DueDateStat> numberOfLockedAssessmentByOtherTutorsOfCorrectionRound) {
    this.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound = numberOfLockedAssessmentByOtherTutorsOfCorrectionRound;
  }


  public StatsForDashboardDTO numberOfAutomaticAssistedAssessments(DueDateStat numberOfAutomaticAssistedAssessments) {
    this.numberOfAutomaticAssistedAssessments = numberOfAutomaticAssistedAssessments;
    return this;
  }

   /**
   * Get numberOfAutomaticAssistedAssessments
   * @return numberOfAutomaticAssistedAssessments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_AUTOMATIC_ASSISTED_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DueDateStat getNumberOfAutomaticAssistedAssessments() {
    return numberOfAutomaticAssistedAssessments;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_AUTOMATIC_ASSISTED_ASSESSMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAutomaticAssistedAssessments(DueDateStat numberOfAutomaticAssistedAssessments) {
    this.numberOfAutomaticAssistedAssessments = numberOfAutomaticAssistedAssessments;
  }


  public StatsForDashboardDTO numberOfComplaints(Long numberOfComplaints) {
    this.numberOfComplaints = numberOfComplaints;
    return this;
  }

   /**
   * Get numberOfComplaints
   * @return numberOfComplaints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfComplaints() {
    return numberOfComplaints;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfComplaints(Long numberOfComplaints) {
    this.numberOfComplaints = numberOfComplaints;
  }


  public StatsForDashboardDTO numberOfOpenComplaints(Long numberOfOpenComplaints) {
    this.numberOfOpenComplaints = numberOfOpenComplaints;
    return this;
  }

   /**
   * Get numberOfOpenComplaints
   * @return numberOfOpenComplaints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_OPEN_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfOpenComplaints() {
    return numberOfOpenComplaints;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_OPEN_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfOpenComplaints(Long numberOfOpenComplaints) {
    this.numberOfOpenComplaints = numberOfOpenComplaints;
  }


  public StatsForDashboardDTO numberOfMoreFeedbackRequests(Long numberOfMoreFeedbackRequests) {
    this.numberOfMoreFeedbackRequests = numberOfMoreFeedbackRequests;
    return this;
  }

   /**
   * Get numberOfMoreFeedbackRequests
   * @return numberOfMoreFeedbackRequests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MORE_FEEDBACK_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfMoreFeedbackRequests() {
    return numberOfMoreFeedbackRequests;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MORE_FEEDBACK_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfMoreFeedbackRequests(Long numberOfMoreFeedbackRequests) {
    this.numberOfMoreFeedbackRequests = numberOfMoreFeedbackRequests;
  }


  public StatsForDashboardDTO numberOfOpenMoreFeedbackRequests(Long numberOfOpenMoreFeedbackRequests) {
    this.numberOfOpenMoreFeedbackRequests = numberOfOpenMoreFeedbackRequests;
    return this;
  }

   /**
   * Get numberOfOpenMoreFeedbackRequests
   * @return numberOfOpenMoreFeedbackRequests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_OPEN_MORE_FEEDBACK_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfOpenMoreFeedbackRequests() {
    return numberOfOpenMoreFeedbackRequests;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_OPEN_MORE_FEEDBACK_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfOpenMoreFeedbackRequests(Long numberOfOpenMoreFeedbackRequests) {
    this.numberOfOpenMoreFeedbackRequests = numberOfOpenMoreFeedbackRequests;
  }


  public StatsForDashboardDTO numberOfAssessmentLocks(Long numberOfAssessmentLocks) {
    this.numberOfAssessmentLocks = numberOfAssessmentLocks;
    return this;
  }

   /**
   * Get numberOfAssessmentLocks
   * @return numberOfAssessmentLocks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ASSESSMENT_LOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfAssessmentLocks() {
    return numberOfAssessmentLocks;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ASSESSMENT_LOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAssessmentLocks(Long numberOfAssessmentLocks) {
    this.numberOfAssessmentLocks = numberOfAssessmentLocks;
  }


  public StatsForDashboardDTO tutorLeaderboardEntries(List<TutorLeaderboardDTO> tutorLeaderboardEntries) {
    this.tutorLeaderboardEntries = tutorLeaderboardEntries;
    return this;
  }

  public StatsForDashboardDTO addTutorLeaderboardEntriesItem(TutorLeaderboardDTO tutorLeaderboardEntriesItem) {
    if (this.tutorLeaderboardEntries == null) {
      this.tutorLeaderboardEntries = new ArrayList<>();
    }
    this.tutorLeaderboardEntries.add(tutorLeaderboardEntriesItem);
    return this;
  }

   /**
   * Get tutorLeaderboardEntries
   * @return tutorLeaderboardEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTOR_LEADERBOARD_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TutorLeaderboardDTO> getTutorLeaderboardEntries() {
    return tutorLeaderboardEntries;
  }


  @JsonProperty(JSON_PROPERTY_TUTOR_LEADERBOARD_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorLeaderboardEntries(List<TutorLeaderboardDTO> tutorLeaderboardEntries) {
    this.tutorLeaderboardEntries = tutorLeaderboardEntries;
  }


  public StatsForDashboardDTO numberOfRatings(Long numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

   /**
   * Get numberOfRatings
   * @return numberOfRatings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfRatings() {
    return numberOfRatings;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfRatings(Long numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }


  /**
   * Return true if this StatsForDashboardDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsForDashboardDTO statsForDashboardDTO = (StatsForDashboardDTO) o;
    return Objects.equals(this.numberOfStudents, statsForDashboardDTO.numberOfStudents) &&
        Objects.equals(this.numberOfSubmissions, statsForDashboardDTO.numberOfSubmissions) &&
        Objects.equals(this.totalNumberOfAssessments, statsForDashboardDTO.totalNumberOfAssessments) &&
        Objects.equals(this.totalNumberOfAssessmentLocks, statsForDashboardDTO.totalNumberOfAssessmentLocks) &&
        Objects.equals(this.complaintsEnabled, statsForDashboardDTO.complaintsEnabled) &&
        Objects.equals(this.feedbackRequestEnabled, statsForDashboardDTO.feedbackRequestEnabled) &&
        Objects.equals(this.numberOfAssessmentsOfCorrectionRounds, statsForDashboardDTO.numberOfAssessmentsOfCorrectionRounds) &&
        Objects.equals(this.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound, statsForDashboardDTO.numberOfLockedAssessmentByOtherTutorsOfCorrectionRound) &&
        Objects.equals(this.numberOfAutomaticAssistedAssessments, statsForDashboardDTO.numberOfAutomaticAssistedAssessments) &&
        Objects.equals(this.numberOfComplaints, statsForDashboardDTO.numberOfComplaints) &&
        Objects.equals(this.numberOfOpenComplaints, statsForDashboardDTO.numberOfOpenComplaints) &&
        Objects.equals(this.numberOfMoreFeedbackRequests, statsForDashboardDTO.numberOfMoreFeedbackRequests) &&
        Objects.equals(this.numberOfOpenMoreFeedbackRequests, statsForDashboardDTO.numberOfOpenMoreFeedbackRequests) &&
        Objects.equals(this.numberOfAssessmentLocks, statsForDashboardDTO.numberOfAssessmentLocks) &&
        Objects.equals(this.tutorLeaderboardEntries, statsForDashboardDTO.tutorLeaderboardEntries) &&
        Objects.equals(this.numberOfRatings, statsForDashboardDTO.numberOfRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfStudents, numberOfSubmissions, totalNumberOfAssessments, totalNumberOfAssessmentLocks, complaintsEnabled, feedbackRequestEnabled, numberOfAssessmentsOfCorrectionRounds, numberOfLockedAssessmentByOtherTutorsOfCorrectionRound, numberOfAutomaticAssistedAssessments, numberOfComplaints, numberOfOpenComplaints, numberOfMoreFeedbackRequests, numberOfOpenMoreFeedbackRequests, numberOfAssessmentLocks, tutorLeaderboardEntries, numberOfRatings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsForDashboardDTO {\n");
    sb.append("    numberOfStudents: ").append(toIndentedString(numberOfStudents)).append("\n");
    sb.append("    numberOfSubmissions: ").append(toIndentedString(numberOfSubmissions)).append("\n");
    sb.append("    totalNumberOfAssessments: ").append(toIndentedString(totalNumberOfAssessments)).append("\n");
    sb.append("    totalNumberOfAssessmentLocks: ").append(toIndentedString(totalNumberOfAssessmentLocks)).append("\n");
    sb.append("    complaintsEnabled: ").append(toIndentedString(complaintsEnabled)).append("\n");
    sb.append("    feedbackRequestEnabled: ").append(toIndentedString(feedbackRequestEnabled)).append("\n");
    sb.append("    numberOfAssessmentsOfCorrectionRounds: ").append(toIndentedString(numberOfAssessmentsOfCorrectionRounds)).append("\n");
    sb.append("    numberOfLockedAssessmentByOtherTutorsOfCorrectionRound: ").append(toIndentedString(numberOfLockedAssessmentByOtherTutorsOfCorrectionRound)).append("\n");
    sb.append("    numberOfAutomaticAssistedAssessments: ").append(toIndentedString(numberOfAutomaticAssistedAssessments)).append("\n");
    sb.append("    numberOfComplaints: ").append(toIndentedString(numberOfComplaints)).append("\n");
    sb.append("    numberOfOpenComplaints: ").append(toIndentedString(numberOfOpenComplaints)).append("\n");
    sb.append("    numberOfMoreFeedbackRequests: ").append(toIndentedString(numberOfMoreFeedbackRequests)).append("\n");
    sb.append("    numberOfOpenMoreFeedbackRequests: ").append(toIndentedString(numberOfOpenMoreFeedbackRequests)).append("\n");
    sb.append("    numberOfAssessmentLocks: ").append(toIndentedString(numberOfAssessmentLocks)).append("\n");
    sb.append("    tutorLeaderboardEntries: ").append(toIndentedString(tutorLeaderboardEntries)).append("\n");
    sb.append("    numberOfRatings: ").append(toIndentedString(numberOfRatings)).append("\n");
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

