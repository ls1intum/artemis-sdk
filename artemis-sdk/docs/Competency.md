

# Competency


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**masteryThreshold** | **Integer** |  |  [optional] |
|**taxonomy** | [**TaxonomyEnum**](#TaxonomyEnum) |  |  [optional] |
|**course** | [**Course**](Course.md) |  |  [optional] |
|**exercises** | [**Set&lt;GetExercise200Response&gt;**](GetExercise200Response.md) |  |  [optional] |
|**lectureUnits** | [**Set&lt;LectureUnit&gt;**](LectureUnit.md) |  |  [optional] |
|**consecutiveCourses** | [**Set&lt;Course&gt;**](Course.md) |  |  [optional] |
|**userProgress** | [**Set&lt;CompetencyProgress&gt;**](CompetencyProgress.md) |  |  [optional] |



## Enum: TaxonomyEnum

| Name | Value |
|---- | -----|
| REMEMBER | &quot;REMEMBER&quot; |
| UNDERSTAND | &quot;UNDERSTAND&quot; |
| APPLY | &quot;APPLY&quot; |
| ANALYZE | &quot;ANALYZE&quot; |
| EVALUATE | &quot;EVALUATE&quot; |
| CREATE | &quot;CREATE&quot; |



