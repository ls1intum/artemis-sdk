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
import de.tum.cit.ase.artemis.sdk.model.StudentScoresDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CourseScoresDTO
 */
@JsonPropertyOrder({
  CourseScoresDTO.JSON_PROPERTY_MAX_POINTS,
  CourseScoresDTO.JSON_PROPERTY_REACHABLE_POINTS,
  CourseScoresDTO.JSON_PROPERTY_STUDENT_SCORES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class CourseScoresDTO {
  public static final String JSON_PROPERTY_MAX_POINTS = "maxPoints";
  private Double maxPoints;

  public static final String JSON_PROPERTY_REACHABLE_POINTS = "reachablePoints";
  private Double reachablePoints;

  public static final String JSON_PROPERTY_STUDENT_SCORES = "studentScores";
  private StudentScoresDTO studentScores;

  public CourseScoresDTO() { 
  }

  public CourseScoresDTO maxPoints(Double maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

   /**
   * Get maxPoints
   * @return maxPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxPoints() {
    return maxPoints;
  }


  @JsonProperty(JSON_PROPERTY_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPoints(Double maxPoints) {
    this.maxPoints = maxPoints;
  }


  public CourseScoresDTO reachablePoints(Double reachablePoints) {
    this.reachablePoints = reachablePoints;
    return this;
  }

   /**
   * Get reachablePoints
   * @return reachablePoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACHABLE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getReachablePoints() {
    return reachablePoints;
  }


  @JsonProperty(JSON_PROPERTY_REACHABLE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachablePoints(Double reachablePoints) {
    this.reachablePoints = reachablePoints;
  }


  public CourseScoresDTO studentScores(StudentScoresDTO studentScores) {
    this.studentScores = studentScores;
    return this;
  }

   /**
   * Get studentScores
   * @return studentScores
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StudentScoresDTO getStudentScores() {
    return studentScores;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentScores(StudentScoresDTO studentScores) {
    this.studentScores = studentScores;
  }


  /**
   * Return true if this CourseScoresDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseScoresDTO courseScoresDTO = (CourseScoresDTO) o;
    return Objects.equals(this.maxPoints, courseScoresDTO.maxPoints) &&
        Objects.equals(this.reachablePoints, courseScoresDTO.reachablePoints) &&
        Objects.equals(this.studentScores, courseScoresDTO.studentScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPoints, reachablePoints, studentScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseScoresDTO {\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    reachablePoints: ").append(toIndentedString(reachablePoints)).append("\n");
    sb.append("    studentScores: ").append(toIndentedString(studentScores)).append("\n");
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
