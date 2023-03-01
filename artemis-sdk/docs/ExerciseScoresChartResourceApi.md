# ExerciseScoresChartResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCourseExerciseScores**](ExerciseScoresChartResourceApi.md#getCourseExerciseScores) | **GET** /api/courses/{courseId}/charts/exercise-scores |  |



## getCourseExerciseScores

> List&lt;ExerciseScoresDTO&gt; getCourseExerciseScores(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseScoresChartResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseScoresChartResourceApi apiInstance = new ExerciseScoresChartResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<ExerciseScoresDTO> result = apiInstance.getCourseExerciseScores(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseScoresChartResourceApi#getCourseExerciseScores");
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

[**List&lt;ExerciseScoresDTO&gt;**](ExerciseScoresDTO.md)

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

