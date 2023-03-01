# ExamActivityResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loadAllActions**](ExamActivityResourceApi.md#loadAllActions) | **GET** /api/exam-monitoring/{examId}/load-actions |  |
| [**updateMonitoring**](ExamActivityResourceApi.md#updateMonitoring) | **PUT** /api/courses/{courseId}/exams/{examId}/statistics |  |



## loadAllActions

> List&lt;LoadAllActions200ResponseInner&gt; loadAllActions(examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamActivityResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamActivityResourceApi apiInstance = new ExamActivityResourceApi(defaultClient);
        Long examId = 56L; // Long | 
        try {
            List<LoadAllActions200ResponseInner> result = apiInstance.loadAllActions(examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamActivityResourceApi#loadAllActions");
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
| **examId** | **Long**|  | |

### Return type

[**List&lt;LoadAllActions200ResponseInner&gt;**](LoadAllActions200ResponseInner.md)

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


## updateMonitoring

> Boolean updateMonitoring(courseId, examId, body)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamActivityResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamActivityResourceApi apiInstance = new ExamActivityResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Boolean body = true; // Boolean | 
        try {
            Boolean result = apiInstance.updateMonitoring(courseId, examId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamActivityResourceApi#updateMonitoring");
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
| **courseId** | **Long**|  | |
| **examId** | **Long**|  | |
| **body** | **Boolean**|  | |

### Return type

**Boolean**

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

