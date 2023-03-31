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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ProgrammingExerciseTestCaseStateDTO
 */
@JsonPropertyOrder({
  ProgrammingExerciseTestCaseStateDTO.JSON_PROPERTY_RELEASED,
  ProgrammingExerciseTestCaseStateDTO.JSON_PROPERTY_HAS_STUDENT_RESULT,
  ProgrammingExerciseTestCaseStateDTO.JSON_PROPERTY_TEST_CASES_CHANGED,
  ProgrammingExerciseTestCaseStateDTO.JSON_PROPERTY_BUILD_AND_TEST_STUDENT_SUBMISSIONS_AFTER_DUE_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ProgrammingExerciseTestCaseStateDTO {
  public static final String JSON_PROPERTY_RELEASED = "released";
  private Boolean released;

  public static final String JSON_PROPERTY_HAS_STUDENT_RESULT = "hasStudentResult";
  private Boolean hasStudentResult;

  public static final String JSON_PROPERTY_TEST_CASES_CHANGED = "testCasesChanged";
  private Boolean testCasesChanged;

  public static final String JSON_PROPERTY_BUILD_AND_TEST_STUDENT_SUBMISSIONS_AFTER_DUE_DATE = "buildAndTestStudentSubmissionsAfterDueDate";
  private OffsetDateTime buildAndTestStudentSubmissionsAfterDueDate;

  public ProgrammingExerciseTestCaseStateDTO() { 
  }

  public ProgrammingExerciseTestCaseStateDTO released(Boolean released) {
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleased() {
    return released;
  }


  @JsonProperty(JSON_PROPERTY_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleased(Boolean released) {
    this.released = released;
  }


  public ProgrammingExerciseTestCaseStateDTO hasStudentResult(Boolean hasStudentResult) {
    this.hasStudentResult = hasStudentResult;
    return this;
  }

   /**
   * Get hasStudentResult
   * @return hasStudentResult
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_STUDENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasStudentResult() {
    return hasStudentResult;
  }


  @JsonProperty(JSON_PROPERTY_HAS_STUDENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasStudentResult(Boolean hasStudentResult) {
    this.hasStudentResult = hasStudentResult;
  }


  public ProgrammingExerciseTestCaseStateDTO testCasesChanged(Boolean testCasesChanged) {
    this.testCasesChanged = testCasesChanged;
    return this;
  }

   /**
   * Get testCasesChanged
   * @return testCasesChanged
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASES_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTestCasesChanged() {
    return testCasesChanged;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASES_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCasesChanged(Boolean testCasesChanged) {
    this.testCasesChanged = testCasesChanged;
  }


  public ProgrammingExerciseTestCaseStateDTO buildAndTestStudentSubmissionsAfterDueDate(OffsetDateTime buildAndTestStudentSubmissionsAfterDueDate) {
    this.buildAndTestStudentSubmissionsAfterDueDate = buildAndTestStudentSubmissionsAfterDueDate;
    return this;
  }

   /**
   * Get buildAndTestStudentSubmissionsAfterDueDate
   * @return buildAndTestStudentSubmissionsAfterDueDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_AND_TEST_STUDENT_SUBMISSIONS_AFTER_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getBuildAndTestStudentSubmissionsAfterDueDate() {
    return buildAndTestStudentSubmissionsAfterDueDate;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_AND_TEST_STUDENT_SUBMISSIONS_AFTER_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildAndTestStudentSubmissionsAfterDueDate(OffsetDateTime buildAndTestStudentSubmissionsAfterDueDate) {
    this.buildAndTestStudentSubmissionsAfterDueDate = buildAndTestStudentSubmissionsAfterDueDate;
  }


  /**
   * Return true if this ProgrammingExerciseTestCaseStateDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseTestCaseStateDTO programmingExerciseTestCaseStateDTO = (ProgrammingExerciseTestCaseStateDTO) o;
    return Objects.equals(this.released, programmingExerciseTestCaseStateDTO.released) &&
        Objects.equals(this.hasStudentResult, programmingExerciseTestCaseStateDTO.hasStudentResult) &&
        Objects.equals(this.testCasesChanged, programmingExerciseTestCaseStateDTO.testCasesChanged) &&
        Objects.equals(this.buildAndTestStudentSubmissionsAfterDueDate, programmingExerciseTestCaseStateDTO.buildAndTestStudentSubmissionsAfterDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(released, hasStudentResult, testCasesChanged, buildAndTestStudentSubmissionsAfterDueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseTestCaseStateDTO {\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    hasStudentResult: ").append(toIndentedString(hasStudentResult)).append("\n");
    sb.append("    testCasesChanged: ").append(toIndentedString(testCasesChanged)).append("\n");
    sb.append("    buildAndTestStudentSubmissionsAfterDueDate: ").append(toIndentedString(buildAndTestStudentSubmissionsAfterDueDate)).append("\n");
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

