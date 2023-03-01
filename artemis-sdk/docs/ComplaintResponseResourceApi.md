# ComplaintResponseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getComplaintResponseByComplaintId**](ComplaintResponseResourceApi.md#getComplaintResponseByComplaintId) | **GET** /api/complaint-responses/complaint/{complaintId} |  |
| [**lockComplaint**](ComplaintResponseResourceApi.md#lockComplaint) | **POST** /api/complaint-responses/complaint/{complaintId}/create-lock |  |
| [**refreshLockOnComplaint**](ComplaintResponseResourceApi.md#refreshLockOnComplaint) | **POST** /api/complaint-responses/complaint/{complaintId}/refresh-lock |  |
| [**removeLockFromComplaint**](ComplaintResponseResourceApi.md#removeLockFromComplaint) | **DELETE** /api/complaint-responses/complaint/{complaintId}/remove-lock |  |
| [**resolveComplaint**](ComplaintResponseResourceApi.md#resolveComplaint) | **PUT** /api/complaint-responses/complaint/{complaintId}/resolve |  |



## getComplaintResponseByComplaintId

> ComplaintResponse getComplaintResponseByComplaintId(complaintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResponseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResponseResourceApi apiInstance = new ComplaintResponseResourceApi(defaultClient);
        Long complaintId = 56L; // Long | 
        try {
            ComplaintResponse result = apiInstance.getComplaintResponseByComplaintId(complaintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResponseResourceApi#getComplaintResponseByComplaintId");
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
| **complaintId** | **Long**|  | |

### Return type

[**ComplaintResponse**](ComplaintResponse.md)

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


## lockComplaint

> ComplaintResponse lockComplaint(complaintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResponseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResponseResourceApi apiInstance = new ComplaintResponseResourceApi(defaultClient);
        Long complaintId = 56L; // Long | 
        try {
            ComplaintResponse result = apiInstance.lockComplaint(complaintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResponseResourceApi#lockComplaint");
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
| **complaintId** | **Long**|  | |

### Return type

[**ComplaintResponse**](ComplaintResponse.md)

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


## refreshLockOnComplaint

> ComplaintResponse refreshLockOnComplaint(complaintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResponseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResponseResourceApi apiInstance = new ComplaintResponseResourceApi(defaultClient);
        Long complaintId = 56L; // Long | 
        try {
            ComplaintResponse result = apiInstance.refreshLockOnComplaint(complaintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResponseResourceApi#refreshLockOnComplaint");
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
| **complaintId** | **Long**|  | |

### Return type

[**ComplaintResponse**](ComplaintResponse.md)

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


## removeLockFromComplaint

> removeLockFromComplaint(complaintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResponseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResponseResourceApi apiInstance = new ComplaintResponseResourceApi(defaultClient);
        Long complaintId = 56L; // Long | 
        try {
            apiInstance.removeLockFromComplaint(complaintId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResponseResourceApi#removeLockFromComplaint");
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
| **complaintId** | **Long**|  | |

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


## resolveComplaint

> ComplaintResponse resolveComplaint(complaintId, complaintResponse)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResponseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResponseResourceApi apiInstance = new ComplaintResponseResourceApi(defaultClient);
        Long complaintId = 56L; // Long | 
        ComplaintResponse complaintResponse = new ComplaintResponse(); // ComplaintResponse | 
        try {
            ComplaintResponse result = apiInstance.resolveComplaint(complaintId, complaintResponse);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResponseResourceApi#resolveComplaint");
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
| **complaintId** | **Long**|  | |
| **complaintResponse** | [**ComplaintResponse**](ComplaintResponse.md)|  | |

### Return type

[**ComplaintResponse**](ComplaintResponse.md)

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

