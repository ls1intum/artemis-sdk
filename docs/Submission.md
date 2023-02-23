

# Submission


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**submitted** | **Boolean** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**exampleSubmission** | **Boolean** |  |  [optional] |
|**participation** | [**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md) |  |  [optional] |
|**submissionDate** | **OffsetDateTime** |  |  [optional] |
|**empty** | **Boolean** |  |  [optional] |
|**durationInMinutes** | **Long** |  |  [optional] [readonly] |
|**results** | [**List&lt;Result&gt;**](Result.md) |  |  [optional] [readonly] |
|**submissionExerciseType** | **String** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TEST | &quot;TEST&quot; |
| OTHER | &quot;OTHER&quot; |
| INSTRUCTOR | &quot;INSTRUCTOR&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| ILLEGAL | &quot;ILLEGAL&quot; |



