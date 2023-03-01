

# PlagiarismComparisonModelingSubmissionElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**plagiarismResult** | [**PlagiarismResultModelingSubmissionElement**](PlagiarismResultModelingSubmissionElement.md) |  |  [optional] |
|**submissionA** | [**PlagiarismSubmissionModelingSubmissionElement**](PlagiarismSubmissionModelingSubmissionElement.md) |  |  [optional] |
|**submissionB** | [**PlagiarismSubmissionModelingSubmissionElement**](PlagiarismSubmissionModelingSubmissionElement.md) |  |  [optional] |
|**matches** | [**Set&lt;PlagiarismMatch&gt;**](PlagiarismMatch.md) |  |  [optional] |
|**similarity** | **Double** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;CONFIRMED&quot; |
| DENIED | &quot;DENIED&quot; |
| NONE | &quot;NONE&quot; |



