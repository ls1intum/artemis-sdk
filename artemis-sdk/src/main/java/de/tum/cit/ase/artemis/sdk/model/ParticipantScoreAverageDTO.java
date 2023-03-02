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
 * ParticipantScoreAverageDTO
 */
@JsonPropertyOrder({
  ParticipantScoreAverageDTO.JSON_PROPERTY_NAME,
  ParticipantScoreAverageDTO.JSON_PROPERTY_AVERAGE_SCORE,
  ParticipantScoreAverageDTO.JSON_PROPERTY_AVERAGE_RATED_SCORE,
  ParticipantScoreAverageDTO.JSON_PROPERTY_AVERAGE_POINTS,
  ParticipantScoreAverageDTO.JSON_PROPERTY_AVERAGE_RATED_POINTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ParticipantScoreAverageDTO {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AVERAGE_SCORE = "averageScore";
  private Double averageScore;

  public static final String JSON_PROPERTY_AVERAGE_RATED_SCORE = "averageRatedScore";
  private Double averageRatedScore;

  public static final String JSON_PROPERTY_AVERAGE_POINTS = "averagePoints";
  private Double averagePoints;

  public static final String JSON_PROPERTY_AVERAGE_RATED_POINTS = "averageRatedPoints";
  private Double averageRatedPoints;

  public ParticipantScoreAverageDTO() { 
  }

  public ParticipantScoreAverageDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ParticipantScoreAverageDTO averageScore(Double averageScore) {
    this.averageScore = averageScore;
    return this;
  }

   /**
   * Get averageScore
   * @return averageScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageScore() {
    return averageScore;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScore(Double averageScore) {
    this.averageScore = averageScore;
  }


  public ParticipantScoreAverageDTO averageRatedScore(Double averageRatedScore) {
    this.averageRatedScore = averageRatedScore;
    return this;
  }

   /**
   * Get averageRatedScore
   * @return averageRatedScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_RATED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageRatedScore() {
    return averageRatedScore;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_RATED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageRatedScore(Double averageRatedScore) {
    this.averageRatedScore = averageRatedScore;
  }


  public ParticipantScoreAverageDTO averagePoints(Double averagePoints) {
    this.averagePoints = averagePoints;
    return this;
  }

   /**
   * Get averagePoints
   * @return averagePoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAveragePoints() {
    return averagePoints;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAveragePoints(Double averagePoints) {
    this.averagePoints = averagePoints;
  }


  public ParticipantScoreAverageDTO averageRatedPoints(Double averageRatedPoints) {
    this.averageRatedPoints = averageRatedPoints;
    return this;
  }

   /**
   * Get averageRatedPoints
   * @return averageRatedPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_RATED_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageRatedPoints() {
    return averageRatedPoints;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_RATED_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageRatedPoints(Double averageRatedPoints) {
    this.averageRatedPoints = averageRatedPoints;
  }


  /**
   * Return true if this ParticipantScoreAverageDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantScoreAverageDTO participantScoreAverageDTO = (ParticipantScoreAverageDTO) o;
    return Objects.equals(this.name, participantScoreAverageDTO.name) &&
        Objects.equals(this.averageScore, participantScoreAverageDTO.averageScore) &&
        Objects.equals(this.averageRatedScore, participantScoreAverageDTO.averageRatedScore) &&
        Objects.equals(this.averagePoints, participantScoreAverageDTO.averagePoints) &&
        Objects.equals(this.averageRatedPoints, participantScoreAverageDTO.averageRatedPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, averageScore, averageRatedScore, averagePoints, averageRatedPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantScoreAverageDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    averageRatedScore: ").append(toIndentedString(averageRatedScore)).append("\n");
    sb.append("    averagePoints: ").append(toIndentedString(averagePoints)).append("\n");
    sb.append("    averageRatedPoints: ").append(toIndentedString(averageRatedPoints)).append("\n");
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

