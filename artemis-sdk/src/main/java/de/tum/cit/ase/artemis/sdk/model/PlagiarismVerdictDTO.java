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
 * PlagiarismVerdictDTO
 */
@JsonPropertyOrder({
  PlagiarismVerdictDTO.JSON_PROPERTY_VERDICT,
  PlagiarismVerdictDTO.JSON_PROPERTY_VERDICT_MESSAGE,
  PlagiarismVerdictDTO.JSON_PROPERTY_VERDICT_POINT_DEDUCTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class PlagiarismVerdictDTO {
  /**
   * Gets or Sets verdict
   */
  public enum VerdictEnum {
    PLAGIARISM("PLAGIARISM"),
    
    POINT_DEDUCTION("POINT_DEDUCTION"),
    
    WARNING("WARNING"),
    
    NO_PLAGIARISM("NO_PLAGIARISM");

    private String value;

    VerdictEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerdictEnum fromValue(String value) {
      for (VerdictEnum b : VerdictEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERDICT = "verdict";
  private VerdictEnum verdict;

  public static final String JSON_PROPERTY_VERDICT_MESSAGE = "verdictMessage";
  private String verdictMessage;

  public static final String JSON_PROPERTY_VERDICT_POINT_DEDUCTION = "verdictPointDeduction";
  private Integer verdictPointDeduction;

  public PlagiarismVerdictDTO() { 
  }

  public PlagiarismVerdictDTO verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

   /**
   * Get verdict
   * @return verdict
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VerdictEnum getVerdict() {
    return verdict;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }


  public PlagiarismVerdictDTO verdictMessage(String verdictMessage) {
    this.verdictMessage = verdictMessage;
    return this;
  }

   /**
   * Get verdictMessage
   * @return verdictMessage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerdictMessage() {
    return verdictMessage;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdictMessage(String verdictMessage) {
    this.verdictMessage = verdictMessage;
  }


  public PlagiarismVerdictDTO verdictPointDeduction(Integer verdictPointDeduction) {
    this.verdictPointDeduction = verdictPointDeduction;
    return this;
  }

   /**
   * Get verdictPointDeduction
   * @return verdictPointDeduction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT_POINT_DEDUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVerdictPointDeduction() {
    return verdictPointDeduction;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT_POINT_DEDUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdictPointDeduction(Integer verdictPointDeduction) {
    this.verdictPointDeduction = verdictPointDeduction;
  }


  /**
   * Return true if this PlagiarismVerdictDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismVerdictDTO plagiarismVerdictDTO = (PlagiarismVerdictDTO) o;
    return Objects.equals(this.verdict, plagiarismVerdictDTO.verdict) &&
        Objects.equals(this.verdictMessage, plagiarismVerdictDTO.verdictMessage) &&
        Objects.equals(this.verdictPointDeduction, plagiarismVerdictDTO.verdictPointDeduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verdict, verdictMessage, verdictPointDeduction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismVerdictDTO {\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    verdictMessage: ").append(toIndentedString(verdictMessage)).append("\n");
    sb.append("    verdictPointDeduction: ").append(toIndentedString(verdictPointDeduction)).append("\n");
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
