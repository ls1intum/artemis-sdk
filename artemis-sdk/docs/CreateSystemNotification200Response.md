

# CreateSystemNotification200Response

## oneOf schemas
* [GroupNotification](GroupNotification.md)
* [SingleUserNotification](SingleUserNotification.md)
* [SystemNotification](SystemNotification.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.CreateSystemNotification200Response;
import de.tum.cit.ase.artemis.sdk.model.GroupNotification;
import de.tum.cit.ase.artemis.sdk.model.SingleUserNotification;
import de.tum.cit.ase.artemis.sdk.model.SystemNotification;

public class Example {
    public static void main(String[] args) {
        CreateSystemNotification200Response exampleCreateSystemNotification200Response = new CreateSystemNotification200Response();

        // create a new GroupNotification
        GroupNotification exampleGroupNotification = new GroupNotification();
        // set CreateSystemNotification200Response to GroupNotification
        exampleCreateSystemNotification200Response.setActualInstance(exampleGroupNotification);
        // to get back the GroupNotification set earlier
        GroupNotification testGroupNotification = (GroupNotification) exampleCreateSystemNotification200Response.getActualInstance();

        // create a new SingleUserNotification
        SingleUserNotification exampleSingleUserNotification = new SingleUserNotification();
        // set CreateSystemNotification200Response to SingleUserNotification
        exampleCreateSystemNotification200Response.setActualInstance(exampleSingleUserNotification);
        // to get back the SingleUserNotification set earlier
        SingleUserNotification testSingleUserNotification = (SingleUserNotification) exampleCreateSystemNotification200Response.getActualInstance();

        // create a new SystemNotification
        SystemNotification exampleSystemNotification = new SystemNotification();
        // set CreateSystemNotification200Response to SystemNotification
        exampleCreateSystemNotification200Response.setActualInstance(exampleSystemNotification);
        // to get back the SystemNotification set earlier
        SystemNotification testSystemNotification = (SystemNotification) exampleCreateSystemNotification200Response.getActualInstance();
    }
}
```


