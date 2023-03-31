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
import de.tum.cit.ase.artemis.sdk.model.TestCaseStats;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ProgrammingExerciseGradingStatisticsDTO
 */
@JsonPropertyOrder({
  ProgrammingExerciseGradingStatisticsDTO.JSON_PROPERTY_NUM_PARTICIPATIONS,
  ProgrammingExerciseGradingStatisticsDTO.JSON_PROPERTY_TEST_CASE_STATS_MAP,
  ProgrammingExerciseGradingStatisticsDTO.JSON_PROPERTY_CATEGORY_ISSUES_MAP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ProgrammingExerciseGradingStatisticsDTO {
  public static final String JSON_PROPERTY_NUM_PARTICIPATIONS = "numParticipations";
  private Integer numParticipations;

  public static final String JSON_PROPERTY_TEST_CASE_STATS_MAP = "testCaseStatsMap";
  private Map<String, TestCaseStats> testCaseStatsMap = new HashMap<>();

  public static final String JSON_PROPERTY_CATEGORY_ISSUES_MAP = "categoryIssuesMap";
  private Map<String, Map<String, Integer>> categoryIssuesMap = new HashMap<>();

  public ProgrammingExerciseGradingStatisticsDTO() { 
  }

  public ProgrammingExerciseGradingStatisticsDTO numParticipations(Integer numParticipations) {
    this.numParticipations = numParticipations;
    return this;
  }

   /**
   * Get numParticipations
   * @return numParticipations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PARTICIPATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumParticipations() {
    return numParticipations;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PARTICIPATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumParticipations(Integer numParticipations) {
    this.numParticipations = numParticipations;
  }


  public ProgrammingExerciseGradingStatisticsDTO testCaseStatsMap(Map<String, TestCaseStats> testCaseStatsMap) {
    this.testCaseStatsMap = testCaseStatsMap;
    return this;
  }

  public ProgrammingExerciseGradingStatisticsDTO putTestCaseStatsMapItem(String key, TestCaseStats testCaseStatsMapItem) {
    if (this.testCaseStatsMap == null) {
      this.testCaseStatsMap = new HashMap<>();
    }
    this.testCaseStatsMap.put(key, testCaseStatsMapItem);
    return this;
  }

   /**
   * Get testCaseStatsMap
   * @return testCaseStatsMap
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASE_STATS_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, TestCaseStats> getTestCaseStatsMap() {
    return testCaseStatsMap;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASE_STATS_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCaseStatsMap(Map<String, TestCaseStats> testCaseStatsMap) {
    this.testCaseStatsMap = testCaseStatsMap;
  }


  public ProgrammingExerciseGradingStatisticsDTO categoryIssuesMap(Map<String, Map<String, Integer>> categoryIssuesMap) {
    this.categoryIssuesMap = categoryIssuesMap;
    return this;
  }

  public ProgrammingExerciseGradingStatisticsDTO putCategoryIssuesMapItem(String key, Map<String, Integer> categoryIssuesMapItem) {
    if (this.categoryIssuesMap == null) {
      this.categoryIssuesMap = new HashMap<>();
    }
    this.categoryIssuesMap.put(key, categoryIssuesMapItem);
    return this;
  }

   /**
   * Get categoryIssuesMap
   * @return categoryIssuesMap
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_ISSUES_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Map<String, Integer>> getCategoryIssuesMap() {
    return categoryIssuesMap;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ISSUES_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryIssuesMap(Map<String, Map<String, Integer>> categoryIssuesMap) {
    this.categoryIssuesMap = categoryIssuesMap;
  }


  /**
   * Return true if this ProgrammingExerciseGradingStatisticsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseGradingStatisticsDTO programmingExerciseGradingStatisticsDTO = (ProgrammingExerciseGradingStatisticsDTO) o;
    return Objects.equals(this.numParticipations, programmingExerciseGradingStatisticsDTO.numParticipations) &&
        Objects.equals(this.testCaseStatsMap, programmingExerciseGradingStatisticsDTO.testCaseStatsMap) &&
        Objects.equals(this.categoryIssuesMap, programmingExerciseGradingStatisticsDTO.categoryIssuesMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numParticipations, testCaseStatsMap, categoryIssuesMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseGradingStatisticsDTO {\n");
    sb.append("    numParticipations: ").append(toIndentedString(numParticipations)).append("\n");
    sb.append("    testCaseStatsMap: ").append(toIndentedString(testCaseStatsMap)).append("\n");
    sb.append("    categoryIssuesMap: ").append(toIndentedString(categoryIssuesMap)).append("\n");
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

