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
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.TutorParticipation;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExampleSubmission
 */
@JsonPropertyOrder({
  ExampleSubmission.JSON_PROPERTY_ID,
  ExampleSubmission.JSON_PROPERTY_USED_FOR_TUTORIAL,
  ExampleSubmission.JSON_PROPERTY_EXERCISE,
  ExampleSubmission.JSON_PROPERTY_SUBMISSION,
  ExampleSubmission.JSON_PROPERTY_TUTOR_PARTICIPATIONS,
  ExampleSubmission.JSON_PROPERTY_ASSESSMENT_EXPLANATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ExampleSubmission {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_USED_FOR_TUTORIAL = "usedForTutorial";
  private Boolean usedForTutorial;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private Exercise exercise;

  public static final String JSON_PROPERTY_SUBMISSION = "submission";
  private GetAllTextSubmissions200ResponseInner submission;

  public static final String JSON_PROPERTY_TUTOR_PARTICIPATIONS = "tutorParticipations";
  private Set<TutorParticipation> tutorParticipations;

  public static final String JSON_PROPERTY_ASSESSMENT_EXPLANATION = "assessmentExplanation";
  private String assessmentExplanation;

  public ExampleSubmission() { 
  }

  public ExampleSubmission id(Long id) {
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


  public ExampleSubmission usedForTutorial(Boolean usedForTutorial) {
    this.usedForTutorial = usedForTutorial;
    return this;
  }

   /**
   * Get usedForTutorial
   * @return usedForTutorial
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_FOR_TUTORIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsedForTutorial() {
    return usedForTutorial;
  }


  @JsonProperty(JSON_PROPERTY_USED_FOR_TUTORIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedForTutorial(Boolean usedForTutorial) {
    this.usedForTutorial = usedForTutorial;
  }


  public ExampleSubmission exercise(Exercise exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Exercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public ExampleSubmission submission(GetAllTextSubmissions200ResponseInner submission) {
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllTextSubmissions200ResponseInner getSubmission() {
    return submission;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmission(GetAllTextSubmissions200ResponseInner submission) {
    this.submission = submission;
  }


  public ExampleSubmission tutorParticipations(Set<TutorParticipation> tutorParticipations) {
    this.tutorParticipations = tutorParticipations;
    return this;
  }

  public ExampleSubmission addTutorParticipationsItem(TutorParticipation tutorParticipationsItem) {
    if (this.tutorParticipations == null) {
      this.tutorParticipations = new LinkedHashSet<>();
    }
    this.tutorParticipations.add(tutorParticipationsItem);
    return this;
  }

   /**
   * Get tutorParticipations
   * @return tutorParticipations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTOR_PARTICIPATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TutorParticipation> getTutorParticipations() {
    return tutorParticipations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TUTOR_PARTICIPATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorParticipations(Set<TutorParticipation> tutorParticipations) {
    this.tutorParticipations = tutorParticipations;
  }


  public ExampleSubmission assessmentExplanation(String assessmentExplanation) {
    this.assessmentExplanation = assessmentExplanation;
    return this;
  }

   /**
   * Get assessmentExplanation
   * @return assessmentExplanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssessmentExplanation() {
    return assessmentExplanation;
  }


  @JsonProperty(JSON_PROPERTY_ASSESSMENT_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssessmentExplanation(String assessmentExplanation) {
    this.assessmentExplanation = assessmentExplanation;
  }


  /**
   * Return true if this ExampleSubmission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleSubmission exampleSubmission = (ExampleSubmission) o;
    return Objects.equals(this.id, exampleSubmission.id) &&
        Objects.equals(this.usedForTutorial, exampleSubmission.usedForTutorial) &&
        Objects.equals(this.exercise, exampleSubmission.exercise) &&
        Objects.equals(this.submission, exampleSubmission.submission) &&
        Objects.equals(this.tutorParticipations, exampleSubmission.tutorParticipations) &&
        Objects.equals(this.assessmentExplanation, exampleSubmission.assessmentExplanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, usedForTutorial, exercise, submission, tutorParticipations, assessmentExplanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleSubmission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usedForTutorial: ").append(toIndentedString(usedForTutorial)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    tutorParticipations: ").append(toIndentedString(tutorParticipations)).append("\n");
    sb.append("    assessmentExplanation: ").append(toIndentedString(assessmentExplanation)).append("\n");
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

