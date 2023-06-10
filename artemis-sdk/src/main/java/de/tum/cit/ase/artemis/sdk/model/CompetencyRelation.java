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
import de.tum.cit.ase.artemis.sdk.model.Competency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CompetencyRelation
 */
@JsonPropertyOrder({
  CompetencyRelation.JSON_PROPERTY_ID,
  CompetencyRelation.JSON_PROPERTY_TAIL_COMPETENCY,
  CompetencyRelation.JSON_PROPERTY_HEAD_COMPETENCY,
  CompetencyRelation.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class CompetencyRelation {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TAIL_COMPETENCY = "tailCompetency";
  private Competency tailCompetency;

  public static final String JSON_PROPERTY_HEAD_COMPETENCY = "headCompetency";
  private Competency headCompetency;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    RELATES("RELATES"),
    
    ASSUMES("ASSUMES"),
    
    EXTENDS("EXTENDS"),
    
    MATCHES("MATCHES");

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

  public CompetencyRelation() { 
  }

  public CompetencyRelation id(Long id) {
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


  public CompetencyRelation tailCompetency(Competency tailCompetency) {
    this.tailCompetency = tailCompetency;
    return this;
  }

   /**
   * Get tailCompetency
   * @return tailCompetency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAIL_COMPETENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Competency getTailCompetency() {
    return tailCompetency;
  }


  @JsonProperty(JSON_PROPERTY_TAIL_COMPETENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailCompetency(Competency tailCompetency) {
    this.tailCompetency = tailCompetency;
  }


  public CompetencyRelation headCompetency(Competency headCompetency) {
    this.headCompetency = headCompetency;
    return this;
  }

   /**
   * Get headCompetency
   * @return headCompetency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAD_COMPETENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Competency getHeadCompetency() {
    return headCompetency;
  }


  @JsonProperty(JSON_PROPERTY_HEAD_COMPETENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadCompetency(Competency headCompetency) {
    this.headCompetency = headCompetency;
  }


  public CompetencyRelation type(TypeEnum type) {
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
   * Return true if this CompetencyRelation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetencyRelation competencyRelation = (CompetencyRelation) o;
    return Objects.equals(this.id, competencyRelation.id) &&
        Objects.equals(this.tailCompetency, competencyRelation.tailCompetency) &&
        Objects.equals(this.headCompetency, competencyRelation.headCompetency) &&
        Objects.equals(this.type, competencyRelation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tailCompetency, headCompetency, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetencyRelation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tailCompetency: ").append(toIndentedString(tailCompetency)).append("\n");
    sb.append("    headCompetency: ").append(toIndentedString(headCompetency)).append("\n");
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
