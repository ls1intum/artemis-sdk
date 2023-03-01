

# BonusResultDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bonusStrategy** | [**BonusStrategyEnum**](#BonusStrategyEnum) |  |  [optional] |
|**bonusFromTitle** | **String** |  |  [optional] |
|**studentPointsOfBonusSource** | **Double** |  |  [optional] |
|**bonusGrade** | **String** |  |  [optional] |
|**finalPoints** | **Double** |  |  [optional] |
|**finalGrade** | **String** |  |  [optional] |
|**mostSeverePlagiarismVerdict** | [**MostSeverePlagiarismVerdictEnum**](#MostSeverePlagiarismVerdictEnum) |  |  [optional] |
|**achievedPresentationScore** | **Integer** |  |  [optional] |
|**presentationScoreThreshold** | **Integer** |  |  [optional] |



## Enum: BonusStrategyEnum

| Name | Value |
|---- | -----|
| GRADES_DISCRETE | &quot;GRADES_DISCRETE&quot; |
| GRADES_CONTINUOUS | &quot;GRADES_CONTINUOUS&quot; |
| POINTS | &quot;POINTS&quot; |



## Enum: MostSeverePlagiarismVerdictEnum

| Name | Value |
|---- | -----|
| PLAGIARISM | &quot;PLAGIARISM&quot; |
| POINT_DEDUCTION | &quot;POINT_DEDUCTION&quot; |
| WARNING | &quot;WARNING&quot; |
| NO_PLAGIARISM | &quot;NO_PLAGIARISM&quot; |



