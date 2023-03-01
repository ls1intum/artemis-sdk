

# GradingScale


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**gradeType** | [**GradeTypeEnum**](#GradeTypeEnum) |  |  [optional] |
|**bonusStrategy** | [**BonusStrategyEnum**](#BonusStrategyEnum) |  |  [optional] |
|**plagiarismGrade** | **String** |  |  [optional] |
|**noParticipationGrade** | **String** |  |  [optional] |
|**course** | [**Course**](Course.md) |  |  [optional] |
|**exam** | [**Exam**](Exam.md) |  |  [optional] |
|**gradeSteps** | [**Set&lt;GradeStep&gt;**](GradeStep.md) |  |  [optional] |
|**bonusFrom** | [**Set&lt;Bonus&gt;**](Bonus.md) |  |  [optional] |



## Enum: GradeTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| BONUS | &quot;BONUS&quot; |
| GRADE | &quot;GRADE&quot; |



## Enum: BonusStrategyEnum

| Name | Value |
|---- | -----|
| GRADES_DISCRETE | &quot;GRADES_DISCRETE&quot; |
| GRADES_CONTINUOUS | &quot;GRADES_CONTINUOUS&quot; |
| POINTS | &quot;POINTS&quot; |



