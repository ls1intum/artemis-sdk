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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ApollonDiagram
 */
@JsonPropertyOrder({
  ApollonDiagram.JSON_PROPERTY_ID,
  ApollonDiagram.JSON_PROPERTY_TITLE,
  ApollonDiagram.JSON_PROPERTY_JSON_REPRESENTATION,
  ApollonDiagram.JSON_PROPERTY_DIAGRAM_TYPE,
  ApollonDiagram.JSON_PROPERTY_COURSE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ApollonDiagram {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_JSON_REPRESENTATION = "jsonRepresentation";
  private String jsonRepresentation;

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

  public static final String JSON_PROPERTY_COURSE_ID = "courseId";
  private Long courseId;

  public ApollonDiagram() { 
  }

  public ApollonDiagram id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public ApollonDiagram title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ApollonDiagram jsonRepresentation(String jsonRepresentation) {
    this.jsonRepresentation = jsonRepresentation;
    return this;
  }

   /**
   * Get jsonRepresentation
   * @return jsonRepresentation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JSON_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJsonRepresentation() {
    return jsonRepresentation;
  }


  @JsonProperty(JSON_PROPERTY_JSON_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJsonRepresentation(String jsonRepresentation) {
    this.jsonRepresentation = jsonRepresentation;
  }


  public ApollonDiagram diagramType(DiagramTypeEnum diagramType) {
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


  public ApollonDiagram courseId(Long courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Get courseId
   * @return courseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCourseId() {
    return courseId;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }


  /**
   * Return true if this ApollonDiagram object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApollonDiagram apollonDiagram = (ApollonDiagram) o;
    return Objects.equals(this.id, apollonDiagram.id) &&
        Objects.equals(this.title, apollonDiagram.title) &&
        Objects.equals(this.jsonRepresentation, apollonDiagram.jsonRepresentation) &&
        Objects.equals(this.diagramType, apollonDiagram.diagramType) &&
        Objects.equals(this.courseId, apollonDiagram.courseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, jsonRepresentation, diagramType, courseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApollonDiagram {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    jsonRepresentation: ").append(toIndentedString(jsonRepresentation)).append("\n");
    sb.append("    diagramType: ").append(toIndentedString(diagramType)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
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

