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
 * BonusResultDTO
 */
@JsonPropertyOrder({
  BonusResultDTO.JSON_PROPERTY_BONUS_STRATEGY,
  BonusResultDTO.JSON_PROPERTY_BONUS_FROM_TITLE,
  BonusResultDTO.JSON_PROPERTY_STUDENT_POINTS_OF_BONUS_SOURCE,
  BonusResultDTO.JSON_PROPERTY_BONUS_GRADE,
  BonusResultDTO.JSON_PROPERTY_FINAL_POINTS,
  BonusResultDTO.JSON_PROPERTY_FINAL_GRADE,
  BonusResultDTO.JSON_PROPERTY_MOST_SEVERE_PLAGIARISM_VERDICT,
  BonusResultDTO.JSON_PROPERTY_ACHIEVED_PRESENTATION_SCORE,
  BonusResultDTO.JSON_PROPERTY_PRESENTATION_SCORE_THRESHOLD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class BonusResultDTO {
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

  public static final String JSON_PROPERTY_BONUS_FROM_TITLE = "bonusFromTitle";
  private String bonusFromTitle;

  public static final String JSON_PROPERTY_STUDENT_POINTS_OF_BONUS_SOURCE = "studentPointsOfBonusSource";
  private Double studentPointsOfBonusSource;

  public static final String JSON_PROPERTY_BONUS_GRADE = "bonusGrade";
  private String bonusGrade;

  public static final String JSON_PROPERTY_FINAL_POINTS = "finalPoints";
  private Double finalPoints;

  public static final String JSON_PROPERTY_FINAL_GRADE = "finalGrade";
  private String finalGrade;

  /**
   * Gets or Sets mostSeverePlagiarismVerdict
   */
  public enum MostSeverePlagiarismVerdictEnum {
    PLAGIARISM("PLAGIARISM"),
    
    POINT_DEDUCTION("POINT_DEDUCTION"),
    
    WARNING("WARNING"),
    
    NO_PLAGIARISM("NO_PLAGIARISM");

    private String value;

    MostSeverePlagiarismVerdictEnum(String value) {
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
    public static MostSeverePlagiarismVerdictEnum fromValue(String value) {
      for (MostSeverePlagiarismVerdictEnum b : MostSeverePlagiarismVerdictEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MOST_SEVERE_PLAGIARISM_VERDICT = "mostSeverePlagiarismVerdict";
  private MostSeverePlagiarismVerdictEnum mostSeverePlagiarismVerdict;

  public static final String JSON_PROPERTY_ACHIEVED_PRESENTATION_SCORE = "achievedPresentationScore";
  private Integer achievedPresentationScore;

  public static final String JSON_PROPERTY_PRESENTATION_SCORE_THRESHOLD = "presentationScoreThreshold";
  private Integer presentationScoreThreshold;

  public BonusResultDTO() { 
  }

  public BonusResultDTO bonusStrategy(BonusStrategyEnum bonusStrategy) {
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


  public BonusResultDTO bonusFromTitle(String bonusFromTitle) {
    this.bonusFromTitle = bonusFromTitle;
    return this;
  }

   /**
   * Get bonusFromTitle
   * @return bonusFromTitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BONUS_FROM_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBonusFromTitle() {
    return bonusFromTitle;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_FROM_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusFromTitle(String bonusFromTitle) {
    this.bonusFromTitle = bonusFromTitle;
  }


  public BonusResultDTO studentPointsOfBonusSource(Double studentPointsOfBonusSource) {
    this.studentPointsOfBonusSource = studentPointsOfBonusSource;
    return this;
  }

   /**
   * Get studentPointsOfBonusSource
   * @return studentPointsOfBonusSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_POINTS_OF_BONUS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getStudentPointsOfBonusSource() {
    return studentPointsOfBonusSource;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_POINTS_OF_BONUS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentPointsOfBonusSource(Double studentPointsOfBonusSource) {
    this.studentPointsOfBonusSource = studentPointsOfBonusSource;
  }


  public BonusResultDTO bonusGrade(String bonusGrade) {
    this.bonusGrade = bonusGrade;
    return this;
  }

   /**
   * Get bonusGrade
   * @return bonusGrade
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BONUS_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBonusGrade() {
    return bonusGrade;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusGrade(String bonusGrade) {
    this.bonusGrade = bonusGrade;
  }


  public BonusResultDTO finalPoints(Double finalPoints) {
    this.finalPoints = finalPoints;
    return this;
  }

   /**
   * Get finalPoints
   * @return finalPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFinalPoints() {
    return finalPoints;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalPoints(Double finalPoints) {
    this.finalPoints = finalPoints;
  }


  public BonusResultDTO finalGrade(String finalGrade) {
    this.finalGrade = finalGrade;
    return this;
  }

   /**
   * Get finalGrade
   * @return finalGrade
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalGrade() {
    return finalGrade;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalGrade(String finalGrade) {
    this.finalGrade = finalGrade;
  }


  public BonusResultDTO mostSeverePlagiarismVerdict(MostSeverePlagiarismVerdictEnum mostSeverePlagiarismVerdict) {
    this.mostSeverePlagiarismVerdict = mostSeverePlagiarismVerdict;
    return this;
  }

   /**
   * Get mostSeverePlagiarismVerdict
   * @return mostSeverePlagiarismVerdict
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOST_SEVERE_PLAGIARISM_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MostSeverePlagiarismVerdictEnum getMostSeverePlagiarismVerdict() {
    return mostSeverePlagiarismVerdict;
  }


  @JsonProperty(JSON_PROPERTY_MOST_SEVERE_PLAGIARISM_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMostSeverePlagiarismVerdict(MostSeverePlagiarismVerdictEnum mostSeverePlagiarismVerdict) {
    this.mostSeverePlagiarismVerdict = mostSeverePlagiarismVerdict;
  }


  public BonusResultDTO achievedPresentationScore(Integer achievedPresentationScore) {
    this.achievedPresentationScore = achievedPresentationScore;
    return this;
  }

   /**
   * Get achievedPresentationScore
   * @return achievedPresentationScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACHIEVED_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAchievedPresentationScore() {
    return achievedPresentationScore;
  }


  @JsonProperty(JSON_PROPERTY_ACHIEVED_PRESENTATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAchievedPresentationScore(Integer achievedPresentationScore) {
    this.achievedPresentationScore = achievedPresentationScore;
  }


  public BonusResultDTO presentationScoreThreshold(Integer presentationScoreThreshold) {
    this.presentationScoreThreshold = presentationScoreThreshold;
    return this;
  }

   /**
   * Get presentationScoreThreshold
   * @return presentationScoreThreshold
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPresentationScoreThreshold() {
    return presentationScoreThreshold;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_SCORE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationScoreThreshold(Integer presentationScoreThreshold) {
    this.presentationScoreThreshold = presentationScoreThreshold;
  }


  /**
   * Return true if this BonusResultDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BonusResultDTO bonusResultDTO = (BonusResultDTO) o;
    return Objects.equals(this.bonusStrategy, bonusResultDTO.bonusStrategy) &&
        Objects.equals(this.bonusFromTitle, bonusResultDTO.bonusFromTitle) &&
        Objects.equals(this.studentPointsOfBonusSource, bonusResultDTO.studentPointsOfBonusSource) &&
        Objects.equals(this.bonusGrade, bonusResultDTO.bonusGrade) &&
        Objects.equals(this.finalPoints, bonusResultDTO.finalPoints) &&
        Objects.equals(this.finalGrade, bonusResultDTO.finalGrade) &&
        Objects.equals(this.mostSeverePlagiarismVerdict, bonusResultDTO.mostSeverePlagiarismVerdict) &&
        Objects.equals(this.achievedPresentationScore, bonusResultDTO.achievedPresentationScore) &&
        Objects.equals(this.presentationScoreThreshold, bonusResultDTO.presentationScoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonusStrategy, bonusFromTitle, studentPointsOfBonusSource, bonusGrade, finalPoints, finalGrade, mostSeverePlagiarismVerdict, achievedPresentationScore, presentationScoreThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BonusResultDTO {\n");
    sb.append("    bonusStrategy: ").append(toIndentedString(bonusStrategy)).append("\n");
    sb.append("    bonusFromTitle: ").append(toIndentedString(bonusFromTitle)).append("\n");
    sb.append("    studentPointsOfBonusSource: ").append(toIndentedString(studentPointsOfBonusSource)).append("\n");
    sb.append("    bonusGrade: ").append(toIndentedString(bonusGrade)).append("\n");
    sb.append("    finalPoints: ").append(toIndentedString(finalPoints)).append("\n");
    sb.append("    finalGrade: ").append(toIndentedString(finalGrade)).append("\n");
    sb.append("    mostSeverePlagiarismVerdict: ").append(toIndentedString(mostSeverePlagiarismVerdict)).append("\n");
    sb.append("    achievedPresentationScore: ").append(toIndentedString(achievedPresentationScore)).append("\n");
    sb.append("    presentationScoreThreshold: ").append(toIndentedString(presentationScoreThreshold)).append("\n");
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

