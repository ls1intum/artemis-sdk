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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * StudentParticipation
 */
@JsonPropertyOrder({
  StudentParticipation.JSON_PROPERTY_PRESENTATION_SCORE,
  StudentParticipation.JSON_PROPERTY_STUDENT,
  StudentParticipation.JSON_PROPERTY_TEAM,
  StudentParticipation.JSON_PROPERTY_PARTICIPANT_IDENTIFIER,
  StudentParticipation.JSON_PROPERTY_PARTICIPANT_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class StudentParticipation extends Participation {
  public static final String JSON_PROPERTY_PRESENTATION_SCORE = "presentationScore";
  private Integer presentationScore;

  public static final String JSON_PROPERTY_STUDENT = "student";
  private User student;

  public static final String JSON_PROPERTY_TEAM = "team";
  private Team team;

  public static final String JSON_PROPERTY_PARTICIPANT_IDENTIFIER = "participantIdentifier";
  private String participantIdentifier;

  public static final String JSON_PROPERTY_PARTICIPANT_NAME = "participantName";
  private String participantName;

  public StudentParticipation() { 
  }

  public StudentParticipation presentationScore(Integer presentationScore) {
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


  public StudentParticipation student(User student) {
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


  public StudentParticipation team(Team team) {
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


  public StudentParticipation participantIdentifier(String participantIdentifier) {
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


  public StudentParticipation participantName(String participantName) {
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
   * Return true if this StudentParticipation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentParticipation studentParticipation = (StudentParticipation) o;
    return Objects.equals(this.presentationScore, studentParticipation.presentationScore) &&
        Objects.equals(this.student, studentParticipation.student) &&
        Objects.equals(this.team, studentParticipation.team) &&
        Objects.equals(this.participantIdentifier, studentParticipation.participantIdentifier) &&
        Objects.equals(this.participantName, studentParticipation.participantName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationScore, student, team, participantIdentifier, participantName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentParticipation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("StudentParticipation", StudentParticipation.class);
  JSON.registerDiscriminator(StudentParticipation.class, "type", mappings);
}
}

