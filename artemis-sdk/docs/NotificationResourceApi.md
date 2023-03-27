# NotificationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllNotificationsForCurrentUserFilteredBySettings**](NotificationResourceApi.md#getAllNotificationsForCurrentUserFilteredBySettings) | **GET** /api/notifications |  |



## getAllNotificationsForCurrentUserFilteredBySettings

> List&lt;CreateSystemNotification200Response&gt; getAllNotificationsForCurrentUserFilteredBySettings(pageable)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.NotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationResourceApi apiInstance = new NotificationResourceApi(defaultClient);
        Pageable pageable = new HashMap(); // Pageable | 
        try {
            List<CreateSystemNotification200Response> result = apiInstance.getAllNotificationsForCurrentUserFilteredBySettings(pageable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationResourceApi#getAllNotificationsForCurrentUserFilteredBySettings");
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
| **pageable** | [**Pageable**](Pageable.md)|  | |

### Return type

[**List&lt;CreateSystemNotification200Response&gt;**](CreateSystemNotification200Response.md)

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

