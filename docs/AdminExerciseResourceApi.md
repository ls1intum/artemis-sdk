# AdminExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUpcomingExercises**](AdminExerciseResourceApi.md#getUpcomingExercises) | **GET** /api/admin/exercises/upcoming |  |



## getUpcomingExercises

> Set&lt;GetExercise200Response&gt; getUpcomingExercises()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminExerciseResourceApi apiInstance = new AdminExerciseResourceApi(defaultClient);
        try {
            Set<GetExercise200Response> result = apiInstance.getUpcomingExercises();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExerciseResourceApi#getUpcomingExercises");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Set&lt;GetExercise200Response&gt;**](GetExercise200Response.md)

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

