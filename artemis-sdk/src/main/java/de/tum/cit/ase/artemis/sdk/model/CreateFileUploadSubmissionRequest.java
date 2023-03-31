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
import de.tum.cit.ase.artemis.sdk.model.FileUploadSubmission;
import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CreateFileUploadSubmissionRequest
 */
@JsonPropertyOrder({
  CreateFileUploadSubmissionRequest.JSON_PROPERTY_SUBMISSION,
  CreateFileUploadSubmissionRequest.JSON_PROPERTY_FILE
})
@JsonTypeName("createFileUploadSubmission_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class CreateFileUploadSubmissionRequest {
  public static final String JSON_PROPERTY_SUBMISSION = "submission";
  private FileUploadSubmission submission;

  public static final String JSON_PROPERTY_FILE = "file";
  private File _file;

  public CreateFileUploadSubmissionRequest() { 
  }

  public CreateFileUploadSubmissionRequest submission(FileUploadSubmission submission) {
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileUploadSubmission getSubmission() {
    return submission;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmission(FileUploadSubmission submission) {
    this.submission = submission;
  }


  public CreateFileUploadSubmissionRequest _file(File _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(File _file) {
    this._file = _file;
  }


  /**
   * Return true if this createFileUploadSubmission_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadSubmissionRequest createFileUploadSubmissionRequest = (CreateFileUploadSubmissionRequest) o;
    return Objects.equals(this.submission, createFileUploadSubmissionRequest.submission) &&
        Objects.equals(this._file, createFileUploadSubmissionRequest._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submission, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileUploadSubmissionRequest {\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

