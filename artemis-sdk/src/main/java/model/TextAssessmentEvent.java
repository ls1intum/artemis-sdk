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


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TextAssessmentEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TextAssessmentEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType;

  /**
   * Gets or Sets feedbackType
   */
  @JsonAdapter(FeedbackTypeEnum.Adapter.class)
  public enum FeedbackTypeEnum {
    MANUAL("MANUAL"),
    
    MANUAL_UNREFERENCED("MANUAL_UNREFERENCED"),
    
    AUTOMATIC_ADAPTED("AUTOMATIC_ADAPTED"),
    
    AUTOMATIC("AUTOMATIC");

    private String value;

    FeedbackTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeedbackTypeEnum fromValue(String value) {
      for (FeedbackTypeEnum b : FeedbackTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeedbackTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeedbackTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeedbackTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeedbackTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEEDBACK_TYPE = "feedbackType";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_TYPE)
  private FeedbackTypeEnum feedbackType;

  /**
   * Gets or Sets segmentType
   */
  @JsonAdapter(SegmentTypeEnum.Adapter.class)
  public enum SegmentTypeEnum {
    AUTOMATIC("AUTOMATIC"),
    
    MANUAL("MANUAL");

    private String value;

    SegmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SegmentTypeEnum fromValue(String value) {
      for (SegmentTypeEnum b : SegmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SegmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SegmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SegmentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEGMENT_TYPE = "segmentType";
  @SerializedName(SERIALIZED_NAME_SEGMENT_TYPE)
  private SegmentTypeEnum segmentType;

  public static final String SERIALIZED_NAME_COURSE_ID = "courseId";
  @SerializedName(SERIALIZED_NAME_COURSE_ID)
  private Long courseId;

  public static final String SERIALIZED_NAME_TEXT_EXERCISE_ID = "textExerciseId";
  @SerializedName(SERIALIZED_NAME_TEXT_EXERCISE_ID)
  private Long textExerciseId;

  public static final String SERIALIZED_NAME_PARTICIPATION_ID = "participationId";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION_ID)
  private Long participationId;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submissionId";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
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
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


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
  @javax.annotation.Nullable

  public Long getUserId() {
    return userId;
  }


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
  @javax.annotation.Nullable

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


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
  @javax.annotation.Nullable

  public EventTypeEnum getEventType() {
    return eventType;
  }


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
  @javax.annotation.Nullable

  public FeedbackTypeEnum getFeedbackType() {
    return feedbackType;
  }


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
  @javax.annotation.Nullable

  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }


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
  @javax.annotation.Nullable

  public Long getCourseId() {
    return courseId;
  }


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
  @javax.annotation.Nullable

  public Long getTextExerciseId() {
    return textExerciseId;
  }


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
  @javax.annotation.Nullable

  public Long getParticipationId() {
    return participationId;
  }


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
  @javax.annotation.Nullable

  public Long getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(Long submissionId) {
    this.submissionId = submissionId;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("userId");
    openapiFields.add("timestamp");
    openapiFields.add("eventType");
    openapiFields.add("feedbackType");
    openapiFields.add("segmentType");
    openapiFields.add("courseId");
    openapiFields.add("textExerciseId");
    openapiFields.add("participationId");
    openapiFields.add("submissionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TextAssessmentEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TextAssessmentEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextAssessmentEvent is not found in the empty JSON string", TextAssessmentEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TextAssessmentEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextAssessmentEvent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("feedbackType") != null && !jsonObj.get("feedbackType").isJsonNull()) && !jsonObj.get("feedbackType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedbackType").toString()));
      }
      if ((jsonObj.get("segmentType") != null && !jsonObj.get("segmentType").isJsonNull()) && !jsonObj.get("segmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segmentType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextAssessmentEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextAssessmentEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextAssessmentEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextAssessmentEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<TextAssessmentEvent>() {
           @Override
           public void write(JsonWriter out, TextAssessmentEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextAssessmentEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TextAssessmentEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TextAssessmentEvent
  * @throws IOException if the JSON string is invalid with respect to TextAssessmentEvent
  */
  public static TextAssessmentEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextAssessmentEvent.class);
  }

 /**
  * Convert an instance of TextAssessmentEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

