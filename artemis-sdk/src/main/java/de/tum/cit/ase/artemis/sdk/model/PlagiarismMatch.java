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
 * PlagiarismMatch
 */
@JsonPropertyOrder({
  PlagiarismMatch.JSON_PROPERTY_START_A,
  PlagiarismMatch.JSON_PROPERTY_START_B,
  PlagiarismMatch.JSON_PROPERTY_LENGTH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class PlagiarismMatch {
  public static final String JSON_PROPERTY_START_A = "startA";
  private Integer startA;

  public static final String JSON_PROPERTY_START_B = "startB";
  private Integer startB;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public PlagiarismMatch() { 
  }

  public PlagiarismMatch startA(Integer startA) {
    this.startA = startA;
    return this;
  }

   /**
   * Get startA
   * @return startA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartA() {
    return startA;
  }


  @JsonProperty(JSON_PROPERTY_START_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartA(Integer startA) {
    this.startA = startA;
  }


  public PlagiarismMatch startB(Integer startB) {
    this.startB = startB;
    return this;
  }

   /**
   * Get startB
   * @return startB
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartB() {
    return startB;
  }


  @JsonProperty(JSON_PROPERTY_START_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartB(Integer startB) {
    this.startB = startB;
  }


  public PlagiarismMatch length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Integer length) {
    this.length = length;
  }


  /**
   * Return true if this PlagiarismMatch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismMatch plagiarismMatch = (PlagiarismMatch) o;
    return Objects.equals(this.startA, plagiarismMatch.startA) &&
        Objects.equals(this.startB, plagiarismMatch.startB) &&
        Objects.equals(this.length, plagiarismMatch.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startA, startB, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismMatch {\n");
    sb.append("    startA: ").append(toIndentedString(startA)).append("\n");
    sb.append("    startB: ").append(toIndentedString(startB)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

