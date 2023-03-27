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
import de.tum.cit.ase.artemis.sdk.model.LockRepositoryPolicy;
import de.tum.cit.ase.artemis.sdk.model.SubmissionPenaltyPolicy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SubmissionPolicy
 */
@JsonPropertyOrder({
  SubmissionPolicy.JSON_PROPERTY_ID,
  SubmissionPolicy.JSON_PROPERTY_SUBMISSION_LIMIT,
  SubmissionPolicy.JSON_PROPERTY_ACTIVE,
  SubmissionPolicy.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = LockRepositoryPolicy.class, name = "LockRepositoryPolicy"),
  @JsonSubTypes.Type(value = SubmissionPenaltyPolicy.class, name = "SubmissionPenaltyPolicy"),
})

public class SubmissionPolicy {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SUBMISSION_LIMIT = "submissionLimit";
  private Integer submissionLimit;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SubmissionPolicy() { 
  }

  public SubmissionPolicy id(Long id) {
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


  public SubmissionPolicy submissionLimit(Integer submissionLimit) {
    this.submissionLimit = submissionLimit;
    return this;
  }

   /**
   * Get submissionLimit
   * @return submissionLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubmissionLimit() {
    return submissionLimit;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionLimit(Integer submissionLimit) {
    this.submissionLimit = submissionLimit;
  }


  public SubmissionPolicy active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public SubmissionPolicy type(String type) {
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
   * Return true if this SubmissionPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionPolicy submissionPolicy = (SubmissionPolicy) o;
    return Objects.equals(this.id, submissionPolicy.id) &&
        Objects.equals(this.submissionLimit, submissionPolicy.submissionLimit) &&
        Objects.equals(this.active, submissionPolicy.active) &&
        Objects.equals(this.type, submissionPolicy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submissionLimit, active, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionPolicy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submissionLimit: ").append(toIndentedString(submissionLimit)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
  mappings.put("LockRepositoryPolicy", LockRepositoryPolicy.class);
  mappings.put("SubmissionPenaltyPolicy", SubmissionPenaltyPolicy.class);
  mappings.put("SubmissionPolicy", SubmissionPolicy.class);
  JSON.registerDiscriminator(SubmissionPolicy.class, "type", mappings);
}
}

