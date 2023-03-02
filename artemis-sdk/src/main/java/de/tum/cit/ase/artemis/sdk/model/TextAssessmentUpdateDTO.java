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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.ComplaintResponse;
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import de.tum.cit.ase.artemis.sdk.model.TextBlock;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TextAssessmentUpdateDTO
 */
@JsonPropertyOrder({
  TextAssessmentUpdateDTO.JSON_PROPERTY_FEEDBACKS,
  TextAssessmentUpdateDTO.JSON_PROPERTY_COMPLAINT_RESPONSE,
  TextAssessmentUpdateDTO.JSON_PROPERTY_TEXT_BLOCKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class TextAssessmentUpdateDTO {
  public static final String JSON_PROPERTY_FEEDBACKS = "feedbacks";
  private List<Feedback> feedbacks = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPLAINT_RESPONSE = "complaintResponse";
  private ComplaintResponse complaintResponse;

  public static final String JSON_PROPERTY_TEXT_BLOCKS = "textBlocks";
  private Set<TextBlock> textBlocks = new LinkedHashSet<>();

  public TextAssessmentUpdateDTO() { 
  }

  public TextAssessmentUpdateDTO feedbacks(List<Feedback> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  public TextAssessmentUpdateDTO addFeedbacksItem(Feedback feedbacksItem) {
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


  public TextAssessmentUpdateDTO complaintResponse(ComplaintResponse complaintResponse) {
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


  public TextAssessmentUpdateDTO textBlocks(Set<TextBlock> textBlocks) {
    this.textBlocks = textBlocks;
    return this;
  }

  public TextAssessmentUpdateDTO addTextBlocksItem(TextBlock textBlocksItem) {
    if (this.textBlocks == null) {
      this.textBlocks = new LinkedHashSet<>();
    }
    this.textBlocks.add(textBlocksItem);
    return this;
  }

   /**
   * Get textBlocks
   * @return textBlocks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_BLOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TextBlock> getTextBlocks() {
    return textBlocks;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TEXT_BLOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextBlocks(Set<TextBlock> textBlocks) {
    this.textBlocks = textBlocks;
  }


  /**
   * Return true if this TextAssessmentUpdateDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAssessmentUpdateDTO textAssessmentUpdateDTO = (TextAssessmentUpdateDTO) o;
    return Objects.equals(this.feedbacks, textAssessmentUpdateDTO.feedbacks) &&
        Objects.equals(this.complaintResponse, textAssessmentUpdateDTO.complaintResponse) &&
        Objects.equals(this.textBlocks, textAssessmentUpdateDTO.textBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbacks, complaintResponse, textBlocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAssessmentUpdateDTO {\n");
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
    sb.append("    complaintResponse: ").append(toIndentedString(complaintResponse)).append("\n");
    sb.append("    textBlocks: ").append(toIndentedString(textBlocks)).append("\n");
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

