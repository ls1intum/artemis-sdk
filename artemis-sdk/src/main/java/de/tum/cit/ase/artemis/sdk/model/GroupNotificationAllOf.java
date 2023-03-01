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
import de.tum.cit.ase.artemis.sdk.model.Course;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * GroupNotificationAllOf
 */
@JsonPropertyOrder({
  GroupNotificationAllOf.JSON_PROPERTY_TYPE,
  GroupNotificationAllOf.JSON_PROPERTY_COURSE,
  GroupNotificationAllOf.JSON_PROPERTY_TOPIC
})
@JsonTypeName("GroupNotification_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class GroupNotificationAllOf {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    INSTRUCTOR("INSTRUCTOR"),
    
    EDITOR("EDITOR"),
    
    TA("TA"),
    
    STUDENT("STUDENT");

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

  public static final String JSON_PROPERTY_COURSE = "course";
  private Course course;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public GroupNotificationAllOf() { 
  }

  public GroupNotificationAllOf type(TypeEnum type) {
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


  public GroupNotificationAllOf course(Course course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Course getCourse() {
    return course;
  }


  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourse(Course course) {
    this.course = course;
  }


  public GroupNotificationAllOf topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  /**
   * Return true if this GroupNotification_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupNotificationAllOf groupNotificationAllOf = (GroupNotificationAllOf) o;
    return Objects.equals(this.type, groupNotificationAllOf.type) &&
        Objects.equals(this.course, groupNotificationAllOf.course) &&
        Objects.equals(this.topic, groupNotificationAllOf.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, course, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupNotificationAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
