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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.TestCaseStats;

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
 * ProgrammingExerciseGradingStatisticsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ProgrammingExerciseGradingStatisticsDTO {
  public static final String SERIALIZED_NAME_NUM_PARTICIPATIONS = "numParticipations";
  @SerializedName(SERIALIZED_NAME_NUM_PARTICIPATIONS)
  private Integer numParticipations;

  public static final String SERIALIZED_NAME_TEST_CASE_STATS_MAP = "testCaseStatsMap";
  @SerializedName(SERIALIZED_NAME_TEST_CASE_STATS_MAP)
  private Map<String, TestCaseStats> testCaseStatsMap = new HashMap<>();

  public static final String SERIALIZED_NAME_CATEGORY_ISSUES_MAP = "categoryIssuesMap";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ISSUES_MAP)
  private Map<String, Map<String, Integer>> categoryIssuesMap = new HashMap<>();

  public ProgrammingExerciseGradingStatisticsDTO() {
  }

  public ProgrammingExerciseGradingStatisticsDTO numParticipations(Integer numParticipations) {
    
    this.numParticipations = numParticipations;
    return this;
  }

   /**
   * Get numParticipations
   * @return numParticipations
  **/
  @javax.annotation.Nullable

  public Integer getNumParticipations() {
    return numParticipations;
  }


  public void setNumParticipations(Integer numParticipations) {
    this.numParticipations = numParticipations;
  }


  public ProgrammingExerciseGradingStatisticsDTO testCaseStatsMap(Map<String, TestCaseStats> testCaseStatsMap) {
    
    this.testCaseStatsMap = testCaseStatsMap;
    return this;
  }

  public ProgrammingExerciseGradingStatisticsDTO putTestCaseStatsMapItem(String key, TestCaseStats testCaseStatsMapItem) {
    if (this.testCaseStatsMap == null) {
      this.testCaseStatsMap = new HashMap<>();
    }
    this.testCaseStatsMap.put(key, testCaseStatsMapItem);
    return this;
  }

   /**
   * Get testCaseStatsMap
   * @return testCaseStatsMap
  **/
  @javax.annotation.Nullable

  public Map<String, TestCaseStats> getTestCaseStatsMap() {
    return testCaseStatsMap;
  }


  public void setTestCaseStatsMap(Map<String, TestCaseStats> testCaseStatsMap) {
    this.testCaseStatsMap = testCaseStatsMap;
  }


  public ProgrammingExerciseGradingStatisticsDTO categoryIssuesMap(Map<String, Map<String, Integer>> categoryIssuesMap) {
    
    this.categoryIssuesMap = categoryIssuesMap;
    return this;
  }

  public ProgrammingExerciseGradingStatisticsDTO putCategoryIssuesMapItem(String key, Map<String, Integer> categoryIssuesMapItem) {
    if (this.categoryIssuesMap == null) {
      this.categoryIssuesMap = new HashMap<>();
    }
    this.categoryIssuesMap.put(key, categoryIssuesMapItem);
    return this;
  }

   /**
   * Get categoryIssuesMap
   * @return categoryIssuesMap
  **/
  @javax.annotation.Nullable

  public Map<String, Map<String, Integer>> getCategoryIssuesMap() {
    return categoryIssuesMap;
  }


  public void setCategoryIssuesMap(Map<String, Map<String, Integer>> categoryIssuesMap) {
    this.categoryIssuesMap = categoryIssuesMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseGradingStatisticsDTO programmingExerciseGradingStatisticsDTO = (ProgrammingExerciseGradingStatisticsDTO) o;
    return Objects.equals(this.numParticipations, programmingExerciseGradingStatisticsDTO.numParticipations) &&
        Objects.equals(this.testCaseStatsMap, programmingExerciseGradingStatisticsDTO.testCaseStatsMap) &&
        Objects.equals(this.categoryIssuesMap, programmingExerciseGradingStatisticsDTO.categoryIssuesMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numParticipations, testCaseStatsMap, categoryIssuesMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseGradingStatisticsDTO {\n");
    sb.append("    numParticipations: ").append(toIndentedString(numParticipations)).append("\n");
    sb.append("    testCaseStatsMap: ").append(toIndentedString(testCaseStatsMap)).append("\n");
    sb.append("    categoryIssuesMap: ").append(toIndentedString(categoryIssuesMap)).append("\n");
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
    openapiFields.add("numParticipations");
    openapiFields.add("testCaseStatsMap");
    openapiFields.add("categoryIssuesMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProgrammingExerciseGradingStatisticsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProgrammingExerciseGradingStatisticsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProgrammingExerciseGradingStatisticsDTO is not found in the empty JSON string", ProgrammingExerciseGradingStatisticsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProgrammingExerciseGradingStatisticsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProgrammingExerciseGradingStatisticsDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProgrammingExerciseGradingStatisticsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProgrammingExerciseGradingStatisticsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProgrammingExerciseGradingStatisticsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProgrammingExerciseGradingStatisticsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ProgrammingExerciseGradingStatisticsDTO>() {
           @Override
           public void write(JsonWriter out, ProgrammingExerciseGradingStatisticsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProgrammingExerciseGradingStatisticsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProgrammingExerciseGradingStatisticsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProgrammingExerciseGradingStatisticsDTO
  * @throws IOException if the JSON string is invalid with respect to ProgrammingExerciseGradingStatisticsDTO
  */
  public static ProgrammingExerciseGradingStatisticsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProgrammingExerciseGradingStatisticsDTO.class);
  }

 /**
  * Convert an instance of ProgrammingExerciseGradingStatisticsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

