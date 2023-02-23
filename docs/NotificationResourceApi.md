# NotificationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNotification**](NotificationResourceApi.md#createNotification) | **POST** /api/notifications |  |
| [**deleteNotification**](NotificationResourceApi.md#deleteNotification) | **DELETE** /api/notifications/{id} |  |
| [**getAllNotificationsForCurrentUserFilteredBySettings**](NotificationResourceApi.md#getAllNotificationsForCurrentUserFilteredBySettings) | **GET** /api/notifications |  |
| [**getNotification**](NotificationResourceApi.md#getNotification) | **GET** /api/notifications/{id} |  |
| [**updateNotification**](NotificationResourceApi.md#updateNotification) | **PUT** /api/notifications |  |



## createNotification

> GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner createNotification(getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner)



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
        GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner = new GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner(); // GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner | 
        try {
            GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner result = apiInstance.createNotification(getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationResourceApi#createNotification");
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
| **getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner** | [**GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner**](GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.md)|  | |

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


## deleteNotification

> deleteNotification(id)



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
        Long id = 56L; // Long | 
        try {
            apiInstance.deleteNotification(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationResourceApi#deleteNotification");
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


## getAllNotificationsForCurrentUserFilteredBySettings

> List&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt; getAllNotificationsForCurrentUserFilteredBySettings(pageable)



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
            List<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> result = apiInstance.getAllNotificationsForCurrentUserFilteredBySettings(pageable);
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

[**List&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt;**](GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.md)

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


## getNotification

> GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getNotification(id)



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
        Long id = 56L; // Long | 
        try {
            GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner result = apiInstance.getNotification(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationResourceApi#getNotification");
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

[**GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner**](GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.md)

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


## updateNotification

> GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner updateNotification(getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner)



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
        GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner = new GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner(); // GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner | 
        try {
            GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner result = apiInstance.updateNotification(getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationResourceApi#updateNotification");
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
| **getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner** | [**GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner**](GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner.md)|  | |

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

