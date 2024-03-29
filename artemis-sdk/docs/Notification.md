

# Notification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**text** | **String** |  |  [optional] |
|**textIsPlaceholder** | **Boolean** |  |  [optional] |
|**placeholderValues** | **String** |  |  [optional] |
|**notificationDate** | **OffsetDateTime** |  |  [optional] |
|**target** | **String** |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional] |
|**outdated** | **Boolean** |  |  [optional] |
|**author** | [**User**](User.md) |  |  [optional] |
|**targetTransient** | [**NotificationTarget**](NotificationTarget.md) |  |  [optional] |
|**transientAndStringTarget** | [**NotificationTarget**](NotificationTarget.md) |  |  [optional] |
|**notificationType** | **String** |  |  |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



