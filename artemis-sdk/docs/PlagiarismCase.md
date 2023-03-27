

# PlagiarismCase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**exercise** | [**Exercise**](Exercise.md) |  |  [optional] |
|**student** | [**User**](User.md) |  |  [optional] |
|**team** | [**Team**](Team.md) |  |  [optional] |
|**post** | [**Post**](Post.md) |  |  [optional] |
|**plagiarismSubmissions** | [**Set&lt;PlagiarismSubmissionObject&gt;**](PlagiarismSubmissionObject.md) |  |  [optional] |
|**verdict** | [**VerdictEnum**](#VerdictEnum) |  |  [optional] |
|**verdictMessage** | **String** |  |  [optional] |
|**verdictBy** | [**User**](User.md) |  |  [optional] |
|**verdictDate** | **OffsetDateTime** |  |  [optional] |
|**verdictPointDeduction** | **Integer** |  |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| PLAGIARISM | &quot;PLAGIARISM&quot; |
| POINT_DEDUCTION | &quot;POINT_DEDUCTION&quot; |
| WARNING | &quot;WARNING&quot; |
| NO_PLAGIARISM | &quot;NO_PLAGIARISM&quot; |



