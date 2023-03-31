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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.LearningGoal;
import de.tum.cit.ase.artemis.sdk.model.Lecture;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * LectureUnit
 */
@JsonPropertyOrder({
  LectureUnit.JSON_PROPERTY_ID,
  LectureUnit.JSON_PROPERTY_NAME,
  LectureUnit.JSON_PROPERTY_RELEASE_DATE,
  LectureUnit.JSON_PROPERTY_ORDER,
  LectureUnit.JSON_PROPERTY_LECTURE,
  LectureUnit.JSON_PROPERTY_LEARNING_GOALS,
  LectureUnit.JSON_PROPERTY_COMPLETED,
  LectureUnit.JSON_PROPERTY_VISIBLE_TO_STUDENTS,
  LectureUnit.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AttachmentUnit.class, name = "AttachmentUnit"),
  @JsonSubTypes.Type(value = ExerciseUnit.class, name = "ExerciseUnit"),
  @JsonSubTypes.Type(value = OnlineUnit.class, name = "OnlineUnit"),
  @JsonSubTypes.Type(value = TextUnit.class, name = "TextUnit"),
  @JsonSubTypes.Type(value = VideoUnit.class, name = "VideoUnit"),
})

public class LectureUnit {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private OffsetDateTime releaseDate;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_LECTURE = "lecture";
  private Lecture lecture;

  public static final String JSON_PROPERTY_LEARNING_GOALS = "learningGoals";
  private Set<LearningGoal> learningGoals;

  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private Boolean completed;

  public static final String JSON_PROPERTY_VISIBLE_TO_STUDENTS = "visibleToStudents";
  private Boolean visibleToStudents;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public LectureUnit() { 
  }

  public LectureUnit id(Long id) {
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


  public LectureUnit name(String name) {
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


  public LectureUnit releaseDate(OffsetDateTime releaseDate) {
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


  public LectureUnit order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public LectureUnit lecture(Lecture lecture) {
    this.lecture = lecture;
    return this;
  }

   /**
   * Get lecture
   * @return lecture
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Lecture getLecture() {
    return lecture;
  }


  @JsonProperty(JSON_PROPERTY_LECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLecture(Lecture lecture) {
    this.lecture = lecture;
  }


  public LectureUnit learningGoals(Set<LearningGoal> learningGoals) {
    this.learningGoals = learningGoals;
    return this;
  }

  public LectureUnit addLearningGoalsItem(LearningGoal learningGoalsItem) {
    if (this.learningGoals == null) {
      this.learningGoals = new LinkedHashSet<>();
    }
    this.learningGoals.add(learningGoalsItem);
    return this;
  }

   /**
   * Get learningGoals
   * @return learningGoals
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEARNING_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<LearningGoal> getLearningGoals() {
    return learningGoals;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_LEARNING_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLearningGoals(Set<LearningGoal> learningGoals) {
    this.learningGoals = learningGoals;
  }


  public LectureUnit completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCompleted() {
    return completed;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  public LectureUnit visibleToStudents(Boolean visibleToStudents) {
    this.visibleToStudents = visibleToStudents;
    return this;
  }

   /**
   * Get visibleToStudents
   * @return visibleToStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_TO_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisibleToStudents() {
    return visibleToStudents;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_TO_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleToStudents(Boolean visibleToStudents) {
    this.visibleToStudents = visibleToStudents;
  }


  public LectureUnit type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this LectureUnit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LectureUnit lectureUnit = (LectureUnit) o;
    return Objects.equals(this.id, lectureUnit.id) &&
        Objects.equals(this.name, lectureUnit.name) &&
        Objects.equals(this.releaseDate, lectureUnit.releaseDate) &&
        Objects.equals(this.order, lectureUnit.order) &&
        Objects.equals(this.lecture, lectureUnit.lecture) &&
        Objects.equals(this.learningGoals, lectureUnit.learningGoals) &&
        Objects.equals(this.completed, lectureUnit.completed) &&
        Objects.equals(this.visibleToStudents, lectureUnit.visibleToStudents) &&
        Objects.equals(this.type, lectureUnit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, releaseDate, order, lecture, learningGoals, completed, visibleToStudents, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LectureUnit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    lecture: ").append(toIndentedString(lecture)).append("\n");
    sb.append("    learningGoals: ").append(toIndentedString(learningGoals)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    visibleToStudents: ").append(toIndentedString(visibleToStudents)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

  static {
    // Initialize and register the discriminator mappings.
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("AttachmentUnit", AttachmentUnit.class);
    mappings.put("ExerciseUnit", ExerciseUnit.class);
    mappings.put("OnlineUnit", OnlineUnit.class);
    mappings.put("TextUnit", TextUnit.class);
    mappings.put("VideoUnit", VideoUnit.class);
    mappings.put("LectureUnit", LectureUnit.class);
    JSON.registerDiscriminator(LectureUnit.class, "type", mappings);
  }
}

