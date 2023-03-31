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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * RepositoryExportOptionsDTO
 */
@JsonPropertyOrder({
  RepositoryExportOptionsDTO.JSON_PROPERTY_EXPORT_ALL_PARTICIPANTS,
  RepositoryExportOptionsDTO.JSON_PROPERTY_FILTER_LATE_SUBMISSIONS,
  RepositoryExportOptionsDTO.JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_INDIVIDUAL_DUE_DATE,
  RepositoryExportOptionsDTO.JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_DATE,
  RepositoryExportOptionsDTO.JSON_PROPERTY_EXCLUDE_PRACTICE_SUBMISSIONS,
  RepositoryExportOptionsDTO.JSON_PROPERTY_ADD_PARTICIPANT_NAME,
  RepositoryExportOptionsDTO.JSON_PROPERTY_COMBINE_STUDENT_COMMITS,
  RepositoryExportOptionsDTO.JSON_PROPERTY_ANONYMIZE_STUDENT_COMMITS,
  RepositoryExportOptionsDTO.JSON_PROPERTY_NORMALIZE_CODE_STYLE,
  RepositoryExportOptionsDTO.JSON_PROPERTY_HIDE_STUDENT_NAME_IN_ZIPPED_FOLDER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class RepositoryExportOptionsDTO {
  public static final String JSON_PROPERTY_EXPORT_ALL_PARTICIPANTS = "exportAllParticipants";
  private Boolean exportAllParticipants;

  public static final String JSON_PROPERTY_FILTER_LATE_SUBMISSIONS = "filterLateSubmissions";
  private Boolean filterLateSubmissions;

  public static final String JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_INDIVIDUAL_DUE_DATE = "filterLateSubmissionsIndividualDueDate";
  private Boolean filterLateSubmissionsIndividualDueDate;

  public static final String JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_DATE = "filterLateSubmissionsDate";
  private OffsetDateTime filterLateSubmissionsDate;

  public static final String JSON_PROPERTY_EXCLUDE_PRACTICE_SUBMISSIONS = "excludePracticeSubmissions";
  private Boolean excludePracticeSubmissions;

  public static final String JSON_PROPERTY_ADD_PARTICIPANT_NAME = "addParticipantName";
  private Boolean addParticipantName;

  public static final String JSON_PROPERTY_COMBINE_STUDENT_COMMITS = "combineStudentCommits";
  private Boolean combineStudentCommits;

  public static final String JSON_PROPERTY_ANONYMIZE_STUDENT_COMMITS = "anonymizeStudentCommits";
  private Boolean anonymizeStudentCommits;

  public static final String JSON_PROPERTY_NORMALIZE_CODE_STYLE = "normalizeCodeStyle";
  private Boolean normalizeCodeStyle;

  public static final String JSON_PROPERTY_HIDE_STUDENT_NAME_IN_ZIPPED_FOLDER = "hideStudentNameInZippedFolder";
  private Boolean hideStudentNameInZippedFolder;

  public RepositoryExportOptionsDTO() { 
  }

  public RepositoryExportOptionsDTO exportAllParticipants(Boolean exportAllParticipants) {
    this.exportAllParticipants = exportAllParticipants;
    return this;
  }

   /**
   * Get exportAllParticipants
   * @return exportAllParticipants
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPORT_ALL_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExportAllParticipants() {
    return exportAllParticipants;
  }


  @JsonProperty(JSON_PROPERTY_EXPORT_ALL_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportAllParticipants(Boolean exportAllParticipants) {
    this.exportAllParticipants = exportAllParticipants;
  }


  public RepositoryExportOptionsDTO filterLateSubmissions(Boolean filterLateSubmissions) {
    this.filterLateSubmissions = filterLateSubmissions;
    return this;
  }

   /**
   * Get filterLateSubmissions
   * @return filterLateSubmissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_LATE_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterLateSubmissions() {
    return filterLateSubmissions;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_LATE_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterLateSubmissions(Boolean filterLateSubmissions) {
    this.filterLateSubmissions = filterLateSubmissions;
  }


  public RepositoryExportOptionsDTO filterLateSubmissionsIndividualDueDate(Boolean filterLateSubmissionsIndividualDueDate) {
    this.filterLateSubmissionsIndividualDueDate = filterLateSubmissionsIndividualDueDate;
    return this;
  }

   /**
   * Get filterLateSubmissionsIndividualDueDate
   * @return filterLateSubmissionsIndividualDueDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_INDIVIDUAL_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterLateSubmissionsIndividualDueDate() {
    return filterLateSubmissionsIndividualDueDate;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_INDIVIDUAL_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterLateSubmissionsIndividualDueDate(Boolean filterLateSubmissionsIndividualDueDate) {
    this.filterLateSubmissionsIndividualDueDate = filterLateSubmissionsIndividualDueDate;
  }


  public RepositoryExportOptionsDTO filterLateSubmissionsDate(OffsetDateTime filterLateSubmissionsDate) {
    this.filterLateSubmissionsDate = filterLateSubmissionsDate;
    return this;
  }

   /**
   * Get filterLateSubmissionsDate
   * @return filterLateSubmissionsDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFilterLateSubmissionsDate() {
    return filterLateSubmissionsDate;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterLateSubmissionsDate(OffsetDateTime filterLateSubmissionsDate) {
    this.filterLateSubmissionsDate = filterLateSubmissionsDate;
  }


  public RepositoryExportOptionsDTO excludePracticeSubmissions(Boolean excludePracticeSubmissions) {
    this.excludePracticeSubmissions = excludePracticeSubmissions;
    return this;
  }

   /**
   * Get excludePracticeSubmissions
   * @return excludePracticeSubmissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_PRACTICE_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExcludePracticeSubmissions() {
    return excludePracticeSubmissions;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_PRACTICE_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludePracticeSubmissions(Boolean excludePracticeSubmissions) {
    this.excludePracticeSubmissions = excludePracticeSubmissions;
  }


  public RepositoryExportOptionsDTO addParticipantName(Boolean addParticipantName) {
    this.addParticipantName = addParticipantName;
    return this;
  }

   /**
   * Get addParticipantName
   * @return addParticipantName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_PARTICIPANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddParticipantName() {
    return addParticipantName;
  }


  @JsonProperty(JSON_PROPERTY_ADD_PARTICIPANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddParticipantName(Boolean addParticipantName) {
    this.addParticipantName = addParticipantName;
  }


  public RepositoryExportOptionsDTO combineStudentCommits(Boolean combineStudentCommits) {
    this.combineStudentCommits = combineStudentCommits;
    return this;
  }

   /**
   * Get combineStudentCommits
   * @return combineStudentCommits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINE_STUDENT_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCombineStudentCommits() {
    return combineStudentCommits;
  }


  @JsonProperty(JSON_PROPERTY_COMBINE_STUDENT_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombineStudentCommits(Boolean combineStudentCommits) {
    this.combineStudentCommits = combineStudentCommits;
  }


  public RepositoryExportOptionsDTO anonymizeStudentCommits(Boolean anonymizeStudentCommits) {
    this.anonymizeStudentCommits = anonymizeStudentCommits;
    return this;
  }

   /**
   * Get anonymizeStudentCommits
   * @return anonymizeStudentCommits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMIZE_STUDENT_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAnonymizeStudentCommits() {
    return anonymizeStudentCommits;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMIZE_STUDENT_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnonymizeStudentCommits(Boolean anonymizeStudentCommits) {
    this.anonymizeStudentCommits = anonymizeStudentCommits;
  }


  public RepositoryExportOptionsDTO normalizeCodeStyle(Boolean normalizeCodeStyle) {
    this.normalizeCodeStyle = normalizeCodeStyle;
    return this;
  }

   /**
   * Get normalizeCodeStyle
   * @return normalizeCodeStyle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NORMALIZE_CODE_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNormalizeCodeStyle() {
    return normalizeCodeStyle;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZE_CODE_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizeCodeStyle(Boolean normalizeCodeStyle) {
    this.normalizeCodeStyle = normalizeCodeStyle;
  }


  public RepositoryExportOptionsDTO hideStudentNameInZippedFolder(Boolean hideStudentNameInZippedFolder) {
    this.hideStudentNameInZippedFolder = hideStudentNameInZippedFolder;
    return this;
  }

   /**
   * Get hideStudentNameInZippedFolder
   * @return hideStudentNameInZippedFolder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_STUDENT_NAME_IN_ZIPPED_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideStudentNameInZippedFolder() {
    return hideStudentNameInZippedFolder;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_STUDENT_NAME_IN_ZIPPED_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideStudentNameInZippedFolder(Boolean hideStudentNameInZippedFolder) {
    this.hideStudentNameInZippedFolder = hideStudentNameInZippedFolder;
  }


  /**
   * Return true if this RepositoryExportOptionsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryExportOptionsDTO repositoryExportOptionsDTO = (RepositoryExportOptionsDTO) o;
    return Objects.equals(this.exportAllParticipants, repositoryExportOptionsDTO.exportAllParticipants) &&
        Objects.equals(this.filterLateSubmissions, repositoryExportOptionsDTO.filterLateSubmissions) &&
        Objects.equals(this.filterLateSubmissionsIndividualDueDate, repositoryExportOptionsDTO.filterLateSubmissionsIndividualDueDate) &&
        Objects.equals(this.filterLateSubmissionsDate, repositoryExportOptionsDTO.filterLateSubmissionsDate) &&
        Objects.equals(this.excludePracticeSubmissions, repositoryExportOptionsDTO.excludePracticeSubmissions) &&
        Objects.equals(this.addParticipantName, repositoryExportOptionsDTO.addParticipantName) &&
        Objects.equals(this.combineStudentCommits, repositoryExportOptionsDTO.combineStudentCommits) &&
        Objects.equals(this.anonymizeStudentCommits, repositoryExportOptionsDTO.anonymizeStudentCommits) &&
        Objects.equals(this.normalizeCodeStyle, repositoryExportOptionsDTO.normalizeCodeStyle) &&
        Objects.equals(this.hideStudentNameInZippedFolder, repositoryExportOptionsDTO.hideStudentNameInZippedFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportAllParticipants, filterLateSubmissions, filterLateSubmissionsIndividualDueDate, filterLateSubmissionsDate, excludePracticeSubmissions, addParticipantName, combineStudentCommits, anonymizeStudentCommits, normalizeCodeStyle, hideStudentNameInZippedFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryExportOptionsDTO {\n");
    sb.append("    exportAllParticipants: ").append(toIndentedString(exportAllParticipants)).append("\n");
    sb.append("    filterLateSubmissions: ").append(toIndentedString(filterLateSubmissions)).append("\n");
    sb.append("    filterLateSubmissionsIndividualDueDate: ").append(toIndentedString(filterLateSubmissionsIndividualDueDate)).append("\n");
    sb.append("    filterLateSubmissionsDate: ").append(toIndentedString(filterLateSubmissionsDate)).append("\n");
    sb.append("    excludePracticeSubmissions: ").append(toIndentedString(excludePracticeSubmissions)).append("\n");
    sb.append("    addParticipantName: ").append(toIndentedString(addParticipantName)).append("\n");
    sb.append("    combineStudentCommits: ").append(toIndentedString(combineStudentCommits)).append("\n");
    sb.append("    anonymizeStudentCommits: ").append(toIndentedString(anonymizeStudentCommits)).append("\n");
    sb.append("    normalizeCodeStyle: ").append(toIndentedString(normalizeCodeStyle)).append("\n");
    sb.append("    hideStudentNameInZippedFolder: ").append(toIndentedString(hideStudentNameInZippedFolder)).append("\n");
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

