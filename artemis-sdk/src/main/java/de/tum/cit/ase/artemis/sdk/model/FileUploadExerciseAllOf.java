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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * FileUploadExerciseAllOf
 */
@JsonPropertyOrder({
  FileUploadExerciseAllOf.JSON_PROPERTY_EXAMPLE_SOLUTION,
  FileUploadExerciseAllOf.JSON_PROPERTY_FILE_PATTERN
})
@JsonTypeName("FileUploadExercise_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class FileUploadExerciseAllOf {
  public static final String JSON_PROPERTY_EXAMPLE_SOLUTION = "exampleSolution";
  private String exampleSolution;

  public static final String JSON_PROPERTY_FILE_PATTERN = "filePattern";
  private String filePattern;

  public FileUploadExerciseAllOf() { 
  }

  public FileUploadExerciseAllOf exampleSolution(String exampleSolution) {
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


  public FileUploadExerciseAllOf filePattern(String filePattern) {
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
   * Return true if this FileUploadExercise_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadExerciseAllOf fileUploadExerciseAllOf = (FileUploadExerciseAllOf) o;
    return Objects.equals(this.exampleSolution, fileUploadExerciseAllOf.exampleSolution) &&
        Objects.equals(this.filePattern, fileUploadExerciseAllOf.filePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleSolution, filePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadExerciseAllOf {\n");
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

}
