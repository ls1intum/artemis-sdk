# NotificationSettingsResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNotificationSettingsForCurrentUser**](NotificationSettingsResourceApi.md#getNotificationSettingsForCurrentUser) | **GET** /api/notification-settings |  |
| [**saveNotificationSettingsForCurrentUser**](NotificationSettingsResourceApi.md#saveNotificationSettingsForCurrentUser) | **PUT** /api/notification-settings |  |



## getNotificationSettingsForCurrentUser

> Set&lt;NotificationSetting&gt; getNotificationSettingsForCurrentUser()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.NotificationSettingsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationSettingsResourceApi apiInstance = new NotificationSettingsResourceApi(defaultClient);
        try {
            Set<NotificationSetting> result = apiInstance.getNotificationSettingsForCurrentUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationSettingsResourceApi#getNotificationSettingsForCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Set&lt;NotificationSetting&gt;**](NotificationSetting.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## saveNotificationSettingsForCurrentUser

> List&lt;NotificationSetting&gt; saveNotificationSettingsForCurrentUser(notificationSetting)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.NotificationSettingsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationSettingsResourceApi apiInstance = new NotificationSettingsResourceApi(defaultClient);
        List<NotificationSetting> notificationSetting = Arrays.asList(); // List<NotificationSetting> | 
        try {
            List<NotificationSetting> result = apiInstance.saveNotificationSettingsForCurrentUser(notificationSetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationSettingsResourceApi#saveNotificationSettingsForCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationSetting** | [**List&lt;NotificationSetting&gt;**](NotificationSetting.md)|  | |

### Return type

[**List&lt;NotificationSetting&gt;**](NotificationSetting.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |

