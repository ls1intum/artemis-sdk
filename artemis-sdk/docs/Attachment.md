

# Attachment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**link** | **String** |  |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**uploadDate** | **OffsetDateTime** |  |  [optional] |
|**releaseDate** | **OffsetDateTime** |  |  [optional] |
|**attachmentType** | [**AttachmentTypeEnum**](#AttachmentTypeEnum) |  |  [optional] |
|**exercise** | [**GetExercise200Response**](GetExercise200Response.md) |  |  [optional] |
|**lecture** | [**Lecture**](Lecture.md) |  |  [optional] |
|**attachmentUnit** | [**AttachmentUnit**](AttachmentUnit.md) |  |  [optional] |
|**visibleToStudents** | **Boolean** |  |  [optional] |



## Enum: AttachmentTypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;FILE&quot; |
| URL | &quot;URL&quot; |



