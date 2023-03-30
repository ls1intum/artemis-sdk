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
import de.tum.cit.ase.artemis.sdk.model.IPAddressCreatorObjectObjectObjectObjectObject;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * IPAddressNetworkObjectObjectObjectObjectObject
 */
@JsonPropertyOrder({
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_LOOPBACK,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_ADDRESS_CREATOR,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_STANDARD_LOOPBACK_STRINGS,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_IPV4,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_IPVERSION,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_IPV6,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_SEGMENT_CACHING,
  IPAddressNetworkObjectObjectObjectObjectObject.JSON_PROPERTY_PREFIX_CONFIGURATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class IPAddressNetworkObjectObjectObjectObjectObject {
  public static final String JSON_PROPERTY_LOOPBACK = "loopback";
  private Object loopback;

  public static final String JSON_PROPERTY_ADDRESS_CREATOR = "addressCreator";
  private IPAddressCreatorObjectObjectObjectObjectObject addressCreator;

  public static final String JSON_PROPERTY_STANDARD_LOOPBACK_STRINGS = "standardLoopbackStrings";
  private List<String> standardLoopbackStrings = new ArrayList<>();

  public static final String JSON_PROPERTY_IPV4 = "ipv4";
  private Boolean ipv4;

  /**
   * Gets or Sets ipversion
   */
  public enum IpversionEnum {
    IPV4("IPv4"),
    
    IPV6("IPv6");

    private String value;

    IpversionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IpversionEnum fromValue(String value) {
      for (IpversionEnum b : IpversionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IPVERSION = "ipversion";
  private IpversionEnum ipversion;

  public static final String JSON_PROPERTY_IPV6 = "ipv6";
  private Boolean ipv6;

  public static final String JSON_PROPERTY_SEGMENT_CACHING = "segmentCaching";
  private Boolean segmentCaching;

  /**
   * Gets or Sets prefixConfiguration
   */
  public enum PrefixConfigurationEnum {
    ALL_PREFIXED_ADDRESSES_ARE_SUBNETS("ALL_PREFIXED_ADDRESSES_ARE_SUBNETS"),
    
    PREFIXED_ZERO_HOSTS_ARE_SUBNETS("PREFIXED_ZERO_HOSTS_ARE_SUBNETS"),
    
    EXPLICIT_SUBNETS("EXPLICIT_SUBNETS");

    private String value;

    PrefixConfigurationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrefixConfigurationEnum fromValue(String value) {
      for (PrefixConfigurationEnum b : PrefixConfigurationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PREFIX_CONFIGURATION = "prefixConfiguration";
  private PrefixConfigurationEnum prefixConfiguration;

  public IPAddressNetworkObjectObjectObjectObjectObject() { 
  }

  public IPAddressNetworkObjectObjectObjectObjectObject loopback(Object loopback) {
    this.loopback = loopback;
    return this;
  }

   /**
   * Get loopback
   * @return loopback
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOOPBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getLoopback() {
    return loopback;
  }


  @JsonProperty(JSON_PROPERTY_LOOPBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoopback(Object loopback) {
    this.loopback = loopback;
  }


  public IPAddressNetworkObjectObjectObjectObjectObject addressCreator(IPAddressCreatorObjectObjectObjectObjectObject addressCreator) {
    this.addressCreator = addressCreator;
    return this;
  }

   /**
   * Get addressCreator
   * @return addressCreator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPAddressCreatorObjectObjectObjectObjectObject getAddressCreator() {
    return addressCreator;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressCreator(IPAddressCreatorObjectObjectObjectObjectObject addressCreator) {
    this.addressCreator = addressCreator;
  }


  public IPAddressNetworkObjectObjectObjectObjectObject standardLoopbackStrings(List<String> standardLoopbackStrings) {
    this.standardLoopbackStrings = standardLoopbackStrings;
    return this;
  }

  public IPAddressNetworkObjectObjectObjectObjectObject addStandardLoopbackStringsItem(String standardLoopbackStringsItem) {
    if (this.standardLoopbackStrings == null) {
      this.standardLoopbackStrings = new ArrayList<>();
    }
    this.standardLoopbackStrings.add(standardLoopbackStringsItem);
    return this;
  }

   /**
   * Get standardLoopbackStrings
   * @return standardLoopbackStrings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARD_LOOPBACK_STRINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStandardLoopbackStrings() {
    return standardLoopbackStrings;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD_LOOPBACK_STRINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandardLoopbackStrings(List<String> standardLoopbackStrings) {
    this.standardLoopbackStrings = standardLoopbackStrings;
  }


  public IPAddressNetworkObjectObjectObjectObjectObject ipv4(Boolean ipv4) {
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIpv4() {
    return ipv4;
  }


  @JsonProperty(JSON_PROPERTY_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv4(Boolean ipv4) {
    this.ipv4 = ipv4;
  }


  public IPAddressNetworkObjectObjectObjectObjectObject ipversion(IpversionEnum ipversion) {
    this.ipversion = ipversion;
    return this;
  }

   /**
   * Get ipversion
   * @return ipversion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IpversionEnum getIpversion() {
    return ipversion;
  }


  @JsonProperty(JSON_PROPERTY_IPVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpversion(IpversionEnum ipversion) {
    this.ipversion = ipversion;
  }


  public IPAddressNetworkObjectObjectObjectObjectObject ipv6(Boolean ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIpv6() {
    return ipv6;
  }


  @JsonProperty(JSON_PROPERTY_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6(Boolean ipv6) {
    this.ipv6 = ipv6;
  }


  public IPAddressNetworkObjectObjectObjectObjectObject segmentCaching(Boolean segmentCaching) {
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


  public IPAddressNetworkObjectObjectObjectObjectObject prefixConfiguration(PrefixConfigurationEnum prefixConfiguration) {
    this.prefixConfiguration = prefixConfiguration;
    return this;
  }

   /**
   * Get prefixConfiguration
   * @return prefixConfiguration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrefixConfigurationEnum getPrefixConfiguration() {
    return prefixConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixConfiguration(PrefixConfigurationEnum prefixConfiguration) {
    this.prefixConfiguration = prefixConfiguration;
  }


  /**
   * Return true if this IPAddressNetworkObjectObjectObjectObjectObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressNetworkObjectObjectObjectObjectObject ipAddressNetworkObjectObjectObjectObjectObject = (IPAddressNetworkObjectObjectObjectObjectObject) o;
    return Objects.equals(this.loopback, ipAddressNetworkObjectObjectObjectObjectObject.loopback) &&
        Objects.equals(this.addressCreator, ipAddressNetworkObjectObjectObjectObjectObject.addressCreator) &&
        Objects.equals(this.standardLoopbackStrings, ipAddressNetworkObjectObjectObjectObjectObject.standardLoopbackStrings) &&
        Objects.equals(this.ipv4, ipAddressNetworkObjectObjectObjectObjectObject.ipv4) &&
        Objects.equals(this.ipversion, ipAddressNetworkObjectObjectObjectObjectObject.ipversion) &&
        Objects.equals(this.ipv6, ipAddressNetworkObjectObjectObjectObjectObject.ipv6) &&
        Objects.equals(this.segmentCaching, ipAddressNetworkObjectObjectObjectObjectObject.segmentCaching) &&
        Objects.equals(this.prefixConfiguration, ipAddressNetworkObjectObjectObjectObjectObject.prefixConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loopback, addressCreator, standardLoopbackStrings, ipv4, ipversion, ipv6, segmentCaching, prefixConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressNetworkObjectObjectObjectObjectObject {\n");
    sb.append("    loopback: ").append(toIndentedString(loopback)).append("\n");
    sb.append("    addressCreator: ").append(toIndentedString(addressCreator)).append("\n");
    sb.append("    standardLoopbackStrings: ").append(toIndentedString(standardLoopbackStrings)).append("\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipversion: ").append(toIndentedString(ipversion)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    segmentCaching: ").append(toIndentedString(segmentCaching)).append("\n");
    sb.append("    prefixConfiguration: ").append(toIndentedString(prefixConfiguration)).append("\n");
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

