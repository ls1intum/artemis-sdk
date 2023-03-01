# ProgrammingExerciseTestCaseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTestCases**](ProgrammingExerciseTestCaseResourceApi.md#getTestCases) | **GET** /api/programming-exercises/{exerciseId}/test-cases |  |
| [**resetTestCases**](ProgrammingExerciseTestCaseResourceApi.md#resetTestCases) | **PATCH** /api/programming-exercises/{exerciseId}/test-cases/reset |  |
| [**updateTestCases**](ProgrammingExerciseTestCaseResourceApi.md#updateTestCases) | **PATCH** /api/programming-exercises/{exerciseId}/update-test-cases |  |



## getTestCases

> Set&lt;ProgrammingExerciseTestCase&gt; getTestCases(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseTestCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseTestCaseResourceApi apiInstance = new ProgrammingExerciseTestCaseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<ProgrammingExerciseTestCase> result = apiInstance.getTestCases(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseTestCaseResourceApi#getTestCases");
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

[**Set&lt;ProgrammingExerciseTestCase&gt;**](ProgrammingExerciseTestCase.md)

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


## resetTestCases

> List&lt;ProgrammingExerciseTestCase&gt; resetTestCases(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseTestCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseTestCaseResourceApi apiInstance = new ProgrammingExerciseTestCaseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<ProgrammingExerciseTestCase> result = apiInstance.resetTestCases(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseTestCaseResourceApi#resetTestCases");
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

[**List&lt;ProgrammingExerciseTestCase&gt;**](ProgrammingExerciseTestCase.md)

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


## updateTestCases

> Set&lt;ProgrammingExerciseTestCase&gt; updateTestCases(exerciseId, programmingExerciseTestCaseDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseTestCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseTestCaseResourceApi apiInstance = new ProgrammingExerciseTestCaseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Set<ProgrammingExerciseTestCaseDTO> programmingExerciseTestCaseDTO = Arrays.asList(); // Set<ProgrammingExerciseTestCaseDTO> | 
        try {
            Set<ProgrammingExerciseTestCase> result = apiInstance.updateTestCases(exerciseId, programmingExerciseTestCaseDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseTestCaseResourceApi#updateTestCases");
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
| **programmingExerciseTestCaseDTO** | [**List&lt;ProgrammingExerciseTestCaseDTO&gt;**](ProgrammingExerciseTestCaseDTO.md)|  | |

### Return type

[**Set&lt;ProgrammingExerciseTestCase&gt;**](ProgrammingExerciseTestCase.md)

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

