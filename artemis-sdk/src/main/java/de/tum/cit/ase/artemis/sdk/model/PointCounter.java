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
 * PointCounter
 */
@JsonPropertyOrder({
  PointCounter.JSON_PROPERTY_ID,
  PointCounter.JSON_PROPERTY_RATED_COUNTER,
  PointCounter.JSON_PROPERTY_UN_RATED_COUNTER,
  PointCounter.JSON_PROPERTY_POINTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class PointCounter {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_RATED_COUNTER = "ratedCounter";
  private Integer ratedCounter;

  public static final String JSON_PROPERTY_UN_RATED_COUNTER = "unRatedCounter";
  private Integer unRatedCounter;

  public static final String JSON_PROPERTY_POINTS = "points";
  private Double points;

  public PointCounter() { 
  }

  public PointCounter id(Long id) {
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


  public PointCounter ratedCounter(Integer ratedCounter) {
    this.ratedCounter = ratedCounter;
    return this;
  }

   /**
   * Get ratedCounter
   * @return ratedCounter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATED_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRatedCounter() {
    return ratedCounter;
  }


  @JsonProperty(JSON_PROPERTY_RATED_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatedCounter(Integer ratedCounter) {
    this.ratedCounter = ratedCounter;
  }


  public PointCounter unRatedCounter(Integer unRatedCounter) {
    this.unRatedCounter = unRatedCounter;
    return this;
  }

   /**
   * Get unRatedCounter
   * @return unRatedCounter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UN_RATED_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnRatedCounter() {
    return unRatedCounter;
  }


  @JsonProperty(JSON_PROPERTY_UN_RATED_COUNTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnRatedCounter(Integer unRatedCounter) {
    this.unRatedCounter = unRatedCounter;
  }


  public PointCounter points(Double points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(Double points) {
    this.points = points;
  }


  /**
   * Return true if this PointCounter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointCounter pointCounter = (PointCounter) o;
    return Objects.equals(this.id, pointCounter.id) &&
        Objects.equals(this.ratedCounter, pointCounter.ratedCounter) &&
        Objects.equals(this.unRatedCounter, pointCounter.unRatedCounter) &&
        Objects.equals(this.points, pointCounter.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratedCounter, unRatedCounter, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointCounter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedCounter: ").append(toIndentedString(ratedCounter)).append("\n");
    sb.append("    unRatedCounter: ").append(toIndentedString(unRatedCounter)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

