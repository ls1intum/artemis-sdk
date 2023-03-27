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
import de.tum.cit.ase.artemis.sdk.model.CodeHint;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTask;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExerciseHint
 */
@JsonPropertyOrder({
  ExerciseHint.JSON_PROPERTY_ID,
  ExerciseHint.JSON_PROPERTY_TITLE,
  ExerciseHint.JSON_PROPERTY_DESCRIPTION,
  ExerciseHint.JSON_PROPERTY_CONTENT,
  ExerciseHint.JSON_PROPERTY_EXERCISE,
  ExerciseHint.JSON_PROPERTY_DISPLAY_THRESHOLD,
  ExerciseHint.JSON_PROPERTY_PROGRAMMING_EXERCISE_TASK,
  ExerciseHint.JSON_PROPERTY_CURRENT_USER_RATING,
  ExerciseHint.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CodeHint.class, name = "CodeHint"),
})

public class ExerciseHint {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private ProgrammingExercise exercise;

  public static final String JSON_PROPERTY_DISPLAY_THRESHOLD = "displayThreshold";
  private Integer displayThreshold;

  public static final String JSON_PROPERTY_PROGRAMMING_EXERCISE_TASK = "programmingExerciseTask";
  private ProgrammingExerciseTask programmingExerciseTask;

  public static final String JSON_PROPERTY_CURRENT_USER_RATING = "currentUserRating";
  private Integer currentUserRating;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ExerciseHint() { 
  }

  public ExerciseHint id(Long id) {
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


  public ExerciseHint title(String title) {
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


  public ExerciseHint description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ExerciseHint content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public ExerciseHint exercise(ProgrammingExercise exercise) {
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

  public ProgrammingExercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(ProgrammingExercise exercise) {
    this.exercise = exercise;
  }


  public ExerciseHint displayThreshold(Integer displayThreshold) {
    this.displayThreshold = displayThreshold;
    return this;
  }

   /**
   * Get displayThreshold
   * minimum: 0
   * maximum: 100
   * @return displayThreshold
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDisplayThreshold() {
    return displayThreshold;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayThreshold(Integer displayThreshold) {
    this.displayThreshold = displayThreshold;
  }


  public ExerciseHint programmingExerciseTask(ProgrammingExerciseTask programmingExerciseTask) {
    this.programmingExerciseTask = programmingExerciseTask;
    return this;
  }

   /**
   * Get programmingExerciseTask
   * @return programmingExerciseTask
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProgrammingExerciseTask getProgrammingExerciseTask() {
    return programmingExerciseTask;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgrammingExerciseTask(ProgrammingExerciseTask programmingExerciseTask) {
    this.programmingExerciseTask = programmingExerciseTask;
  }


  public ExerciseHint currentUserRating(Integer currentUserRating) {
    this.currentUserRating = currentUserRating;
    return this;
  }

   /**
   * Get currentUserRating
   * @return currentUserRating
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_USER_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentUserRating() {
    return currentUserRating;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_USER_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentUserRating(Integer currentUserRating) {
    this.currentUserRating = currentUserRating;
  }


  public ExerciseHint type(String type) {
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
   * Return true if this ExerciseHint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseHint exerciseHint = (ExerciseHint) o;
    return Objects.equals(this.id, exerciseHint.id) &&
        Objects.equals(this.title, exerciseHint.title) &&
        Objects.equals(this.description, exerciseHint.description) &&
        Objects.equals(this.content, exerciseHint.content) &&
        Objects.equals(this.exercise, exerciseHint.exercise) &&
        Objects.equals(this.displayThreshold, exerciseHint.displayThreshold) &&
        Objects.equals(this.programmingExerciseTask, exerciseHint.programmingExerciseTask) &&
        Objects.equals(this.currentUserRating, exerciseHint.currentUserRating) &&
        Objects.equals(this.type, exerciseHint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, content, exercise, displayThreshold, programmingExerciseTask, currentUserRating, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseHint {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    displayThreshold: ").append(toIndentedString(displayThreshold)).append("\n");
    sb.append("    programmingExerciseTask: ").append(toIndentedString(programmingExerciseTask)).append("\n");
    sb.append("    currentUserRating: ").append(toIndentedString(currentUserRating)).append("\n");
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
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("CodeHint", CodeHint.class);
  mappings.put("ExerciseHint", ExerciseHint.class);
  JSON.registerDiscriminator(ExerciseHint.class, "type", mappings);
}
}

