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
 * TutorialGroupStatusDTO
 */
@JsonPropertyOrder({
  TutorialGroupStatusDTO.JSON_PROPERTY_STATUS_EXPLANATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class TutorialGroupStatusDTO {
  public static final String JSON_PROPERTY_STATUS_EXPLANATION = "status_explanation";
  private String statusExplanation;

  public TutorialGroupStatusDTO() { 
  }

  public TutorialGroupStatusDTO statusExplanation(String statusExplanation) {
    this.statusExplanation = statusExplanation;
    return this;
  }

   /**
   * Get statusExplanation
   * @return statusExplanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusExplanation() {
    return statusExplanation;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusExplanation(String statusExplanation) {
    this.statusExplanation = statusExplanation;
  }


  /**
   * Return true if this TutorialGroupStatusDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupStatusDTO tutorialGroupStatusDTO = (TutorialGroupStatusDTO) o;
    return Objects.equals(this.statusExplanation, tutorialGroupStatusDTO.statusExplanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusExplanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupStatusDTO {\n");
    sb.append("    statusExplanation: ").append(toIndentedString(statusExplanation)).append("\n");
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

