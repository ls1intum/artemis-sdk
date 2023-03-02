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
 * ParticipantScoreDTO
 */
@JsonPropertyOrder({
  ParticipantScoreDTO.JSON_PROPERTY_ID,
  ParticipantScoreDTO.JSON_PROPERTY_USER_ID,
  ParticipantScoreDTO.JSON_PROPERTY_USER_NAME,
  ParticipantScoreDTO.JSON_PROPERTY_TEAM_ID,
  ParticipantScoreDTO.JSON_PROPERTY_TEAM_NAME,
  ParticipantScoreDTO.JSON_PROPERTY_EXERCISE_ID,
  ParticipantScoreDTO.JSON_PROPERTY_EXERCISE_TITLE,
  ParticipantScoreDTO.JSON_PROPERTY_LAST_RESULT_ID,
  ParticipantScoreDTO.JSON_PROPERTY_LAST_RESULT_SCORE,
  ParticipantScoreDTO.JSON_PROPERTY_LAST_RATED_RESULT_ID,
  ParticipantScoreDTO.JSON_PROPERTY_LAST_RATED_RESULT_SCORE,
  ParticipantScoreDTO.JSON_PROPERTY_LAST_POINTS,
  ParticipantScoreDTO.JSON_PROPERTY_LAST_RATED_POINTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ParticipantScoreDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_TEAM_ID = "teamId";
  private Long teamId;

  public static final String JSON_PROPERTY_TEAM_NAME = "teamName";
  private String teamName;

  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_EXERCISE_TITLE = "exerciseTitle";
  private String exerciseTitle;

  public static final String JSON_PROPERTY_LAST_RESULT_ID = "lastResultId";
  private Long lastResultId;

  public static final String JSON_PROPERTY_LAST_RESULT_SCORE = "lastResultScore";
  private Double lastResultScore;

  public static final String JSON_PROPERTY_LAST_RATED_RESULT_ID = "lastRatedResultId";
  private Long lastRatedResultId;

  public static final String JSON_PROPERTY_LAST_RATED_RESULT_SCORE = "lastRatedResultScore";
  private Double lastRatedResultScore;

  public static final String JSON_PROPERTY_LAST_POINTS = "lastPoints";
  private Double lastPoints;

  public static final String JSON_PROPERTY_LAST_RATED_POINTS = "lastRatedPoints";
  private Double lastRatedPoints;

  public ParticipantScoreDTO() { 
  }

  public ParticipantScoreDTO id(Long id) {
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


  public ParticipantScoreDTO userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ParticipantScoreDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ParticipantScoreDTO teamId(Long teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTeamId() {
    return teamId;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamId(Long teamId) {
    this.teamId = teamId;
  }


  public ParticipantScoreDTO teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

   /**
   * Get teamName
   * @return teamName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamName() {
    return teamName;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public ParticipantScoreDTO exerciseId(Long exerciseId) {
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


  public ParticipantScoreDTO exerciseTitle(String exerciseTitle) {
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


  public ParticipantScoreDTO lastResultId(Long lastResultId) {
    this.lastResultId = lastResultId;
    return this;
  }

   /**
   * Get lastResultId
   * @return lastResultId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastResultId() {
    return lastResultId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastResultId(Long lastResultId) {
    this.lastResultId = lastResultId;
  }


  public ParticipantScoreDTO lastResultScore(Double lastResultScore) {
    this.lastResultScore = lastResultScore;
    return this;
  }

   /**
   * Get lastResultScore
   * @return lastResultScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RESULT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLastResultScore() {
    return lastResultScore;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RESULT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastResultScore(Double lastResultScore) {
    this.lastResultScore = lastResultScore;
  }


  public ParticipantScoreDTO lastRatedResultId(Long lastRatedResultId) {
    this.lastRatedResultId = lastRatedResultId;
    return this;
  }

   /**
   * Get lastRatedResultId
   * @return lastRatedResultId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RATED_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastRatedResultId() {
    return lastRatedResultId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RATED_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRatedResultId(Long lastRatedResultId) {
    this.lastRatedResultId = lastRatedResultId;
  }


  public ParticipantScoreDTO lastRatedResultScore(Double lastRatedResultScore) {
    this.lastRatedResultScore = lastRatedResultScore;
    return this;
  }

   /**
   * Get lastRatedResultScore
   * @return lastRatedResultScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RATED_RESULT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLastRatedResultScore() {
    return lastRatedResultScore;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RATED_RESULT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRatedResultScore(Double lastRatedResultScore) {
    this.lastRatedResultScore = lastRatedResultScore;
  }


  public ParticipantScoreDTO lastPoints(Double lastPoints) {
    this.lastPoints = lastPoints;
    return this;
  }

   /**
   * Get lastPoints
   * @return lastPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLastPoints() {
    return lastPoints;
  }


  @JsonProperty(JSON_PROPERTY_LAST_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastPoints(Double lastPoints) {
    this.lastPoints = lastPoints;
  }


  public ParticipantScoreDTO lastRatedPoints(Double lastRatedPoints) {
    this.lastRatedPoints = lastRatedPoints;
    return this;
  }

   /**
   * Get lastRatedPoints
   * @return lastRatedPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RATED_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLastRatedPoints() {
    return lastRatedPoints;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RATED_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRatedPoints(Double lastRatedPoints) {
    this.lastRatedPoints = lastRatedPoints;
  }


  /**
   * Return true if this ParticipantScoreDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantScoreDTO participantScoreDTO = (ParticipantScoreDTO) o;
    return Objects.equals(this.id, participantScoreDTO.id) &&
        Objects.equals(this.userId, participantScoreDTO.userId) &&
        Objects.equals(this.userName, participantScoreDTO.userName) &&
        Objects.equals(this.teamId, participantScoreDTO.teamId) &&
        Objects.equals(this.teamName, participantScoreDTO.teamName) &&
        Objects.equals(this.exerciseId, participantScoreDTO.exerciseId) &&
        Objects.equals(this.exerciseTitle, participantScoreDTO.exerciseTitle) &&
        Objects.equals(this.lastResultId, participantScoreDTO.lastResultId) &&
        Objects.equals(this.lastResultScore, participantScoreDTO.lastResultScore) &&
        Objects.equals(this.lastRatedResultId, participantScoreDTO.lastRatedResultId) &&
        Objects.equals(this.lastRatedResultScore, participantScoreDTO.lastRatedResultScore) &&
        Objects.equals(this.lastPoints, participantScoreDTO.lastPoints) &&
        Objects.equals(this.lastRatedPoints, participantScoreDTO.lastRatedPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, userName, teamId, teamName, exerciseId, exerciseTitle, lastResultId, lastResultScore, lastRatedResultId, lastRatedResultScore, lastPoints, lastRatedPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantScoreDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    exerciseTitle: ").append(toIndentedString(exerciseTitle)).append("\n");
    sb.append("    lastResultId: ").append(toIndentedString(lastResultId)).append("\n");
    sb.append("    lastResultScore: ").append(toIndentedString(lastResultScore)).append("\n");
    sb.append("    lastRatedResultId: ").append(toIndentedString(lastRatedResultId)).append("\n");
    sb.append("    lastRatedResultScore: ").append(toIndentedString(lastRatedResultScore)).append("\n");
    sb.append("    lastPoints: ").append(toIndentedString(lastPoints)).append("\n");
    sb.append("    lastRatedPoints: ").append(toIndentedString(lastRatedPoints)).append("\n");
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

