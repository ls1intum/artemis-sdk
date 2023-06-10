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
 * SubmissionExportOptionsDTO
 */
@JsonPropertyOrder({
  SubmissionExportOptionsDTO.JSON_PROPERTY_EXPORT_ALL_PARTICIPANTS,
  SubmissionExportOptionsDTO.JSON_PROPERTY_FILTER_LATE_SUBMISSIONS,
  SubmissionExportOptionsDTO.JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_DATE,
  SubmissionExportOptionsDTO.JSON_PROPERTY_PARTICIPANT_IDENTIFIER_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class SubmissionExportOptionsDTO {
  public static final String JSON_PROPERTY_EXPORT_ALL_PARTICIPANTS = "exportAllParticipants";
  private Boolean exportAllParticipants;

  public static final String JSON_PROPERTY_FILTER_LATE_SUBMISSIONS = "filterLateSubmissions";
  private Boolean filterLateSubmissions;

  public static final String JSON_PROPERTY_FILTER_LATE_SUBMISSIONS_DATE = "filterLateSubmissionsDate";
  private OffsetDateTime filterLateSubmissionsDate;

  public static final String JSON_PROPERTY_PARTICIPANT_IDENTIFIER_LIST = "participantIdentifierList";
  private String participantIdentifierList;

  public SubmissionExportOptionsDTO() { 
  }

  public SubmissionExportOptionsDTO exportAllParticipants(Boolean exportAllParticipants) {
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


  public SubmissionExportOptionsDTO filterLateSubmissions(Boolean filterLateSubmissions) {
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


  public SubmissionExportOptionsDTO filterLateSubmissionsDate(OffsetDateTime filterLateSubmissionsDate) {
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


  public SubmissionExportOptionsDTO participantIdentifierList(String participantIdentifierList) {
    this.participantIdentifierList = participantIdentifierList;
    return this;
  }

   /**
   * Get participantIdentifierList
   * @return participantIdentifierList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDENTIFIER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParticipantIdentifierList() {
    return participantIdentifierList;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDENTIFIER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantIdentifierList(String participantIdentifierList) {
    this.participantIdentifierList = participantIdentifierList;
  }


  /**
   * Return true if this SubmissionExportOptionsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionExportOptionsDTO submissionExportOptionsDTO = (SubmissionExportOptionsDTO) o;
    return Objects.equals(this.exportAllParticipants, submissionExportOptionsDTO.exportAllParticipants) &&
        Objects.equals(this.filterLateSubmissions, submissionExportOptionsDTO.filterLateSubmissions) &&
        Objects.equals(this.filterLateSubmissionsDate, submissionExportOptionsDTO.filterLateSubmissionsDate) &&
        Objects.equals(this.participantIdentifierList, submissionExportOptionsDTO.participantIdentifierList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportAllParticipants, filterLateSubmissions, filterLateSubmissionsDate, participantIdentifierList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionExportOptionsDTO {\n");
    sb.append("    exportAllParticipants: ").append(toIndentedString(exportAllParticipants)).append("\n");
    sb.append("    filterLateSubmissions: ").append(toIndentedString(filterLateSubmissions)).append("\n");
    sb.append("    filterLateSubmissionsDate: ").append(toIndentedString(filterLateSubmissionsDate)).append("\n");
    sb.append("    participantIdentifierList: ").append(toIndentedString(participantIdentifierList)).append("\n");
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

