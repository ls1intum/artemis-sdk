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
import de.tum.cit.ase.artemis.sdk.model.AttachmentUnit;
import de.tum.cit.ase.artemis.sdk.model.GetExercise200Response;
import de.tum.cit.ase.artemis.sdk.model.Lecture;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Attachment
 */
@JsonPropertyOrder({
  Attachment.JSON_PROPERTY_ID,
  Attachment.JSON_PROPERTY_NAME,
  Attachment.JSON_PROPERTY_LINK,
  Attachment.JSON_PROPERTY_VERSION,
  Attachment.JSON_PROPERTY_UPLOAD_DATE,
  Attachment.JSON_PROPERTY_RELEASE_DATE,
  Attachment.JSON_PROPERTY_ATTACHMENT_TYPE,
  Attachment.JSON_PROPERTY_EXERCISE,
  Attachment.JSON_PROPERTY_LECTURE,
  Attachment.JSON_PROPERTY_ATTACHMENT_UNIT,
  Attachment.JSON_PROPERTY_VISIBLE_TO_STUDENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class Attachment {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_UPLOAD_DATE = "uploadDate";
  private OffsetDateTime uploadDate;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private OffsetDateTime releaseDate;

  /**
   * Gets or Sets attachmentType
   */
  public enum AttachmentTypeEnum {
    FILE("FILE"),
    
    URL("URL");

    private String value;

    AttachmentTypeEnum(String value) {
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
    public static AttachmentTypeEnum fromValue(String value) {
      for (AttachmentTypeEnum b : AttachmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ATTACHMENT_TYPE = "attachmentType";
  private AttachmentTypeEnum attachmentType;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private GetExercise200Response exercise;

  public static final String JSON_PROPERTY_LECTURE = "lecture";
  private Lecture lecture;

  public static final String JSON_PROPERTY_ATTACHMENT_UNIT = "attachmentUnit";
  private AttachmentUnit attachmentUnit;

  public static final String JSON_PROPERTY_VISIBLE_TO_STUDENTS = "visibleToStudents";
  private Boolean visibleToStudents;

  public Attachment() { 
  }

  public Attachment id(Long id) {
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


  public Attachment name(String name) {
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


  public Attachment link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  public Attachment version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public Attachment uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * Get uploadDate
   * @return uploadDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }


  public Attachment releaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public Attachment attachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * Get attachmentType
   * @return attachmentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }


  public Attachment exercise(GetExercise200Response exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetExercise200Response getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(GetExercise200Response exercise) {
    this.exercise = exercise;
  }


  public Attachment lecture(Lecture lecture) {
    this.lecture = lecture;
    return this;
  }

   /**
   * Get lecture
   * @return lecture
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Lecture getLecture() {
    return lecture;
  }


  @JsonProperty(JSON_PROPERTY_LECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLecture(Lecture lecture) {
    this.lecture = lecture;
  }


  public Attachment attachmentUnit(AttachmentUnit attachmentUnit) {
    this.attachmentUnit = attachmentUnit;
    return this;
  }

   /**
   * Get attachmentUnit
   * @return attachmentUnit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachmentUnit getAttachmentUnit() {
    return attachmentUnit;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentUnit(AttachmentUnit attachmentUnit) {
    this.attachmentUnit = attachmentUnit;
  }


  public Attachment visibleToStudents(Boolean visibleToStudents) {
    this.visibleToStudents = visibleToStudents;
    return this;
  }

   /**
   * Get visibleToStudents
   * @return visibleToStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_TO_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisibleToStudents() {
    return visibleToStudents;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_TO_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleToStudents(Boolean visibleToStudents) {
    this.visibleToStudents = visibleToStudents;
  }


  /**
   * Return true if this Attachment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.link, attachment.link) &&
        Objects.equals(this.version, attachment.version) &&
        Objects.equals(this.uploadDate, attachment.uploadDate) &&
        Objects.equals(this.releaseDate, attachment.releaseDate) &&
        Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.exercise, attachment.exercise) &&
        Objects.equals(this.lecture, attachment.lecture) &&
        Objects.equals(this.attachmentUnit, attachment.attachmentUnit) &&
        Objects.equals(this.visibleToStudents, attachment.visibleToStudents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, link, version, uploadDate, releaseDate, attachmentType, exercise, lecture, attachmentUnit, visibleToStudents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    lecture: ").append(toIndentedString(lecture)).append("\n");
    sb.append("    attachmentUnit: ").append(toIndentedString(attachmentUnit)).append("\n");
    sb.append("    visibleToStudents: ").append(toIndentedString(visibleToStudents)).append("\n");
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
