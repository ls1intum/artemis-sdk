

# QuizQuestion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**text** | **String** |  |  [optional] |
|**hint** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**points** | **Integer** |  |  [optional] |
|**scoringType** | [**ScoringTypeEnum**](#ScoringTypeEnum) |  |  [optional] |
|**randomizeOrder** | **Boolean** |  |  [optional] |
|**invalid** | **Boolean** |  |  [optional] |
|**quizQuestionStatistic** | [**QuizQuestionStatistic**](QuizQuestionStatistic.md) |  |  [optional] |
|**type** | **String** |  |  |



## Enum: ScoringTypeEnum

| Name | Value |
|---- | -----|
| ALL_OR_NOTHING | &quot;ALL_OR_NOTHING&quot; |
| PROPORTIONAL_WITH_PENALTY | &quot;PROPORTIONAL_WITH_PENALTY&quot; |
| PROPORTIONAL_WITHOUT_PENALTY | &quot;PROPORTIONAL_WITHOUT_PENALTY&quot; |



