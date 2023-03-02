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
import de.tum.cit.ase.artemis.sdk.model.CodeHint;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTestCase;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ProgrammingExerciseSolutionEntry
 */
@JsonPropertyOrder({
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_ID,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_FILE_PATH,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_PREVIOUS_LINE,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_LINE,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_PREVIOUS_CODE,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_CODE,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_CODE_HINT,
  ProgrammingExerciseSolutionEntry.JSON_PROPERTY_TEST_CASE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ProgrammingExerciseSolutionEntry {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_FILE_PATH = "filePath";
  private String filePath;

  public static final String JSON_PROPERTY_PREVIOUS_LINE = "previousLine";
  private Integer previousLine;

  public static final String JSON_PROPERTY_LINE = "line";
  private Integer line;

  public static final String JSON_PROPERTY_PREVIOUS_CODE = "previousCode";
  private String previousCode;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CODE_HINT = "codeHint";
  private CodeHint codeHint;

  public static final String JSON_PROPERTY_TEST_CASE = "testCase";
  private ProgrammingExerciseTestCase testCase;

  public ProgrammingExerciseSolutionEntry() { 
  }

  public ProgrammingExerciseSolutionEntry id(Long id) {
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


  public ProgrammingExerciseSolutionEntry filePath(String filePath) {
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


  public ProgrammingExerciseSolutionEntry previousLine(Integer previousLine) {
    this.previousLine = previousLine;
    return this;
  }

   /**
   * Get previousLine
   * @return previousLine
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPreviousLine() {
    return previousLine;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousLine(Integer previousLine) {
    this.previousLine = previousLine;
  }


  public ProgrammingExerciseSolutionEntry line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLine() {
    return line;
  }


  @JsonProperty(JSON_PROPERTY_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLine(Integer line) {
    this.line = line;
  }


  public ProgrammingExerciseSolutionEntry previousCode(String previousCode) {
    this.previousCode = previousCode;
    return this;
  }

   /**
   * Get previousCode
   * @return previousCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviousCode() {
    return previousCode;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousCode(String previousCode) {
    this.previousCode = previousCode;
  }


  public ProgrammingExerciseSolutionEntry code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public ProgrammingExerciseSolutionEntry codeHint(CodeHint codeHint) {
    this.codeHint = codeHint;
    return this;
  }

   /**
   * Get codeHint
   * @return codeHint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CodeHint getCodeHint() {
    return codeHint;
  }


  @JsonProperty(JSON_PROPERTY_CODE_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeHint(CodeHint codeHint) {
    this.codeHint = codeHint;
  }


  public ProgrammingExerciseSolutionEntry testCase(ProgrammingExerciseTestCase testCase) {
    this.testCase = testCase;
    return this;
  }

   /**
   * Get testCase
   * @return testCase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProgrammingExerciseTestCase getTestCase() {
    return testCase;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCase(ProgrammingExerciseTestCase testCase) {
    this.testCase = testCase;
  }


  /**
   * Return true if this ProgrammingExerciseSolutionEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry = (ProgrammingExerciseSolutionEntry) o;
    return Objects.equals(this.id, programmingExerciseSolutionEntry.id) &&
        Objects.equals(this.filePath, programmingExerciseSolutionEntry.filePath) &&
        Objects.equals(this.previousLine, programmingExerciseSolutionEntry.previousLine) &&
        Objects.equals(this.line, programmingExerciseSolutionEntry.line) &&
        Objects.equals(this.previousCode, programmingExerciseSolutionEntry.previousCode) &&
        Objects.equals(this.code, programmingExerciseSolutionEntry.code) &&
        Objects.equals(this.codeHint, programmingExerciseSolutionEntry.codeHint) &&
        Objects.equals(this.testCase, programmingExerciseSolutionEntry.testCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filePath, previousLine, line, previousCode, code, codeHint, testCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseSolutionEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    previousLine: ").append(toIndentedString(previousLine)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    previousCode: ").append(toIndentedString(previousCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeHint: ").append(toIndentedString(codeHint)).append("\n");
    sb.append("    testCase: ").append(toIndentedString(testCase)).append("\n");
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

