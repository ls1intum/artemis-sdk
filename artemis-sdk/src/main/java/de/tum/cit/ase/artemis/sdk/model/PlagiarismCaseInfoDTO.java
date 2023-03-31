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
 * PlagiarismCaseInfoDTO
 */
@JsonPropertyOrder({
  PlagiarismCaseInfoDTO.JSON_PROPERTY_ID,
  PlagiarismCaseInfoDTO.JSON_PROPERTY_VERDICT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class PlagiarismCaseInfoDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

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

  public PlagiarismCaseInfoDTO() { 
  }

  public PlagiarismCaseInfoDTO id(Long id) {
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


  public PlagiarismCaseInfoDTO verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

   /**
   * Get verdict
   * @return verdict
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerdictEnum getVerdict() {
    return verdict;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }


  /**
   * Return true if this PlagiarismCaseInfoDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismCaseInfoDTO plagiarismCaseInfoDTO = (PlagiarismCaseInfoDTO) o;
    return Objects.equals(this.id, plagiarismCaseInfoDTO.id) &&
        Objects.equals(this.verdict, plagiarismCaseInfoDTO.verdict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, verdict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismCaseInfoDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
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

