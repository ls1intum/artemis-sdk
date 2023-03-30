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
 * TestCaseStats
 */
@JsonPropertyOrder({
  TestCaseStats.JSON_PROPERTY_NUM_PASSED,
  TestCaseStats.JSON_PROPERTY_NUM_FAILED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class TestCaseStats {
  public static final String JSON_PROPERTY_NUM_PASSED = "numPassed";
  private Integer numPassed;

  public static final String JSON_PROPERTY_NUM_FAILED = "numFailed";
  private Integer numFailed;

  public TestCaseStats() { 
  }

  public TestCaseStats numPassed(Integer numPassed) {
    this.numPassed = numPassed;
    return this;
  }

   /**
   * Get numPassed
   * @return numPassed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPassed() {
    return numPassed;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPassed(Integer numPassed) {
    this.numPassed = numPassed;
  }


  public TestCaseStats numFailed(Integer numFailed) {
    this.numFailed = numFailed;
    return this;
  }

   /**
   * Get numFailed
   * @return numFailed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumFailed() {
    return numFailed;
  }


  @JsonProperty(JSON_PROPERTY_NUM_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumFailed(Integer numFailed) {
    this.numFailed = numFailed;
  }


  /**
   * Return true if this TestCaseStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCaseStats testCaseStats = (TestCaseStats) o;
    return Objects.equals(this.numPassed, testCaseStats.numPassed) &&
        Objects.equals(this.numFailed, testCaseStats.numFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPassed, numFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCaseStats {\n");
    sb.append("    numPassed: ").append(toIndentedString(numPassed)).append("\n");
    sb.append("    numFailed: ").append(toIndentedString(numFailed)).append("\n");
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

