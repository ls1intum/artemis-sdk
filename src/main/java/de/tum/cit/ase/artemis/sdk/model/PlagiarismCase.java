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
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismSubmissionObject;
import de.tum.cit.ase.artemis.sdk.model.Post;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * PlagiarismCase
 */
@JsonPropertyOrder({
  PlagiarismCase.JSON_PROPERTY_ID,
  PlagiarismCase.JSON_PROPERTY_EXERCISE,
  PlagiarismCase.JSON_PROPERTY_STUDENT,
  PlagiarismCase.JSON_PROPERTY_TEAM,
  PlagiarismCase.JSON_PROPERTY_POST,
  PlagiarismCase.JSON_PROPERTY_PLAGIARISM_SUBMISSIONS,
  PlagiarismCase.JSON_PROPERTY_VERDICT,
  PlagiarismCase.JSON_PROPERTY_VERDICT_MESSAGE,
  PlagiarismCase.JSON_PROPERTY_VERDICT_BY,
  PlagiarismCase.JSON_PROPERTY_VERDICT_DATE,
  PlagiarismCase.JSON_PROPERTY_VERDICT_POINT_DEDUCTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class PlagiarismCase {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private Exercise exercise;

  public static final String JSON_PROPERTY_STUDENT = "student";
  private User student;

  public static final String JSON_PROPERTY_TEAM = "team";
  private Team team;

  public static final String JSON_PROPERTY_POST = "post";
  private Post post;

  public static final String JSON_PROPERTY_PLAGIARISM_SUBMISSIONS = "plagiarismSubmissions";
  private Set<PlagiarismSubmissionObject> plagiarismSubmissions = new LinkedHashSet<>();

  /**
   * Gets or Sets verdict
   */
  public enum VerdictEnum {
    PLAGIARISM("PLAGIARISM"),
    
    POINT_DEDUCTION("POINT_DEDUCTION"),
    
    WARNING("WARNING"),
    
    NO_PLAGIARISM("NO_PLAGIARISM");

    private String value;

    VerdictEnum(String value) {
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
    public static VerdictEnum fromValue(String value) {
      for (VerdictEnum b : VerdictEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERDICT = "verdict";
  private VerdictEnum verdict;

  public static final String JSON_PROPERTY_VERDICT_MESSAGE = "verdictMessage";
  private String verdictMessage;

  public static final String JSON_PROPERTY_VERDICT_BY = "verdictBy";
  private User verdictBy;

  public static final String JSON_PROPERTY_VERDICT_DATE = "verdictDate";
  private OffsetDateTime verdictDate;

  public static final String JSON_PROPERTY_VERDICT_POINT_DEDUCTION = "verdictPointDeduction";
  private Integer verdictPointDeduction;

  public PlagiarismCase() { 
  }

  public PlagiarismCase id(Long id) {
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


  public PlagiarismCase exercise(Exercise exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Exercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public PlagiarismCase student(User student) {
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getStudent() {
    return student;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudent(User student) {
    this.student = student;
  }


  public PlagiarismCase team(Team team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Team getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeam(Team team) {
    this.team = team;
  }


  public PlagiarismCase post(Post post) {
    this.post = post;
    return this;
  }

   /**
   * Get post
   * @return post
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Post getPost() {
    return post;
  }


  @JsonProperty(JSON_PROPERTY_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPost(Post post) {
    this.post = post;
  }


  public PlagiarismCase plagiarismSubmissions(Set<PlagiarismSubmissionObject> plagiarismSubmissions) {
    this.plagiarismSubmissions = plagiarismSubmissions;
    return this;
  }

  public PlagiarismCase addPlagiarismSubmissionsItem(PlagiarismSubmissionObject plagiarismSubmissionsItem) {
    if (this.plagiarismSubmissions == null) {
      this.plagiarismSubmissions = new LinkedHashSet<>();
    }
    this.plagiarismSubmissions.add(plagiarismSubmissionsItem);
    return this;
  }

   /**
   * Get plagiarismSubmissions
   * @return plagiarismSubmissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PlagiarismSubmissionObject> getPlagiarismSubmissions() {
    return plagiarismSubmissions;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismSubmissions(Set<PlagiarismSubmissionObject> plagiarismSubmissions) {
    this.plagiarismSubmissions = plagiarismSubmissions;
  }


  public PlagiarismCase verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

   /**
   * Get verdict
   * @return verdict
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerdictEnum getVerdict() {
    return verdict;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }


  public PlagiarismCase verdictMessage(String verdictMessage) {
    this.verdictMessage = verdictMessage;
    return this;
  }

   /**
   * Get verdictMessage
   * @return verdictMessage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerdictMessage() {
    return verdictMessage;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdictMessage(String verdictMessage) {
    this.verdictMessage = verdictMessage;
  }


  public PlagiarismCase verdictBy(User verdictBy) {
    this.verdictBy = verdictBy;
    return this;
  }

   /**
   * Get verdictBy
   * @return verdictBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getVerdictBy() {
    return verdictBy;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdictBy(User verdictBy) {
    this.verdictBy = verdictBy;
  }


  public PlagiarismCase verdictDate(OffsetDateTime verdictDate) {
    this.verdictDate = verdictDate;
    return this;
  }

   /**
   * Get verdictDate
   * @return verdictDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getVerdictDate() {
    return verdictDate;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdictDate(OffsetDateTime verdictDate) {
    this.verdictDate = verdictDate;
  }


  public PlagiarismCase verdictPointDeduction(Integer verdictPointDeduction) {
    this.verdictPointDeduction = verdictPointDeduction;
    return this;
  }

   /**
   * Get verdictPointDeduction
   * @return verdictPointDeduction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT_POINT_DEDUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVerdictPointDeduction() {
    return verdictPointDeduction;
  }


  @JsonProperty(JSON_PROPERTY_VERDICT_POINT_DEDUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdictPointDeduction(Integer verdictPointDeduction) {
    this.verdictPointDeduction = verdictPointDeduction;
  }


  /**
   * Return true if this PlagiarismCase object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismCase plagiarismCase = (PlagiarismCase) o;
    return Objects.equals(this.id, plagiarismCase.id) &&
        Objects.equals(this.exercise, plagiarismCase.exercise) &&
        Objects.equals(this.student, plagiarismCase.student) &&
        Objects.equals(this.team, plagiarismCase.team) &&
        Objects.equals(this.post, plagiarismCase.post) &&
        Objects.equals(this.plagiarismSubmissions, plagiarismCase.plagiarismSubmissions) &&
        Objects.equals(this.verdict, plagiarismCase.verdict) &&
        Objects.equals(this.verdictMessage, plagiarismCase.verdictMessage) &&
        Objects.equals(this.verdictBy, plagiarismCase.verdictBy) &&
        Objects.equals(this.verdictDate, plagiarismCase.verdictDate) &&
        Objects.equals(this.verdictPointDeduction, plagiarismCase.verdictPointDeduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, exercise, student, team, post, plagiarismSubmissions, verdict, verdictMessage, verdictBy, verdictDate, verdictPointDeduction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismCase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    plagiarismSubmissions: ").append(toIndentedString(plagiarismSubmissions)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    verdictMessage: ").append(toIndentedString(verdictMessage)).append("\n");
    sb.append("    verdictBy: ").append(toIndentedString(verdictBy)).append("\n");
    sb.append("    verdictDate: ").append(toIndentedString(verdictDate)).append("\n");
    sb.append("    verdictPointDeduction: ").append(toIndentedString(verdictPointDeduction)).append("\n");
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

