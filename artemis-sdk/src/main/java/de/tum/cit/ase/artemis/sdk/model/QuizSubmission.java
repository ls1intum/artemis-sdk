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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.Submission;
import de.tum.cit.ase.artemis.sdk.model.SubmittedAnswer;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * QuizSubmission
 */
@JsonPropertyOrder({
  QuizSubmission.JSON_PROPERTY_PARTICIPATION,
  QuizSubmission.JSON_PROPERTY_SCORE_IN_POINTS,
  QuizSubmission.JSON_PROPERTY_QUIZ_BATCH,
  QuizSubmission.JSON_PROPERTY_SUBMITTED_ANSWERS,
  QuizSubmission.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "submissionExerciseType", // ignore manually set submissionExerciseType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the submissionExerciseType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "submissionExerciseType", visible = true)

public class QuizSubmission extends Submission {
  public static final String JSON_PROPERTY_PARTICIPATION = "participation";
  private Participation participation;

  public static final String JSON_PROPERTY_SCORE_IN_POINTS = "scoreInPoints";
  private Double scoreInPoints;

  public static final String JSON_PROPERTY_QUIZ_BATCH = "quizBatch";
  private Long quizBatch;

  public static final String JSON_PROPERTY_SUBMITTED_ANSWERS = "submittedAnswers";
  private Set<SubmittedAnswer> submittedAnswers = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Result> results = new ArrayList<>();

  public QuizSubmission() { 
  }

  @JsonCreator
  public QuizSubmission(
    @JsonProperty(JSON_PROPERTY_RESULTS) List<Result> results, 
    @JsonProperty(JSON_PROPERTY_DURATION_IN_MINUTES) Long durationInMinutes
  ) {
    this();
    this.results = results;
    this.durationInMinutes = durationInMinutes;
  }

  public QuizSubmission participation(Participation participation) {
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Participation getParticipation() {
    return participation;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipation(Participation participation) {
    this.participation = participation;
  }


  public QuizSubmission scoreInPoints(Double scoreInPoints) {
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


  public QuizSubmission quizBatch(Long quizBatch) {
    this.quizBatch = quizBatch;
    return this;
  }

   /**
   * Get quizBatch
   * @return quizBatch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUIZ_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuizBatch() {
    return quizBatch;
  }


  @JsonProperty(JSON_PROPERTY_QUIZ_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuizBatch(Long quizBatch) {
    this.quizBatch = quizBatch;
  }


  public QuizSubmission submittedAnswers(Set<SubmittedAnswer> submittedAnswers) {
    this.submittedAnswers = submittedAnswers;
    return this;
  }

  public QuizSubmission addSubmittedAnswersItem(SubmittedAnswer submittedAnswersItem) {
    if (this.submittedAnswers == null) {
      this.submittedAnswers = new LinkedHashSet<>();
    }
    this.submittedAnswers.add(submittedAnswersItem);
    return this;
  }

   /**
   * Get submittedAnswers
   * @return submittedAnswers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SubmittedAnswer> getSubmittedAnswers() {
    return submittedAnswers;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SUBMITTED_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmittedAnswers(Set<SubmittedAnswer> submittedAnswers) {
    this.submittedAnswers = submittedAnswers;
  }


   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Result> getResults() {
    return results;
  }




  /**
   * Return true if this QuizSubmission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizSubmission quizSubmission = (QuizSubmission) o;
    return Objects.equals(this.participation, quizSubmission.participation) &&
        Objects.equals(this.scoreInPoints, quizSubmission.scoreInPoints) &&
        Objects.equals(this.quizBatch, quizSubmission.quizBatch) &&
        Objects.equals(this.submittedAnswers, quizSubmission.submittedAnswers) &&
        Objects.equals(this.results, quizSubmission.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, scoreInPoints, quizBatch, submittedAnswers, results, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizSubmission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    scoreInPoints: ").append(toIndentedString(scoreInPoints)).append("\n");
    sb.append("    quizBatch: ").append(toIndentedString(quizBatch)).append("\n");
    sb.append("    submittedAnswers: ").append(toIndentedString(submittedAnswers)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
  mappings.put("QuizSubmission", QuizSubmission.class);
  JSON.registerDiscriminator(QuizSubmission.class, "submissionExerciseType", mappings);
}
}

