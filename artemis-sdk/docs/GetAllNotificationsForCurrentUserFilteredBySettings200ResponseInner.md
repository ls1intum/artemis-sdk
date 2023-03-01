

# GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner

## oneOf schemas
* [GroupNotification](GroupNotification.md)
* [SingleUserNotification](SingleUserNotification.md)
* [SystemNotification](SystemNotification.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.GroupNotification;
import de.tum.cit.ase.artemis.sdk.model.SingleUserNotification;
import de.tum.cit.ase.artemis.sdk.model.SystemNotification;

public class Example {
    public static void main(String[] args) {
        GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner = new GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner();

        // create a new GroupNotification
        GroupNotification exampleGroupNotification = new GroupNotification();
        // set GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner to GroupNotification
        exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.setActualInstance(exampleGroupNotification);
        // to get back the GroupNotification set earlier
        GroupNotification testGroupNotification = (GroupNotification) exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.getActualInstance();

        // create a new SingleUserNotification
        SingleUserNotification exampleSingleUserNotification = new SingleUserNotification();
        // set GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner to SingleUserNotification
        exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.setActualInstance(exampleSingleUserNotification);
        // to get back the SingleUserNotification set earlier
        SingleUserNotification testSingleUserNotification = (SingleUserNotification) exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.getActualInstance();

        // create a new SystemNotification
        SystemNotification exampleSystemNotification = new SystemNotification();
        // set GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner to SystemNotification
        exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.setActualInstance(exampleSystemNotification);
        // to get back the SystemNotification set earlier
        SystemNotification testSystemNotification = (SystemNotification) exampleGetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.getActualInstance();
    }
}
```


