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
 * ChannelAllOf
 */
@JsonPropertyOrder({
  ChannelAllOf.JSON_PROPERTY_NAME,
  ChannelAllOf.JSON_PROPERTY_DESCRIPTION,
  ChannelAllOf.JSON_PROPERTY_TOPIC,
  ChannelAllOf.JSON_PROPERTY_IS_PUBLIC,
  ChannelAllOf.JSON_PROPERTY_IS_ANNOUNCEMENT_CHANNEL,
  ChannelAllOf.JSON_PROPERTY_IS_ARCHIVED
})
@JsonTypeName("Channel_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ChannelAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_IS_ANNOUNCEMENT_CHANNEL = "isAnnouncementChannel";
  private Boolean isAnnouncementChannel;

  public static final String JSON_PROPERTY_IS_ARCHIVED = "isArchived";
  private Boolean isArchived;

  public ChannelAllOf() { 
  }

  public ChannelAllOf name(String name) {
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


  public ChannelAllOf description(String description) {
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


  public ChannelAllOf topic(String topic) {
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


  public ChannelAllOf isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public ChannelAllOf isAnnouncementChannel(Boolean isAnnouncementChannel) {
    this.isAnnouncementChannel = isAnnouncementChannel;
    return this;
  }

   /**
   * Get isAnnouncementChannel
   * @return isAnnouncementChannel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ANNOUNCEMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnnouncementChannel() {
    return isAnnouncementChannel;
  }


  @JsonProperty(JSON_PROPERTY_IS_ANNOUNCEMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAnnouncementChannel(Boolean isAnnouncementChannel) {
    this.isAnnouncementChannel = isAnnouncementChannel;
  }


  public ChannelAllOf isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Get isArchived
   * @return isArchived
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsArchived() {
    return isArchived;
  }


  @JsonProperty(JSON_PROPERTY_IS_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  /**
   * Return true if this Channel_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelAllOf channelAllOf = (ChannelAllOf) o;
    return Objects.equals(this.name, channelAllOf.name) &&
        Objects.equals(this.description, channelAllOf.description) &&
        Objects.equals(this.topic, channelAllOf.topic) &&
        Objects.equals(this.isPublic, channelAllOf.isPublic) &&
        Objects.equals(this.isAnnouncementChannel, channelAllOf.isAnnouncementChannel) &&
        Objects.equals(this.isArchived, channelAllOf.isArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, topic, isPublic, isAnnouncementChannel, isArchived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isAnnouncementChannel: ").append(toIndentedString(isAnnouncementChannel)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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
