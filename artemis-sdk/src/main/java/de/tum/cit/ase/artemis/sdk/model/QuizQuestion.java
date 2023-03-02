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
import de.tum.cit.ase.artemis.sdk.model.DragAndDropQuestion;
import de.tum.cit.ase.artemis.sdk.model.MultipleChoiceQuestion;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestionStatistic;
import de.tum.cit.ase.artemis.sdk.model.ShortAnswerQuestion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * QuizQuestion
 */
@JsonPropertyOrder({
  QuizQuestion.JSON_PROPERTY_ID,
  QuizQuestion.JSON_PROPERTY_TITLE,
  QuizQuestion.JSON_PROPERTY_TEXT,
  QuizQuestion.JSON_PROPERTY_HINT,
  QuizQuestion.JSON_PROPERTY_EXPLANATION,
  QuizQuestion.JSON_PROPERTY_POINTS,
  QuizQuestion.JSON_PROPERTY_SCORING_TYPE,
  QuizQuestion.JSON_PROPERTY_RANDOMIZE_ORDER,
  QuizQuestion.JSON_PROPERTY_INVALID,
  QuizQuestion.JSON_PROPERTY_QUIZ_QUESTION_STATISTIC,
  QuizQuestion.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DragAndDropQuestion.class, name = "DragAndDropQuestion"),
  @JsonSubTypes.Type(value = MultipleChoiceQuestion.class, name = "MultipleChoiceQuestion"),
  @JsonSubTypes.Type(value = ShortAnswerQuestion.class, name = "ShortAnswerQuestion"),
  @JsonSubTypes.Type(value = DragAndDropQuestion.class, name = "drag-and-drop"),
  @JsonSubTypes.Type(value = MultipleChoiceQuestion.class, name = "multiple-choice"),
  @JsonSubTypes.Type(value = ShortAnswerQuestion.class, name = "short-answer"),
})

public class QuizQuestion {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_HINT = "hint";
  private String hint;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_POINTS = "points";
  private Integer points;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    ALL_OR_NOTHING("ALL_OR_NOTHING"),
    
    PROPORTIONAL_WITH_PENALTY("PROPORTIONAL_WITH_PENALTY"),
    
    PROPORTIONAL_WITHOUT_PENALTY("PROPORTIONAL_WITHOUT_PENALTY");

    private String value;

    ScoringTypeEnum(String value) {
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
    public static ScoringTypeEnum fromValue(String value) {
      for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCORING_TYPE = "scoringType";
  private ScoringTypeEnum scoringType;

  public static final String JSON_PROPERTY_RANDOMIZE_ORDER = "randomizeOrder";
  private Boolean randomizeOrder;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Boolean invalid;

  public static final String JSON_PROPERTY_QUIZ_QUESTION_STATISTIC = "quizQuestionStatistic";
  private QuizQuestionStatistic quizQuestionStatistic;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public QuizQuestion() { 
  }

  public QuizQuestion id(Long id) {
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


  public QuizQuestion title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public QuizQuestion text(String text) {
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


  public QuizQuestion hint(String hint) {
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


  public QuizQuestion explanation(String explanation) {
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


  public QuizQuestion points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(Integer points) {
    this.points = points;
  }


  public QuizQuestion scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

   /**
   * Get scoringType
   * @return scoringType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }


  @JsonProperty(JSON_PROPERTY_SCORING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }


  public QuizQuestion randomizeOrder(Boolean randomizeOrder) {
    this.randomizeOrder = randomizeOrder;
    return this;
  }

   /**
   * Get randomizeOrder
   * @return randomizeOrder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANDOMIZE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRandomizeOrder() {
    return randomizeOrder;
  }


  @JsonProperty(JSON_PROPERTY_RANDOMIZE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandomizeOrder(Boolean randomizeOrder) {
    this.randomizeOrder = randomizeOrder;
  }


  public QuizQuestion invalid(Boolean invalid) {
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


  public QuizQuestion quizQuestionStatistic(QuizQuestionStatistic quizQuestionStatistic) {
    this.quizQuestionStatistic = quizQuestionStatistic;
    return this;
  }

   /**
   * Get quizQuestionStatistic
   * @return quizQuestionStatistic
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUIZ_QUESTION_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuizQuestionStatistic getQuizQuestionStatistic() {
    return quizQuestionStatistic;
  }


  @JsonProperty(JSON_PROPERTY_QUIZ_QUESTION_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuizQuestionStatistic(QuizQuestionStatistic quizQuestionStatistic) {
    this.quizQuestionStatistic = quizQuestionStatistic;
  }


  public QuizQuestion type(String type) {
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
   * Return true if this QuizQuestion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizQuestion quizQuestion = (QuizQuestion) o;
    return Objects.equals(this.id, quizQuestion.id) &&
        Objects.equals(this.title, quizQuestion.title) &&
        Objects.equals(this.text, quizQuestion.text) &&
        Objects.equals(this.hint, quizQuestion.hint) &&
        Objects.equals(this.explanation, quizQuestion.explanation) &&
        Objects.equals(this.points, quizQuestion.points) &&
        Objects.equals(this.scoringType, quizQuestion.scoringType) &&
        Objects.equals(this.randomizeOrder, quizQuestion.randomizeOrder) &&
        Objects.equals(this.invalid, quizQuestion.invalid) &&
        Objects.equals(this.quizQuestionStatistic, quizQuestion.quizQuestionStatistic) &&
        Objects.equals(this.type, quizQuestion.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, text, hint, explanation, points, scoringType, randomizeOrder, invalid, quizQuestionStatistic, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizQuestion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
    sb.append("    randomizeOrder: ").append(toIndentedString(randomizeOrder)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    quizQuestionStatistic: ").append(toIndentedString(quizQuestionStatistic)).append("\n");
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
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("DragAndDropQuestion", DragAndDropQuestion.class);
  mappings.put("MultipleChoiceQuestion", MultipleChoiceQuestion.class);
  mappings.put("ShortAnswerQuestion", ShortAnswerQuestion.class);
  mappings.put("drag-and-drop", DragAndDropQuestion.class);
  mappings.put("multiple-choice", MultipleChoiceQuestion.class);
  mappings.put("short-answer", ShortAnswerQuestion.class);
  mappings.put("QuizQuestion", QuizQuestion.class);
  JSON.registerDiscriminator(QuizQuestion.class, "type", mappings);
}
}

