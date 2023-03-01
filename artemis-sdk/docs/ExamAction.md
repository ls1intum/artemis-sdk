

# ExamAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**studentExamId** | **Long** |  |  [optional] |
|**examActivityId** | **Long** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STARTED_EXAM | &quot;STARTED_EXAM&quot; |
| ENDED_EXAM | &quot;ENDED_EXAM&quot; |
| HANDED_IN_EARLY | &quot;HANDED_IN_EARLY&quot; |
| CONTINUED_AFTER_HAND_IN_EARLY | &quot;CONTINUED_AFTER_HAND_IN_EARLY&quot; |
| SWITCHED_EXERCISE | &quot;SWITCHED_EXERCISE&quot; |
| SAVED_EXERCISE | &quot;SAVED_EXERCISE&quot; |
| CONNECTION_UPDATED | &quot;CONNECTION_UPDATED&quot; |



