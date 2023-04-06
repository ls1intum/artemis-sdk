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
import de.tum.cit.ase.artemis.sdk.model.ExerciseHint;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseSolutionEntry;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTask;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CodeHint
 */
@JsonPropertyOrder({
  CodeHint.JSON_PROPERTY_SOLUTION_ENTRIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class CodeHint extends ExerciseHint {
  public static final String JSON_PROPERTY_SOLUTION_ENTRIES = "solutionEntries";
  private Set<ProgrammingExerciseSolutionEntry> solutionEntries;

  public CodeHint() { 
  }

  public CodeHint solutionEntries(Set<ProgrammingExerciseSolutionEntry> solutionEntries) {
    this.solutionEntries = solutionEntries;
    return this;
  }

  public CodeHint addSolutionEntriesItem(ProgrammingExerciseSolutionEntry solutionEntriesItem) {
    if (this.solutionEntries == null) {
      this.solutionEntries = new LinkedHashSet<>();
    }
    this.solutionEntries.add(solutionEntriesItem);
    return this;
  }

   /**
   * Get solutionEntries
   * @return solutionEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOLUTION_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ProgrammingExerciseSolutionEntry> getSolutionEntries() {
    return solutionEntries;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SOLUTION_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSolutionEntries(Set<ProgrammingExerciseSolutionEntry> solutionEntries) {
    this.solutionEntries = solutionEntries;
  }


  /**
   * Return true if this CodeHint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeHint codeHint = (CodeHint) o;
    return Objects.equals(this.solutionEntries, codeHint.solutionEntries) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionEntries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeHint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    solutionEntries: ").append(toIndentedString(solutionEntries)).append("\n");
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
    mappings.put("CodeHint", CodeHint.class);
    JSON.registerDiscriminator(CodeHint.class, "type", mappings);
  }
}

