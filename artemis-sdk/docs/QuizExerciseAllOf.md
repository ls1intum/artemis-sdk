

# QuizExerciseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  [optional] |
|**randomizeQuestionOrder** | **Boolean** |  |  [optional] |
|**allowedNumberOfAttempts** | **Integer** |  |  [optional] |
|**remainingNumberOfAttempts** | **Integer** |  |  [optional] |
|**isOpenForPractice** | **Boolean** |  |  [optional] |
|**quizMode** | [**QuizModeEnum**](#QuizModeEnum) |  |  [optional] |
|**duration** | **Integer** |  |  [optional] |
|**quizPointStatistic** | [**QuizPointStatistic**](QuizPointStatistic.md) |  |  [optional] |
|**quizQuestions** | [**List&lt;QuizQuestion&gt;**](QuizQuestion.md) |  |  [optional] |
|**quizBatches** | [**Set&lt;QuizBatch&gt;**](QuizBatch.md) |  |  [optional] |
|**quizStarted** | **Boolean** |  |  [optional] |
|**quizEnded** | **Boolean** |  |  [optional] |
|**questionParent** | [**QuizQuestion**](QuizQuestion.md) |  |  [optional] |



## Enum: QuizModeEnum

| Name | Value |
|---- | -----|
| SYNCHRONIZED | &quot;SYNCHRONIZED&quot; |
| BATCHED | &quot;BATCHED&quot; |
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



