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
import de.tum.cit.ase.artemis.sdk.model.DragItem;
import de.tum.cit.ase.artemis.sdk.model.DropLocation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * DragAndDropMapping
 */
@JsonPropertyOrder({
  DragAndDropMapping.JSON_PROPERTY_ID,
  DragAndDropMapping.JSON_PROPERTY_DRAG_ITEM_INDEX,
  DragAndDropMapping.JSON_PROPERTY_DROP_LOCATION_INDEX,
  DragAndDropMapping.JSON_PROPERTY_INVALID,
  DragAndDropMapping.JSON_PROPERTY_DRAG_ITEM,
  DragAndDropMapping.JSON_PROPERTY_DROP_LOCATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class DragAndDropMapping {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_DRAG_ITEM_INDEX = "dragItemIndex";
  private Integer dragItemIndex;

  public static final String JSON_PROPERTY_DROP_LOCATION_INDEX = "dropLocationIndex";
  private Integer dropLocationIndex;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Boolean invalid;

  public static final String JSON_PROPERTY_DRAG_ITEM = "dragItem";
  private DragItem dragItem;

  public static final String JSON_PROPERTY_DROP_LOCATION = "dropLocation";
  private DropLocation dropLocation;

  public DragAndDropMapping() { 
  }

  public DragAndDropMapping id(Long id) {
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


  public DragAndDropMapping dragItemIndex(Integer dragItemIndex) {
    this.dragItemIndex = dragItemIndex;
    return this;
  }

   /**
   * Get dragItemIndex
   * @return dragItemIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAG_ITEM_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDragItemIndex() {
    return dragItemIndex;
  }


  @JsonProperty(JSON_PROPERTY_DRAG_ITEM_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDragItemIndex(Integer dragItemIndex) {
    this.dragItemIndex = dragItemIndex;
  }


  public DragAndDropMapping dropLocationIndex(Integer dropLocationIndex) {
    this.dropLocationIndex = dropLocationIndex;
    return this;
  }

   /**
   * Get dropLocationIndex
   * @return dropLocationIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DROP_LOCATION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDropLocationIndex() {
    return dropLocationIndex;
  }


  @JsonProperty(JSON_PROPERTY_DROP_LOCATION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropLocationIndex(Integer dropLocationIndex) {
    this.dropLocationIndex = dropLocationIndex;
  }


  public DragAndDropMapping invalid(Boolean invalid) {
    this.invalid = invalid;
    return this;
  }

   /**
   * Get invalid
   * @return invalid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInvalid() {
    return invalid;
  }


  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalid(Boolean invalid) {
    this.invalid = invalid;
  }


  public DragAndDropMapping dragItem(DragItem dragItem) {
    this.dragItem = dragItem;
    return this;
  }

   /**
   * Get dragItem
   * @return dragItem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAG_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DragItem getDragItem() {
    return dragItem;
  }


  @JsonProperty(JSON_PROPERTY_DRAG_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDragItem(DragItem dragItem) {
    this.dragItem = dragItem;
  }


  public DragAndDropMapping dropLocation(DropLocation dropLocation) {
    this.dropLocation = dropLocation;
    return this;
  }

   /**
   * Get dropLocation
   * @return dropLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DROP_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DropLocation getDropLocation() {
    return dropLocation;
  }


  @JsonProperty(JSON_PROPERTY_DROP_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropLocation(DropLocation dropLocation) {
    this.dropLocation = dropLocation;
  }


  /**
   * Return true if this DragAndDropMapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DragAndDropMapping dragAndDropMapping = (DragAndDropMapping) o;
    return Objects.equals(this.id, dragAndDropMapping.id) &&
        Objects.equals(this.dragItemIndex, dragAndDropMapping.dragItemIndex) &&
        Objects.equals(this.dropLocationIndex, dragAndDropMapping.dropLocationIndex) &&
        Objects.equals(this.invalid, dragAndDropMapping.invalid) &&
        Objects.equals(this.dragItem, dragAndDropMapping.dragItem) &&
        Objects.equals(this.dropLocation, dragAndDropMapping.dropLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dragItemIndex, dropLocationIndex, invalid, dragItem, dropLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DragAndDropMapping {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dragItemIndex: ").append(toIndentedString(dragItemIndex)).append("\n");
    sb.append("    dropLocationIndex: ").append(toIndentedString(dropLocationIndex)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    dragItem: ").append(toIndentedString(dragItem)).append("\n");
    sb.append("    dropLocation: ").append(toIndentedString(dropLocation)).append("\n");
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

