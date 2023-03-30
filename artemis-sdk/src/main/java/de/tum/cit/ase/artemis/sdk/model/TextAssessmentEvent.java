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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TextAssessmentEvent
 */
@JsonPropertyOrder({
  TextAssessmentEvent.JSON_PROPERTY_ID,
  TextAssessmentEvent.JSON_PROPERTY_USER_ID,
  TextAssessmentEvent.JSON_PROPERTY_TIMESTAMP,
  TextAssessmentEvent.JSON_PROPERTY_EVENT_TYPE,
  TextAssessmentEvent.JSON_PROPERTY_FEEDBACK_TYPE,
  TextAssessmentEvent.JSON_PROPERTY_SEGMENT_TYPE,
  TextAssessmentEvent.JSON_PROPERTY_COURSE_ID,
  TextAssessmentEvent.JSON_PROPERTY_TEXT_EXERCISE_ID,
  TextAssessmentEvent.JSON_PROPERTY_PARTICIPATION_ID,
  TextAssessmentEvent.JSON_PROPERTY_SUBMISSION_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class TextAssessmentEvent {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  /**
   * Gets or Sets eventType
   */
  public enum EventTypeEnum {
    ADD_FEEDBACK_AUTOMATICALLY_SELECTED_BLOCK("ADD_FEEDBACK_AUTOMATICALLY_SELECTED_BLOCK"),
    
    ADD_FEEDBACK_MANUALLY_SELECTED_BLOCK("ADD_FEEDBACK_MANUALLY_SELECTED_BLOCK"),
    
    CLICK_TO_RESOLVE_CONFLICT("CLICK_TO_RESOLVE_CONFLICT"),
    
    HOVER_OVER_IMPACT_WARNING("HOVER_OVER_IMPACT_WARNING"),
    
    VIEW_AUTOMATIC_SUGGESTION_ORIGIN("VIEW_AUTOMATIC_SUGGESTION_ORIGIN"),
    
    DELETE_FEEDBACK("DELETE_FEEDBACK"),
    
    EDIT_AUTOMATIC_FEEDBACK("EDIT_AUTOMATIC_FEEDBACK"),
    
    SUBMIT_ASSESSMENT("SUBMIT_ASSESSMENT"),
    
    ASSESS_NEXT_SUBMISSION("ASSESS_NEXT_SUBMISSION");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType;

  /**
   * Gets or Sets feedbackType
   */
  public enum FeedbackTypeEnum {
    MANUAL("MANUAL"),
    
    MANUAL_UNREFERENCED("MANUAL_UNREFERENCED"),
    
    AUTOMATIC_ADAPTED("AUTOMATIC_ADAPTED"),
    
    AUTOMATIC("AUTOMATIC");

    private String value;

    FeedbackTypeEnum(String value) {
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
    public static FeedbackTypeEnum fromValue(String value) {
      for (FeedbackTypeEnum b : FeedbackTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FEEDBACK_TYPE = "feedbackType";
  private FeedbackTypeEnum feedbackType;

  /**
   * Gets or Sets segmentType
   */
  public enum SegmentTypeEnum {
    AUTOMATIC("AUTOMATIC"),
    
    MANUAL("MANUAL");

    private String value;

    SegmentTypeEnum(String value) {
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
    public static SegmentTypeEnum fromValue(String value) {
      for (SegmentTypeEnum b : SegmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEGMENT_TYPE = "segmentType";
  private SegmentTypeEnum segmentType;

  public static final String JSON_PROPERTY_COURSE_ID = "courseId";
  private Long courseId;

  public static final String JSON_PROPERTY_TEXT_EXERCISE_ID = "textExerciseId";
  private Long textExerciseId;

  public static final String JSON_PROPERTY_PARTICIPATION_ID = "participationId";
  private Long participationId;

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submissionId";
  private Long submissionId;

  public TextAssessmentEvent() { 
  }

  public TextAssessmentEvent id(Long id) {
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


  public TextAssessmentEvent userId(Long userId) {
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


  public TextAssessmentEvent timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TextAssessmentEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public TextAssessmentEvent feedbackType(FeedbackTypeEnum feedbackType) {
    this.feedbackType = feedbackType;
    return this;
  }

   /**
   * Get feedbackType
   * @return feedbackType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedbackTypeEnum getFeedbackType() {
    return feedbackType;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackType(FeedbackTypeEnum feedbackType) {
    this.feedbackType = feedbackType;
  }


  public TextAssessmentEvent segmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
    return this;
  }

   /**
   * Get segmentType
   * @return segmentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }


  public TextAssessmentEvent courseId(Long courseId) {
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


  public TextAssessmentEvent textExerciseId(Long textExerciseId) {
    this.textExerciseId = textExerciseId;
    return this;
  }

   /**
   * Get textExerciseId
   * @return textExerciseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTextExerciseId() {
    return textExerciseId;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextExerciseId(Long textExerciseId) {
    this.textExerciseId = textExerciseId;
  }


  public TextAssessmentEvent participationId(Long participationId) {
    this.participationId = participationId;
    return this;
  }

   /**
   * Get participationId
   * @return participationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParticipationId() {
    return participationId;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipationId(Long participationId) {
    this.participationId = participationId;
  }


  public TextAssessmentEvent submissionId(Long submissionId) {
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubmissionId() {
    return submissionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionId(Long submissionId) {
    this.submissionId = submissionId;
  }


  /**
   * Return true if this TextAssessmentEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAssessmentEvent textAssessmentEvent = (TextAssessmentEvent) o;
    return Objects.equals(this.id, textAssessmentEvent.id) &&
        Objects.equals(this.userId, textAssessmentEvent.userId) &&
        Objects.equals(this.timestamp, textAssessmentEvent.timestamp) &&
        Objects.equals(this.eventType, textAssessmentEvent.eventType) &&
        Objects.equals(this.feedbackType, textAssessmentEvent.feedbackType) &&
        Objects.equals(this.segmentType, textAssessmentEvent.segmentType) &&
        Objects.equals(this.courseId, textAssessmentEvent.courseId) &&
        Objects.equals(this.textExerciseId, textAssessmentEvent.textExerciseId) &&
        Objects.equals(this.participationId, textAssessmentEvent.participationId) &&
        Objects.equals(this.submissionId, textAssessmentEvent.submissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, timestamp, eventType, feedbackType, segmentType, courseId, textExerciseId, participationId, submissionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAssessmentEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    feedbackType: ").append(toIndentedString(feedbackType)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    textExerciseId: ").append(toIndentedString(textExerciseId)).append("\n");
    sb.append("    participationId: ").append(toIndentedString(participationId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
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

