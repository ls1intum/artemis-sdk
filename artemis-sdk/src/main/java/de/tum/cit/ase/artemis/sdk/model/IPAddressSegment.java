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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * IPAddressSegment
 */
@JsonPropertyOrder({
  IPAddressSegment.JSON_PROPERTY_UPPER_BYTES,
  IPAddressSegment.JSON_PROPERTY_VALUE,
  IPAddressSegment.JSON_PROPERTY_UPPER_VALUE,
  IPAddressSegment.JSON_PROPERTY_COUNT,
  IPAddressSegment.JSON_PROPERTY_LOWER,
  IPAddressSegment.JSON_PROPERTY_UPPER,
  IPAddressSegment.JSON_PROPERTY_UPPER_SEGMENT_VALUE,
  IPAddressSegment.JSON_PROPERTY_UPPER_DIVISION_VALUE,
  IPAddressSegment.JSON_PROPERTY_DIVISION_VALUE,
  IPAddressSegment.JSON_PROPERTY_VALUE_COUNT,
  IPAddressSegment.JSON_PROPERTY_PREFIX_VALUE_COUNT,
  IPAddressSegment.JSON_PROPERTY_IPV4,
  IPAddressSegment.JSON_PROPERTY_SEGMENT_VALUE,
  IPAddressSegment.JSON_PROPERTY_NETWORK,
  IPAddressSegment.JSON_PROPERTY_ITERABLE,
  IPAddressSegment.JSON_PROPERTY_IPVERSION,
  IPAddressSegment.JSON_PROPERTY_PREFIX_BLOCK,
  IPAddressSegment.JSON_PROPERTY_SEGMENT_PREFIX_LENGTH,
  IPAddressSegment.JSON_PROPERTY_MIN_PREFIX_LENGTH_FOR_BLOCK,
  IPAddressSegment.JSON_PROPERTY_MAX_VALUE,
  IPAddressSegment.JSON_PROPERTY_IPV6,
  IPAddressSegment.JSON_PROPERTY_MULTIPLE,
  IPAddressSegment.JSON_PROPERTY_MAX_SEGMENT_VALUE,
  IPAddressSegment.JSON_PROPERTY_BYTES,
  IPAddressSegment.JSON_PROPERTY_ZERO,
  IPAddressSegment.JSON_PROPERTY_BYTE_COUNT,
  IPAddressSegment.JSON_PROPERTY_BIT_COUNT,
  IPAddressSegment.JSON_PROPERTY_PREFIX_LENGTH_FOR_SINGLE_BLOCK,
  IPAddressSegment.JSON_PROPERTY_FULL_RANGE,
  IPAddressSegment.JSON_PROPERTY_MAX,
  IPAddressSegment.JSON_PROPERTY_STRING,
  IPAddressSegment.JSON_PROPERTY_DIVISION_PREFIX_LENGTH,
  IPAddressSegment.JSON_PROPERTY_WILDCARD_STRING,
  IPAddressSegment.JSON_PROPERTY_PREFIXED,
  IPAddressSegment.JSON_PROPERTY_SINGLE_PREFIX_BLOCK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class IPAddressSegment {
  public static final String JSON_PROPERTY_UPPER_BYTES = "upperBytes";
  private List<byte[]> upperBytes = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public static final String JSON_PROPERTY_UPPER_VALUE = "upperValue";
  private Integer upperValue;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_LOWER = "lower";
  private IPAddressSegment lower;

  public static final String JSON_PROPERTY_UPPER = "upper";
  private IPAddressSegment upper;

  public static final String JSON_PROPERTY_UPPER_SEGMENT_VALUE = "upperSegmentValue";
  private Integer upperSegmentValue;

  public static final String JSON_PROPERTY_UPPER_DIVISION_VALUE = "upperDivisionValue";
  private Long upperDivisionValue;

  public static final String JSON_PROPERTY_DIVISION_VALUE = "divisionValue";
  private Long divisionValue;

  public static final String JSON_PROPERTY_VALUE_COUNT = "valueCount";
  private Integer valueCount;

  public static final String JSON_PROPERTY_PREFIX_VALUE_COUNT = "prefixValueCount";
  private Integer prefixValueCount;

  public static final String JSON_PROPERTY_IPV4 = "ipv4";
  private Boolean ipv4;

  public static final String JSON_PROPERTY_SEGMENT_VALUE = "segmentValue";
  private Integer segmentValue;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private IPAddressNetworkObjectObjectObjectObjectObject network;

  public static final String JSON_PROPERTY_ITERABLE = "iterable";
  private Object iterable;

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

  public static final String JSON_PROPERTY_PREFIX_BLOCK = "prefixBlock";
  private Boolean prefixBlock;

  public static final String JSON_PROPERTY_SEGMENT_PREFIX_LENGTH = "segmentPrefixLength";
  private Integer segmentPrefixLength;

  public static final String JSON_PROPERTY_MIN_PREFIX_LENGTH_FOR_BLOCK = "minPrefixLengthForBlock";
  private Integer minPrefixLengthForBlock;

  public static final String JSON_PROPERTY_MAX_VALUE = "maxValue";
  private Long maxValue;

  public static final String JSON_PROPERTY_IPV6 = "ipv6";
  private Boolean ipv6;

  public static final String JSON_PROPERTY_MULTIPLE = "multiple";
  private Boolean multiple;

  public static final String JSON_PROPERTY_MAX_SEGMENT_VALUE = "maxSegmentValue";
  private Integer maxSegmentValue;

  public static final String JSON_PROPERTY_BYTES = "bytes";
  private List<byte[]> bytes = new ArrayList<>();

  public static final String JSON_PROPERTY_ZERO = "zero";
  private Boolean zero;

  public static final String JSON_PROPERTY_BYTE_COUNT = "byteCount";
  private Integer byteCount;

  public static final String JSON_PROPERTY_BIT_COUNT = "bitCount";
  private Integer bitCount;

  public static final String JSON_PROPERTY_PREFIX_LENGTH_FOR_SINGLE_BLOCK = "prefixLengthForSingleBlock";
  private Integer prefixLengthForSingleBlock;

  public static final String JSON_PROPERTY_FULL_RANGE = "fullRange";
  private Boolean fullRange;

  public static final String JSON_PROPERTY_MAX = "max";
  private Boolean max;

  public static final String JSON_PROPERTY_STRING = "string";
  private String string;

  public static final String JSON_PROPERTY_DIVISION_PREFIX_LENGTH = "divisionPrefixLength";
  private Integer divisionPrefixLength;

  public static final String JSON_PROPERTY_WILDCARD_STRING = "wildcardString";
  private String wildcardString;

  public static final String JSON_PROPERTY_PREFIXED = "prefixed";
  private Boolean prefixed;

  public static final String JSON_PROPERTY_SINGLE_PREFIX_BLOCK = "singlePrefixBlock";
  private Boolean singlePrefixBlock;

  public IPAddressSegment() { 
  }

  public IPAddressSegment upperBytes(List<byte[]> upperBytes) {
    this.upperBytes = upperBytes;
    return this;
  }

  public IPAddressSegment addUpperBytesItem(byte[] upperBytesItem) {
    if (this.upperBytes == null) {
      this.upperBytes = new ArrayList<>();
    }
    this.upperBytes.add(upperBytesItem);
    return this;
  }

   /**
   * Get upperBytes
   * @return upperBytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<byte[]> getUpperBytes() {
    return upperBytes;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperBytes(List<byte[]> upperBytes) {
    this.upperBytes = upperBytes;
  }


  public IPAddressSegment value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  public IPAddressSegment upperValue(Integer upperValue) {
    this.upperValue = upperValue;
    return this;
  }

   /**
   * Get upperValue
   * @return upperValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpperValue() {
    return upperValue;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperValue(Integer upperValue) {
    this.upperValue = upperValue;
  }


  public IPAddressSegment count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public IPAddressSegment lower(IPAddressSegment lower) {
    this.lower = lower;
    return this;
  }

   /**
   * Get lower
   * @return lower
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPAddressSegment getLower() {
    return lower;
  }


  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLower(IPAddressSegment lower) {
    this.lower = lower;
  }


  public IPAddressSegment upper(IPAddressSegment upper) {
    this.upper = upper;
    return this;
  }

   /**
   * Get upper
   * @return upper
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPAddressSegment getUpper() {
    return upper;
  }


  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpper(IPAddressSegment upper) {
    this.upper = upper;
  }


  public IPAddressSegment upperSegmentValue(Integer upperSegmentValue) {
    this.upperSegmentValue = upperSegmentValue;
    return this;
  }

   /**
   * Get upperSegmentValue
   * @return upperSegmentValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_SEGMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpperSegmentValue() {
    return upperSegmentValue;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_SEGMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperSegmentValue(Integer upperSegmentValue) {
    this.upperSegmentValue = upperSegmentValue;
  }


  public IPAddressSegment upperDivisionValue(Long upperDivisionValue) {
    this.upperDivisionValue = upperDivisionValue;
    return this;
  }

   /**
   * Get upperDivisionValue
   * @return upperDivisionValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_DIVISION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpperDivisionValue() {
    return upperDivisionValue;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_DIVISION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperDivisionValue(Long upperDivisionValue) {
    this.upperDivisionValue = upperDivisionValue;
  }


  public IPAddressSegment divisionValue(Long divisionValue) {
    this.divisionValue = divisionValue;
    return this;
  }

   /**
   * Get divisionValue
   * @return divisionValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIVISION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDivisionValue() {
    return divisionValue;
  }


  @JsonProperty(JSON_PROPERTY_DIVISION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivisionValue(Long divisionValue) {
    this.divisionValue = divisionValue;
  }


  public IPAddressSegment valueCount(Integer valueCount) {
    this.valueCount = valueCount;
    return this;
  }

   /**
   * Get valueCount
   * @return valueCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValueCount() {
    return valueCount;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueCount(Integer valueCount) {
    this.valueCount = valueCount;
  }


  public IPAddressSegment prefixValueCount(Integer prefixValueCount) {
    this.prefixValueCount = prefixValueCount;
    return this;
  }

   /**
   * Get prefixValueCount
   * @return prefixValueCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_VALUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrefixValueCount() {
    return prefixValueCount;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_VALUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixValueCount(Integer prefixValueCount) {
    this.prefixValueCount = prefixValueCount;
  }


  public IPAddressSegment ipv4(Boolean ipv4) {
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


  public IPAddressSegment segmentValue(Integer segmentValue) {
    this.segmentValue = segmentValue;
    return this;
  }

   /**
   * Get segmentValue
   * @return segmentValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSegmentValue() {
    return segmentValue;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentValue(Integer segmentValue) {
    this.segmentValue = segmentValue;
  }


  public IPAddressSegment network(IPAddressNetworkObjectObjectObjectObjectObject network) {
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


  public IPAddressSegment iterable(Object iterable) {
    this.iterable = iterable;
    return this;
  }

   /**
   * Get iterable
   * @return iterable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getIterable() {
    return iterable;
  }


  @JsonProperty(JSON_PROPERTY_ITERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIterable(Object iterable) {
    this.iterable = iterable;
  }


  public IPAddressSegment ipversion(IpversionEnum ipversion) {
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


  public IPAddressSegment prefixBlock(Boolean prefixBlock) {
    this.prefixBlock = prefixBlock;
    return this;
  }

   /**
   * Get prefixBlock
   * @return prefixBlock
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrefixBlock() {
    return prefixBlock;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixBlock(Boolean prefixBlock) {
    this.prefixBlock = prefixBlock;
  }


  public IPAddressSegment segmentPrefixLength(Integer segmentPrefixLength) {
    this.segmentPrefixLength = segmentPrefixLength;
    return this;
  }

   /**
   * Get segmentPrefixLength
   * @return segmentPrefixLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSegmentPrefixLength() {
    return segmentPrefixLength;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentPrefixLength(Integer segmentPrefixLength) {
    this.segmentPrefixLength = segmentPrefixLength;
  }


  public IPAddressSegment minPrefixLengthForBlock(Integer minPrefixLengthForBlock) {
    this.minPrefixLengthForBlock = minPrefixLengthForBlock;
    return this;
  }

   /**
   * Get minPrefixLengthForBlock
   * @return minPrefixLengthForBlock
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_PREFIX_LENGTH_FOR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinPrefixLengthForBlock() {
    return minPrefixLengthForBlock;
  }


  @JsonProperty(JSON_PROPERTY_MIN_PREFIX_LENGTH_FOR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinPrefixLengthForBlock(Integer minPrefixLengthForBlock) {
    this.minPrefixLengthForBlock = minPrefixLengthForBlock;
  }


  public IPAddressSegment maxValue(Long maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Get maxValue
   * @return maxValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxValue() {
    return maxValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxValue(Long maxValue) {
    this.maxValue = maxValue;
  }


  public IPAddressSegment ipv6(Boolean ipv6) {
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


  public IPAddressSegment multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

   /**
   * Get multiple
   * @return multiple
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiple() {
    return multiple;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }


  public IPAddressSegment maxSegmentValue(Integer maxSegmentValue) {
    this.maxSegmentValue = maxSegmentValue;
    return this;
  }

   /**
   * Get maxSegmentValue
   * @return maxSegmentValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SEGMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSegmentValue() {
    return maxSegmentValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SEGMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSegmentValue(Integer maxSegmentValue) {
    this.maxSegmentValue = maxSegmentValue;
  }


  public IPAddressSegment bytes(List<byte[]> bytes) {
    this.bytes = bytes;
    return this;
  }

  public IPAddressSegment addBytesItem(byte[] bytesItem) {
    if (this.bytes == null) {
      this.bytes = new ArrayList<>();
    }
    this.bytes.add(bytesItem);
    return this;
  }

   /**
   * Get bytes
   * @return bytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<byte[]> getBytes() {
    return bytes;
  }


  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBytes(List<byte[]> bytes) {
    this.bytes = bytes;
  }


  public IPAddressSegment zero(Boolean zero) {
    this.zero = zero;
    return this;
  }

   /**
   * Get zero
   * @return zero
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getZero() {
    return zero;
  }


  @JsonProperty(JSON_PROPERTY_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZero(Boolean zero) {
    this.zero = zero;
  }


  public IPAddressSegment byteCount(Integer byteCount) {
    this.byteCount = byteCount;
    return this;
  }

   /**
   * Get byteCount
   * @return byteCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getByteCount() {
    return byteCount;
  }


  @JsonProperty(JSON_PROPERTY_BYTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setByteCount(Integer byteCount) {
    this.byteCount = byteCount;
  }


  public IPAddressSegment bitCount(Integer bitCount) {
    this.bitCount = bitCount;
    return this;
  }

   /**
   * Get bitCount
   * @return bitCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBitCount() {
    return bitCount;
  }


  @JsonProperty(JSON_PROPERTY_BIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBitCount(Integer bitCount) {
    this.bitCount = bitCount;
  }


  public IPAddressSegment prefixLengthForSingleBlock(Integer prefixLengthForSingleBlock) {
    this.prefixLengthForSingleBlock = prefixLengthForSingleBlock;
    return this;
  }

   /**
   * Get prefixLengthForSingleBlock
   * @return prefixLengthForSingleBlock
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_LENGTH_FOR_SINGLE_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrefixLengthForSingleBlock() {
    return prefixLengthForSingleBlock;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_LENGTH_FOR_SINGLE_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixLengthForSingleBlock(Integer prefixLengthForSingleBlock) {
    this.prefixLengthForSingleBlock = prefixLengthForSingleBlock;
  }


  public IPAddressSegment fullRange(Boolean fullRange) {
    this.fullRange = fullRange;
    return this;
  }

   /**
   * Get fullRange
   * @return fullRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFullRange() {
    return fullRange;
  }


  @JsonProperty(JSON_PROPERTY_FULL_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullRange(Boolean fullRange) {
    this.fullRange = fullRange;
  }


  public IPAddressSegment max(Boolean max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(Boolean max) {
    this.max = max;
  }


  public IPAddressSegment string(String string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getString() {
    return string;
  }


  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setString(String string) {
    this.string = string;
  }


  public IPAddressSegment divisionPrefixLength(Integer divisionPrefixLength) {
    this.divisionPrefixLength = divisionPrefixLength;
    return this;
  }

   /**
   * Get divisionPrefixLength
   * @return divisionPrefixLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIVISION_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDivisionPrefixLength() {
    return divisionPrefixLength;
  }


  @JsonProperty(JSON_PROPERTY_DIVISION_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivisionPrefixLength(Integer divisionPrefixLength) {
    this.divisionPrefixLength = divisionPrefixLength;
  }


  public IPAddressSegment wildcardString(String wildcardString) {
    this.wildcardString = wildcardString;
    return this;
  }

   /**
   * Get wildcardString
   * @return wildcardString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WILDCARD_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWildcardString() {
    return wildcardString;
  }


  @JsonProperty(JSON_PROPERTY_WILDCARD_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWildcardString(String wildcardString) {
    this.wildcardString = wildcardString;
  }


  public IPAddressSegment prefixed(Boolean prefixed) {
    this.prefixed = prefixed;
    return this;
  }

   /**
   * Get prefixed
   * @return prefixed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrefixed() {
    return prefixed;
  }


  @JsonProperty(JSON_PROPERTY_PREFIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixed(Boolean prefixed) {
    this.prefixed = prefixed;
  }


  public IPAddressSegment singlePrefixBlock(Boolean singlePrefixBlock) {
    this.singlePrefixBlock = singlePrefixBlock;
    return this;
  }

   /**
   * Get singlePrefixBlock
   * @return singlePrefixBlock
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINGLE_PREFIX_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSinglePrefixBlock() {
    return singlePrefixBlock;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_PREFIX_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSinglePrefixBlock(Boolean singlePrefixBlock) {
    this.singlePrefixBlock = singlePrefixBlock;
  }


  /**
   * Return true if this IPAddressSegment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressSegment ipAddressSegment = (IPAddressSegment) o;
    return Objects.equals(this.upperBytes, ipAddressSegment.upperBytes) &&
        Objects.equals(this.value, ipAddressSegment.value) &&
        Objects.equals(this.upperValue, ipAddressSegment.upperValue) &&
        Objects.equals(this.count, ipAddressSegment.count) &&
        Objects.equals(this.lower, ipAddressSegment.lower) &&
        Objects.equals(this.upper, ipAddressSegment.upper) &&
        Objects.equals(this.upperSegmentValue, ipAddressSegment.upperSegmentValue) &&
        Objects.equals(this.upperDivisionValue, ipAddressSegment.upperDivisionValue) &&
        Objects.equals(this.divisionValue, ipAddressSegment.divisionValue) &&
        Objects.equals(this.valueCount, ipAddressSegment.valueCount) &&
        Objects.equals(this.prefixValueCount, ipAddressSegment.prefixValueCount) &&
        Objects.equals(this.ipv4, ipAddressSegment.ipv4) &&
        Objects.equals(this.segmentValue, ipAddressSegment.segmentValue) &&
        Objects.equals(this.network, ipAddressSegment.network) &&
        Objects.equals(this.iterable, ipAddressSegment.iterable) &&
        Objects.equals(this.ipversion, ipAddressSegment.ipversion) &&
        Objects.equals(this.prefixBlock, ipAddressSegment.prefixBlock) &&
        Objects.equals(this.segmentPrefixLength, ipAddressSegment.segmentPrefixLength) &&
        Objects.equals(this.minPrefixLengthForBlock, ipAddressSegment.minPrefixLengthForBlock) &&
        Objects.equals(this.maxValue, ipAddressSegment.maxValue) &&
        Objects.equals(this.ipv6, ipAddressSegment.ipv6) &&
        Objects.equals(this.multiple, ipAddressSegment.multiple) &&
        Objects.equals(this.maxSegmentValue, ipAddressSegment.maxSegmentValue) &&
        Objects.equals(this.bytes, ipAddressSegment.bytes) &&
        Objects.equals(this.zero, ipAddressSegment.zero) &&
        Objects.equals(this.byteCount, ipAddressSegment.byteCount) &&
        Objects.equals(this.bitCount, ipAddressSegment.bitCount) &&
        Objects.equals(this.prefixLengthForSingleBlock, ipAddressSegment.prefixLengthForSingleBlock) &&
        Objects.equals(this.fullRange, ipAddressSegment.fullRange) &&
        Objects.equals(this.max, ipAddressSegment.max) &&
        Objects.equals(this.string, ipAddressSegment.string) &&
        Objects.equals(this.divisionPrefixLength, ipAddressSegment.divisionPrefixLength) &&
        Objects.equals(this.wildcardString, ipAddressSegment.wildcardString) &&
        Objects.equals(this.prefixed, ipAddressSegment.prefixed) &&
        Objects.equals(this.singlePrefixBlock, ipAddressSegment.singlePrefixBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upperBytes, value, upperValue, count, lower, upper, upperSegmentValue, upperDivisionValue, divisionValue, valueCount, prefixValueCount, ipv4, segmentValue, network, iterable, ipversion, prefixBlock, segmentPrefixLength, minPrefixLengthForBlock, maxValue, ipv6, multiple, maxSegmentValue, bytes, zero, byteCount, bitCount, prefixLengthForSingleBlock, fullRange, max, string, divisionPrefixLength, wildcardString, prefixed, singlePrefixBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressSegment {\n");
    sb.append("    upperBytes: ").append(toIndentedString(upperBytes)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    upperValue: ").append(toIndentedString(upperValue)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
    sb.append("    upperSegmentValue: ").append(toIndentedString(upperSegmentValue)).append("\n");
    sb.append("    upperDivisionValue: ").append(toIndentedString(upperDivisionValue)).append("\n");
    sb.append("    divisionValue: ").append(toIndentedString(divisionValue)).append("\n");
    sb.append("    valueCount: ").append(toIndentedString(valueCount)).append("\n");
    sb.append("    prefixValueCount: ").append(toIndentedString(prefixValueCount)).append("\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    segmentValue: ").append(toIndentedString(segmentValue)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    iterable: ").append(toIndentedString(iterable)).append("\n");
    sb.append("    ipversion: ").append(toIndentedString(ipversion)).append("\n");
    sb.append("    prefixBlock: ").append(toIndentedString(prefixBlock)).append("\n");
    sb.append("    segmentPrefixLength: ").append(toIndentedString(segmentPrefixLength)).append("\n");
    sb.append("    minPrefixLengthForBlock: ").append(toIndentedString(minPrefixLengthForBlock)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    maxSegmentValue: ").append(toIndentedString(maxSegmentValue)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
    sb.append("    byteCount: ").append(toIndentedString(byteCount)).append("\n");
    sb.append("    bitCount: ").append(toIndentedString(bitCount)).append("\n");
    sb.append("    prefixLengthForSingleBlock: ").append(toIndentedString(prefixLengthForSingleBlock)).append("\n");
    sb.append("    fullRange: ").append(toIndentedString(fullRange)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    divisionPrefixLength: ").append(toIndentedString(divisionPrefixLength)).append("\n");
    sb.append("    wildcardString: ").append(toIndentedString(wildcardString)).append("\n");
    sb.append("    prefixed: ").append(toIndentedString(prefixed)).append("\n");
    sb.append("    singlePrefixBlock: ").append(toIndentedString(singlePrefixBlock)).append("\n");
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

