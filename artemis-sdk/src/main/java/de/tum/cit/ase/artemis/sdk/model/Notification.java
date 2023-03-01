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
import de.tum.cit.ase.artemis.sdk.model.GroupNotification;
import de.tum.cit.ase.artemis.sdk.model.NotificationTarget;
import de.tum.cit.ase.artemis.sdk.model.SingleUserNotification;
import de.tum.cit.ase.artemis.sdk.model.SystemNotification;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Notification
 */
@JsonPropertyOrder({
  Notification.JSON_PROPERTY_ID,
  Notification.JSON_PROPERTY_TITLE,
  Notification.JSON_PROPERTY_TEXT,
  Notification.JSON_PROPERTY_NOTIFICATION_DATE,
  Notification.JSON_PROPERTY_TARGET,
  Notification.JSON_PROPERTY_TARGET_TRANSIENT,
  Notification.JSON_PROPERTY_PRIORITY,
  Notification.JSON_PROPERTY_OUTDATED,
  Notification.JSON_PROPERTY_AUTHOR,
  Notification.JSON_PROPERTY_TRANSIENT_AND_STRING_TARGET,
  Notification.JSON_PROPERTY_NOTIFICATION_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
@JsonIgnoreProperties(
  value = "notificationType", // ignore manually set notificationType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the notificationType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "notificationType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = GroupNotification.class, name = "GroupNotification"),
  @JsonSubTypes.Type(value = SingleUserNotification.class, name = "SingleUserNotification"),
  @JsonSubTypes.Type(value = SystemNotification.class, name = "SystemNotification"),
})

public class Notification {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_NOTIFICATION_DATE = "notificationDate";
  private OffsetDateTime notificationDate;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TARGET_TRANSIENT = "targetTransient";
  private NotificationTarget targetTransient;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    PriorityEnum(String value) {
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
    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private PriorityEnum priority;

  public static final String JSON_PROPERTY_OUTDATED = "outdated";
  private Boolean outdated;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private User author;

  public static final String JSON_PROPERTY_TRANSIENT_AND_STRING_TARGET = "transientAndStringTarget";
  private NotificationTarget transientAndStringTarget;

  public static final String JSON_PROPERTY_NOTIFICATION_TYPE = "notificationType";
  private String notificationType;

  public Notification() { 
  }

  public Notification id(Long id) {
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


  public Notification title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public Notification text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public Notification notificationDate(OffsetDateTime notificationDate) {
    this.notificationDate = notificationDate;
    return this;
  }

   /**
   * Get notificationDate
   * @return notificationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getNotificationDate() {
    return notificationDate;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationDate(OffsetDateTime notificationDate) {
    this.notificationDate = notificationDate;
  }


  public Notification target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(String target) {
    this.target = target;
  }


  public Notification targetTransient(NotificationTarget targetTransient) {
    this.targetTransient = targetTransient;
    return this;
  }

   /**
   * Get targetTransient
   * @return targetTransient
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TRANSIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationTarget getTargetTransient() {
    return targetTransient;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TRANSIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetTransient(NotificationTarget targetTransient) {
    this.targetTransient = targetTransient;
  }


  public Notification priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriorityEnum getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  public Notification outdated(Boolean outdated) {
    this.outdated = outdated;
    return this;
  }

   /**
   * Get outdated
   * @return outdated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOutdated() {
    return outdated;
  }


  @JsonProperty(JSON_PROPERTY_OUTDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutdated(Boolean outdated) {
    this.outdated = outdated;
  }


  public Notification author(User author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(User author) {
    this.author = author;
  }


  public Notification transientAndStringTarget(NotificationTarget transientAndStringTarget) {
    this.transientAndStringTarget = transientAndStringTarget;
    return this;
  }

   /**
   * Get transientAndStringTarget
   * @return transientAndStringTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSIENT_AND_STRING_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationTarget getTransientAndStringTarget() {
    return transientAndStringTarget;
  }


  @JsonProperty(JSON_PROPERTY_TRANSIENT_AND_STRING_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransientAndStringTarget(NotificationTarget transientAndStringTarget) {
    this.transientAndStringTarget = transientAndStringTarget;
  }


  public Notification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotificationType() {
    return notificationType;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }


  /**
   * Return true if this Notification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.id, notification.id) &&
        Objects.equals(this.title, notification.title) &&
        Objects.equals(this.text, notification.text) &&
        Objects.equals(this.notificationDate, notification.notificationDate) &&
        Objects.equals(this.target, notification.target) &&
        Objects.equals(this.targetTransient, notification.targetTransient) &&
        Objects.equals(this.priority, notification.priority) &&
        Objects.equals(this.outdated, notification.outdated) &&
        Objects.equals(this.author, notification.author) &&
        Objects.equals(this.transientAndStringTarget, notification.transientAndStringTarget) &&
        Objects.equals(this.notificationType, notification.notificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, text, notificationDate, target, targetTransient, priority, outdated, author, transientAndStringTarget, notificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    notificationDate: ").append(toIndentedString(notificationDate)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetTransient: ").append(toIndentedString(targetTransient)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    outdated: ").append(toIndentedString(outdated)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    transientAndStringTarget: ").append(toIndentedString(transientAndStringTarget)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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
  mappings.put("GroupNotification", GroupNotification.class);
  mappings.put("SingleUserNotification", SingleUserNotification.class);
  mappings.put("SystemNotification", SystemNotification.class);
  mappings.put("Notification", Notification.class);
  JSON.registerDiscriminator(Notification.class, "notificationType", mappings);
}
}
