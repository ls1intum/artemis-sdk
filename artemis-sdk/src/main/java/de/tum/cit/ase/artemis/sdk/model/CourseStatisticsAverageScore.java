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
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CourseStatisticsAverageScore
 */
@JsonPropertyOrder({
  CourseStatisticsAverageScore.JSON_PROPERTY_EXERCISE_ID,
  CourseStatisticsAverageScore.JSON_PROPERTY_EXERCISE_NAME,
  CourseStatisticsAverageScore.JSON_PROPERTY_RELEASE_DATE,
  CourseStatisticsAverageScore.JSON_PROPERTY_AVERAGE_SCORE,
  CourseStatisticsAverageScore.JSON_PROPERTY_EXERCISE_TYPE,
  CourseStatisticsAverageScore.JSON_PROPERTY_CATEGORIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class CourseStatisticsAverageScore {
  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_EXERCISE_NAME = "exerciseName";
  private String exerciseName;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private OffsetDateTime releaseDate;

  public static final String JSON_PROPERTY_AVERAGE_SCORE = "averageScore";
  private Double averageScore;

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

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private Set<String> categories;

  public CourseStatisticsAverageScore() { 
  }

  public CourseStatisticsAverageScore exerciseId(Long exerciseId) {
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


  public CourseStatisticsAverageScore exerciseName(String exerciseName) {
    this.exerciseName = exerciseName;
    return this;
  }

   /**
   * Get exerciseName
   * @return exerciseName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExerciseName() {
    return exerciseName;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseName(String exerciseName) {
    this.exerciseName = exerciseName;
  }


  public CourseStatisticsAverageScore releaseDate(OffsetDateTime releaseDate) {
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


  public CourseStatisticsAverageScore averageScore(Double averageScore) {
    this.averageScore = averageScore;
    return this;
  }

   /**
   * Get averageScore
   * @return averageScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageScore() {
    return averageScore;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageScore(Double averageScore) {
    this.averageScore = averageScore;
  }


  public CourseStatisticsAverageScore exerciseType(ExerciseTypeEnum exerciseType) {
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


  public CourseStatisticsAverageScore categories(Set<String> categories) {
    this.categories = categories;
    return this;
  }

  public CourseStatisticsAverageScore addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new LinkedHashSet<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getCategories() {
    return categories;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(Set<String> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this CourseStatisticsAverageScore object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseStatisticsAverageScore courseStatisticsAverageScore = (CourseStatisticsAverageScore) o;
    return Objects.equals(this.exerciseId, courseStatisticsAverageScore.exerciseId) &&
        Objects.equals(this.exerciseName, courseStatisticsAverageScore.exerciseName) &&
        Objects.equals(this.releaseDate, courseStatisticsAverageScore.releaseDate) &&
        Objects.equals(this.averageScore, courseStatisticsAverageScore.averageScore) &&
        Objects.equals(this.exerciseType, courseStatisticsAverageScore.exerciseType) &&
        Objects.equals(this.categories, courseStatisticsAverageScore.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseId, exerciseName, releaseDate, averageScore, exerciseType, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseStatisticsAverageScore {\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    exerciseName: ").append(toIndentedString(exerciseName)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

