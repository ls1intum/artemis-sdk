

# GetSubmissionPolicyOfExercise200Response

## oneOf schemas
* [LockRepositoryPolicy](LockRepositoryPolicy.md)
* [SubmissionPenaltyPolicy](SubmissionPenaltyPolicy.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetSubmissionPolicyOfExercise200Response;
import de.tum.cit.ase.artemis.sdk.model.LockRepositoryPolicy;
import de.tum.cit.ase.artemis.sdk.model.SubmissionPenaltyPolicy;

public class Example {
    public static void main(String[] args) {
        GetSubmissionPolicyOfExercise200Response exampleGetSubmissionPolicyOfExercise200Response = new GetSubmissionPolicyOfExercise200Response();

        // create a new LockRepositoryPolicy
        LockRepositoryPolicy exampleLockRepositoryPolicy = new LockRepositoryPolicy();
        // set GetSubmissionPolicyOfExercise200Response to LockRepositoryPolicy
        exampleGetSubmissionPolicyOfExercise200Response.setActualInstance(exampleLockRepositoryPolicy);
        // to get back the LockRepositoryPolicy set earlier
        LockRepositoryPolicy testLockRepositoryPolicy = (LockRepositoryPolicy) exampleGetSubmissionPolicyOfExercise200Response.getActualInstance();

        // create a new SubmissionPenaltyPolicy
        SubmissionPenaltyPolicy exampleSubmissionPenaltyPolicy = new SubmissionPenaltyPolicy();
        // set GetSubmissionPolicyOfExercise200Response to SubmissionPenaltyPolicy
        exampleGetSubmissionPolicyOfExercise200Response.setActualInstance(exampleSubmissionPenaltyPolicy);
        // to get back the SubmissionPenaltyPolicy set earlier
        SubmissionPenaltyPolicy testSubmissionPenaltyPolicy = (SubmissionPenaltyPolicy) exampleGetSubmissionPolicyOfExercise200Response.getActualInstance();
    }
}
```


