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
import de.tum.cit.ase.artemis.sdk.model.AnswerOption;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * MultipleChoiceQuestionAllOf
 */
@JsonPropertyOrder({
  MultipleChoiceQuestionAllOf.JSON_PROPERTY_ANSWER_OPTIONS,
  MultipleChoiceQuestionAllOf.JSON_PROPERTY_SINGLE_CHOICE
})
@JsonTypeName("MultipleChoiceQuestion_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class MultipleChoiceQuestionAllOf {
  public static final String JSON_PROPERTY_ANSWER_OPTIONS = "answerOptions";
  private List<AnswerOption> answerOptions;

  public static final String JSON_PROPERTY_SINGLE_CHOICE = "singleChoice";
  private Boolean singleChoice;

  public MultipleChoiceQuestionAllOf() { 
  }

  public MultipleChoiceQuestionAllOf answerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
    return this;
  }

  public MultipleChoiceQuestionAllOf addAnswerOptionsItem(AnswerOption answerOptionsItem) {
    if (this.answerOptions == null) {
      this.answerOptions = new ArrayList<>();
    }
    this.answerOptions.add(answerOptionsItem);
    return this;
  }

   /**
   * Get answerOptions
   * @return answerOptions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AnswerOption> getAnswerOptions() {
    return answerOptions;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
  }


  public MultipleChoiceQuestionAllOf singleChoice(Boolean singleChoice) {
    this.singleChoice = singleChoice;
    return this;
  }

   /**
   * Get singleChoice
   * @return singleChoice
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINGLE_CHOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSingleChoice() {
    return singleChoice;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_CHOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleChoice(Boolean singleChoice) {
    this.singleChoice = singleChoice;
  }


  /**
   * Return true if this MultipleChoiceQuestion_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleChoiceQuestionAllOf multipleChoiceQuestionAllOf = (MultipleChoiceQuestionAllOf) o;
    return Objects.equals(this.answerOptions, multipleChoiceQuestionAllOf.answerOptions) &&
        Objects.equals(this.singleChoice, multipleChoiceQuestionAllOf.singleChoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerOptions, singleChoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleChoiceQuestionAllOf {\n");
    sb.append("    answerOptions: ").append(toIndentedString(answerOptions)).append("\n");
    sb.append("    singleChoice: ").append(toIndentedString(singleChoice)).append("\n");
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

