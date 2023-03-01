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
 * AuxiliaryRepository
 */
@JsonPropertyOrder({
  AuxiliaryRepository.JSON_PROPERTY_ID,
  AuxiliaryRepository.JSON_PROPERTY_NAME,
  AuxiliaryRepository.JSON_PROPERTY_REPOSITORY_URL,
  AuxiliaryRepository.JSON_PROPERTY_CHECKOUT_DIRECTORY,
  AuxiliaryRepository.JSON_PROPERTY_DESCRIPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class AuxiliaryRepository {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repositoryUrl";
  private String repositoryUrl;

  public static final String JSON_PROPERTY_CHECKOUT_DIRECTORY = "checkoutDirectory";
  private String checkoutDirectory;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public AuxiliaryRepository() { 
  }

  public AuxiliaryRepository id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public AuxiliaryRepository name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AuxiliaryRepository repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepositoryUrl() {
    return repositoryUrl;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public AuxiliaryRepository checkoutDirectory(String checkoutDirectory) {
    this.checkoutDirectory = checkoutDirectory;
    return this;
  }

   /**
   * Get checkoutDirectory
   * @return checkoutDirectory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutDirectory() {
    return checkoutDirectory;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutDirectory(String checkoutDirectory) {
    this.checkoutDirectory = checkoutDirectory;
  }


  public AuxiliaryRepository description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this AuxiliaryRepository object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuxiliaryRepository auxiliaryRepository = (AuxiliaryRepository) o;
    return Objects.equals(this.id, auxiliaryRepository.id) &&
        Objects.equals(this.name, auxiliaryRepository.name) &&
        Objects.equals(this.repositoryUrl, auxiliaryRepository.repositoryUrl) &&
        Objects.equals(this.checkoutDirectory, auxiliaryRepository.checkoutDirectory) &&
        Objects.equals(this.description, auxiliaryRepository.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, repositoryUrl, checkoutDirectory, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxiliaryRepository {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    checkoutDirectory: ").append(toIndentedString(checkoutDirectory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
