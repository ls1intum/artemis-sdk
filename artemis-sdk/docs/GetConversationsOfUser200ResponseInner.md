

# GetConversationsOfUser200ResponseInner

## oneOf schemas
* [ChannelDTO](ChannelDTO.md)
* [ConversationDTO](ConversationDTO.md)
* [GroupChatDTO](GroupChatDTO.md)
* [OneToOneChatDTO](OneToOneChatDTO.md)

## Example
```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.model.GetConversationsOfUser200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.ChannelDTO;
import de.tum.cit.ase.artemis.sdk.model.ConversationDTO;
import de.tum.cit.ase.artemis.sdk.model.GroupChatDTO;
import de.tum.cit.ase.artemis.sdk.model.OneToOneChatDTO;

public class Example {
    public static void main(String[] args) {
        GetConversationsOfUser200ResponseInner exampleGetConversationsOfUser200ResponseInner = new GetConversationsOfUser200ResponseInner();

        // create a new ChannelDTO
        ChannelDTO exampleChannelDTO = new ChannelDTO();
        // set GetConversationsOfUser200ResponseInner to ChannelDTO
        exampleGetConversationsOfUser200ResponseInner.setActualInstance(exampleChannelDTO);
        // to get back the ChannelDTO set earlier
        ChannelDTO testChannelDTO = (ChannelDTO) exampleGetConversationsOfUser200ResponseInner.getActualInstance();

        // create a new ConversationDTO
        ConversationDTO exampleConversationDTO = new ConversationDTO();
        // set GetConversationsOfUser200ResponseInner to ConversationDTO
        exampleGetConversationsOfUser200ResponseInner.setActualInstance(exampleConversationDTO);
        // to get back the ConversationDTO set earlier
        ConversationDTO testConversationDTO = (ConversationDTO) exampleGetConversationsOfUser200ResponseInner.getActualInstance();

        // create a new GroupChatDTO
        GroupChatDTO exampleGroupChatDTO = new GroupChatDTO();
        // set GetConversationsOfUser200ResponseInner to GroupChatDTO
        exampleGetConversationsOfUser200ResponseInner.setActualInstance(exampleGroupChatDTO);
        // to get back the GroupChatDTO set earlier
        GroupChatDTO testGroupChatDTO = (GroupChatDTO) exampleGetConversationsOfUser200ResponseInner.getActualInstance();

        // create a new OneToOneChatDTO
        OneToOneChatDTO exampleOneToOneChatDTO = new OneToOneChatDTO();
        // set GetConversationsOfUser200ResponseInner to OneToOneChatDTO
        exampleGetConversationsOfUser200ResponseInner.setActualInstance(exampleOneToOneChatDTO);
        // to get back the OneToOneChatDTO set earlier
        OneToOneChatDTO testOneToOneChatDTO = (OneToOneChatDTO) exampleGetConversationsOfUser200ResponseInner.getActualInstance();
    }
}
```


