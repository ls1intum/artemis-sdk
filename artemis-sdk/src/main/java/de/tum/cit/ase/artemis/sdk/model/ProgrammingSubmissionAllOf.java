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
import de.tum.cit.ase.artemis.sdk.model.BuildLogEntry;
import de.tum.cit.ase.artemis.sdk.model.Participation;
import de.tum.cit.ase.artemis.sdk.model.Result;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ProgrammingSubmissionAllOf
 */
@JsonPropertyOrder({
  ProgrammingSubmissionAllOf.JSON_PROPERTY_PARTICIPATION,
  ProgrammingSubmissionAllOf.JSON_PROPERTY_COMMIT_HASH,
  ProgrammingSubmissionAllOf.JSON_PROPERTY_BUILD_FAILED,
  ProgrammingSubmissionAllOf.JSON_PROPERTY_BUILD_ARTIFACT,
  ProgrammingSubmissionAllOf.JSON_PROPERTY_BUILD_LOG_ENTRIES,
  ProgrammingSubmissionAllOf.JSON_PROPERTY_RESULTS
})
@JsonTypeName("ProgrammingSubmission_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ProgrammingSubmissionAllOf {
  public static final String JSON_PROPERTY_PARTICIPATION = "participation";
  private Participation participation;

  public static final String JSON_PROPERTY_COMMIT_HASH = "commitHash";
  private String commitHash;

  public static final String JSON_PROPERTY_BUILD_FAILED = "buildFailed";
  private Boolean buildFailed;

  public static final String JSON_PROPERTY_BUILD_ARTIFACT = "buildArtifact";
  private Boolean buildArtifact;

  public static final String JSON_PROPERTY_BUILD_LOG_ENTRIES = "buildLogEntries";
  private List<BuildLogEntry> buildLogEntries;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Result> results;

  public ProgrammingSubmissionAllOf() { 
  }

  @JsonCreator
  public ProgrammingSubmissionAllOf(
    @JsonProperty(JSON_PROPERTY_RESULTS) List<Result> results
  ) {
    this();
    this.results = results;
  }

  public ProgrammingSubmissionAllOf participation(Participation participation) {
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


  public ProgrammingSubmissionAllOf commitHash(String commitHash) {
    this.commitHash = commitHash;
    return this;
  }

   /**
   * Get commitHash
   * @return commitHash
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMIT_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommitHash() {
    return commitHash;
  }


  @JsonProperty(JSON_PROPERTY_COMMIT_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommitHash(String commitHash) {
    this.commitHash = commitHash;
  }


  public ProgrammingSubmissionAllOf buildFailed(Boolean buildFailed) {
    this.buildFailed = buildFailed;
    return this;
  }

   /**
   * Get buildFailed
   * @return buildFailed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBuildFailed() {
    return buildFailed;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildFailed(Boolean buildFailed) {
    this.buildFailed = buildFailed;
  }


  public ProgrammingSubmissionAllOf buildArtifact(Boolean buildArtifact) {
    this.buildArtifact = buildArtifact;
    return this;
  }

   /**
   * Get buildArtifact
   * @return buildArtifact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_ARTIFACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBuildArtifact() {
    return buildArtifact;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_ARTIFACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildArtifact(Boolean buildArtifact) {
    this.buildArtifact = buildArtifact;
  }


  public ProgrammingSubmissionAllOf buildLogEntries(List<BuildLogEntry> buildLogEntries) {
    this.buildLogEntries = buildLogEntries;
    return this;
  }

  public ProgrammingSubmissionAllOf addBuildLogEntriesItem(BuildLogEntry buildLogEntriesItem) {
    if (this.buildLogEntries == null) {
      this.buildLogEntries = new ArrayList<>();
    }
    this.buildLogEntries.add(buildLogEntriesItem);
    return this;
  }

   /**
   * Get buildLogEntries
   * @return buildLogEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_LOG_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BuildLogEntry> getBuildLogEntries() {
    return buildLogEntries;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_LOG_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildLogEntries(List<BuildLogEntry> buildLogEntries) {
    this.buildLogEntries = buildLogEntries;
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
   * Return true if this ProgrammingSubmission_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingSubmissionAllOf programmingSubmissionAllOf = (ProgrammingSubmissionAllOf) o;
    return Objects.equals(this.participation, programmingSubmissionAllOf.participation) &&
        Objects.equals(this.commitHash, programmingSubmissionAllOf.commitHash) &&
        Objects.equals(this.buildFailed, programmingSubmissionAllOf.buildFailed) &&
        Objects.equals(this.buildArtifact, programmingSubmissionAllOf.buildArtifact) &&
        Objects.equals(this.buildLogEntries, programmingSubmissionAllOf.buildLogEntries) &&
        Objects.equals(this.results, programmingSubmissionAllOf.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, commitHash, buildFailed, buildArtifact, buildLogEntries, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingSubmissionAllOf {\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    commitHash: ").append(toIndentedString(commitHash)).append("\n");
    sb.append("    buildFailed: ").append(toIndentedString(buildFailed)).append("\n");
    sb.append("    buildArtifact: ").append(toIndentedString(buildArtifact)).append("\n");
    sb.append("    buildLogEntries: ").append(toIndentedString(buildLogEntries)).append("\n");
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

}

