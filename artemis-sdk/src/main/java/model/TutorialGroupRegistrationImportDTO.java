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
import org.openapitools.client.model.StudentDTO;

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
 * TutorialGroupRegistrationImportDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TutorialGroupRegistrationImportDTO {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STUDENT = "student";
  @SerializedName(SERIALIZED_NAME_STUDENT)
  private StudentDTO student;

  public static final String SERIALIZED_NAME_IMPORT_SUCCESSFUL = "importSuccessful";
  @SerializedName(SERIALIZED_NAME_IMPORT_SUCCESSFUL)
  private Boolean importSuccessful;

  /**
   * Gets or Sets error
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
  public enum ErrorEnum {
    NO_TITLE("NO_TITLE"),
    
    NO_USER_FOUND("NO_USER_FOUND"),
    
    MULTIPLE_REGISTRATIONS("MULTIPLE_REGISTRATIONS");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorEnum error;

  public TutorialGroupRegistrationImportDTO() {
  }

  public TutorialGroupRegistrationImportDTO title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TutorialGroupRegistrationImportDTO student(StudentDTO student) {
    
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @javax.annotation.Nullable

  public StudentDTO getStudent() {
    return student;
  }


  public void setStudent(StudentDTO student) {
    this.student = student;
  }


  public TutorialGroupRegistrationImportDTO importSuccessful(Boolean importSuccessful) {
    
    this.importSuccessful = importSuccessful;
    return this;
  }

   /**
   * Get importSuccessful
   * @return importSuccessful
  **/
  @javax.annotation.Nullable

  public Boolean getImportSuccessful() {
    return importSuccessful;
  }


  public void setImportSuccessful(Boolean importSuccessful) {
    this.importSuccessful = importSuccessful;
  }


  public TutorialGroupRegistrationImportDTO error(ErrorEnum error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable

  public ErrorEnum getError() {
    return error;
  }


  public void setError(ErrorEnum error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupRegistrationImportDTO tutorialGroupRegistrationImportDTO = (TutorialGroupRegistrationImportDTO) o;
    return Objects.equals(this.title, tutorialGroupRegistrationImportDTO.title) &&
        Objects.equals(this.student, tutorialGroupRegistrationImportDTO.student) &&
        Objects.equals(this.importSuccessful, tutorialGroupRegistrationImportDTO.importSuccessful) &&
        Objects.equals(this.error, tutorialGroupRegistrationImportDTO.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, student, importSuccessful, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupRegistrationImportDTO {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    importSuccessful: ").append(toIndentedString(importSuccessful)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("student");
    openapiFields.add("importSuccessful");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TutorialGroupRegistrationImportDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TutorialGroupRegistrationImportDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TutorialGroupRegistrationImportDTO is not found in the empty JSON string", TutorialGroupRegistrationImportDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TutorialGroupRegistrationImportDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TutorialGroupRegistrationImportDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `student`
      if (jsonObj.get("student") != null && !jsonObj.get("student").isJsonNull()) {
        StudentDTO.validateJsonObject(jsonObj.getAsJsonObject("student"));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TutorialGroupRegistrationImportDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TutorialGroupRegistrationImportDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TutorialGroupRegistrationImportDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TutorialGroupRegistrationImportDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TutorialGroupRegistrationImportDTO>() {
           @Override
           public void write(JsonWriter out, TutorialGroupRegistrationImportDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TutorialGroupRegistrationImportDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TutorialGroupRegistrationImportDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TutorialGroupRegistrationImportDTO
  * @throws IOException if the JSON string is invalid with respect to TutorialGroupRegistrationImportDTO
  */
  public static TutorialGroupRegistrationImportDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TutorialGroupRegistrationImportDTO.class);
  }

 /**
  * Convert an instance of TutorialGroupRegistrationImportDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

