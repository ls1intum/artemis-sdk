# LongFeedbackTextResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLongFeedback**](LongFeedbackTextResourceApi.md#getLongFeedback) | **GET** /api/results/{resultId}/feedbacks/{feedbackId}/long-feedback |  |



## getLongFeedback

> LongFeedbackText getLongFeedback(resultId, feedbackId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LongFeedbackTextResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LongFeedbackTextResourceApi apiInstance = new LongFeedbackTextResourceApi(defaultClient);
        Long resultId = 56L; // Long | 
        Long feedbackId = 56L; // Long | 
        try {
            LongFeedbackText result = apiInstance.getLongFeedback(resultId, feedbackId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LongFeedbackTextResourceApi#getLongFeedback");
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
| **resultId** | **Long**|  | |
| **feedbackId** | **Long**|  | |

### Return type

[**LongFeedbackText**](LongFeedbackText.md)

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

