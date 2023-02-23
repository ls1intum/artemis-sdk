

# TutorialGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**course** | [**Course**](Course.md) |  |  [optional] |
|**title** | **String** |  |  |
|**additionalInformation** | **String** |  |  [optional] |
|**capacity** | **Integer** |  |  [optional] |
|**isOnline** | **Boolean** |  |  |
|**campus** | **String** |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional] |
|**teachingAssistant** | [**User**](User.md) |  |  [optional] |
|**isUserRegistered** | **Boolean** |  |  [optional] |
|**isUserTutor** | **Boolean** |  |  [optional] |
|**numberOfRegisteredUsers** | **Integer** |  |  [optional] |
|**teachingAssistantName** | **String** |  |  [optional] |
|**courseTitle** | **String** |  |  [optional] |
|**nextSession** | [**TutorialGroupSession**](TutorialGroupSession.md) |  |  [optional] |
|**tutorialGroupSchedule** | [**TutorialGroupSchedule**](TutorialGroupSchedule.md) |  |  [optional] |
|**tutorialGroupSessions** | [**Set&lt;TutorialGroupSession&gt;**](TutorialGroupSession.md) |  |  [optional] |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| ENGLISH | &quot;ENGLISH&quot; |
| GERMAN | &quot;GERMAN&quot; |



