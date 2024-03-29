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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ExamUsersNotFoundDTO
 */
@JsonPropertyOrder({
  ExamUsersNotFoundDTO.JSON_PROPERTY_NUMBER_OF_USERS_NOT_FOUND,
  ExamUsersNotFoundDTO.JSON_PROPERTY_NUMBER_OF_IMAGES_SAVED,
  ExamUsersNotFoundDTO.JSON_PROPERTY_LIST_OF_EXAM_USER_REGISTRATION_NUMBERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ExamUsersNotFoundDTO {
  public static final String JSON_PROPERTY_NUMBER_OF_USERS_NOT_FOUND = "numberOfUsersNotFound";
  private Integer numberOfUsersNotFound;

  public static final String JSON_PROPERTY_NUMBER_OF_IMAGES_SAVED = "numberOfImagesSaved";
  private Integer numberOfImagesSaved;

  public static final String JSON_PROPERTY_LIST_OF_EXAM_USER_REGISTRATION_NUMBERS = "listOfExamUserRegistrationNumbers";
  private List<String> listOfExamUserRegistrationNumbers;

  public ExamUsersNotFoundDTO() { 
  }

  public ExamUsersNotFoundDTO numberOfUsersNotFound(Integer numberOfUsersNotFound) {
    this.numberOfUsersNotFound = numberOfUsersNotFound;
    return this;
  }

   /**
   * Get numberOfUsersNotFound
   * @return numberOfUsersNotFound
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_USERS_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfUsersNotFound() {
    return numberOfUsersNotFound;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_USERS_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfUsersNotFound(Integer numberOfUsersNotFound) {
    this.numberOfUsersNotFound = numberOfUsersNotFound;
  }


  public ExamUsersNotFoundDTO numberOfImagesSaved(Integer numberOfImagesSaved) {
    this.numberOfImagesSaved = numberOfImagesSaved;
    return this;
  }

   /**
   * Get numberOfImagesSaved
   * @return numberOfImagesSaved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_IMAGES_SAVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfImagesSaved() {
    return numberOfImagesSaved;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_IMAGES_SAVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfImagesSaved(Integer numberOfImagesSaved) {
    this.numberOfImagesSaved = numberOfImagesSaved;
  }


  public ExamUsersNotFoundDTO listOfExamUserRegistrationNumbers(List<String> listOfExamUserRegistrationNumbers) {
    this.listOfExamUserRegistrationNumbers = listOfExamUserRegistrationNumbers;
    return this;
  }

  public ExamUsersNotFoundDTO addListOfExamUserRegistrationNumbersItem(String listOfExamUserRegistrationNumbersItem) {
    if (this.listOfExamUserRegistrationNumbers == null) {
      this.listOfExamUserRegistrationNumbers = new ArrayList<>();
    }
    this.listOfExamUserRegistrationNumbers.add(listOfExamUserRegistrationNumbersItem);
    return this;
  }

   /**
   * Get listOfExamUserRegistrationNumbers
   * @return listOfExamUserRegistrationNumbers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_OF_EXAM_USER_REGISTRATION_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getListOfExamUserRegistrationNumbers() {
    return listOfExamUserRegistrationNumbers;
  }


  @JsonProperty(JSON_PROPERTY_LIST_OF_EXAM_USER_REGISTRATION_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListOfExamUserRegistrationNumbers(List<String> listOfExamUserRegistrationNumbers) {
    this.listOfExamUserRegistrationNumbers = listOfExamUserRegistrationNumbers;
  }


  /**
   * Return true if this ExamUsersNotFoundDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExamUsersNotFoundDTO examUsersNotFoundDTO = (ExamUsersNotFoundDTO) o;
    return Objects.equals(this.numberOfUsersNotFound, examUsersNotFoundDTO.numberOfUsersNotFound) &&
        Objects.equals(this.numberOfImagesSaved, examUsersNotFoundDTO.numberOfImagesSaved) &&
        Objects.equals(this.listOfExamUserRegistrationNumbers, examUsersNotFoundDTO.listOfExamUserRegistrationNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfUsersNotFound, numberOfImagesSaved, listOfExamUserRegistrationNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamUsersNotFoundDTO {\n");
    sb.append("    numberOfUsersNotFound: ").append(toIndentedString(numberOfUsersNotFound)).append("\n");
    sb.append("    numberOfImagesSaved: ").append(toIndentedString(numberOfImagesSaved)).append("\n");
    sb.append("    listOfExamUserRegistrationNumbers: ").append(toIndentedString(listOfExamUserRegistrationNumbers)).append("\n");
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

