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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * QuizQuestionStatistic
 */
@JsonPropertyOrder({
  QuizQuestionStatistic.JSON_PROPERTY_ID,
  QuizQuestionStatistic.JSON_PROPERTY_PARTICIPANTS_RATED,
  QuizQuestionStatistic.JSON_PROPERTY_PARTICIPANTS_UNRATED,
  QuizQuestionStatistic.JSON_PROPERTY_RATED_CORRECT_COUNTER,
  QuizQuestionStatistic.JSON_PROPERTY_UN_RATED_CORRECT_COUNTER,
  QuizQuestionStatistic.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DragAndDropQuestionStatistic.class, name = "drag-and-drop"),
  @JsonSubTypes.Type(value = MultipleChoiceQuestionStatistic.class, name = "multiple-choice"),
  @JsonSubTypes.Type(value = ShortAnswerQuestionStatistic.class, name = "short-answer"),
})

public class QuizQuestionStatistic {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_PARTICIPANTS_RATED = "participantsRated";
  private Integer participantsRated;

  public static final String JSON_PROPERTY_PARTICIPANTS_UNRATED = "participantsUnrated";
  private Integer participantsUnrated;

  public static final String JSON_PROPERTY_RATED_CORRECT_COUNTER = "ratedCorrectCounter";
  private Integer ratedCorrectCounter;

  public static final String JSON_PROPERTY_UN_RATED_CORRECT_COUNTER = "unRatedCorrectCounter";
  private Integer unRatedCorrectCounter;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public QuizQuestionStatistic() { 
  }

  public QuizQuestionStatistic id(Long id) {
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


  public QuizQuestionStatistic participantsRated(Integer participantsRated) {
    this.participantsRated = participantsRated;
    return this;
  }

   /**
   * Get participantsRated
   * @return participantsRated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_RATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParticipantsRated() {
    return participantsRated;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_RATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantsRated(Integer participantsRated) {
    this.participantsRated = participantsRated;
  }


  public QuizQuestionStatistic participantsUnrated(Integer participantsUnrated) {
    this.participantsUnrated = participantsUnrated;
    return this;
  }

   /**
   * Get participantsUnrated
   * @return participantsUnrated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_UNRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParticipantsUnrated() {
    return participantsUnrated;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_UNRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantsUnrated(Integer participantsUnrated) {
    this.participantsUnrated = participantsUnrated;
  }


  public QuizQuestionStatistic ratedCorrectCounter(Integer ratedCorrectCounter) {
    this.ratedCorrectCounter = ratedCorrectCounter;
    return this;
  }

   /**
   * Get ratedCorrectCounter
   * @return ratedCorrectCounter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATED_CORRECT_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRatedCorrectCounter() {
    return ratedCorrectCounter;
  }


  @JsonProperty(JSON_PROPERTY_RATED_CORRECT_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatedCorrectCounter(Integer ratedCorrectCounter) {
    this.ratedCorrectCounter = ratedCorrectCounter;
  }


  public QuizQuestionStatistic unRatedCorrectCounter(Integer unRatedCorrectCounter) {
    this.unRatedCorrectCounter = unRatedCorrectCounter;
    return this;
  }

   /**
   * Get unRatedCorrectCounter
   * @return unRatedCorrectCounter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UN_RATED_CORRECT_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnRatedCorrectCounter() {
    return unRatedCorrectCounter;
  }


  @JsonProperty(JSON_PROPERTY_UN_RATED_CORRECT_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnRatedCorrectCounter(Integer unRatedCorrectCounter) {
    this.unRatedCorrectCounter = unRatedCorrectCounter;
  }


  public QuizQuestionStatistic type(String type) {
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
   * Return true if this QuizQuestionStatistic object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizQuestionStatistic quizQuestionStatistic = (QuizQuestionStatistic) o;
    return Objects.equals(this.id, quizQuestionStatistic.id) &&
        Objects.equals(this.participantsRated, quizQuestionStatistic.participantsRated) &&
        Objects.equals(this.participantsUnrated, quizQuestionStatistic.participantsUnrated) &&
        Objects.equals(this.ratedCorrectCounter, quizQuestionStatistic.ratedCorrectCounter) &&
        Objects.equals(this.unRatedCorrectCounter, quizQuestionStatistic.unRatedCorrectCounter) &&
        Objects.equals(this.type, quizQuestionStatistic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participantsRated, participantsUnrated, ratedCorrectCounter, unRatedCorrectCounter, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizQuestionStatistic {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participantsRated: ").append(toIndentedString(participantsRated)).append("\n");
    sb.append("    participantsUnrated: ").append(toIndentedString(participantsUnrated)).append("\n");
    sb.append("    ratedCorrectCounter: ").append(toIndentedString(ratedCorrectCounter)).append("\n");
    sb.append("    unRatedCorrectCounter: ").append(toIndentedString(unRatedCorrectCounter)).append("\n");
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
    mappings.put("DD", DragAndDropQuestionStatistic.class);
    mappings.put("MC", MultipleChoiceQuestionStatistic.class);
    mappings.put("SA", ShortAnswerQuestionStatistic.class);
    mappings.put("QuizQuestionStatistic", QuizQuestionStatistic.class);
    JSON.registerDiscriminator(QuizQuestionStatistic.class, "type", mappings);
  }
}

