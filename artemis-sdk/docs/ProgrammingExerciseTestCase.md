

# ProgrammingExerciseTestCase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**testName** | **String** |  |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  [optional] |
|**bonusMultiplier** | **Double** |  |  |
|**bonusPoints** | **Double** |  |  |
|**tasks** | [**Set&lt;ProgrammingExerciseTask&gt;**](ProgrammingExerciseTask.md) |  |  [optional] |
|**solutionEntries** | [**Set&lt;ProgrammingExerciseSolutionEntry&gt;**](ProgrammingExerciseSolutionEntry.md) |  |  [optional] |
|**exercise** | [**Exercise**](Exercise.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**coverageEntries** | [**Set&lt;TestwiseCoverageReportEntry&gt;**](TestwiseCoverageReportEntry.md) |  |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;ALWAYS&quot; |
| AFTER_DUE_DATE | &quot;AFTER_DUE_DATE&quot; |
| NEVER | &quot;NEVER&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRUCTURAL | &quot;STRUCTURAL&quot; |
| BEHAVIORAL | &quot;BEHAVIORAL&quot; |
| DEFAULT | &quot;DEFAULT&quot; |



