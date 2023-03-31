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
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.Submission;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * FileUploadSubmission
 */
@JsonPropertyOrder({
  FileUploadSubmission.JSON_PROPERTY_PARTICIPATION,
  FileUploadSubmission.JSON_PROPERTY_FILE_PATH,
  FileUploadSubmission.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "submissionExerciseType", // ignore manually set submissionExerciseType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the submissionExerciseType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "submissionExerciseType", visible = true)

public class FileUploadSubmission extends Submission {
  public static final String JSON_PROPERTY_PARTICIPATION = "participation";
  private Participation participation;

  public static final String JSON_PROPERTY_FILE_PATH = "filePath";
  private String filePath;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Result> results;

  public FileUploadSubmission() { 
  }

  @JsonCreator
  public FileUploadSubmission(
    @JsonProperty(JSON_PROPERTY_RESULTS) List<Result> results, 
    @JsonProperty(JSON_PROPERTY_DURATION_IN_MINUTES) Long durationInMinutes
  ) {
    this();
    this.results = results;
    this.durationInMinutes = durationInMinutes;
  }

  public FileUploadSubmission participation(Participation participation) {
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


  public FileUploadSubmission filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilePath() {
    return filePath;
  }


  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilePath(String filePath) {
    this.filePath = filePath;
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
   * Return true if this FileUploadSubmission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadSubmission fileUploadSubmission = (FileUploadSubmission) o;
    return Objects.equals(this.participation, fileUploadSubmission.participation) &&
        Objects.equals(this.filePath, fileUploadSubmission.filePath) &&
        Objects.equals(this.results, fileUploadSubmission.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, filePath, results, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadSubmission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("FileUploadSubmission", FileUploadSubmission.class);
    JSON.registerDiscriminator(FileUploadSubmission.class, "submissionExerciseType", mappings);
  }
}

