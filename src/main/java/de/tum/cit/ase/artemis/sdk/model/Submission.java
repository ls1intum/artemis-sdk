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
import de.tum.cit.ase.artemis.sdk.model.CleanupBuildPlan200Response;
import de.tum.cit.ase.artemis.sdk.model.FileUploadSubmission;
import de.tum.cit.ase.artemis.sdk.model.ModelingSubmission;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import de.tum.cit.ase.artemis.sdk.model.QuizSubmission;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.TextSubmission;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Submission
 */
@JsonPropertyOrder({
  Submission.JSON_PROPERTY_ID,
  Submission.JSON_PROPERTY_SUBMITTED,
  Submission.JSON_PROPERTY_TYPE,
  Submission.JSON_PROPERTY_EXAMPLE_SUBMISSION,
  Submission.JSON_PROPERTY_PARTICIPATION,
  Submission.JSON_PROPERTY_SUBMISSION_DATE,
  Submission.JSON_PROPERTY_EMPTY,
  Submission.JSON_PROPERTY_DURATION_IN_MINUTES,
  Submission.JSON_PROPERTY_RESULTS,
  Submission.JSON_PROPERTY_SUBMISSION_EXERCISE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "submissionExerciseType", // ignore manually set submissionExerciseType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the submissionExerciseType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "submissionExerciseType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = FileUploadSubmission.class, name = "FileUploadSubmission"),
  @JsonSubTypes.Type(value = ModelingSubmission.class, name = "ModelingSubmission"),
  @JsonSubTypes.Type(value = ProgrammingSubmission.class, name = "ProgrammingSubmission"),
  @JsonSubTypes.Type(value = QuizSubmission.class, name = "QuizSubmission"),
  @JsonSubTypes.Type(value = TextSubmission.class, name = "TextSubmission"),
})

public class Submission {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  private Boolean submitted;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    MANUAL("MANUAL"),
    
    TIMEOUT("TIMEOUT"),
    
    TEST("TEST"),
    
    OTHER("OTHER"),
    
    INSTRUCTOR("INSTRUCTOR"),
    
    EXTERNAL("EXTERNAL"),
    
    ILLEGAL("ILLEGAL");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_EXAMPLE_SUBMISSION = "exampleSubmission";
  private Boolean exampleSubmission;

  public static final String JSON_PROPERTY_PARTICIPATION = "participation";
  private Participation participation;

  public static final String JSON_PROPERTY_SUBMISSION_DATE = "submissionDate";
  private OffsetDateTime submissionDate;

  public static final String JSON_PROPERTY_EMPTY = "empty";
  private Boolean empty;

  public static final String JSON_PROPERTY_DURATION_IN_MINUTES = "durationInMinutes";
  Long durationInMinutes;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Result> results = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBMISSION_EXERCISE_TYPE = "submissionExerciseType";
  private String submissionExerciseType;

  public Submission() { 
  }

  @JsonCreator
  public Submission(
    @JsonProperty(JSON_PROPERTY_DURATION_IN_MINUTES) Long durationInMinutes, 
    @JsonProperty(JSON_PROPERTY_RESULTS) List<Result> results
  ) {
    this();
    this.durationInMinutes = durationInMinutes;
    this.results = results;
  }

  public Submission id(Long id) {
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


  public Submission submitted(Boolean submitted) {
    this.submitted = submitted;
    return this;
  }

   /**
   * Get submitted
   * @return submitted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubmitted() {
    return submitted;
  }


  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }


  public Submission type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Submission exampleSubmission(Boolean exampleSubmission) {
    this.exampleSubmission = exampleSubmission;
    return this;
  }

   /**
   * Get exampleSubmission
   * @return exampleSubmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExampleSubmission() {
    return exampleSubmission;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExampleSubmission(Boolean exampleSubmission) {
    this.exampleSubmission = exampleSubmission;
  }


  public Submission participation(Participation participation) {
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


  public Submission submissionDate(OffsetDateTime submissionDate) {
    this.submissionDate = submissionDate;
    return this;
  }

   /**
   * Get submissionDate
   * @return submissionDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubmissionDate() {
    return submissionDate;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionDate(OffsetDateTime submissionDate) {
    this.submissionDate = submissionDate;
  }


  public Submission empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmpty() {
    return empty;
  }


  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


   /**
   * Get durationInMinutes
   * @return durationInMinutes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDurationInMinutes() {
    return durationInMinutes;
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




  public Submission submissionExerciseType(String submissionExerciseType) {
    this.submissionExerciseType = submissionExerciseType;
    return this;
  }

   /**
   * Get submissionExerciseType
   * @return submissionExerciseType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBMISSION_EXERCISE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubmissionExerciseType() {
    return submissionExerciseType;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_EXERCISE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmissionExerciseType(String submissionExerciseType) {
    this.submissionExerciseType = submissionExerciseType;
  }


  /**
   * Return true if this Submission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submission submission = (Submission) o;
    return Objects.equals(this.id, submission.id) &&
        Objects.equals(this.submitted, submission.submitted) &&
        Objects.equals(this.type, submission.type) &&
        Objects.equals(this.exampleSubmission, submission.exampleSubmission) &&
        Objects.equals(this.participation, submission.participation) &&
        Objects.equals(this.submissionDate, submission.submissionDate) &&
        Objects.equals(this.empty, submission.empty) &&
        Objects.equals(this.durationInMinutes, submission.durationInMinutes) &&
        Objects.equals(this.results, submission.results) &&
        Objects.equals(this.submissionExerciseType, submission.submissionExerciseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitted, type, exampleSubmission, participation, submissionDate, empty, durationInMinutes, results, submissionExerciseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exampleSubmission: ").append(toIndentedString(exampleSubmission)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    durationInMinutes: ").append(toIndentedString(durationInMinutes)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    submissionExerciseType: ").append(toIndentedString(submissionExerciseType)).append("\n");
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
  mappings.put("FileUploadSubmission", FileUploadSubmission.class);
  mappings.put("ModelingSubmission", ModelingSubmission.class);
  mappings.put("ProgrammingSubmission", ProgrammingSubmission.class);
  mappings.put("QuizSubmission", QuizSubmission.class);
  mappings.put("TextSubmission", TextSubmission.class);
  mappings.put("Submission", Submission.class);
  JSON.registerDiscriminator(Submission.class, "submissionExerciseType", mappings);
}
}
