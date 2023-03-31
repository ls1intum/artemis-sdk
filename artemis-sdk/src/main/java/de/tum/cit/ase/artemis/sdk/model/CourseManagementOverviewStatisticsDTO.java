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
import de.tum.cit.ase.artemis.sdk.model.CourseManagementOverviewExerciseStatisticsDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CourseManagementOverviewStatisticsDTO
 */
@JsonPropertyOrder({
  CourseManagementOverviewStatisticsDTO.JSON_PROPERTY_COURSE_ID,
  CourseManagementOverviewStatisticsDTO.JSON_PROPERTY_ACTIVE_STUDENTS,
  CourseManagementOverviewStatisticsDTO.JSON_PROPERTY_EXERCISE_D_T_O_S
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class CourseManagementOverviewStatisticsDTO {
  public static final String JSON_PROPERTY_COURSE_ID = "courseId";
  private Long courseId;

  public static final String JSON_PROPERTY_ACTIVE_STUDENTS = "activeStudents";
  private List<Integer> activeStudents;

  public static final String JSON_PROPERTY_EXERCISE_D_T_O_S = "exerciseDTOS";
  private List<CourseManagementOverviewExerciseStatisticsDTO> exerciseDTOS;

  public CourseManagementOverviewStatisticsDTO() { 
  }

  public CourseManagementOverviewStatisticsDTO courseId(Long courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Get courseId
   * @return courseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCourseId() {
    return courseId;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }


  public CourseManagementOverviewStatisticsDTO activeStudents(List<Integer> activeStudents) {
    this.activeStudents = activeStudents;
    return this;
  }

  public CourseManagementOverviewStatisticsDTO addActiveStudentsItem(Integer activeStudentsItem) {
    if (this.activeStudents == null) {
      this.activeStudents = new ArrayList<>();
    }
    this.activeStudents.add(activeStudentsItem);
    return this;
  }

   /**
   * Get activeStudents
   * @return activeStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getActiveStudents() {
    return activeStudents;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveStudents(List<Integer> activeStudents) {
    this.activeStudents = activeStudents;
  }


  public CourseManagementOverviewStatisticsDTO exerciseDTOS(List<CourseManagementOverviewExerciseStatisticsDTO> exerciseDTOS) {
    this.exerciseDTOS = exerciseDTOS;
    return this;
  }

  public CourseManagementOverviewStatisticsDTO addExerciseDTOSItem(CourseManagementOverviewExerciseStatisticsDTO exerciseDTOSItem) {
    if (this.exerciseDTOS == null) {
      this.exerciseDTOS = new ArrayList<>();
    }
    this.exerciseDTOS.add(exerciseDTOSItem);
    return this;
  }

   /**
   * Get exerciseDTOS
   * @return exerciseDTOS
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_D_T_O_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CourseManagementOverviewExerciseStatisticsDTO> getExerciseDTOS() {
    return exerciseDTOS;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_D_T_O_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseDTOS(List<CourseManagementOverviewExerciseStatisticsDTO> exerciseDTOS) {
    this.exerciseDTOS = exerciseDTOS;
  }


  /**
   * Return true if this CourseManagementOverviewStatisticsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseManagementOverviewStatisticsDTO courseManagementOverviewStatisticsDTO = (CourseManagementOverviewStatisticsDTO) o;
    return Objects.equals(this.courseId, courseManagementOverviewStatisticsDTO.courseId) &&
        Objects.equals(this.activeStudents, courseManagementOverviewStatisticsDTO.activeStudents) &&
        Objects.equals(this.exerciseDTOS, courseManagementOverviewStatisticsDTO.exerciseDTOS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, activeStudents, exerciseDTOS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseManagementOverviewStatisticsDTO {\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    activeStudents: ").append(toIndentedString(activeStudents)).append("\n");
    sb.append("    exerciseDTOS: ").append(toIndentedString(exerciseDTOS)).append("\n");
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

