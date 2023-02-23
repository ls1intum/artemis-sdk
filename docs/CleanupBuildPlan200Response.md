

# CleanupBuildPlan200Response

## oneOf schemas
* [ProgrammingExerciseStudentParticipation](ProgrammingExerciseStudentParticipation.md)
* [SolutionProgrammingExerciseParticipation](SolutionProgrammingExerciseParticipation.md)
* [StudentParticipation](StudentParticipation.md)
* [TemplateProgrammingExerciseParticipation](TemplateProgrammingExerciseParticipation.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.CleanupBuildPlan200Response;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseStudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.SolutionProgrammingExerciseParticipation;
import de.tum.cit.ase.artemis.sdk.model.StudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.TemplateProgrammingExerciseParticipation;

public class Example {
    public static void main(String[] args) {
        CleanupBuildPlan200Response exampleCleanupBuildPlan200Response = new CleanupBuildPlan200Response();

        // create a new ProgrammingExerciseStudentParticipation
        ProgrammingExerciseStudentParticipation exampleProgrammingExerciseStudentParticipation = new ProgrammingExerciseStudentParticipation();
        // set CleanupBuildPlan200Response to ProgrammingExerciseStudentParticipation
        exampleCleanupBuildPlan200Response.setActualInstance(exampleProgrammingExerciseStudentParticipation);
        // to get back the ProgrammingExerciseStudentParticipation set earlier
        ProgrammingExerciseStudentParticipation testProgrammingExerciseStudentParticipation = (ProgrammingExerciseStudentParticipation) exampleCleanupBuildPlan200Response.getActualInstance();

        // create a new SolutionProgrammingExerciseParticipation
        SolutionProgrammingExerciseParticipation exampleSolutionProgrammingExerciseParticipation = new SolutionProgrammingExerciseParticipation();
        // set CleanupBuildPlan200Response to SolutionProgrammingExerciseParticipation
        exampleCleanupBuildPlan200Response.setActualInstance(exampleSolutionProgrammingExerciseParticipation);
        // to get back the SolutionProgrammingExerciseParticipation set earlier
        SolutionProgrammingExerciseParticipation testSolutionProgrammingExerciseParticipation = (SolutionProgrammingExerciseParticipation) exampleCleanupBuildPlan200Response.getActualInstance();

        // create a new StudentParticipation
        StudentParticipation exampleStudentParticipation = new StudentParticipation();
        // set CleanupBuildPlan200Response to StudentParticipation
        exampleCleanupBuildPlan200Response.setActualInstance(exampleStudentParticipation);
        // to get back the StudentParticipation set earlier
        StudentParticipation testStudentParticipation = (StudentParticipation) exampleCleanupBuildPlan200Response.getActualInstance();

        // create a new TemplateProgrammingExerciseParticipation
        TemplateProgrammingExerciseParticipation exampleTemplateProgrammingExerciseParticipation = new TemplateProgrammingExerciseParticipation();
        // set CleanupBuildPlan200Response to TemplateProgrammingExerciseParticipation
        exampleCleanupBuildPlan200Response.setActualInstance(exampleTemplateProgrammingExerciseParticipation);
        // to get back the TemplateProgrammingExerciseParticipation set earlier
        TemplateProgrammingExerciseParticipation testTemplateProgrammingExerciseParticipation = (TemplateProgrammingExerciseParticipation) exampleCleanupBuildPlan200Response.getActualInstance();
    }
}
```


