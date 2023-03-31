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
import de.tum.cit.ase.artemis.sdk.model.ExamUser;
import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;
import de.tum.cit.ase.artemis.sdk.model.StudentExam;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Exam
 */
@JsonPropertyOrder({
  Exam.JSON_PROPERTY_ID,
  Exam.JSON_PROPERTY_TITLE,
  Exam.JSON_PROPERTY_TEST_EXAM,
  Exam.JSON_PROPERTY_MONITORING,
  Exam.JSON_PROPERTY_VISIBLE_DATE,
  Exam.JSON_PROPERTY_START_DATE,
  Exam.JSON_PROPERTY_END_DATE,
  Exam.JSON_PROPERTY_PUBLISH_RESULTS_DATE,
  Exam.JSON_PROPERTY_EXAM_STUDENT_REVIEW_START,
  Exam.JSON_PROPERTY_EXAM_STUDENT_REVIEW_END,
  Exam.JSON_PROPERTY_GRACE_PERIOD,
  Exam.JSON_PROPERTY_WORKING_TIME,
  Exam.JSON_PROPERTY_START_TEXT,
  Exam.JSON_PROPERTY_END_TEXT,
  Exam.JSON_PROPERTY_CONFIRMATION_START_TEXT,
  Exam.JSON_PROPERTY_CONFIRMATION_END_TEXT,
  Exam.JSON_PROPERTY_EXAM_MAX_POINTS,
  Exam.JSON_PROPERTY_RANDOMIZE_EXERCISE_ORDER,
  Exam.JSON_PROPERTY_NUMBER_OF_EXERCISES_IN_EXAM,
  Exam.JSON_PROPERTY_NUMBER_OF_CORRECTION_ROUNDS_IN_EXAM,
  Exam.JSON_PROPERTY_EXAMINER,
  Exam.JSON_PROPERTY_MODULE_NUMBER,
  Exam.JSON_PROPERTY_COURSE_NAME,
  Exam.JSON_PROPERTY_EXAMPLE_SOLUTION_PUBLICATION_DATE,
  Exam.JSON_PROPERTY_COURSE,
  Exam.JSON_PROPERTY_EXERCISE_GROUPS,
  Exam.JSON_PROPERTY_STUDENT_EXAMS,
  Exam.JSON_PROPERTY_EXAM_ARCHIVE_PATH,
  Exam.JSON_PROPERTY_EXAM_USERS,
  Exam.JSON_PROPERTY_NUMBER_OF_EXAM_USERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class Exam {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TEST_EXAM = "testExam";
  private Boolean testExam;

  public static final String JSON_PROPERTY_MONITORING = "monitoring";
  private Boolean monitoring;

  public static final String JSON_PROPERTY_VISIBLE_DATE = "visibleDate";
  private OffsetDateTime visibleDate;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_PUBLISH_RESULTS_DATE = "publishResultsDate";
  private OffsetDateTime publishResultsDate;

  public static final String JSON_PROPERTY_EXAM_STUDENT_REVIEW_START = "examStudentReviewStart";
  private OffsetDateTime examStudentReviewStart;

  public static final String JSON_PROPERTY_EXAM_STUDENT_REVIEW_END = "examStudentReviewEnd";
  private OffsetDateTime examStudentReviewEnd;

  public static final String JSON_PROPERTY_GRACE_PERIOD = "gracePeriod";
  private Integer gracePeriod;

  public static final String JSON_PROPERTY_WORKING_TIME = "workingTime";
  private Integer workingTime;

  public static final String JSON_PROPERTY_START_TEXT = "startText";
  private String startText;

  public static final String JSON_PROPERTY_END_TEXT = "endText";
  private String endText;

  public static final String JSON_PROPERTY_CONFIRMATION_START_TEXT = "confirmationStartText";
  private String confirmationStartText;

  public static final String JSON_PROPERTY_CONFIRMATION_END_TEXT = "confirmationEndText";
  private String confirmationEndText;

  public static final String JSON_PROPERTY_EXAM_MAX_POINTS = "examMaxPoints";
  private Integer examMaxPoints;

  public static final String JSON_PROPERTY_RANDOMIZE_EXERCISE_ORDER = "randomizeExerciseOrder";
  private Boolean randomizeExerciseOrder;

  public static final String JSON_PROPERTY_NUMBER_OF_EXERCISES_IN_EXAM = "numberOfExercisesInExam";
  private Integer numberOfExercisesInExam;

  public static final String JSON_PROPERTY_NUMBER_OF_CORRECTION_ROUNDS_IN_EXAM = "numberOfCorrectionRoundsInExam";
  private Integer numberOfCorrectionRoundsInExam;

  public static final String JSON_PROPERTY_EXAMINER = "examiner";
  private String examiner;

  public static final String JSON_PROPERTY_MODULE_NUMBER = "moduleNumber";
  private String moduleNumber;

  public static final String JSON_PROPERTY_COURSE_NAME = "courseName";
  private String courseName;

  public static final String JSON_PROPERTY_EXAMPLE_SOLUTION_PUBLICATION_DATE = "exampleSolutionPublicationDate";
  private OffsetDateTime exampleSolutionPublicationDate;

  public static final String JSON_PROPERTY_COURSE = "course";
  private Course course;

  public static final String JSON_PROPERTY_EXERCISE_GROUPS = "exerciseGroups";
  private List<ExerciseGroup> exerciseGroups;

  public static final String JSON_PROPERTY_STUDENT_EXAMS = "studentExams";
  private Set<StudentExam> studentExams;

  public static final String JSON_PROPERTY_EXAM_ARCHIVE_PATH = "examArchivePath";
  private String examArchivePath;

  public static final String JSON_PROPERTY_EXAM_USERS = "examUsers";
  private Set<ExamUser> examUsers;

  public static final String JSON_PROPERTY_NUMBER_OF_EXAM_USERS = "numberOfExamUsers";
  private Long numberOfExamUsers;

  public Exam() { 
  }

  public Exam id(Long id) {
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


  public Exam title(String title) {
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


  public Exam testExam(Boolean testExam) {
    this.testExam = testExam;
    return this;
  }

   /**
   * Get testExam
   * @return testExam
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTestExam() {
    return testExam;
  }


  @JsonProperty(JSON_PROPERTY_TEST_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestExam(Boolean testExam) {
    this.testExam = testExam;
  }


  public Exam monitoring(Boolean monitoring) {
    this.monitoring = monitoring;
    return this;
  }

   /**
   * Get monitoring
   * @return monitoring
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMonitoring() {
    return monitoring;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoring(Boolean monitoring) {
    this.monitoring = monitoring;
  }


  public Exam visibleDate(OffsetDateTime visibleDate) {
    this.visibleDate = visibleDate;
    return this;
  }

   /**
   * Get visibleDate
   * @return visibleDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VISIBLE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getVisibleDate() {
    return visibleDate;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisibleDate(OffsetDateTime visibleDate) {
    this.visibleDate = visibleDate;
  }


  public Exam startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Exam endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Exam publishResultsDate(OffsetDateTime publishResultsDate) {
    this.publishResultsDate = publishResultsDate;
    return this;
  }

   /**
   * Get publishResultsDate
   * @return publishResultsDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISH_RESULTS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPublishResultsDate() {
    return publishResultsDate;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISH_RESULTS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublishResultsDate(OffsetDateTime publishResultsDate) {
    this.publishResultsDate = publishResultsDate;
  }


  public Exam examStudentReviewStart(OffsetDateTime examStudentReviewStart) {
    this.examStudentReviewStart = examStudentReviewStart;
    return this;
  }

   /**
   * Get examStudentReviewStart
   * @return examStudentReviewStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM_STUDENT_REVIEW_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExamStudentReviewStart() {
    return examStudentReviewStart;
  }


  @JsonProperty(JSON_PROPERTY_EXAM_STUDENT_REVIEW_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamStudentReviewStart(OffsetDateTime examStudentReviewStart) {
    this.examStudentReviewStart = examStudentReviewStart;
  }


  public Exam examStudentReviewEnd(OffsetDateTime examStudentReviewEnd) {
    this.examStudentReviewEnd = examStudentReviewEnd;
    return this;
  }

   /**
   * Get examStudentReviewEnd
   * @return examStudentReviewEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM_STUDENT_REVIEW_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExamStudentReviewEnd() {
    return examStudentReviewEnd;
  }


  @JsonProperty(JSON_PROPERTY_EXAM_STUDENT_REVIEW_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamStudentReviewEnd(OffsetDateTime examStudentReviewEnd) {
    this.examStudentReviewEnd = examStudentReviewEnd;
  }


  public Exam gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * Get gracePeriod
   * @return gracePeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRACE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGracePeriod() {
    return gracePeriod;
  }


  @JsonProperty(JSON_PROPERTY_GRACE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }


  public Exam workingTime(Integer workingTime) {
    this.workingTime = workingTime;
    return this;
  }

   /**
   * Get workingTime
   * @return workingTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWorkingTime() {
    return workingTime;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkingTime(Integer workingTime) {
    this.workingTime = workingTime;
  }


  public Exam startText(String startText) {
    this.startText = startText;
    return this;
  }

   /**
   * Get startText
   * @return startText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartText() {
    return startText;
  }


  @JsonProperty(JSON_PROPERTY_START_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartText(String startText) {
    this.startText = startText;
  }


  public Exam endText(String endText) {
    this.endText = endText;
    return this;
  }

   /**
   * Get endText
   * @return endText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndText() {
    return endText;
  }


  @JsonProperty(JSON_PROPERTY_END_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndText(String endText) {
    this.endText = endText;
  }


  public Exam confirmationStartText(String confirmationStartText) {
    this.confirmationStartText = confirmationStartText;
    return this;
  }

   /**
   * Get confirmationStartText
   * @return confirmationStartText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_START_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmationStartText() {
    return confirmationStartText;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRMATION_START_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmationStartText(String confirmationStartText) {
    this.confirmationStartText = confirmationStartText;
  }


  public Exam confirmationEndText(String confirmationEndText) {
    this.confirmationEndText = confirmationEndText;
    return this;
  }

   /**
   * Get confirmationEndText
   * @return confirmationEndText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_END_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmationEndText() {
    return confirmationEndText;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRMATION_END_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmationEndText(String confirmationEndText) {
    this.confirmationEndText = confirmationEndText;
  }


  public Exam examMaxPoints(Integer examMaxPoints) {
    this.examMaxPoints = examMaxPoints;
    return this;
  }

   /**
   * Get examMaxPoints
   * @return examMaxPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExamMaxPoints() {
    return examMaxPoints;
  }


  @JsonProperty(JSON_PROPERTY_EXAM_MAX_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamMaxPoints(Integer examMaxPoints) {
    this.examMaxPoints = examMaxPoints;
  }


  public Exam randomizeExerciseOrder(Boolean randomizeExerciseOrder) {
    this.randomizeExerciseOrder = randomizeExerciseOrder;
    return this;
  }

   /**
   * Get randomizeExerciseOrder
   * @return randomizeExerciseOrder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANDOMIZE_EXERCISE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRandomizeExerciseOrder() {
    return randomizeExerciseOrder;
  }


  @JsonProperty(JSON_PROPERTY_RANDOMIZE_EXERCISE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandomizeExerciseOrder(Boolean randomizeExerciseOrder) {
    this.randomizeExerciseOrder = randomizeExerciseOrder;
  }


  public Exam numberOfExercisesInExam(Integer numberOfExercisesInExam) {
    this.numberOfExercisesInExam = numberOfExercisesInExam;
    return this;
  }

   /**
   * Get numberOfExercisesInExam
   * @return numberOfExercisesInExam
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXERCISES_IN_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfExercisesInExam() {
    return numberOfExercisesInExam;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXERCISES_IN_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfExercisesInExam(Integer numberOfExercisesInExam) {
    this.numberOfExercisesInExam = numberOfExercisesInExam;
  }


  public Exam numberOfCorrectionRoundsInExam(Integer numberOfCorrectionRoundsInExam) {
    this.numberOfCorrectionRoundsInExam = numberOfCorrectionRoundsInExam;
    return this;
  }

   /**
   * Get numberOfCorrectionRoundsInExam
   * @return numberOfCorrectionRoundsInExam
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CORRECTION_ROUNDS_IN_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfCorrectionRoundsInExam() {
    return numberOfCorrectionRoundsInExam;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CORRECTION_ROUNDS_IN_EXAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfCorrectionRoundsInExam(Integer numberOfCorrectionRoundsInExam) {
    this.numberOfCorrectionRoundsInExam = numberOfCorrectionRoundsInExam;
  }


  public Exam examiner(String examiner) {
    this.examiner = examiner;
    return this;
  }

   /**
   * Get examiner
   * @return examiner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExaminer() {
    return examiner;
  }


  @JsonProperty(JSON_PROPERTY_EXAMINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExaminer(String examiner) {
    this.examiner = examiner;
  }


  public Exam moduleNumber(String moduleNumber) {
    this.moduleNumber = moduleNumber;
    return this;
  }

   /**
   * Get moduleNumber
   * @return moduleNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModuleNumber() {
    return moduleNumber;
  }


  @JsonProperty(JSON_PROPERTY_MODULE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModuleNumber(String moduleNumber) {
    this.moduleNumber = moduleNumber;
  }


  public Exam courseName(String courseName) {
    this.courseName = courseName;
    return this;
  }

   /**
   * Get courseName
   * @return courseName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCourseName() {
    return courseName;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }


  public Exam exampleSolutionPublicationDate(OffsetDateTime exampleSolutionPublicationDate) {
    this.exampleSolutionPublicationDate = exampleSolutionPublicationDate;
    return this;
  }

   /**
   * Get exampleSolutionPublicationDate
   * @return exampleSolutionPublicationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION_PUBLICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExampleSolutionPublicationDate() {
    return exampleSolutionPublicationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE_SOLUTION_PUBLICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExampleSolutionPublicationDate(OffsetDateTime exampleSolutionPublicationDate) {
    this.exampleSolutionPublicationDate = exampleSolutionPublicationDate;
  }


  public Exam course(Course course) {
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


  public Exam exerciseGroups(List<ExerciseGroup> exerciseGroups) {
    this.exerciseGroups = exerciseGroups;
    return this;
  }

  public Exam addExerciseGroupsItem(ExerciseGroup exerciseGroupsItem) {
    if (this.exerciseGroups == null) {
      this.exerciseGroups = new ArrayList<>();
    }
    this.exerciseGroups.add(exerciseGroupsItem);
    return this;
  }

   /**
   * Get exerciseGroups
   * @return exerciseGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExerciseGroup> getExerciseGroups() {
    return exerciseGroups;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseGroups(List<ExerciseGroup> exerciseGroups) {
    this.exerciseGroups = exerciseGroups;
  }


  public Exam studentExams(Set<StudentExam> studentExams) {
    this.studentExams = studentExams;
    return this;
  }

  public Exam addStudentExamsItem(StudentExam studentExamsItem) {
    if (this.studentExams == null) {
      this.studentExams = new LinkedHashSet<>();
    }
    this.studentExams.add(studentExamsItem);
    return this;
  }

   /**
   * Get studentExams
   * @return studentExams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STUDENT_EXAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<StudentExam> getStudentExams() {
    return studentExams;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_STUDENT_EXAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentExams(Set<StudentExam> studentExams) {
    this.studentExams = studentExams;
  }


  public Exam examArchivePath(String examArchivePath) {
    this.examArchivePath = examArchivePath;
    return this;
  }

   /**
   * Get examArchivePath
   * @return examArchivePath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM_ARCHIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExamArchivePath() {
    return examArchivePath;
  }


  @JsonProperty(JSON_PROPERTY_EXAM_ARCHIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamArchivePath(String examArchivePath) {
    this.examArchivePath = examArchivePath;
  }


  public Exam examUsers(Set<ExamUser> examUsers) {
    this.examUsers = examUsers;
    return this;
  }

  public Exam addExamUsersItem(ExamUser examUsersItem) {
    if (this.examUsers == null) {
      this.examUsers = new LinkedHashSet<>();
    }
    this.examUsers.add(examUsersItem);
    return this;
  }

   /**
   * Get examUsers
   * @return examUsers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAM_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ExamUser> getExamUsers() {
    return examUsers;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_EXAM_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamUsers(Set<ExamUser> examUsers) {
    this.examUsers = examUsers;
  }


  public Exam numberOfExamUsers(Long numberOfExamUsers) {
    this.numberOfExamUsers = numberOfExamUsers;
    return this;
  }

   /**
   * Get numberOfExamUsers
   * @return numberOfExamUsers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXAM_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfExamUsers() {
    return numberOfExamUsers;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EXAM_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfExamUsers(Long numberOfExamUsers) {
    this.numberOfExamUsers = numberOfExamUsers;
  }


  /**
   * Return true if this Exam object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exam exam = (Exam) o;
    return Objects.equals(this.id, exam.id) &&
        Objects.equals(this.title, exam.title) &&
        Objects.equals(this.testExam, exam.testExam) &&
        Objects.equals(this.monitoring, exam.monitoring) &&
        Objects.equals(this.visibleDate, exam.visibleDate) &&
        Objects.equals(this.startDate, exam.startDate) &&
        Objects.equals(this.endDate, exam.endDate) &&
        Objects.equals(this.publishResultsDate, exam.publishResultsDate) &&
        Objects.equals(this.examStudentReviewStart, exam.examStudentReviewStart) &&
        Objects.equals(this.examStudentReviewEnd, exam.examStudentReviewEnd) &&
        Objects.equals(this.gracePeriod, exam.gracePeriod) &&
        Objects.equals(this.workingTime, exam.workingTime) &&
        Objects.equals(this.startText, exam.startText) &&
        Objects.equals(this.endText, exam.endText) &&
        Objects.equals(this.confirmationStartText, exam.confirmationStartText) &&
        Objects.equals(this.confirmationEndText, exam.confirmationEndText) &&
        Objects.equals(this.examMaxPoints, exam.examMaxPoints) &&
        Objects.equals(this.randomizeExerciseOrder, exam.randomizeExerciseOrder) &&
        Objects.equals(this.numberOfExercisesInExam, exam.numberOfExercisesInExam) &&
        Objects.equals(this.numberOfCorrectionRoundsInExam, exam.numberOfCorrectionRoundsInExam) &&
        Objects.equals(this.examiner, exam.examiner) &&
        Objects.equals(this.moduleNumber, exam.moduleNumber) &&
        Objects.equals(this.courseName, exam.courseName) &&
        Objects.equals(this.exampleSolutionPublicationDate, exam.exampleSolutionPublicationDate) &&
        Objects.equals(this.course, exam.course) &&
        Objects.equals(this.exerciseGroups, exam.exerciseGroups) &&
        Objects.equals(this.studentExams, exam.studentExams) &&
        Objects.equals(this.examArchivePath, exam.examArchivePath) &&
        Objects.equals(this.examUsers, exam.examUsers) &&
        Objects.equals(this.numberOfExamUsers, exam.numberOfExamUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, testExam, monitoring, visibleDate, startDate, endDate, publishResultsDate, examStudentReviewStart, examStudentReviewEnd, gracePeriod, workingTime, startText, endText, confirmationStartText, confirmationEndText, examMaxPoints, randomizeExerciseOrder, numberOfExercisesInExam, numberOfCorrectionRoundsInExam, examiner, moduleNumber, courseName, exampleSolutionPublicationDate, course, exerciseGroups, studentExams, examArchivePath, examUsers, numberOfExamUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exam {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    testExam: ").append(toIndentedString(testExam)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    visibleDate: ").append(toIndentedString(visibleDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    publishResultsDate: ").append(toIndentedString(publishResultsDate)).append("\n");
    sb.append("    examStudentReviewStart: ").append(toIndentedString(examStudentReviewStart)).append("\n");
    sb.append("    examStudentReviewEnd: ").append(toIndentedString(examStudentReviewEnd)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    workingTime: ").append(toIndentedString(workingTime)).append("\n");
    sb.append("    startText: ").append(toIndentedString(startText)).append("\n");
    sb.append("    endText: ").append(toIndentedString(endText)).append("\n");
    sb.append("    confirmationStartText: ").append(toIndentedString(confirmationStartText)).append("\n");
    sb.append("    confirmationEndText: ").append(toIndentedString(confirmationEndText)).append("\n");
    sb.append("    examMaxPoints: ").append(toIndentedString(examMaxPoints)).append("\n");
    sb.append("    randomizeExerciseOrder: ").append(toIndentedString(randomizeExerciseOrder)).append("\n");
    sb.append("    numberOfExercisesInExam: ").append(toIndentedString(numberOfExercisesInExam)).append("\n");
    sb.append("    numberOfCorrectionRoundsInExam: ").append(toIndentedString(numberOfCorrectionRoundsInExam)).append("\n");
    sb.append("    examiner: ").append(toIndentedString(examiner)).append("\n");
    sb.append("    moduleNumber: ").append(toIndentedString(moduleNumber)).append("\n");
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    exampleSolutionPublicationDate: ").append(toIndentedString(exampleSolutionPublicationDate)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    exerciseGroups: ").append(toIndentedString(exerciseGroups)).append("\n");
    sb.append("    studentExams: ").append(toIndentedString(studentExams)).append("\n");
    sb.append("    examArchivePath: ").append(toIndentedString(examArchivePath)).append("\n");
    sb.append("    examUsers: ").append(toIndentedString(examUsers)).append("\n");
    sb.append("    numberOfExamUsers: ").append(toIndentedString(numberOfExamUsers)).append("\n");
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

