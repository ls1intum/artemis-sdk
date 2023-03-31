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
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.SimilarElementCount;
import de.tum.cit.ase.artemis.sdk.model.Submission;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ModelingSubmission
 */
@JsonPropertyOrder({
  ModelingSubmission.JSON_PROPERTY_PARTICIPATION,
  ModelingSubmission.JSON_PROPERTY_MODEL,
  ModelingSubmission.JSON_PROPERTY_EXPLANATION_TEXT,
  ModelingSubmission.JSON_PROPERTY_SIMILAR_ELEMENT_COUNTS,
  ModelingSubmission.JSON_PROPERTY_SIMILAR_ELEMENTS,
  ModelingSubmission.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "submissionExerciseType", // ignore manually set submissionExerciseType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the submissionExerciseType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "submissionExerciseType", visible = true)

public class ModelingSubmission extends Submission {
  public static final String JSON_PROPERTY_PARTICIPATION = "participation";
  private Participation participation;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_EXPLANATION_TEXT = "explanationText";
  private String explanationText;

  public static final String JSON_PROPERTY_SIMILAR_ELEMENT_COUNTS = "similarElementCounts";
  private Set<SimilarElementCount> similarElementCounts;

  public static final String JSON_PROPERTY_SIMILAR_ELEMENTS = "similarElements";
  private Set<SimilarElementCount> similarElements;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Result> results;

  public ModelingSubmission() { 
  }

  @JsonCreator
  public ModelingSubmission(
    @JsonProperty(JSON_PROPERTY_RESULTS) List<Result> results, 
    @JsonProperty(JSON_PROPERTY_DURATION_IN_MINUTES) Long durationInMinutes
  ) {
    this();
    this.results = results;
    this.durationInMinutes = durationInMinutes;
  }

  public ModelingSubmission participation(Participation participation) {
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Participation getParticipation() {
    return participation;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipation(Participation participation) {
    this.participation = participation;
  }


  public ModelingSubmission model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModel(String model) {
    this.model = model;
  }


  public ModelingSubmission explanationText(String explanationText) {
    this.explanationText = explanationText;
    return this;
  }

   /**
   * Get explanationText
   * @return explanationText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExplanationText() {
    return explanationText;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanationText(String explanationText) {
    this.explanationText = explanationText;
  }


  public ModelingSubmission similarElementCounts(Set<SimilarElementCount> similarElementCounts) {
    this.similarElementCounts = similarElementCounts;
    return this;
  }

  public ModelingSubmission addSimilarElementCountsItem(SimilarElementCount similarElementCountsItem) {
    if (this.similarElementCounts == null) {
      this.similarElementCounts = new LinkedHashSet<>();
    }
    this.similarElementCounts.add(similarElementCountsItem);
    return this;
  }

   /**
   * Get similarElementCounts
   * @return similarElementCounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMILAR_ELEMENT_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SimilarElementCount> getSimilarElementCounts() {
    return similarElementCounts;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SIMILAR_ELEMENT_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimilarElementCounts(Set<SimilarElementCount> similarElementCounts) {
    this.similarElementCounts = similarElementCounts;
  }


  public ModelingSubmission similarElements(Set<SimilarElementCount> similarElements) {
    this.similarElements = similarElements;
    return this;
  }

  public ModelingSubmission addSimilarElementsItem(SimilarElementCount similarElementsItem) {
    if (this.similarElements == null) {
      this.similarElements = new LinkedHashSet<>();
    }
    this.similarElements.add(similarElementsItem);
    return this;
  }

   /**
   * Get similarElements
   * @return similarElements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMILAR_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SimilarElementCount> getSimilarElements() {
    return similarElements;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SIMILAR_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimilarElements(Set<SimilarElementCount> similarElements) {
    this.similarElements = similarElements;
  }


   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Result> getResults() {
    return results;
  }




  /**
   * Return true if this ModelingSubmission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingSubmission modelingSubmission = (ModelingSubmission) o;
    return Objects.equals(this.participation, modelingSubmission.participation) &&
        Objects.equals(this.model, modelingSubmission.model) &&
        Objects.equals(this.explanationText, modelingSubmission.explanationText) &&
        Objects.equals(this.similarElementCounts, modelingSubmission.similarElementCounts) &&
        Objects.equals(this.similarElements, modelingSubmission.similarElements) &&
        Objects.equals(this.results, modelingSubmission.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, model, explanationText, similarElementCounts, similarElements, results, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingSubmission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    explanationText: ").append(toIndentedString(explanationText)).append("\n");
    sb.append("    similarElementCounts: ").append(toIndentedString(similarElementCounts)).append("\n");
    sb.append("    similarElements: ").append(toIndentedString(similarElements)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    mappings.put("ModelingSubmission", ModelingSubmission.class);
    JSON.registerDiscriminator(ModelingSubmission.class, "submissionExerciseType", mappings);
  }
}

