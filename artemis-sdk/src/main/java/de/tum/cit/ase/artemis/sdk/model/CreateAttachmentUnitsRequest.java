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
import de.tum.cit.ase.artemis.sdk.model.LectureUnitInformationDTO;
import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * CreateAttachmentUnitsRequest
 */
@JsonPropertyOrder({
  CreateAttachmentUnitsRequest.JSON_PROPERTY_LECTURE_UNIT_INFORMATION_D_T_O,
  CreateAttachmentUnitsRequest.JSON_PROPERTY_FILE
})
@JsonTypeName("createAttachmentUnits_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class CreateAttachmentUnitsRequest {
  public static final String JSON_PROPERTY_LECTURE_UNIT_INFORMATION_D_T_O = "lectureUnitInformationDTO";
  private LectureUnitInformationDTO lectureUnitInformationDTO;

  public static final String JSON_PROPERTY_FILE = "file";
  private File _file;

  public CreateAttachmentUnitsRequest() { 
  }

  public CreateAttachmentUnitsRequest lectureUnitInformationDTO(LectureUnitInformationDTO lectureUnitInformationDTO) {
    this.lectureUnitInformationDTO = lectureUnitInformationDTO;
    return this;
  }

   /**
   * Get lectureUnitInformationDTO
   * @return lectureUnitInformationDTO
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LECTURE_UNIT_INFORMATION_D_T_O)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LectureUnitInformationDTO getLectureUnitInformationDTO() {
    return lectureUnitInformationDTO;
  }


  @JsonProperty(JSON_PROPERTY_LECTURE_UNIT_INFORMATION_D_T_O)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLectureUnitInformationDTO(LectureUnitInformationDTO lectureUnitInformationDTO) {
    this.lectureUnitInformationDTO = lectureUnitInformationDTO;
  }


  public CreateAttachmentUnitsRequest _file(File _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(File _file) {
    this._file = _file;
  }


  /**
   * Return true if this createAttachmentUnits_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAttachmentUnitsRequest createAttachmentUnitsRequest = (CreateAttachmentUnitsRequest) o;
    return Objects.equals(this.lectureUnitInformationDTO, createAttachmentUnitsRequest.lectureUnitInformationDTO) &&
        Objects.equals(this._file, createAttachmentUnitsRequest._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lectureUnitInformationDTO, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAttachmentUnitsRequest {\n");
    sb.append("    lectureUnitInformationDTO: ").append(toIndentedString(lectureUnitInformationDTO)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

