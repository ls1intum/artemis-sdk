

# PlagiarismComparisonTextSubmissionElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**plagiarismResult** | [**PlagiarismResultTextSubmissionElement**](PlagiarismResultTextSubmissionElement.md) |  |  [optional] |
|**submissionA** | [**PlagiarismSubmissionTextSubmissionElement**](PlagiarismSubmissionTextSubmissionElement.md) |  |  [optional] |
|**submissionB** | [**PlagiarismSubmissionTextSubmissionElement**](PlagiarismSubmissionTextSubmissionElement.md) |  |  [optional] |
|**matches** | [**Set&lt;PlagiarismMatch&gt;**](PlagiarismMatch.md) |  |  [optional] |
|**similarity** | **Double** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;CONFIRMED&quot; |
| DENIED | &quot;DENIED&quot; |
| NONE | &quot;NONE&quot; |



