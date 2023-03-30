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
 * LocalTime
 */
@JsonPropertyOrder({
  LocalTime.JSON_PROPERTY_HOUR,
  LocalTime.JSON_PROPERTY_MINUTE,
  LocalTime.JSON_PROPERTY_SECOND,
  LocalTime.JSON_PROPERTY_NANO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class LocalTime {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private Integer hour;

  public static final String JSON_PROPERTY_MINUTE = "minute";
  private Integer minute;

  public static final String JSON_PROPERTY_SECOND = "second";
  private Integer second;

  public static final String JSON_PROPERTY_NANO = "nano";
  private Integer nano;

  public LocalTime() { 
  }

  public LocalTime hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public LocalTime minute(Integer minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinute() {
    return minute;
  }


  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  public LocalTime second(Integer second) {
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSecond() {
    return second;
  }


  @JsonProperty(JSON_PROPERTY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecond(Integer second) {
    this.second = second;
  }


  public LocalTime nano(Integer nano) {
    this.nano = nano;
    return this;
  }

   /**
   * Get nano
   * @return nano
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NANO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNano() {
    return nano;
  }


  @JsonProperty(JSON_PROPERTY_NANO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNano(Integer nano) {
    this.nano = nano;
  }


  /**
   * Return true if this LocalTime object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalTime localTime = (LocalTime) o;
    return Objects.equals(this.hour, localTime.hour) &&
        Objects.equals(this.minute, localTime.minute) &&
        Objects.equals(this.second, localTime.second) &&
        Objects.equals(this.nano, localTime.nano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute, second, nano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTime {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
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

