package de.tum.cit.ase.artemis.zeus;

import picocli.CommandLine.Command;

@Command(name = "show", description = "shows an Artemis Object",
        subcommands = {ShowCourse.class},
        mixinStandardHelpOptions = true)
public class Show {
}
