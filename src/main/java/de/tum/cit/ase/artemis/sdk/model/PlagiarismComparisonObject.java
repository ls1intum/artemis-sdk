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
import de.tum.cit.ase.artemis.sdk.model.PlagiarismMatch;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismResultObject;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * PlagiarismComparisonObject
 */
@JsonPropertyOrder({
  PlagiarismComparisonObject.JSON_PROPERTY_ID,
  PlagiarismComparisonObject.JSON_PROPERTY_PLAGIARISM_RESULT,
  PlagiarismComparisonObject.JSON_PROPERTY_MATCHES,
  PlagiarismComparisonObject.JSON_PROPERTY_SIMILARITY,
  PlagiarismComparisonObject.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class PlagiarismComparisonObject {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_PLAGIARISM_RESULT = "plagiarismResult";
  private PlagiarismResultObject plagiarismResult;

  public static final String JSON_PROPERTY_MATCHES = "matches";
  private Set<PlagiarismMatch> matches = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_SIMILARITY = "similarity";
  private Double similarity;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CONFIRMED("CONFIRMED"),
    
    DENIED("DENIED"),
    
    NONE("NONE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public PlagiarismComparisonObject() { 
  }

  public PlagiarismComparisonObject id(Long id) {
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


  public PlagiarismComparisonObject plagiarismResult(PlagiarismResultObject plagiarismResult) {
    this.plagiarismResult = plagiarismResult;
    return this;
  }

   /**
   * Get plagiarismResult
   * @return plagiarismResult
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlagiarismResultObject getPlagiarismResult() {
    return plagiarismResult;
  }


  @JsonProperty(JSON_PROPERTY_PLAGIARISM_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismResult(PlagiarismResultObject plagiarismResult) {
    this.plagiarismResult = plagiarismResult;
  }


  public PlagiarismComparisonObject matches(Set<PlagiarismMatch> matches) {
    this.matches = matches;
    return this;
  }

  public PlagiarismComparisonObject addMatchesItem(PlagiarismMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new LinkedHashSet<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PlagiarismMatch> getMatches() {
    return matches;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatches(Set<PlagiarismMatch> matches) {
    this.matches = matches;
  }


  public PlagiarismComparisonObject similarity(Double similarity) {
    this.similarity = similarity;
    return this;
  }

   /**
   * Get similarity
   * @return similarity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMILARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSimilarity() {
    return similarity;
  }


  @JsonProperty(JSON_PROPERTY_SIMILARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimilarity(Double similarity) {
    this.similarity = similarity;
  }


  public PlagiarismComparisonObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this PlagiarismComparisonObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismComparisonObject plagiarismComparisonObject = (PlagiarismComparisonObject) o;
    return Objects.equals(this.id, plagiarismComparisonObject.id) &&
        Objects.equals(this.plagiarismResult, plagiarismComparisonObject.plagiarismResult) &&
        Objects.equals(this.matches, plagiarismComparisonObject.matches) &&
        Objects.equals(this.similarity, plagiarismComparisonObject.similarity) &&
        Objects.equals(this.status, plagiarismComparisonObject.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plagiarismResult, matches, similarity, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismComparisonObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plagiarismResult: ").append(toIndentedString(plagiarismResult)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

