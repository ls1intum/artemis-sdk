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
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismComparisonModelingSubmissionElement;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismResultObject;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ModelingPlagiarismResult
 */
@JsonPropertyOrder({
  ModelingPlagiarismResult.JSON_PROPERTY_COMPARISONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ModelingPlagiarismResult extends PlagiarismResultObject {
  public static final String JSON_PROPERTY_COMPARISONS = "comparisons";
  private Set<PlagiarismComparisonObject> comparisons = new LinkedHashSet<>();

  public ModelingPlagiarismResult() { 
  }

  public ModelingPlagiarismResult comparisons(Set<PlagiarismComparisonObject> comparisons) {
    this.comparisons = comparisons;
    return this;
  }

  public ModelingPlagiarismResult addComparisonsItem(PlagiarismComparisonObject comparisonsItem) {
    if (this.comparisons == null) {
      this.comparisons = new LinkedHashSet<>();
    }
    this.comparisons.add(comparisonsItem);
    return this;
  }

   /**
   * Get comparisons
   * @return comparisons
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PlagiarismComparisonObject> getComparisons() {
    return comparisons;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_COMPARISONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparisons(Set<PlagiarismComparisonObject> comparisons) {
    this.comparisons = comparisons;
  }


  /**
   * Return true if this ModelingPlagiarismResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingPlagiarismResult modelingPlagiarismResult = (ModelingPlagiarismResult) o;
    return Objects.equals(this.comparisons, modelingPlagiarismResult.comparisons) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisons, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingPlagiarismResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    comparisons: ").append(toIndentedString(comparisons)).append("\n");
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
  mappings.put("ModelingPlagiarismResult", ModelingPlagiarismResult.class);
  JSON.registerDiscriminator(ModelingPlagiarismResult.class, "type", mappings);
}
}
