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
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import de.tum.cit.ase.artemis.sdk.model.TextBlock;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TextAssessmentDTO
 */
@JsonPropertyOrder({
  TextAssessmentDTO.JSON_PROPERTY_TEXT_BLOCKS,
  TextAssessmentDTO.JSON_PROPERTY_FEEDBACKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class TextAssessmentDTO {
  public static final String JSON_PROPERTY_TEXT_BLOCKS = "textBlocks";
  private Set<TextBlock> textBlocks;

  public static final String JSON_PROPERTY_FEEDBACKS = "feedbacks";
  private List<Feedback> feedbacks;

  public TextAssessmentDTO() { 
  }

  public TextAssessmentDTO textBlocks(Set<TextBlock> textBlocks) {
    this.textBlocks = textBlocks;
    return this;
  }

  public TextAssessmentDTO addTextBlocksItem(TextBlock textBlocksItem) {
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


  public TextAssessmentDTO feedbacks(List<Feedback> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  public TextAssessmentDTO addFeedbacksItem(Feedback feedbacksItem) {
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


  /**
   * Return true if this TextAssessmentDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAssessmentDTO textAssessmentDTO = (TextAssessmentDTO) o;
    return Objects.equals(this.textBlocks, textAssessmentDTO.textBlocks) &&
        Objects.equals(this.feedbacks, textAssessmentDTO.feedbacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textBlocks, feedbacks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAssessmentDTO {\n");
    sb.append("    textBlocks: ").append(toIndentedString(textBlocks)).append("\n");
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
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

