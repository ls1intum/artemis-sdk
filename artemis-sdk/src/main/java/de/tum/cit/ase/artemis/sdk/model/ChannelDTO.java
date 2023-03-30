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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.tum.cit.ase.artemis.sdk.model.ConversationDTO;
import de.tum.cit.ase.artemis.sdk.model.ConversationUserDTO;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * ChannelDTO
 */
@JsonPropertyOrder({
  ChannelDTO.JSON_PROPERTY_NAME,
  ChannelDTO.JSON_PROPERTY_DESCRIPTION,
  ChannelDTO.JSON_PROPERTY_TOPIC,
  ChannelDTO.JSON_PROPERTY_IS_PUBLIC,
  ChannelDTO.JSON_PROPERTY_IS_ANNOUNCEMENT_CHANNEL,
  ChannelDTO.JSON_PROPERTY_IS_ARCHIVED,
  ChannelDTO.JSON_PROPERTY_HAS_CHANNEL_MODERATION_RIGHTS,
  ChannelDTO.JSON_PROPERTY_IS_CHANNEL_MODERATOR,
  ChannelDTO.JSON_PROPERTY_TUTORIAL_GROUP_ID,
  ChannelDTO.JSON_PROPERTY_TUTORIAL_GROUP_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ChannelDTO extends ConversationDTO {
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

  public static final String JSON_PROPERTY_HAS_CHANNEL_MODERATION_RIGHTS = "hasChannelModerationRights";
  private Boolean hasChannelModerationRights;

  public static final String JSON_PROPERTY_IS_CHANNEL_MODERATOR = "isChannelModerator";
  private Boolean isChannelModerator;

  public static final String JSON_PROPERTY_TUTORIAL_GROUP_ID = "tutorialGroupId";
  private Long tutorialGroupId;

  public static final String JSON_PROPERTY_TUTORIAL_GROUP_TITLE = "tutorialGroupTitle";
  private String tutorialGroupTitle;

  public ChannelDTO() { 
  }

  public ChannelDTO name(String name) {
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


  public ChannelDTO description(String description) {
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


  public ChannelDTO topic(String topic) {
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


  public ChannelDTO isPublic(Boolean isPublic) {
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


  public ChannelDTO isAnnouncementChannel(Boolean isAnnouncementChannel) {
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


  public ChannelDTO isArchived(Boolean isArchived) {
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


  public ChannelDTO hasChannelModerationRights(Boolean hasChannelModerationRights) {
    this.hasChannelModerationRights = hasChannelModerationRights;
    return this;
  }

   /**
   * Get hasChannelModerationRights
   * @return hasChannelModerationRights
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_CHANNEL_MODERATION_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasChannelModerationRights() {
    return hasChannelModerationRights;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CHANNEL_MODERATION_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasChannelModerationRights(Boolean hasChannelModerationRights) {
    this.hasChannelModerationRights = hasChannelModerationRights;
  }


  public ChannelDTO isChannelModerator(Boolean isChannelModerator) {
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


  public ChannelDTO tutorialGroupId(Long tutorialGroupId) {
    this.tutorialGroupId = tutorialGroupId;
    return this;
  }

   /**
   * Get tutorialGroupId
   * @return tutorialGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTutorialGroupId() {
    return tutorialGroupId;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorialGroupId(Long tutorialGroupId) {
    this.tutorialGroupId = tutorialGroupId;
  }


  public ChannelDTO tutorialGroupTitle(String tutorialGroupTitle) {
    this.tutorialGroupTitle = tutorialGroupTitle;
    return this;
  }

   /**
   * Get tutorialGroupTitle
   * @return tutorialGroupTitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTutorialGroupTitle() {
    return tutorialGroupTitle;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorialGroupTitle(String tutorialGroupTitle) {
    this.tutorialGroupTitle = tutorialGroupTitle;
  }


  /**
   * Return true if this ChannelDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDTO channelDTO = (ChannelDTO) o;
    return Objects.equals(this.name, channelDTO.name) &&
        Objects.equals(this.description, channelDTO.description) &&
        Objects.equals(this.topic, channelDTO.topic) &&
        Objects.equals(this.isPublic, channelDTO.isPublic) &&
        Objects.equals(this.isAnnouncementChannel, channelDTO.isAnnouncementChannel) &&
        Objects.equals(this.isArchived, channelDTO.isArchived) &&
        Objects.equals(this.hasChannelModerationRights, channelDTO.hasChannelModerationRights) &&
        Objects.equals(this.isChannelModerator, channelDTO.isChannelModerator) &&
        Objects.equals(this.tutorialGroupId, channelDTO.tutorialGroupId) &&
        Objects.equals(this.tutorialGroupTitle, channelDTO.tutorialGroupTitle) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, topic, isPublic, isAnnouncementChannel, isArchived, hasChannelModerationRights, isChannelModerator, tutorialGroupId, tutorialGroupTitle, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isAnnouncementChannel: ").append(toIndentedString(isAnnouncementChannel)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    hasChannelModerationRights: ").append(toIndentedString(hasChannelModerationRights)).append("\n");
    sb.append("    isChannelModerator: ").append(toIndentedString(isChannelModerator)).append("\n");
    sb.append("    tutorialGroupId: ").append(toIndentedString(tutorialGroupId)).append("\n");
    sb.append("    tutorialGroupTitle: ").append(toIndentedString(tutorialGroupTitle)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("ChannelDTO", ChannelDTO.class);
  JSON.registerDiscriminator(ChannelDTO.class, "type", mappings);
}
}

