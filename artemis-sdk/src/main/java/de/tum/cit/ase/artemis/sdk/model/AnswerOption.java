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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * AnswerOption
 */
@JsonPropertyOrder({
  AnswerOption.JSON_PROPERTY_ID,
  AnswerOption.JSON_PROPERTY_TEXT,
  AnswerOption.JSON_PROPERTY_HINT,
  AnswerOption.JSON_PROPERTY_EXPLANATION,
  AnswerOption.JSON_PROPERTY_IS_CORRECT,
  AnswerOption.JSON_PROPERTY_INVALID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class AnswerOption {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_HINT = "hint";
  private String hint;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_IS_CORRECT = "isCorrect";
  private Boolean isCorrect;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Boolean invalid;

  public AnswerOption() { 
  }

  public AnswerOption id(Long id) {
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


  public AnswerOption text(String text) {
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


  public AnswerOption hint(String hint) {
    this.hint = hint;
    return this;
  }

   /**
   * Get hint
   * @return hint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHint() {
    return hint;
  }


  @JsonProperty(JSON_PROPERTY_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHint(String hint) {
    this.hint = hint;
  }


  public AnswerOption explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExplanation() {
    return explanation;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  public AnswerOption isCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
    return this;
  }

   /**
   * Get isCorrect
   * @return isCorrect
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CORRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCorrect() {
    return isCorrect;
  }


  @JsonProperty(JSON_PROPERTY_IS_CORRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
  }


  public AnswerOption invalid(Boolean invalid) {
    this.invalid = invalid;
    return this;
  }

   /**
   * Get invalid
   * @return invalid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInvalid() {
    return invalid;
  }


  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalid(Boolean invalid) {
    this.invalid = invalid;
  }


  /**
   * Return true if this AnswerOption object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerOption answerOption = (AnswerOption) o;
    return Objects.equals(this.id, answerOption.id) &&
        Objects.equals(this.text, answerOption.text) &&
        Objects.equals(this.hint, answerOption.hint) &&
        Objects.equals(this.explanation, answerOption.explanation) &&
        Objects.equals(this.isCorrect, answerOption.isCorrect) &&
        Objects.equals(this.invalid, answerOption.invalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, hint, explanation, isCorrect, invalid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
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

