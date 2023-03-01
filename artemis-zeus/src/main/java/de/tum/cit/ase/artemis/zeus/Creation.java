package de.tum.cit.ase.artemis.zeus;

import picocli.CommandLine.Command;

@Command(name = "create", description = "creates an Artemis Object",
        subcommands = {CreationCourse.class, CreationCourseWithExercises.class},
        mixinStandardHelpOptions = true)
public class Creation {
}
