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
 * ScoreDTO
 */
@JsonPropertyOrder({
  ScoreDTO.JSON_PROPERTY_STUDENT_ID,
  ScoreDTO.JSON_PROPERTY_STUDENT_LOGIN,
  ScoreDTO.JSON_PROPERTY_POINTS_ACHIEVED,
  ScoreDTO.JSON_PROPERTY_SCORE_ACHIEVED,
  ScoreDTO.JSON_PROPERTY_REGULAR_POINTS_ACHIEVABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class ScoreDTO {
  public static final String JSON_PROPERTY_STUDENT_ID = "studentId";
  private Long studentId;

  public static final String JSON_PROPERTY_STUDENT_LOGIN = "studentLogin";
  private String studentLogin;

  public static final String JSON_PROPERTY_POINTS_ACHIEVED = "pointsAchieved";
  private Double pointsAchieved;

  public static final String JSON_PROPERTY_SCORE_ACHIEVED = "scoreAchieved";
  private Double scoreAchieved;

  public static final String JSON_PROPERTY_REGULAR_POINTS_ACHIEVABLE = "regularPointsAchievable";
  private Double regularPointsAchievable;

  public ScoreDTO() { 
  }

  public ScoreDTO studentId(Long studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * Get studentId
   * @return studentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStudentId() {
    return studentId;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }


  public ScoreDTO studentLogin(String studentLogin) {
    this.studentLogin = studentLogin;
    return this;
  }

   /**
   * Get studentLogin
   * @return studentLogin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStudentLogin() {
    return studentLogin;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentLogin(String studentLogin) {
    this.studentLogin = studentLogin;
  }


  public ScoreDTO pointsAchieved(Double pointsAchieved) {
    this.pointsAchieved = pointsAchieved;
    return this;
  }

   /**
   * Get pointsAchieved
   * @return pointsAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPointsAchieved() {
    return pointsAchieved;
  }


  @JsonProperty(JSON_PROPERTY_POINTS_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointsAchieved(Double pointsAchieved) {
    this.pointsAchieved = pointsAchieved;
  }


  public ScoreDTO scoreAchieved(Double scoreAchieved) {
    this.scoreAchieved = scoreAchieved;
    return this;
  }

   /**
   * Get scoreAchieved
   * @return scoreAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScoreAchieved() {
    return scoreAchieved;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreAchieved(Double scoreAchieved) {
    this.scoreAchieved = scoreAchieved;
  }


  public ScoreDTO regularPointsAchievable(Double regularPointsAchievable) {
    this.regularPointsAchievable = regularPointsAchievable;
    return this;
  }

   /**
   * Get regularPointsAchievable
   * @return regularPointsAchievable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGULAR_POINTS_ACHIEVABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRegularPointsAchievable() {
    return regularPointsAchievable;
  }


  @JsonProperty(JSON_PROPERTY_REGULAR_POINTS_ACHIEVABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegularPointsAchievable(Double regularPointsAchievable) {
    this.regularPointsAchievable = regularPointsAchievable;
  }


  /**
   * Return true if this ScoreDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreDTO scoreDTO = (ScoreDTO) o;
    return Objects.equals(this.studentId, scoreDTO.studentId) &&
        Objects.equals(this.studentLogin, scoreDTO.studentLogin) &&
        Objects.equals(this.pointsAchieved, scoreDTO.pointsAchieved) &&
        Objects.equals(this.scoreAchieved, scoreDTO.scoreAchieved) &&
        Objects.equals(this.regularPointsAchievable, scoreDTO.regularPointsAchievable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, studentLogin, pointsAchieved, scoreAchieved, regularPointsAchievable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreDTO {\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    studentLogin: ").append(toIndentedString(studentLogin)).append("\n");
    sb.append("    pointsAchieved: ").append(toIndentedString(pointsAchieved)).append("\n");
    sb.append("    scoreAchieved: ").append(toIndentedString(scoreAchieved)).append("\n");
    sb.append("    regularPointsAchievable: ").append(toIndentedString(regularPointsAchievable)).append("\n");
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

