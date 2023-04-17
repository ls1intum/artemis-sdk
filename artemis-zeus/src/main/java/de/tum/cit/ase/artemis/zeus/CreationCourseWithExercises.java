package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.model.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Mixin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.time.OffsetDateTime;

@Command(name = "courseWithExercises", description = "creates an Artemis course with exercises",
        mixinStandardHelpOptions = true)
public class CreationCourseWithExercises implements Callable<Integer> {

    @Option(names = {"--shortName"}, required = true)
    private String shortName;

    @Option(names = {"--title"}, required = true)
    private String title;

    private static Logger logger = LogManager.getLogger();
    @Mixin LoggingMixin loggingMixin;

    @Override
    public Integer call() throws URISyntaxException {
        Zeus.prepareRestClient();
        // create a course
        //TODO: extract this to a function in other class to avoid duplicate code?
        //TODO: extract default values into constructor with default values maybe instead of empty one?
        Course course = new Course()
                .testCourse(true)
                .shortName(shortName)
                .title(title)
                .registrationEnabled(false)
                .presentationScore(0)
                .testCourse(true)
                .onlineCourse(false)
                .complaintsEnabled(true)
                .requestMoreFeedbackEnabled(true)
                .accuracyOfScores(1)
                .maxComplaints(3)
                .maxTeamComplaints(3)
                .maxComplaintTimeDays(7)
                .maxComplaintTextLimit(2000)
                .maxComplaintResponseTextLimit(2000)
                .maxRequestMoreFeedbackTimeDays(7)
                .courseInformationSharingConfiguration(Course.CourseInformationSharingConfigurationEnum.DISABLED);
        course = Zeus.getAdminCourseResourceApi().createCourse(course, null);

        long startTimeCourseCreation = System.currentTimeMillis();

        // values used in multiple exercises
        String pregeneratedTitlePrefix = title + " pre-generated ";
        DueDateStat zeroDueDateStat = new DueDateStat()
                .late(0L)
                .inTime(0L);
        List<DueDateStat> quizExerciseDueDateStats = new ArrayList<DueDateStat>(1);
        quizExerciseDueDateStats.add(zeroDueDateStat);

        // create a Text Exercise inside the course
        TextExercise textExercise = (TextExercise) new TextExercise()
                .title(pregeneratedTitlePrefix + "Text Exercise")
                .maxPoints(5.0)
                .course(course)
                .problemStatement("Cypress Problem Statement")
                .gradingInstructions("Cypress Assessment Instructions")
                .allowComplaintsForAutomaticAssessments(false)
                .allowManualFeedbackRequests(false)
                .assessmentType(Exercise.AssessmentTypeEnum.MANUAL)
                .bonusPoints(0.0)
                .includedInOverallScore(Exercise.IncludedInOverallScoreEnum.INCLUDED_COMPLETELY)
                .mode(Exercise.ModeEnum.INDIVIDUAL)
                .numberOfAssessmentsOfCorrectionRounds(quizExerciseDueDateStats)
                .presentationScoreEnabled(false)
                .secondCorrectionEnabled(false)
                .studentAssignedTeamIdComputed(false)
                .teamMode(false);
        textExercise = Zeus.getTextExerciseResourceApi().createTextExercise(textExercise);

        // create a Modeling Exercise inside the course
        ModelingExercise modelingExercise = (ModelingExercise) new ModelingExercise()
                .diagramType(ModelingExercise.DiagramTypeEnum.CLASSDIAGRAM)
                .exampleSolutionExplanation("Example Solution Explanation")
                .exampleSolutionModel("{\"version\":\"2.0.0\",\"type\":\"ClassDiagram\",\"size\":{\"width\":640,\"height\":600},\"interactive\":{\"elements\":[],\"relationships\":[]},\"elements\":[{\"id\":\"6e1f57c6-cbc7-4b97-9df9-c5741dc905fa\",\"name\":\"Package\",\"type\":\"Package\",\"owner\":null,\"bounds\":{\"x\":230,\"y\":0,\"width\":200,\"height\":100}},{\"id\":\"ff7e3be0-9765-4301-baf5-cf9cf2f17c3c\",\"name\":\"Class\",\"type\":\"Class\",\"owner\":null,\"bounds\":{\"x\":0,\"y\":220,\"width\":200,\"height\":100},\"attributes\":[\"de2d464b-f969-4cf3-ac0d-2f300b3a6497\"],\"methods\":[\"084a59b9-3009-4ebd-885c-159b436581d9\"]},{\"id\":\"de2d464b-f969-4cf3-ac0d-2f300b3a6497\",\"name\":\"+ attribute: Type\",\"type\":\"ClassAttribute\",\"owner\":\"ff7e3be0-9765-4301-baf5-cf9cf2f17c3c\",\"bounds\":{\"x\":0,\"y\":260,\"width\":200,\"height\":30}},{\"id\":\"084a59b9-3009-4ebd-885c-159b436581d9\",\"name\":\"+ method()\",\"type\":\"ClassMethod\",\"owner\":\"ff7e3be0-9765-4301-baf5-cf9cf2f17c3c\",\"bounds\":{\"x\":0,\"y\":290,\"width\":200,\"height\":30}},{\"id\":\"1ad94aff-ee37-494f-8b99-9d861dc58e4a\",\"name\":\"Abstract\",\"type\":\"AbstractClass\",\"owner\":null,\"bounds\":{\"x\":380,\"y\":220,\"width\":200,\"height\":110},\"attributes\":[\"4d58287c-d4c0-42d1-9d02-ad239b701de6\"],\"methods\":[\"2de2a7c3-19c9-4534-8a71-f6607e93556c\"]},{\"id\":\"4d58287c-d4c0-42d1-9d02-ad239b701de6\",\"name\":\"+ attribute: Type\",\"type\":\"ClassAttribute\",\"owner\":\"1ad94aff-ee37-494f-8b99-9d861dc58e4a\",\"bounds\":{\"x\":380,\"y\":270,\"width\":200,\"height\":30}},{\"id\":\"2de2a7c3-19c9-4534-8a71-f6607e93556c\",\"name\":\"+ method()\",\"type\":\"ClassMethod\",\"owner\":\"1ad94aff-ee37-494f-8b99-9d861dc58e4a\",\"bounds\":{\"x\":380,\"y\":300,\"width\":200,\"height\":30}}],\"relationships\":[],\"assessments\":[]}")
                .title(pregeneratedTitlePrefix + "Modeling Exercise")
                .maxPoints(5.0)
                .course(course)
                .allowComplaintsForAutomaticAssessments(false)
                .allowManualFeedbackRequests(false)
                .assessmentType(Exercise.AssessmentTypeEnum.SEMI_AUTOMATIC)
                .bonusPoints(0.0)
                .includedInOverallScore(Exercise.IncludedInOverallScoreEnum.INCLUDED_COMPLETELY)
                .mode(Exercise.ModeEnum.INDIVIDUAL)
                .numberOfAssessmentsOfCorrectionRounds(quizExerciseDueDateStats)
                .presentationScoreEnabled(false)
                .secondCorrectionEnabled(false)
                .studentAssignedTeamIdComputed(false)
                .teamMode(false);
        modelingExercise = Zeus.getModelingExerciseResourceApi().createModelingExercise(modelingExercise);

        // create a File Upload Exercise inside the course
        FileUploadExercise fileUploadExercise = (FileUploadExercise) new FileUploadExercise()
                .filePattern("png, pdf")
                .exampleSolution("Example Solution")
                .title(pregeneratedTitlePrefix + "File Upload Exercise")
                .maxPoints(5.0)
                .course(course)
                .allowComplaintsForAutomaticAssessments(false)
                .allowManualFeedbackRequests(false)
                .bonusPoints(0.0)
                .includedInOverallScore(Exercise.IncludedInOverallScoreEnum.INCLUDED_COMPLETELY)
                .mode(Exercise.ModeEnum.INDIVIDUAL)
                .numberOfAssessmentsOfCorrectionRounds(quizExerciseDueDateStats)
                .presentationScoreEnabled(false)
                .problemStatement("Problem Statement")
                .secondCorrectionEnabled(false)
                .studentAssignedTeamIdComputed(false)
                .teamMode(false);
        fileUploadExercise = Zeus.getFileUploadExerciseResourceApi().createFileUploadExercise(fileUploadExercise);

        // create a Quiz Exercise with all three different Quiz Question types inside the course
        List<QuizQuestion> quizQuestions = new ArrayList<QuizQuestion>(3);
        // create Multiple Choice question
        List<AnswerOption> mcAnswerOptions = new ArrayList<AnswerOption>(4);
        AnswerOption answerOptionCorrect1 = new AnswerOption()
                .text("Correct answer 1")
                .isCorrect(true)
                .hint("A hint")
                .explanation("Explanation for why this is correct")
                .invalid(false);
        AnswerOption answerOptionCorrect2 = new AnswerOption()
                .text("Correct answer 2")
                .isCorrect(true)
                .hint("A hint")
                .explanation("Explanation for why this is correct")
                .invalid(false);
        AnswerOption answerOptionWrong1 = new AnswerOption()
                .text("Wrong answer 1")
                .isCorrect(false)
                .hint("A hint")
                .explanation("Explanation for why this is wrong")
                .invalid(false);
        AnswerOption answerOptionWrong2 = new AnswerOption()
                .text("Wrong answer 2")
                .isCorrect(false)
                .hint("A hint")
                .explanation("Explanation for why this is wrong")
                .invalid(false);
        Collections.addAll(mcAnswerOptions, answerOptionCorrect1, answerOptionCorrect2, answerOptionWrong1, answerOptionWrong2);
        MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion) new MultipleChoiceQuestion()
                .answerOptions(mcAnswerOptions)
                .title(pregeneratedTitlePrefix + "Multiple Choice Question")
                .points(5)
                .hint("A general hint")
                .invalid(false)
                .randomizeOrder(true)
                .scoringType(QuizQuestion.ScoringTypeEnum.ALL_OR_NOTHING)
                .text("A longer more detailed question");
        quizQuestions.add(multipleChoiceQuestion);
        // create Drag and Drop question (Data partly extracted from Cypress tests)
        File backgroundImage = new File(getClass().getResource("/testdata/DragAndDropQuiz/background.jpg").toURI());
        String backgroundImagePathJSON = Zeus.getFileResourceApi().saveFile(backgroundImage, false);
        // TODO: rethink if it's possible to extract the path in a nicer way than extracting it here?!
        String backgroundImagePath = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(backgroundImagePathJSON);
            backgroundImagePath = node.get("path").asText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.debug(backgroundImagePath);
        List<DropLocation> daDDropLocations = new ArrayList<DropLocation>(1);
        DropLocation dropLocationRick = new DropLocation()
                .height(48.0)
                .width(65.0)
                .posX(13.0)
                .posY(33.0)
                .invalid(false)
                .tempID(7170294773462663L);
        daDDropLocations.add(dropLocationRick);
        List<DragItem> dragItems = new ArrayList<DragItem>(1);
        DragItem dragItemRick = new DragItem()
                .text("Rick Astley")
                .invalid(false)
                .tempID(8529400742894698L);
        dragItems.add(dragItemRick);
        List<DragAndDropMapping> daDCorrectMappings = new ArrayList<DragAndDropMapping>(1);
        DragAndDropMapping dragAndDropMappingA = new DragAndDropMapping()
                .dropLocation(dropLocationRick)
                .dragItem(dragItemRick)
                .invalid(false);
        daDCorrectMappings.add(dragAndDropMappingA);
        DragAndDropQuestion dragAndDropQuestion = (DragAndDropQuestion) new DragAndDropQuestion()
                .correctMappings(daDCorrectMappings)
                .dragItems(dragItems)
                .dropLocations(daDDropLocations)
                .backgroundFilePath(backgroundImagePath)
                .title(pregeneratedTitlePrefix + "Drag and Drop Question")
                .text("Who is never going to give you up?")
                .hint("His first name is Rick")
                .points(5)
                .randomizeOrder(true)
                .scoringType(QuizQuestion.ScoringTypeEnum.PROPORTIONAL_WITH_PENALTY)
                .invalid(false);
        quizQuestions.add(dragAndDropQuestion);
        // create Short Answer question
        List<ShortAnswerSpot> saShortAnswerSpots = new ArrayList<>(6);
        ShortAnswerSpot saSpotGive = new ShortAnswerSpot().spotNr(1).width(15).tempID(5788504999638874L).invalid(false);
        ShortAnswerSpot saSpotLet = new ShortAnswerSpot().spotNr(2).width(15).tempID(4033038533132124L).invalid(false);
        ShortAnswerSpot saSpotRun = new ShortAnswerSpot().spotNr(3).width(15).tempID(3854918638863802L).invalid(false);
        ShortAnswerSpot saSpotDesert = new ShortAnswerSpot().spotNr(4).width(15).tempID(2749837190480492L).invalid(false);
        ShortAnswerSpot saSpotCry = new ShortAnswerSpot().spotNr(5).width(15).tempID(5692884699331129L).invalid(false);
        ShortAnswerSpot saSpotGoodbye = new ShortAnswerSpot().spotNr(6).width(15).tempID(7082779828769886L).invalid(false);
        Collections.addAll(saShortAnswerSpots, saSpotGive, saSpotLet, saSpotRun, saSpotDesert, saSpotCry, saSpotGoodbye);
        List<ShortAnswerSolution> saShortAnswerSolutions = new ArrayList<>(6);
        ShortAnswerSolution saSolutionGive = new ShortAnswerSolution().text("give").tempID(1594916108236791L).invalid(false);
        ShortAnswerSolution saSolutionLet = new ShortAnswerSolution().text("let").tempID(4033038533132124L).invalid(false);
        ShortAnswerSolution saSolutionRun = new ShortAnswerSolution().text("run").tempID(3854918638863802L).invalid(false);
        ShortAnswerSolution saSolutionDesert = new ShortAnswerSolution().text("desert").tempID(2749837190480492L).invalid(false);
        ShortAnswerSolution saSolutionCry = new ShortAnswerSolution().text("cry").tempID(5692884699331129L).invalid(false);
        ShortAnswerSolution saSolutionGoodbye = new ShortAnswerSolution().text("goodbye").tempID(7082779828769886L).invalid(false);
        Collections.addAll(saShortAnswerSolutions, saSolutionGive, saSolutionLet, saSolutionRun, saSolutionDesert,
                saSolutionCry, saSolutionGoodbye);
        List<ShortAnswerMapping> saCorrectMappings = new ArrayList<>(6);
        ShortAnswerMapping saMappingGive = new ShortAnswerMapping().spot(saSpotGive).solution(saSolutionGive).invalid(false);
        ShortAnswerMapping saMappingLet = new ShortAnswerMapping().spot(saSpotLet).solution(saSolutionLet).invalid(false);
        ShortAnswerMapping saMappingRun = new ShortAnswerMapping().spot(saSpotRun).solution(saSolutionRun).invalid(false);
        ShortAnswerMapping saMappingDesert = new ShortAnswerMapping().spot(saSpotDesert).solution(saSolutionDesert).invalid(false);
        ShortAnswerMapping saMappingCry = new ShortAnswerMapping().spot(saSpotCry).solution(saSolutionCry).invalid(false);
        ShortAnswerMapping saMappingGoodbye = new ShortAnswerMapping().spot(saSpotGoodbye).solution(saSolutionGoodbye).invalid(false);
        Collections.addAll(saCorrectMappings, saMappingGive, saMappingLet, saMappingRun, saMappingDesert, saMappingCry,
                saMappingGoodbye);
        ShortAnswerQuestion shortAnswerQuestion = (ShortAnswerQuestion) new ShortAnswerQuestion()
                .correctMappings(saCorrectMappings)
                .solutions(saShortAnswerSolutions)
                .spots(saShortAnswerSpots)
                .similarityValue(85)
                .matchLetterCase(false)
                .text("Never gonna [-spot 1] you up\n"
                        + "Never gonna [-spot 2] you down\n"
                        + "Never gonna [-spot 3] around and [-spot 4] you\n"
                        + "Never gonna make you [-spot 5]\n"
                        + "Never gonna say [-spot 6]\n"
                        + "Never gonna tell a lie and hurt you")
                .title(pregeneratedTitlePrefix + "Short Answer Question")
                .points(5)
                .invalid(false)
                .randomizeOrder(true)
                .scoringType(QuizQuestion.ScoringTypeEnum.PROPORTIONAL_WITHOUT_PENALTY);
        quizQuestions.add(shortAnswerQuestion);
        //create quiz exercise
        QuizExercise quizExercise = (QuizExercise) new QuizExercise()
                .quizQuestions(quizQuestions)
                .duration(600)
                .maxPoints(15.0)
                .title(pregeneratedTitlePrefix + "Quiz Exercise")
                .course(course)
                .allowComplaintsForAutomaticAssessments(false)
                .allowManualFeedbackRequests(false)
                .bonusPoints(0.0)
                .includedInOverallScore(Exercise.IncludedInOverallScoreEnum.INCLUDED_COMPLETELY)
                .mode(Exercise.ModeEnum.INDIVIDUAL)
                .numberOfAssessmentsOfCorrectionRounds(quizExerciseDueDateStats)
                .presentationScoreEnabled(false)
                .releaseDate(OffsetDateTime.now())
                .secondCorrectionEnabled(false)
                .teamMode(false);
        quizExercise = Zeus.getQuizExerciseResourceApi().createQuizExercise(quizExercise);

