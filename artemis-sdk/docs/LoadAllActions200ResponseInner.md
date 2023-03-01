

# LoadAllActions200ResponseInner

## oneOf schemas
* [ConnectionUpdatedAction](ConnectionUpdatedAction.md)
* [ContinuedAfterHandedInEarlyAction](ContinuedAfterHandedInEarlyAction.md)
* [EndedExamAction](EndedExamAction.md)
* [ExamAction](ExamAction.md)
* [HandedInEarlyAction](HandedInEarlyAction.md)
* [SavedExerciseAction](SavedExerciseAction.md)
* [StartedExamAction](StartedExamAction.md)
* [SwitchedExerciseAction](SwitchedExerciseAction.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.LoadAllActions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.ConnectionUpdatedAction;
import de.tum.cit.ase.artemis.sdk.model.ContinuedAfterHandedInEarlyAction;
import de.tum.cit.ase.artemis.sdk.model.EndedExamAction;
import de.tum.cit.ase.artemis.sdk.model.ExamAction;
import de.tum.cit.ase.artemis.sdk.model.HandedInEarlyAction;
import de.tum.cit.ase.artemis.sdk.model.SavedExerciseAction;
import de.tum.cit.ase.artemis.sdk.model.StartedExamAction;
import de.tum.cit.ase.artemis.sdk.model.SwitchedExerciseAction;

public class Example {
    public static void main(String[] args) {
        LoadAllActions200ResponseInner exampleLoadAllActions200ResponseInner = new LoadAllActions200ResponseInner();

        // create a new ConnectionUpdatedAction
        ConnectionUpdatedAction exampleConnectionUpdatedAction = new ConnectionUpdatedAction();
        // set LoadAllActions200ResponseInner to ConnectionUpdatedAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleConnectionUpdatedAction);
        // to get back the ConnectionUpdatedAction set earlier
        ConnectionUpdatedAction testConnectionUpdatedAction = (ConnectionUpdatedAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new ContinuedAfterHandedInEarlyAction
        ContinuedAfterHandedInEarlyAction exampleContinuedAfterHandedInEarlyAction = new ContinuedAfterHandedInEarlyAction();
        // set LoadAllActions200ResponseInner to ContinuedAfterHandedInEarlyAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleContinuedAfterHandedInEarlyAction);
        // to get back the ContinuedAfterHandedInEarlyAction set earlier
        ContinuedAfterHandedInEarlyAction testContinuedAfterHandedInEarlyAction = (ContinuedAfterHandedInEarlyAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new EndedExamAction
        EndedExamAction exampleEndedExamAction = new EndedExamAction();
        // set LoadAllActions200ResponseInner to EndedExamAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleEndedExamAction);
        // to get back the EndedExamAction set earlier
        EndedExamAction testEndedExamAction = (EndedExamAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new ExamAction
        ExamAction exampleExamAction = new ExamAction();
        // set LoadAllActions200ResponseInner to ExamAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleExamAction);
        // to get back the ExamAction set earlier
        ExamAction testExamAction = (ExamAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new HandedInEarlyAction
        HandedInEarlyAction exampleHandedInEarlyAction = new HandedInEarlyAction();
        // set LoadAllActions200ResponseInner to HandedInEarlyAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleHandedInEarlyAction);
        // to get back the HandedInEarlyAction set earlier
        HandedInEarlyAction testHandedInEarlyAction = (HandedInEarlyAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new SavedExerciseAction
        SavedExerciseAction exampleSavedExerciseAction = new SavedExerciseAction();
        // set LoadAllActions200ResponseInner to SavedExerciseAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleSavedExerciseAction);
        // to get back the SavedExerciseAction set earlier
        SavedExerciseAction testSavedExerciseAction = (SavedExerciseAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new StartedExamAction
        StartedExamAction exampleStartedExamAction = new StartedExamAction();
        // set LoadAllActions200ResponseInner to StartedExamAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleStartedExamAction);
        // to get back the StartedExamAction set earlier
        StartedExamAction testStartedExamAction = (StartedExamAction) exampleLoadAllActions200ResponseInner.getActualInstance();

        // create a new SwitchedExerciseAction
        SwitchedExerciseAction exampleSwitchedExerciseAction = new SwitchedExerciseAction();
        // set LoadAllActions200ResponseInner to SwitchedExerciseAction
        exampleLoadAllActions200ResponseInner.setActualInstance(exampleSwitchedExerciseAction);
        // to get back the SwitchedExerciseAction set earlier
        SwitchedExerciseAction testSwitchedExerciseAction = (SwitchedExerciseAction) exampleLoadAllActions200ResponseInner.getActualInstance();
    }
}
```


