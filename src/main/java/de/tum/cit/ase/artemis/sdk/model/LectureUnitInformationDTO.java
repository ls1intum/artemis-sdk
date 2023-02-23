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
import de.tum.cit.ase.artemis.sdk.model.LectureUnitSplitDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * LectureUnitInformationDTO
 */
@JsonPropertyOrder({
  LectureUnitInformationDTO.JSON_PROPERTY_UNITS,
  LectureUnitInformationDTO.JSON_PROPERTY_NUMBER_OF_PAGES,
  LectureUnitInformationDTO.JSON_PROPERTY_REMOVE_BREAK_SLIDES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class LectureUnitInformationDTO {
  public static final String JSON_PROPERTY_UNITS = "units";
  private List<LectureUnitSplitDTO> units = new ArrayList<>();

  public static final String JSON_PROPERTY_NUMBER_OF_PAGES = "numberOfPages";
  private Integer numberOfPages;

  public static final String JSON_PROPERTY_REMOVE_BREAK_SLIDES = "removeBreakSlides";
  private Boolean removeBreakSlides;

  public LectureUnitInformationDTO() { 
  }

  public LectureUnitInformationDTO units(List<LectureUnitSplitDTO> units) {
    this.units = units;
    return this;
  }

  public LectureUnitInformationDTO addUnitsItem(LectureUnitSplitDTO unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LectureUnitSplitDTO> getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(List<LectureUnitSplitDTO> units) {
    this.units = units;
  }


  public LectureUnitInformationDTO numberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
    return this;
  }

   /**
   * Get numberOfPages
   * @return numberOfPages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfPages() {
    return numberOfPages;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }


  public LectureUnitInformationDTO removeBreakSlides(Boolean removeBreakSlides) {
    this.removeBreakSlides = removeBreakSlides;
    return this;
  }

   /**
   * Get removeBreakSlides
   * @return removeBreakSlides
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOVE_BREAK_SLIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemoveBreakSlides() {
    return removeBreakSlides;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE_BREAK_SLIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoveBreakSlides(Boolean removeBreakSlides) {
    this.removeBreakSlides = removeBreakSlides;
  }


  /**
   * Return true if this LectureUnitInformationDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LectureUnitInformationDTO lectureUnitInformationDTO = (LectureUnitInformationDTO) o;
    return Objects.equals(this.units, lectureUnitInformationDTO.units) &&
        Objects.equals(this.numberOfPages, lectureUnitInformationDTO.numberOfPages) &&
        Objects.equals(this.removeBreakSlides, lectureUnitInformationDTO.removeBreakSlides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, numberOfPages, removeBreakSlides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LectureUnitInformationDTO {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    removeBreakSlides: ").append(toIndentedString(removeBreakSlides)).append("\n");
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

