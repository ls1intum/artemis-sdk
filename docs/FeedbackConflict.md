

# FeedbackConflict


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**conflict** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**solvedAt** | **OffsetDateTime** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**firstFeedback** | [**Feedback**](Feedback.md) |  |  [optional] |
|**secondFeedback** | [**Feedback**](Feedback.md) |  |  [optional] |
|**discard** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMENT | &quot;INCONSISTENT_COMMENT&quot; |
| SCORE | &quot;INCONSISTENT_SCORE&quot; |
| FEEDBACK | &quot;INCONSISTENT_FEEDBACK&quot; |



