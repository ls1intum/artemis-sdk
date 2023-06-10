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
 * StudentScoresDTO
 */
@JsonPropertyOrder({
  StudentScoresDTO.JSON_PROPERTY_ABSOLUTE_SCORE,
  StudentScoresDTO.JSON_PROPERTY_RELATIVE_SCORE,
  StudentScoresDTO.JSON_PROPERTY_CURRENT_RELATIVE_SCORE,
  StudentScoresDTO.JSON_PROPERTY_PRESENTATION_SCORE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class StudentScoresDTO {
  public static final String JSON_PROPERTY_ABSOLUTE_SCORE = "absoluteScore";
  private Double absoluteScore;

  public static final String JSON_PROPERTY_RELATIVE_SCORE = "relativeScore";
  private Double relativeScore;

  public static final String JSON_PROPERTY_CURRENT_RELATIVE_SCORE = "currentRelativeScore";
  private Double currentRelativeScore;

  public static final String JSON_PROPERTY_PRESENTATION_SCORE = "presentationScore";
  private Integer presentationScore;

  public StudentScoresDTO() { 
  }

  public StudentScoresDTO absoluteScore(Double absoluteScore) {
    this.absoluteScore = absoluteScore;
    return this;
  }

   /**
   * Get absoluteScore
   * @return absoluteScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAbsoluteScore() {
    return absoluteScore;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsoluteScore(Double absoluteScore) {
    this.absoluteScore = absoluteScore;
  }


  public StudentScoresDTO relativeScore(Double relativeScore) {
    this.relativeScore = relativeScore;
    return this;
  }

   /**
   * Get relativeScore
   * @return relativeScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIVE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRelativeScore() {
    return relativeScore;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeScore(Double relativeScore) {
    this.relativeScore = relativeScore;
  }


  public StudentScoresDTO currentRelativeScore(Double currentRelativeScore) {
    this.currentRelativeScore = currentRelativeScore;
    return this;
  }

   /**
   * Get currentRelativeScore
   * @return currentRelativeScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_RELATIVE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCurrentRelativeScore() {
    return currentRelativeScore;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_RELATIVE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentRelativeScore(Double currentRelativeScore) {
    this.currentRelativeScore = currentRelativeScore;
  }


  public StudentScoresDTO presentationScore(Integer presentationScore) {
    this.presentationScore = presentationScore;
    return this;
  }

   /**
   * Get presentationScore
   * @return presentationScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPresentationScore() {
    return presentationScore;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationScore(Integer presentationScore) {
    this.presentationScore = presentationScore;
  }


  /**
   * Return true if this StudentScoresDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentScoresDTO studentScoresDTO = (StudentScoresDTO) o;
    return Objects.equals(this.absoluteScore, studentScoresDTO.absoluteScore) &&
        Objects.equals(this.relativeScore, studentScoresDTO.relativeScore) &&
        Objects.equals(this.currentRelativeScore, studentScoresDTO.currentRelativeScore) &&
        Objects.equals(this.presentationScore, studentScoresDTO.presentationScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteScore, relativeScore, currentRelativeScore, presentationScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentScoresDTO {\n");
    sb.append("    absoluteScore: ").append(toIndentedString(absoluteScore)).append("\n");
    sb.append("    relativeScore: ").append(toIndentedString(relativeScore)).append("\n");
    sb.append("    currentRelativeScore: ").append(toIndentedString(currentRelativeScore)).append("\n");
    sb.append("    presentationScore: ").append(toIndentedString(presentationScore)).append("\n");
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

