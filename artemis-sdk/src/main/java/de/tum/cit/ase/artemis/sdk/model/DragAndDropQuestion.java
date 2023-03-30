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
import de.tum.cit.ase.artemis.sdk.model.DragAndDropMapping;
import de.tum.cit.ase.artemis.sdk.model.DragAndDropQuestion;
import de.tum.cit.ase.artemis.sdk.model.DragItem;
import de.tum.cit.ase.artemis.sdk.model.DropLocation;
import de.tum.cit.ase.artemis.sdk.model.MultipleChoiceQuestion;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestion;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestionStatistic;
import de.tum.cit.ase.artemis.sdk.model.ShortAnswerQuestion;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * DragAndDropQuestion
 */
@JsonPropertyOrder({
  DragAndDropQuestion.JSON_PROPERTY_BACKGROUND_FILE_PATH,
  DragAndDropQuestion.JSON_PROPERTY_DROP_LOCATIONS,
  DragAndDropQuestion.JSON_PROPERTY_DRAG_ITEMS,
  DragAndDropQuestion.JSON_PROPERTY_CORRECT_MAPPINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonTypeName("drag-and-drop")
public class DragAndDropQuestion extends QuizQuestion {
  public static final String JSON_PROPERTY_BACKGROUND_FILE_PATH = "backgroundFilePath";
  private String backgroundFilePath;

  public static final String JSON_PROPERTY_DROP_LOCATIONS = "dropLocations";
  private List<DropLocation> dropLocations = new ArrayList<>();

  public static final String JSON_PROPERTY_DRAG_ITEMS = "dragItems";
  private List<DragItem> dragItems = new ArrayList<>();

  public static final String JSON_PROPERTY_CORRECT_MAPPINGS = "correctMappings";
  private List<DragAndDropMapping> correctMappings = new ArrayList<>();

  public DragAndDropQuestion() { 
  }

  public DragAndDropQuestion backgroundFilePath(String backgroundFilePath) {
    this.backgroundFilePath = backgroundFilePath;
    return this;
  }

   /**
   * Get backgroundFilePath
   * @return backgroundFilePath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundFilePath() {
    return backgroundFilePath;
  }


  @JsonProperty(JSON_PROPERTY_BACKGROUND_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundFilePath(String backgroundFilePath) {
    this.backgroundFilePath = backgroundFilePath;
  }


  public DragAndDropQuestion dropLocations(List<DropLocation> dropLocations) {
    this.dropLocations = dropLocations;
    return this;
  }

  public DragAndDropQuestion addDropLocationsItem(DropLocation dropLocationsItem) {
    if (this.dropLocations == null) {
      this.dropLocations = new ArrayList<>();
    }
    this.dropLocations.add(dropLocationsItem);
    return this;
  }

   /**
   * Get dropLocations
   * @return dropLocations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DROP_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DropLocation> getDropLocations() {
    return dropLocations;
  }


  @JsonProperty(JSON_PROPERTY_DROP_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropLocations(List<DropLocation> dropLocations) {
    this.dropLocations = dropLocations;
  }


  public DragAndDropQuestion dragItems(List<DragItem> dragItems) {
    this.dragItems = dragItems;
    return this;
  }

  public DragAndDropQuestion addDragItemsItem(DragItem dragItemsItem) {
    if (this.dragItems == null) {
      this.dragItems = new ArrayList<>();
    }
    this.dragItems.add(dragItemsItem);
    return this;
  }

   /**
   * Get dragItems
   * @return dragItems
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAG_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DragItem> getDragItems() {
    return dragItems;
  }


  @JsonProperty(JSON_PROPERTY_DRAG_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDragItems(List<DragItem> dragItems) {
    this.dragItems = dragItems;
  }


  public DragAndDropQuestion correctMappings(List<DragAndDropMapping> correctMappings) {
    this.correctMappings = correctMappings;
    return this;
  }

  public DragAndDropQuestion addCorrectMappingsItem(DragAndDropMapping correctMappingsItem) {
    if (this.correctMappings == null) {
      this.correctMappings = new ArrayList<>();
    }
    this.correctMappings.add(correctMappingsItem);
    return this;
  }

   /**
   * Get correctMappings
   * @return correctMappings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRECT_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DragAndDropMapping> getCorrectMappings() {
    return correctMappings;
  }


  @JsonProperty(JSON_PROPERTY_CORRECT_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorrectMappings(List<DragAndDropMapping> correctMappings) {
    this.correctMappings = correctMappings;
  }


  /**
   * Return true if this DragAndDropQuestion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DragAndDropQuestion dragAndDropQuestion = (DragAndDropQuestion) o;
    return Objects.equals(this.backgroundFilePath, dragAndDropQuestion.backgroundFilePath) &&
        Objects.equals(this.dropLocations, dragAndDropQuestion.dropLocations) &&
        Objects.equals(this.dragItems, dragAndDropQuestion.dragItems) &&
        Objects.equals(this.correctMappings, dragAndDropQuestion.correctMappings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundFilePath, dropLocations, dragItems, correctMappings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DragAndDropQuestion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backgroundFilePath: ").append(toIndentedString(backgroundFilePath)).append("\n");
    sb.append("    dropLocations: ").append(toIndentedString(dropLocations)).append("\n");
    sb.append("    dragItems: ").append(toIndentedString(dragItems)).append("\n");
    sb.append("    correctMappings: ").append(toIndentedString(correctMappings)).append("\n");
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
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("drag-and-drop", DragAndDropQuestion.class);
  mappings.put("multiple-choice", MultipleChoiceQuestion.class);
  mappings.put("short-answer", ShortAnswerQuestion.class);
  mappings.put("DragAndDropQuestion", DragAndDropQuestion.class);
  JSON.registerDiscriminator(DragAndDropQuestion.class, "type", mappings);
}
}

