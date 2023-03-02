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
import de.tum.cit.ase.artemis.sdk.model.TutorialGroup;
import de.tum.cit.ase.artemis.sdk.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TutorialGroupRegistration
 */
@JsonPropertyOrder({
  TutorialGroupRegistration.JSON_PROPERTY_ID,
  TutorialGroupRegistration.JSON_PROPERTY_STUDENT,
  TutorialGroupRegistration.JSON_PROPERTY_TUTORIAL_GROUP,
  TutorialGroupRegistration.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class TutorialGroupRegistration {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STUDENT = "student";
  private User student;

  public static final String JSON_PROPERTY_TUTORIAL_GROUP = "tutorialGroup";
  private TutorialGroup tutorialGroup;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SELF_REGISTRATION("SELF_REGISTRATION"),
    
    INSTRUCTOR_REGISTRATION("INSTRUCTOR_REGISTRATION");

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

  public TutorialGroupRegistration() { 
  }

  public TutorialGroupRegistration id(Long id) {
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


  public TutorialGroupRegistration student(User student) {
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STUDENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public User getStudent() {
    return student;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStudent(User student) {
    this.student = student;
  }


  public TutorialGroupRegistration tutorialGroup(TutorialGroup tutorialGroup) {
    this.tutorialGroup = tutorialGroup;
    return this;
  }

   /**
   * Get tutorialGroup
   * @return tutorialGroup
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TutorialGroup getTutorialGroup() {
    return tutorialGroup;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTutorialGroup(TutorialGroup tutorialGroup) {
    this.tutorialGroup = tutorialGroup;
  }


  public TutorialGroupRegistration type(TypeEnum type) {
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
   * Return true if this TutorialGroupRegistration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupRegistration tutorialGroupRegistration = (TutorialGroupRegistration) o;
    return Objects.equals(this.id, tutorialGroupRegistration.id) &&
        Objects.equals(this.student, tutorialGroupRegistration.student) &&
        Objects.equals(this.tutorialGroup, tutorialGroupRegistration.tutorialGroup) &&
        Objects.equals(this.type, tutorialGroupRegistration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, student, tutorialGroup, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupRegistration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    tutorialGroup: ").append(toIndentedString(tutorialGroup)).append("\n");
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

