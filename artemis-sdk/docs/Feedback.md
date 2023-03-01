

# Feedback


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**text** | **String** |  |  [optional] |
|**detailText** | **String** |  |  [optional] |
|**reference** | **String** |  |  [optional] |
|**credits** | **Double** |  |  [optional] |
|**positive** | **Boolean** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  [optional] |
|**result** | [**Result**](Result.md) |  |  [optional] |
|**gradingInstruction** | [**GradingInstruction**](GradingInstruction.md) |  |  [optional] |
|**suggestedFeedbackReference** | **String** |  |  [optional] |
|**suggestedFeedbackOriginSubmissionReference** | **Long** |  |  [optional] |
|**suggestedFeedbackParticipationReference** | **Long** |  |  [optional] |
|**firstConflicts** | [**List&lt;FeedbackConflict&gt;**](FeedbackConflict.md) |  |  [optional] |
|**secondConflicts** | [**List&lt;FeedbackConflict&gt;**](FeedbackConflict.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| MANUAL_UNREFERENCED | &quot;MANUAL_UNREFERENCED&quot; |
| AUTOMATIC_ADAPTED | &quot;AUTOMATIC_ADAPTED&quot; |
| AUTOMATIC | &quot;AUTOMATIC&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;ALWAYS&quot; |
| AFTER_DUE_DATE | &quot;AFTER_DUE_DATE&quot; |
| NEVER | &quot;NEVER&quot; |



