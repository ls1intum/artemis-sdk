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
 * SystemNotificationAllOf
 */
@JsonPropertyOrder({
  SystemNotificationAllOf.JSON_PROPERTY_EXPIRE_DATE,
  SystemNotificationAllOf.JSON_PROPERTY_TYPE
})
@JsonTypeName("SystemNotification_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class SystemNotificationAllOf {
  public static final String JSON_PROPERTY_EXPIRE_DATE = "expireDate";
  private OffsetDateTime expireDate;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    WARNING("WARNING"),
    
    INFO("INFO");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public SystemNotificationAllOf() { 
  }

  public SystemNotificationAllOf expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpireDate() {
    return expireDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }


  public SystemNotificationAllOf type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this SystemNotification_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemNotificationAllOf systemNotificationAllOf = (SystemNotificationAllOf) o;
    return Objects.equals(this.expireDate, systemNotificationAllOf.expireDate) &&
        Objects.equals(this.type, systemNotificationAllOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemNotificationAllOf {\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

