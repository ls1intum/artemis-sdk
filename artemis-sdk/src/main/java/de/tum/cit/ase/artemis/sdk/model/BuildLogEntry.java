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
 * BuildLogEntry
 */
@JsonPropertyOrder({
  BuildLogEntry.JSON_PROPERTY_ID,
  BuildLogEntry.JSON_PROPERTY_TIME,
  BuildLogEntry.JSON_PROPERTY_LOG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class BuildLogEntry {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TIME = "time";
  private OffsetDateTime time;

  public static final String JSON_PROPERTY_LOG = "log";
  private String log;

  public BuildLogEntry() { 
  }

  public BuildLogEntry id(Long id) {
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


  public BuildLogEntry time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public BuildLogEntry log(String log) {
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLog() {
    return log;
  }


  @JsonProperty(JSON_PROPERTY_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLog(String log) {
    this.log = log;
  }


  /**
   * Return true if this BuildLogEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildLogEntry buildLogEntry = (BuildLogEntry) o;
    return Objects.equals(this.id, buildLogEntry.id) &&
        Objects.equals(this.time, buildLogEntry.time) &&
        Objects.equals(this.log, buildLogEntry.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

