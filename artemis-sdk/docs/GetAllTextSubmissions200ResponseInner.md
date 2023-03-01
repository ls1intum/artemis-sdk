

# GetAllTextSubmissions200ResponseInner

## oneOf schemas
* [FileUploadSubmission](FileUploadSubmission.md)
* [ModelingSubmission](ModelingSubmission.md)
* [ProgrammingSubmission](ProgrammingSubmission.md)
* [QuizSubmission](QuizSubmission.md)
* [TextSubmission](TextSubmission.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.FileUploadSubmission;
import de.tum.cit.ase.artemis.sdk.model.ModelingSubmission;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import de.tum.cit.ase.artemis.sdk.model.QuizSubmission;
import de.tum.cit.ase.artemis.sdk.model.TextSubmission;

public class Example {
    public static void main(String[] args) {
        GetAllTextSubmissions200ResponseInner exampleGetAllTextSubmissions200ResponseInner = new GetAllTextSubmissions200ResponseInner();

        // create a new FileUploadSubmission
        FileUploadSubmission exampleFileUploadSubmission = new FileUploadSubmission();
        // set GetAllTextSubmissions200ResponseInner to FileUploadSubmission
        exampleGetAllTextSubmissions200ResponseInner.setActualInstance(exampleFileUploadSubmission);
        // to get back the FileUploadSubmission set earlier
        FileUploadSubmission testFileUploadSubmission = (FileUploadSubmission) exampleGetAllTextSubmissions200ResponseInner.getActualInstance();

        // create a new ModelingSubmission
        ModelingSubmission exampleModelingSubmission = new ModelingSubmission();
        // set GetAllTextSubmissions200ResponseInner to ModelingSubmission
        exampleGetAllTextSubmissions200ResponseInner.setActualInstance(exampleModelingSubmission);
        // to get back the ModelingSubmission set earlier
        ModelingSubmission testModelingSubmission = (ModelingSubmission) exampleGetAllTextSubmissions200ResponseInner.getActualInstance();

        // create a new ProgrammingSubmission
        ProgrammingSubmission exampleProgrammingSubmission = new ProgrammingSubmission();
        // set GetAllTextSubmissions200ResponseInner to ProgrammingSubmission
        exampleGetAllTextSubmissions200ResponseInner.setActualInstance(exampleProgrammingSubmission);
        // to get back the ProgrammingSubmission set earlier
        ProgrammingSubmission testProgrammingSubmission = (ProgrammingSubmission) exampleGetAllTextSubmissions200ResponseInner.getActualInstance();

        // create a new QuizSubmission
        QuizSubmission exampleQuizSubmission = new QuizSubmission();
        // set GetAllTextSubmissions200ResponseInner to QuizSubmission
        exampleGetAllTextSubmissions200ResponseInner.setActualInstance(exampleQuizSubmission);
        // to get back the QuizSubmission set earlier
        QuizSubmission testQuizSubmission = (QuizSubmission) exampleGetAllTextSubmissions200ResponseInner.getActualInstance();

        // create a new TextSubmission
        TextSubmission exampleTextSubmission = new TextSubmission();
        // set GetAllTextSubmissions200ResponseInner to TextSubmission
        exampleGetAllTextSubmissions200ResponseInner.setActualInstance(exampleTextSubmission);
        // to get back the TextSubmission set earlier
        TextSubmission testTextSubmission = (TextSubmission) exampleGetAllTextSubmissions200ResponseInner.getActualInstance();
    }
}
```


