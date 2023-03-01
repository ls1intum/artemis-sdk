

# AnswerPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**content** | **String** |  |  [optional] |
|**tokenizedContent** | **String** |  |  [optional] |
|**resolvesPost** | **Boolean** |  |  [optional] |
|**reactions** | [**Set&lt;Reaction&gt;**](Reaction.md) |  |  [optional] |
|**post** | [**Post**](Post.md) |  |  [optional] |
|**coursePostingBelongsTo** | [**Course**](Course.md) |  |  [optional] |
|**authorRole** | [**AuthorRoleEnum**](#AuthorRoleEnum) |  |  [optional] |



## Enum: AuthorRoleEnum

| Name | Value |
|---- | -----|
| INSTRUCTOR | &quot;INSTRUCTOR&quot; |
| TUTOR | &quot;TUTOR&quot; |
| USER | &quot;USER&quot; |



