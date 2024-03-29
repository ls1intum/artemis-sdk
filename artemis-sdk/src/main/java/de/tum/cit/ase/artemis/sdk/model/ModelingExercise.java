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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.Attachment;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.DueDateStat;
import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;
import de.tum.cit.ase.artemis.sdk.model.GradingCriterion;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismCase;
import de.tum.cit.ase.artemis.sdk.model.Post;
import de.tum.cit.ase.artemis.sdk.model.StudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.TeamAssignmentConfig;
import de.tum.cit.ase.artemis.sdk.model.TutorParticipation;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ModelingExercise
 */
@JsonPropertyOrder({
  ModelingExercise.JSON_PROPERTY_TYPE,
  ModelingExercise.JSON_PROPERTY_DIAGRAM_TYPE,
  ModelingExercise.JSON_PROPERTY_EXAMPLE_SOLUTION_MODEL,
  ModelingExercise.JSON_PROPERTY_EXAMPLE_SOLUTION_EXPLANATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ModelingExercise extends Exercise {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

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

  public ModelingExercise() { 
  }

  public ModelingExercise type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ModelingExercise diagramType(DiagramTypeEnum diagramType) {
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


  public ModelingExercise exampleSolutionModel(String exampleSolutionModel) {
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


  public ModelingExercise exampleSolutionExplanation(String exampleSolutionExplanation) {
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


  /**
   * Return true if this ModelingExercise object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingExercise modelingExercise = (ModelingExercise) o;
    return Objects.equals(this.type, modelingExercise.type) &&
        Objects.equals(this.diagramType, modelingExercise.diagramType) &&
        Objects.equals(this.exampleSolutionModel, modelingExercise.exampleSolutionModel) &&
        Objects.equals(this.exampleSolutionExplanation, modelingExercise.exampleSolutionExplanation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, diagramType, exampleSolutionModel, exampleSolutionExplanation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingExercise {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    diagramType: ").append(toIndentedString(diagramType)).append("\n");
    sb.append("    exampleSolutionModel: ").append(toIndentedString(exampleSolutionModel)).append("\n");
    sb.append("    exampleSolutionExplanation: ").append(toIndentedString(exampleSolutionExplanation)).append("\n");
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

  static {
    // Initialize and register the discriminator mappings.
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("ModelingExercise", ModelingExercise.class);
    JSON.registerDiscriminator(ModelingExercise.class, "type", mappings);
  }
}

