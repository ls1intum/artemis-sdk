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
import de.tum.cit.ase.artemis.sdk.model.CoverageFileReport;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTestCase;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TestwiseCoverageReportEntry
 */
@JsonPropertyOrder({
  TestwiseCoverageReportEntry.JSON_PROPERTY_ID,
  TestwiseCoverageReportEntry.JSON_PROPERTY_FILE_REPORT,
  TestwiseCoverageReportEntry.JSON_PROPERTY_TEST_CASE,
  TestwiseCoverageReportEntry.JSON_PROPERTY_START_LINE,
  TestwiseCoverageReportEntry.JSON_PROPERTY_LINE_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TestwiseCoverageReportEntry {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_FILE_REPORT = "fileReport";
  private CoverageFileReport fileReport;

  public static final String JSON_PROPERTY_TEST_CASE = "testCase";
  private ProgrammingExerciseTestCase testCase;

  public static final String JSON_PROPERTY_START_LINE = "startLine";
  private Integer startLine;

  public static final String JSON_PROPERTY_LINE_COUNT = "lineCount";
  private Integer lineCount;

  public TestwiseCoverageReportEntry() { 
  }

  public TestwiseCoverageReportEntry id(Long id) {
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


  public TestwiseCoverageReportEntry fileReport(CoverageFileReport fileReport) {
    this.fileReport = fileReport;
    return this;
  }

   /**
   * Get fileReport
   * @return fileReport
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoverageFileReport getFileReport() {
    return fileReport;
  }


  @JsonProperty(JSON_PROPERTY_FILE_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileReport(CoverageFileReport fileReport) {
    this.fileReport = fileReport;
  }


  public TestwiseCoverageReportEntry testCase(ProgrammingExerciseTestCase testCase) {
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


  public TestwiseCoverageReportEntry startLine(Integer startLine) {
    this.startLine = startLine;
    return this;
  }

   /**
   * Get startLine
   * @return startLine
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartLine() {
    return startLine;
  }


  @JsonProperty(JSON_PROPERTY_START_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }


  public TestwiseCoverageReportEntry lineCount(Integer lineCount) {
    this.lineCount = lineCount;
    return this;
  }

   /**
   * Get lineCount
   * @return lineCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLineCount() {
    return lineCount;
  }


  @JsonProperty(JSON_PROPERTY_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineCount(Integer lineCount) {
    this.lineCount = lineCount;
  }


  /**
   * Return true if this TestwiseCoverageReportEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestwiseCoverageReportEntry testwiseCoverageReportEntry = (TestwiseCoverageReportEntry) o;
    return Objects.equals(this.id, testwiseCoverageReportEntry.id) &&
        Objects.equals(this.fileReport, testwiseCoverageReportEntry.fileReport) &&
        Objects.equals(this.testCase, testwiseCoverageReportEntry.testCase) &&
        Objects.equals(this.startLine, testwiseCoverageReportEntry.startLine) &&
        Objects.equals(this.lineCount, testwiseCoverageReportEntry.lineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileReport, testCase, startLine, lineCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestwiseCoverageReportEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileReport: ").append(toIndentedString(fileReport)).append("\n");
    sb.append("    testCase: ").append(toIndentedString(testCase)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
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

