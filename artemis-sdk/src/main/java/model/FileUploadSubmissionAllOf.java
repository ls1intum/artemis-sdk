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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Participation;
import org.openapitools.client.model.Result;

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
 * FileUploadSubmissionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class FileUploadSubmissionAllOf {
  public static final String SERIALIZED_NAME_PARTICIPATION = "participation";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION)
  private Participation participation;

  public static final String SERIALIZED_NAME_FILE_PATH = "filePath";
  @SerializedName(SERIALIZED_NAME_FILE_PATH)
  private String filePath;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<Result> results = new ArrayList<>();

  public FileUploadSubmissionAllOf() {
  }

  
  public FileUploadSubmissionAllOf(
     List<Result> results
  ) {
    this();
    this.results = results;
  }

  public FileUploadSubmissionAllOf participation(Participation participation) {
    
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  @javax.annotation.Nullable

  public Participation getParticipation() {
    return participation;
  }


  public void setParticipation(Participation participation) {
    this.participation = participation;
  }


  public FileUploadSubmissionAllOf filePath(String filePath) {
    
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  @javax.annotation.Nullable

  public String getFilePath() {
    return filePath;
  }


  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable

  public List<Result> getResults() {
    return results;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadSubmissionAllOf fileUploadSubmissionAllOf = (FileUploadSubmissionAllOf) o;
    return Objects.equals(this.participation, fileUploadSubmissionAllOf.participation) &&
        Objects.equals(this.filePath, fileUploadSubmissionAllOf.filePath) &&
        Objects.equals(this.results, fileUploadSubmissionAllOf.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, filePath, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadSubmissionAllOf {\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("participation");
    openapiFields.add("filePath");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileUploadSubmissionAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileUploadSubmissionAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileUploadSubmissionAllOf is not found in the empty JSON string", FileUploadSubmissionAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FileUploadSubmissionAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileUploadSubmissionAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `participation`
      if (jsonObj.get("participation") != null && !jsonObj.get("participation").isJsonNull()) {
        Participation.validateJsonObject(jsonObj.getAsJsonObject("participation"));
      }
      if ((jsonObj.get("filePath") != null && !jsonObj.get("filePath").isJsonNull()) && !jsonObj.get("filePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filePath").toString()));
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            Result.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUploadSubmissionAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUploadSubmissionAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUploadSubmissionAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUploadSubmissionAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUploadSubmissionAllOf>() {
           @Override
           public void write(JsonWriter out, FileUploadSubmissionAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileUploadSubmissionAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileUploadSubmissionAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileUploadSubmissionAllOf
  * @throws IOException if the JSON string is invalid with respect to FileUploadSubmissionAllOf
  */
  public static FileUploadSubmissionAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUploadSubmissionAllOf.class);
  }

 /**
  * Convert an instance of FileUploadSubmissionAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

