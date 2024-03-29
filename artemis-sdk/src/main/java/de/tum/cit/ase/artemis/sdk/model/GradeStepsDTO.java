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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.GradeStep;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * GradeStepsDTO
 */
@JsonPropertyOrder({
  GradeStepsDTO.JSON_PROPERTY_TITLE,
  GradeStepsDTO.JSON_PROPERTY_GRADE_TYPE,
  GradeStepsDTO.JSON_PROPERTY_GRADE_STEPS,
  GradeStepsDTO.JSON_PROPERTY_MAX_POINTS,
  GradeStepsDTO.JSON_PROPERTY_PLAGIARISM_GRADE,
  GradeStepsDTO.JSON_PROPERTY_NO_PARTICIPATION_GRADE,
  GradeStepsDTO.JSON_PROPERTY_PRESENTATIONS_NUMBER,
  GradeStepsDTO.JSON_PROPERTY_PRESENTATIONS_WEIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class GradeStepsDTO {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

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

  public static final String JSON_PROPERTY_GRADE_STEPS = "gradeSteps";
  private Set<GradeStep> gradeSteps;

  public static final String JSON_PROPERTY_MAX_POINTS = "maxPoints";
  private Integer maxPoints;

  public static final String JSON_PROPERTY_PLAGIARISM_GRADE = "plagiarismGrade";
  private String plagiarismGrade;

  public static final String JSON_PROPERTY_NO_PARTICIPATION_GRADE = "noParticipationGrade";
  private String noParticipationGrade;

  public static final String JSON_PROPERTY_PRESENTATIONS_NUMBER = "presentationsNumber";
  private Integer presentationsNumber;

  public static final String JSON_PROPERTY_PRESENTATIONS_WEIGHT = "presentationsWeight";
  private Double presentationsWeight;

  public GradeStepsDTO() { 
  }

  public GradeStepsDTO title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public GradeStepsDTO gradeType(GradeTypeEnum gradeType) {
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


  public GradeStepsDTO gradeSteps(Set<GradeStep> gradeSteps) {
    this.gradeSteps = gradeSteps;
    return this;
  }

  public GradeStepsDTO addGradeStepsItem(GradeStep gradeStepsItem) {
    if (this.gradeSteps == null) {
      this.gradeSteps = new LinkedHashSet<>();
    }
    this.gradeSteps.add(gradeStepsItem);
    return this;
  }

   /**
   * Get gradeSteps
   * @return gradeSteps
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADE_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<GradeStep> getGradeSteps() {
    return gradeSteps;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_GRADE_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradeSteps(Set<GradeStep> gradeSteps) {
    this.gradeSteps = gradeSteps;
  }


  public GradeStepsDTO maxPoints(Integer maxPoints) {
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

  public Integer getMaxPoints() {
    return maxPoints;
  }


  @JsonProperty(JSON_PROPERTY_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
  }


  public GradeStepsDTO plagiarismGrade(String plagiarismGrade) {
    this.plagiarismGrade = plagiarismGrade;
    return this;
  }

   /**
   * Get plagiarismGrade
   * @return plagiarismGrade
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlagiarismGrade() {
    return plagiarismGrade;
  }


  @JsonProperty(JSON_PROPERTY_PLAGIARISM_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismGrade(String plagiarismGrade) {
    this.plagiarismGrade = plagiarismGrade;
  }


  public GradeStepsDTO noParticipationGrade(String noParticipationGrade) {
    this.noParticipationGrade = noParticipationGrade;
    return this;
  }

   /**
   * Get noParticipationGrade
   * @return noParticipationGrade
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_PARTICIPATION_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNoParticipationGrade() {
    return noParticipationGrade;
  }


  @JsonProperty(JSON_PROPERTY_NO_PARTICIPATION_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoParticipationGrade(String noParticipationGrade) {
    this.noParticipationGrade = noParticipationGrade;
  }


  public GradeStepsDTO presentationsNumber(Integer presentationsNumber) {
    this.presentationsNumber = presentationsNumber;
    return this;
  }

   /**
   * Get presentationsNumber
   * @return presentationsNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATIONS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPresentationsNumber() {
    return presentationsNumber;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATIONS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationsNumber(Integer presentationsNumber) {
    this.presentationsNumber = presentationsNumber;
  }


  public GradeStepsDTO presentationsWeight(Double presentationsWeight) {
    this.presentationsWeight = presentationsWeight;
    return this;
  }

   /**
   * Get presentationsWeight
   * @return presentationsWeight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATIONS_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPresentationsWeight() {
    return presentationsWeight;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATIONS_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationsWeight(Double presentationsWeight) {
    this.presentationsWeight = presentationsWeight;
  }


  /**
   * Return true if this GradeStepsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeStepsDTO gradeStepsDTO = (GradeStepsDTO) o;
    return Objects.equals(this.title, gradeStepsDTO.title) &&
        Objects.equals(this.gradeType, gradeStepsDTO.gradeType) &&
        Objects.equals(this.gradeSteps, gradeStepsDTO.gradeSteps) &&
        Objects.equals(this.maxPoints, gradeStepsDTO.maxPoints) &&
        Objects.equals(this.plagiarismGrade, gradeStepsDTO.plagiarismGrade) &&
        Objects.equals(this.noParticipationGrade, gradeStepsDTO.noParticipationGrade) &&
        Objects.equals(this.presentationsNumber, gradeStepsDTO.presentationsNumber) &&
        Objects.equals(this.presentationsWeight, gradeStepsDTO.presentationsWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, gradeType, gradeSteps, maxPoints, plagiarismGrade, noParticipationGrade, presentationsNumber, presentationsWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeStepsDTO {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
    sb.append("    gradeSteps: ").append(toIndentedString(gradeSteps)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    plagiarismGrade: ").append(toIndentedString(plagiarismGrade)).append("\n");
    sb.append("    noParticipationGrade: ").append(toIndentedString(noParticipationGrade)).append("\n");
    sb.append("    presentationsNumber: ").append(toIndentedString(presentationsNumber)).append("\n");
    sb.append("    presentationsWeight: ").append(toIndentedString(presentationsWeight)).append("\n");
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

