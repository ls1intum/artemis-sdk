

# UpdateLectureUnitsOrder200ResponseInner

## oneOf schemas
* [AttachmentUnit](AttachmentUnit.md)
* [ExerciseUnit](ExerciseUnit.md)
* [OnlineUnit](OnlineUnit.md)
* [TextUnit](TextUnit.md)
* [VideoUnit](VideoUnit.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.UpdateLectureUnitsOrder200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.AttachmentUnit;
import de.tum.cit.ase.artemis.sdk.model.ExerciseUnit;
import de.tum.cit.ase.artemis.sdk.model.OnlineUnit;
import de.tum.cit.ase.artemis.sdk.model.TextUnit;
import de.tum.cit.ase.artemis.sdk.model.VideoUnit;

public class Example {
    public static void main(String[] args) {
        UpdateLectureUnitsOrder200ResponseInner exampleUpdateLectureUnitsOrder200ResponseInner = new UpdateLectureUnitsOrder200ResponseInner();

        // create a new AttachmentUnit
        AttachmentUnit exampleAttachmentUnit = new AttachmentUnit();
        // set UpdateLectureUnitsOrder200ResponseInner to AttachmentUnit
        exampleUpdateLectureUnitsOrder200ResponseInner.setActualInstance(exampleAttachmentUnit);
        // to get back the AttachmentUnit set earlier
        AttachmentUnit testAttachmentUnit = (AttachmentUnit) exampleUpdateLectureUnitsOrder200ResponseInner.getActualInstance();

        // create a new ExerciseUnit
        ExerciseUnit exampleExerciseUnit = new ExerciseUnit();
        // set UpdateLectureUnitsOrder200ResponseInner to ExerciseUnit
        exampleUpdateLectureUnitsOrder200ResponseInner.setActualInstance(exampleExerciseUnit);
        // to get back the ExerciseUnit set earlier
        ExerciseUnit testExerciseUnit = (ExerciseUnit) exampleUpdateLectureUnitsOrder200ResponseInner.getActualInstance();

        // create a new OnlineUnit
        OnlineUnit exampleOnlineUnit = new OnlineUnit();
        // set UpdateLectureUnitsOrder200ResponseInner to OnlineUnit
        exampleUpdateLectureUnitsOrder200ResponseInner.setActualInstance(exampleOnlineUnit);
        // to get back the OnlineUnit set earlier
        OnlineUnit testOnlineUnit = (OnlineUnit) exampleUpdateLectureUnitsOrder200ResponseInner.getActualInstance();

        // create a new TextUnit
        TextUnit exampleTextUnit = new TextUnit();
        // set UpdateLectureUnitsOrder200ResponseInner to TextUnit
        exampleUpdateLectureUnitsOrder200ResponseInner.setActualInstance(exampleTextUnit);
        // to get back the TextUnit set earlier
        TextUnit testTextUnit = (TextUnit) exampleUpdateLectureUnitsOrder200ResponseInner.getActualInstance();

        // create a new VideoUnit
        VideoUnit exampleVideoUnit = new VideoUnit();
        // set UpdateLectureUnitsOrder200ResponseInner to VideoUnit
        exampleUpdateLectureUnitsOrder200ResponseInner.setActualInstance(exampleVideoUnit);
        // to get back the VideoUnit set earlier
        VideoUnit testVideoUnit = (VideoUnit) exampleUpdateLectureUnitsOrder200ResponseInner.getActualInstance();
    }
}
```


