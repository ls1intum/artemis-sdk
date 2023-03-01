package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.model.*;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

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
        //TODO: extract this to a function in other class to avoid duplicate code
        Course course = new Course().testCourse(true).shortName(shortName).title(title).registrationEnabled(false).presentationScore(0);
        course = Zeus.getAdminCourseResourceApi().createCourse(course, null);

        TextExercise textExercise = (TextExercise) new TextExercise().title(title + " pre-generated Text Exercise").maxPoints(10.0).course(course);
        textExercise = Zeus.getTextExerciseResourceApi().createTextExercise(textExercise);

        ModelingExercise modelingExercise = (ModelingExercise) new ModelingExercise().title(title + " pre-generated Modeling Exercise").maxPoints(10.0).course(course);
        modelingExercise = Zeus.getModelingExerciseResourceApi().createModelingExercise(modelingExercise);

        FileUploadExercise fileUploadExercise = (FileUploadExercise) new FileUploadExercise().filePattern("png, pdf").title(title + " pre-generated File Upload Exercise").maxPoints(10.0).course(course);
        fileUploadExercise = Zeus.getFileUploadExerciseResourceApi().createFileUploadExercise(fileUploadExercise);

        //List<QuizQuestion> quizQuestions = new ArrayList<QuizQuestion>(3);
        //MultipleChoice multipleChoiceQuestion


        //QuizExercise quizExercise = (QuizExercise) new QuizExercise().quizQuestions(quizQuestions).title(title + " pre-generated Quiz Exercise").maxPoints(10.0).course(course);
        //quizExercise = Zeus.getQuizExerciseResourceApi().createQuizExercise(quizExercise);

        return 0;
    }
}
