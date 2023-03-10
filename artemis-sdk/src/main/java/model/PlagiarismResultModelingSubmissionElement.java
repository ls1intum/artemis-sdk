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
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.TextPlagiarismResult;

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
 * PlagiarismResultModelingSubmissionElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class PlagiarismResultModelingSubmissionElement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_EXERCISE = "exercise";
  @SerializedName(SERIALIZED_NAME_EXERCISE)
  private Exercise exercise;

  public static final String SERIALIZED_NAME_SIMILARITY_DISTRIBUTION = "similarityDistribution";
  @SerializedName(SERIALIZED_NAME_SIMILARITY_DISTRIBUTION)
  private List<Integer> similarityDistribution = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public PlagiarismResultModelingSubmissionElement() {
    this.type = this.getClass().getSimpleName();
  }

  public PlagiarismResultModelingSubmissionElement id(Long id) {
    
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


  public PlagiarismResultModelingSubmissionElement duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public PlagiarismResultModelingSubmissionElement exercise(Exercise exercise) {
    
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @javax.annotation.Nullable

  public Exercise getExercise() {
    return exercise;
  }


  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public PlagiarismResultModelingSubmissionElement similarityDistribution(List<Integer> similarityDistribution) {
    
    this.similarityDistribution = similarityDistribution;
    return this;
  }

  public PlagiarismResultModelingSubmissionElement addSimilarityDistributionItem(Integer similarityDistributionItem) {
    if (this.similarityDistribution == null) {
      this.similarityDistribution = new ArrayList<>();
    }
    this.similarityDistribution.add(similarityDistributionItem);
    return this;
  }

   /**
   * Get similarityDistribution
   * @return similarityDistribution
  **/
  @javax.annotation.Nullable

  public List<Integer> getSimilarityDistribution() {
    return similarityDistribution;
  }


  public void setSimilarityDistribution(List<Integer> similarityDistribution) {
    this.similarityDistribution = similarityDistribution;
  }


  public PlagiarismResultModelingSubmissionElement type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismResultModelingSubmissionElement plagiarismResultModelingSubmissionElement = (PlagiarismResultModelingSubmissionElement) o;
    return Objects.equals(this.id, plagiarismResultModelingSubmissionElement.id) &&
        Objects.equals(this.duration, plagiarismResultModelingSubmissionElement.duration) &&
        Objects.equals(this.exercise, plagiarismResultModelingSubmissionElement.exercise) &&
        Objects.equals(this.similarityDistribution, plagiarismResultModelingSubmissionElement.similarityDistribution) &&
        Objects.equals(this.type, plagiarismResultModelingSubmissionElement.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, duration, exercise, similarityDistribution, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismResultModelingSubmissionElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    similarityDistribution: ").append(toIndentedString(similarityDistribution)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("exercise");
    openapiFields.add("similarityDistribution");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlagiarismResultModelingSubmissionElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlagiarismResultModelingSubmissionElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlagiarismResultModelingSubmissionElement is not found in the empty JSON string", PlagiarismResultModelingSubmissionElement.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "TextPlagiarismResult":
          TextPlagiarismResult.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of PlagiarismResultModelingSubmissionElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlagiarismResultModelingSubmissionElement
  * @throws IOException if the JSON string is invalid with respect to PlagiarismResultModelingSubmissionElement
  */
  public static PlagiarismResultModelingSubmissionElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlagiarismResultModelingSubmissionElement.class);
  }

 /**
  * Convert an instance of PlagiarismResultModelingSubmissionElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

