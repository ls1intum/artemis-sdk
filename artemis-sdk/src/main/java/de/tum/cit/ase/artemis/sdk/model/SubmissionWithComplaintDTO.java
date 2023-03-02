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
import de.tum.cit.ase.artemis.sdk.model.Complaint;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SubmissionWithComplaintDTO
 */
@JsonPropertyOrder({
  SubmissionWithComplaintDTO.JSON_PROPERTY_SUBMISSION,
  SubmissionWithComplaintDTO.JSON_PROPERTY_COMPLAINT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class SubmissionWithComplaintDTO {
  public static final String JSON_PROPERTY_SUBMISSION = "submission";
  private GetAllTextSubmissions200ResponseInner submission;

  public static final String JSON_PROPERTY_COMPLAINT = "complaint";
  private Complaint complaint;

  public SubmissionWithComplaintDTO() { 
  }

  public SubmissionWithComplaintDTO submission(GetAllTextSubmissions200ResponseInner submission) {
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllTextSubmissions200ResponseInner getSubmission() {
    return submission;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmission(GetAllTextSubmissions200ResponseInner submission) {
    this.submission = submission;
  }


  public SubmissionWithComplaintDTO complaint(Complaint complaint) {
    this.complaint = complaint;
    return this;
  }

   /**
   * Get complaint
   * @return complaint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Complaint getComplaint() {
    return complaint;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaint(Complaint complaint) {
    this.complaint = complaint;
  }


  /**
   * Return true if this SubmissionWithComplaintDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionWithComplaintDTO submissionWithComplaintDTO = (SubmissionWithComplaintDTO) o;
    return Objects.equals(this.submission, submissionWithComplaintDTO.submission) &&
        Objects.equals(this.complaint, submissionWithComplaintDTO.complaint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submission, complaint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionWithComplaintDTO {\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    complaint: ").append(toIndentedString(complaint)).append("\n");
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

