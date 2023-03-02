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
import de.tum.cit.ase.artemis.sdk.model.ExerciseHint;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTestCase;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ProgrammingExerciseTask
 */
@JsonPropertyOrder({
  ProgrammingExerciseTask.JSON_PROPERTY_ID,
  ProgrammingExerciseTask.JSON_PROPERTY_TASK_NAME,
  ProgrammingExerciseTask.JSON_PROPERTY_EXERCISE_HINTS,
  ProgrammingExerciseTask.JSON_PROPERTY_TEST_CASES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ProgrammingExerciseTask {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TASK_NAME = "taskName";
  private String taskName;

  public static final String JSON_PROPERTY_EXERCISE_HINTS = "exerciseHints";
  private Set<ExerciseHint> exerciseHints = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TEST_CASES = "testCases";
  private Set<ProgrammingExerciseTestCase> testCases = new LinkedHashSet<>();

  public ProgrammingExerciseTask() { 
  }

  public ProgrammingExerciseTask id(Long id) {
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


  public ProgrammingExerciseTask taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskName() {
    return taskName;
  }


  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public ProgrammingExerciseTask exerciseHints(Set<ExerciseHint> exerciseHints) {
    this.exerciseHints = exerciseHints;
    return this;
  }

  public ProgrammingExerciseTask addExerciseHintsItem(ExerciseHint exerciseHintsItem) {
    if (this.exerciseHints == null) {
      this.exerciseHints = new LinkedHashSet<>();
    }
    this.exerciseHints.add(exerciseHintsItem);
    return this;
  }

   /**
   * Get exerciseHints
   * @return exerciseHints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_HINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ExerciseHint> getExerciseHints() {
    return exerciseHints;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_EXERCISE_HINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseHints(Set<ExerciseHint> exerciseHints) {
    this.exerciseHints = exerciseHints;
  }


  public ProgrammingExerciseTask testCases(Set<ProgrammingExerciseTestCase> testCases) {
    this.testCases = testCases;
    return this;
  }

  public ProgrammingExerciseTask addTestCasesItem(ProgrammingExerciseTestCase testCasesItem) {
    if (this.testCases == null) {
      this.testCases = new LinkedHashSet<>();
    }
    this.testCases.add(testCasesItem);
    return this;
  }

   /**
   * Get testCases
   * @return testCases
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ProgrammingExerciseTestCase> getTestCases() {
    return testCases;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TEST_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCases(Set<ProgrammingExerciseTestCase> testCases) {
    this.testCases = testCases;
  }


  /**
   * Return true if this ProgrammingExerciseTask object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseTask programmingExerciseTask = (ProgrammingExerciseTask) o;
    return Objects.equals(this.id, programmingExerciseTask.id) &&
        Objects.equals(this.taskName, programmingExerciseTask.taskName) &&
        Objects.equals(this.exerciseHints, programmingExerciseTask.exerciseHints) &&
        Objects.equals(this.testCases, programmingExerciseTask.testCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName, exerciseHints, testCases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseTask {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    exerciseHints: ").append(toIndentedString(exerciseHints)).append("\n");
    sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
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

