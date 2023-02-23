

# TutorParticipation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**assessedExercise** | [**Exercise**](Exercise.md) |  |  [optional] |
|**tutor** | [**User**](User.md) |  |  [optional] |
|**trainedExampleSubmissions** | [**Set&lt;ExampleSubmission&gt;**](ExampleSubmission.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_PARTICIPATED | &quot;NOT_PARTICIPATED&quot; |
| REVIEWED_INSTRUCTIONS | &quot;REVIEWED_INSTRUCTIONS&quot; |
| TRAINED | &quot;TRAINED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



