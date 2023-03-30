package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.model.*;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Command(name = "courseWithExercises", description = "creates an Artemis course with exercises",
        mixinStandardHelpOptions = true)
public class CreationCourseWithExercises implements Callable<Integer> {

    @Option(names = {"--shortName"}, required = true)
    private String shortName;

    @Option(names = {"--title"}, required = true)
    private String title;

    @Override
    public Integer call() {
        Zeus.prepareRestClient();
        // create a course
        //TODO: extract this to a function in other class to avoid duplicate code?
        Course course = new Course()
                .testCourse(true)
                .shortName(shortName)
                .title(title)
                .registrationEnabled(false)
                .presentationScore(0);
        course = Zeus.getAdminCourseResourceApi().createCourse(course, null);

        String pregeneratedTitlePrefix = title + " pre-generated ";

        // create a Text Exercise inside the course
        TextExercise textExercise = (TextExercise) new TextExercise()
                .title(pregeneratedTitlePrefix + "Text Exercise")
                .maxPoints(5.0)
                .course(course);
        textExercise = Zeus.getTextExerciseResourceApi().createTextExercise(textExercise);

        // create a Modeling Exercise inside the course
        ModelingExercise modelingExercise = (ModelingExercise) new ModelingExercise()
                .title(pregeneratedTitlePrefix + "Modeling Exercise")
                .maxPoints(5.0)
                .course(course);
        modelingExercise = Zeus.getModelingExerciseResourceApi().createModelingExercise(modelingExercise);

        // create a File Upload Exercise inside the course
        FileUploadExercise fileUploadExercise = (FileUploadExercise) new FileUploadExercise()
                .filePattern("png, pdf")
                .title(pregeneratedTitlePrefix + "File Upload Exercise")
                .maxPoints(5.0)
                .course(course);
        fileUploadExercise = Zeus.getFileUploadExerciseResourceApi().createFileUploadExercise(fileUploadExercise);

        // create a Quiz Exercise with all three different Quiz Question types inside the course
        List<QuizQuestion> quizQuestions = new ArrayList<QuizQuestion>(3);
        // create Multiple Choice question
        List<AnswerOption> answerOptions = new ArrayList<AnswerOption>(2);
        AnswerOption answerOption1 = new AnswerOption()
                .text("Correct Answer Option")
                .hint("The correct answer ;)")
                .isCorrect(true);
        answerOptions.add(answerOption1);
        AnswerOption answerOption2 = new AnswerOption()
                .text("Wrong Answer Option")
                .isCorrect(false);
        answerOptions.add(answerOption2);
        MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion) new MultipleChoiceQuestion()
                .answerOptions(answerOptions)
                .title(pregeneratedTitlePrefix + "Multiple Choice Question")
                .points(5);
        quizQuestions.add(multipleChoiceQuestion);
        // create Drag and Drop question
        // String backgroundImagePath =  Zeus.getFileResourceApi().saveFile(false,
        //         new SaveMarkdownFileRequest()._file(new File("https://artemis.ase.in.tum.de/public/images/logo.png")));
        List<DragAndDropMapping>DaDCorrectMappings = new ArrayList<DragAndDropMapping>(2);
        DragAndDropMapping dragAndDropMappingA = new DragAndDropMapping()
                .dropLocation(new DropLocation()
                        .height(88.0)
                        .width(78.0)
                        .posX(0.0)
                        .posY(112.0));
        DaDCorrectMappings.add(dragAndDropMappingA);
        DragAndDropMapping dragAndDropMappingB = new DragAndDropMapping()
                .dropLocation(new DropLocation()
                        .height(88.0)
                        .width(78.0)
                        .posX(126.0)
                        .posY(112.0));
        DaDCorrectMappings.add(dragAndDropMappingB);
        List<DragItem> dragItems = new ArrayList<DragItem>(2);
        DragItem draqItemA = new DragItem()
                .text("A");
        dragItems.add(draqItemA);
        DragItem draqItemB = new DragItem()
                .text("B");
        dragItems.add(draqItemB);
        DragAndDropQuestion dragAndDropQuestion = (DragAndDropQuestion) new DragAndDropQuestion()
                .correctMappings(DaDCorrectMappings)
                .dragItems(dragItems)
                .backgroundFilePath("https://artemis.ase.in.tum.de/public/images/logo.png")
                .title(pregeneratedTitlePrefix + "Drag and Drop Question")
                .points(5);
        quizQuestions.add(dragAndDropQuestion);
        // create Short Answer question
        List<ShortAnswerMapping> SACorrectMappings = new ArrayList<>(2);
        ShortAnswerMapping SAMapping1 = new ShortAnswerMapping()
                .spot(new ShortAnswerSpot().spotNr(1).width(15))
                .solution(new ShortAnswerSolution().text("1"));
        SACorrectMappings.add(SAMapping1);
        ShortAnswerMapping SAMapping2 = new ShortAnswerMapping()
                .spot(new ShortAnswerSpot().spotNr(2).width(15))
                .solution(new ShortAnswerSolution().text("2"));
        SACorrectMappings.add(SAMapping2);
        ShortAnswerQuestion shortAnswerQuestion = (ShortAnswerQuestion) new ShortAnswerQuestion()
                .correctMappings(SACorrectMappings)
                .similarityValue(85)
                .text("This [-spot 1] is a [-spot 2] field.")
                .title(pregeneratedTitlePrefix + "Short Answer Question")
                .points(5);
        quizQuestions.add(shortAnswerQuestion);
        QuizExercise quizExercise = (QuizExercise) new QuizExercise()
                .quizQuestions(quizQuestions)
                .duration(600)
                .maxPoints(15.0)
                .title(pregeneratedTitlePrefix + "Quiz Exercise")
                .course(course);
        quizExercise = Zeus.getQuizExerciseResourceApi().createQuizExercise(quizExercise);

        return 0;
    }
}
