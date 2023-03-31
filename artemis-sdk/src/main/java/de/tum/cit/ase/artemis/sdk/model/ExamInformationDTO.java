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
 * ExamInformationDTO
 */
@JsonPropertyOrder({
  ExamInformationDTO.JSON_PROPERTY_LATEST_INDIVIDUAL_END_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ExamInformationDTO {
  public static final String JSON_PROPERTY_LATEST_INDIVIDUAL_END_DATE = "latestIndividualEndDate";
  private OffsetDateTime latestIndividualEndDate;

  public ExamInformationDTO() { 
  }

  public ExamInformationDTO latestIndividualEndDate(OffsetDateTime latestIndividualEndDate) {
    this.latestIndividualEndDate = latestIndividualEndDate;
    return this;
  }

   /**
   * Get latestIndividualEndDate
   * @return latestIndividualEndDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_INDIVIDUAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLatestIndividualEndDate() {
    return latestIndividualEndDate;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_INDIVIDUAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestIndividualEndDate(OffsetDateTime latestIndividualEndDate) {
    this.latestIndividualEndDate = latestIndividualEndDate;
  }


  /**
   * Return true if this ExamInformationDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExamInformationDTO examInformationDTO = (ExamInformationDTO) o;
    return Objects.equals(this.latestIndividualEndDate, examInformationDTO.latestIndividualEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestIndividualEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamInformationDTO {\n");
    sb.append("    latestIndividualEndDate: ").append(toIndentedString(latestIndividualEndDate)).append("\n");
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

