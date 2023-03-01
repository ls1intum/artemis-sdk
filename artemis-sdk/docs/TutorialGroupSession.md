

# TutorialGroupSession


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**start** | **OffsetDateTime** |  |  [optional] |
|**end** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**statusExplanation** | **String** |  |  [optional] |
|**location** | **String** |  |  [optional] |
|**attendanceCount** | **Integer** |  |  [optional] |
|**tutorialGroupSchedule** | [**TutorialGroupSchedule**](TutorialGroupSchedule.md) |  |  [optional] |
|**tutorialGroupFreePeriod** | [**TutorialGroupFreePeriod**](TutorialGroupFreePeriod.md) |  |  [optional] |
|**tutorialGroup** | [**TutorialGroup**](TutorialGroup.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



