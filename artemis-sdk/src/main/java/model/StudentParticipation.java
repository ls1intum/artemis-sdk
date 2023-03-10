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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.GetAllTextSubmissions200ResponseInner;
import org.openapitools.client.model.Participation;
import org.openapitools.client.model.Result;
import org.openapitools.client.model.Team;
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
 * StudentParticipation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class StudentParticipation extends Participation {
  public static final String SERIALIZED_NAME_PRESENTATION_SCORE = "presentationScore";
  @SerializedName(SERIALIZED_NAME_PRESENTATION_SCORE)
  private Integer presentationScore;

  public static final String SERIALIZED_NAME_STUDENT = "student";
  @SerializedName(SERIALIZED_NAME_STUDENT)
  private User student;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private Team team;

  public static final String SERIALIZED_NAME_PARTICIPANT_IDENTIFIER = "participantIdentifier";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_IDENTIFIER)
  private String participantIdentifier;

  public static final String SERIALIZED_NAME_PARTICIPANT_NAME = "participantName";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_NAME)
  private String participantName;

  public StudentParticipation() {
    this.type = this.getClass().getSimpleName();
  }

  public StudentParticipation presentationScore(Integer presentationScore) {
    
    this.presentationScore = presentationScore;
    return this;
  }

   /**
   * Get presentationScore
   * @return presentationScore
  **/
  @javax.annotation.Nullable

  public Integer getPresentationScore() {
    return presentationScore;
  }


  public void setPresentationScore(Integer presentationScore) {
    this.presentationScore = presentationScore;
  }


  public StudentParticipation student(User student) {
    
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @javax.annotation.Nullable

  public User getStudent() {
    return student;
  }


  public void setStudent(User student) {
    this.student = student;
  }


  public StudentParticipation team(Team team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable

  public Team getTeam() {
    return team;
  }


  public void setTeam(Team team) {
    this.team = team;
  }


  public StudentParticipation participantIdentifier(String participantIdentifier) {
    
    this.participantIdentifier = participantIdentifier;
    return this;
  }

   /**
   * Get participantIdentifier
   * @return participantIdentifier
  **/
  @javax.annotation.Nullable

  public String getParticipantIdentifier() {
    return participantIdentifier;
  }


  public void setParticipantIdentifier(String participantIdentifier) {
    this.participantIdentifier = participantIdentifier;
  }


  public StudentParticipation participantName(String participantName) {
    
    this.participantName = participantName;
    return this;
  }

   /**
   * Get participantName
   * @return participantName
  **/
  @javax.annotation.Nullable

  public String getParticipantName() {
    return participantName;
  }


  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentParticipation studentParticipation = (StudentParticipation) o;
    return Objects.equals(this.presentationScore, studentParticipation.presentationScore) &&
        Objects.equals(this.student, studentParticipation.student) &&
        Objects.equals(this.team, studentParticipation.team) &&
        Objects.equals(this.participantIdentifier, studentParticipation.participantIdentifier) &&
        Objects.equals(this.participantName, studentParticipation.participantName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationScore, student, team, participantIdentifier, participantName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentParticipation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presentationScore: ").append(toIndentedString(presentationScore)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    participantIdentifier: ").append(toIndentedString(participantIdentifier)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
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
    openapiFields.add("initializationState");
    openapiFields.add("initializationDate");
    openapiFields.add("individualDueDate");
    openapiFields.add("testRun");
    openapiFields.add("exercise");
    openapiFields.add("results");
    openapiFields.add("submissions");
    openapiFields.add("submissionCount");
    openapiFields.add("type");
    openapiFields.add("presentationScore");
    openapiFields.add("student");
    openapiFields.add("team");
    openapiFields.add("participantIdentifier");
    openapiFields.add("participantName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StudentParticipation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StudentParticipation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StudentParticipation is not found in the empty JSON string", StudentParticipation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StudentParticipation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StudentParticipation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StudentParticipation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StudentParticipation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StudentParticipation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StudentParticipation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StudentParticipation.class));

       return (TypeAdapter<T>) new TypeAdapter<StudentParticipation>() {
           @Override
           public void write(JsonWriter out, StudentParticipation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StudentParticipation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StudentParticipation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StudentParticipation
  * @throws IOException if the JSON string is invalid with respect to StudentParticipation
  */
  public static StudentParticipation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StudentParticipation.class);
  }

 /**
  * Convert an instance of StudentParticipation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

