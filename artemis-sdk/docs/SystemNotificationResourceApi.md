# SystemNotificationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActiveAndFutureSystemNotifications**](SystemNotificationResourceApi.md#getActiveAndFutureSystemNotifications) | **GET** /api/system-notifications/active |  |
| [**getAllSystemNotifications**](SystemNotificationResourceApi.md#getAllSystemNotifications) | **GET** /api/system-notifications |  |
| [**getSystemNotification**](SystemNotificationResourceApi.md#getSystemNotification) | **GET** /api/system-notifications/{id} |  |



## getActiveAndFutureSystemNotifications

> List&lt;SystemNotification&gt; getActiveAndFutureSystemNotifications()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SystemNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SystemNotificationResourceApi apiInstance = new SystemNotificationResourceApi(defaultClient);
        try {
            List<SystemNotification> result = apiInstance.getActiveAndFutureSystemNotifications();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemNotificationResourceApi#getActiveAndFutureSystemNotifications");
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

[**List&lt;SystemNotification&gt;**](SystemNotification.md)

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


## getAllSystemNotifications

> List&lt;SystemNotification&gt; getAllSystemNotifications(pageable)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SystemNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SystemNotificationResourceApi apiInstance = new SystemNotificationResourceApi(defaultClient);
        Pageable pageable = new HashMap(); // Pageable | 
        try {
            List<SystemNotification> result = apiInstance.getAllSystemNotifications(pageable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemNotificationResourceApi#getAllSystemNotifications");
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

[**List&lt;SystemNotification&gt;**](SystemNotification.md)

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


## getSystemNotification

> SystemNotification getSystemNotification(id)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SystemNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SystemNotificationResourceApi apiInstance = new SystemNotificationResourceApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            SystemNotification result = apiInstance.getSystemNotification(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemNotificationResourceApi#getSystemNotification");
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
| **id** | **Long**|  | |

### Return type

[**SystemNotification**](SystemNotification.md)

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

