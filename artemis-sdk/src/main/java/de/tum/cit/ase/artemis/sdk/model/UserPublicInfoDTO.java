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
 * UserPublicInfoDTO
 */
@JsonPropertyOrder({
  UserPublicInfoDTO.JSON_PROPERTY_ID,
  UserPublicInfoDTO.JSON_PROPERTY_LOGIN,
  UserPublicInfoDTO.JSON_PROPERTY_NAME,
  UserPublicInfoDTO.JSON_PROPERTY_FIRST_NAME,
  UserPublicInfoDTO.JSON_PROPERTY_LAST_NAME,
  UserPublicInfoDTO.JSON_PROPERTY_IS_INSTRUCTOR,
  UserPublicInfoDTO.JSON_PROPERTY_IS_EDITOR,
  UserPublicInfoDTO.JSON_PROPERTY_IS_TEACHING_ASSISTANT,
  UserPublicInfoDTO.JSON_PROPERTY_IS_STUDENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class UserPublicInfoDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_IS_INSTRUCTOR = "isInstructor";
  private Boolean isInstructor;

  public static final String JSON_PROPERTY_IS_EDITOR = "isEditor";
  private Boolean isEditor;

  public static final String JSON_PROPERTY_IS_TEACHING_ASSISTANT = "isTeachingAssistant";
  private Boolean isTeachingAssistant;

  public static final String JSON_PROPERTY_IS_STUDENT = "isStudent";
  private Boolean isStudent;

  public UserPublicInfoDTO() { 
  }

  public UserPublicInfoDTO id(Long id) {
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


  public UserPublicInfoDTO login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogin() {
    return login;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogin(String login) {
    this.login = login;
  }


  public UserPublicInfoDTO name(String name) {
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


  public UserPublicInfoDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserPublicInfoDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserPublicInfoDTO isInstructor(Boolean isInstructor) {
    this.isInstructor = isInstructor;
    return this;
  }

   /**
   * Get isInstructor
   * @return isInstructor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_INSTRUCTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsInstructor() {
    return isInstructor;
  }


  @JsonProperty(JSON_PROPERTY_IS_INSTRUCTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsInstructor(Boolean isInstructor) {
    this.isInstructor = isInstructor;
  }


  public UserPublicInfoDTO isEditor(Boolean isEditor) {
    this.isEditor = isEditor;
    return this;
  }

   /**
   * Get isEditor
   * @return isEditor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EDITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEditor() {
    return isEditor;
  }


  @JsonProperty(JSON_PROPERTY_IS_EDITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEditor(Boolean isEditor) {
    this.isEditor = isEditor;
  }


  public UserPublicInfoDTO isTeachingAssistant(Boolean isTeachingAssistant) {
    this.isTeachingAssistant = isTeachingAssistant;
    return this;
  }

   /**
   * Get isTeachingAssistant
   * @return isTeachingAssistant
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TEACHING_ASSISTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTeachingAssistant() {
    return isTeachingAssistant;
  }


  @JsonProperty(JSON_PROPERTY_IS_TEACHING_ASSISTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTeachingAssistant(Boolean isTeachingAssistant) {
    this.isTeachingAssistant = isTeachingAssistant;
  }


  public UserPublicInfoDTO isStudent(Boolean isStudent) {
    this.isStudent = isStudent;
    return this;
  }

   /**
   * Get isStudent
   * @return isStudent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsStudent() {
    return isStudent;
  }


  @JsonProperty(JSON_PROPERTY_IS_STUDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStudent(Boolean isStudent) {
    this.isStudent = isStudent;
  }


  /**
   * Return true if this UserPublicInfoDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPublicInfoDTO userPublicInfoDTO = (UserPublicInfoDTO) o;
    return Objects.equals(this.id, userPublicInfoDTO.id) &&
        Objects.equals(this.login, userPublicInfoDTO.login) &&
        Objects.equals(this.name, userPublicInfoDTO.name) &&
        Objects.equals(this.firstName, userPublicInfoDTO.firstName) &&
        Objects.equals(this.lastName, userPublicInfoDTO.lastName) &&
        Objects.equals(this.isInstructor, userPublicInfoDTO.isInstructor) &&
        Objects.equals(this.isEditor, userPublicInfoDTO.isEditor) &&
        Objects.equals(this.isTeachingAssistant, userPublicInfoDTO.isTeachingAssistant) &&
        Objects.equals(this.isStudent, userPublicInfoDTO.isStudent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, name, firstName, lastName, isInstructor, isEditor, isTeachingAssistant, isStudent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPublicInfoDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    isInstructor: ").append(toIndentedString(isInstructor)).append("\n");
    sb.append("    isEditor: ").append(toIndentedString(isEditor)).append("\n");
    sb.append("    isTeachingAssistant: ").append(toIndentedString(isTeachingAssistant)).append("\n");
    sb.append("    isStudent: ").append(toIndentedString(isStudent)).append("\n");
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

