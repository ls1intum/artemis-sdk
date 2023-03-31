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
import de.tum.cit.ase.artemis.sdk.model.ShortAnswerSolution;
import de.tum.cit.ase.artemis.sdk.model.ShortAnswerSpot;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ShortAnswerMapping
 */
@JsonPropertyOrder({
  ShortAnswerMapping.JSON_PROPERTY_ID,
  ShortAnswerMapping.JSON_PROPERTY_SHORT_ANSWER_SPOT_INDEX,
  ShortAnswerMapping.JSON_PROPERTY_SHORT_ANSWER_SOLUTION_INDEX,
  ShortAnswerMapping.JSON_PROPERTY_INVALID,
  ShortAnswerMapping.JSON_PROPERTY_SOLUTION,
  ShortAnswerMapping.JSON_PROPERTY_SPOT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ShortAnswerMapping {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SHORT_ANSWER_SPOT_INDEX = "shortAnswerSpotIndex";
  private Integer shortAnswerSpotIndex;

  public static final String JSON_PROPERTY_SHORT_ANSWER_SOLUTION_INDEX = "shortAnswerSolutionIndex";
  private Integer shortAnswerSolutionIndex;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Boolean invalid;

  public static final String JSON_PROPERTY_SOLUTION = "solution";
  private ShortAnswerSolution solution;

  public static final String JSON_PROPERTY_SPOT = "spot";
  private ShortAnswerSpot spot;

  public ShortAnswerMapping() { 
  }

  public ShortAnswerMapping id(Long id) {
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


  public ShortAnswerMapping shortAnswerSpotIndex(Integer shortAnswerSpotIndex) {
    this.shortAnswerSpotIndex = shortAnswerSpotIndex;
    return this;
  }

   /**
   * Get shortAnswerSpotIndex
   * @return shortAnswerSpotIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_ANSWER_SPOT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShortAnswerSpotIndex() {
    return shortAnswerSpotIndex;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_ANSWER_SPOT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortAnswerSpotIndex(Integer shortAnswerSpotIndex) {
    this.shortAnswerSpotIndex = shortAnswerSpotIndex;
  }


  public ShortAnswerMapping shortAnswerSolutionIndex(Integer shortAnswerSolutionIndex) {
    this.shortAnswerSolutionIndex = shortAnswerSolutionIndex;
    return this;
  }

   /**
   * Get shortAnswerSolutionIndex
   * @return shortAnswerSolutionIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_ANSWER_SOLUTION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShortAnswerSolutionIndex() {
    return shortAnswerSolutionIndex;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_ANSWER_SOLUTION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortAnswerSolutionIndex(Integer shortAnswerSolutionIndex) {
    this.shortAnswerSolutionIndex = shortAnswerSolutionIndex;
  }


  public ShortAnswerMapping invalid(Boolean invalid) {
    this.invalid = invalid;
    return this;
  }

   /**
   * Get invalid
   * @return invalid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInvalid() {
    return invalid;
  }


  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalid(Boolean invalid) {
    this.invalid = invalid;
  }


  public ShortAnswerMapping solution(ShortAnswerSolution solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShortAnswerSolution getSolution() {
    return solution;
  }


  @JsonProperty(JSON_PROPERTY_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSolution(ShortAnswerSolution solution) {
    this.solution = solution;
  }


  public ShortAnswerMapping spot(ShortAnswerSpot spot) {
    this.spot = spot;
    return this;
  }

   /**
   * Get spot
   * @return spot
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShortAnswerSpot getSpot() {
    return spot;
  }


  @JsonProperty(JSON_PROPERTY_SPOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpot(ShortAnswerSpot spot) {
    this.spot = spot;
  }


  /**
   * Return true if this ShortAnswerMapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortAnswerMapping shortAnswerMapping = (ShortAnswerMapping) o;
    return Objects.equals(this.id, shortAnswerMapping.id) &&
        Objects.equals(this.shortAnswerSpotIndex, shortAnswerMapping.shortAnswerSpotIndex) &&
        Objects.equals(this.shortAnswerSolutionIndex, shortAnswerMapping.shortAnswerSolutionIndex) &&
        Objects.equals(this.invalid, shortAnswerMapping.invalid) &&
        Objects.equals(this.solution, shortAnswerMapping.solution) &&
        Objects.equals(this.spot, shortAnswerMapping.spot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortAnswerSpotIndex, shortAnswerSolutionIndex, invalid, solution, spot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortAnswerMapping {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortAnswerSpotIndex: ").append(toIndentedString(shortAnswerSpotIndex)).append("\n");
    sb.append("    shortAnswerSolutionIndex: ").append(toIndentedString(shortAnswerSolutionIndex)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    spot: ").append(toIndentedString(spot)).append("\n");
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

