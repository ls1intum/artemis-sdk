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
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.SubmittedAnswer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * QuizSubmissionAllOf
 */
@JsonPropertyOrder({
  QuizSubmissionAllOf.JSON_PROPERTY_PARTICIPATION,
  QuizSubmissionAllOf.JSON_PROPERTY_SCORE_IN_POINTS,
  QuizSubmissionAllOf.JSON_PROPERTY_QUIZ_BATCH,
  QuizSubmissionAllOf.JSON_PROPERTY_SUBMITTED_ANSWERS,
  QuizSubmissionAllOf.JSON_PROPERTY_RESULTS
})
@JsonTypeName("QuizSubmission_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class QuizSubmissionAllOf {
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

  public QuizSubmissionAllOf() { 
  }

  @JsonCreator
  public QuizSubmissionAllOf(
    @JsonProperty(JSON_PROPERTY_RESULTS) List<Result> results
  ) {
    this();
    this.results = results;
  }

  public QuizSubmissionAllOf participation(Participation participation) {
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


  public QuizSubmissionAllOf scoreInPoints(Double scoreInPoints) {
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


  public QuizSubmissionAllOf quizBatch(Long quizBatch) {
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


  public QuizSubmissionAllOf submittedAnswers(Set<SubmittedAnswer> submittedAnswers) {
    this.submittedAnswers = submittedAnswers;
    return this;
  }

  public QuizSubmissionAllOf addSubmittedAnswersItem(SubmittedAnswer submittedAnswersItem) {
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
   * Return true if this QuizSubmission_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizSubmissionAllOf quizSubmissionAllOf = (QuizSubmissionAllOf) o;
    return Objects.equals(this.participation, quizSubmissionAllOf.participation) &&
        Objects.equals(this.scoreInPoints, quizSubmissionAllOf.scoreInPoints) &&
        Objects.equals(this.quizBatch, quizSubmissionAllOf.quizBatch) &&
        Objects.equals(this.submittedAnswers, quizSubmissionAllOf.submittedAnswers) &&
        Objects.equals(this.results, quizSubmissionAllOf.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, scoreInPoints, quizBatch, submittedAnswers, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizSubmissionAllOf {\n");
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

}
