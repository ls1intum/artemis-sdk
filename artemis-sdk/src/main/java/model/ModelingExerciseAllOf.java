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
 * ModelingExerciseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ModelingExerciseAllOf {
  /**
   * Gets or Sets diagramType
   */
  @JsonAdapter(DiagramTypeEnum.Adapter.class)
  public enum DiagramTypeEnum {
    CLASSDIAGRAM("ClassDiagram"),
    
    OBJECTDIAGRAM("ObjectDiagram"),
    
    ACTIVITYDIAGRAM("ActivityDiagram"),
    
    USECASEDIAGRAM("UseCaseDiagram"),
    
    COMMUNICATIONDIAGRAM("CommunicationDiagram"),
    
    COMPONENTDIAGRAM("ComponentDiagram"),
    
    DEPLOYMENTDIAGRAM("DeploymentDiagram"),
    
    PETRINET("PetriNet"),
    
    SYNTAXTREE("SyntaxTree"),
    
    FLOWCHART("Flowchart");

    private String value;

    DiagramTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiagramTypeEnum fromValue(String value) {
      for (DiagramTypeEnum b : DiagramTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DiagramTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiagramTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiagramTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DiagramTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIAGRAM_TYPE = "diagramType";
  @SerializedName(SERIALIZED_NAME_DIAGRAM_TYPE)
  private DiagramTypeEnum diagramType;

  public static final String SERIALIZED_NAME_EXAMPLE_SOLUTION_MODEL = "exampleSolutionModel";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_SOLUTION_MODEL)
  private String exampleSolutionModel;

  public static final String SERIALIZED_NAME_EXAMPLE_SOLUTION_EXPLANATION = "exampleSolutionExplanation";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_SOLUTION_EXPLANATION)
  private String exampleSolutionExplanation;

  public static final String SERIALIZED_NAME_CLUSTER_BUILD_DATE = "clusterBuildDate";
  @SerializedName(SERIALIZED_NAME_CLUSTER_BUILD_DATE)
  private OffsetDateTime clusterBuildDate;

  public ModelingExerciseAllOf() {
  }

  public ModelingExerciseAllOf diagramType(DiagramTypeEnum diagramType) {
    
    this.diagramType = diagramType;
    return this;
  }

   /**
   * Get diagramType
   * @return diagramType
  **/
  @javax.annotation.Nullable

  public DiagramTypeEnum getDiagramType() {
    return diagramType;
  }


  public void setDiagramType(DiagramTypeEnum diagramType) {
    this.diagramType = diagramType;
  }


  public ModelingExerciseAllOf exampleSolutionModel(String exampleSolutionModel) {
    
    this.exampleSolutionModel = exampleSolutionModel;
    return this;
  }

   /**
   * Get exampleSolutionModel
   * @return exampleSolutionModel
  **/
  @javax.annotation.Nullable

  public String getExampleSolutionModel() {
    return exampleSolutionModel;
  }


  public void setExampleSolutionModel(String exampleSolutionModel) {
    this.exampleSolutionModel = exampleSolutionModel;
  }


  public ModelingExerciseAllOf exampleSolutionExplanation(String exampleSolutionExplanation) {
    
    this.exampleSolutionExplanation = exampleSolutionExplanation;
    return this;
  }

   /**
   * Get exampleSolutionExplanation
   * @return exampleSolutionExplanation
  **/
  @javax.annotation.Nullable

  public String getExampleSolutionExplanation() {
    return exampleSolutionExplanation;
  }


  public void setExampleSolutionExplanation(String exampleSolutionExplanation) {
    this.exampleSolutionExplanation = exampleSolutionExplanation;
  }


  public ModelingExerciseAllOf clusterBuildDate(OffsetDateTime clusterBuildDate) {
    
    this.clusterBuildDate = clusterBuildDate;
    return this;
  }

   /**
   * Get clusterBuildDate
   * @return clusterBuildDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getClusterBuildDate() {
    return clusterBuildDate;
  }


  public void setClusterBuildDate(OffsetDateTime clusterBuildDate) {
    this.clusterBuildDate = clusterBuildDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingExerciseAllOf modelingExerciseAllOf = (ModelingExerciseAllOf) o;
    return Objects.equals(this.diagramType, modelingExerciseAllOf.diagramType) &&
        Objects.equals(this.exampleSolutionModel, modelingExerciseAllOf.exampleSolutionModel) &&
        Objects.equals(this.exampleSolutionExplanation, modelingExerciseAllOf.exampleSolutionExplanation) &&
        Objects.equals(this.clusterBuildDate, modelingExerciseAllOf.clusterBuildDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagramType, exampleSolutionModel, exampleSolutionExplanation, clusterBuildDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingExerciseAllOf {\n");
    sb.append("    diagramType: ").append(toIndentedString(diagramType)).append("\n");
    sb.append("    exampleSolutionModel: ").append(toIndentedString(exampleSolutionModel)).append("\n");
    sb.append("    exampleSolutionExplanation: ").append(toIndentedString(exampleSolutionExplanation)).append("\n");
    sb.append("    clusterBuildDate: ").append(toIndentedString(clusterBuildDate)).append("\n");
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
    openapiFields.add("diagramType");
    openapiFields.add("exampleSolutionModel");
    openapiFields.add("exampleSolutionExplanation");
    openapiFields.add("clusterBuildDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelingExerciseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelingExerciseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelingExerciseAllOf is not found in the empty JSON string", ModelingExerciseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelingExerciseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelingExerciseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("diagramType") != null && !jsonObj.get("diagramType").isJsonNull()) && !jsonObj.get("diagramType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diagramType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diagramType").toString()));
      }
      if ((jsonObj.get("exampleSolutionModel") != null && !jsonObj.get("exampleSolutionModel").isJsonNull()) && !jsonObj.get("exampleSolutionModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exampleSolutionModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exampleSolutionModel").toString()));
      }
      if ((jsonObj.get("exampleSolutionExplanation") != null && !jsonObj.get("exampleSolutionExplanation").isJsonNull()) && !jsonObj.get("exampleSolutionExplanation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exampleSolutionExplanation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exampleSolutionExplanation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelingExerciseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelingExerciseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelingExerciseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelingExerciseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelingExerciseAllOf>() {
           @Override
           public void write(JsonWriter out, ModelingExerciseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelingExerciseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelingExerciseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelingExerciseAllOf
  * @throws IOException if the JSON string is invalid with respect to ModelingExerciseAllOf
  */
  public static ModelingExerciseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelingExerciseAllOf.class);
  }

 /**
  * Convert an instance of ModelingExerciseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

