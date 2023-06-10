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
 * CourseCompetencyProgressDTO
 */
@JsonPropertyOrder({
  CourseCompetencyProgressDTO.JSON_PROPERTY_COMPETENCY_ID,
  CourseCompetencyProgressDTO.JSON_PROPERTY_NUMBER_OF_STUDENTS,
  CourseCompetencyProgressDTO.JSON_PROPERTY_NUMBER_OF_MASTERED_STUDENTS,
  CourseCompetencyProgressDTO.JSON_PROPERTY_AVERAGE_STUDENT_SCORE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class CourseCompetencyProgressDTO {
  public static final String JSON_PROPERTY_COMPETENCY_ID = "competencyId";
  private Long competencyId;

  public static final String JSON_PROPERTY_NUMBER_OF_STUDENTS = "numberOfStudents";
  private Long numberOfStudents;

  public static final String JSON_PROPERTY_NUMBER_OF_MASTERED_STUDENTS = "numberOfMasteredStudents";
  private Long numberOfMasteredStudents;

  public static final String JSON_PROPERTY_AVERAGE_STUDENT_SCORE = "averageStudentScore";
  private Double averageStudentScore;

  public CourseCompetencyProgressDTO() { 
  }

  public CourseCompetencyProgressDTO competencyId(Long competencyId) {
    this.competencyId = competencyId;
    return this;
  }

   /**
   * Get competencyId
   * @return competencyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPETENCY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCompetencyId() {
    return competencyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPETENCY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompetencyId(Long competencyId) {
    this.competencyId = competencyId;
  }


  public CourseCompetencyProgressDTO numberOfStudents(Long numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
    return this;
  }

   /**
   * Get numberOfStudents
   * @return numberOfStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfStudents() {
    return numberOfStudents;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfStudents(Long numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }


  public CourseCompetencyProgressDTO numberOfMasteredStudents(Long numberOfMasteredStudents) {
    this.numberOfMasteredStudents = numberOfMasteredStudents;
    return this;
  }

   /**
   * Get numberOfMasteredStudents
   * @return numberOfMasteredStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MASTERED_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfMasteredStudents() {
    return numberOfMasteredStudents;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MASTERED_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfMasteredStudents(Long numberOfMasteredStudents) {
    this.numberOfMasteredStudents = numberOfMasteredStudents;
  }


  public CourseCompetencyProgressDTO averageStudentScore(Double averageStudentScore) {
    this.averageStudentScore = averageStudentScore;
    return this;
  }

   /**
   * Get averageStudentScore
   * @return averageStudentScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_STUDENT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageStudentScore() {
    return averageStudentScore;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_STUDENT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageStudentScore(Double averageStudentScore) {
    this.averageStudentScore = averageStudentScore;
  }


  /**
   * Return true if this CourseCompetencyProgressDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseCompetencyProgressDTO courseCompetencyProgressDTO = (CourseCompetencyProgressDTO) o;
    return Objects.equals(this.competencyId, courseCompetencyProgressDTO.competencyId) &&
        Objects.equals(this.numberOfStudents, courseCompetencyProgressDTO.numberOfStudents) &&
        Objects.equals(this.numberOfMasteredStudents, courseCompetencyProgressDTO.numberOfMasteredStudents) &&
        Objects.equals(this.averageStudentScore, courseCompetencyProgressDTO.averageStudentScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyId, numberOfStudents, numberOfMasteredStudents, averageStudentScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseCompetencyProgressDTO {\n");
    sb.append("    competencyId: ").append(toIndentedString(competencyId)).append("\n");
    sb.append("    numberOfStudents: ").append(toIndentedString(numberOfStudents)).append("\n");
    sb.append("    numberOfMasteredStudents: ").append(toIndentedString(numberOfMasteredStudents)).append("\n");
    sb.append("    averageStudentScore: ").append(toIndentedString(averageStudentScore)).append("\n");
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
