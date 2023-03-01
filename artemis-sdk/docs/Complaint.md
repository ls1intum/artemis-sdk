

# Complaint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**complaintText** | **String** |  |  [optional] |
|**accepted** | **Boolean** |  |  [optional] |
|**submittedTime** | **OffsetDateTime** |  |  [optional] |
|**complaintType** | [**ComplaintTypeEnum**](#ComplaintTypeEnum) |  |  [optional] |
|**result** | [**Result**](Result.md) |  |  [optional] |
|**student** | [**User**](User.md) |  |  [optional] |
|**team** | [**Team**](Team.md) |  |  [optional] |



## Enum: ComplaintTypeEnum

| Name | Value |
|---- | -----|
| COMPLAINT | &quot;COMPLAINT&quot; |
| MORE_FEEDBACK | &quot;MORE_FEEDBACK&quot; |



