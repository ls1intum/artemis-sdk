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
 * ShortAnswerSpot
 */
@JsonPropertyOrder({
  ShortAnswerSpot.JSON_PROPERTY_ID,
  ShortAnswerSpot.JSON_PROPERTY_SPOT_NR,
  ShortAnswerSpot.JSON_PROPERTY_WIDTH,
  ShortAnswerSpot.JSON_PROPERTY_INVALID,
  ShortAnswerSpot.JSON_PROPERTY_TEMP_I_D
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class ShortAnswerSpot {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SPOT_NR = "spotNr";
  private Integer spotNr;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Boolean invalid;

  public static final String JSON_PROPERTY_TEMP_I_D = "tempID";
  private Long tempID;

  public ShortAnswerSpot() { 
  }

  public ShortAnswerSpot id(Long id) {
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


  public ShortAnswerSpot spotNr(Integer spotNr) {
    this.spotNr = spotNr;
    return this;
  }

   /**
   * Get spotNr
   * @return spotNr
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPOT_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSpotNr() {
    return spotNr;
  }


  @JsonProperty(JSON_PROPERTY_SPOT_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpotNr(Integer spotNr) {
    this.spotNr = spotNr;
  }


  public ShortAnswerSpot width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public ShortAnswerSpot invalid(Boolean invalid) {
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


  public ShortAnswerSpot tempID(Long tempID) {
    this.tempID = tempID;
    return this;
  }

   /**
   * Get tempID
   * @return tempID
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMP_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTempID() {
    return tempID;
  }


  @JsonProperty(JSON_PROPERTY_TEMP_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTempID(Long tempID) {
    this.tempID = tempID;
  }


  /**
   * Return true if this ShortAnswerSpot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortAnswerSpot shortAnswerSpot = (ShortAnswerSpot) o;
    return Objects.equals(this.id, shortAnswerSpot.id) &&
        Objects.equals(this.spotNr, shortAnswerSpot.spotNr) &&
        Objects.equals(this.width, shortAnswerSpot.width) &&
        Objects.equals(this.invalid, shortAnswerSpot.invalid) &&
        Objects.equals(this.tempID, shortAnswerSpot.tempID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spotNr, width, invalid, tempID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortAnswerSpot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spotNr: ").append(toIndentedString(spotNr)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    tempID: ").append(toIndentedString(tempID)).append("\n");
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

