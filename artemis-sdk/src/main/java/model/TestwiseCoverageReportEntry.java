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
import org.openapitools.client.model.CoverageFileReport;
import org.openapitools.client.model.ProgrammingExerciseTestCase;

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
 * TestwiseCoverageReportEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TestwiseCoverageReportEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_FILE_REPORT = "fileReport";
  @SerializedName(SERIALIZED_NAME_FILE_REPORT)
  private CoverageFileReport fileReport;

  public static final String SERIALIZED_NAME_TEST_CASE = "testCase";
  @SerializedName(SERIALIZED_NAME_TEST_CASE)
  private ProgrammingExerciseTestCase testCase;

  public static final String SERIALIZED_NAME_START_LINE = "startLine";
  @SerializedName(SERIALIZED_NAME_START_LINE)
  private Integer startLine;

  public static final String SERIALIZED_NAME_LINE_COUNT = "lineCount";
  @SerializedName(SERIALIZED_NAME_LINE_COUNT)
  private Integer lineCount;

  public TestwiseCoverageReportEntry() {
  }

  public TestwiseCoverageReportEntry id(Long id) {
    
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


  public TestwiseCoverageReportEntry fileReport(CoverageFileReport fileReport) {
    
    this.fileReport = fileReport;
    return this;
  }

   /**
   * Get fileReport
   * @return fileReport
  **/
  @javax.annotation.Nullable

  public CoverageFileReport getFileReport() {
    return fileReport;
  }


  public void setFileReport(CoverageFileReport fileReport) {
    this.fileReport = fileReport;
  }


  public TestwiseCoverageReportEntry testCase(ProgrammingExerciseTestCase testCase) {
    
    this.testCase = testCase;
    return this;
  }

   /**
   * Get testCase
   * @return testCase
  **/
  @javax.annotation.Nullable

  public ProgrammingExerciseTestCase getTestCase() {
    return testCase;
  }


  public void setTestCase(ProgrammingExerciseTestCase testCase) {
    this.testCase = testCase;
  }


  public TestwiseCoverageReportEntry startLine(Integer startLine) {
    
    this.startLine = startLine;
    return this;
  }

   /**
   * Get startLine
   * @return startLine
  **/
  @javax.annotation.Nullable

  public Integer getStartLine() {
    return startLine;
  }


  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }


  public TestwiseCoverageReportEntry lineCount(Integer lineCount) {
    
    this.lineCount = lineCount;
    return this;
  }

   /**
   * Get lineCount
   * @return lineCount
  **/
  @javax.annotation.Nullable

  public Integer getLineCount() {
    return lineCount;
  }


  public void setLineCount(Integer lineCount) {
    this.lineCount = lineCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestwiseCoverageReportEntry testwiseCoverageReportEntry = (TestwiseCoverageReportEntry) o;
    return Objects.equals(this.id, testwiseCoverageReportEntry.id) &&
        Objects.equals(this.fileReport, testwiseCoverageReportEntry.fileReport) &&
        Objects.equals(this.testCase, testwiseCoverageReportEntry.testCase) &&
        Objects.equals(this.startLine, testwiseCoverageReportEntry.startLine) &&
        Objects.equals(this.lineCount, testwiseCoverageReportEntry.lineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileReport, testCase, startLine, lineCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestwiseCoverageReportEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileReport: ").append(toIndentedString(fileReport)).append("\n");
    sb.append("    testCase: ").append(toIndentedString(testCase)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
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
    openapiFields.add("fileReport");
    openapiFields.add("testCase");
    openapiFields.add("startLine");
    openapiFields.add("lineCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestwiseCoverageReportEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestwiseCoverageReportEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestwiseCoverageReportEntry is not found in the empty JSON string", TestwiseCoverageReportEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestwiseCoverageReportEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestwiseCoverageReportEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `fileReport`
      if (jsonObj.get("fileReport") != null && !jsonObj.get("fileReport").isJsonNull()) {
        CoverageFileReport.validateJsonObject(jsonObj.getAsJsonObject("fileReport"));
      }
      // validate the optional field `testCase`
      if (jsonObj.get("testCase") != null && !jsonObj.get("testCase").isJsonNull()) {
        ProgrammingExerciseTestCase.validateJsonObject(jsonObj.getAsJsonObject("testCase"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestwiseCoverageReportEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestwiseCoverageReportEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestwiseCoverageReportEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestwiseCoverageReportEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<TestwiseCoverageReportEntry>() {
           @Override
           public void write(JsonWriter out, TestwiseCoverageReportEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestwiseCoverageReportEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestwiseCoverageReportEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestwiseCoverageReportEntry
  * @throws IOException if the JSON string is invalid with respect to TestwiseCoverageReportEntry
  */
  public static TestwiseCoverageReportEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestwiseCoverageReportEntry.class);
  }

 /**
  * Convert an instance of TestwiseCoverageReportEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

