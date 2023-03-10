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
import org.openapitools.client.model.ModelingSubmissionElement;
import org.openapitools.client.model.PlagiarismCase;

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
 * PlagiarismSubmissionModelingSubmissionElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class PlagiarismSubmissionModelingSubmissionElement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submissionId";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private Long submissionId;

  public static final String SERIALIZED_NAME_STUDENT_LOGIN = "studentLogin";
  @SerializedName(SERIALIZED_NAME_STUDENT_LOGIN)
  private String studentLogin;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<ModelingSubmissionElement> elements = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLAGIARISM_CASE = "plagiarismCase";
  @SerializedName(SERIALIZED_NAME_PLAGIARISM_CASE)
  private PlagiarismCase plagiarismCase;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public PlagiarismSubmissionModelingSubmissionElement() {
  }

  public PlagiarismSubmissionModelingSubmissionElement id(Long id) {
    
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


  public PlagiarismSubmissionModelingSubmissionElement submissionId(Long submissionId) {
    
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


  public PlagiarismSubmissionModelingSubmissionElement studentLogin(String studentLogin) {
    
    this.studentLogin = studentLogin;
    return this;
  }

   /**
   * Get studentLogin
   * @return studentLogin
  **/
  @javax.annotation.Nullable

  public String getStudentLogin() {
    return studentLogin;
  }


  public void setStudentLogin(String studentLogin) {
    this.studentLogin = studentLogin;
  }


  public PlagiarismSubmissionModelingSubmissionElement elements(List<ModelingSubmissionElement> elements) {
    
    this.elements = elements;
    return this;
  }

  public PlagiarismSubmissionModelingSubmissionElement addElementsItem(ModelingSubmissionElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @javax.annotation.Nullable

  public List<ModelingSubmissionElement> getElements() {
    return elements;
  }


  public void setElements(List<ModelingSubmissionElement> elements) {
    this.elements = elements;
  }


  public PlagiarismSubmissionModelingSubmissionElement plagiarismCase(PlagiarismCase plagiarismCase) {
    
    this.plagiarismCase = plagiarismCase;
    return this;
  }

   /**
   * Get plagiarismCase
   * @return plagiarismCase
  **/
  @javax.annotation.Nullable

  public PlagiarismCase getPlagiarismCase() {
    return plagiarismCase;
  }


  public void setPlagiarismCase(PlagiarismCase plagiarismCase) {
    this.plagiarismCase = plagiarismCase;
  }


  public PlagiarismSubmissionModelingSubmissionElement size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public PlagiarismSubmissionModelingSubmissionElement score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismSubmissionModelingSubmissionElement plagiarismSubmissionModelingSubmissionElement = (PlagiarismSubmissionModelingSubmissionElement) o;
    return Objects.equals(this.id, plagiarismSubmissionModelingSubmissionElement.id) &&
        Objects.equals(this.submissionId, plagiarismSubmissionModelingSubmissionElement.submissionId) &&
        Objects.equals(this.studentLogin, plagiarismSubmissionModelingSubmissionElement.studentLogin) &&
        Objects.equals(this.elements, plagiarismSubmissionModelingSubmissionElement.elements) &&
        Objects.equals(this.plagiarismCase, plagiarismSubmissionModelingSubmissionElement.plagiarismCase) &&
        Objects.equals(this.size, plagiarismSubmissionModelingSubmissionElement.size) &&
        Objects.equals(this.score, plagiarismSubmissionModelingSubmissionElement.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submissionId, studentLogin, elements, plagiarismCase, size, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismSubmissionModelingSubmissionElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    studentLogin: ").append(toIndentedString(studentLogin)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    plagiarismCase: ").append(toIndentedString(plagiarismCase)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("submissionId");
    openapiFields.add("studentLogin");
    openapiFields.add("elements");
    openapiFields.add("plagiarismCase");
    openapiFields.add("size");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlagiarismSubmissionModelingSubmissionElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlagiarismSubmissionModelingSubmissionElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlagiarismSubmissionModelingSubmissionElement is not found in the empty JSON string", PlagiarismSubmissionModelingSubmissionElement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlagiarismSubmissionModelingSubmissionElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlagiarismSubmissionModelingSubmissionElement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("studentLogin") != null && !jsonObj.get("studentLogin").isJsonNull()) && !jsonObj.get("studentLogin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `studentLogin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("studentLogin").toString()));
      }
      if (jsonObj.get("elements") != null && !jsonObj.get("elements").isJsonNull()) {
        JsonArray jsonArrayelements = jsonObj.getAsJsonArray("elements");
        if (jsonArrayelements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("elements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `elements` to be an array in the JSON string but got `%s`", jsonObj.get("elements").toString()));
          }

          // validate the optional field `elements` (array)
          for (int i = 0; i < jsonArrayelements.size(); i++) {
            ModelingSubmissionElement.validateJsonObject(jsonArrayelements.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `plagiarismCase`
      if (jsonObj.get("plagiarismCase") != null && !jsonObj.get("plagiarismCase").isJsonNull()) {
        PlagiarismCase.validateJsonObject(jsonObj.getAsJsonObject("plagiarismCase"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlagiarismSubmissionModelingSubmissionElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlagiarismSubmissionModelingSubmissionElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlagiarismSubmissionModelingSubmissionElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlagiarismSubmissionModelingSubmissionElement.class));

       return (TypeAdapter<T>) new TypeAdapter<PlagiarismSubmissionModelingSubmissionElement>() {
           @Override
           public void write(JsonWriter out, PlagiarismSubmissionModelingSubmissionElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlagiarismSubmissionModelingSubmissionElement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlagiarismSubmissionModelingSubmissionElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlagiarismSubmissionModelingSubmissionElement
  * @throws IOException if the JSON string is invalid with respect to PlagiarismSubmissionModelingSubmissionElement
  */
  public static PlagiarismSubmissionModelingSubmissionElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlagiarismSubmissionModelingSubmissionElement.class);
  }

 /**
  * Convert an instance of PlagiarismSubmissionModelingSubmissionElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

