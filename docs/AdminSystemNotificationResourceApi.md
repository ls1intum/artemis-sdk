# AdminSystemNotificationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSystemNotification**](AdminSystemNotificationResourceApi.md#createSystemNotification) | **POST** /api/admin/system-notifications |  |
| [**deleteSystemNotification**](AdminSystemNotificationResourceApi.md#deleteSystemNotification) | **DELETE** /api/admin/system-notifications/{id} |  |
| [**updateSystemNotification**](AdminSystemNotificationResourceApi.md#updateSystemNotification) | **PUT** /api/admin/system-notifications |  |



## createSystemNotification

> GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner createSystemNotification(systemNotification)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminSystemNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminSystemNotificationResourceApi apiInstance = new AdminSystemNotificationResourceApi(defaultClient);
        SystemNotification systemNotification = new SystemNotification(); // SystemNotification | 
        try {
            GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner result = apiInstance.createSystemNotification(systemNotification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSystemNotificationResourceApi#createSystemNotification");
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
| **systemNotification** | [**SystemNotification**](SystemNotification.md)|  | |

### Return type

[**GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner**](GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.md)

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


## deleteSystemNotification

> deleteSystemNotification(id)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminSystemNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminSystemNotificationResourceApi apiInstance = new AdminSystemNotificationResourceApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            apiInstance.deleteSystemNotification(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSystemNotificationResourceApi#deleteSystemNotification");
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

null (empty response body)

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


## updateSystemNotification

> SystemNotification updateSystemNotification(systemNotification)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminSystemNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminSystemNotificationResourceApi apiInstance = new AdminSystemNotificationResourceApi(defaultClient);
        SystemNotification systemNotification = new SystemNotification(); // SystemNotification | 
        try {
            SystemNotification result = apiInstance.updateSystemNotification(systemNotification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminSystemNotificationResourceApi#updateSystemNotification");
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
| **systemNotification** | [**SystemNotification**](SystemNotification.md)|  | |

### Return type

[**SystemNotification**](SystemNotification.md)

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
