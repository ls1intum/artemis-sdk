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
 * PostContextFilter
 */
@JsonPropertyOrder({
  PostContextFilter.JSON_PROPERTY_COURSE_ID,
  PostContextFilter.JSON_PROPERTY_COURSE_WIDE_CONTEXT,
  PostContextFilter.JSON_PROPERTY_EXERCISE_ID,
  PostContextFilter.JSON_PROPERTY_LECTURE_ID,
  PostContextFilter.JSON_PROPERTY_PLAGIARISM_CASE_ID,
  PostContextFilter.JSON_PROPERTY_CONVERSATION_ID,
  PostContextFilter.JSON_PROPERTY_SEARCH_TEXT,
  PostContextFilter.JSON_PROPERTY_FILTER_TO_UNRESOLVED,
  PostContextFilter.JSON_PROPERTY_FILTER_TO_OWN,
  PostContextFilter.JSON_PROPERTY_FILTER_TO_ANSWERED_OR_REACTED,
  PostContextFilter.JSON_PROPERTY_POST_SORT_CRITERION,
  PostContextFilter.JSON_PROPERTY_SORTING_ORDER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class PostContextFilter {
  public static final String JSON_PROPERTY_COURSE_ID = "courseId";
  private Long courseId;

  /**
   * Gets or Sets courseWideContext
   */
  public enum CourseWideContextEnum {
    TECH_SUPPORT("TECH_SUPPORT"),
    
    ORGANIZATION("ORGANIZATION"),
    
    RANDOM("RANDOM"),
    
    ANNOUNCEMENT("ANNOUNCEMENT");

    private String value;

    CourseWideContextEnum(String value) {
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
    public static CourseWideContextEnum fromValue(String value) {
      for (CourseWideContextEnum b : CourseWideContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COURSE_WIDE_CONTEXT = "courseWideContext";
  private CourseWideContextEnum courseWideContext;

  public static final String JSON_PROPERTY_EXERCISE_ID = "exerciseId";
  private Long exerciseId;

  public static final String JSON_PROPERTY_LECTURE_ID = "lectureId";
  private Long lectureId;

  public static final String JSON_PROPERTY_PLAGIARISM_CASE_ID = "plagiarismCaseId";
  private Long plagiarismCaseId;

  public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
  private Long conversationId;

  public static final String JSON_PROPERTY_SEARCH_TEXT = "searchText";
  private String searchText;

  public static final String JSON_PROPERTY_FILTER_TO_UNRESOLVED = "filterToUnresolved";
  private Boolean filterToUnresolved;

  public static final String JSON_PROPERTY_FILTER_TO_OWN = "filterToOwn";
  private Boolean filterToOwn;

  public static final String JSON_PROPERTY_FILTER_TO_ANSWERED_OR_REACTED = "filterToAnsweredOrReacted";
  private Boolean filterToAnsweredOrReacted;

  /**
   * Gets or Sets postSortCriterion
   */
  public enum PostSortCriterionEnum {
    CREATION_DATE("CREATION_DATE"),
    
    VOTES("VOTES"),
    
    ANSWER_COUNT("ANSWER_COUNT");

    private String value;

    PostSortCriterionEnum(String value) {
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
    public static PostSortCriterionEnum fromValue(String value) {
      for (PostSortCriterionEnum b : PostSortCriterionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_POST_SORT_CRITERION = "postSortCriterion";
  private PostSortCriterionEnum postSortCriterion;

  /**
   * Gets or Sets sortingOrder
   */
  public enum SortingOrderEnum {
    ASCENDING("ASCENDING"),
    
    DESCENDING("DESCENDING");

    private String value;

    SortingOrderEnum(String value) {
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
    public static SortingOrderEnum fromValue(String value) {
      for (SortingOrderEnum b : SortingOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORTING_ORDER = "sortingOrder";
  private SortingOrderEnum sortingOrder;

  public PostContextFilter() { 
  }

  public PostContextFilter courseId(Long courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Get courseId
   * @return courseId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCourseId() {
    return courseId;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }


  public PostContextFilter courseWideContext(CourseWideContextEnum courseWideContext) {
    this.courseWideContext = courseWideContext;
    return this;
  }

   /**
   * Get courseWideContext
   * @return courseWideContext
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_WIDE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CourseWideContextEnum getCourseWideContext() {
    return courseWideContext;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_WIDE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseWideContext(CourseWideContextEnum courseWideContext) {
    this.courseWideContext = courseWideContext;
  }


  public PostContextFilter exerciseId(Long exerciseId) {
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


  public PostContextFilter lectureId(Long lectureId) {
    this.lectureId = lectureId;
    return this;
  }

   /**
   * Get lectureId
   * @return lectureId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LECTURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLectureId() {
    return lectureId;
  }


  @JsonProperty(JSON_PROPERTY_LECTURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLectureId(Long lectureId) {
    this.lectureId = lectureId;
  }


  public PostContextFilter plagiarismCaseId(Long plagiarismCaseId) {
    this.plagiarismCaseId = plagiarismCaseId;
    return this;
  }

   /**
   * Get plagiarismCaseId
   * @return plagiarismCaseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPlagiarismCaseId() {
    return plagiarismCaseId;
  }


  @JsonProperty(JSON_PROPERTY_PLAGIARISM_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismCaseId(Long plagiarismCaseId) {
    this.plagiarismCaseId = plagiarismCaseId;
  }


  public PostContextFilter conversationId(Long conversationId) {
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Get conversationId
   * @return conversationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversationId() {
    return conversationId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationId(Long conversationId) {
    this.conversationId = conversationId;
  }


  public PostContextFilter searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }

   /**
   * Get searchText
   * @return searchText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchText() {
    return searchText;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }


  public PostContextFilter filterToUnresolved(Boolean filterToUnresolved) {
    this.filterToUnresolved = filterToUnresolved;
    return this;
  }

   /**
   * Get filterToUnresolved
   * @return filterToUnresolved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_TO_UNRESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterToUnresolved() {
    return filterToUnresolved;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_TO_UNRESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterToUnresolved(Boolean filterToUnresolved) {
    this.filterToUnresolved = filterToUnresolved;
  }


  public PostContextFilter filterToOwn(Boolean filterToOwn) {
    this.filterToOwn = filterToOwn;
    return this;
  }

   /**
   * Get filterToOwn
   * @return filterToOwn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_TO_OWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterToOwn() {
    return filterToOwn;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_TO_OWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterToOwn(Boolean filterToOwn) {
    this.filterToOwn = filterToOwn;
  }


  public PostContextFilter filterToAnsweredOrReacted(Boolean filterToAnsweredOrReacted) {
    this.filterToAnsweredOrReacted = filterToAnsweredOrReacted;
    return this;
  }

   /**
   * Get filterToAnsweredOrReacted
   * @return filterToAnsweredOrReacted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_TO_ANSWERED_OR_REACTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterToAnsweredOrReacted() {
    return filterToAnsweredOrReacted;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_TO_ANSWERED_OR_REACTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterToAnsweredOrReacted(Boolean filterToAnsweredOrReacted) {
    this.filterToAnsweredOrReacted = filterToAnsweredOrReacted;
  }


  public PostContextFilter postSortCriterion(PostSortCriterionEnum postSortCriterion) {
    this.postSortCriterion = postSortCriterion;
    return this;
  }

   /**
   * Get postSortCriterion
   * @return postSortCriterion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_SORT_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSortCriterionEnum getPostSortCriterion() {
    return postSortCriterion;
  }


  @JsonProperty(JSON_PROPERTY_POST_SORT_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostSortCriterion(PostSortCriterionEnum postSortCriterion) {
    this.postSortCriterion = postSortCriterion;
  }


  public PostContextFilter sortingOrder(SortingOrderEnum sortingOrder) {
    this.sortingOrder = sortingOrder;
    return this;
  }

   /**
   * Get sortingOrder
   * @return sortingOrder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORTING_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SortingOrderEnum getSortingOrder() {
    return sortingOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORTING_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortingOrder(SortingOrderEnum sortingOrder) {
    this.sortingOrder = sortingOrder;
  }


  /**
   * Return true if this PostContextFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContextFilter postContextFilter = (PostContextFilter) o;
    return Objects.equals(this.courseId, postContextFilter.courseId) &&
        Objects.equals(this.courseWideContext, postContextFilter.courseWideContext) &&
        Objects.equals(this.exerciseId, postContextFilter.exerciseId) &&
        Objects.equals(this.lectureId, postContextFilter.lectureId) &&
        Objects.equals(this.plagiarismCaseId, postContextFilter.plagiarismCaseId) &&
        Objects.equals(this.conversationId, postContextFilter.conversationId) &&
        Objects.equals(this.searchText, postContextFilter.searchText) &&
        Objects.equals(this.filterToUnresolved, postContextFilter.filterToUnresolved) &&
        Objects.equals(this.filterToOwn, postContextFilter.filterToOwn) &&
        Objects.equals(this.filterToAnsweredOrReacted, postContextFilter.filterToAnsweredOrReacted) &&
        Objects.equals(this.postSortCriterion, postContextFilter.postSortCriterion) &&
        Objects.equals(this.sortingOrder, postContextFilter.sortingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, courseWideContext, exerciseId, lectureId, plagiarismCaseId, conversationId, searchText, filterToUnresolved, filterToOwn, filterToAnsweredOrReacted, postSortCriterion, sortingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContextFilter {\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    courseWideContext: ").append(toIndentedString(courseWideContext)).append("\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    lectureId: ").append(toIndentedString(lectureId)).append("\n");
    sb.append("    plagiarismCaseId: ").append(toIndentedString(plagiarismCaseId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    filterToUnresolved: ").append(toIndentedString(filterToUnresolved)).append("\n");
    sb.append("    filterToOwn: ").append(toIndentedString(filterToOwn)).append("\n");
    sb.append("    filterToAnsweredOrReacted: ").append(toIndentedString(filterToAnsweredOrReacted)).append("\n");
    sb.append("    postSortCriterion: ").append(toIndentedString(postSortCriterion)).append("\n");
    sb.append("    sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
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

