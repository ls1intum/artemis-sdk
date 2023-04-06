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
import de.tum.cit.ase.artemis.sdk.model.CoverageReport;
import de.tum.cit.ase.artemis.sdk.model.TestwiseCoverageReportEntry;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CoverageFileReport
 */
@JsonPropertyOrder({
  CoverageFileReport.JSON_PROPERTY_ID,
  CoverageFileReport.JSON_PROPERTY_FULL_REPORT,
  CoverageFileReport.JSON_PROPERTY_FILE_PATH,
  CoverageFileReport.JSON_PROPERTY_LINE_COUNT,
  CoverageFileReport.JSON_PROPERTY_COVERED_LINE_COUNT,
  CoverageFileReport.JSON_PROPERTY_TESTWISE_COVERAGE_ENTRIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class CoverageFileReport {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_FULL_REPORT = "fullReport";
  private CoverageReport fullReport;

  public static final String JSON_PROPERTY_FILE_PATH = "filePath";
  private String filePath;

  public static final String JSON_PROPERTY_LINE_COUNT = "lineCount";
  private Integer lineCount;

  public static final String JSON_PROPERTY_COVERED_LINE_COUNT = "coveredLineCount";
  private Integer coveredLineCount;

  public static final String JSON_PROPERTY_TESTWISE_COVERAGE_ENTRIES = "testwiseCoverageEntries";
  private Set<TestwiseCoverageReportEntry> testwiseCoverageEntries;

  public CoverageFileReport() { 
  }

  public CoverageFileReport id(Long id) {
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


  public CoverageFileReport fullReport(CoverageReport fullReport) {
    this.fullReport = fullReport;
    return this;
  }

   /**
   * Get fullReport
   * @return fullReport
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoverageReport getFullReport() {
    return fullReport;
  }


  @JsonProperty(JSON_PROPERTY_FULL_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullReport(CoverageReport fullReport) {
    this.fullReport = fullReport;
  }


  public CoverageFileReport filePath(String filePath) {
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


  public CoverageFileReport lineCount(Integer lineCount) {
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


  public CoverageFileReport coveredLineCount(Integer coveredLineCount) {
    this.coveredLineCount = coveredLineCount;
    return this;
  }

   /**
   * Get coveredLineCount
   * @return coveredLineCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERED_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCoveredLineCount() {
    return coveredLineCount;
  }


  @JsonProperty(JSON_PROPERTY_COVERED_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoveredLineCount(Integer coveredLineCount) {
    this.coveredLineCount = coveredLineCount;
  }


  public CoverageFileReport testwiseCoverageEntries(Set<TestwiseCoverageReportEntry> testwiseCoverageEntries) {
    this.testwiseCoverageEntries = testwiseCoverageEntries;
    return this;
  }

  public CoverageFileReport addTestwiseCoverageEntriesItem(TestwiseCoverageReportEntry testwiseCoverageEntriesItem) {
    if (this.testwiseCoverageEntries == null) {
      this.testwiseCoverageEntries = new LinkedHashSet<>();
    }
    this.testwiseCoverageEntries.add(testwiseCoverageEntriesItem);
    return this;
  }

   /**
   * Get testwiseCoverageEntries
   * @return testwiseCoverageEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTWISE_COVERAGE_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TestwiseCoverageReportEntry> getTestwiseCoverageEntries() {
    return testwiseCoverageEntries;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TESTWISE_COVERAGE_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestwiseCoverageEntries(Set<TestwiseCoverageReportEntry> testwiseCoverageEntries) {
    this.testwiseCoverageEntries = testwiseCoverageEntries;
  }


  /**
   * Return true if this CoverageFileReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageFileReport coverageFileReport = (CoverageFileReport) o;
    return Objects.equals(this.id, coverageFileReport.id) &&
        Objects.equals(this.fullReport, coverageFileReport.fullReport) &&
        Objects.equals(this.filePath, coverageFileReport.filePath) &&
        Objects.equals(this.lineCount, coverageFileReport.lineCount) &&
        Objects.equals(this.coveredLineCount, coverageFileReport.coveredLineCount) &&
        Objects.equals(this.testwiseCoverageEntries, coverageFileReport.testwiseCoverageEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullReport, filePath, lineCount, coveredLineCount, testwiseCoverageEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageFileReport {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullReport: ").append(toIndentedString(fullReport)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
    sb.append("    coveredLineCount: ").append(toIndentedString(coveredLineCount)).append("\n");
    sb.append("    testwiseCoverageEntries: ").append(toIndentedString(testwiseCoverageEntries)).append("\n");
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

