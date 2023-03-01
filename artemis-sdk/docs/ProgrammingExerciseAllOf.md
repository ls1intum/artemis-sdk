

# ProgrammingExerciseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testRepositoryUrl** | **String** |  |  [optional] |
|**auxiliaryRepositories** | [**List&lt;AuxiliaryRepository&gt;**](AuxiliaryRepository.md) |  |  [optional] |
|**publishBuildPlanUrl** | **Boolean** |  |  [optional] |
|**allowOnlineEditor** | **Boolean** |  |  [optional] |
|**allowOfflineIde** | **Boolean** |  |  [optional] |
|**staticCodeAnalysisEnabled** | **Boolean** |  |  [optional] |
|**maxStaticCodeAnalysisPenalty** | **Integer** |  |  [optional] |
|**programmingLanguage** | [**ProgrammingLanguageEnum**](#ProgrammingLanguageEnum) |  |  [optional] |
|**packageName** | **String** |  |  [optional] |
|**sequentialTestRuns** | **Boolean** |  |  [optional] |
|**showTestNamesToStudents** | **Boolean** |  |  [optional] |
|**buildAndTestStudentSubmissionsAfterDueDate** | **OffsetDateTime** |  |  [optional] |
|**testCasesChanged** | **Boolean** |  |  [optional] |
|**projectKey** | **String** |  |  [optional] |
|**buildPlanAccessSecret** | **String** |  |  [optional] |
|**templateParticipation** | [**TemplateProgrammingExerciseParticipation**](TemplateProgrammingExerciseParticipation.md) |  |  [optional] |
|**solutionParticipation** | [**SolutionProgrammingExerciseParticipation**](SolutionProgrammingExerciseParticipation.md) |  |  [optional] |
|**testCases** | [**Set&lt;ProgrammingExerciseTestCase&gt;**](ProgrammingExerciseTestCase.md) |  |  [optional] |
|**tasks** | [**List&lt;ProgrammingExerciseTask&gt;**](ProgrammingExerciseTask.md) |  |  [optional] |
|**staticCodeAnalysisCategories** | [**Set&lt;StaticCodeAnalysisCategory&gt;**](StaticCodeAnalysisCategory.md) |  |  [optional] |
|**submissionPolicy** | [**SubmissionPolicy**](SubmissionPolicy.md) |  |  [optional] |
|**projectType** | [**ProjectTypeEnum**](#ProjectTypeEnum) |  |  [optional] |
|**exerciseHints** | [**Set&lt;ExerciseHint&gt;**](ExerciseHint.md) |  |  [optional] |
|**testwiseCoverageEnabled** | **Boolean** |  |  [optional] |
|**branch** | **String** |  |  [optional] |
|**releaseTestsWithExampleSolution** | **Boolean** |  |  [optional] |
|**isLocalSimulation** | **Boolean** |  |  [optional] |
|**checkoutSolutionRepository** | **Boolean** |  |  [optional] |



## Enum: ProgrammingLanguageEnum

| Name | Value |
|---- | -----|
| JAVA | &quot;JAVA&quot; |
| PYTHON | &quot;PYTHON&quot; |
| C | &quot;C&quot; |
| HASKELL | &quot;HASKELL&quot; |
| KOTLIN | &quot;KOTLIN&quot; |
| VHDL | &quot;VHDL&quot; |
| ASSEMBLER | &quot;ASSEMBLER&quot; |
| SWIFT | &quot;SWIFT&quot; |
| OCAML | &quot;OCAML&quot; |
| EMPTY | &quot;EMPTY&quot; |



## Enum: ProjectTypeEnum

| Name | Value |
|---- | -----|
| MAVEN_MAVEN | &quot;MAVEN_MAVEN&quot; |
| PLAIN_MAVEN | &quot;PLAIN_MAVEN&quot; |
| PLAIN | &quot;PLAIN&quot; |
| XCODE | &quot;XCODE&quot; |
| FACT | &quot;FACT&quot; |
| GCC | &quot;GCC&quot; |
| PLAIN_GRADLE | &quot;PLAIN_GRADLE&quot; |
| GRADLE_GRADLE | &quot;GRADLE_GRADLE&quot; |



