package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.model.Course;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "course", description = "shows an Artemis course",
        mixinStandardHelpOptions = true)
public class ShowCourse implements Callable<Integer> {

    @Option(names = {"--id"}, required = true)
    private Long id;

    @Override
    public Integer call() {
        Zeus.prepareRestClient();
        Course course = Zeus.getCourseResourceApi().getCourse(id);
        System.out.println(course.toString());
        return 0;
    }
}
