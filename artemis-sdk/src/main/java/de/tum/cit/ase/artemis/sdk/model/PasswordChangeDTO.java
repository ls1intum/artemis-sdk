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
 * PasswordChangeDTO
 */
@JsonPropertyOrder({
  PasswordChangeDTO.JSON_PROPERTY_CURRENT_PASSWORD,
  PasswordChangeDTO.JSON_PROPERTY_NEW_PASSWORD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class PasswordChangeDTO {
  public static final String JSON_PROPERTY_CURRENT_PASSWORD = "currentPassword";
  private String currentPassword;

  public static final String JSON_PROPERTY_NEW_PASSWORD = "newPassword";
  private String newPassword;

  public PasswordChangeDTO() { 
  }

  public PasswordChangeDTO currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * Get currentPassword
   * @return currentPassword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentPassword() {
    return currentPassword;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }


  public PasswordChangeDTO newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewPassword() {
    return newPassword;
  }


  @JsonProperty(JSON_PROPERTY_NEW_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  /**
   * Return true if this PasswordChangeDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChangeDTO passwordChangeDTO = (PasswordChangeDTO) o;
    return Objects.equals(this.currentPassword, passwordChangeDTO.currentPassword) &&
        Objects.equals(this.newPassword, passwordChangeDTO.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChangeDTO {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

