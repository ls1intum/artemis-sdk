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
import de.tum.cit.ase.artemis.sdk.model.GradingInstruction;
import de.tum.cit.ase.artemis.sdk.model.Result;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Feedback
 */
@JsonPropertyOrder({
  Feedback.JSON_PROPERTY_ID,
  Feedback.JSON_PROPERTY_TEXT,
  Feedback.JSON_PROPERTY_DETAIL_TEXT,
  Feedback.JSON_PROPERTY_HAS_LONG_FEEDBACK_TEXT,
  Feedback.JSON_PROPERTY_REFERENCE,
  Feedback.JSON_PROPERTY_CREDITS,
  Feedback.JSON_PROPERTY_POSITIVE,
  Feedback.JSON_PROPERTY_TYPE,
  Feedback.JSON_PROPERTY_VISIBILITY,
  Feedback.JSON_PROPERTY_RESULT,
  Feedback.JSON_PROPERTY_GRADING_INSTRUCTION,
  Feedback.JSON_PROPERTY_SUGGESTED_FEEDBACK_REFERENCE,
  Feedback.JSON_PROPERTY_SUGGESTED_FEEDBACK_ORIGIN_SUBMISSION_REFERENCE,
  Feedback.JSON_PROPERTY_SUGGESTED_FEEDBACK_PARTICIPATION_REFERENCE,
  Feedback.JSON_PROPERTY_DETAIL_TEXT_TRUNCATED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class Feedback {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_DETAIL_TEXT = "detailText";
  private String detailText;

  public static final String JSON_PROPERTY_HAS_LONG_FEEDBACK_TEXT = "hasLongFeedbackText";
  private Boolean hasLongFeedbackText;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_CREDITS = "credits";
  private Double credits;

  public static final String JSON_PROPERTY_POSITIVE = "positive";
  private Boolean positive;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    MANUAL("MANUAL"),
    
    MANUAL_UNREFERENCED("MANUAL_UNREFERENCED"),
    
    AUTOMATIC_ADAPTED("AUTOMATIC_ADAPTED"),
    
    AUTOMATIC("AUTOMATIC");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    ALWAYS("ALWAYS"),
    
    AFTER_DUE_DATE("AFTER_DUE_DATE"),
    
    NEVER("NEVER");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private VisibilityEnum visibility;

  public static final String JSON_PROPERTY_RESULT = "result";
  private Result result;

  public static final String JSON_PROPERTY_GRADING_INSTRUCTION = "gradingInstruction";
  private GradingInstruction gradingInstruction;

  public static final String JSON_PROPERTY_SUGGESTED_FEEDBACK_REFERENCE = "suggestedFeedbackReference";
  private String suggestedFeedbackReference;

  public static final String JSON_PROPERTY_SUGGESTED_FEEDBACK_ORIGIN_SUBMISSION_REFERENCE = "suggestedFeedbackOriginSubmissionReference";
  private Long suggestedFeedbackOriginSubmissionReference;

  public static final String JSON_PROPERTY_SUGGESTED_FEEDBACK_PARTICIPATION_REFERENCE = "suggestedFeedbackParticipationReference";
  private Long suggestedFeedbackParticipationReference;

  public static final String JSON_PROPERTY_DETAIL_TEXT_TRUNCATED = "detailTextTruncated";
  private String detailTextTruncated;

  public Feedback() { 
  }

  public Feedback id(Long id) {
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


  public Feedback text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public Feedback detailText(String detailText) {
    this.detailText = detailText;
    return this;
  }

   /**
   * Get detailText
   * @return detailText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetailText() {
    return detailText;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailText(String detailText) {
    this.detailText = detailText;
  }


  public Feedback hasLongFeedbackText(Boolean hasLongFeedbackText) {
    this.hasLongFeedbackText = hasLongFeedbackText;
    return this;
  }

   /**
   * Get hasLongFeedbackText
   * @return hasLongFeedbackText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_LONG_FEEDBACK_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasLongFeedbackText() {
    return hasLongFeedbackText;
  }


  @JsonProperty(JSON_PROPERTY_HAS_LONG_FEEDBACK_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasLongFeedbackText(Boolean hasLongFeedbackText) {
    this.hasLongFeedbackText = hasLongFeedbackText;
  }


  public Feedback reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Feedback credits(Double credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCredits() {
    return credits;
  }


  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredits(Double credits) {
    this.credits = credits;
  }


  public Feedback positive(Boolean positive) {
    this.positive = positive;
    return this;
  }

   /**
   * Get positive
   * @return positive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPositive() {
    return positive;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositive(Boolean positive) {
    this.positive = positive;
  }


  public Feedback type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Feedback visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public Feedback result(Result result) {
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


  public Feedback gradingInstruction(GradingInstruction gradingInstruction) {
    this.gradingInstruction = gradingInstruction;
    return this;
  }

   /**
   * Get gradingInstruction
   * @return gradingInstruction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADING_INSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GradingInstruction getGradingInstruction() {
    return gradingInstruction;
  }


  @JsonProperty(JSON_PROPERTY_GRADING_INSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradingInstruction(GradingInstruction gradingInstruction) {
    this.gradingInstruction = gradingInstruction;
  }


  public Feedback suggestedFeedbackReference(String suggestedFeedbackReference) {
    this.suggestedFeedbackReference = suggestedFeedbackReference;
    return this;
  }

   /**
   * Get suggestedFeedbackReference
   * @return suggestedFeedbackReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTED_FEEDBACK_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuggestedFeedbackReference() {
    return suggestedFeedbackReference;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTED_FEEDBACK_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestedFeedbackReference(String suggestedFeedbackReference) {
    this.suggestedFeedbackReference = suggestedFeedbackReference;
  }


  public Feedback suggestedFeedbackOriginSubmissionReference(Long suggestedFeedbackOriginSubmissionReference) {
    this.suggestedFeedbackOriginSubmissionReference = suggestedFeedbackOriginSubmissionReference;
    return this;
  }

   /**
   * Get suggestedFeedbackOriginSubmissionReference
   * @return suggestedFeedbackOriginSubmissionReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTED_FEEDBACK_ORIGIN_SUBMISSION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSuggestedFeedbackOriginSubmissionReference() {
    return suggestedFeedbackOriginSubmissionReference;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTED_FEEDBACK_ORIGIN_SUBMISSION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestedFeedbackOriginSubmissionReference(Long suggestedFeedbackOriginSubmissionReference) {
    this.suggestedFeedbackOriginSubmissionReference = suggestedFeedbackOriginSubmissionReference;
  }


  public Feedback suggestedFeedbackParticipationReference(Long suggestedFeedbackParticipationReference) {
    this.suggestedFeedbackParticipationReference = suggestedFeedbackParticipationReference;
    return this;
  }

   /**
   * Get suggestedFeedbackParticipationReference
   * @return suggestedFeedbackParticipationReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTED_FEEDBACK_PARTICIPATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSuggestedFeedbackParticipationReference() {
    return suggestedFeedbackParticipationReference;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTED_FEEDBACK_PARTICIPATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestedFeedbackParticipationReference(Long suggestedFeedbackParticipationReference) {
    this.suggestedFeedbackParticipationReference = suggestedFeedbackParticipationReference;
  }


  public Feedback detailTextTruncated(String detailTextTruncated) {
    this.detailTextTruncated = detailTextTruncated;
    return this;
  }

   /**
   * Get detailTextTruncated
   * @return detailTextTruncated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL_TEXT_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetailTextTruncated() {
    return detailTextTruncated;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_TEXT_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailTextTruncated(String detailTextTruncated) {
    this.detailTextTruncated = detailTextTruncated;
  }


  /**
   * Return true if this Feedback object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.id, feedback.id) &&
        Objects.equals(this.text, feedback.text) &&
        Objects.equals(this.detailText, feedback.detailText) &&
        Objects.equals(this.hasLongFeedbackText, feedback.hasLongFeedbackText) &&
        Objects.equals(this.reference, feedback.reference) &&
        Objects.equals(this.credits, feedback.credits) &&
        Objects.equals(this.positive, feedback.positive) &&
        Objects.equals(this.type, feedback.type) &&
        Objects.equals(this.visibility, feedback.visibility) &&
        Objects.equals(this.result, feedback.result) &&
        Objects.equals(this.gradingInstruction, feedback.gradingInstruction) &&
        Objects.equals(this.suggestedFeedbackReference, feedback.suggestedFeedbackReference) &&
        Objects.equals(this.suggestedFeedbackOriginSubmissionReference, feedback.suggestedFeedbackOriginSubmissionReference) &&
        Objects.equals(this.suggestedFeedbackParticipationReference, feedback.suggestedFeedbackParticipationReference) &&
        Objects.equals(this.detailTextTruncated, feedback.detailTextTruncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, detailText, hasLongFeedbackText, reference, credits, positive, type, visibility, result, gradingInstruction, suggestedFeedbackReference, suggestedFeedbackOriginSubmissionReference, suggestedFeedbackParticipationReference, detailTextTruncated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    detailText: ").append(toIndentedString(detailText)).append("\n");
    sb.append("    hasLongFeedbackText: ").append(toIndentedString(hasLongFeedbackText)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    gradingInstruction: ").append(toIndentedString(gradingInstruction)).append("\n");
    sb.append("    suggestedFeedbackReference: ").append(toIndentedString(suggestedFeedbackReference)).append("\n");
    sb.append("    suggestedFeedbackOriginSubmissionReference: ").append(toIndentedString(suggestedFeedbackOriginSubmissionReference)).append("\n");
    sb.append("    suggestedFeedbackParticipationReference: ").append(toIndentedString(suggestedFeedbackParticipationReference)).append("\n");
    sb.append("    detailTextTruncated: ").append(toIndentedString(detailTextTruncated)).append("\n");
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

