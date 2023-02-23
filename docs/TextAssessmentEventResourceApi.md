# TextAssessmentEventResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAssessmentEvent**](TextAssessmentEventResourceApi.md#addAssessmentEvent) | **POST** /api/event-insights/text-assessment/events |  |
| [**getNumberOfTutorsInvolved**](TextAssessmentEventResourceApi.md#getNumberOfTutorsInvolved) | **GET** /api/event-insights/text-assessment/courses/{courseId}/text-exercises/{exerciseId}/tutors-involved |  |



## addAssessmentEvent

> addAssessmentEvent(textAssessmentEvent)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentEventResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentEventResourceApi apiInstance = new TextAssessmentEventResourceApi(defaultClient);
        TextAssessmentEvent textAssessmentEvent = new TextAssessmentEvent(); // TextAssessmentEvent | 
        try {
            apiInstance.addAssessmentEvent(textAssessmentEvent);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentEventResourceApi#addAssessmentEvent");
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
| **textAssessmentEvent** | [**TextAssessmentEvent**](TextAssessmentEvent.md)|  | |

### Return type

null (empty response body)

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


## getNumberOfTutorsInvolved

> Integer getNumberOfTutorsInvolved(courseId, exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentEventResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentEventResourceApi apiInstance = new TextAssessmentEventResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long exerciseId = 56L; // Long | 
        try {
            Integer result = apiInstance.getNumberOfTutorsInvolved(courseId, exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentEventResourceApi#getNumberOfTutorsInvolved");
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

**Integer**

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

