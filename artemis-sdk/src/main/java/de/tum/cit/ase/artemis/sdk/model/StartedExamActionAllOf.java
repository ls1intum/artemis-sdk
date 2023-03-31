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
 * StartedExamActionAllOf
 */
@JsonPropertyOrder({
  StartedExamActionAllOf.JSON_PROPERTY_SESSION_ID
})
@JsonTypeName("StartedExamAction_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class StartedExamActionAllOf {
  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private Long sessionId;

  public StartedExamActionAllOf() { 
  }

  public StartedExamActionAllOf sessionId(Long sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionId(Long sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Return true if this StartedExamAction_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartedExamActionAllOf startedExamActionAllOf = (StartedExamActionAllOf) o;
    return Objects.equals(this.sessionId, startedExamActionAllOf.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartedExamActionAllOf {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

