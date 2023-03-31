package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.model.Course;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Mixin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Callable;

@Command(name = "course", description = "shows an Artemis course",
        mixinStandardHelpOptions = true)
public class ShowCourse implements Callable<Integer> {

    @Option(names = {"--id"}, required = true)
    private Long id;

    private static Logger logger = LogManager.getLogger();
    @Mixin LoggingMixin loggingMixin;

    @Override
    public Integer call() {
        Zeus.prepareRestClient();
        Course course = Zeus.getCourseResourceApi().getCourse(id);
        System.out.println(course.toString());
        return 0;
    }
}
