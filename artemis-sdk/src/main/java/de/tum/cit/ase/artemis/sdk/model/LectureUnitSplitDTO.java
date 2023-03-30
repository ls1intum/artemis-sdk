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
 * LectureUnitSplitDTO
 */
@JsonPropertyOrder({
  LectureUnitSplitDTO.JSON_PROPERTY_UNIT_NAME,
  LectureUnitSplitDTO.JSON_PROPERTY_RELEASE_DATE,
  LectureUnitSplitDTO.JSON_PROPERTY_START_PAGE,
  LectureUnitSplitDTO.JSON_PROPERTY_END_PAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class LectureUnitSplitDTO {
  public static final String JSON_PROPERTY_UNIT_NAME = "unitName";
  private String unitName;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private OffsetDateTime releaseDate;

  public static final String JSON_PROPERTY_START_PAGE = "startPage";
  private Integer startPage;

  public static final String JSON_PROPERTY_END_PAGE = "endPage";
  private Integer endPage;

  public LectureUnitSplitDTO() { 
  }

  public LectureUnitSplitDTO unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

   /**
   * Get unitName
   * @return unitName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnitName() {
    return unitName;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }


  public LectureUnitSplitDTO releaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public LectureUnitSplitDTO startPage(Integer startPage) {
    this.startPage = startPage;
    return this;
  }

   /**
   * Get startPage
   * @return startPage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartPage() {
    return startPage;
  }


  @JsonProperty(JSON_PROPERTY_START_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartPage(Integer startPage) {
    this.startPage = startPage;
  }


  public LectureUnitSplitDTO endPage(Integer endPage) {
    this.endPage = endPage;
    return this;
  }

   /**
   * Get endPage
   * @return endPage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndPage() {
    return endPage;
  }


  @JsonProperty(JSON_PROPERTY_END_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndPage(Integer endPage) {
    this.endPage = endPage;
  }


  /**
   * Return true if this LectureUnitSplitDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LectureUnitSplitDTO lectureUnitSplitDTO = (LectureUnitSplitDTO) o;
    return Objects.equals(this.unitName, lectureUnitSplitDTO.unitName) &&
        Objects.equals(this.releaseDate, lectureUnitSplitDTO.releaseDate) &&
        Objects.equals(this.startPage, lectureUnitSplitDTO.startPage) &&
        Objects.equals(this.endPage, lectureUnitSplitDTO.endPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitName, releaseDate, startPage, endPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LectureUnitSplitDTO {\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    endPage: ").append(toIndentedString(endPage)).append("\n");
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

