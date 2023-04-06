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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.DropLocationCounter;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * DragAndDropQuestionStatisticAllOf
 */
@JsonPropertyOrder({
  DragAndDropQuestionStatisticAllOf.JSON_PROPERTY_DROP_LOCATION_COUNTERS
})
@JsonTypeName("DragAndDropQuestionStatistic_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class DragAndDropQuestionStatisticAllOf {
  public static final String JSON_PROPERTY_DROP_LOCATION_COUNTERS = "dropLocationCounters";
  private Set<DropLocationCounter> dropLocationCounters;

  public DragAndDropQuestionStatisticAllOf() { 
  }

  public DragAndDropQuestionStatisticAllOf dropLocationCounters(Set<DropLocationCounter> dropLocationCounters) {
    this.dropLocationCounters = dropLocationCounters;
    return this;
  }

  public DragAndDropQuestionStatisticAllOf addDropLocationCountersItem(DropLocationCounter dropLocationCountersItem) {
    if (this.dropLocationCounters == null) {
      this.dropLocationCounters = new LinkedHashSet<>();
    }
    this.dropLocationCounters.add(dropLocationCountersItem);
    return this;
  }

   /**
   * Get dropLocationCounters
   * @return dropLocationCounters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DROP_LOCATION_COUNTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<DropLocationCounter> getDropLocationCounters() {
    return dropLocationCounters;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_DROP_LOCATION_COUNTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropLocationCounters(Set<DropLocationCounter> dropLocationCounters) {
    this.dropLocationCounters = dropLocationCounters;
  }


  /**
   * Return true if this DragAndDropQuestionStatistic_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DragAndDropQuestionStatisticAllOf dragAndDropQuestionStatisticAllOf = (DragAndDropQuestionStatisticAllOf) o;
    return Objects.equals(this.dropLocationCounters, dragAndDropQuestionStatisticAllOf.dropLocationCounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dropLocationCounters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DragAndDropQuestionStatisticAllOf {\n");
    sb.append("    dropLocationCounters: ").append(toIndentedString(dropLocationCounters)).append("\n");
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

