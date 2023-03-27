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


package de.tum.cit.ase.artemis.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ModelingExerciseAllOf
 */
@JsonPropertyOrder({
  ModelingExerciseAllOf.JSON_PROPERTY_DIAGRAM_TYPE,
  ModelingExerciseAllOf.JSON_PROPERTY_EXAMPLE_SOLUTION_MODEL,
  ModelingExerciseAllOf.JSON_PROPERTY_EXAMPLE_SOLUTION_EXPLANATION,
  ModelingExerciseAllOf.JSON_PROPERTY_CLUSTER_BUILD_DATE
})
@JsonTypeName("ModelingExercise_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class ModelingExerciseAllOf {
  /**
   * Gets or Sets diagramType
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiagramTypeEnum fromValue(String value) {
      for (DiagramTypeEnum b : DiagramTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIAGRAM_TYPE = "diagramType";
  private DiagramTypeEnum diagramType;

  public static final String JSON_PROPERTY_EXAMPLE_SOLUTION_MODEL = "exampleSolutionModel";
  private String exampleSolutionModel;

  public static final String JSON_PROPERTY_EXAMPLE_SOLUTION_EXPLANATION = "exampleSolutionExplanation";
  private String exampleSolutionExplanation;

  public static final String JSON_PROPERTY_CLUSTER_BUILD_DATE = "clusterBuildDate";
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAGRAM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiagramTypeEnum getDiagramType() {
    return diagramType;
  }


  @JsonProperty(JSON_PROPERTY_DIAGRAM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExampleSolutionModel() {
    return exampleSolutionModel;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExampleSolutionExplanation() {
    return exampleSolutionExplanation;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_BUILD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getClusterBuildDate() {
    return clusterBuildDate;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_BUILD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterBuildDate(OffsetDateTime clusterBuildDate) {
    this.clusterBuildDate = clusterBuildDate;
  }


  /**
   * Return true if this ModelingExercise_allOf object is equal to o.
   */
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

}

