

# GetExercise200Response

## oneOf schemas
* [FileUploadExercise](FileUploadExercise.md)
* [ModelingExercise](ModelingExercise.md)
* [ProgrammingExercise](ProgrammingExercise.md)
* [QuizExercise](QuizExercise.md)
* [TextExercise](TextExercise.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetExercise200Response;
import de.tum.cit.ase.artemis.sdk.model.FileUploadExercise;
import de.tum.cit.ase.artemis.sdk.model.ModelingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.QuizExercise;
import de.tum.cit.ase.artemis.sdk.model.TextExercise;

public class Example {
    public static void main(String[] args) {
        GetExercise200Response exampleGetExercise200Response = new GetExercise200Response();

        // create a new FileUploadExercise
        FileUploadExercise exampleFileUploadExercise = new FileUploadExercise();
        // set GetExercise200Response to FileUploadExercise
        exampleGetExercise200Response.setActualInstance(exampleFileUploadExercise);
        // to get back the FileUploadExercise set earlier
        FileUploadExercise testFileUploadExercise = (FileUploadExercise) exampleGetExercise200Response.getActualInstance();

        // create a new ModelingExercise
        ModelingExercise exampleModelingExercise = new ModelingExercise();
        // set GetExercise200Response to ModelingExercise
        exampleGetExercise200Response.setActualInstance(exampleModelingExercise);
        // to get back the ModelingExercise set earlier
        ModelingExercise testModelingExercise = (ModelingExercise) exampleGetExercise200Response.getActualInstance();

        // create a new ProgrammingExercise
        ProgrammingExercise exampleProgrammingExercise = new ProgrammingExercise();
        // set GetExercise200Response to ProgrammingExercise
        exampleGetExercise200Response.setActualInstance(exampleProgrammingExercise);
        // to get back the ProgrammingExercise set earlier
        ProgrammingExercise testProgrammingExercise = (ProgrammingExercise) exampleGetExercise200Response.getActualInstance();

        // create a new QuizExercise
        QuizExercise exampleQuizExercise = new QuizExercise();
        // set GetExercise200Response to QuizExercise
        exampleGetExercise200Response.setActualInstance(exampleQuizExercise);
        // to get back the QuizExercise set earlier
        QuizExercise testQuizExercise = (QuizExercise) exampleGetExercise200Response.getActualInstance();

        // create a new TextExercise
        TextExercise exampleTextExercise = new TextExercise();
        // set GetExercise200Response to TextExercise
        exampleGetExercise200Response.setActualInstance(exampleTextExercise);
        // to get back the TextExercise set earlier
        TextExercise testTextExercise = (TextExercise) exampleGetExercise200Response.getActualInstance();
    }
}
```


