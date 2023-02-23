

# Post


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**content** | **String** |  |  [optional] |
|**tokenizedContent** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**visibleForStudents** | **Boolean** |  |  [optional] |
|**reactions** | [**Set&lt;Reaction&gt;**](Reaction.md) |  |  [optional] |
|**answers** | [**Set&lt;AnswerPost&gt;**](AnswerPost.md) |  |  [optional] |
|**tags** | **Set&lt;String&gt;** |  |  [optional] |
|**exercise** | [**Exercise**](Exercise.md) |  |  [optional] |
|**lecture** | [**Lecture**](Lecture.md) |  |  [optional] |
|**course** | [**Course**](Course.md) |  |  [optional] |
|**courseWideContext** | [**CourseWideContextEnum**](#CourseWideContextEnum) |  |  [optional] |
|**conversation** | [**Conversation**](Conversation.md) |  |  [optional] |
|**displayPriority** | [**DisplayPriorityEnum**](#DisplayPriorityEnum) |  |  [optional] |
|**plagiarismCase** | [**PlagiarismCase**](PlagiarismCase.md) |  |  [optional] |
|**resolved** | **Boolean** |  |  [optional] |
|**answerCount** | **Integer** |  |  [optional] |
|**voteCount** | **Integer** |  |  [optional] |
|**authorRole** | [**AuthorRoleEnum**](#AuthorRoleEnum) |  |  [optional] |



## Enum: CourseWideContextEnum

| Name | Value |
|---- | -----|
| TECH_SUPPORT | &quot;TECH_SUPPORT&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| RANDOM | &quot;RANDOM&quot; |
| ANNOUNCEMENT | &quot;ANNOUNCEMENT&quot; |



## Enum: DisplayPriorityEnum

| Name | Value |
|---- | -----|
| PINNED | &quot;PINNED&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |
| NONE | &quot;NONE&quot; |



## Enum: AuthorRoleEnum

| Name | Value |
|---- | -----|
| INSTRUCTOR | &quot;INSTRUCTOR&quot; |
| TUTOR | &quot;TUTOR&quot; |
| USER | &quot;USER&quot; |



