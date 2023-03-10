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
 * CourseStatisticsAverageScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class CourseStatisticsAverageScore {
  public static final String SERIALIZED_NAME_EXERCISE_ID = "exerciseId";
  @SerializedName(SERIALIZED_NAME_EXERCISE_ID)
  private Long exerciseId;

  public static final String SERIALIZED_NAME_EXERCISE_NAME = "exerciseName";
  @SerializedName(SERIALIZED_NAME_EXERCISE_NAME)
  private String exerciseName;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private OffsetDateTime releaseDate;

  public static final String SERIALIZED_NAME_AVERAGE_SCORE = "averageScore";
  @SerializedName(SERIALIZED_NAME_AVERAGE_SCORE)
  private Double averageScore;

  /**
   * Gets or Sets exerciseType
   */
  @JsonAdapter(ExerciseTypeEnum.Adapter.class)
  public enum ExerciseTypeEnum {
    TEXT("TEXT"),
    
    PROGRAMMING("PROGRAMMING"),
    
    MODELING("MODELING"),
    
    FILE_UPLOAD("FILE_UPLOAD"),
    
    QUIZ("QUIZ");

    private String value;

    ExerciseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExerciseTypeEnum fromValue(String value) {
      for (ExerciseTypeEnum b : ExerciseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExerciseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExerciseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExerciseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExerciseTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXERCISE_TYPE = "exerciseType";
  @SerializedName(SERIALIZED_NAME_EXERCISE_TYPE)
  private ExerciseTypeEnum exerciseType;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private Set<String> categories = new LinkedHashSet<>();

  public CourseStatisticsAverageScore() {
  }

  public CourseStatisticsAverageScore exerciseId(Long exerciseId) {
    
    this.exerciseId = exerciseId;
    return this;
  }

   /**
   * Get exerciseId
   * @return exerciseId
  **/
  @javax.annotation.Nullable

  public Long getExerciseId() {
    return exerciseId;
  }


  public void setExerciseId(Long exerciseId) {
    this.exerciseId = exerciseId;
  }


  public CourseStatisticsAverageScore exerciseName(String exerciseName) {
    
    this.exerciseName = exerciseName;
    return this;
  }

   /**
   * Get exerciseName
   * @return exerciseName
  **/
  @javax.annotation.Nullable

  public String getExerciseName() {
    return exerciseName;
  }


  public void setExerciseName(String exerciseName) {
    this.exerciseName = exerciseName;
  }


  public CourseStatisticsAverageScore releaseDate(OffsetDateTime releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public CourseStatisticsAverageScore averageScore(Double averageScore) {
    
    this.averageScore = averageScore;
    return this;
  }

   /**
   * Get averageScore
   * @return averageScore
  **/
  @javax.annotation.Nullable

  public Double getAverageScore() {
    return averageScore;
  }


  public void setAverageScore(Double averageScore) {
    this.averageScore = averageScore;
  }


  public CourseStatisticsAverageScore exerciseType(ExerciseTypeEnum exerciseType) {
    
    this.exerciseType = exerciseType;
    return this;
  }

   /**
   * Get exerciseType
   * @return exerciseType
  **/
  @javax.annotation.Nullable

  public ExerciseTypeEnum getExerciseType() {
    return exerciseType;
  }


  public void setExerciseType(ExerciseTypeEnum exerciseType) {
    this.exerciseType = exerciseType;
  }


  public CourseStatisticsAverageScore categories(Set<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public CourseStatisticsAverageScore addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new LinkedHashSet<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable

  public Set<String> getCategories() {
    return categories;
  }


  public void setCategories(Set<String> categories) {
    this.categories = categories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseStatisticsAverageScore courseStatisticsAverageScore = (CourseStatisticsAverageScore) o;
    return Objects.equals(this.exerciseId, courseStatisticsAverageScore.exerciseId) &&
        Objects.equals(this.exerciseName, courseStatisticsAverageScore.exerciseName) &&
        Objects.equals(this.releaseDate, courseStatisticsAverageScore.releaseDate) &&
        Objects.equals(this.averageScore, courseStatisticsAverageScore.averageScore) &&
        Objects.equals(this.exerciseType, courseStatisticsAverageScore.exerciseType) &&
        Objects.equals(this.categories, courseStatisticsAverageScore.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseId, exerciseName, releaseDate, averageScore, exerciseType, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseStatisticsAverageScore {\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    exerciseName: ").append(toIndentedString(exerciseName)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("exerciseId");
    openapiFields.add("exerciseName");
    openapiFields.add("releaseDate");
    openapiFields.add("averageScore");
    openapiFields.add("exerciseType");
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CourseStatisticsAverageScore
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CourseStatisticsAverageScore.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CourseStatisticsAverageScore is not found in the empty JSON string", CourseStatisticsAverageScore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CourseStatisticsAverageScore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CourseStatisticsAverageScore` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("exerciseName") != null && !jsonObj.get("exerciseName").isJsonNull()) && !jsonObj.get("exerciseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exerciseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exerciseName").toString()));
      }
      if ((jsonObj.get("exerciseType") != null && !jsonObj.get("exerciseType").isJsonNull()) && !jsonObj.get("exerciseType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exerciseType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exerciseType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CourseStatisticsAverageScore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CourseStatisticsAverageScore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CourseStatisticsAverageScore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CourseStatisticsAverageScore.class));

       return (TypeAdapter<T>) new TypeAdapter<CourseStatisticsAverageScore>() {
           @Override
           public void write(JsonWriter out, CourseStatisticsAverageScore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CourseStatisticsAverageScore read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CourseStatisticsAverageScore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CourseStatisticsAverageScore
  * @throws IOException if the JSON string is invalid with respect to CourseStatisticsAverageScore
  */
  public static CourseStatisticsAverageScore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CourseStatisticsAverageScore.class);
  }

 /**
  * Convert an instance of CourseStatisticsAverageScore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

