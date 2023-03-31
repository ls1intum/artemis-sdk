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
import de.tum.cit.ase.artemis.sdk.model.Post;
import de.tum.cit.ase.artemis.sdk.model.Reaction;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * AnswerPost
 */
@JsonPropertyOrder({
  AnswerPost.JSON_PROPERTY_ID,
  AnswerPost.JSON_PROPERTY_CREATION_DATE,
  AnswerPost.JSON_PROPERTY_CONTENT,
  AnswerPost.JSON_PROPERTY_TOKENIZED_CONTENT,
  AnswerPost.JSON_PROPERTY_RESOLVES_POST,
  AnswerPost.JSON_PROPERTY_REACTIONS,
  AnswerPost.JSON_PROPERTY_POST,
  AnswerPost.JSON_PROPERTY_COURSE_POSTING_BELONGS_TO,
  AnswerPost.JSON_PROPERTY_AUTHOR_ROLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class AnswerPost {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_TOKENIZED_CONTENT = "tokenizedContent";
  private String tokenizedContent;

  public static final String JSON_PROPERTY_RESOLVES_POST = "resolvesPost";
  private Boolean resolvesPost;

  public static final String JSON_PROPERTY_REACTIONS = "reactions";
  private Set<Reaction> reactions;

  public static final String JSON_PROPERTY_POST = "post";
  private Post post;

  public static final String JSON_PROPERTY_COURSE_POSTING_BELONGS_TO = "coursePostingBelongsTo";
  private Course coursePostingBelongsTo;

  /**
   * Gets or Sets authorRole
   */
  public enum AuthorRoleEnum {
    INSTRUCTOR("INSTRUCTOR"),
    
    TUTOR("TUTOR"),
    
    USER("USER");

    private String value;

    AuthorRoleEnum(String value) {
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
    public static AuthorRoleEnum fromValue(String value) {
      for (AuthorRoleEnum b : AuthorRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTHOR_ROLE = "authorRole";
  private AuthorRoleEnum authorRole;

  public AnswerPost() { 
  }

  public AnswerPost id(Long id) {
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


  public AnswerPost creationDate(OffsetDateTime creationDate) {
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


  public AnswerPost content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public AnswerPost tokenizedContent(String tokenizedContent) {
    this.tokenizedContent = tokenizedContent;
    return this;
  }

   /**
   * Get tokenizedContent
   * @return tokenizedContent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKENIZED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenizedContent() {
    return tokenizedContent;
  }


  @JsonProperty(JSON_PROPERTY_TOKENIZED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenizedContent(String tokenizedContent) {
    this.tokenizedContent = tokenizedContent;
  }


  public AnswerPost resolvesPost(Boolean resolvesPost) {
    this.resolvesPost = resolvesPost;
    return this;
  }

   /**
   * Get resolvesPost
   * @return resolvesPost
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVES_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResolvesPost() {
    return resolvesPost;
  }


  @JsonProperty(JSON_PROPERTY_RESOLVES_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolvesPost(Boolean resolvesPost) {
    this.resolvesPost = resolvesPost;
  }


  public AnswerPost reactions(Set<Reaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public AnswerPost addReactionsItem(Reaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new LinkedHashSet<>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Reaction> getReactions() {
    return reactions;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_REACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReactions(Set<Reaction> reactions) {
    this.reactions = reactions;
  }


  public AnswerPost post(Post post) {
    this.post = post;
    return this;
  }

   /**
   * Get post
   * @return post
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Post getPost() {
    return post;
  }


  @JsonProperty(JSON_PROPERTY_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPost(Post post) {
    this.post = post;
  }


  public AnswerPost coursePostingBelongsTo(Course coursePostingBelongsTo) {
    this.coursePostingBelongsTo = coursePostingBelongsTo;
    return this;
  }

   /**
   * Get coursePostingBelongsTo
   * @return coursePostingBelongsTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_POSTING_BELONGS_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Course getCoursePostingBelongsTo() {
    return coursePostingBelongsTo;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_POSTING_BELONGS_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoursePostingBelongsTo(Course coursePostingBelongsTo) {
    this.coursePostingBelongsTo = coursePostingBelongsTo;
  }


  public AnswerPost authorRole(AuthorRoleEnum authorRole) {
    this.authorRole = authorRole;
    return this;
  }

   /**
   * Get authorRole
   * @return authorRole
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorRoleEnum getAuthorRole() {
    return authorRole;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorRole(AuthorRoleEnum authorRole) {
    this.authorRole = authorRole;
  }


  /**
   * Return true if this AnswerPost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerPost answerPost = (AnswerPost) o;
    return Objects.equals(this.id, answerPost.id) &&
        Objects.equals(this.creationDate, answerPost.creationDate) &&
        Objects.equals(this.content, answerPost.content) &&
        Objects.equals(this.tokenizedContent, answerPost.tokenizedContent) &&
        Objects.equals(this.resolvesPost, answerPost.resolvesPost) &&
        Objects.equals(this.reactions, answerPost.reactions) &&
        Objects.equals(this.post, answerPost.post) &&
        Objects.equals(this.coursePostingBelongsTo, answerPost.coursePostingBelongsTo) &&
        Objects.equals(this.authorRole, answerPost.authorRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, content, tokenizedContent, resolvesPost, reactions, post, coursePostingBelongsTo, authorRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerPost {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tokenizedContent: ").append(toIndentedString(tokenizedContent)).append("\n");
    sb.append("    resolvesPost: ").append(toIndentedString(resolvesPost)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    coursePostingBelongsTo: ").append(toIndentedString(coursePostingBelongsTo)).append("\n");
    sb.append("    authorRole: ").append(toIndentedString(authorRole)).append("\n");
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

