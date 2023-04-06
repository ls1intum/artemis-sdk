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
import de.tum.cit.ase.artemis.sdk.model.PlagiarismComparisonModelingSubmissionElement;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ModelingPlagiarismResultAllOf
 */
@JsonPropertyOrder({
  ModelingPlagiarismResultAllOf.JSON_PROPERTY_COMPARISONS
})
@JsonTypeName("ModelingPlagiarismResult_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ModelingPlagiarismResultAllOf {
  public static final String JSON_PROPERTY_COMPARISONS = "comparisons";
  private Set<PlagiarismComparisonModelingSubmissionElement> comparisons;

  public ModelingPlagiarismResultAllOf() { 
  }

  public ModelingPlagiarismResultAllOf comparisons(Set<PlagiarismComparisonModelingSubmissionElement> comparisons) {
    this.comparisons = comparisons;
    return this;
  }

  public ModelingPlagiarismResultAllOf addComparisonsItem(PlagiarismComparisonModelingSubmissionElement comparisonsItem) {
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

  public Set<PlagiarismComparisonModelingSubmissionElement> getComparisons() {
    return comparisons;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_COMPARISONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparisons(Set<PlagiarismComparisonModelingSubmissionElement> comparisons) {
    this.comparisons = comparisons;
  }


  /**
   * Return true if this ModelingPlagiarismResult_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingPlagiarismResultAllOf modelingPlagiarismResultAllOf = (ModelingPlagiarismResultAllOf) o;
    return Objects.equals(this.comparisons, modelingPlagiarismResultAllOf.comparisons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingPlagiarismResultAllOf {\n");
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

}

