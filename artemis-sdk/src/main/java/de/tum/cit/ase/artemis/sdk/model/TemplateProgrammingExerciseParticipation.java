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
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.Result;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TemplateProgrammingExerciseParticipation
 */
@JsonPropertyOrder({
  TemplateProgrammingExerciseParticipation.JSON_PROPERTY_REPOSITORY_URL,
  TemplateProgrammingExerciseParticipation.JSON_PROPERTY_BUILD_PLAN_ID,
  TemplateProgrammingExerciseParticipation.JSON_PROPERTY_PROGRAMMING_EXERCISE,
  TemplateProgrammingExerciseParticipation.JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TemplateProgrammingExerciseParticipation extends Participation {
  public static final String JSON_PROPERTY_REPOSITORY_URL = "repositoryUrl";
  private String repositoryUrl;

  public static final String JSON_PROPERTY_BUILD_PLAN_ID = "buildPlanId";
  private String buildPlanId;

  public static final String JSON_PROPERTY_PROGRAMMING_EXERCISE = "programmingExercise";
  private ProgrammingExercise programmingExercise;

  public static final String JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL = "userIndependentRepositoryUrl";
  private String userIndependentRepositoryUrl;

  public TemplateProgrammingExerciseParticipation() { 
  }

  public TemplateProgrammingExerciseParticipation repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepositoryUrl() {
    return repositoryUrl;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public TemplateProgrammingExerciseParticipation buildPlanId(String buildPlanId) {
    this.buildPlanId = buildPlanId;
    return this;
  }

   /**
   * Get buildPlanId
   * @return buildPlanId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildPlanId() {
    return buildPlanId;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildPlanId(String buildPlanId) {
    this.buildPlanId = buildPlanId;
  }


  public TemplateProgrammingExerciseParticipation programmingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
    return this;
  }

   /**
   * Get programmingExercise
   * @return programmingExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProgrammingExercise getProgrammingExercise() {
    return programmingExercise;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgrammingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
  }


  public TemplateProgrammingExerciseParticipation userIndependentRepositoryUrl(String userIndependentRepositoryUrl) {
    this.userIndependentRepositoryUrl = userIndependentRepositoryUrl;
    return this;
  }

   /**
   * Get userIndependentRepositoryUrl
   * @return userIndependentRepositoryUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserIndependentRepositoryUrl() {
    return userIndependentRepositoryUrl;
  }


  @JsonProperty(JSON_PROPERTY_USER_INDEPENDENT_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIndependentRepositoryUrl(String userIndependentRepositoryUrl) {
    this.userIndependentRepositoryUrl = userIndependentRepositoryUrl;
  }


  /**
   * Return true if this TemplateProgrammingExerciseParticipation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateProgrammingExerciseParticipation templateProgrammingExerciseParticipation = (TemplateProgrammingExerciseParticipation) o;
    return Objects.equals(this.repositoryUrl, templateProgrammingExerciseParticipation.repositoryUrl) &&
        Objects.equals(this.buildPlanId, templateProgrammingExerciseParticipation.buildPlanId) &&
        Objects.equals(this.programmingExercise, templateProgrammingExerciseParticipation.programmingExercise) &&
        Objects.equals(this.userIndependentRepositoryUrl, templateProgrammingExerciseParticipation.userIndependentRepositoryUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryUrl, buildPlanId, programmingExercise, userIndependentRepositoryUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateProgrammingExerciseParticipation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    buildPlanId: ").append(toIndentedString(buildPlanId)).append("\n");
    sb.append("    programmingExercise: ").append(toIndentedString(programmingExercise)).append("\n");
    sb.append("    userIndependentRepositoryUrl: ").append(toIndentedString(userIndependentRepositoryUrl)).append("\n");
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
  mappings.put("TemplateProgrammingExerciseParticipation", TemplateProgrammingExerciseParticipation.class);
  JSON.registerDiscriminator(TemplateProgrammingExerciseParticipation.class, "type", mappings);
}
}

