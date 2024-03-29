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
import de.tum.cit.ase.artemis.sdk.model.Attachment;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.DueDateStat;
import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;
import de.tum.cit.ase.artemis.sdk.model.GradingCriterion;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismCase;
import de.tum.cit.ase.artemis.sdk.model.Post;
import de.tum.cit.ase.artemis.sdk.model.StudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.TeamAssignmentConfig;
import de.tum.cit.ase.artemis.sdk.model.TutorParticipation;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * FileUploadExercise
 */
@JsonPropertyOrder({
  FileUploadExercise.JSON_PROPERTY_TYPE,
  FileUploadExercise.JSON_PROPERTY_EXAMPLE_SOLUTION,
  FileUploadExercise.JSON_PROPERTY_FILE_PATTERN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class FileUploadExercise extends Exercise {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_EXAMPLE_SOLUTION = "exampleSolution";
  private String exampleSolution;

  public static final String JSON_PROPERTY_FILE_PATTERN = "filePattern";
  private String filePattern;

  public FileUploadExercise() { 
  }

  public FileUploadExercise type(String type) {
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


  public FileUploadExercise exampleSolution(String exampleSolution) {
    this.exampleSolution = exampleSolution;
    return this;
  }

   /**
   * Get exampleSolution
   * @return exampleSolution
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExampleSolution() {
    return exampleSolution;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExampleSolution(String exampleSolution) {
    this.exampleSolution = exampleSolution;
  }


  public FileUploadExercise filePattern(String filePattern) {
    this.filePattern = filePattern;
    return this;
  }

   /**
   * Get filePattern
   * @return filePattern
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilePattern() {
    return filePattern;
  }


  @JsonProperty(JSON_PROPERTY_FILE_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilePattern(String filePattern) {
    this.filePattern = filePattern;
  }


  /**
   * Return true if this FileUploadExercise object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadExercise fileUploadExercise = (FileUploadExercise) o;
    return Objects.equals(this.type, fileUploadExercise.type) &&
        Objects.equals(this.exampleSolution, fileUploadExercise.exampleSolution) &&
        Objects.equals(this.filePattern, fileUploadExercise.filePattern) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, exampleSolution, filePattern, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadExercise {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exampleSolution: ").append(toIndentedString(exampleSolution)).append("\n");
    sb.append("    filePattern: ").append(toIndentedString(filePattern)).append("\n");
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
    mappings.put("FileUploadExercise", FileUploadExercise.class);
    JSON.registerDiscriminator(FileUploadExercise.class, "type", mappings);
  }
}

