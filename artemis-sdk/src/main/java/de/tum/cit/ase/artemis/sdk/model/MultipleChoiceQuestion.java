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
import de.tum.cit.ase.artemis.sdk.model.AnswerOption;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestion;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestionStatistic;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * MultipleChoiceQuestion
 */
@JsonPropertyOrder({
  MultipleChoiceQuestion.JSON_PROPERTY_ANSWER_OPTIONS,
  MultipleChoiceQuestion.JSON_PROPERTY_SINGLE_CHOICE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class MultipleChoiceQuestion extends QuizQuestion {
  public static final String JSON_PROPERTY_ANSWER_OPTIONS = "answerOptions";
  private List<AnswerOption> answerOptions;

  public static final String JSON_PROPERTY_SINGLE_CHOICE = "singleChoice";
  private Boolean singleChoice;

  public MultipleChoiceQuestion() { 
  }

  public MultipleChoiceQuestion answerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
    return this;
  }

  public MultipleChoiceQuestion addAnswerOptionsItem(AnswerOption answerOptionsItem) {
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


  public MultipleChoiceQuestion singleChoice(Boolean singleChoice) {
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
   * Return true if this MultipleChoiceQuestion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion) o;
    return Objects.equals(this.answerOptions, multipleChoiceQuestion.answerOptions) &&
        Objects.equals(this.singleChoice, multipleChoiceQuestion.singleChoice) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerOptions, singleChoice, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleChoiceQuestion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  static {
    // Initialize and register the discriminator mappings.
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("MultipleChoiceQuestion", MultipleChoiceQuestion.class);
    JSON.registerDiscriminator(MultipleChoiceQuestion.class, "type", mappings);
  }
}

