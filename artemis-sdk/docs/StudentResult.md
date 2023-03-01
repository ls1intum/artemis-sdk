

# StudentResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Long** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**login** | **String** |  |  [optional] |
|**registrationNumber** | **String** |  |  [optional] |
|**submitted** | **Boolean** |  |  [optional] |
|**overallPointsAchieved** | **Double** |  |  [optional] |
|**overallScoreAchieved** | **Double** |  |  [optional] |
|**overallGrade** | **String** |  |  [optional] |
|**overallGradeInFirstCorrection** | **String** |  |  [optional] |
|**hasPassed** | **Boolean** |  |  [optional] |
|**overallPointsAchievedInFirstCorrection** | **Double** |  |  [optional] |
|**gradeWithBonus** | [**BonusResultDTO**](BonusResultDTO.md) |  |  [optional] |
|**exerciseGroupIdToExerciseResult** | [**Map&lt;String, ExerciseResult&gt;**](ExerciseResult.md) |  |  [optional] |
|**mostSeverePlagiarismVerdict** | [**MostSeverePlagiarismVerdictEnum**](#MostSeverePlagiarismVerdictEnum) |  |  [optional] |



## Enum: MostSeverePlagiarismVerdictEnum

| Name | Value |
|---- | -----|
| PLAGIARISM | &quot;PLAGIARISM&quot; |
| POINT_DEDUCTION | &quot;POINT_DEDUCTION&quot; |
| WARNING | &quot;WARNING&quot; |
| NO_PLAGIARISM | &quot;NO_PLAGIARISM&quot; |



