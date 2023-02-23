package model;

import model.Exam;
import model.OnlineCourseConfiguration;
import model.Organization;
import model.TutorialGroupsConfiguration;
import model.Post;
import model.TutorialGroup;
import model.Lecture;
import model.GetExercise200Response;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Course
 */
public class Course {

  private Long id;
  private String title;
  private String description;
  private String shortName;
  private String studentGroupName;
  private String teachingAssistantGroupName;
  private String editorGroupName;
  private String instructorGroupName;
  private OffsetDateTime startDate;
  private OffsetDateTime endDate;
  private String semester;

  private Boolean testCourse;

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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private LanguageEnum language;

  /**
   * Gets or Sets defaultProgrammingLanguage
   */

  public enum DefaultProgrammingLanguageEnum {
    JAVA("JAVA"),
    
    PYTHON("PYTHON"),
    
    C("C"),
    
    HASKELL("HASKELL"),
    
    KOTLIN("KOTLIN"),
    
    VHDL("VHDL"),
    
    ASSEMBLER("ASSEMBLER"),
    
    SWIFT("SWIFT"),
    
    OCAML("OCAML"),
    
    EMPTY("EMPTY");

    private String value;

    DefaultProgrammingLanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultProgrammingLanguageEnum fromValue(String value) {
      for (DefaultProgrammingLanguageEnum b : DefaultProgrammingLanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DefaultProgrammingLanguageEnum defaultProgrammingLanguage;
  private Boolean onlineCourse;
  private OnlineCourseConfiguration onlineCourseConfiguration;
  private Integer maxComplaints;
  private Integer maxTeamComplaints;
  private Integer maxComplaintTimeDays;
  private Integer maxRequestMoreFeedbackTimeDays;
  private Integer maxComplaintTextLimit;
  private Integer maxComplaintResponseTextLimit;
  private Boolean postsEnabled;
  private Set<Post> posts = new LinkedHashSet<>();
  private String color;
  private String courseIcon;
  private Boolean registrationEnabled;
  private String registrationConfirmationMessage;
  private Integer presentationScore;
  private String courseArchivePath;
  private Integer maxPoints;
  private Integer accuracyOfScores;
  private String timeZone;
  private Set<GetExercise200Response> exercises = new LinkedHashSet<>();
  private Set<Lecture> lectures = new LinkedHashSet<>();
  private Set<TutorialGroup> tutorialGroups = new LinkedHashSet<>();
  private Set<Exam> exams = new LinkedHashSet<>();
  private Set<Organization> organizations = new LinkedHashSet<>();
  private TutorialGroupsConfiguration tutorialGroupsConfiguration;
  private Boolean requestMoreFeedbackEnabled;
  private Boolean complaintsEnabled;
  private Boolean validStartAndEndDate;
  private Long numberOfInstructors;
  private Long numberOfTeachingAssistants;
  private Long numberOfEditors;
  private Long numberOfStudents;

  public Course() {
  }

  public Course id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Course title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Course description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Course shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/


  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public Course studentGroupName(String studentGroupName) {
    
    this.studentGroupName = studentGroupName;
    return this;
  }

   /**
   * Get studentGroupName
   * @return studentGroupName
  **/


  public String getStudentGroupName() {
    return studentGroupName;
  }


  public void setStudentGroupName(String studentGroupName) {
    this.studentGroupName = studentGroupName;
  }


  public Course teachingAssistantGroupName(String teachingAssistantGroupName) {
    
    this.teachingAssistantGroupName = teachingAssistantGroupName;
    return this;
  }

   /**
   * Get teachingAssistantGroupName
   * @return teachingAssistantGroupName
  **/


  public String getTeachingAssistantGroupName() {
    return teachingAssistantGroupName;
  }


  public void setTeachingAssistantGroupName(String teachingAssistantGroupName) {
    this.teachingAssistantGroupName = teachingAssistantGroupName;
  }


  public Course editorGroupName(String editorGroupName) {
    
    this.editorGroupName = editorGroupName;
    return this;
  }

   /**
   * Get editorGroupName
   * @return editorGroupName
  **/


  public String getEditorGroupName() {
    return editorGroupName;
  }


  public void setEditorGroupName(String editorGroupName) {
    this.editorGroupName = editorGroupName;
  }


  public Course instructorGroupName(String instructorGroupName) {
    
    this.instructorGroupName = instructorGroupName;
    return this;
  }

   /**
   * Get instructorGroupName
   * @return instructorGroupName
  **/


  public String getInstructorGroupName() {
    return instructorGroupName;
  }


  public void setInstructorGroupName(String instructorGroupName) {
    this.instructorGroupName = instructorGroupName;
  }


  public Course startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/


  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Course endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/


  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Course semester(String semester) {
    
    this.semester = semester;
    return this;
  }

   /**
   * Get semester
   * @return semester
  **/


  public String getSemester() {
    return semester;
  }


  public void setSemester(String semester) {
    this.semester = semester;
  }


  public Course testCourse(Boolean testCourse) {
    
    this.testCourse = testCourse;
    return this;
  }

   /**
   * Get testCourse
   * @return testCourse
  **/


  public Boolean getTestCourse() {
    return testCourse;
  }


  public void setTestCourse(Boolean testCourse) {
    this.testCourse = testCourse;
  }


  public Course language(LanguageEnum language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/


  public LanguageEnum getLanguage() {
    return language;
  }


  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  public Course defaultProgrammingLanguage(DefaultProgrammingLanguageEnum defaultProgrammingLanguage) {
    
    this.defaultProgrammingLanguage = defaultProgrammingLanguage;
    return this;
  }

   /**
   * Get defaultProgrammingLanguage
   * @return defaultProgrammingLanguage
  **/


  public DefaultProgrammingLanguageEnum getDefaultProgrammingLanguage() {
    return defaultProgrammingLanguage;
  }


  public void setDefaultProgrammingLanguage(DefaultProgrammingLanguageEnum defaultProgrammingLanguage) {
    this.defaultProgrammingLanguage = defaultProgrammingLanguage;
  }


  public Course onlineCourse(Boolean onlineCourse) {
    
    this.onlineCourse = onlineCourse;
    return this;
  }

   /**
   * Get onlineCourse
   * @return onlineCourse
  **/


  public Boolean getOnlineCourse() {
    return onlineCourse;
  }


  public void setOnlineCourse(Boolean onlineCourse) {
    this.onlineCourse = onlineCourse;
  }


  public Course onlineCourseConfiguration(OnlineCourseConfiguration onlineCourseConfiguration) {
    
    this.onlineCourseConfiguration = onlineCourseConfiguration;
    return this;
  }

   /**
   * Get onlineCourseConfiguration
   * @return onlineCourseConfiguration
  **/


  public OnlineCourseConfiguration getOnlineCourseConfiguration() {
    return onlineCourseConfiguration;
  }


  public void setOnlineCourseConfiguration(OnlineCourseConfiguration onlineCourseConfiguration) {
    this.onlineCourseConfiguration = onlineCourseConfiguration;
  }


  public Course maxComplaints(Integer maxComplaints) {
    
    this.maxComplaints = maxComplaints;
    return this;
  }

   /**
   * Get maxComplaints
   * @return maxComplaints
  **/


  public Integer getMaxComplaints() {
    return maxComplaints;
  }


  public void setMaxComplaints(Integer maxComplaints) {
    this.maxComplaints = maxComplaints;
  }


  public Course maxTeamComplaints(Integer maxTeamComplaints) {
    
    this.maxTeamComplaints = maxTeamComplaints;
    return this;
  }

   /**
   * Get maxTeamComplaints
   * @return maxTeamComplaints
  **/


  public Integer getMaxTeamComplaints() {
    return maxTeamComplaints;
  }


  public void setMaxTeamComplaints(Integer maxTeamComplaints) {
    this.maxTeamComplaints = maxTeamComplaints;
  }


  public Course maxComplaintTimeDays(Integer maxComplaintTimeDays) {
    
    this.maxComplaintTimeDays = maxComplaintTimeDays;
    return this;
  }

   /**
   * Get maxComplaintTimeDays
   * @return maxComplaintTimeDays
  **/


  public Integer getMaxComplaintTimeDays() {
    return maxComplaintTimeDays;
  }


  public void setMaxComplaintTimeDays(Integer maxComplaintTimeDays) {
    this.maxComplaintTimeDays = maxComplaintTimeDays;
  }


  public Course maxRequestMoreFeedbackTimeDays(Integer maxRequestMoreFeedbackTimeDays) {
    
    this.maxRequestMoreFeedbackTimeDays = maxRequestMoreFeedbackTimeDays;
    return this;
  }

   /**
   * Get maxRequestMoreFeedbackTimeDays
   * @return maxRequestMoreFeedbackTimeDays
  **/


  public Integer getMaxRequestMoreFeedbackTimeDays() {
    return maxRequestMoreFeedbackTimeDays;
  }


  public void setMaxRequestMoreFeedbackTimeDays(Integer maxRequestMoreFeedbackTimeDays) {
    this.maxRequestMoreFeedbackTimeDays = maxRequestMoreFeedbackTimeDays;
  }


  public Course maxComplaintTextLimit(Integer maxComplaintTextLimit) {
    
    this.maxComplaintTextLimit = maxComplaintTextLimit;
    return this;
  }

   /**
   * Get maxComplaintTextLimit
   * @return maxComplaintTextLimit
  **/


  public Integer getMaxComplaintTextLimit() {
    return maxComplaintTextLimit;
  }


  public void setMaxComplaintTextLimit(Integer maxComplaintTextLimit) {
    this.maxComplaintTextLimit = maxComplaintTextLimit;
  }


  public Course maxComplaintResponseTextLimit(Integer maxComplaintResponseTextLimit) {
    
    this.maxComplaintResponseTextLimit = maxComplaintResponseTextLimit;
    return this;
  }

   /**
   * Get maxComplaintResponseTextLimit
   * @return maxComplaintResponseTextLimit
  **/


  public Integer getMaxComplaintResponseTextLimit() {
    return maxComplaintResponseTextLimit;
  }


  public void setMaxComplaintResponseTextLimit(Integer maxComplaintResponseTextLimit) {
    this.maxComplaintResponseTextLimit = maxComplaintResponseTextLimit;
  }


  public Course postsEnabled(Boolean postsEnabled) {
    
    this.postsEnabled = postsEnabled;
    return this;
  }

   /**
   * Get postsEnabled
   * @return postsEnabled
  **/


  public Boolean getPostsEnabled() {
    return postsEnabled;
  }


  public void setPostsEnabled(Boolean postsEnabled) {
    this.postsEnabled = postsEnabled;
  }


  public Course posts(Set<Post> posts) {
    
    this.posts = posts;
    return this;
  }

  public Course addPostsItem(Post postsItem) {
    if (this.posts == null) {
      this.posts = new LinkedHashSet<>();
    }
    this.posts.add(postsItem);
    return this;
  }

   /**
   * Get posts
   * @return posts
  **/


  public Set<Post> getPosts() {
    return posts;
  }


  public void setPosts(Set<Post> posts) {
    this.posts = posts;
  }


  public Course color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/


  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public Course courseIcon(String courseIcon) {
    
    this.courseIcon = courseIcon;
    return this;
  }

   /**
   * Get courseIcon
   * @return courseIcon
  **/


  public String getCourseIcon() {
    return courseIcon;
  }


  public void setCourseIcon(String courseIcon) {
    this.courseIcon = courseIcon;
  }


  public Course registrationEnabled(Boolean registrationEnabled) {
    
    this.registrationEnabled = registrationEnabled;
    return this;
  }

   /**
   * Get registrationEnabled
   * @return registrationEnabled
  **/


  public Boolean getRegistrationEnabled() {
    return registrationEnabled;
  }


  public void setRegistrationEnabled(Boolean registrationEnabled) {
    this.registrationEnabled = registrationEnabled;
  }


  public Course registrationConfirmationMessage(String registrationConfirmationMessage) {
    
    this.registrationConfirmationMessage = registrationConfirmationMessage;
    return this;
  }

   /**
   * Get registrationConfirmationMessage
   * @return registrationConfirmationMessage
  **/


  public String getRegistrationConfirmationMessage() {
    return registrationConfirmationMessage;
  }


  public void setRegistrationConfirmationMessage(String registrationConfirmationMessage) {
    this.registrationConfirmationMessage = registrationConfirmationMessage;
  }


  public Course presentationScore(Integer presentationScore) {
    
    this.presentationScore = presentationScore;
    return this;
  }

   /**
   * Get presentationScore
   * @return presentationScore
  **/


  public Integer getPresentationScore() {
    return presentationScore;
  }


  public void setPresentationScore(Integer presentationScore) {
    this.presentationScore = presentationScore;
  }


  public Course courseArchivePath(String courseArchivePath) {
    
    this.courseArchivePath = courseArchivePath;
    return this;
  }

   /**
   * Get courseArchivePath
   * @return courseArchivePath
  **/


  public String getCourseArchivePath() {
    return courseArchivePath;
  }


  public void setCourseArchivePath(String courseArchivePath) {
    this.courseArchivePath = courseArchivePath;
  }


  public Course maxPoints(Integer maxPoints) {
    
    this.maxPoints = maxPoints;
    return this;
  }

   /**
   * Get maxPoints
   * @return maxPoints
  **/


  public Integer getMaxPoints() {
    return maxPoints;
  }


  public void setMaxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
  }


  public Course accuracyOfScores(Integer accuracyOfScores) {
    
    this.accuracyOfScores = accuracyOfScores;
    return this;
  }

   /**
   * Get accuracyOfScores
   * @return accuracyOfScores
  **/


  public Integer getAccuracyOfScores() {
    return accuracyOfScores;
  }


  public void setAccuracyOfScores(Integer accuracyOfScores) {
    this.accuracyOfScores = accuracyOfScores;
  }


  public Course timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/


  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public Course exercises(Set<GetExercise200Response> exercises) {
    
    this.exercises = exercises;
    return this;
  }

  public Course addExercisesItem(GetExercise200Response exercisesItem) {
    if (this.exercises == null) {
      this.exercises = new LinkedHashSet<>();
    }
    this.exercises.add(exercisesItem);
    return this;
  }

   /**
   * Get exercises
   * @return exercises
  **/


  public Set<GetExercise200Response> getExercises() {
    return exercises;
  }


  public void setExercises(Set<GetExercise200Response> exercises) {
    this.exercises = exercises;
  }


  public Course lectures(Set<Lecture> lectures) {
    
    this.lectures = lectures;
    return this;
  }

  public Course addLecturesItem(Lecture lecturesItem) {
    if (this.lectures == null) {
      this.lectures = new LinkedHashSet<>();
    }
    this.lectures.add(lecturesItem);
    return this;
  }

   /**
   * Get lectures
   * @return lectures
  **/


  public Set<Lecture> getLectures() {
    return lectures;
  }


  public void setLectures(Set<Lecture> lectures) {
    this.lectures = lectures;
  }


  public Course tutorialGroups(Set<TutorialGroup> tutorialGroups) {
    
    this.tutorialGroups = tutorialGroups;
    return this;
  }

  public Course addTutorialGroupsItem(TutorialGroup tutorialGroupsItem) {
    if (this.tutorialGroups == null) {
      this.tutorialGroups = new LinkedHashSet<>();
    }
    this.tutorialGroups.add(tutorialGroupsItem);
    return this;
  }

   /**
   * Get tutorialGroups
   * @return tutorialGroups
  **/


  public Set<TutorialGroup> getTutorialGroups() {
    return tutorialGroups;
  }


  public void setTutorialGroups(Set<TutorialGroup> tutorialGroups) {
    this.tutorialGroups = tutorialGroups;
  }


  public Course exams(Set<Exam> exams) {
    
    this.exams = exams;
    return this;
  }

  public Course addExamsItem(Exam examsItem) {
    if (this.exams == null) {
      this.exams = new LinkedHashSet<>();
    }
    this.exams.add(examsItem);
    return this;
  }

   /**
   * Get exams
   * @return exams
  **/


  public Set<Exam> getExams() {
    return exams;
  }


  public void setExams(Set<Exam> exams) {
    this.exams = exams;
  }


  public Course organizations(Set<Organization> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public Course addOrganizationsItem(Organization organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new LinkedHashSet<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Get organizations
   * @return organizations
  **/


  public Set<Organization> getOrganizations() {
    return organizations;
  }


  public void setOrganizations(Set<Organization> organizations) {
    this.organizations = organizations;
  }


  public Course tutorialGroupsConfiguration(TutorialGroupsConfiguration tutorialGroupsConfiguration) {
    
    this.tutorialGroupsConfiguration = tutorialGroupsConfiguration;
    return this;
  }

   /**
   * Get tutorialGroupsConfiguration
   * @return tutorialGroupsConfiguration
  **/


  public TutorialGroupsConfiguration getTutorialGroupsConfiguration() {
    return tutorialGroupsConfiguration;
  }


  public void setTutorialGroupsConfiguration(TutorialGroupsConfiguration tutorialGroupsConfiguration) {
    this.tutorialGroupsConfiguration = tutorialGroupsConfiguration;
  }


  public Course requestMoreFeedbackEnabled(Boolean requestMoreFeedbackEnabled) {
    
    this.requestMoreFeedbackEnabled = requestMoreFeedbackEnabled;
    return this;
  }

   /**
   * Get requestMoreFeedbackEnabled
   * @return requestMoreFeedbackEnabled
  **/


  public Boolean getRequestMoreFeedbackEnabled() {
    return requestMoreFeedbackEnabled;
  }


  public void setRequestMoreFeedbackEnabled(Boolean requestMoreFeedbackEnabled) {
    this.requestMoreFeedbackEnabled = requestMoreFeedbackEnabled;
  }


  public Course complaintsEnabled(Boolean complaintsEnabled) {
    
    this.complaintsEnabled = complaintsEnabled;
    return this;
  }

   /**
   * Get complaintsEnabled
   * @return complaintsEnabled
  **/


  public Boolean getComplaintsEnabled() {
    return complaintsEnabled;
  }


  public void setComplaintsEnabled(Boolean complaintsEnabled) {
    this.complaintsEnabled = complaintsEnabled;
  }


  public Course validStartAndEndDate(Boolean validStartAndEndDate) {
    
    this.validStartAndEndDate = validStartAndEndDate;
    return this;
  }

   /**
   * Get validStartAndEndDate
   * @return validStartAndEndDate
  **/


  public Boolean getValidStartAndEndDate() {
    return validStartAndEndDate;
  }


  public void setValidStartAndEndDate(Boolean validStartAndEndDate) {
    this.validStartAndEndDate = validStartAndEndDate;
  }


  public Course numberOfInstructors(Long numberOfInstructors) {
    
    this.numberOfInstructors = numberOfInstructors;
    return this;
  }

   /**
   * Get numberOfInstructors
   * @return numberOfInstructors
  **/


  public Long getNumberOfInstructors() {
    return numberOfInstructors;
  }


  public void setNumberOfInstructors(Long numberOfInstructors) {
    this.numberOfInstructors = numberOfInstructors;
  }


  public Course numberOfTeachingAssistants(Long numberOfTeachingAssistants) {
    
    this.numberOfTeachingAssistants = numberOfTeachingAssistants;
    return this;
  }

   /**
   * Get numberOfTeachingAssistants
   * @return numberOfTeachingAssistants
  **/


  public Long getNumberOfTeachingAssistants() {
    return numberOfTeachingAssistants;
  }


  public void setNumberOfTeachingAssistants(Long numberOfTeachingAssistants) {
    this.numberOfTeachingAssistants = numberOfTeachingAssistants;
  }


  public Course numberOfEditors(Long numberOfEditors) {
    
    this.numberOfEditors = numberOfEditors;
    return this;
  }

   /**
   * Get numberOfEditors
   * @return numberOfEditors
  **/


  public Long getNumberOfEditors() {
    return numberOfEditors;
  }


  public void setNumberOfEditors(Long numberOfEditors) {
    this.numberOfEditors = numberOfEditors;
  }


  public Course numberOfStudents(Long numberOfStudents) {
    
    this.numberOfStudents = numberOfStudents;
    return this;
  }

   /**
   * Get numberOfStudents
   * @return numberOfStudents
  **/


  public Long getNumberOfStudents() {
    return numberOfStudents;
  }


  public void setNumberOfStudents(Long numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.id, course.id) &&
        Objects.equals(this.title, course.title) &&
        Objects.equals(this.description, course.description) &&
        Objects.equals(this.shortName, course.shortName) &&
        Objects.equals(this.studentGroupName, course.studentGroupName) &&
        Objects.equals(this.teachingAssistantGroupName, course.teachingAssistantGroupName) &&
        Objects.equals(this.editorGroupName, course.editorGroupName) &&
        Objects.equals(this.instructorGroupName, course.instructorGroupName) &&
        Objects.equals(this.startDate, course.startDate) &&
        Objects.equals(this.endDate, course.endDate) &&
        Objects.equals(this.semester, course.semester) &&
        Objects.equals(this.testCourse, course.testCourse) &&
        Objects.equals(this.language, course.language) &&
        Objects.equals(this.defaultProgrammingLanguage, course.defaultProgrammingLanguage) &&
        Objects.equals(this.onlineCourse, course.onlineCourse) &&
        Objects.equals(this.onlineCourseConfiguration, course.onlineCourseConfiguration) &&
        Objects.equals(this.maxComplaints, course.maxComplaints) &&
        Objects.equals(this.maxTeamComplaints, course.maxTeamComplaints) &&
        Objects.equals(this.maxComplaintTimeDays, course.maxComplaintTimeDays) &&
        Objects.equals(this.maxRequestMoreFeedbackTimeDays, course.maxRequestMoreFeedbackTimeDays) &&
        Objects.equals(this.maxComplaintTextLimit, course.maxComplaintTextLimit) &&
        Objects.equals(this.maxComplaintResponseTextLimit, course.maxComplaintResponseTextLimit) &&
        Objects.equals(this.postsEnabled, course.postsEnabled) &&
        Objects.equals(this.posts, course.posts) &&
        Objects.equals(this.color, course.color) &&
        Objects.equals(this.courseIcon, course.courseIcon) &&
        Objects.equals(this.registrationEnabled, course.registrationEnabled) &&
        Objects.equals(this.registrationConfirmationMessage, course.registrationConfirmationMessage) &&
        Objects.equals(this.presentationScore, course.presentationScore) &&
        Objects.equals(this.courseArchivePath, course.courseArchivePath) &&
        Objects.equals(this.maxPoints, course.maxPoints) &&
        Objects.equals(this.accuracyOfScores, course.accuracyOfScores) &&
        Objects.equals(this.timeZone, course.timeZone) &&
        Objects.equals(this.exercises, course.exercises) &&
        Objects.equals(this.lectures, course.lectures) &&
        Objects.equals(this.tutorialGroups, course.tutorialGroups) &&
        Objects.equals(this.exams, course.exams) &&
        Objects.equals(this.organizations, course.organizations) &&
        Objects.equals(this.tutorialGroupsConfiguration, course.tutorialGroupsConfiguration) &&
        Objects.equals(this.requestMoreFeedbackEnabled, course.requestMoreFeedbackEnabled) &&
        Objects.equals(this.complaintsEnabled, course.complaintsEnabled) &&
        Objects.equals(this.validStartAndEndDate, course.validStartAndEndDate) &&
        Objects.equals(this.numberOfInstructors, course.numberOfInstructors) &&
        Objects.equals(this.numberOfTeachingAssistants, course.numberOfTeachingAssistants) &&
        Objects.equals(this.numberOfEditors, course.numberOfEditors) &&
        Objects.equals(this.numberOfStudents, course.numberOfStudents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, shortName, studentGroupName, teachingAssistantGroupName, editorGroupName, instructorGroupName, startDate, endDate, semester, testCourse, language, defaultProgrammingLanguage, onlineCourse, onlineCourseConfiguration, maxComplaints, maxTeamComplaints, maxComplaintTimeDays, maxRequestMoreFeedbackTimeDays, maxComplaintTextLimit, maxComplaintResponseTextLimit, postsEnabled, posts, color, courseIcon, registrationEnabled, registrationConfirmationMessage, presentationScore, courseArchivePath, maxPoints, accuracyOfScores, timeZone, exercises, lectures, tutorialGroups, exams, organizations, tutorialGroupsConfiguration, requestMoreFeedbackEnabled, complaintsEnabled, validStartAndEndDate, numberOfInstructors, numberOfTeachingAssistants, numberOfEditors, numberOfStudents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    studentGroupName: ").append(toIndentedString(studentGroupName)).append("\n");
    sb.append("    teachingAssistantGroupName: ").append(toIndentedString(teachingAssistantGroupName)).append("\n");
    sb.append("    editorGroupName: ").append(toIndentedString(editorGroupName)).append("\n");
    sb.append("    instructorGroupName: ").append(toIndentedString(instructorGroupName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    semester: ").append(toIndentedString(semester)).append("\n");
    sb.append("    testCourse: ").append(toIndentedString(testCourse)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    defaultProgrammingLanguage: ").append(toIndentedString(defaultProgrammingLanguage)).append("\n");
    sb.append("    onlineCourse: ").append(toIndentedString(onlineCourse)).append("\n");
    sb.append("    onlineCourseConfiguration: ").append(toIndentedString(onlineCourseConfiguration)).append("\n");
    sb.append("    maxComplaints: ").append(toIndentedString(maxComplaints)).append("\n");
    sb.append("    maxTeamComplaints: ").append(toIndentedString(maxTeamComplaints)).append("\n");
    sb.append("    maxComplaintTimeDays: ").append(toIndentedString(maxComplaintTimeDays)).append("\n");
    sb.append("    maxRequestMoreFeedbackTimeDays: ").append(toIndentedString(maxRequestMoreFeedbackTimeDays)).append("\n");
    sb.append("    maxComplaintTextLimit: ").append(toIndentedString(maxComplaintTextLimit)).append("\n");
    sb.append("    maxComplaintResponseTextLimit: ").append(toIndentedString(maxComplaintResponseTextLimit)).append("\n");
    sb.append("    postsEnabled: ").append(toIndentedString(postsEnabled)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    courseIcon: ").append(toIndentedString(courseIcon)).append("\n");
    sb.append("    registrationEnabled: ").append(toIndentedString(registrationEnabled)).append("\n");
    sb.append("    registrationConfirmationMessage: ").append(toIndentedString(registrationConfirmationMessage)).append("\n");
    sb.append("    presentationScore: ").append(toIndentedString(presentationScore)).append("\n");
    sb.append("    courseArchivePath: ").append(toIndentedString(courseArchivePath)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    accuracyOfScores: ").append(toIndentedString(accuracyOfScores)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    exercises: ").append(toIndentedString(exercises)).append("\n");
    sb.append("    lectures: ").append(toIndentedString(lectures)).append("\n");
    sb.append("    tutorialGroups: ").append(toIndentedString(tutorialGroups)).append("\n");
    sb.append("    exams: ").append(toIndentedString(exams)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    tutorialGroupsConfiguration: ").append(toIndentedString(tutorialGroupsConfiguration)).append("\n");
    sb.append("    requestMoreFeedbackEnabled: ").append(toIndentedString(requestMoreFeedbackEnabled)).append("\n");
    sb.append("    complaintsEnabled: ").append(toIndentedString(complaintsEnabled)).append("\n");
    sb.append("    validStartAndEndDate: ").append(toIndentedString(validStartAndEndDate)).append("\n");
    sb.append("    numberOfInstructors: ").append(toIndentedString(numberOfInstructors)).append("\n");
    sb.append("    numberOfTeachingAssistants: ").append(toIndentedString(numberOfTeachingAssistants)).append("\n");
    sb.append("    numberOfEditors: ").append(toIndentedString(numberOfEditors)).append("\n");
    sb.append("    numberOfStudents: ").append(toIndentedString(numberOfStudents)).append("\n");
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

