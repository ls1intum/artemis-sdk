

# Participation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**initializationState** | [**InitializationStateEnum**](#InitializationStateEnum) |  |  [optional] |
|**initializationDate** | **OffsetDateTime** |  |  [optional] |
|**individualDueDate** | **OffsetDateTime** |  |  [optional] |
|**testRun** | **Boolean** |  |  [optional] |
|**exercise** | [**Exercise**](Exercise.md) |  |  [optional] |
|**results** | [**Set&lt;Result&gt;**](Result.md) |  |  [optional] |
|**submissions** | [**Set&lt;GetAllTextSubmissions200ResponseInner&gt;**](GetAllTextSubmissions200ResponseInner.md) |  |  [optional] |
|**submissionCount** | **Integer** |  |  [optional] |
|**type** | **String** |  |  |



## Enum: InitializationStateEnum

| Name | Value |
|---- | -----|
| UNINITIALIZED | &quot;UNINITIALIZED&quot; |
| REPO_COPIED | &quot;REPO_COPIED&quot; |
| REPO_CONFIGURED | &quot;REPO_CONFIGURED&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| BUILD_PLAN_COPIED | &quot;BUILD_PLAN_COPIED&quot; |
| BUILD_PLAN_CONFIGURED | &quot;BUILD_PLAN_CONFIGURED&quot; |
| INITIALIZED | &quot;INITIALIZED&quot; |
| FINISHED | &quot;FINISHED&quot; |



