package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.model.Course;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "course", description = "creates an Artemis course",
        mixinStandardHelpOptions = true)
public class CreationCourse implements Callable<Integer> {

    //TODO: Maybe use Custom Type Converters or sth else to not do the work of translating a class again?
    @Option(names = {"--shortName"}, required = true)
    private String shortName;

    @Option(names = {"--title"}, required = true)
    private String title;

    @Override
    public Integer call() {
        Zeus.prepareRestClient();
        Course course = new Course().testCourse(true).shortName(shortName).title(title).registrationEnabled(false).presentationScore(0);
        Zeus.getAdminCourseResourceApi().createCourse(course, null);
        return 0;
    }
}
