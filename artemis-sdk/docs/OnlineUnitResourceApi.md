# OnlineUnitResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOnlineUnit**](OnlineUnitResourceApi.md#createOnlineUnit) | **POST** /api/lectures/{lectureId}/online-units |  |
| [**getOnlineResource**](OnlineUnitResourceApi.md#getOnlineResource) | **GET** /api/lectures/online-units/fetch-online-resource |  |
| [**getOnlineUnit**](OnlineUnitResourceApi.md#getOnlineUnit) | **GET** /api/lectures/{lectureId}/online-units/{onlineUnitId} |  |
| [**updateOnlineUnit**](OnlineUnitResourceApi.md#updateOnlineUnit) | **PUT** /api/lectures/{lectureId}/online-units |  |



## createOnlineUnit

> OnlineUnit createOnlineUnit(lectureId, onlineUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.OnlineUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OnlineUnitResourceApi apiInstance = new OnlineUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        OnlineUnit onlineUnit = new OnlineUnit(); // OnlineUnit | 
        try {
            OnlineUnit result = apiInstance.createOnlineUnit(lectureId, onlineUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnlineUnitResourceApi#createOnlineUnit");
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
| **lectureId** | **Long**|  | |
| **onlineUnit** | [**OnlineUnit**](OnlineUnit.md)|  | |

### Return type

[**OnlineUnit**](OnlineUnit.md)

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


## getOnlineResource

> OnlineResourceDTO getOnlineResource(link)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.OnlineUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OnlineUnitResourceApi apiInstance = new OnlineUnitResourceApi(defaultClient);
        String link = "link_example"; // String | 
        try {
            OnlineResourceDTO result = apiInstance.getOnlineResource(link);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnlineUnitResourceApi#getOnlineResource");
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
| **link** | **String**|  | |

### Return type

[**OnlineResourceDTO**](OnlineResourceDTO.md)

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


## getOnlineUnit

> OnlineUnit getOnlineUnit(onlineUnitId, lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.OnlineUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OnlineUnitResourceApi apiInstance = new OnlineUnitResourceApi(defaultClient);
        Long onlineUnitId = 56L; // Long | 
        Long lectureId = 56L; // Long | 
        try {
            OnlineUnit result = apiInstance.getOnlineUnit(onlineUnitId, lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnlineUnitResourceApi#getOnlineUnit");
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
| **onlineUnitId** | **Long**|  | |
| **lectureId** | **Long**|  | |

### Return type

[**OnlineUnit**](OnlineUnit.md)

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


## updateOnlineUnit

> OnlineUnit updateOnlineUnit(lectureId, onlineUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.OnlineUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OnlineUnitResourceApi apiInstance = new OnlineUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        OnlineUnit onlineUnit = new OnlineUnit(); // OnlineUnit | 
        try {
            OnlineUnit result = apiInstance.updateOnlineUnit(lectureId, onlineUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnlineUnitResourceApi#updateOnlineUnit");
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
| **lectureId** | **Long**|  | |
| **onlineUnit** | [**OnlineUnit**](OnlineUnit.md)|  | |

### Return type

[**OnlineUnit**](OnlineUnit.md)

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

