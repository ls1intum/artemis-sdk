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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExerciseScoresDTO
 */
@JsonPropertyOrder({
  ExerciseScoresDTO.JSON_PROPERTY_EXERCISE_ID,
  ExerciseScoresDTO.JSON_PROPERTY_EXERCISE_TITLE,
  ExerciseScoresDTO.JSON_PROPERTY_EXERCISE_TYPE,
  ExerciseScoresDTO.JSON_PROPERTY_RELEASE_DATE,
  ExerciseScoresDTO.JSON_PROPERTY_SCORE_OF_STUDENT,
  ExerciseScoresDTO.JSON_PROPERTY_AVERAGE_SCORE_ACHIEVED,
  ExerciseScoresDTO.JSON_PROPERTY_MAX_SCORE_ACHIEVED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class ExerciseScoresDTO {
  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_EXERCISE_TITLE = "exerciseTitle";
  private String exerciseTitle;

  /**
   * Gets or Sets exerciseType
   */
  public enum ExerciseTypeEnum {
    TEXT("TEXT"),
    
    PROGRAMMING("PROGRAMMING"),
    
    MODELING("MODELING"),
    
    FILE_UPLOAD("FILE_UPLOAD"),
    
    QUIZ("QUIZ");

    private String value;

    ExerciseTypeEnum(String value) {
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
    public static ExerciseTypeEnum fromValue(String value) {
      for (ExerciseTypeEnum b : ExerciseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EXERCISE_TYPE = "exerciseType";
  private ExerciseTypeEnum exerciseType;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private OffsetDateTime releaseDate;

  public static final String JSON_PROPERTY_SCORE_OF_STUDENT = "scoreOfStudent";
  private Double scoreOfStudent;

  public static final String JSON_PROPERTY_AVERAGE_SCORE_ACHIEVED = "averageScoreAchieved";
  private Double averageScoreAchieved;

  public static final String JSON_PROPERTY_MAX_SCORE_ACHIEVED = "maxScoreAchieved";
  private Double maxScoreAchieved;

  public ExerciseScoresDTO() { 
  }

  public ExerciseScoresDTO exerciseId(Long exerciseId) {
    this.exerciseId = exerciseId;
    return this;
  }

   /**
   * Get exerciseId
   * @return exerciseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExerciseId() {
    return exerciseId;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseId(Long exerciseId) {
    this.exerciseId = exerciseId;
  }


  public ExerciseScoresDTO exerciseTitle(String exerciseTitle) {
    this.exerciseTitle = exerciseTitle;
    return this;
  }

   /**
   * Get exerciseTitle
   * @return exerciseTitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExerciseTitle() {
    return exerciseTitle;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseTitle(String exerciseTitle) {
    this.exerciseTitle = exerciseTitle;
  }


  public ExerciseScoresDTO exerciseType(ExerciseTypeEnum exerciseType) {
    this.exerciseType = exerciseType;
    return this;
  }

   /**
   * Get exerciseType
   * @return exerciseType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExerciseTypeEnum getExerciseType() {
    return exerciseType;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseType(ExerciseTypeEnum exerciseType) {
    this.exerciseType = exerciseType;
  }


  public ExerciseScoresDTO releaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public ExerciseScoresDTO scoreOfStudent(Double scoreOfStudent) {
    this.scoreOfStudent = scoreOfStudent;
    return this;
  }

   /**
   * Get scoreOfStudent
   * @return scoreOfStudent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_OF_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScoreOfStudent() {
    return scoreOfStudent;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_OF_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreOfStudent(Double scoreOfStudent) {
    this.scoreOfStudent = scoreOfStudent;
  }


  public ExerciseScoresDTO averageScoreAchieved(Double averageScoreAchieved) {
    this.averageScoreAchieved = averageScoreAchieved;
    return this;
  }

   /**
   * Get averageScoreAchieved
   * @return averageScoreAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageScoreAchieved() {
    return averageScoreAchieved;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScoreAchieved(Double averageScoreAchieved) {
    this.averageScoreAchieved = averageScoreAchieved;
  }


  public ExerciseScoresDTO maxScoreAchieved(Double maxScoreAchieved) {
    this.maxScoreAchieved = maxScoreAchieved;
    return this;
  }

   /**
   * Get maxScoreAchieved
   * @return maxScoreAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxScoreAchieved() {
    return maxScoreAchieved;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxScoreAchieved(Double maxScoreAchieved) {
    this.maxScoreAchieved = maxScoreAchieved;
  }


  /**
   * Return true if this ExerciseScoresDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseScoresDTO exerciseScoresDTO = (ExerciseScoresDTO) o;
    return Objects.equals(this.exerciseId, exerciseScoresDTO.exerciseId) &&
        Objects.equals(this.exerciseTitle, exerciseScoresDTO.exerciseTitle) &&
        Objects.equals(this.exerciseType, exerciseScoresDTO.exerciseType) &&
        Objects.equals(this.releaseDate, exerciseScoresDTO.releaseDate) &&
        Objects.equals(this.scoreOfStudent, exerciseScoresDTO.scoreOfStudent) &&
        Objects.equals(this.averageScoreAchieved, exerciseScoresDTO.averageScoreAchieved) &&
        Objects.equals(this.maxScoreAchieved, exerciseScoresDTO.maxScoreAchieved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseId, exerciseTitle, exerciseType, releaseDate, scoreOfStudent, averageScoreAchieved, maxScoreAchieved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseScoresDTO {\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    exerciseTitle: ").append(toIndentedString(exerciseTitle)).append("\n");
    sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    scoreOfStudent: ").append(toIndentedString(scoreOfStudent)).append("\n");
    sb.append("    averageScoreAchieved: ").append(toIndentedString(averageScoreAchieved)).append("\n");
    sb.append("    maxScoreAchieved: ").append(toIndentedString(maxScoreAchieved)).append("\n");
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

