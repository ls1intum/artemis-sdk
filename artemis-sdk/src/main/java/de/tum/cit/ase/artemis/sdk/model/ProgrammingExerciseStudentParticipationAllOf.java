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
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ProgrammingExerciseStudentParticipationAllOf
 */
@JsonPropertyOrder({
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_PRESENTATION_SCORE,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_STUDENT,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_TEAM,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_REPOSITORY_URL,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_BUILD_PLAN_ID,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_BRANCH,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_PARTICIPANT_IDENTIFIER,
  ProgrammingExerciseStudentParticipationAllOf.JSON_PROPERTY_PARTICIPANT_NAME
})
@JsonTypeName("ProgrammingExerciseStudentParticipation_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class ProgrammingExerciseStudentParticipationAllOf {
  public static final String JSON_PROPERTY_PRESENTATION_SCORE = "presentationScore";
  private Integer presentationScore;

  public static final String JSON_PROPERTY_STUDENT = "student";
  private User student;

  public static final String JSON_PROPERTY_TEAM = "team";
  private Team team;

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repositoryUrl";
  private String repositoryUrl;

  public static final String JSON_PROPERTY_BUILD_PLAN_ID = "buildPlanId";
  private String buildPlanId;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL = "userIndependentRepositoryUrl";
  private String userIndependentRepositoryUrl;

  public static final String JSON_PROPERTY_PARTICIPANT_IDENTIFIER = "participantIdentifier";
  private String participantIdentifier;

  public static final String JSON_PROPERTY_PARTICIPANT_NAME = "participantName";
  private String participantName;

  public ProgrammingExerciseStudentParticipationAllOf() { 
  }

  public ProgrammingExerciseStudentParticipationAllOf presentationScore(Integer presentationScore) {
    this.presentationScore = presentationScore;
    return this;
  }

   /**
   * Get presentationScore
   * @return presentationScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPresentationScore() {
    return presentationScore;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationScore(Integer presentationScore) {
    this.presentationScore = presentationScore;
  }


  public ProgrammingExerciseStudentParticipationAllOf student(User student) {
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getStudent() {
    return student;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudent(User student) {
    this.student = student;
  }


  public ProgrammingExerciseStudentParticipationAllOf team(Team team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Team getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeam(Team team) {
    this.team = team;
  }


  public ProgrammingExerciseStudentParticipationAllOf repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepositoryUrl() {
    return repositoryUrl;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public ProgrammingExerciseStudentParticipationAllOf buildPlanId(String buildPlanId) {
    this.buildPlanId = buildPlanId;
    return this;
  }

   /**
   * Get buildPlanId
   * @return buildPlanId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildPlanId() {
    return buildPlanId;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildPlanId(String buildPlanId) {
    this.buildPlanId = buildPlanId;
  }


  public ProgrammingExerciseStudentParticipationAllOf branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranch(String branch) {
    this.branch = branch;
  }


  public ProgrammingExerciseStudentParticipationAllOf userIndependentRepositoryUrl(String userIndependentRepositoryUrl) {
    this.userIndependentRepositoryUrl = userIndependentRepositoryUrl;
    return this;
  }

   /**
   * Get userIndependentRepositoryUrl
   * @return userIndependentRepositoryUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserIndependentRepositoryUrl() {
    return userIndependentRepositoryUrl;
  }


  @JsonProperty(JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIndependentRepositoryUrl(String userIndependentRepositoryUrl) {
    this.userIndependentRepositoryUrl = userIndependentRepositoryUrl;
  }


  public ProgrammingExerciseStudentParticipationAllOf participantIdentifier(String participantIdentifier) {
    this.participantIdentifier = participantIdentifier;
    return this;
  }

   /**
   * Get participantIdentifier
   * @return participantIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParticipantIdentifier() {
    return participantIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantIdentifier(String participantIdentifier) {
    this.participantIdentifier = participantIdentifier;
  }


  public ProgrammingExerciseStudentParticipationAllOf participantName(String participantName) {
    this.participantName = participantName;
    return this;
  }

   /**
   * Get participantName
   * @return participantName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParticipantName() {
    return participantName;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }


  /**
   * Return true if this ProgrammingExerciseStudentParticipation_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseStudentParticipationAllOf programmingExerciseStudentParticipationAllOf = (ProgrammingExerciseStudentParticipationAllOf) o;
    return Objects.equals(this.presentationScore, programmingExerciseStudentParticipationAllOf.presentationScore) &&
        Objects.equals(this.student, programmingExerciseStudentParticipationAllOf.student) &&
        Objects.equals(this.team, programmingExerciseStudentParticipationAllOf.team) &&
        Objects.equals(this.repositoryUrl, programmingExerciseStudentParticipationAllOf.repositoryUrl) &&
        Objects.equals(this.buildPlanId, programmingExerciseStudentParticipationAllOf.buildPlanId) &&
        Objects.equals(this.branch, programmingExerciseStudentParticipationAllOf.branch) &&
        Objects.equals(this.userIndependentRepositoryUrl, programmingExerciseStudentParticipationAllOf.userIndependentRepositoryUrl) &&
        Objects.equals(this.participantIdentifier, programmingExerciseStudentParticipationAllOf.participantIdentifier) &&
        Objects.equals(this.participantName, programmingExerciseStudentParticipationAllOf.participantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationScore, student, team, repositoryUrl, buildPlanId, branch, userIndependentRepositoryUrl, participantIdentifier, participantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseStudentParticipationAllOf {\n");
    sb.append("    presentationScore: ").append(toIndentedString(presentationScore)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    buildPlanId: ").append(toIndentedString(buildPlanId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    userIndependentRepositoryUrl: ").append(toIndentedString(userIndependentRepositoryUrl)).append("\n");
    sb.append("    participantIdentifier: ").append(toIndentedString(participantIdentifier)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
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

