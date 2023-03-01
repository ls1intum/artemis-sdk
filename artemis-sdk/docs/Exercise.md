

# Exercise


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**shortName** | **String** |  |  [optional] |
|**maxPoints** | **Double** |  |  [optional] |
|**bonusPoints** | **Double** |  |  [optional] |
|**assessmentType** | [**AssessmentTypeEnum**](#AssessmentTypeEnum) |  |  [optional] |
|**releaseDate** | **OffsetDateTime** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**dueDate** | **OffsetDateTime** |  |  [optional] |
|**assessmentDueDate** | **OffsetDateTime** |  |  [optional] |
|**exampleSolutionPublicationDate** | **OffsetDateTime** |  |  [optional] |
|**difficulty** | [**DifficultyEnum**](#DifficultyEnum) |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**allowComplaintsForAutomaticAssessments** | **Boolean** |  |  [optional] |
|**allowManualFeedbackRequests** | **Boolean** |  |  [optional] |
|**includedInOverallScore** | [**IncludedInOverallScoreEnum**](#IncludedInOverallScoreEnum) |  |  [optional] |
|**problemStatement** | **String** |  |  [optional] |
|**gradingInstructions** | **String** |  |  [optional] |
|**categories** | **Set&lt;String&gt;** |  |  [optional] |
|**teamAssignmentConfig** | [**TeamAssignmentConfig**](TeamAssignmentConfig.md) |  |  [optional] |
|**teams** | [**Set&lt;Team&gt;**](Team.md) |  |  [optional] |
|**presentationScoreEnabled** | **Boolean** |  |  [optional] |
|**secondCorrectionEnabled** | **Boolean** |  |  [optional] |
|**course** | [**Course**](Course.md) |  |  [optional] |
|**exerciseGroup** | [**ExerciseGroup**](ExerciseGroup.md) |  |  [optional] |
|**gradingCriteria** | [**List&lt;GradingCriterion&gt;**](GradingCriterion.md) |  |  [optional] |
|**studentParticipations** | [**Set&lt;StudentParticipation&gt;**](StudentParticipation.md) |  |  [optional] |
|**tutorParticipations** | [**Set&lt;TutorParticipation&gt;**](TutorParticipation.md) |  |  [optional] |
|**exampleSubmissions** | [**Set&lt;ExampleSubmission&gt;**](ExampleSubmission.md) |  |  [optional] |
|**attachments** | [**Set&lt;Attachment&gt;**](Attachment.md) |  |  [optional] |
|**posts** | [**Set&lt;Post&gt;**](Post.md) |  |  [optional] |
|**plagiarismCases** | [**Set&lt;PlagiarismCase&gt;**](PlagiarismCase.md) |  |  [optional] |
|**numberOfAssessmentsOfCorrectionRounds** | [**List&lt;DueDateStat&gt;**](DueDateStat.md) |  |  [optional] |
|**totalNumberOfAssessments** | [**DueDateStat**](DueDateStat.md) |  |  [optional] |
|**averageRating** | **Double** |  |  [optional] |
|**numberOfRatings** | **Long** |  |  [optional] |
|**numberOfSubmissions** | [**DueDateStat**](DueDateStat.md) |  |  [optional] |
|**numberOfOpenComplaints** | **Long** |  |  [optional] |
|**numberOfComplaints** | **Long** |  |  [optional] |
|**numberOfOpenMoreFeedbackRequests** | **Long** |  |  [optional] |
|**numberOfMoreFeedbackRequests** | **Long** |  |  [optional] |
|**exerciseType** | [**ExerciseTypeEnum**](#ExerciseTypeEnum) |  |  [optional] |
|**studentAssignedTeamId** | **Long** |  |  [optional] |
|**studentAssignedTeamIdComputed** | **Boolean** |  |  [optional] |
|**gradingInstructionFeedbackUsed** | **Boolean** |  |  [optional] |
|**numberOfParticipations** | **Long** |  |  [optional] |
|**exampleSolutionPublished** | **Boolean** |  |  [optional] |
|**released** | **Boolean** |  |  [optional] |
|**testRunParticipationsExist** | **Boolean** |  |  [optional] |
|**teamMode** | **Boolean** |  |  [optional] |
|**visibleToStudents** | **Boolean** |  |  [optional] |
|**type** | **String** |  |  |



## Enum: AssessmentTypeEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;AUTOMATIC&quot; |
| SEMI_AUTOMATIC | &quot;SEMI_AUTOMATIC&quot; |
| MANUAL | &quot;MANUAL&quot; |



## Enum: DifficultyEnum

| Name | Value |
|---- | -----|
| EASY | &quot;EASY&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HARD | &quot;HARD&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| TEAM | &quot;TEAM&quot; |



## Enum: IncludedInOverallScoreEnum

| Name | Value |
|---- | -----|
| INCLUDED_COMPLETELY | &quot;INCLUDED_COMPLETELY&quot; |
| INCLUDED_AS_BONUS | &quot;INCLUDED_AS_BONUS&quot; |
| NOT_INCLUDED | &quot;NOT_INCLUDED&quot; |



## Enum: ExerciseTypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;TEXT&quot; |
| PROGRAMMING | &quot;PROGRAMMING&quot; |
| MODELING | &quot;MODELING&quot; |
| FILE_UPLOAD | &quot;FILE_UPLOAD&quot; |
| QUIZ | &quot;QUIZ&quot; |



