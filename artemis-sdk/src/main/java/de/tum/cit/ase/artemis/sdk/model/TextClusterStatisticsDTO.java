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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TextClusterStatisticsDTO
 */
@JsonPropertyOrder({
  TextClusterStatisticsDTO.JSON_PROPERTY_CLUSTER_ID,
  TextClusterStatisticsDTO.JSON_PROPERTY_CLUSTER_SIZE,
  TextClusterStatisticsDTO.JSON_PROPERTY_NUMBER_OF_AUTOMATIC_FEEDBACKS,
  TextClusterStatisticsDTO.JSON_PROPERTY_DISABLED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class TextClusterStatisticsDTO {
  public static final String JSON_PROPERTY_CLUSTER_ID = "clusterId";
  private Long clusterId;

  public static final String JSON_PROPERTY_CLUSTER_SIZE = "clusterSize";
  private Long clusterSize;

  public static final String JSON_PROPERTY_NUMBER_OF_AUTOMATIC_FEEDBACKS = "numberOfAutomaticFeedbacks";
  private Long numberOfAutomaticFeedbacks;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public TextClusterStatisticsDTO() { 
  }

  public TextClusterStatisticsDTO clusterId(Long clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
  }


  public TextClusterStatisticsDTO clusterSize(Long clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

   /**
   * Get clusterSize
   * @return clusterSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getClusterSize() {
    return clusterSize;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterSize(Long clusterSize) {
    this.clusterSize = clusterSize;
  }


  public TextClusterStatisticsDTO numberOfAutomaticFeedbacks(Long numberOfAutomaticFeedbacks) {
    this.numberOfAutomaticFeedbacks = numberOfAutomaticFeedbacks;
    return this;
  }

   /**
   * Get numberOfAutomaticFeedbacks
   * @return numberOfAutomaticFeedbacks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_AUTOMATIC_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfAutomaticFeedbacks() {
    return numberOfAutomaticFeedbacks;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_AUTOMATIC_FEEDBACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAutomaticFeedbacks(Long numberOfAutomaticFeedbacks) {
    this.numberOfAutomaticFeedbacks = numberOfAutomaticFeedbacks;
  }


  public TextClusterStatisticsDTO disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  /**
   * Return true if this TextClusterStatisticsDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextClusterStatisticsDTO textClusterStatisticsDTO = (TextClusterStatisticsDTO) o;
    return Objects.equals(this.clusterId, textClusterStatisticsDTO.clusterId) &&
        Objects.equals(this.clusterSize, textClusterStatisticsDTO.clusterSize) &&
        Objects.equals(this.numberOfAutomaticFeedbacks, textClusterStatisticsDTO.numberOfAutomaticFeedbacks) &&
        Objects.equals(this.disabled, textClusterStatisticsDTO.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, clusterSize, numberOfAutomaticFeedbacks, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextClusterStatisticsDTO {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    numberOfAutomaticFeedbacks: ").append(toIndentedString(numberOfAutomaticFeedbacks)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

