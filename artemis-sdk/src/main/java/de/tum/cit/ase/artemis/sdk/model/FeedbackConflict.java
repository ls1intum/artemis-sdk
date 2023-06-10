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
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * FeedbackConflict
 */
@JsonPropertyOrder({
  FeedbackConflict.JSON_PROPERTY_ID,
  FeedbackConflict.JSON_PROPERTY_CONFLICT,
  FeedbackConflict.JSON_PROPERTY_CREATED_AT,
  FeedbackConflict.JSON_PROPERTY_SOLVED_AT,
  FeedbackConflict.JSON_PROPERTY_TYPE,
  FeedbackConflict.JSON_PROPERTY_FIRST_FEEDBACK,
  FeedbackConflict.JSON_PROPERTY_SECOND_FEEDBACK,
  FeedbackConflict.JSON_PROPERTY_DISCARD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class FeedbackConflict {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CONFLICT = "conflict";
  private Boolean conflict;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_SOLVED_AT = "solvedAt";
  private OffsetDateTime solvedAt;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COMMENT("INCONSISTENT_COMMENT"),
    
    SCORE("INCONSISTENT_SCORE"),
    
    FEEDBACK("INCONSISTENT_FEEDBACK");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_FIRST_FEEDBACK = "firstFeedback";
  private Feedback firstFeedback;

  public static final String JSON_PROPERTY_SECOND_FEEDBACK = "secondFeedback";
  private Feedback secondFeedback;

  public static final String JSON_PROPERTY_DISCARD = "discard";
  private Boolean discard;

  public FeedbackConflict() { 
  }

  public FeedbackConflict id(Long id) {
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


  public FeedbackConflict conflict(Boolean conflict) {
    this.conflict = conflict;
    return this;
  }

   /**
   * Get conflict
   * @return conflict
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFLICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConflict() {
    return conflict;
  }


  @JsonProperty(JSON_PROPERTY_CONFLICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConflict(Boolean conflict) {
    this.conflict = conflict;
  }


  public FeedbackConflict createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public FeedbackConflict solvedAt(OffsetDateTime solvedAt) {
    this.solvedAt = solvedAt;
    return this;
  }

   /**
   * Get solvedAt
   * @return solvedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOLVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSolvedAt() {
    return solvedAt;
  }


  @JsonProperty(JSON_PROPERTY_SOLVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSolvedAt(OffsetDateTime solvedAt) {
    this.solvedAt = solvedAt;
  }


  public FeedbackConflict type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public FeedbackConflict firstFeedback(Feedback firstFeedback) {
    this.firstFeedback = firstFeedback;
    return this;
  }

   /**
   * Get firstFeedback
   * @return firstFeedback
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Feedback getFirstFeedback() {
    return firstFeedback;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstFeedback(Feedback firstFeedback) {
    this.firstFeedback = firstFeedback;
  }


  public FeedbackConflict secondFeedback(Feedback secondFeedback) {
    this.secondFeedback = secondFeedback;
    return this;
  }

   /**
   * Get secondFeedback
   * @return secondFeedback
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECOND_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Feedback getSecondFeedback() {
    return secondFeedback;
  }


  @JsonProperty(JSON_PROPERTY_SECOND_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondFeedback(Feedback secondFeedback) {
    this.secondFeedback = secondFeedback;
  }


  public FeedbackConflict discard(Boolean discard) {
    this.discard = discard;
    return this;
  }

   /**
   * Get discard
   * @return discard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDiscard() {
    return discard;
  }


  @JsonProperty(JSON_PROPERTY_DISCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscard(Boolean discard) {
    this.discard = discard;
  }


  /**
   * Return true if this FeedbackConflict object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackConflict feedbackConflict = (FeedbackConflict) o;
    return Objects.equals(this.id, feedbackConflict.id) &&
        Objects.equals(this.conflict, feedbackConflict.conflict) &&
        Objects.equals(this.createdAt, feedbackConflict.createdAt) &&
        Objects.equals(this.solvedAt, feedbackConflict.solvedAt) &&
        Objects.equals(this.type, feedbackConflict.type) &&
        Objects.equals(this.firstFeedback, feedbackConflict.firstFeedback) &&
        Objects.equals(this.secondFeedback, feedbackConflict.secondFeedback) &&
        Objects.equals(this.discard, feedbackConflict.discard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conflict, createdAt, solvedAt, type, firstFeedback, secondFeedback, discard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackConflict {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conflict: ").append(toIndentedString(conflict)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    solvedAt: ").append(toIndentedString(solvedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstFeedback: ").append(toIndentedString(firstFeedback)).append("\n");
    sb.append("    secondFeedback: ").append(toIndentedString(secondFeedback)).append("\n");
    sb.append("    discard: ").append(toIndentedString(discard)).append("\n");
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

