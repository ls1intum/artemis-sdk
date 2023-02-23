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
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Complaint
 */
@JsonPropertyOrder({
  Complaint.JSON_PROPERTY_ID,
  Complaint.JSON_PROPERTY_COMPLAINT_TEXT,
  Complaint.JSON_PROPERTY_ACCEPTED,
  Complaint.JSON_PROPERTY_SUBMITTED_TIME,
  Complaint.JSON_PROPERTY_COMPLAINT_TYPE,
  Complaint.JSON_PROPERTY_RESULT,
  Complaint.JSON_PROPERTY_STUDENT,
  Complaint.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class Complaint {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_COMPLAINT_TEXT = "complaintText";
  private String complaintText;

  public static final String JSON_PROPERTY_ACCEPTED = "accepted";
  private Boolean accepted;

  public static final String JSON_PROPERTY_SUBMITTED_TIME = "submittedTime";
  private OffsetDateTime submittedTime;

  /**
   * Gets or Sets complaintType
   */
  public enum ComplaintTypeEnum {
    COMPLAINT("COMPLAINT"),
    
    MORE_FEEDBACK("MORE_FEEDBACK");

    private String value;

    ComplaintTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComplaintTypeEnum fromValue(String value) {
      for (ComplaintTypeEnum b : ComplaintTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMPLAINT_TYPE = "complaintType";
  private ComplaintTypeEnum complaintType;

  public static final String JSON_PROPERTY_RESULT = "result";
  private Result result;

  public static final String JSON_PROPERTY_STUDENT = "student";
  private User student;

  public static final String JSON_PROPERTY_TEAM = "team";
  private Team team;

  public Complaint() { 
  }

  public Complaint id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public Complaint complaintText(String complaintText) {
    this.complaintText = complaintText;
    return this;
  }

   /**
   * Get complaintText
   * @return complaintText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLAINT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComplaintText() {
    return complaintText;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintText(String complaintText) {
    this.complaintText = complaintText;
  }


  public Complaint accepted(Boolean accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Get accepted
   * @return accepted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAccepted() {
    return accepted;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }


  public Complaint submittedTime(OffsetDateTime submittedTime) {
    this.submittedTime = submittedTime;
    return this;
  }

   /**
   * Get submittedTime
   * @return submittedTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubmittedTime() {
    return submittedTime;
  }


  @JsonProperty(JSON_PROPERTY_SUBMITTED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmittedTime(OffsetDateTime submittedTime) {
    this.submittedTime = submittedTime;
  }


  public Complaint complaintType(ComplaintTypeEnum complaintType) {
    this.complaintType = complaintType;
    return this;
  }

   /**
   * Get complaintType
   * @return complaintType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLAINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComplaintTypeEnum getComplaintType() {
    return complaintType;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintType(ComplaintTypeEnum complaintType) {
    this.complaintType = complaintType;
  }


  public Complaint result(Result result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Result getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(Result result) {
    this.result = result;
  }


  public Complaint student(User student) {
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


  public Complaint team(Team team) {
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


  /**
   * Return true if this Complaint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complaint complaint = (Complaint) o;
    return Objects.equals(this.id, complaint.id) &&
        Objects.equals(this.complaintText, complaint.complaintText) &&
        Objects.equals(this.accepted, complaint.accepted) &&
        Objects.equals(this.submittedTime, complaint.submittedTime) &&
        Objects.equals(this.complaintType, complaint.complaintType) &&
        Objects.equals(this.result, complaint.result) &&
        Objects.equals(this.student, complaint.student) &&
        Objects.equals(this.team, complaint.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complaintText, accepted, submittedTime, complaintType, result, student, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complaint {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complaintText: ").append(toIndentedString(complaintText)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    submittedTime: ").append(toIndentedString(submittedTime)).append("\n");
    sb.append("    complaintType: ").append(toIndentedString(complaintType)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

