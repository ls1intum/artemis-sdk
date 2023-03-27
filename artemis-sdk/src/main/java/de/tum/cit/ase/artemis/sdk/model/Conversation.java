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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.ConversationParticipant;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Conversation
 */
@JsonPropertyOrder({
  Conversation.JSON_PROPERTY_ID,
  Conversation.JSON_PROPERTY_CREATOR,
  Conversation.JSON_PROPERTY_CONVERSATION_PARTICIPANTS,
  Conversation.JSON_PROPERTY_CREATION_DATE,
  Conversation.JSON_PROPERTY_LAST_MESSAGE_DATE,
  Conversation.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class Conversation {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private User creator;

  public static final String JSON_PROPERTY_CONVERSATION_PARTICIPANTS = "conversationParticipants";
  private Set<ConversationParticipant> conversationParticipants = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_LAST_MESSAGE_DATE = "lastMessageDate";
  private OffsetDateTime lastMessageDate;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Conversation() { 
  }

  public Conversation id(Long id) {
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


  public Conversation creator(User creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getCreator() {
    return creator;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreator(User creator) {
    this.creator = creator;
  }


  public Conversation conversationParticipants(Set<ConversationParticipant> conversationParticipants) {
    this.conversationParticipants = conversationParticipants;
    return this;
  }

  public Conversation addConversationParticipantsItem(ConversationParticipant conversationParticipantsItem) {
    if (this.conversationParticipants == null) {
      this.conversationParticipants = new LinkedHashSet<>();
    }
    this.conversationParticipants.add(conversationParticipantsItem);
    return this;
  }

   /**
   * Get conversationParticipants
   * @return conversationParticipants
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ConversationParticipant> getConversationParticipants() {
    return conversationParticipants;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_CONVERSATION_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationParticipants(Set<ConversationParticipant> conversationParticipants) {
    this.conversationParticipants = conversationParticipants;
  }


  public Conversation creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Conversation lastMessageDate(OffsetDateTime lastMessageDate) {
    this.lastMessageDate = lastMessageDate;
    return this;
  }

   /**
   * Get lastMessageDate
   * @return lastMessageDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MESSAGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastMessageDate() {
    return lastMessageDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MESSAGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMessageDate(OffsetDateTime lastMessageDate) {
    this.lastMessageDate = lastMessageDate;
  }


  public Conversation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this Conversation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.creator, conversation.creator) &&
        Objects.equals(this.conversationParticipants, conversation.conversationParticipants) &&
        Objects.equals(this.creationDate, conversation.creationDate) &&
        Objects.equals(this.lastMessageDate, conversation.lastMessageDate) &&
        Objects.equals(this.type, conversation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creator, conversationParticipants, creationDate, lastMessageDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    conversationParticipants: ").append(toIndentedString(conversationParticipants)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastMessageDate: ").append(toIndentedString(lastMessageDate)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("Conversation", Conversation.class);
  JSON.registerDiscriminator(Conversation.class, "type", mappings);
}
}

