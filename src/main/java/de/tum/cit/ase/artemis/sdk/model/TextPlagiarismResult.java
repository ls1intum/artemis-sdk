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
import de.tum.cit.ase.artemis.sdk.model.PlagiarismComparisonObject;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismResultModelingSubmissionElement;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismResultObject;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TextPlagiarismResult
 */
@JsonPropertyOrder({
  TextPlagiarismResult.JSON_PROPERTY_COMPARISONS,
  TextPlagiarismResult.JSON_PROPERTY_ID,
  TextPlagiarismResult.JSON_PROPERTY_DURATION,
  TextPlagiarismResult.JSON_PROPERTY_EXERCISE,
  TextPlagiarismResult.JSON_PROPERTY_SIMILARITY_DISTRIBUTION,
  TextPlagiarismResult.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TextPlagiarismResult extends PlagiarismResultModelingSubmissionElement {
  public static final String JSON_PROPERTY_COMPARISONS = "comparisons";
  private Set<PlagiarismComparisonObject> comparisons = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private Exercise exercise;

  public static final String JSON_PROPERTY_SIMILARITY_DISTRIBUTION = "similarityDistribution";
  private List<Integer> similarityDistribution = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TextPlagiarismResult() { 
  }

  public TextPlagiarismResult comparisons(Set<PlagiarismComparisonObject> comparisons) {
    this.comparisons = comparisons;
    return this;
  }

  public TextPlagiarismResult addComparisonsItem(PlagiarismComparisonObject comparisonsItem) {
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


  public TextPlagiarismResult id(Long id) {
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


  public TextPlagiarismResult duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public TextPlagiarismResult exercise(Exercise exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Exercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public TextPlagiarismResult similarityDistribution(List<Integer> similarityDistribution) {
    this.similarityDistribution = similarityDistribution;
    return this;
  }

  public TextPlagiarismResult addSimilarityDistributionItem(Integer similarityDistributionItem) {
    if (this.similarityDistribution == null) {
      this.similarityDistribution = new ArrayList<>();
    }
    this.similarityDistribution.add(similarityDistributionItem);
    return this;
  }

   /**
   * Get similarityDistribution
   * @return similarityDistribution
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMILARITY_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getSimilarityDistribution() {
    return similarityDistribution;
  }


  @JsonProperty(JSON_PROPERTY_SIMILARITY_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimilarityDistribution(List<Integer> similarityDistribution) {
    this.similarityDistribution = similarityDistribution;
  }


  public TextPlagiarismResult type(String type) {
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


  /**
   * Return true if this TextPlagiarismResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextPlagiarismResult textPlagiarismResult = (TextPlagiarismResult) o;
    return Objects.equals(this.comparisons, textPlagiarismResult.comparisons) &&
        Objects.equals(this.id, textPlagiarismResult.id) &&
        Objects.equals(this.duration, textPlagiarismResult.duration) &&
        Objects.equals(this.exercise, textPlagiarismResult.exercise) &&
        Objects.equals(this.similarityDistribution, textPlagiarismResult.similarityDistribution) &&
        Objects.equals(this.type, textPlagiarismResult.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisons, id, duration, exercise, similarityDistribution, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextPlagiarismResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    comparisons: ").append(toIndentedString(comparisons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    similarityDistribution: ").append(toIndentedString(similarityDistribution)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  mappings.put("TextPlagiarismResult", TextPlagiarismResult.class);
  JSON.registerDiscriminator(TextPlagiarismResult.class, "type", mappings);
}
}

