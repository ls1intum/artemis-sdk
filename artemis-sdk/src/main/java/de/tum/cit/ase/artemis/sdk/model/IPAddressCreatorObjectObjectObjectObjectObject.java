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
import de.tum.cit.ase.artemis.sdk.model.IPAddressNetworkObjectObjectObjectObjectObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * IPAddressCreatorObjectObjectObjectObjectObject
 */
@JsonPropertyOrder({
  IPAddressCreatorObjectObjectObjectObjectObject.JSON_PROPERTY_NETWORK,
  IPAddressCreatorObjectObjectObjectObjectObject.JSON_PROPERTY_SEGMENT_CACHING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class IPAddressCreatorObjectObjectObjectObjectObject {
  public static final String JSON_PROPERTY_NETWORK = "network";
  private IPAddressNetworkObjectObjectObjectObjectObject network;

  public static final String JSON_PROPERTY_SEGMENT_CACHING = "segmentCaching";
  private Boolean segmentCaching;

  public IPAddressCreatorObjectObjectObjectObjectObject() { 
  }

  public IPAddressCreatorObjectObjectObjectObjectObject network(IPAddressNetworkObjectObjectObjectObjectObject network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPAddressNetworkObjectObjectObjectObjectObject getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(IPAddressNetworkObjectObjectObjectObjectObject network) {
    this.network = network;
  }


  public IPAddressCreatorObjectObjectObjectObjectObject segmentCaching(Boolean segmentCaching) {
    this.segmentCaching = segmentCaching;
    return this;
  }

   /**
   * Get segmentCaching
   * @return segmentCaching
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_CACHING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSegmentCaching() {
    return segmentCaching;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_CACHING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentCaching(Boolean segmentCaching) {
    this.segmentCaching = segmentCaching;
  }


  /**
   * Return true if this IPAddressCreatorObjectObjectObjectObjectObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressCreatorObjectObjectObjectObjectObject ipAddressCreatorObjectObjectObjectObjectObject = (IPAddressCreatorObjectObjectObjectObjectObject) o;
    return Objects.equals(this.network, ipAddressCreatorObjectObjectObjectObjectObject.network) &&
        Objects.equals(this.segmentCaching, ipAddressCreatorObjectObjectObjectObjectObject.segmentCaching);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, segmentCaching);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressCreatorObjectObjectObjectObjectObject {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    segmentCaching: ").append(toIndentedString(segmentCaching)).append("\n");
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

