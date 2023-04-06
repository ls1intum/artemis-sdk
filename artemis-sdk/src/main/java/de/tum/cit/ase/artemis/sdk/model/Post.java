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
import de.tum.cit.ase.artemis.sdk.model.AnswerPost;
import de.tum.cit.ase.artemis.sdk.model.Conversation;
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.Exercise;
import de.tum.cit.ase.artemis.sdk.model.Lecture;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismCase;
import de.tum.cit.ase.artemis.sdk.model.Reaction;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Post
 */
@JsonPropertyOrder({
  Post.JSON_PROPERTY_ID,
  Post.JSON_PROPERTY_CREATION_DATE,
  Post.JSON_PROPERTY_CONTENT,
  Post.JSON_PROPERTY_TOKENIZED_CONTENT,
  Post.JSON_PROPERTY_TITLE,
  Post.JSON_PROPERTY_VISIBLE_FOR_STUDENTS,
  Post.JSON_PROPERTY_REACTIONS,
  Post.JSON_PROPERTY_ANSWERS,
  Post.JSON_PROPERTY_TAGS,
  Post.JSON_PROPERTY_EXERCISE,
  Post.JSON_PROPERTY_LECTURE,
  Post.JSON_PROPERTY_COURSE,
  Post.JSON_PROPERTY_COURSE_WIDE_CONTEXT,
  Post.JSON_PROPERTY_CONVERSATION,
  Post.JSON_PROPERTY_DISPLAY_PRIORITY,
  Post.JSON_PROPERTY_PLAGIARISM_CASE,
  Post.JSON_PROPERTY_RESOLVED,
  Post.JSON_PROPERTY_ANSWER_COUNT,
  Post.JSON_PROPERTY_VOTE_COUNT,
  Post.JSON_PROPERTY_AUTHOR_ROLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class Post {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_TOKENIZED_CONTENT = "tokenizedContent";
  private String tokenizedContent;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VISIBLE_FOR_STUDENTS = "visibleForStudents";
  private Boolean visibleForStudents;

  public static final String JSON_PROPERTY_REACTIONS = "reactions";
  private Set<Reaction> reactions;

  public static final String JSON_PROPERTY_ANSWERS = "answers";
  private Set<AnswerPost> answers;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Set<String> tags;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private Exercise exercise;

  public static final String JSON_PROPERTY_LECTURE = "lecture";
  private Lecture lecture;

  public static final String JSON_PROPERTY_COURSE = "course";
  private Course course;

  /**
   * Gets or Sets courseWideContext
   */
  public enum CourseWideContextEnum {
    TECH_SUPPORT("TECH_SUPPORT"),
    
    ORGANIZATION("ORGANIZATION"),
    
    RANDOM("RANDOM"),
    
    ANNOUNCEMENT("ANNOUNCEMENT");

    private String value;

    CourseWideContextEnum(String value) {
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
    public static CourseWideContextEnum fromValue(String value) {
      for (CourseWideContextEnum b : CourseWideContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COURSE_WIDE_CONTEXT = "courseWideContext";
  private CourseWideContextEnum courseWideContext;

  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private Conversation conversation;

  /**
   * Gets or Sets displayPriority
   */
  public enum DisplayPriorityEnum {
    PINNED("PINNED"),
    
    ARCHIVED("ARCHIVED"),
    
    NONE("NONE");

    private String value;

    DisplayPriorityEnum(String value) {
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
    public static DisplayPriorityEnum fromValue(String value) {
      for (DisplayPriorityEnum b : DisplayPriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DISPLAY_PRIORITY = "displayPriority";
  private DisplayPriorityEnum displayPriority;

  public static final String JSON_PROPERTY_PLAGIARISM_CASE = "plagiarismCase";
  private PlagiarismCase plagiarismCase;

  public static final String JSON_PROPERTY_RESOLVED = "resolved";
  private Boolean resolved;

  public static final String JSON_PROPERTY_ANSWER_COUNT = "answerCount";
  private Integer answerCount;

  public static final String JSON_PROPERTY_VOTE_COUNT = "voteCount";
  private Integer voteCount;

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

  public Post() { 
  }

  public Post id(Long id) {
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


  public Post creationDate(OffsetDateTime creationDate) {
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


  public Post content(String content) {
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


  public Post tokenizedContent(String tokenizedContent) {
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


  public Post title(String title) {
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


  public Post visibleForStudents(Boolean visibleForStudents) {
    this.visibleForStudents = visibleForStudents;
    return this;
  }

   /**
   * Get visibleForStudents
   * @return visibleForStudents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_FOR_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisibleForStudents() {
    return visibleForStudents;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_FOR_STUDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleForStudents(Boolean visibleForStudents) {
    this.visibleForStudents = visibleForStudents;
  }


  public Post reactions(Set<Reaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public Post addReactionsItem(Reaction reactionsItem) {
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


  public Post answers(Set<AnswerPost> answers) {
    this.answers = answers;
    return this;
  }

  public Post addAnswersItem(AnswerPost answersItem) {
    if (this.answers == null) {
      this.answers = new LinkedHashSet<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<AnswerPost> getAnswers() {
    return answers;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswers(Set<AnswerPost> answers) {
    this.answers = answers;
  }


  public Post tags(Set<String> tags) {
    this.tags = tags;
    return this;
  }

  public Post addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getTags() {
    return tags;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public Post exercise(Exercise exercise) {
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

  public Exercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public Post lecture(Lecture lecture) {
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


  public Post course(Course course) {
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


  public Post courseWideContext(CourseWideContextEnum courseWideContext) {
    this.courseWideContext = courseWideContext;
    return this;
  }

   /**
   * Get courseWideContext
   * @return courseWideContext
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_WIDE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CourseWideContextEnum getCourseWideContext() {
    return courseWideContext;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_WIDE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseWideContext(CourseWideContextEnum courseWideContext) {
    this.courseWideContext = courseWideContext;
  }


  public Post conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * Get conversation
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Conversation getConversation() {
    return conversation;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }


  public Post displayPriority(DisplayPriorityEnum displayPriority) {
    this.displayPriority = displayPriority;
    return this;
  }

   /**
   * Get displayPriority
   * @return displayPriority
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayPriorityEnum getDisplayPriority() {
    return displayPriority;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayPriority(DisplayPriorityEnum displayPriority) {
    this.displayPriority = displayPriority;
  }


  public Post plagiarismCase(PlagiarismCase plagiarismCase) {
    this.plagiarismCase = plagiarismCase;
    return this;
  }

   /**
   * Get plagiarismCase
   * @return plagiarismCase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAGIARISM_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlagiarismCase getPlagiarismCase() {
    return plagiarismCase;
  }


  @JsonProperty(JSON_PROPERTY_PLAGIARISM_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlagiarismCase(PlagiarismCase plagiarismCase) {
    this.plagiarismCase = plagiarismCase;
  }


  public Post resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

   /**
   * Get resolved
   * @return resolved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResolved() {
    return resolved;
  }


  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }


  public Post answerCount(Integer answerCount) {
    this.answerCount = answerCount;
    return this;
  }

   /**
   * Get answerCount
   * @return answerCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnswerCount() {
    return answerCount;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswerCount(Integer answerCount) {
    this.answerCount = answerCount;
  }


  public Post voteCount(Integer voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteCount() {
    return voteCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  public Post authorRole(AuthorRoleEnum authorRole) {
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
   * Return true if this Post object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(this.id, post.id) &&
        Objects.equals(this.creationDate, post.creationDate) &&
        Objects.equals(this.content, post.content) &&
        Objects.equals(this.tokenizedContent, post.tokenizedContent) &&
        Objects.equals(this.title, post.title) &&
        Objects.equals(this.visibleForStudents, post.visibleForStudents) &&
        Objects.equals(this.reactions, post.reactions) &&
        Objects.equals(this.answers, post.answers) &&
        Objects.equals(this.tags, post.tags) &&
        Objects.equals(this.exercise, post.exercise) &&
        Objects.equals(this.lecture, post.lecture) &&
        Objects.equals(this.course, post.course) &&
        Objects.equals(this.courseWideContext, post.courseWideContext) &&
        Objects.equals(this.conversation, post.conversation) &&
        Objects.equals(this.displayPriority, post.displayPriority) &&
        Objects.equals(this.plagiarismCase, post.plagiarismCase) &&
        Objects.equals(this.resolved, post.resolved) &&
        Objects.equals(this.answerCount, post.answerCount) &&
        Objects.equals(this.voteCount, post.voteCount) &&
        Objects.equals(this.authorRole, post.authorRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, content, tokenizedContent, title, visibleForStudents, reactions, answers, tags, exercise, lecture, course, courseWideContext, conversation, displayPriority, plagiarismCase, resolved, answerCount, voteCount, authorRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tokenizedContent: ").append(toIndentedString(tokenizedContent)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibleForStudents: ").append(toIndentedString(visibleForStudents)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    lecture: ").append(toIndentedString(lecture)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    courseWideContext: ").append(toIndentedString(courseWideContext)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    plagiarismCase: ").append(toIndentedString(plagiarismCase)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    answerCount: ").append(toIndentedString(answerCount)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

