

# Result


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**completionDate** | **OffsetDateTime** |  |  [optional] |
|**successful** | **Boolean** |  |  [optional] |
|**score** | **Double** |  |  [optional] |
|**rated** | **Boolean** |  |  [optional] |
|**submission** | [**GetAllTextSubmissions200ResponseInner**](GetAllTextSubmissions200ResponseInner.md) |  |  [optional] |
|**feedbacks** | [**List&lt;Feedback&gt;**](Feedback.md) |  |  [optional] |
|**participation** | [**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md) |  |  [optional] |
|**assessor** | [**User**](User.md) |  |  [optional] |
|**assessmentType** | [**AssessmentTypeEnum**](#AssessmentTypeEnum) |  |  [optional] |
|**hasComplaint** | **Boolean** |  |  [optional] |
|**exampleResult** | **Boolean** |  |  [optional] |
|**testCaseCount** | **Integer** |  |  [optional] |
|**passedTestCaseCount** | **Integer** |  |  [optional] |
|**codeIssueCount** | **Integer** |  |  [optional] |
|**feedbackType** | [**Feedback**](Feedback.md) |  |  [optional] |
|**coverageFileReportsByTestCaseName** | **Map&lt;String, Set&lt;CoverageFileReport&gt;&gt;** |  |  [optional] |



## Enum: AssessmentTypeEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;AUTOMATIC&quot; |
| SEMI_AUTOMATIC | &quot;SEMI_AUTOMATIC&quot; |
| MANUAL | &quot;MANUAL&quot; |



