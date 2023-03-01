

# GetExerciseHint200Response

## oneOf schemas
* [CodeHint](CodeHint.md)
* [ExerciseHint](ExerciseHint.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetExerciseHint200Response;
import de.tum.cit.ase.artemis.sdk.model.CodeHint;
import de.tum.cit.ase.artemis.sdk.model.ExerciseHint;

public class Example {
    public static void main(String[] args) {
        GetExerciseHint200Response exampleGetExerciseHint200Response = new GetExerciseHint200Response();

        // create a new CodeHint
        CodeHint exampleCodeHint = new CodeHint();
        // set GetExerciseHint200Response to CodeHint
        exampleGetExerciseHint200Response.setActualInstance(exampleCodeHint);
        // to get back the CodeHint set earlier
        CodeHint testCodeHint = (CodeHint) exampleGetExerciseHint200Response.getActualInstance();

        // create a new ExerciseHint
        ExerciseHint exampleExerciseHint = new ExerciseHint();
        // set GetExerciseHint200Response to ExerciseHint
        exampleGetExerciseHint200Response.setActualInstance(exampleExerciseHint);
        // to get back the ExerciseHint set earlier
        ExerciseHint testExerciseHint = (ExerciseHint) exampleGetExerciseHint200Response.getActualInstance();
    }
}
```


