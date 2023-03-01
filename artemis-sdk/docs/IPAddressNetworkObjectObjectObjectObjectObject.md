

# IPAddressNetworkObjectObjectObjectObjectObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loopback** | **Object** |  |  [optional] |
|**addressCreator** | [**IPAddressCreatorObjectObjectObjectObjectObject**](IPAddressCreatorObjectObjectObjectObjectObject.md) |  |  [optional] |
|**standardLoopbackStrings** | **List&lt;String&gt;** |  |  [optional] |
|**ipv4** | **Boolean** |  |  [optional] |
|**ipversion** | [**IpversionEnum**](#IpversionEnum) |  |  [optional] |
|**ipv6** | **Boolean** |  |  [optional] |
|**segmentCaching** | **Boolean** |  |  [optional] |
|**prefixConfiguration** | [**PrefixConfigurationEnum**](#PrefixConfigurationEnum) |  |  [optional] |



## Enum: IpversionEnum

| Name | Value |
|---- | -----|
| IPV4 | &quot;IPv4&quot; |
| IPV6 | &quot;IPv6&quot; |



## Enum: PrefixConfigurationEnum

| Name | Value |
|---- | -----|
| ALL_PREFIXED_ADDRESSES_ARE_SUBNETS | &quot;ALL_PREFIXED_ADDRESSES_ARE_SUBNETS&quot; |
| PREFIXED_ZERO_HOSTS_ARE_SUBNETS | &quot;PREFIXED_ZERO_HOSTS_ARE_SUBNETS&quot; |
| EXPLICIT_SUBNETS | &quot;EXPLICIT_SUBNETS&quot; |



