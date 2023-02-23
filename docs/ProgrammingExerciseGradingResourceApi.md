# ProgrammingExerciseGradingResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGradingStatistics**](ProgrammingExerciseGradingResourceApi.md#getGradingStatistics) | **GET** /api/programming-exercises/{exerciseId}/grading/statistics |  |
| [**reEvaluateGradedResults**](ProgrammingExerciseGradingResourceApi.md#reEvaluateGradedResults) | **PUT** /api/programming-exercises/{exerciseId}/grading/re-evaluate |  |



## getGradingStatistics

> ProgrammingExerciseGradingStatisticsDTO getGradingStatistics(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseGradingResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseGradingResourceApi apiInstance = new ProgrammingExerciseGradingResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ProgrammingExerciseGradingStatisticsDTO result = apiInstance.getGradingStatistics(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseGradingResourceApi#getGradingStatistics");
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
| **exerciseId** | **Long**|  | |

### Return type

[**ProgrammingExerciseGradingStatisticsDTO**](ProgrammingExerciseGradingStatisticsDTO.md)

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


## reEvaluateGradedResults

> Integer reEvaluateGradedResults(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseGradingResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseGradingResourceApi apiInstance = new ProgrammingExerciseGradingResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Integer result = apiInstance.reEvaluateGradedResults(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseGradingResourceApi#reEvaluateGradedResults");
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

