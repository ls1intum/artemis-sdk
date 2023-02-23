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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupSchedule;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupSession;
import de.tum.cit.ase.artemis.sdk.model.User;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * TutorialGroup
 */
@JsonPropertyOrder({
  TutorialGroup.JSON_PROPERTY_ID,
  TutorialGroup.JSON_PROPERTY_COURSE,
  TutorialGroup.JSON_PROPERTY_TITLE,
  TutorialGroup.JSON_PROPERTY_ADDITIONAL_INFORMATION,
  TutorialGroup.JSON_PROPERTY_CAPACITY,
  TutorialGroup.JSON_PROPERTY_IS_ONLINE,
  TutorialGroup.JSON_PROPERTY_CAMPUS,
  TutorialGroup.JSON_PROPERTY_LANGUAGE,
  TutorialGroup.JSON_PROPERTY_TEACHING_ASSISTANT,
  TutorialGroup.JSON_PROPERTY_IS_USER_REGISTERED,
  TutorialGroup.JSON_PROPERTY_IS_USER_TUTOR,
  TutorialGroup.JSON_PROPERTY_NUMBER_OF_REGISTERED_USERS,
  TutorialGroup.JSON_PROPERTY_TEACHING_ASSISTANT_NAME,
  TutorialGroup.JSON_PROPERTY_COURSE_TITLE,
  TutorialGroup.JSON_PROPERTY_NEXT_SESSION,
  TutorialGroup.JSON_PROPERTY_TUTORIAL_GROUP_SCHEDULE,
  TutorialGroup.JSON_PROPERTY_TUTORIAL_GROUP_SESSIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TutorialGroup {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_COURSE = "course";
  private Course course;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ADDITIONAL_INFORMATION = "additionalInformation";
  private String additionalInformation;

  public static final String JSON_PROPERTY_CAPACITY = "capacity";
  private Integer capacity;

  public static final String JSON_PROPERTY_IS_ONLINE = "isOnline";
  private Boolean isOnline;

  public static final String JSON_PROPERTY_CAMPUS = "campus";
  private String campus;

  /**
   * Gets or Sets language
   */
  public enum LanguageEnum {
    ENGLISH("ENGLISH"),
    
    GERMAN("GERMAN");

    private String value;

    LanguageEnum(String value) {
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
    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private LanguageEnum language;

  public static final String JSON_PROPERTY_TEACHING_ASSISTANT = "teachingAssistant";
  private User teachingAssistant;

  public static final String JSON_PROPERTY_IS_USER_REGISTERED = "isUserRegistered";
  private Boolean isUserRegistered;

  public static final String JSON_PROPERTY_IS_USER_TUTOR = "isUserTutor";
  private Boolean isUserTutor;

  public static final String JSON_PROPERTY_NUMBER_OF_REGISTERED_USERS = "numberOfRegisteredUsers";
  private Integer numberOfRegisteredUsers;

  public static final String JSON_PROPERTY_TEACHING_ASSISTANT_NAME = "teachingAssistantName";
  private String teachingAssistantName;

  public static final String JSON_PROPERTY_COURSE_TITLE = "courseTitle";
  private String courseTitle;

  public static final String JSON_PROPERTY_NEXT_SESSION = "nextSession";
  private TutorialGroupSession nextSession;

  public static final String JSON_PROPERTY_TUTORIAL_GROUP_SCHEDULE = "tutorialGroupSchedule";
  private TutorialGroupSchedule tutorialGroupSchedule;

  public static final String JSON_PROPERTY_TUTORIAL_GROUP_SESSIONS = "tutorialGroupSessions";
  private Set<TutorialGroupSession> tutorialGroupSessions = new LinkedHashSet<>();

  public TutorialGroup() { 
  }

  public TutorialGroup id(Long id) {
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


  public TutorialGroup course(Course course) {
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


  public TutorialGroup title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public TutorialGroup additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalInformation() {
    return additionalInformation;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public TutorialGroup capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * minimum: 1
   * @return capacity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCapacity() {
    return capacity;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public TutorialGroup isOnline(Boolean isOnline) {
    this.isOnline = isOnline;
    return this;
  }

   /**
   * Get isOnline
   * @return isOnline
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_ONLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsOnline() {
    return isOnline;
  }


  @JsonProperty(JSON_PROPERTY_IS_ONLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
  }


  public TutorialGroup campus(String campus) {
    this.campus = campus;
    return this;
  }

   /**
   * Get campus
   * @return campus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampus() {
    return campus;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampus(String campus) {
    this.campus = campus;
  }


  public TutorialGroup language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LanguageEnum getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  public TutorialGroup teachingAssistant(User teachingAssistant) {
    this.teachingAssistant = teachingAssistant;
    return this;
  }

   /**
   * Get teachingAssistant
   * @return teachingAssistant
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEACHING_ASSISTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getTeachingAssistant() {
    return teachingAssistant;
  }


  @JsonProperty(JSON_PROPERTY_TEACHING_ASSISTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeachingAssistant(User teachingAssistant) {
    this.teachingAssistant = teachingAssistant;
  }


  public TutorialGroup isUserRegistered(Boolean isUserRegistered) {
    this.isUserRegistered = isUserRegistered;
    return this;
  }

   /**
   * Get isUserRegistered
   * @return isUserRegistered
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_USER_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsUserRegistered() {
    return isUserRegistered;
  }


  @JsonProperty(JSON_PROPERTY_IS_USER_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsUserRegistered(Boolean isUserRegistered) {
    this.isUserRegistered = isUserRegistered;
  }


  public TutorialGroup isUserTutor(Boolean isUserTutor) {
    this.isUserTutor = isUserTutor;
    return this;
  }

   /**
   * Get isUserTutor
   * @return isUserTutor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_USER_TUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsUserTutor() {
    return isUserTutor;
  }


  @JsonProperty(JSON_PROPERTY_IS_USER_TUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsUserTutor(Boolean isUserTutor) {
    this.isUserTutor = isUserTutor;
  }


  public TutorialGroup numberOfRegisteredUsers(Integer numberOfRegisteredUsers) {
    this.numberOfRegisteredUsers = numberOfRegisteredUsers;
    return this;
  }

   /**
   * Get numberOfRegisteredUsers
   * @return numberOfRegisteredUsers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_REGISTERED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfRegisteredUsers() {
    return numberOfRegisteredUsers;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_REGISTERED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfRegisteredUsers(Integer numberOfRegisteredUsers) {
    this.numberOfRegisteredUsers = numberOfRegisteredUsers;
  }


  public TutorialGroup teachingAssistantName(String teachingAssistantName) {
    this.teachingAssistantName = teachingAssistantName;
    return this;
  }

   /**
   * Get teachingAssistantName
   * @return teachingAssistantName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEACHING_ASSISTANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeachingAssistantName() {
    return teachingAssistantName;
  }


  @JsonProperty(JSON_PROPERTY_TEACHING_ASSISTANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeachingAssistantName(String teachingAssistantName) {
    this.teachingAssistantName = teachingAssistantName;
  }


  public TutorialGroup courseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
    return this;
  }

   /**
   * Get courseTitle
   * @return courseTitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCourseTitle() {
    return courseTitle;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }


  public TutorialGroup nextSession(TutorialGroupSession nextSession) {
    this.nextSession = nextSession;
    return this;
  }

   /**
   * Get nextSession
   * @return nextSession
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TutorialGroupSession getNextSession() {
    return nextSession;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextSession(TutorialGroupSession nextSession) {
    this.nextSession = nextSession;
  }


  public TutorialGroup tutorialGroupSchedule(TutorialGroupSchedule tutorialGroupSchedule) {
    this.tutorialGroupSchedule = tutorialGroupSchedule;
    return this;
  }

   /**
   * Get tutorialGroupSchedule
   * @return tutorialGroupSchedule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TutorialGroupSchedule getTutorialGroupSchedule() {
    return tutorialGroupSchedule;
  }


  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorialGroupSchedule(TutorialGroupSchedule tutorialGroupSchedule) {
    this.tutorialGroupSchedule = tutorialGroupSchedule;
  }


  public TutorialGroup tutorialGroupSessions(Set<TutorialGroupSession> tutorialGroupSessions) {
    this.tutorialGroupSessions = tutorialGroupSessions;
    return this;
  }

  public TutorialGroup addTutorialGroupSessionsItem(TutorialGroupSession tutorialGroupSessionsItem) {
    if (this.tutorialGroupSessions == null) {
      this.tutorialGroupSessions = new LinkedHashSet<>();
    }
    this.tutorialGroupSessions.add(tutorialGroupSessionsItem);
    return this;
  }

   /**
   * Get tutorialGroupSessions
   * @return tutorialGroupSessions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TutorialGroupSession> getTutorialGroupSessions() {
    return tutorialGroupSessions;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TUTORIAL_GROUP_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTutorialGroupSessions(Set<TutorialGroupSession> tutorialGroupSessions) {
    this.tutorialGroupSessions = tutorialGroupSessions;
  }


  /**
   * Return true if this TutorialGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroup tutorialGroup = (TutorialGroup) o;
    return Objects.equals(this.id, tutorialGroup.id) &&
        Objects.equals(this.course, tutorialGroup.course) &&
        Objects.equals(this.title, tutorialGroup.title) &&
        Objects.equals(this.additionalInformation, tutorialGroup.additionalInformation) &&
        Objects.equals(this.capacity, tutorialGroup.capacity) &&
        Objects.equals(this.isOnline, tutorialGroup.isOnline) &&
        Objects.equals(this.campus, tutorialGroup.campus) &&
        Objects.equals(this.language, tutorialGroup.language) &&
        Objects.equals(this.teachingAssistant, tutorialGroup.teachingAssistant) &&
        Objects.equals(this.isUserRegistered, tutorialGroup.isUserRegistered) &&
        Objects.equals(this.isUserTutor, tutorialGroup.isUserTutor) &&
        Objects.equals(this.numberOfRegisteredUsers, tutorialGroup.numberOfRegisteredUsers) &&
        Objects.equals(this.teachingAssistantName, tutorialGroup.teachingAssistantName) &&
        Objects.equals(this.courseTitle, tutorialGroup.courseTitle) &&
        Objects.equals(this.nextSession, tutorialGroup.nextSession) &&
        Objects.equals(this.tutorialGroupSchedule, tutorialGroup.tutorialGroupSchedule) &&
        Objects.equals(this.tutorialGroupSessions, tutorialGroup.tutorialGroupSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, course, title, additionalInformation, capacity, isOnline, campus, language, teachingAssistant, isUserRegistered, isUserTutor, numberOfRegisteredUsers, teachingAssistantName, courseTitle, nextSession, tutorialGroupSchedule, tutorialGroupSessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    campus: ").append(toIndentedString(campus)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    teachingAssistant: ").append(toIndentedString(teachingAssistant)).append("\n");
    sb.append("    isUserRegistered: ").append(toIndentedString(isUserRegistered)).append("\n");
    sb.append("    isUserTutor: ").append(toIndentedString(isUserTutor)).append("\n");
    sb.append("    numberOfRegisteredUsers: ").append(toIndentedString(numberOfRegisteredUsers)).append("\n");
    sb.append("    teachingAssistantName: ").append(toIndentedString(teachingAssistantName)).append("\n");
    sb.append("    courseTitle: ").append(toIndentedString(courseTitle)).append("\n");
    sb.append("    nextSession: ").append(toIndentedString(nextSession)).append("\n");
    sb.append("    tutorialGroupSchedule: ").append(toIndentedString(tutorialGroupSchedule)).append("\n");
    sb.append("    tutorialGroupSessions: ").append(toIndentedString(tutorialGroupSessions)).append("\n");
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

