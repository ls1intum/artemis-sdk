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
import de.tum.cit.ase.artemis.sdk.model.DropLocation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * DropLocationCounter
 */
@JsonPropertyOrder({
  DropLocationCounter.JSON_PROPERTY_ID,
  DropLocationCounter.JSON_PROPERTY_RATED_COUNTER,
  DropLocationCounter.JSON_PROPERTY_UN_RATED_COUNTER,
  DropLocationCounter.JSON_PROPERTY_DROP_LOCATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class DropLocationCounter {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_RATED_COUNTER = "ratedCounter";
  private Integer ratedCounter;

  public static final String JSON_PROPERTY_UN_RATED_COUNTER = "unRatedCounter";
  private Integer unRatedCounter;

  public static final String JSON_PROPERTY_DROP_LOCATION = "dropLocation";
  private DropLocation dropLocation;

  public DropLocationCounter() { 
  }

  public DropLocationCounter id(Long id) {
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


  public DropLocationCounter ratedCounter(Integer ratedCounter) {
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


  public DropLocationCounter unRatedCounter(Integer unRatedCounter) {
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


  public DropLocationCounter dropLocation(DropLocation dropLocation) {
    this.dropLocation = dropLocation;
    return this;
  }

   /**
   * Get dropLocation
   * @return dropLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DROP_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DropLocation getDropLocation() {
    return dropLocation;
  }


  @JsonProperty(JSON_PROPERTY_DROP_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropLocation(DropLocation dropLocation) {
    this.dropLocation = dropLocation;
  }


  /**
   * Return true if this DropLocationCounter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DropLocationCounter dropLocationCounter = (DropLocationCounter) o;
    return Objects.equals(this.id, dropLocationCounter.id) &&
        Objects.equals(this.ratedCounter, dropLocationCounter.ratedCounter) &&
        Objects.equals(this.unRatedCounter, dropLocationCounter.unRatedCounter) &&
        Objects.equals(this.dropLocation, dropLocationCounter.dropLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratedCounter, unRatedCounter, dropLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DropLocationCounter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedCounter: ").append(toIndentedString(ratedCounter)).append("\n");
    sb.append("    unRatedCounter: ").append(toIndentedString(unRatedCounter)).append("\n");
    sb.append("    dropLocation: ").append(toIndentedString(dropLocation)).append("\n");
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

