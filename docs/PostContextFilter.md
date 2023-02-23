

# PostContextFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**courseId** | **Long** |  |  |
|**courseWideContext** | [**CourseWideContextEnum**](#CourseWideContextEnum) |  |  [optional] |
|**exerciseId** | **Long** |  |  [optional] |
|**lectureId** | **Long** |  |  [optional] |
|**plagiarismCaseId** | **Long** |  |  [optional] |
|**conversationId** | **Long** |  |  [optional] |
|**searchText** | **String** |  |  [optional] |
|**filterToUnresolved** | **Boolean** |  |  [optional] |
|**filterToOwn** | **Boolean** |  |  [optional] |
|**filterToAnsweredOrReacted** | **Boolean** |  |  [optional] |
|**postSortCriterion** | [**PostSortCriterionEnum**](#PostSortCriterionEnum) |  |  [optional] |
|**sortingOrder** | [**SortingOrderEnum**](#SortingOrderEnum) |  |  [optional] |



## Enum: CourseWideContextEnum

| Name | Value |
|---- | -----|
| TECH_SUPPORT | &quot;TECH_SUPPORT&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| RANDOM | &quot;RANDOM&quot; |
| ANNOUNCEMENT | &quot;ANNOUNCEMENT&quot; |



## Enum: PostSortCriterionEnum

| Name | Value |
|---- | -----|
| CREATION_DATE | &quot;CREATION_DATE&quot; |
| VOTES | &quot;VOTES&quot; |
| ANSWER_COUNT | &quot;ANSWER_COUNT&quot; |



## Enum: SortingOrderEnum

| Name | Value |
|---- | -----|
| ASCENDING | &quot;ASCENDING&quot; |
| DESCENDING | &quot;DESCENDING&quot; |



