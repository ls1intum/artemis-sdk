# ProgrammingExerciseTaskResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTasks**](ProgrammingExerciseTaskResourceApi.md#getTasks) | **GET** /api/programming-exercises/{exerciseId}/tasks |  |
| [**getTasksWithUnassignedTask**](ProgrammingExerciseTaskResourceApi.md#getTasksWithUnassignedTask) | **GET** /api/programming-exercises/{exerciseId}/tasks-with-unassigned-test-cases |  |



## getTasks

> Set&lt;ProgrammingExerciseTask&gt; getTasks(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseTaskResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseTaskResourceApi apiInstance = new ProgrammingExerciseTaskResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<ProgrammingExerciseTask> result = apiInstance.getTasks(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseTaskResourceApi#getTasks");
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

[**Set&lt;ProgrammingExerciseTask&gt;**](ProgrammingExerciseTask.md)

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


## getTasksWithUnassignedTask

> Set&lt;ProgrammingExerciseTask&gt; getTasksWithUnassignedTask(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseTaskResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseTaskResourceApi apiInstance = new ProgrammingExerciseTaskResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<ProgrammingExerciseTask> result = apiInstance.getTasksWithUnassignedTask(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseTaskResourceApi#getTasksWithUnassignedTask");
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

[**Set&lt;ProgrammingExerciseTask&gt;**](ProgrammingExerciseTask.md)

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

