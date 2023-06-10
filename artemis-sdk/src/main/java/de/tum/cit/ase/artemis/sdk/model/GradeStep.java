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
import de.tum.cit.ase.artemis.sdk.model.GradingScale;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * GradeStep
 */
@JsonPropertyOrder({
  GradeStep.JSON_PROPERTY_ID,
  GradeStep.JSON_PROPERTY_GRADING_SCALE,
  GradeStep.JSON_PROPERTY_LOWER_BOUND_PERCENTAGE,
  GradeStep.JSON_PROPERTY_LOWER_BOUND_INCLUSIVE,
  GradeStep.JSON_PROPERTY_UPPER_BOUND_PERCENTAGE,
  GradeStep.JSON_PROPERTY_UPPER_BOUND_INCLUSIVE,
  GradeStep.JSON_PROPERTY_GRADE_NAME,
  GradeStep.JSON_PROPERTY_IS_PASSING_GRADE,
  GradeStep.JSON_PROPERTY_NUMERIC_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class GradeStep {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_GRADING_SCALE = "gradingScale";
  private GradingScale gradingScale;

  public static final String JSON_PROPERTY_LOWER_BOUND_PERCENTAGE = "lowerBoundPercentage";
  private Double lowerBoundPercentage;

  public static final String JSON_PROPERTY_LOWER_BOUND_INCLUSIVE = "lowerBoundInclusive";
  private Boolean lowerBoundInclusive;

  public static final String JSON_PROPERTY_UPPER_BOUND_PERCENTAGE = "upperBoundPercentage";
  private Double upperBoundPercentage;

  public static final String JSON_PROPERTY_UPPER_BOUND_INCLUSIVE = "upperBoundInclusive";
  private Boolean upperBoundInclusive;

  public static final String JSON_PROPERTY_GRADE_NAME = "gradeName";
  private String gradeName;

  public static final String JSON_PROPERTY_IS_PASSING_GRADE = "isPassingGrade";
  private Boolean isPassingGrade;

  public static final String JSON_PROPERTY_NUMERIC_VALUE = "numericValue";
  private Double numericValue;

  public GradeStep() { 
  }

  public GradeStep id(Long id) {
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


  public GradeStep gradingScale(GradingScale gradingScale) {
    this.gradingScale = gradingScale;
    return this;
  }

   /**
   * Get gradingScale
   * @return gradingScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GradingScale getGradingScale() {
    return gradingScale;
  }


  @JsonProperty(JSON_PROPERTY_GRADING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradingScale(GradingScale gradingScale) {
    this.gradingScale = gradingScale;
  }


  public GradeStep lowerBoundPercentage(Double lowerBoundPercentage) {
    this.lowerBoundPercentage = lowerBoundPercentage;
    return this;
  }

   /**
   * Get lowerBoundPercentage
   * @return lowerBoundPercentage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOWER_BOUND_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLowerBoundPercentage() {
    return lowerBoundPercentage;
  }


  @JsonProperty(JSON_PROPERTY_LOWER_BOUND_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowerBoundPercentage(Double lowerBoundPercentage) {
    this.lowerBoundPercentage = lowerBoundPercentage;
  }


  public GradeStep lowerBoundInclusive(Boolean lowerBoundInclusive) {
    this.lowerBoundInclusive = lowerBoundInclusive;
    return this;
  }

   /**
   * Get lowerBoundInclusive
   * @return lowerBoundInclusive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOWER_BOUND_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLowerBoundInclusive() {
    return lowerBoundInclusive;
  }


  @JsonProperty(JSON_PROPERTY_LOWER_BOUND_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowerBoundInclusive(Boolean lowerBoundInclusive) {
    this.lowerBoundInclusive = lowerBoundInclusive;
  }


  public GradeStep upperBoundPercentage(Double upperBoundPercentage) {
    this.upperBoundPercentage = upperBoundPercentage;
    return this;
  }

   /**
   * Get upperBoundPercentage
   * @return upperBoundPercentage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_BOUND_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getUpperBoundPercentage() {
    return upperBoundPercentage;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_BOUND_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperBoundPercentage(Double upperBoundPercentage) {
    this.upperBoundPercentage = upperBoundPercentage;
  }


  public GradeStep upperBoundInclusive(Boolean upperBoundInclusive) {
    this.upperBoundInclusive = upperBoundInclusive;
    return this;
  }

   /**
   * Get upperBoundInclusive
   * @return upperBoundInclusive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_BOUND_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpperBoundInclusive() {
    return upperBoundInclusive;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_BOUND_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperBoundInclusive(Boolean upperBoundInclusive) {
    this.upperBoundInclusive = upperBoundInclusive;
  }


  public GradeStep gradeName(String gradeName) {
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


  public GradeStep isPassingGrade(Boolean isPassingGrade) {
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


  public GradeStep numericValue(Double numericValue) {
    this.numericValue = numericValue;
    return this;
  }

   /**
   * Get numericValue
   * @return numericValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMERIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNumericValue() {
    return numericValue;
  }


  @JsonProperty(JSON_PROPERTY_NUMERIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumericValue(Double numericValue) {
    this.numericValue = numericValue;
  }


  /**
   * Return true if this GradeStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeStep gradeStep = (GradeStep) o;
    return Objects.equals(this.id, gradeStep.id) &&
        Objects.equals(this.gradingScale, gradeStep.gradingScale) &&
        Objects.equals(this.lowerBoundPercentage, gradeStep.lowerBoundPercentage) &&
        Objects.equals(this.lowerBoundInclusive, gradeStep.lowerBoundInclusive) &&
        Objects.equals(this.upperBoundPercentage, gradeStep.upperBoundPercentage) &&
        Objects.equals(this.upperBoundInclusive, gradeStep.upperBoundInclusive) &&
        Objects.equals(this.gradeName, gradeStep.gradeName) &&
        Objects.equals(this.isPassingGrade, gradeStep.isPassingGrade) &&
        Objects.equals(this.numericValue, gradeStep.numericValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gradingScale, lowerBoundPercentage, lowerBoundInclusive, upperBoundPercentage, upperBoundInclusive, gradeName, isPassingGrade, numericValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeStep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gradingScale: ").append(toIndentedString(gradingScale)).append("\n");
    sb.append("    lowerBoundPercentage: ").append(toIndentedString(lowerBoundPercentage)).append("\n");
    sb.append("    lowerBoundInclusive: ").append(toIndentedString(lowerBoundInclusive)).append("\n");
    sb.append("    upperBoundPercentage: ").append(toIndentedString(upperBoundPercentage)).append("\n");
    sb.append("    upperBoundInclusive: ").append(toIndentedString(upperBoundInclusive)).append("\n");
    sb.append("    gradeName: ").append(toIndentedString(gradeName)).append("\n");
    sb.append("    isPassingGrade: ").append(toIndentedString(isPassingGrade)).append("\n");
    sb.append("    numericValue: ").append(toIndentedString(numericValue)).append("\n");
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

