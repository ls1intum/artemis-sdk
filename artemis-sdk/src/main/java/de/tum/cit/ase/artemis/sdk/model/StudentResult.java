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
import de.tum.cit.ase.artemis.sdk.model.BonusResultDTO;
import de.tum.cit.ase.artemis.sdk.model.ExerciseResult;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * StudentResult
 */
@JsonPropertyOrder({
  StudentResult.JSON_PROPERTY_USER_ID,
  StudentResult.JSON_PROPERTY_NAME,
  StudentResult.JSON_PROPERTY_EMAIL,
  StudentResult.JSON_PROPERTY_LOGIN,
  StudentResult.JSON_PROPERTY_REGISTRATION_NUMBER,
  StudentResult.JSON_PROPERTY_SUBMITTED,
  StudentResult.JSON_PROPERTY_OVERALL_POINTS_ACHIEVED,
  StudentResult.JSON_PROPERTY_OVERALL_SCORE_ACHIEVED,
  StudentResult.JSON_PROPERTY_OVERALL_GRADE,
  StudentResult.JSON_PROPERTY_OVERALL_GRADE_IN_FIRST_CORRECTION,
  StudentResult.JSON_PROPERTY_HAS_PASSED,
  StudentResult.JSON_PROPERTY_OVERALL_POINTS_ACHIEVED_IN_FIRST_CORRECTION,
  StudentResult.JSON_PROPERTY_GRADE_WITH_BONUS,
  StudentResult.JSON_PROPERTY_EXERCISE_GROUP_ID_TO_EXERCISE_RESULT,
  StudentResult.JSON_PROPERTY_MOST_SEVERE_PLAGIARISM_VERDICT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class StudentResult {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_REGISTRATION_NUMBER = "registrationNumber";
  private String registrationNumber;

  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  private Boolean submitted;

  public static final String JSON_PROPERTY_OVERALL_POINTS_ACHIEVED = "overallPointsAchieved";
  private Double overallPointsAchieved;

  public static final String JSON_PROPERTY_OVERALL_SCORE_ACHIEVED = "overallScoreAchieved";
  private Double overallScoreAchieved;

  public static final String JSON_PROPERTY_OVERALL_GRADE = "overallGrade";
  private String overallGrade;

  public static final String JSON_PROPERTY_OVERALL_GRADE_IN_FIRST_CORRECTION = "overallGradeInFirstCorrection";
  private String overallGradeInFirstCorrection;

  public static final String JSON_PROPERTY_HAS_PASSED = "hasPassed";
  private Boolean hasPassed;

  public static final String JSON_PROPERTY_OVERALL_POINTS_ACHIEVED_IN_FIRST_CORRECTION = "overallPointsAchievedInFirstCorrection";
  private Double overallPointsAchievedInFirstCorrection;

  public static final String JSON_PROPERTY_GRADE_WITH_BONUS = "gradeWithBonus";
  private BonusResultDTO gradeWithBonus;

  public static final String JSON_PROPERTY_EXERCISE_GROUP_ID_TO_EXERCISE_RESULT = "exerciseGroupIdToExerciseResult";
  private Map<String, ExerciseResult> exerciseGroupIdToExerciseResult = new HashMap<>();

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

  public StudentResult() { 
  }

  public StudentResult userId(Long userId) {
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


  public StudentResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public StudentResult email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public StudentResult login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogin() {
    return login;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogin(String login) {
    this.login = login;
  }


  public StudentResult registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public StudentResult submitted(Boolean submitted) {
    this.submitted = submitted;
    return this;
  }

   /**
   * Get submitted
   * @return submitted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubmitted() {
    return submitted;
  }


  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }


  public StudentResult overallPointsAchieved(Double overallPointsAchieved) {
    this.overallPointsAchieved = overallPointsAchieved;
    return this;
  }

   /**
   * Get overallPointsAchieved
   * @return overallPointsAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_POINTS_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOverallPointsAchieved() {
    return overallPointsAchieved;
  }


  @JsonProperty(JSON_PROPERTY_OVERALL_POINTS_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverallPointsAchieved(Double overallPointsAchieved) {
    this.overallPointsAchieved = overallPointsAchieved;
  }


  public StudentResult overallScoreAchieved(Double overallScoreAchieved) {
    this.overallScoreAchieved = overallScoreAchieved;
    return this;
  }

   /**
   * Get overallScoreAchieved
   * @return overallScoreAchieved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOverallScoreAchieved() {
    return overallScoreAchieved;
  }


  @JsonProperty(JSON_PROPERTY_OVERALL_SCORE_ACHIEVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverallScoreAchieved(Double overallScoreAchieved) {
    this.overallScoreAchieved = overallScoreAchieved;
  }


  public StudentResult overallGrade(String overallGrade) {
    this.overallGrade = overallGrade;
    return this;
  }

   /**
   * Get overallGrade
   * @return overallGrade
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverallGrade() {
    return overallGrade;
  }


  @JsonProperty(JSON_PROPERTY_OVERALL_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverallGrade(String overallGrade) {
    this.overallGrade = overallGrade;
  }


  public StudentResult overallGradeInFirstCorrection(String overallGradeInFirstCorrection) {
    this.overallGradeInFirstCorrection = overallGradeInFirstCorrection;
    return this;
  }

   /**
   * Get overallGradeInFirstCorrection
   * @return overallGradeInFirstCorrection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_GRADE_IN_FIRST_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverallGradeInFirstCorrection() {
    return overallGradeInFirstCorrection;
  }


  @JsonProperty(JSON_PROPERTY_OVERALL_GRADE_IN_FIRST_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverallGradeInFirstCorrection(String overallGradeInFirstCorrection) {
    this.overallGradeInFirstCorrection = overallGradeInFirstCorrection;
  }


  public StudentResult hasPassed(Boolean hasPassed) {
    this.hasPassed = hasPassed;
    return this;
  }

   /**
   * Get hasPassed
   * @return hasPassed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPassed() {
    return hasPassed;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPassed(Boolean hasPassed) {
    this.hasPassed = hasPassed;
  }


  public StudentResult overallPointsAchievedInFirstCorrection(Double overallPointsAchievedInFirstCorrection) {
    this.overallPointsAchievedInFirstCorrection = overallPointsAchievedInFirstCorrection;
    return this;
  }

   /**
   * Get overallPointsAchievedInFirstCorrection
   * @return overallPointsAchievedInFirstCorrection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_POINTS_ACHIEVED_IN_FIRST_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOverallPointsAchievedInFirstCorrection() {
    return overallPointsAchievedInFirstCorrection;
  }


  @JsonProperty(JSON_PROPERTY_OVERALL_POINTS_ACHIEVED_IN_FIRST_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverallPointsAchievedInFirstCorrection(Double overallPointsAchievedInFirstCorrection) {
    this.overallPointsAchievedInFirstCorrection = overallPointsAchievedInFirstCorrection;
  }


  public StudentResult gradeWithBonus(BonusResultDTO gradeWithBonus) {
    this.gradeWithBonus = gradeWithBonus;
    return this;
  }

   /**
   * Get gradeWithBonus
   * @return gradeWithBonus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADE_WITH_BONUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BonusResultDTO getGradeWithBonus() {
    return gradeWithBonus;
  }


  @JsonProperty(JSON_PROPERTY_GRADE_WITH_BONUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradeWithBonus(BonusResultDTO gradeWithBonus) {
    this.gradeWithBonus = gradeWithBonus;
  }


  public StudentResult exerciseGroupIdToExerciseResult(Map<String, ExerciseResult> exerciseGroupIdToExerciseResult) {
    this.exerciseGroupIdToExerciseResult = exerciseGroupIdToExerciseResult;
    return this;
  }

  public StudentResult putExerciseGroupIdToExerciseResultItem(String key, ExerciseResult exerciseGroupIdToExerciseResultItem) {
    if (this.exerciseGroupIdToExerciseResult == null) {
      this.exerciseGroupIdToExerciseResult = new HashMap<>();
    }
    this.exerciseGroupIdToExerciseResult.put(key, exerciseGroupIdToExerciseResultItem);
    return this;
  }

   /**
   * Get exerciseGroupIdToExerciseResult
   * @return exerciseGroupIdToExerciseResult
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_GROUP_ID_TO_EXERCISE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, ExerciseResult> getExerciseGroupIdToExerciseResult() {
    return exerciseGroupIdToExerciseResult;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_GROUP_ID_TO_EXERCISE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseGroupIdToExerciseResult(Map<String, ExerciseResult> exerciseGroupIdToExerciseResult) {
    this.exerciseGroupIdToExerciseResult = exerciseGroupIdToExerciseResult;
  }


  public StudentResult mostSeverePlagiarismVerdict(MostSeverePlagiarismVerdictEnum mostSeverePlagiarismVerdict) {
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


  /**
   * Return true if this StudentResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentResult studentResult = (StudentResult) o;
    return Objects.equals(this.userId, studentResult.userId) &&
        Objects.equals(this.name, studentResult.name) &&
        Objects.equals(this.email, studentResult.email) &&
        Objects.equals(this.login, studentResult.login) &&
        Objects.equals(this.registrationNumber, studentResult.registrationNumber) &&
        Objects.equals(this.submitted, studentResult.submitted) &&
        Objects.equals(this.overallPointsAchieved, studentResult.overallPointsAchieved) &&
        Objects.equals(this.overallScoreAchieved, studentResult.overallScoreAchieved) &&
        Objects.equals(this.overallGrade, studentResult.overallGrade) &&
        Objects.equals(this.overallGradeInFirstCorrection, studentResult.overallGradeInFirstCorrection) &&
        Objects.equals(this.hasPassed, studentResult.hasPassed) &&
        Objects.equals(this.overallPointsAchievedInFirstCorrection, studentResult.overallPointsAchievedInFirstCorrection) &&
        Objects.equals(this.gradeWithBonus, studentResult.gradeWithBonus) &&
        Objects.equals(this.exerciseGroupIdToExerciseResult, studentResult.exerciseGroupIdToExerciseResult) &&
        Objects.equals(this.mostSeverePlagiarismVerdict, studentResult.mostSeverePlagiarismVerdict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name, email, login, registrationNumber, submitted, overallPointsAchieved, overallScoreAchieved, overallGrade, overallGradeInFirstCorrection, hasPassed, overallPointsAchievedInFirstCorrection, gradeWithBonus, exerciseGroupIdToExerciseResult, mostSeverePlagiarismVerdict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentResult {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    overallPointsAchieved: ").append(toIndentedString(overallPointsAchieved)).append("\n");
    sb.append("    overallScoreAchieved: ").append(toIndentedString(overallScoreAchieved)).append("\n");
    sb.append("    overallGrade: ").append(toIndentedString(overallGrade)).append("\n");
    sb.append("    overallGradeInFirstCorrection: ").append(toIndentedString(overallGradeInFirstCorrection)).append("\n");
    sb.append("    hasPassed: ").append(toIndentedString(hasPassed)).append("\n");
    sb.append("    overallPointsAchievedInFirstCorrection: ").append(toIndentedString(overallPointsAchievedInFirstCorrection)).append("\n");
    sb.append("    gradeWithBonus: ").append(toIndentedString(gradeWithBonus)).append("\n");
    sb.append("    exerciseGroupIdToExerciseResult: ").append(toIndentedString(exerciseGroupIdToExerciseResult)).append("\n");
    sb.append("    mostSeverePlagiarismVerdict: ").append(toIndentedString(mostSeverePlagiarismVerdict)).append("\n");
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

