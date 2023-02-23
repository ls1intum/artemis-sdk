# AdminTextAssessmentEventResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventsByCourseId**](AdminTextAssessmentEventResourceApi.md#getEventsByCourseId) | **GET** /api/admin/event-insights/text-assessment/events/{courseId} |  |



## getEventsByCourseId

> List&lt;TextAssessmentEvent&gt; getEventsByCourseId(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminTextAssessmentEventResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminTextAssessmentEventResourceApi apiInstance = new AdminTextAssessmentEventResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<TextAssessmentEvent> result = apiInstance.getEventsByCourseId(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminTextAssessmentEventResourceApi#getEventsByCourseId");
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

### Return type

[**List&lt;TextAssessmentEvent&gt;**](TextAssessmentEvent.md)

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

