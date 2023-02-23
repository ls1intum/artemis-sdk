

# TextAssessmentEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**userId** | **Long** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional] |
|**feedbackType** | [**FeedbackTypeEnum**](#FeedbackTypeEnum) |  |  [optional] |
|**segmentType** | [**SegmentTypeEnum**](#SegmentTypeEnum) |  |  [optional] |
|**courseId** | **Long** |  |  [optional] |
|**textExerciseId** | **Long** |  |  [optional] |
|**participationId** | **Long** |  |  [optional] |
|**submissionId** | **Long** |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| ADD_FEEDBACK_AUTOMATICALLY_SELECTED_BLOCK | &quot;ADD_FEEDBACK_AUTOMATICALLY_SELECTED_BLOCK&quot; |
| ADD_FEEDBACK_MANUALLY_SELECTED_BLOCK | &quot;ADD_FEEDBACK_MANUALLY_SELECTED_BLOCK&quot; |
| CLICK_TO_RESOLVE_CONFLICT | &quot;CLICK_TO_RESOLVE_CONFLICT&quot; |
| HOVER_OVER_IMPACT_WARNING | &quot;HOVER_OVER_IMPACT_WARNING&quot; |
| VIEW_AUTOMATIC_SUGGESTION_ORIGIN | &quot;VIEW_AUTOMATIC_SUGGESTION_ORIGIN&quot; |
| DELETE_FEEDBACK | &quot;DELETE_FEEDBACK&quot; |
| EDIT_AUTOMATIC_FEEDBACK | &quot;EDIT_AUTOMATIC_FEEDBACK&quot; |
| SUBMIT_ASSESSMENT | &quot;SUBMIT_ASSESSMENT&quot; |
| ASSESS_NEXT_SUBMISSION | &quot;ASSESS_NEXT_SUBMISSION&quot; |



## Enum: FeedbackTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| MANUAL_UNREFERENCED | &quot;MANUAL_UNREFERENCED&quot; |
| AUTOMATIC_ADAPTED | &quot;AUTOMATIC_ADAPTED&quot; |
| AUTOMATIC | &quot;AUTOMATIC&quot; |



## Enum: SegmentTypeEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;AUTOMATIC&quot; |
| MANUAL | &quot;MANUAL&quot; |



