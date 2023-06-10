

# GetAllConversationsForNotifications200ResponseInner

## oneOf schemas
* [Channel](Channel.md)
* [GroupChat](GroupChat.md)
* [OneToOneChat](OneToOneChat.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetAllConversationsForNotifications200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.Channel;
import de.tum.cit.ase.artemis.sdk.model.GroupChat;
import de.tum.cit.ase.artemis.sdk.model.OneToOneChat;

public class Example {
    public static void main(String[] args) {
        GetAllConversationsForNotifications200ResponseInner exampleGetAllConversationsForNotifications200ResponseInner = new GetAllConversationsForNotifications200ResponseInner();

        // create a new Channel
        Channel exampleChannel = new Channel();
        // set GetAllConversationsForNotifications200ResponseInner to Channel
        exampleGetAllConversationsForNotifications200ResponseInner.setActualInstance(exampleChannel);
        // to get back the Channel set earlier
        Channel testChannel = (Channel) exampleGetAllConversationsForNotifications200ResponseInner.getActualInstance();

        // create a new GroupChat
        GroupChat exampleGroupChat = new GroupChat();
        // set GetAllConversationsForNotifications200ResponseInner to GroupChat
        exampleGetAllConversationsForNotifications200ResponseInner.setActualInstance(exampleGroupChat);
        // to get back the GroupChat set earlier
        GroupChat testGroupChat = (GroupChat) exampleGetAllConversationsForNotifications200ResponseInner.getActualInstance();

        // create a new OneToOneChat
        OneToOneChat exampleOneToOneChat = new OneToOneChat();
        // set GetAllConversationsForNotifications200ResponseInner to OneToOneChat
        exampleGetAllConversationsForNotifications200ResponseInner.setActualInstance(exampleOneToOneChat);
        // to get back the OneToOneChat set earlier
        OneToOneChat testOneToOneChat = (OneToOneChat) exampleGetAllConversationsForNotifications200ResponseInner.getActualInstance();
    }
}
```


