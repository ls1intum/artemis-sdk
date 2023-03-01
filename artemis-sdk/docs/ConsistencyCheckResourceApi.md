# ConsistencyCheckResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkConsistencyOfProgrammingExercise**](ConsistencyCheckResourceApi.md#checkConsistencyOfProgrammingExercise) | **GET** /api/programming-exercises/{programmingExerciseId}/consistency-check |  |



## checkConsistencyOfProgrammingExercise

> List&lt;ConsistencyErrorDTO&gt; checkConsistencyOfProgrammingExercise(programmingExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConsistencyCheckResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConsistencyCheckResourceApi apiInstance = new ConsistencyCheckResourceApi(defaultClient);
        Long programmingExerciseId = 56L; // Long | 
        try {
            List<ConsistencyErrorDTO> result = apiInstance.checkConsistencyOfProgrammingExercise(programmingExerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyCheckResourceApi#checkConsistencyOfProgrammingExercise");
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
| **programmingExerciseId** | **Long**|  | |

### Return type

[**List&lt;ConsistencyErrorDTO&gt;**](ConsistencyErrorDTO.md)

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

