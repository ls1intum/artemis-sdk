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
 * ConversationUserDTO
 */
@JsonPropertyOrder({
  ConversationUserDTO.JSON_PROPERTY_ID,
  ConversationUserDTO.JSON_PROPERTY_LOGIN,
  ConversationUserDTO.JSON_PROPERTY_NAME,
  ConversationUserDTO.JSON_PROPERTY_FIRST_NAME,
  ConversationUserDTO.JSON_PROPERTY_LAST_NAME,
  ConversationUserDTO.JSON_PROPERTY_IS_INSTRUCTOR,
  ConversationUserDTO.JSON_PROPERTY_IS_EDITOR,
  ConversationUserDTO.JSON_PROPERTY_IS_TEACHING_ASSISTANT,
  ConversationUserDTO.JSON_PROPERTY_IS_STUDENT,
  ConversationUserDTO.JSON_PROPERTY_IS_CHANNEL_MODERATOR,
  ConversationUserDTO.JSON_PROPERTY_IS_REQUESTING_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class ConversationUserDTO {
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

  public static final String JSON_PROPERTY_IS_CHANNEL_MODERATOR = "isChannelModerator";
  private Boolean isChannelModerator;

  public static final String JSON_PROPERTY_IS_REQUESTING_USER = "isRequestingUser";
  private Boolean isRequestingUser;

  public ConversationUserDTO() { 
  }

  public ConversationUserDTO id(Long id) {
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


  public ConversationUserDTO login(String login) {
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


  public ConversationUserDTO name(String name) {
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


  public ConversationUserDTO firstName(String firstName) {
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


  public ConversationUserDTO lastName(String lastName) {
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


  public ConversationUserDTO isInstructor(Boolean isInstructor) {
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


  public ConversationUserDTO isEditor(Boolean isEditor) {
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


  public ConversationUserDTO isTeachingAssistant(Boolean isTeachingAssistant) {
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


  public ConversationUserDTO isStudent(Boolean isStudent) {
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


  public ConversationUserDTO isChannelModerator(Boolean isChannelModerator) {
    this.isChannelModerator = isChannelModerator;
    return this;
  }

   /**
   * Get isChannelModerator
   * @return isChannelModerator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CHANNEL_MODERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsChannelModerator() {
    return isChannelModerator;
  }


  @JsonProperty(JSON_PROPERTY_IS_CHANNEL_MODERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsChannelModerator(Boolean isChannelModerator) {
    this.isChannelModerator = isChannelModerator;
  }


  public ConversationUserDTO isRequestingUser(Boolean isRequestingUser) {
    this.isRequestingUser = isRequestingUser;
    return this;
  }

   /**
   * Get isRequestingUser
   * @return isRequestingUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REQUESTING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRequestingUser() {
    return isRequestingUser;
  }


  @JsonProperty(JSON_PROPERTY_IS_REQUESTING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRequestingUser(Boolean isRequestingUser) {
    this.isRequestingUser = isRequestingUser;
  }


  /**
   * Return true if this ConversationUserDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationUserDTO conversationUserDTO = (ConversationUserDTO) o;
    return Objects.equals(this.id, conversationUserDTO.id) &&
        Objects.equals(this.login, conversationUserDTO.login) &&
        Objects.equals(this.name, conversationUserDTO.name) &&
        Objects.equals(this.firstName, conversationUserDTO.firstName) &&
        Objects.equals(this.lastName, conversationUserDTO.lastName) &&
        Objects.equals(this.isInstructor, conversationUserDTO.isInstructor) &&
        Objects.equals(this.isEditor, conversationUserDTO.isEditor) &&
        Objects.equals(this.isTeachingAssistant, conversationUserDTO.isTeachingAssistant) &&
        Objects.equals(this.isStudent, conversationUserDTO.isStudent) &&
        Objects.equals(this.isChannelModerator, conversationUserDTO.isChannelModerator) &&
        Objects.equals(this.isRequestingUser, conversationUserDTO.isRequestingUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, name, firstName, lastName, isInstructor, isEditor, isTeachingAssistant, isStudent, isChannelModerator, isRequestingUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationUserDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    isInstructor: ").append(toIndentedString(isInstructor)).append("\n");
    sb.append("    isEditor: ").append(toIndentedString(isEditor)).append("\n");
    sb.append("    isTeachingAssistant: ").append(toIndentedString(isTeachingAssistant)).append("\n");
    sb.append("    isStudent: ").append(toIndentedString(isStudent)).append("\n");
    sb.append("    isChannelModerator: ").append(toIndentedString(isChannelModerator)).append("\n");
    sb.append("    isRequestingUser: ").append(toIndentedString(isRequestingUser)).append("\n");
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

