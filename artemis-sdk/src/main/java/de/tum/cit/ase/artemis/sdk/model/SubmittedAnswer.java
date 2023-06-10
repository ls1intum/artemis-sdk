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
import de.tum.cit.ase.artemis.sdk.model.QuizQuestion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SubmittedAnswer
 */
@JsonPropertyOrder({
  SubmittedAnswer.JSON_PROPERTY_ID,
  SubmittedAnswer.JSON_PROPERTY_SCORE_IN_POINTS,
  SubmittedAnswer.JSON_PROPERTY_QUIZ_QUESTION,
  SubmittedAnswer.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class SubmittedAnswer {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SCORE_IN_POINTS = "scoreInPoints";
  private Double scoreInPoints;

  public static final String JSON_PROPERTY_QUIZ_QUESTION = "quizQuestion";
  private QuizQuestion quizQuestion;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SubmittedAnswer() { 
  }

  public SubmittedAnswer id(Long id) {
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


  public SubmittedAnswer scoreInPoints(Double scoreInPoints) {
    this.scoreInPoints = scoreInPoints;
    return this;
  }

   /**
   * Get scoreInPoints
   * @return scoreInPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_IN_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScoreInPoints() {
    return scoreInPoints;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_IN_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreInPoints(Double scoreInPoints) {
    this.scoreInPoints = scoreInPoints;
  }


  public SubmittedAnswer quizQuestion(QuizQuestion quizQuestion) {
    this.quizQuestion = quizQuestion;
    return this;
  }

   /**
   * Get quizQuestion
   * @return quizQuestion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUIZ_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuizQuestion getQuizQuestion() {
    return quizQuestion;
  }


  @JsonProperty(JSON_PROPERTY_QUIZ_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuizQuestion(QuizQuestion quizQuestion) {
    this.quizQuestion = quizQuestion;
  }


  public SubmittedAnswer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this SubmittedAnswer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmittedAnswer submittedAnswer = (SubmittedAnswer) o;
    return Objects.equals(this.id, submittedAnswer.id) &&
        Objects.equals(this.scoreInPoints, submittedAnswer.scoreInPoints) &&
        Objects.equals(this.quizQuestion, submittedAnswer.quizQuestion) &&
        Objects.equals(this.type, submittedAnswer.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scoreInPoints, quizQuestion, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmittedAnswer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scoreInPoints: ").append(toIndentedString(scoreInPoints)).append("\n");
    sb.append("    quizQuestion: ").append(toIndentedString(quizQuestion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    mappings.put("SubmittedAnswer", SubmittedAnswer.class);
    JSON.registerDiscriminator(SubmittedAnswer.class, "type", mappings);
  }
}

