package model;

import java.util.Objects;
import java.util.Arrays;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Exercise
 */
public class Exercise {


  private Long id;



  private String title;



  private String shortName;



  private Double maxPoints;



  private Double bonusPoints;

  /**
   * Gets or Sets assessmentType
   */

  public enum AssessmentTypeEnum {
    AUTOMATIC("AUTOMATIC"),
    
    SEMI_AUTOMATIC("SEMI_AUTOMATIC"),
    
    MANUAL("MANUAL");

    private String value;

    AssessmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssessmentTypeEnum fromValue(String value) {
      for (AssessmentTypeEnum b : AssessmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



  private AssessmentTypeEnum assessmentType;



  private OffsetDateTime releaseDate;



  private OffsetDateTime startDate;



  private OffsetDateTime dueDate;



  private OffsetDateTime assessmentDueDate;



  private OffsetDateTime exampleSolutionPublicationDate;

  /**
   * Gets or Sets difficulty
   */

  public enum DifficultyEnum {
    EASY("EASY"),
    
    MEDIUM("MEDIUM"),
    
    HARD("HARD");

    private String value;

    DifficultyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DifficultyEnum fromValue(String value) {
      for (DifficultyEnum b : DifficultyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



  private DifficultyEnum difficulty;

  /**
   * Gets or Sets mode
   */

  public enum ModeEnum {
    INDIVIDUAL("INDIVIDUAL"),
    
    TEAM("TEAM");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



  private ModeEnum mode;



  private Boolean allowComplaintsForAutomaticAssessments;



  private Boolean allowManualFeedbackRequests;

  /**
   * Gets or Sets includedInOverallScore
   */

  public enum IncludedInOverallScoreEnum {
    INCLUDED_COMPLETELY("INCLUDED_COMPLETELY"),
    
    INCLUDED_AS_BONUS("INCLUDED_AS_BONUS"),
    
    NOT_INCLUDED("NOT_INCLUDED");

    private String value;

    IncludedInOverallScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IncludedInOverallScoreEnum fromValue(String value) {
      for (IncludedInOverallScoreEnum b : IncludedInOverallScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



  private IncludedInOverallScoreEnum includedInOverallScore;



  private String problemStatement;



  private String gradingInstructions;



  private Set<String> categories = new LinkedHashSet<>();



  private TeamAssignmentConfig teamAssignmentConfig;



  private Set<Team> teams = new LinkedHashSet<>();



  private Boolean presentationScoreEnabled;



  private Boolean secondCorrectionEnabled;



  private Course course;



  private ExerciseGroup exerciseGroup;



  private List<GradingCriterion> gradingCriteria = new ArrayList<>();



  private Set<StudentParticipation> studentParticipations = new LinkedHashSet<>();



  private Set<TutorParticipation> tutorParticipations = new LinkedHashSet<>();



  private Set<ExampleSubmission> exampleSubmissions = new LinkedHashSet<>();



  private Set<Attachment> attachments = new LinkedHashSet<>();



  private Set<Post> posts = new LinkedHashSet<>();



  private Set<PlagiarismCase> plagiarismCases = new LinkedHashSet<>();



  private List<DueDateStat> numberOfAssessmentsOfCorrectionRounds = new ArrayList<>();



  private DueDateStat totalNumberOfAssessments;



  private Double averageRating;



  private Long numberOfRatings;



  private DueDateStat numberOfSubmissions;



  private Long numberOfOpenComplaints;



  private Long numberOfComplaints;



  private Long numberOfOpenMoreFeedbackRequests;



  private Long numberOfMoreFeedbackRequests;

  /**
   * Gets or Sets exerciseType
   */

  public enum ExerciseTypeEnum {
    TEXT("TEXT"),
    
    PROGRAMMING("PROGRAMMING"),
    
    MODELING("MODELING"),
    
    FILE_UPLOAD("FILE_UPLOAD"),
    
    QUIZ("QUIZ");

    private String value;

    ExerciseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExerciseTypeEnum fromValue(String value) {
      for (ExerciseTypeEnum b : ExerciseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



  private ExerciseTypeEnum exerciseType;



  private Long studentAssignedTeamId;



  private Boolean studentAssignedTeamIdComputed;



  private Boolean gradingInstructionFeedbackUsed;



  private Long numberOfParticipations;



  private Boolean exampleSolutionPublished;



  private Boolean released;



  private Boolean testRunParticipationsExist;



  private Boolean teamMode;



  private Boolean visibleToStudents;



  protected String type;

  public Exercise() {
    this.type = this.getClass().getSimpleName();
  }

  public Exercise id(Long id) {
    
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


  public Exercise title(String title) {
    
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


  public Exercise shortName(String shortName) {
    
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


  public Exercise maxPoints(Double maxPoints) {
    
    this.maxPoints = maxPoints;
    return this;
  }

   /**
   * Get maxPoints
   * @return maxPoints
  **/


  public Double getMaxPoints() {
    return maxPoints;
  }


  public void setMaxPoints(Double maxPoints) {
    this.maxPoints = maxPoints;
  }


  public Exercise bonusPoints(Double bonusPoints) {
    
    this.bonusPoints = bonusPoints;
    return this;
  }

   /**
   * Get bonusPoints
   * @return bonusPoints
  **/


  public Double getBonusPoints() {
    return bonusPoints;
  }


  public void setBonusPoints(Double bonusPoints) {
    this.bonusPoints = bonusPoints;
  }


  public Exercise assessmentType(AssessmentTypeEnum assessmentType) {
    
    this.assessmentType = assessmentType;
    return this;
  }

   /**
   * Get assessmentType
   * @return assessmentType
  **/


  public AssessmentTypeEnum getAssessmentType() {
    return assessmentType;
  }


  public void setAssessmentType(AssessmentTypeEnum assessmentType) {
    this.assessmentType = assessmentType;
  }


  public Exercise releaseDate(OffsetDateTime releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/


  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public Exercise startDate(OffsetDateTime startDate) {
    
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


  public Exercise dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/


  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public Exercise assessmentDueDate(OffsetDateTime assessmentDueDate) {
    
    this.assessmentDueDate = assessmentDueDate;
    return this;
  }

   /**
   * Get assessmentDueDate
   * @return assessmentDueDate
  **/


  public OffsetDateTime getAssessmentDueDate() {
    return assessmentDueDate;
  }


  public void setAssessmentDueDate(OffsetDateTime assessmentDueDate) {
    this.assessmentDueDate = assessmentDueDate;
  }


  public Exercise exampleSolutionPublicationDate(OffsetDateTime exampleSolutionPublicationDate) {
    
    this.exampleSolutionPublicationDate = exampleSolutionPublicationDate;
    return this;
  }

   /**
   * Get exampleSolutionPublicationDate
   * @return exampleSolutionPublicationDate
  **/


  public OffsetDateTime getExampleSolutionPublicationDate() {
    return exampleSolutionPublicationDate;
  }


  public void setExampleSolutionPublicationDate(OffsetDateTime exampleSolutionPublicationDate) {
    this.exampleSolutionPublicationDate = exampleSolutionPublicationDate;
  }


  public Exercise difficulty(DifficultyEnum difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * @return difficulty
  **/


  public DifficultyEnum getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(DifficultyEnum difficulty) {
    this.difficulty = difficulty;
  }


  public Exercise mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/


  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public Exercise allowComplaintsForAutomaticAssessments(Boolean allowComplaintsForAutomaticAssessments) {
    
    this.allowComplaintsForAutomaticAssessments = allowComplaintsForAutomaticAssessments;
    return this;
  }

   /**
   * Get allowComplaintsForAutomaticAssessments
   * @return allowComplaintsForAutomaticAssessments
  **/


  public Boolean getAllowComplaintsForAutomaticAssessments() {
    return allowComplaintsForAutomaticAssessments;
  }


  public void setAllowComplaintsForAutomaticAssessments(Boolean allowComplaintsForAutomaticAssessments) {
    this.allowComplaintsForAutomaticAssessments = allowComplaintsForAutomaticAssessments;
  }


  public Exercise allowManualFeedbackRequests(Boolean allowManualFeedbackRequests) {
    
    this.allowManualFeedbackRequests = allowManualFeedbackRequests;
    return this;
  }

   /**
   * Get allowManualFeedbackRequests
   * @return allowManualFeedbackRequests
  **/


  public Boolean getAllowManualFeedbackRequests() {
    return allowManualFeedbackRequests;
  }


  public void setAllowManualFeedbackRequests(Boolean allowManualFeedbackRequests) {
    this.allowManualFeedbackRequests = allowManualFeedbackRequests;
  }


  public Exercise includedInOverallScore(IncludedInOverallScoreEnum includedInOverallScore) {
    
    this.includedInOverallScore = includedInOverallScore;
    return this;
  }

   /**
   * Get includedInOverallScore
   * @return includedInOverallScore
  **/


  public IncludedInOverallScoreEnum getIncludedInOverallScore() {
    return includedInOverallScore;
  }


  public void setIncludedInOverallScore(IncludedInOverallScoreEnum includedInOverallScore) {
    this.includedInOverallScore = includedInOverallScore;
  }


  public Exercise problemStatement(String problemStatement) {
    
    this.problemStatement = problemStatement;
    return this;
  }

   /**
   * Get problemStatement
   * @return problemStatement
  **/


  public String getProblemStatement() {
    return problemStatement;
  }


  public void setProblemStatement(String problemStatement) {
    this.problemStatement = problemStatement;
  }


  public Exercise gradingInstructions(String gradingInstructions) {
    
    this.gradingInstructions = gradingInstructions;
    return this;
  }

   /**
   * Get gradingInstructions
   * @return gradingInstructions
  **/


  public String getGradingInstructions() {
    return gradingInstructions;
  }


  public void setGradingInstructions(String gradingInstructions) {
    this.gradingInstructions = gradingInstructions;
  }


  public Exercise categories(Set<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public Exercise addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new LinkedHashSet<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/


  public Set<String> getCategories() {
    return categories;
  }


  public void setCategories(Set<String> categories) {
    this.categories = categories;
  }


  public Exercise teamAssignmentConfig(TeamAssignmentConfig teamAssignmentConfig) {
    
    this.teamAssignmentConfig = teamAssignmentConfig;
    return this;
  }

   /**
   * Get teamAssignmentConfig
   * @return teamAssignmentConfig
  **/


  public TeamAssignmentConfig getTeamAssignmentConfig() {
    return teamAssignmentConfig;
  }


  public void setTeamAssignmentConfig(TeamAssignmentConfig teamAssignmentConfig) {
    this.teamAssignmentConfig = teamAssignmentConfig;
  }


  public Exercise teams(Set<Team> teams) {
    
    this.teams = teams;
    return this;
  }

  public Exercise addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new LinkedHashSet<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/


  public Set<Team> getTeams() {
    return teams;
  }


  public void setTeams(Set<Team> teams) {
    this.teams = teams;
  }


  public Exercise presentationScoreEnabled(Boolean presentationScoreEnabled) {
    
    this.presentationScoreEnabled = presentationScoreEnabled;
    return this;
  }

   /**
   * Get presentationScoreEnabled
   * @return presentationScoreEnabled
  **/


  public Boolean getPresentationScoreEnabled() {
    return presentationScoreEnabled;
  }


  public void setPresentationScoreEnabled(Boolean presentationScoreEnabled) {
    this.presentationScoreEnabled = presentationScoreEnabled;
  }


  public Exercise secondCorrectionEnabled(Boolean secondCorrectionEnabled) {
    
    this.secondCorrectionEnabled = secondCorrectionEnabled;
    return this;
  }

   /**
   * Get secondCorrectionEnabled
   * @return secondCorrectionEnabled
  **/


  public Boolean getSecondCorrectionEnabled() {
    return secondCorrectionEnabled;
  }


  public void setSecondCorrectionEnabled(Boolean secondCorrectionEnabled) {
    this.secondCorrectionEnabled = secondCorrectionEnabled;
  }


  public Exercise course(Course course) {
    
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/


  public Course getCourse() {
    return course;
  }


  public void setCourse(Course course) {
    this.course = course;
  }


  public Exercise exerciseGroup(ExerciseGroup exerciseGroup) {
    
    this.exerciseGroup = exerciseGroup;
    return this;
  }

   /**
   * Get exerciseGroup
   * @return exerciseGroup
  **/


  public ExerciseGroup getExerciseGroup() {
    return exerciseGroup;
  }


  public void setExerciseGroup(ExerciseGroup exerciseGroup) {
    this.exerciseGroup = exerciseGroup;
  }


  public Exercise gradingCriteria(List<GradingCriterion> gradingCriteria) {
    
    this.gradingCriteria = gradingCriteria;
    return this;
  }

  public Exercise addGradingCriteriaItem(GradingCriterion gradingCriteriaItem) {
    if (this.gradingCriteria == null) {
      this.gradingCriteria = new ArrayList<>();
    }
    this.gradingCriteria.add(gradingCriteriaItem);
    return this;
  }

   /**
   * Get gradingCriteria
   * @return gradingCriteria
  **/


  public List<GradingCriterion> getGradingCriteria() {
    return gradingCriteria;
  }


  public void setGradingCriteria(List<GradingCriterion> gradingCriteria) {
    this.gradingCriteria = gradingCriteria;
  }


  public Exercise studentParticipations(Set<StudentParticipation> studentParticipations) {
    
    this.studentParticipations = studentParticipations;
    return this;
  }

  public Exercise addStudentParticipationsItem(StudentParticipation studentParticipationsItem) {
    if (this.studentParticipations == null) {
      this.studentParticipations = new LinkedHashSet<>();
    }
    this.studentParticipations.add(studentParticipationsItem);
    return this;
  }

   /**
   * Get studentParticipations
   * @return studentParticipations
  **/


  public Set<StudentParticipation> getStudentParticipations() {
    return studentParticipations;
  }


  public void setStudentParticipations(Set<StudentParticipation> studentParticipations) {
    this.studentParticipations = studentParticipations;
  }


  public Exercise tutorParticipations(Set<TutorParticipation> tutorParticipations) {
    
    this.tutorParticipations = tutorParticipations;
    return this;
  }

  public Exercise addTutorParticipationsItem(TutorParticipation tutorParticipationsItem) {
    if (this.tutorParticipations == null) {
      this.tutorParticipations = new LinkedHashSet<>();
    }
    this.tutorParticipations.add(tutorParticipationsItem);
    return this;
  }

   /**
   * Get tutorParticipations
   * @return tutorParticipations
  **/


  public Set<TutorParticipation> getTutorParticipations() {
    return tutorParticipations;
  }


  public void setTutorParticipations(Set<TutorParticipation> tutorParticipations) {
    this.tutorParticipations = tutorParticipations;
  }


  public Exercise exampleSubmissions(Set<ExampleSubmission> exampleSubmissions) {
    
    this.exampleSubmissions = exampleSubmissions;
    return this;
  }

  public Exercise addExampleSubmissionsItem(ExampleSubmission exampleSubmissionsItem) {
    if (this.exampleSubmissions == null) {
      this.exampleSubmissions = new LinkedHashSet<>();
    }
    this.exampleSubmissions.add(exampleSubmissionsItem);
    return this;
  }

   /**
   * Get exampleSubmissions
   * @return exampleSubmissions
  **/


  public Set<ExampleSubmission> getExampleSubmissions() {
    return exampleSubmissions;
  }


  public void setExampleSubmissions(Set<ExampleSubmission> exampleSubmissions) {
    this.exampleSubmissions = exampleSubmissions;
  }


  public Exercise attachments(Set<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public Exercise addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new LinkedHashSet<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/


  public Set<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(Set<Attachment> attachments) {
    this.attachments = attachments;
  }


  public Exercise posts(Set<Post> posts) {
    
    this.posts = posts;
    return this;
  }

  public Exercise addPostsItem(Post postsItem) {
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


  public Exercise plagiarismCases(Set<PlagiarismCase> plagiarismCases) {
    
    this.plagiarismCases = plagiarismCases;
    return this;
  }

  public Exercise addPlagiarismCasesItem(PlagiarismCase plagiarismCasesItem) {
    if (this.plagiarismCases == null) {
      this.plagiarismCases = new LinkedHashSet<>();
    }
    this.plagiarismCases.add(plagiarismCasesItem);
    return this;
  }

   /**
   * Get plagiarismCases
   * @return plagiarismCases
  **/


  public Set<PlagiarismCase> getPlagiarismCases() {
    return plagiarismCases;
  }


  public void setPlagiarismCases(Set<PlagiarismCase> plagiarismCases) {
    this.plagiarismCases = plagiarismCases;
  }


  public Exercise numberOfAssessmentsOfCorrectionRounds(List<DueDateStat> numberOfAssessmentsOfCorrectionRounds) {
    
    this.numberOfAssessmentsOfCorrectionRounds = numberOfAssessmentsOfCorrectionRounds;
    return this;
  }

  public Exercise addNumberOfAssessmentsOfCorrectionRoundsItem(DueDateStat numberOfAssessmentsOfCorrectionRoundsItem) {
    if (this.numberOfAssessmentsOfCorrectionRounds == null) {
      this.numberOfAssessmentsOfCorrectionRounds = new ArrayList<>();
    }
    this.numberOfAssessmentsOfCorrectionRounds.add(numberOfAssessmentsOfCorrectionRoundsItem);
    return this;
  }

   /**
   * Get numberOfAssessmentsOfCorrectionRounds
   * @return numberOfAssessmentsOfCorrectionRounds
  **/


  public List<DueDateStat> getNumberOfAssessmentsOfCorrectionRounds() {
    return numberOfAssessmentsOfCorrectionRounds;
  }


  public void setNumberOfAssessmentsOfCorrectionRounds(List<DueDateStat> numberOfAssessmentsOfCorrectionRounds) {
    this.numberOfAssessmentsOfCorrectionRounds = numberOfAssessmentsOfCorrectionRounds;
  }


  public Exercise totalNumberOfAssessments(DueDateStat totalNumberOfAssessments) {
    
    this.totalNumberOfAssessments = totalNumberOfAssessments;
    return this;
  }

   /**
   * Get totalNumberOfAssessments
   * @return totalNumberOfAssessments
  **/


  public DueDateStat getTotalNumberOfAssessments() {
    return totalNumberOfAssessments;
  }


  public void setTotalNumberOfAssessments(DueDateStat totalNumberOfAssessments) {
    this.totalNumberOfAssessments = totalNumberOfAssessments;
  }


  public Exercise averageRating(Double averageRating) {
    
    this.averageRating = averageRating;
    return this;
  }

   /**
   * Get averageRating
   * @return averageRating
  **/


  public Double getAverageRating() {
    return averageRating;
  }


  public void setAverageRating(Double averageRating) {
    this.averageRating = averageRating;
  }


  public Exercise numberOfRatings(Long numberOfRatings) {
    
    this.numberOfRatings = numberOfRatings;
    return this;
  }

   /**
   * Get numberOfRatings
   * @return numberOfRatings
  **/


  public Long getNumberOfRatings() {
    return numberOfRatings;
  }


  public void setNumberOfRatings(Long numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }


  public Exercise numberOfSubmissions(DueDateStat numberOfSubmissions) {
    
    this.numberOfSubmissions = numberOfSubmissions;
    return this;
  }

   /**
   * Get numberOfSubmissions
   * @return numberOfSubmissions
  **/


  public DueDateStat getNumberOfSubmissions() {
    return numberOfSubmissions;
  }


  public void setNumberOfSubmissions(DueDateStat numberOfSubmissions) {
    this.numberOfSubmissions = numberOfSubmissions;
  }


  public Exercise numberOfOpenComplaints(Long numberOfOpenComplaints) {
    
    this.numberOfOpenComplaints = numberOfOpenComplaints;
    return this;
  }

   /**
   * Get numberOfOpenComplaints
   * @return numberOfOpenComplaints
  **/


  public Long getNumberOfOpenComplaints() {
    return numberOfOpenComplaints;
  }


  public void setNumberOfOpenComplaints(Long numberOfOpenComplaints) {
    this.numberOfOpenComplaints = numberOfOpenComplaints;
  }


  public Exercise numberOfComplaints(Long numberOfComplaints) {
    
    this.numberOfComplaints = numberOfComplaints;
    return this;
  }

   /**
   * Get numberOfComplaints
   * @return numberOfComplaints
  **/


  public Long getNumberOfComplaints() {
    return numberOfComplaints;
  }


  public void setNumberOfComplaints(Long numberOfComplaints) {
    this.numberOfComplaints = numberOfComplaints;
  }


  public Exercise numberOfOpenMoreFeedbackRequests(Long numberOfOpenMoreFeedbackRequests) {
    
    this.numberOfOpenMoreFeedbackRequests = numberOfOpenMoreFeedbackRequests;
    return this;
  }

   /**
   * Get numberOfOpenMoreFeedbackRequests
   * @return numberOfOpenMoreFeedbackRequests
  **/


  public Long getNumberOfOpenMoreFeedbackRequests() {
    return numberOfOpenMoreFeedbackRequests;
  }


  public void setNumberOfOpenMoreFeedbackRequests(Long numberOfOpenMoreFeedbackRequests) {
    this.numberOfOpenMoreFeedbackRequests = numberOfOpenMoreFeedbackRequests;
  }


  public Exercise numberOfMoreFeedbackRequests(Long numberOfMoreFeedbackRequests) {
    
    this.numberOfMoreFeedbackRequests = numberOfMoreFeedbackRequests;
    return this;
  }

   /**
   * Get numberOfMoreFeedbackRequests
   * @return numberOfMoreFeedbackRequests
  **/


  public Long getNumberOfMoreFeedbackRequests() {
    return numberOfMoreFeedbackRequests;
  }


  public void setNumberOfMoreFeedbackRequests(Long numberOfMoreFeedbackRequests) {
    this.numberOfMoreFeedbackRequests = numberOfMoreFeedbackRequests;
  }


  public Exercise exerciseType(ExerciseTypeEnum exerciseType) {
    
    this.exerciseType = exerciseType;
    return this;
  }

   /**
   * Get exerciseType
   * @return exerciseType
  **/


  public ExerciseTypeEnum getExerciseType() {
    return exerciseType;
  }


  public void setExerciseType(ExerciseTypeEnum exerciseType) {
    this.exerciseType = exerciseType;
  }


  public Exercise studentAssignedTeamId(Long studentAssignedTeamId) {
    
    this.studentAssignedTeamId = studentAssignedTeamId;
    return this;
  }

   /**
   * Get studentAssignedTeamId
   * @return studentAssignedTeamId
  **/


  public Long getStudentAssignedTeamId() {
    return studentAssignedTeamId;
  }


  public void setStudentAssignedTeamId(Long studentAssignedTeamId) {
    this.studentAssignedTeamId = studentAssignedTeamId;
  }


  public Exercise studentAssignedTeamIdComputed(Boolean studentAssignedTeamIdComputed) {
    
    this.studentAssignedTeamIdComputed = studentAssignedTeamIdComputed;
    return this;
  }

   /**
   * Get studentAssignedTeamIdComputed
   * @return studentAssignedTeamIdComputed
  **/


  public Boolean getStudentAssignedTeamIdComputed() {
    return studentAssignedTeamIdComputed;
  }


  public void setStudentAssignedTeamIdComputed(Boolean studentAssignedTeamIdComputed) {
    this.studentAssignedTeamIdComputed = studentAssignedTeamIdComputed;
  }


  public Exercise gradingInstructionFeedbackUsed(Boolean gradingInstructionFeedbackUsed) {
    
    this.gradingInstructionFeedbackUsed = gradingInstructionFeedbackUsed;
    return this;
  }

   /**
   * Get gradingInstructionFeedbackUsed
   * @return gradingInstructionFeedbackUsed
  **/


  public Boolean getGradingInstructionFeedbackUsed() {
    return gradingInstructionFeedbackUsed;
  }


  public void setGradingInstructionFeedbackUsed(Boolean gradingInstructionFeedbackUsed) {
    this.gradingInstructionFeedbackUsed = gradingInstructionFeedbackUsed;
  }


  public Exercise numberOfParticipations(Long numberOfParticipations) {
    
    this.numberOfParticipations = numberOfParticipations;
    return this;
  }

   /**
   * Get numberOfParticipations
   * @return numberOfParticipations
  **/


  public Long getNumberOfParticipations() {
    return numberOfParticipations;
  }


  public void setNumberOfParticipations(Long numberOfParticipations) {
    this.numberOfParticipations = numberOfParticipations;
  }


  public Exercise exampleSolutionPublished(Boolean exampleSolutionPublished) {
    
    this.exampleSolutionPublished = exampleSolutionPublished;
    return this;
  }

   /**
   * Get exampleSolutionPublished
   * @return exampleSolutionPublished
  **/


  public Boolean getExampleSolutionPublished() {
    return exampleSolutionPublished;
  }


  public void setExampleSolutionPublished(Boolean exampleSolutionPublished) {
    this.exampleSolutionPublished = exampleSolutionPublished;
  }


  public Exercise released(Boolean released) {
    
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/


  public Boolean getReleased() {
    return released;
  }


  public void setReleased(Boolean released) {
    this.released = released;
  }


  public Exercise testRunParticipationsExist(Boolean testRunParticipationsExist) {
    
    this.testRunParticipationsExist = testRunParticipationsExist;
    return this;
  }

   /**
   * Get testRunParticipationsExist
   * @return testRunParticipationsExist
  **/


  public Boolean getTestRunParticipationsExist() {
    return testRunParticipationsExist;
  }


  public void setTestRunParticipationsExist(Boolean testRunParticipationsExist) {
    this.testRunParticipationsExist = testRunParticipationsExist;
  }


  public Exercise teamMode(Boolean teamMode) {
    
    this.teamMode = teamMode;
    return this;
  }

   /**
   * Get teamMode
   * @return teamMode
  **/


  public Boolean getTeamMode() {
    return teamMode;
  }


  public void setTeamMode(Boolean teamMode) {
    this.teamMode = teamMode;
  }


  public Exercise visibleToStudents(Boolean visibleToStudents) {
    
    this.visibleToStudents = visibleToStudents;
    return this;
  }

   /**
   * Get visibleToStudents
   * @return visibleToStudents
  **/


  public Boolean getVisibleToStudents() {
    return visibleToStudents;
  }


  public void setVisibleToStudents(Boolean visibleToStudents) {
    this.visibleToStudents = visibleToStudents;
  }


  public Exercise type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exercise exercise = (Exercise) o;
    return Objects.equals(this.id, exercise.id) &&
        Objects.equals(this.title, exercise.title) &&
        Objects.equals(this.shortName, exercise.shortName) &&
        Objects.equals(this.maxPoints, exercise.maxPoints) &&
        Objects.equals(this.bonusPoints, exercise.bonusPoints) &&
        Objects.equals(this.assessmentType, exercise.assessmentType) &&
        Objects.equals(this.releaseDate, exercise.releaseDate) &&
        Objects.equals(this.startDate, exercise.startDate) &&
        Objects.equals(this.dueDate, exercise.dueDate) &&
        Objects.equals(this.assessmentDueDate, exercise.assessmentDueDate) &&
        Objects.equals(this.exampleSolutionPublicationDate, exercise.exampleSolutionPublicationDate) &&
        Objects.equals(this.difficulty, exercise.difficulty) &&
        Objects.equals(this.mode, exercise.mode) &&
        Objects.equals(this.allowComplaintsForAutomaticAssessments, exercise.allowComplaintsForAutomaticAssessments) &&
        Objects.equals(this.allowManualFeedbackRequests, exercise.allowManualFeedbackRequests) &&
        Objects.equals(this.includedInOverallScore, exercise.includedInOverallScore) &&
        Objects.equals(this.problemStatement, exercise.problemStatement) &&
        Objects.equals(this.gradingInstructions, exercise.gradingInstructions) &&
        Objects.equals(this.categories, exercise.categories) &&
        Objects.equals(this.teamAssignmentConfig, exercise.teamAssignmentConfig) &&
        Objects.equals(this.teams, exercise.teams) &&
        Objects.equals(this.presentationScoreEnabled, exercise.presentationScoreEnabled) &&
        Objects.equals(this.secondCorrectionEnabled, exercise.secondCorrectionEnabled) &&
        Objects.equals(this.course, exercise.course) &&
        Objects.equals(this.exerciseGroup, exercise.exerciseGroup) &&
        Objects.equals(this.gradingCriteria, exercise.gradingCriteria) &&
        Objects.equals(this.studentParticipations, exercise.studentParticipations) &&
        Objects.equals(this.tutorParticipations, exercise.tutorParticipations) &&
        Objects.equals(this.exampleSubmissions, exercise.exampleSubmissions) &&
        Objects.equals(this.attachments, exercise.attachments) &&
        Objects.equals(this.posts, exercise.posts) &&
        Objects.equals(this.plagiarismCases, exercise.plagiarismCases) &&
        Objects.equals(this.numberOfAssessmentsOfCorrectionRounds, exercise.numberOfAssessmentsOfCorrectionRounds) &&
        Objects.equals(this.totalNumberOfAssessments, exercise.totalNumberOfAssessments) &&
        Objects.equals(this.averageRating, exercise.averageRating) &&
        Objects.equals(this.numberOfRatings, exercise.numberOfRatings) &&
        Objects.equals(this.numberOfSubmissions, exercise.numberOfSubmissions) &&
        Objects.equals(this.numberOfOpenComplaints, exercise.numberOfOpenComplaints) &&
        Objects.equals(this.numberOfComplaints, exercise.numberOfComplaints) &&
        Objects.equals(this.numberOfOpenMoreFeedbackRequests, exercise.numberOfOpenMoreFeedbackRequests) &&
        Objects.equals(this.numberOfMoreFeedbackRequests, exercise.numberOfMoreFeedbackRequests) &&
        Objects.equals(this.exerciseType, exercise.exerciseType) &&
        Objects.equals(this.studentAssignedTeamId, exercise.studentAssignedTeamId) &&
        Objects.equals(this.studentAssignedTeamIdComputed, exercise.studentAssignedTeamIdComputed) &&
        Objects.equals(this.gradingInstructionFeedbackUsed, exercise.gradingInstructionFeedbackUsed) &&
        Objects.equals(this.numberOfParticipations, exercise.numberOfParticipations) &&
        Objects.equals(this.exampleSolutionPublished, exercise.exampleSolutionPublished) &&
        Objects.equals(this.released, exercise.released) &&
        Objects.equals(this.testRunParticipationsExist, exercise.testRunParticipationsExist) &&
        Objects.equals(this.teamMode, exercise.teamMode) &&
        Objects.equals(this.visibleToStudents, exercise.visibleToStudents) &&
        Objects.equals(this.type, exercise.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, shortName, maxPoints, bonusPoints, assessmentType, releaseDate, startDate, dueDate, assessmentDueDate, exampleSolutionPublicationDate, difficulty, mode, allowComplaintsForAutomaticAssessments, allowManualFeedbackRequests, includedInOverallScore, problemStatement, gradingInstructions, categories, teamAssignmentConfig, teams, presentationScoreEnabled, secondCorrectionEnabled, course, exerciseGroup, gradingCriteria, studentParticipations, tutorParticipations, exampleSubmissions, attachments, posts, plagiarismCases, numberOfAssessmentsOfCorrectionRounds, totalNumberOfAssessments, averageRating, numberOfRatings, numberOfSubmissions, numberOfOpenComplaints, numberOfComplaints, numberOfOpenMoreFeedbackRequests, numberOfMoreFeedbackRequests, exerciseType, studentAssignedTeamId, studentAssignedTeamIdComputed, gradingInstructionFeedbackUsed, numberOfParticipations, exampleSolutionPublished, released, testRunParticipationsExist, teamMode, visibleToStudents, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exercise {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    bonusPoints: ").append(toIndentedString(bonusPoints)).append("\n");
    sb.append("    assessmentType: ").append(toIndentedString(assessmentType)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    assessmentDueDate: ").append(toIndentedString(assessmentDueDate)).append("\n");
    sb.append("    exampleSolutionPublicationDate: ").append(toIndentedString(exampleSolutionPublicationDate)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    allowComplaintsForAutomaticAssessments: ").append(toIndentedString(allowComplaintsForAutomaticAssessments)).append("\n");
    sb.append("    allowManualFeedbackRequests: ").append(toIndentedString(allowManualFeedbackRequests)).append("\n");
    sb.append("    includedInOverallScore: ").append(toIndentedString(includedInOverallScore)).append("\n");
    sb.append("    problemStatement: ").append(toIndentedString(problemStatement)).append("\n");
    sb.append("    gradingInstructions: ").append(toIndentedString(gradingInstructions)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    teamAssignmentConfig: ").append(toIndentedString(teamAssignmentConfig)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    presentationScoreEnabled: ").append(toIndentedString(presentationScoreEnabled)).append("\n");
    sb.append("    secondCorrectionEnabled: ").append(toIndentedString(secondCorrectionEnabled)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    exerciseGroup: ").append(toIndentedString(exerciseGroup)).append("\n");
    sb.append("    gradingCriteria: ").append(toIndentedString(gradingCriteria)).append("\n");
    sb.append("    studentParticipations: ").append(toIndentedString(studentParticipations)).append("\n");
    sb.append("    tutorParticipations: ").append(toIndentedString(tutorParticipations)).append("\n");
    sb.append("    exampleSubmissions: ").append(toIndentedString(exampleSubmissions)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    plagiarismCases: ").append(toIndentedString(plagiarismCases)).append("\n");
    sb.append("    numberOfAssessmentsOfCorrectionRounds: ").append(toIndentedString(numberOfAssessmentsOfCorrectionRounds)).append("\n");
    sb.append("    totalNumberOfAssessments: ").append(toIndentedString(totalNumberOfAssessments)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    numberOfRatings: ").append(toIndentedString(numberOfRatings)).append("\n");
    sb.append("    numberOfSubmissions: ").append(toIndentedString(numberOfSubmissions)).append("\n");
    sb.append("    numberOfOpenComplaints: ").append(toIndentedString(numberOfOpenComplaints)).append("\n");
    sb.append("    numberOfComplaints: ").append(toIndentedString(numberOfComplaints)).append("\n");
    sb.append("    numberOfOpenMoreFeedbackRequests: ").append(toIndentedString(numberOfOpenMoreFeedbackRequests)).append("\n");
    sb.append("    numberOfMoreFeedbackRequests: ").append(toIndentedString(numberOfMoreFeedbackRequests)).append("\n");
    sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
    sb.append("    studentAssignedTeamId: ").append(toIndentedString(studentAssignedTeamId)).append("\n");
    sb.append("    studentAssignedTeamIdComputed: ").append(toIndentedString(studentAssignedTeamIdComputed)).append("\n");
    sb.append("    gradingInstructionFeedbackUsed: ").append(toIndentedString(gradingInstructionFeedbackUsed)).append("\n");
    sb.append("    numberOfParticipations: ").append(toIndentedString(numberOfParticipations)).append("\n");
    sb.append("    exampleSolutionPublished: ").append(toIndentedString(exampleSolutionPublished)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    testRunParticipationsExist: ").append(toIndentedString(testRunParticipationsExist)).append("\n");
    sb.append("    teamMode: ").append(toIndentedString(teamMode)).append("\n");
    sb.append("    visibleToStudents: ").append(toIndentedString(visibleToStudents)).append("\n");
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
}

