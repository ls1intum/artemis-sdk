# CodeHintResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCodeHintsForExercise**](CodeHintResourceApi.md#generateCodeHintsForExercise) | **POST** /api/programming-exercises/{exerciseId}/code-hints |  |
| [**getAllCodeHints**](CodeHintResourceApi.md#getAllCodeHints) | **GET** /api/programming-exercises/{exerciseId}/code-hints |  |
| [**removeSolutionEntryFromCodeHint**](CodeHintResourceApi.md#removeSolutionEntryFromCodeHint) | **DELETE** /api/programming-exercises/{exerciseId}/code-hints/{codeHintId}/solution-entries/{solutionEntryId} |  |



## generateCodeHintsForExercise

> List&lt;CodeHint&gt; generateCodeHintsForExercise(exerciseId, deleteOldCodeHints)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CodeHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CodeHintResourceApi apiInstance = new CodeHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean deleteOldCodeHints = true; // Boolean | 
        try {
            List<CodeHint> result = apiInstance.generateCodeHintsForExercise(exerciseId, deleteOldCodeHints);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeHintResourceApi#generateCodeHintsForExercise");
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
| **deleteOldCodeHints** | **Boolean**|  | [optional] [default to true] |

### Return type

[**List&lt;CodeHint&gt;**](CodeHint.md)

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


## getAllCodeHints

> Set&lt;CodeHint&gt; getAllCodeHints(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CodeHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CodeHintResourceApi apiInstance = new CodeHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<CodeHint> result = apiInstance.getAllCodeHints(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeHintResourceApi#getAllCodeHints");
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

[**Set&lt;CodeHint&gt;**](CodeHint.md)

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


## removeSolutionEntryFromCodeHint

> removeSolutionEntryFromCodeHint(exerciseId, codeHintId, solutionEntryId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CodeHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CodeHintResourceApi apiInstance = new CodeHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long codeHintId = 56L; // Long | 
        Long solutionEntryId = 56L; // Long | 
        try {
            apiInstance.removeSolutionEntryFromCodeHint(exerciseId, codeHintId, solutionEntryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeHintResourceApi#removeSolutionEntryFromCodeHint");
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
| **codeHintId** | **Long**|  | |
| **solutionEntryId** | **Long**|  | |

### Return type

null (empty response body)

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

