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
 * GradeDTO
 */
@JsonPropertyOrder({
  GradeDTO.JSON_PROPERTY_GRADE_NAME,
  GradeDTO.JSON_PROPERTY_IS_PASSING_GRADE,
  GradeDTO.JSON_PROPERTY_GRADE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class GradeDTO {
  public static final String JSON_PROPERTY_GRADE_NAME = "gradeName";
  private String gradeName;

  public static final String JSON_PROPERTY_IS_PASSING_GRADE = "isPassingGrade";
  private Boolean isPassingGrade;

  /**
   * Gets or Sets gradeType
   */
  public enum GradeTypeEnum {
    NONE("NONE"),
    
    BONUS("BONUS"),
    
    GRADE("GRADE");

    private String value;

    GradeTypeEnum(String value) {
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
    public static GradeTypeEnum fromValue(String value) {
      for (GradeTypeEnum b : GradeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GRADE_TYPE = "gradeType";
  private GradeTypeEnum gradeType;

  public GradeDTO() { 
  }

  public GradeDTO gradeName(String gradeName) {
    this.gradeName = gradeName;
    return this;
  }

   /**
   * Get gradeName
   * @return gradeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGradeName() {
    return gradeName;
  }


  @JsonProperty(JSON_PROPERTY_GRADE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradeName(String gradeName) {
    this.gradeName = gradeName;
  }


  public GradeDTO isPassingGrade(Boolean isPassingGrade) {
    this.isPassingGrade = isPassingGrade;
    return this;
  }

   /**
   * Get isPassingGrade
   * @return isPassingGrade
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PASSING_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPassingGrade() {
    return isPassingGrade;
  }


  @JsonProperty(JSON_PROPERTY_IS_PASSING_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPassingGrade(Boolean isPassingGrade) {
    this.isPassingGrade = isPassingGrade;
  }


  public GradeDTO gradeType(GradeTypeEnum gradeType) {
    this.gradeType = gradeType;
    return this;
  }

   /**
   * Get gradeType
   * @return gradeType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GradeTypeEnum getGradeType() {
    return gradeType;
  }


  @JsonProperty(JSON_PROPERTY_GRADE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradeType(GradeTypeEnum gradeType) {
    this.gradeType = gradeType;
  }


  /**
   * Return true if this GradeDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeDTO gradeDTO = (GradeDTO) o;
    return Objects.equals(this.gradeName, gradeDTO.gradeName) &&
        Objects.equals(this.isPassingGrade, gradeDTO.isPassingGrade) &&
        Objects.equals(this.gradeType, gradeDTO.gradeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gradeName, isPassingGrade, gradeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeDTO {\n");
    sb.append("    gradeName: ").append(toIndentedString(gradeName)).append("\n");
    sb.append("    isPassingGrade: ").append(toIndentedString(isPassingGrade)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
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

