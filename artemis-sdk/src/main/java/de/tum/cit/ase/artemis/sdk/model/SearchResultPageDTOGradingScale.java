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
import de.tum.cit.ase.artemis.sdk.model.GradingScale;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SearchResultPageDTOGradingScale
 */
@JsonPropertyOrder({
  SearchResultPageDTOGradingScale.JSON_PROPERTY_RESULTS_ON_PAGE,
  SearchResultPageDTOGradingScale.JSON_PROPERTY_NUMBER_OF_PAGES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class SearchResultPageDTOGradingScale {
  public static final String JSON_PROPERTY_RESULTS_ON_PAGE = "resultsOnPage";
  private List<GradingScale> resultsOnPage = new ArrayList<>();

  public static final String JSON_PROPERTY_NUMBER_OF_PAGES = "numberOfPages";
  private Integer numberOfPages;

  public SearchResultPageDTOGradingScale() { 
  }

  public SearchResultPageDTOGradingScale resultsOnPage(List<GradingScale> resultsOnPage) {
    this.resultsOnPage = resultsOnPage;
    return this;
  }

  public SearchResultPageDTOGradingScale addResultsOnPageItem(GradingScale resultsOnPageItem) {
    if (this.resultsOnPage == null) {
      this.resultsOnPage = new ArrayList<>();
    }
    this.resultsOnPage.add(resultsOnPageItem);
    return this;
  }

   /**
   * Get resultsOnPage
   * @return resultsOnPage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS_ON_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GradingScale> getResultsOnPage() {
    return resultsOnPage;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS_ON_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultsOnPage(List<GradingScale> resultsOnPage) {
    this.resultsOnPage = resultsOnPage;
  }


  public SearchResultPageDTOGradingScale numberOfPages(Integer numberOfPages) {
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


  /**
   * Return true if this SearchResultPageDTOGradingScale object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultPageDTOGradingScale searchResultPageDTOGradingScale = (SearchResultPageDTOGradingScale) o;
    return Objects.equals(this.resultsOnPage, searchResultPageDTOGradingScale.resultsOnPage) &&
        Objects.equals(this.numberOfPages, searchResultPageDTOGradingScale.numberOfPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultsOnPage, numberOfPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultPageDTOGradingScale {\n");
    sb.append("    resultsOnPage: ").append(toIndentedString(resultsOnPage)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
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

