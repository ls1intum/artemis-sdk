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
import de.tum.cit.ase.artemis.sdk.model.User;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Organization
 */
@JsonPropertyOrder({
  Organization.JSON_PROPERTY_ID,
  Organization.JSON_PROPERTY_NAME,
  Organization.JSON_PROPERTY_SHORT_NAME,
  Organization.JSON_PROPERTY_URL,
  Organization.JSON_PROPERTY_DESCRIPTION,
  Organization.JSON_PROPERTY_LOGO_URL,
  Organization.JSON_PROPERTY_EMAIL_PATTERN,
  Organization.JSON_PROPERTY_USERS,
  Organization.JSON_PROPERTY_COURSES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class Organization {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private String shortName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LOGO_URL = "logoUrl";
  private String logoUrl;

  public static final String JSON_PROPERTY_EMAIL_PATTERN = "emailPattern";
  private String emailPattern;

  public static final String JSON_PROPERTY_USERS = "users";
  private Set<User> users;

  public static final String JSON_PROPERTY_COURSES = "courses";
  private Set<Course> courses;

  public Organization() { 
  }

  public Organization id(Long id) {
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


  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Organization shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShortName() {
    return shortName;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public Organization url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Organization description(String description) {
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


  public Organization logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public Organization emailPattern(String emailPattern) {
    this.emailPattern = emailPattern;
    return this;
  }

   /**
   * Get emailPattern
   * @return emailPattern
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailPattern() {
    return emailPattern;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailPattern(String emailPattern) {
    this.emailPattern = emailPattern;
  }


  public Organization users(Set<User> users) {
    this.users = users;
    return this;
  }

  public Organization addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new LinkedHashSet<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<User> getUsers() {
    return users;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(Set<User> users) {
    this.users = users;
  }


  public Organization courses(Set<Course> courses) {
    this.courses = courses;
    return this;
  }

  public Organization addCoursesItem(Course coursesItem) {
    if (this.courses == null) {
      this.courses = new LinkedHashSet<>();
    }
    this.courses.add(coursesItem);
    return this;
  }

   /**
   * Get courses
   * @return courses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Course> getCourses() {
    return courses;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_COURSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourses(Set<Course> courses) {
    this.courses = courses;
  }


  /**
   * Return true if this Organization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.shortName, organization.shortName) &&
        Objects.equals(this.url, organization.url) &&
        Objects.equals(this.description, organization.description) &&
        Objects.equals(this.logoUrl, organization.logoUrl) &&
        Objects.equals(this.emailPattern, organization.emailPattern) &&
        Objects.equals(this.users, organization.users) &&
        Objects.equals(this.courses, organization.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, url, description, logoUrl, emailPattern, users, courses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    emailPattern: ").append(toIndentedString(emailPattern)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
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

