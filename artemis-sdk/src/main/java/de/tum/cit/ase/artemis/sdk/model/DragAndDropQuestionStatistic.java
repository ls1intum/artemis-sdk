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
import de.tum.cit.ase.artemis.sdk.model.DropLocationCounter;
import de.tum.cit.ase.artemis.sdk.model.QuizQuestionStatistic;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * DragAndDropQuestionStatistic
 */
@JsonPropertyOrder({
  DragAndDropQuestionStatistic.JSON_PROPERTY_DROP_LOCATION_COUNTERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
@JsonTypeName("drag-and-drop")

public class DragAndDropQuestionStatistic extends QuizQuestionStatistic {
  public static final String JSON_PROPERTY_DROP_LOCATION_COUNTERS = "dropLocationCounters";
  private Set<DropLocationCounter> dropLocationCounters;

  public DragAndDropQuestionStatistic() { 
  }

  public DragAndDropQuestionStatistic dropLocationCounters(Set<DropLocationCounter> dropLocationCounters) {
    this.dropLocationCounters = dropLocationCounters;
    return this;
  }

  public DragAndDropQuestionStatistic addDropLocationCountersItem(DropLocationCounter dropLocationCountersItem) {
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
   * Return true if this DragAndDropQuestionStatistic object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DragAndDropQuestionStatistic dragAndDropQuestionStatistic = (DragAndDropQuestionStatistic) o;
    return Objects.equals(this.dropLocationCounters, dragAndDropQuestionStatistic.dropLocationCounters) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dropLocationCounters, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DragAndDropQuestionStatistic {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  static {
    // Initialize and register the discriminator mappings.
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("DragAndDropQuestionStatistic", DragAndDropQuestionStatistic.class);
    JSON.registerDiscriminator(DragAndDropQuestionStatistic.class, "type", mappings);
  }
}

