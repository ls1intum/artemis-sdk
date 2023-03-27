

# Course


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**shortName** | **String** |  |  [optional] |
|**studentGroupName** | **String** |  |  [optional] |
|**teachingAssistantGroupName** | **String** |  |  [optional] |
|**editorGroupName** | **String** |  |  [optional] |
|**instructorGroupName** | **String** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**semester** | **String** |  |  [optional] |
|**testCourse** | **Boolean** |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional] |
|**defaultProgrammingLanguage** | [**DefaultProgrammingLanguageEnum**](#DefaultProgrammingLanguageEnum) |  |  [optional] |
|**onlineCourse** | **Boolean** |  |  [optional] |
|**onlineCourseConfiguration** | [**OnlineCourseConfiguration**](OnlineCourseConfiguration.md) |  |  [optional] |
|**courseInformationSharingConfiguration** | [**CourseInformationSharingConfigurationEnum**](#CourseInformationSharingConfigurationEnum) |  |  [optional] |
|**maxComplaints** | **Integer** |  |  [optional] |
|**maxTeamComplaints** | **Integer** |  |  [optional] |
|**maxComplaintTimeDays** | **Integer** |  |  [optional] |
|**maxRequestMoreFeedbackTimeDays** | **Integer** |  |  [optional] |
|**maxComplaintTextLimit** | **Integer** |  |  [optional] |
|**maxComplaintResponseTextLimit** | **Integer** |  |  [optional] |
|**posts** | [**Set&lt;Post&gt;**](Post.md) |  |  [optional] |
|**color** | **String** |  |  [optional] |
|**courseIcon** | **String** |  |  [optional] |
|**registrationEnabled** | **Boolean** |  |  [optional] |
|**registrationConfirmationMessage** | **String** |  |  [optional] |
|**presentationScore** | **Integer** |  |  [optional] |
|**courseArchivePath** | **String** |  |  [optional] |
|**maxPoints** | **Integer** |  |  [optional] |
|**accuracyOfScores** | **Integer** |  |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**exercises** | [**Set&lt;GetExercise200Response&gt;**](GetExercise200Response.md) |  |  [optional] |
|**lectures** | [**Set&lt;Lecture&gt;**](Lecture.md) |  |  [optional] |
|**tutorialGroups** | [**Set&lt;TutorialGroup&gt;**](TutorialGroup.md) |  |  [optional] |
|**exams** | [**Set&lt;Exam&gt;**](Exam.md) |  |  [optional] |
|**organizations** | [**Set&lt;Organization&gt;**](Organization.md) |  |  [optional] |
|**tutorialGroupsConfiguration** | [**TutorialGroupsConfiguration**](TutorialGroupsConfiguration.md) |  |  [optional] |
|**numberOfInstructors** | **Long** |  |  [optional] |
|**numberOfEditors** | **Long** |  |  [optional] |
|**numberOfTeachingAssistants** | **Long** |  |  [optional] |
|**numberOfStudents** | **Long** |  |  [optional] |
|**requestMoreFeedbackEnabled** | **Boolean** |  |  [optional] |
|**complaintsEnabled** | **Boolean** |  |  [optional] |
|**validStartAndEndDate** | **Boolean** |  |  [optional] |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| ENGLISH | &quot;ENGLISH&quot; |
| GERMAN | &quot;GERMAN&quot; |



## Enum: DefaultProgrammingLanguageEnum

| Name | Value |
|---- | -----|
| JAVA | &quot;JAVA&quot; |
| PYTHON | &quot;PYTHON&quot; |
| C | &quot;C&quot; |
| HASKELL | &quot;HASKELL&quot; |
| KOTLIN | &quot;KOTLIN&quot; |
| VHDL | &quot;VHDL&quot; |
| ASSEMBLER | &quot;ASSEMBLER&quot; |
| SWIFT | &quot;SWIFT&quot; |
| OCAML | &quot;OCAML&quot; |
| EMPTY | &quot;EMPTY&quot; |



## Enum: CourseInformationSharingConfigurationEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| COMMUNICATION_AND_MESSAGING | &quot;COMMUNICATION_AND_MESSAGING&quot; |
| COMMUNICATION_ONLY | &quot;COMMUNICATION_ONLY&quot; |
| MESSAGING_ONLY | &quot;MESSAGING_ONLY&quot; |



