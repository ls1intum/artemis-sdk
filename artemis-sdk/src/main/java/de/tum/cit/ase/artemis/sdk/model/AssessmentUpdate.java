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
import de.tum.cit.ase.artemis.sdk.model.ComplaintResponse;
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * AssessmentUpdate
 */
@JsonPropertyOrder({
  AssessmentUpdate.JSON_PROPERTY_FEEDBACKS,
  AssessmentUpdate.JSON_PROPERTY_COMPLAINT_RESPONSE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class AssessmentUpdate {
  public static final String JSON_PROPERTY_FEEDBACKS = "feedbacks";
  private List<Feedback> feedbacks;

  public static final String JSON_PROPERTY_COMPLAINT_RESPONSE = "complaintResponse";
  private ComplaintResponse complaintResponse;

  public AssessmentUpdate() { 
  }

  public AssessmentUpdate feedbacks(List<Feedback> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  public AssessmentUpdate addFeedbacksItem(Feedback feedbacksItem) {
    if (this.feedbacks == null) {
      this.feedbacks = new ArrayList<>();
    }
    this.feedbacks.add(feedbacksItem);
    return this;
  }

   /**
   * Get feedbacks
   * @return feedbacks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Feedback> getFeedbacks() {
    return feedbacks;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbacks(List<Feedback> feedbacks) {
    this.feedbacks = feedbacks;
  }


  public AssessmentUpdate complaintResponse(ComplaintResponse complaintResponse) {
    this.complaintResponse = complaintResponse;
    return this;
  }

   /**
   * Get complaintResponse
   * @return complaintResponse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLAINT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComplaintResponse getComplaintResponse() {
    return complaintResponse;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintResponse(ComplaintResponse complaintResponse) {
    this.complaintResponse = complaintResponse;
  }


  /**
   * Return true if this AssessmentUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentUpdate assessmentUpdate = (AssessmentUpdate) o;
    return Objects.equals(this.feedbacks, assessmentUpdate.feedbacks) &&
        Objects.equals(this.complaintResponse, assessmentUpdate.complaintResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbacks, complaintResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentUpdate {\n");
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
    sb.append("    complaintResponse: ").append(toIndentedString(complaintResponse)).append("\n");
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

