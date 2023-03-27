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
 * DueDateStat
 */
@JsonPropertyOrder({
  DueDateStat.JSON_PROPERTY_IN_TIME,
  DueDateStat.JSON_PROPERTY_LATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class DueDateStat {
  public static final String JSON_PROPERTY_IN_TIME = "inTime";
  private Long inTime;

  public static final String JSON_PROPERTY_LATE = "late";
  private Long late;

  public DueDateStat() { 
  }

  public DueDateStat inTime(Long inTime) {
    this.inTime = inTime;
    return this;
  }

   /**
   * Get inTime
   * @return inTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInTime() {
    return inTime;
  }


  @JsonProperty(JSON_PROPERTY_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInTime(Long inTime) {
    this.inTime = inTime;
  }


  public DueDateStat late(Long late) {
    this.late = late;
    return this;
  }

   /**
   * Get late
   * @return late
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLate() {
    return late;
  }


  @JsonProperty(JSON_PROPERTY_LATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLate(Long late) {
    this.late = late;
  }


  /**
   * Return true if this DueDateStat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DueDateStat dueDateStat = (DueDateStat) o;
    return Objects.equals(this.inTime, dueDateStat.inTime) &&
        Objects.equals(this.late, dueDateStat.late);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inTime, late);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DueDateStat {\n");
    sb.append("    inTime: ").append(toIndentedString(inTime)).append("\n");
    sb.append("    late: ").append(toIndentedString(late)).append("\n");
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

