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
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ConsistencyErrorDTO
 */
@JsonPropertyOrder({
  ConsistencyErrorDTO.JSON_PROPERTY_PROGRAMMING_EXERCISE,
  ConsistencyErrorDTO.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ConsistencyErrorDTO {
  public static final String JSON_PROPERTY_PROGRAMMING_EXERCISE = "programmingExercise";
  private ProgrammingExercise programmingExercise;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    VCS_PROJECT_MISSING("VCS_PROJECT_MISSING"),
    
    TEMPLATE_REPO_MISSING("TEMPLATE_REPO_MISSING"),
    
    SOLUTION_REPO_MISSING("SOLUTION_REPO_MISSING"),
    
    TEST_REPO_MISSING("TEST_REPO_MISSING"),
    
    TEMPLATE_BUILD_PLAN_MISSING("TEMPLATE_BUILD_PLAN_MISSING"),
    
    SOLUTION_BUILD_PLAN_MISSING("SOLUTION_BUILD_PLAN_MISSING");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public ConsistencyErrorDTO() { 
  }

  public ConsistencyErrorDTO programmingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
    return this;
  }

   /**
   * Get programmingExercise
   * @return programmingExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProgrammingExercise getProgrammingExercise() {
    return programmingExercise;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgrammingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
  }


  public ConsistencyErrorDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this ConsistencyErrorDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistencyErrorDTO consistencyErrorDTO = (ConsistencyErrorDTO) o;
    return Objects.equals(this.programmingExercise, consistencyErrorDTO.programmingExercise) &&
        Objects.equals(this.type, consistencyErrorDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programmingExercise, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyErrorDTO {\n");
    sb.append("    programmingExercise: ").append(toIndentedString(programmingExercise)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

