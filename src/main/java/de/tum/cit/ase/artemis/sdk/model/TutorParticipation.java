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
import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TutorParticipation
 */
@JsonPropertyOrder({
  TutorParticipation.JSON_PROPERTY_ID,
  TutorParticipation.JSON_PROPERTY_STATUS,
  TutorParticipation.JSON_PROPERTY_ASSESSED_EXERCISE,
  TutorParticipation.JSON_PROPERTY_TUTOR,
  TutorParticipation.JSON_PROPERTY_TRAINED_EXAMPLE_SUBMISSIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TutorParticipation {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NOT_PARTICIPATED("NOT_PARTICIPATED"),
    
    REVIEWED_INSTRUCTIONS("REVIEWED_INSTRUCTIONS"),
    
    TRAINED("TRAINED"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_ASSESSED_EXERCISE = "assessedExercise";
  private Exercise assessedExercise;

  public static final String JSON_PROPERTY_TUTOR = "tutor";
  private User tutor;

  public static final String JSON_PROPERTY_TRAINED_EXAMPLE_SUBMISSIONS = "trainedExampleSubmissions";
  private Set<ExampleSubmission> trainedExampleSubmissions = new LinkedHashSet<>();

  public TutorParticipation() { 
  }

  public TutorParticipation id(Long id) {
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


  public TutorParticipation status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TutorParticipation assessedExercise(Exercise assessedExercise) {
    this.assessedExercise = assessedExercise;
    return this;
  }

   /**
   * Get assessedExercise
   * @return assessedExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSED_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Exercise getAssessedExercise() {
    return assessedExercise;
  }


  @JsonProperty(JSON_PROPERTY_ASSESSED_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssessedExercise(Exercise assessedExercise) {
    this.assessedExercise = assessedExercise;
  }


  public TutorParticipation tutor(User tutor) {
    this.tutor = tutor;
    return this;
  }

   /**
   * Get tutor
   * @return tutor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getTutor() {
    return tutor;
  }


  @JsonProperty(JSON_PROPERTY_TUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutor(User tutor) {
    this.tutor = tutor;
  }


  public TutorParticipation trainedExampleSubmissions(Set<ExampleSubmission> trainedExampleSubmissions) {
    this.trainedExampleSubmissions = trainedExampleSubmissions;
    return this;
  }

  public TutorParticipation addTrainedExampleSubmissionsItem(ExampleSubmission trainedExampleSubmissionsItem) {
    if (this.trainedExampleSubmissions == null) {
      this.trainedExampleSubmissions = new LinkedHashSet<>();
    }
    this.trainedExampleSubmissions.add(trainedExampleSubmissionsItem);
    return this;
  }

   /**
   * Get trainedExampleSubmissions
   * @return trainedExampleSubmissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAINED_EXAMPLE_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ExampleSubmission> getTrainedExampleSubmissions() {
    return trainedExampleSubmissions;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TRAINED_EXAMPLE_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrainedExampleSubmissions(Set<ExampleSubmission> trainedExampleSubmissions) {
    this.trainedExampleSubmissions = trainedExampleSubmissions;
  }


  /**
   * Return true if this TutorParticipation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorParticipation tutorParticipation = (TutorParticipation) o;
    return Objects.equals(this.id, tutorParticipation.id) &&
        Objects.equals(this.status, tutorParticipation.status) &&
        Objects.equals(this.assessedExercise, tutorParticipation.assessedExercise) &&
        Objects.equals(this.tutor, tutorParticipation.tutor) &&
        Objects.equals(this.trainedExampleSubmissions, tutorParticipation.trainedExampleSubmissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, assessedExercise, tutor, trainedExampleSubmissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorParticipation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assessedExercise: ").append(toIndentedString(assessedExercise)).append("\n");
    sb.append("    tutor: ").append(toIndentedString(tutor)).append("\n");
    sb.append("    trainedExampleSubmissions: ").append(toIndentedString(trainedExampleSubmissions)).append("\n");
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
