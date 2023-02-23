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
import de.tum.cit.ase.artemis.sdk.model.Notification;
import de.tum.cit.ase.artemis.sdk.model.NotificationTarget;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * SingleUserNotification
 */
@JsonPropertyOrder({
  SingleUserNotification.JSON_PROPERTY_RECIPIENT,
  SingleUserNotification.JSON_PROPERTY_TOPIC
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "notificationType", // ignore manually set notificationType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the notificationType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "notificationType", visible = true)

public class SingleUserNotification extends Notification {
  public static final String JSON_PROPERTY_RECIPIENT = "recipient";
  private User recipient;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public SingleUserNotification() { 
  }

  public SingleUserNotification recipient(User recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getRecipient() {
    return recipient;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipient(User recipient) {
    this.recipient = recipient;
  }


  public SingleUserNotification topic(String topic) {
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
   * Return true if this SingleUserNotification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleUserNotification singleUserNotification = (SingleUserNotification) o;
    return Objects.equals(this.recipient, singleUserNotification.recipient) &&
        Objects.equals(this.topic, singleUserNotification.topic) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, topic, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleUserNotification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("SingleUserNotification", SingleUserNotification.class);
  JSON.registerDiscriminator(SingleUserNotification.class, "notificationType", mappings);
}
}