        //create programming exercise
        /* first check if two minutes have passed since the course creation as this is the default time in the Atlassian
           stack to sync users and groups which were created for the course
           TODO: maybe check somehow if the groups have been created and not wait for a fixed time
         */
        long elapsedTime = System.currentTimeMillis() - startTimeCourseCreation;
        if (elapsedTime < 2 * 60 * 1000) { // 2 minutes in milliseconds
            long remainingTime = 2 * 60 * 1000 - elapsedTime;
            try {
                Thread.sleep(remainingTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String programmingExerciseTitle = pregeneratedTitlePrefix + "Programming Exercise";
        ProgrammingExercise programmingExercise = (ProgrammingExercise) new ProgrammingExercise()
                .allowOfflineIde(true)
                .allowOnlineEditor(true)
                .checkoutSolutionRepository(false)
                .packageName(programmingExerciseTitle
                        .replace(" ", ".")
                        .replaceAll("[^a-zA-Z0-9]", "")
                        .toLowerCase())
                .programmingLanguage(ProgrammingExercise.ProgrammingLanguageEnum.JAVA)
                .projectType(ProgrammingExercise.ProjectTypeEnum.PLAIN_GRADLE)
                .publishBuildPlanUrl(false)
                .showTestNamesToStudents(false)
                .solutionParticipation(new SolutionProgrammingExerciseParticipation())
                .staticCodeAnalysisEnabled(false)
                .templateParticipation(new TemplateProgrammingExerciseParticipation())
                .testwiseCoverageEnabled(false)
                .title(programmingExerciseTitle)
                .course(course)
                .maxPoints(5.0)
                .problemStatement("# Sorting with the Strategy Pattern\n\n" +
                        "In this exercise, we want to implement sorting algorithms and choose them based on runtime specific variables.\n\n" +
                        "### Part 1: Sorting\n\n" +
                        "First, we need to implement two sorting algorithms, in this case `MergeSort` and `BubbleSort`.\n\n" +
                        "**You have the following tasks:**\n\n" +
                        "1. [task][Implement Bubble Sort](testBubbleSort)\n" +
                        "Implement the method `performSort(List<Date>)` in the class `BubbleSort`. Make sure to follow the Bubble Sort algorithm exactly.\n\n" +
                        "2. [task][Implement Merge Sort](testMergeSort)\n" +
                        "Implement the method `performSort(List<Date>)` in the class `MergeSort`. Make sure to follow the Merge Sort algorithm exactly.\n\n" +
                        "### Part 2: Strategy Pattern\n\n" +
                        "We want the application to apply different algorithms for sorting a `List` of `Date` objects.\n" +
                        "Use the strategy pattern to select the right sorting algorithm at runtime.\n\n" +
                        "**You have the following tasks:**\n\n1" +
                        ". [task][SortStrategy Interface](testClass[SortStrategy],testMethods[SortStrategy])\n" +
                        "Create a `SortStrategy` interface and adjust the sorting algorithms so that they implement this interface.\n\n" +
                        "2. [task][Context Class](testAttributes[Context],testMethods[Context])\n" +
                        "Create and implement a `Context` class following the below class diagram\n\n" +
                        "3. [task][Context Policy](testConstructors[Policy],testAttributes[Policy],testMethods[Policy])\n" +
                        "Create and implement a `Policy` class following the below class diagram with a simple configuration mechanism:\n\n" +
                        "    1. [task][Select MergeSort](testClass[MergeSort],testUseMergeSortForBigList)\n" +
                        "    Select `MergeSort` when the List has more than 10 dates.\n\n" +
                        "    2. [task][Select BubbleSort](testClass[BubbleSort],testUseBubbleSortForSmallList)\n" +
                        "    Select `BubbleSort` when the List has less or equal 10 dates.\n\n" +
                        "4. Complete the `Client` class which demonstrates switching between two strategies at runtime.\n\n" +
                        "@startuml\n\n" +
                        "class Client {\n" +
                        "}\n\n" +
                        "class Policy {\n" +
                        "  <color:testsColor(testMethods[Policy])>+configure()</color>\n" +
                        "}\n\n" +
                        "class Context {\n" +
                        "  <color:testsColor(testAttributes[Context])>-dates: List<Date></color>\n" +
                        "  <color:testsColor(testMethods[Context])>+sort()</color>\n}\n\n" +
                        "interface SortStrategy {" +
                        "  <color:testsColor(testMethods[SortStrategy])>+performSort(List<Date>)</color>\n}\n\n" +
                        "class BubbleSort {\n" +
                        "  <color:testsColor(testBubbleSort)>+performSort(List<Date>)</color>\n}\n\n" +
                        "class MergeSort {\n" +
                        "  <color:testsColor(testMergeSort)>+performSort(List<Date>)</color>\n" +
                        "}\n\n" +
                        "MergeSort -up-|> SortStrategy #testsColor(testClass[MergeSort])\n" +
                        "BubbleSort -up-|> SortStrategy #testsColor(testClass[BubbleSort])\n" +
                        "Policy -right-> Context #testsColor(testAttributes[Policy]): context\n" +
                        "Context -right-> SortStrategy #testsColor(testAttributes[Context]): sortAlgorithm\n" +
                        "Client .down.> Policy\n" +
                        "Client .down.> Context\n\n" +
                        "hide empty fields\n" +
                        "hide empty methods\n\n" +
                        "@enduml\n\n\n" +
                        "### Part 3: Optional Challenges\n\n" +
                        "(These are not tested)\n\n" +
                        "1. Create a new class `QuickSort` that implements `SortStrategy` and implement the Quick Sort algorithm.\n\n" +
                        "2. Make the method `performSort(List<Dates>)` generic, so that other objects can also be sorted by the same method.\n" +
                        "**Hint:** Have a look at Java Generics and the interface `Comparable`.\n\n" +
                        "3. Think about a useful decision in `Policy` when to use the new `QuickSort` algorithm.")
                .allowComplaintsForAutomaticAssessments(false)
                .allowManualFeedbackRequests(false)
                .assessmentType(Exercise.AssessmentTypeEnum.AUTOMATIC)
                .bonusPoints(0.0)
                .includedInOverallScore(Exercise.IncludedInOverallScoreEnum.INCLUDED_COMPLETELY)
                .mode(Exercise.ModeEnum.INDIVIDUAL)
                .numberOfAssessmentsOfCorrectionRounds(quizExerciseDueDateStats)
                .presentationScoreEnabled(false)
                .secondCorrectionEnabled(false)
                .shortName("gpe")
                .studentAssignedTeamIdComputed(false)
                .teamMode(false);
        programmingExercise = Zeus.getProgrammingExerciseResourceApi().createProgrammingExercise(programmingExercise);

        return 0;
    }
}
