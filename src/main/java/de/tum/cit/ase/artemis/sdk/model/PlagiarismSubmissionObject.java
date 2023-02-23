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
import de.tum.cit.ase.artemis.sdk.model.PlagiarismCase;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismComparisonObject;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * PlagiarismSubmissionObject
 */
@JsonPropertyOrder({
  PlagiarismSubmissionObject.JSON_PROPERTY_ID,
  PlagiarismSubmissionObject.JSON_PROPERTY_SUBMISSION_ID,
  PlagiarismSubmissionObject.JSON_PROPERTY_STUDENT_LOGIN,
  PlagiarismSubmissionObject.JSON_PROPERTY_ELEMENTS,
  PlagiarismSubmissionObject.JSON_PROPERTY_PLAGIARISM_CASE,
  PlagiarismSubmissionObject.JSON_PROPERTY_PLAGIARISM_COMPARISON,
  PlagiarismSubmissionObject.JSON_PROPERTY_SIZE,
  PlagiarismSubmissionObject.JSON_PROPERTY_SCORE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class PlagiarismSubmissionObject {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submissionId";
  private Long submissionId;

  public static final String JSON_PROPERTY_STUDENT_LOGIN = "studentLogin";
  private String studentLogin;

  public static final String JSON_PROPERTY_ELEMENTS = "elements";
  private List<Object> elements = new ArrayList<>();

  public static final String JSON_PROPERTY_PLAGIARISM_CASE = "plagiarismCase";
  private PlagiarismCase plagiarismCase;

  public static final String JSON_PROPERTY_PLAGIARISM_COMPARISON = "plagiarismComparison";
  private PlagiarismComparisonObject plagiarismComparison;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Double score;

  public PlagiarismSubmissionObject() { 
  }

  public PlagiarismSubmissionObject id(Long id) {
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


  public PlagiarismSubmissionObject submissionId(Long submissionId) {
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubmissionId() {
    return submissionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionId(Long submissionId) {
    this.submissionId = submissionId;
  }


  public PlagiarismSubmissionObject studentLogin(String studentLogin) {
    this.studentLogin = studentLogin;
    return this;
  }

   /**
   * Get studentLogin
   * @return studentLogin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStudentLogin() {
    return studentLogin;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentLogin(String studentLogin) {
    this.studentLogin = studentLogin;
  }


  public PlagiarismSubmissionObject elements(List<Object> elements) {
    this.elements = elements;
    return this;
  }

  public PlagiarismSubmissionObject addElementsItem(Object elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getElements() {
    return elements;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElements(List<Object> elements) {
    this.elements = elements;
  }


  public PlagiarismSubmissionObject plagiarismCase(PlagiarismCase plagiarismCase) {
    this.plagiarismCase = plagiarismCase;
    return this;
  }

   /**
   * Get plagiarismCase
   * @return plagiarismCase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlagiarismCase getPlagiarismCase() {
    return plagiarismCase;
  }


  @JsonProperty(JSON_PROPERTY_PLAGIARISM_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismCase(PlagiarismCase plagiarismCase) {
    this.plagiarismCase = plagiarismCase;
  }


  public PlagiarismSubmissionObject plagiarismComparison(PlagiarismComparisonObject plagiarismComparison) {
    this.plagiarismComparison = plagiarismComparison;
    return this;
  }

   /**
   * Get plagiarismComparison
   * @return plagiarismComparison
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlagiarismComparisonObject getPlagiarismComparison() {
    return plagiarismComparison;
  }


  @JsonProperty(JSON_PROPERTY_PLAGIARISM_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismComparison(PlagiarismComparisonObject plagiarismComparison) {
    this.plagiarismComparison = plagiarismComparison;
  }


  public PlagiarismSubmissionObject size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public PlagiarismSubmissionObject score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(Double score) {
    this.score = score;
  }


  /**
   * Return true if this PlagiarismSubmissionObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismSubmissionObject plagiarismSubmissionObject = (PlagiarismSubmissionObject) o;
    return Objects.equals(this.id, plagiarismSubmissionObject.id) &&
        Objects.equals(this.submissionId, plagiarismSubmissionObject.submissionId) &&
        Objects.equals(this.studentLogin, plagiarismSubmissionObject.studentLogin) &&
        Objects.equals(this.elements, plagiarismSubmissionObject.elements) &&
        Objects.equals(this.plagiarismCase, plagiarismSubmissionObject.plagiarismCase) &&
        Objects.equals(this.plagiarismComparison, plagiarismSubmissionObject.plagiarismComparison) &&
        Objects.equals(this.size, plagiarismSubmissionObject.size) &&
        Objects.equals(this.score, plagiarismSubmissionObject.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submissionId, studentLogin, elements, plagiarismCase, plagiarismComparison, size, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismSubmissionObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    studentLogin: ").append(toIndentedString(studentLogin)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    plagiarismCase: ").append(toIndentedString(plagiarismCase)).append("\n");
    sb.append("    plagiarismComparison: ").append(toIndentedString(plagiarismComparison)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

