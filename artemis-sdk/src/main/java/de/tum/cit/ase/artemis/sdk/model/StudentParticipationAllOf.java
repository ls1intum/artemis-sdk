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
 * StudentParticipationAllOf
 */
@JsonPropertyOrder({
  StudentParticipationAllOf.JSON_PROPERTY_PRESENTATION_SCORE,
  StudentParticipationAllOf.JSON_PROPERTY_STUDENT,
  StudentParticipationAllOf.JSON_PROPERTY_TEAM,
  StudentParticipationAllOf.JSON_PROPERTY_PARTICIPANT_IDENTIFIER,
  StudentParticipationAllOf.JSON_PROPERTY_PARTICIPANT_NAME
})
@JsonTypeName("StudentParticipation_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class StudentParticipationAllOf {
  public static final String JSON_PROPERTY_PRESENTATION_SCORE = "presentationScore";
  private Double presentationScore;

  public static final String JSON_PROPERTY_STUDENT = "student";
  private User student;

  public static final String JSON_PROPERTY_TEAM = "team";
  private Team team;

  public static final String JSON_PROPERTY_PARTICIPANT_IDENTIFIER = "participantIdentifier";
  private String participantIdentifier;

  public static final String JSON_PROPERTY_PARTICIPANT_NAME = "participantName";
  private String participantName;

  public StudentParticipationAllOf() { 
  }

  public StudentParticipationAllOf presentationScore(Double presentationScore) {
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

  public Double getPresentationScore() {
    return presentationScore;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationScore(Double presentationScore) {
    this.presentationScore = presentationScore;
  }


  public StudentParticipationAllOf student(User student) {
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


  public StudentParticipationAllOf team(Team team) {
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


  public StudentParticipationAllOf participantIdentifier(String participantIdentifier) {
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


  public StudentParticipationAllOf participantName(String participantName) {
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
   * Return true if this StudentParticipation_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentParticipationAllOf studentParticipationAllOf = (StudentParticipationAllOf) o;
    return Objects.equals(this.presentationScore, studentParticipationAllOf.presentationScore) &&
        Objects.equals(this.student, studentParticipationAllOf.student) &&
        Objects.equals(this.team, studentParticipationAllOf.team) &&
        Objects.equals(this.participantIdentifier, studentParticipationAllOf.participantIdentifier) &&
        Objects.equals(this.participantName, studentParticipationAllOf.participantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationScore, student, team, participantIdentifier, participantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentParticipationAllOf {\n");
    sb.append("    presentationScore: ").append(toIndentedString(presentationScore)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

