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
import de.tum.cit.ase.artemis.sdk.model.Bonus;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.Exam;
import de.tum.cit.ase.artemis.sdk.model.GradeStep;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * GradingScale
 */
@JsonPropertyOrder({
  GradingScale.JSON_PROPERTY_ID,
  GradingScale.JSON_PROPERTY_GRADE_TYPE,
  GradingScale.JSON_PROPERTY_BONUS_STRATEGY,
  GradingScale.JSON_PROPERTY_PLAGIARISM_GRADE,
  GradingScale.JSON_PROPERTY_NO_PARTICIPATION_GRADE,
  GradingScale.JSON_PROPERTY_COURSE,
  GradingScale.JSON_PROPERTY_EXAM,
  GradingScale.JSON_PROPERTY_GRADE_STEPS,
  GradingScale.JSON_PROPERTY_BONUS_FROM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class GradingScale {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

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

  /**
   * Gets or Sets bonusStrategy
   */
  public enum BonusStrategyEnum {
    GRADES_DISCRETE("GRADES_DISCRETE"),
    
    GRADES_CONTINUOUS("GRADES_CONTINUOUS"),
    
    POINTS("POINTS");

    private String value;

    BonusStrategyEnum(String value) {
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
    public static BonusStrategyEnum fromValue(String value) {
      for (BonusStrategyEnum b : BonusStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BONUS_STRATEGY = "bonusStrategy";
  private BonusStrategyEnum bonusStrategy;

  public static final String JSON_PROPERTY_PLAGIARISM_GRADE = "plagiarismGrade";
  private String plagiarismGrade;

  public static final String JSON_PROPERTY_NO_PARTICIPATION_GRADE = "noParticipationGrade";
  private String noParticipationGrade;

  public static final String JSON_PROPERTY_COURSE = "course";
  private Course course;

  public static final String JSON_PROPERTY_EXAM = "exam";
  private Exam exam;

  public static final String JSON_PROPERTY_GRADE_STEPS = "gradeSteps";
  private Set<GradeStep> gradeSteps;

  public static final String JSON_PROPERTY_BONUS_FROM = "bonusFrom";
  private Set<Bonus> bonusFrom;

  public GradingScale() { 
  }

  public GradingScale id(Long id) {
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


  public GradingScale gradeType(GradeTypeEnum gradeType) {
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


  public GradingScale bonusStrategy(BonusStrategyEnum bonusStrategy) {
    this.bonusStrategy = bonusStrategy;
    return this;
  }

   /**
   * Get bonusStrategy
   * @return bonusStrategy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BONUS_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BonusStrategyEnum getBonusStrategy() {
    return bonusStrategy;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusStrategy(BonusStrategyEnum bonusStrategy) {
    this.bonusStrategy = bonusStrategy;
  }


  public GradingScale plagiarismGrade(String plagiarismGrade) {
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


  public GradingScale noParticipationGrade(String noParticipationGrade) {
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


  public GradingScale course(Course course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Course getCourse() {
    return course;
  }


  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourse(Course course) {
    this.course = course;
  }


  public GradingScale exam(Exam exam) {
    this.exam = exam;
    return this;
  }

   /**
   * Get exam
   * @return exam
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Exam getExam() {
    return exam;
  }


  @JsonProperty(JSON_PROPERTY_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExam(Exam exam) {
    this.exam = exam;
  }


  public GradingScale gradeSteps(Set<GradeStep> gradeSteps) {
    this.gradeSteps = gradeSteps;
    return this;
  }

  public GradingScale addGradeStepsItem(GradeStep gradeStepsItem) {
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


  public GradingScale bonusFrom(Set<Bonus> bonusFrom) {
    this.bonusFrom = bonusFrom;
    return this;
  }

  public GradingScale addBonusFromItem(Bonus bonusFromItem) {
    if (this.bonusFrom == null) {
      this.bonusFrom = new LinkedHashSet<>();
    }
    this.bonusFrom.add(bonusFromItem);
    return this;
  }

   /**
   * Get bonusFrom
   * @return bonusFrom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BONUS_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Bonus> getBonusFrom() {
    return bonusFrom;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_BONUS_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusFrom(Set<Bonus> bonusFrom) {
    this.bonusFrom = bonusFrom;
  }


  /**
   * Return true if this GradingScale object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradingScale gradingScale = (GradingScale) o;
    return Objects.equals(this.id, gradingScale.id) &&
        Objects.equals(this.gradeType, gradingScale.gradeType) &&
        Objects.equals(this.bonusStrategy, gradingScale.bonusStrategy) &&
        Objects.equals(this.plagiarismGrade, gradingScale.plagiarismGrade) &&
        Objects.equals(this.noParticipationGrade, gradingScale.noParticipationGrade) &&
        Objects.equals(this.course, gradingScale.course) &&
        Objects.equals(this.exam, gradingScale.exam) &&
        Objects.equals(this.gradeSteps, gradingScale.gradeSteps) &&
        Objects.equals(this.bonusFrom, gradingScale.bonusFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gradeType, bonusStrategy, plagiarismGrade, noParticipationGrade, course, exam, gradeSteps, bonusFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradingScale {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
    sb.append("    bonusStrategy: ").append(toIndentedString(bonusStrategy)).append("\n");
    sb.append("    plagiarismGrade: ").append(toIndentedString(plagiarismGrade)).append("\n");
    sb.append("    noParticipationGrade: ").append(toIndentedString(noParticipationGrade)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    exam: ").append(toIndentedString(exam)).append("\n");
    sb.append("    gradeSteps: ").append(toIndentedString(gradeSteps)).append("\n");
    sb.append("    bonusFrom: ").append(toIndentedString(bonusFrom)).append("\n");
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

