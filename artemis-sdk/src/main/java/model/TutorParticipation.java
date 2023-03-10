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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.ExampleSubmission;
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.User;

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
 * TutorParticipation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TutorParticipation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_PARTICIPATED("NOT_PARTICIPATED"),
    
    REVIEWED_INSTRUCTIONS("REVIEWED_INSTRUCTIONS"),
    
    TRAINED("TRAINED"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ASSESSED_EXERCISE = "assessedExercise";
  @SerializedName(SERIALIZED_NAME_ASSESSED_EXERCISE)
  private Exercise assessedExercise;

  public static final String SERIALIZED_NAME_TUTOR = "tutor";
  @SerializedName(SERIALIZED_NAME_TUTOR)
  private User tutor;

  public static final String SERIALIZED_NAME_TRAINED_EXAMPLE_SUBMISSIONS = "trainedExampleSubmissions";
  @SerializedName(SERIALIZED_NAME_TRAINED_EXAMPLE_SUBMISSIONS)
  private Set<ExampleSubmission> trainedExampleSubmissions = new LinkedHashSet<>();

  public TutorParticipation() {
  }

  public TutorParticipation id(Long id) {
    
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


  public TutorParticipation status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TutorParticipation assessedExercise(Exercise assessedExercise) {
    
    this.assessedExercise = assessedExercise;
    return this;
  }

   /**
   * Get assessedExercise
   * @return assessedExercise
  **/
  @javax.annotation.Nullable

  public Exercise getAssessedExercise() {
    return assessedExercise;
  }


  public void setAssessedExercise(Exercise assessedExercise) {
    this.assessedExercise = assessedExercise;
  }


  public TutorParticipation tutor(User tutor) {
    
    this.tutor = tutor;
    return this;
  }

   /**
   * Get tutor
   * @return tutor
  **/
  @javax.annotation.Nullable

  public User getTutor() {
    return tutor;
  }


  public void setTutor(User tutor) {
    this.tutor = tutor;
  }


  public TutorParticipation trainedExampleSubmissions(Set<ExampleSubmission> trainedExampleSubmissions) {
    
    this.trainedExampleSubmissions = trainedExampleSubmissions;
    return this;
  }

  public TutorParticipation addTrainedExampleSubmissionsItem(ExampleSubmission trainedExampleSubmissionsItem) {
    if (this.trainedExampleSubmissions == null) {
      this.trainedExampleSubmissions = new LinkedHashSet<>();
    }
    this.trainedExampleSubmissions.add(trainedExampleSubmissionsItem);
    return this;
  }

   /**
   * Get trainedExampleSubmissions
   * @return trainedExampleSubmissions
  **/
  @javax.annotation.Nullable

  public Set<ExampleSubmission> getTrainedExampleSubmissions() {
    return trainedExampleSubmissions;
  }


  public void setTrainedExampleSubmissions(Set<ExampleSubmission> trainedExampleSubmissions) {
    this.trainedExampleSubmissions = trainedExampleSubmissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorParticipation tutorParticipation = (TutorParticipation) o;
    return Objects.equals(this.id, tutorParticipation.id) &&
        Objects.equals(this.status, tutorParticipation.status) &&
        Objects.equals(this.assessedExercise, tutorParticipation.assessedExercise) &&
        Objects.equals(this.tutor, tutorParticipation.tutor) &&
        Objects.equals(this.trainedExampleSubmissions, tutorParticipation.trainedExampleSubmissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, assessedExercise, tutor, trainedExampleSubmissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorParticipation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assessedExercise: ").append(toIndentedString(assessedExercise)).append("\n");
    sb.append("    tutor: ").append(toIndentedString(tutor)).append("\n");
    sb.append("    trainedExampleSubmissions: ").append(toIndentedString(trainedExampleSubmissions)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("assessedExercise");
    openapiFields.add("tutor");
    openapiFields.add("trainedExampleSubmissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TutorParticipation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TutorParticipation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TutorParticipation is not found in the empty JSON string", TutorParticipation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TutorParticipation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TutorParticipation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `assessedExercise`
      if (jsonObj.get("assessedExercise") != null && !jsonObj.get("assessedExercise").isJsonNull()) {
        Exercise.validateJsonObject(jsonObj.getAsJsonObject("assessedExercise"));
      }
      // validate the optional field `tutor`
      if (jsonObj.get("tutor") != null && !jsonObj.get("tutor").isJsonNull()) {
        User.validateJsonObject(jsonObj.getAsJsonObject("tutor"));
      }
      if (jsonObj.get("trainedExampleSubmissions") != null && !jsonObj.get("trainedExampleSubmissions").isJsonNull()) {
        JsonArray jsonArraytrainedExampleSubmissions = jsonObj.getAsJsonArray("trainedExampleSubmissions");
        if (jsonArraytrainedExampleSubmissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trainedExampleSubmissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trainedExampleSubmissions` to be an array in the JSON string but got `%s`", jsonObj.get("trainedExampleSubmissions").toString()));
          }

          // validate the optional field `trainedExampleSubmissions` (array)
          for (int i = 0; i < jsonArraytrainedExampleSubmissions.size(); i++) {
            ExampleSubmission.validateJsonObject(jsonArraytrainedExampleSubmissions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TutorParticipation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TutorParticipation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TutorParticipation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TutorParticipation.class));

       return (TypeAdapter<T>) new TypeAdapter<TutorParticipation>() {
           @Override
           public void write(JsonWriter out, TutorParticipation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TutorParticipation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TutorParticipation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TutorParticipation
  * @throws IOException if the JSON string is invalid with respect to TutorParticipation
  */
  public static TutorParticipation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TutorParticipation.class);
  }

 /**
  * Convert an instance of TutorParticipation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

