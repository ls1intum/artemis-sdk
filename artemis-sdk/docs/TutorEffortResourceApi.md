# TutorEffortResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateTutorEfforts**](TutorEffortResourceApi.md#calculateTutorEfforts) | **GET** /api/courses/{courseId}/exercises/{exerciseId}/tutor-effort |  |



## calculateTutorEfforts

> List&lt;TutorEffort&gt; calculateTutorEfforts(courseId, exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorEffortResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorEffortResourceApi apiInstance = new TutorEffortResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long exerciseId = 56L; // Long | 
        try {
            List<TutorEffort> result = apiInstance.calculateTutorEfforts(courseId, exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorEffortResourceApi#calculateTutorEfforts");
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
| **exerciseId** | **Long**|  | |

### Return type

[**List&lt;TutorEffort&gt;**](TutorEffort.md)

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

