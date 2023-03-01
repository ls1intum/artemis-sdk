# ProgrammingExercisePlagiarismResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkPlagiarism1**](ProgrammingExercisePlagiarismResourceApi.md#checkPlagiarism1) | **GET** /api/programming-exercises/{exerciseId}/check-plagiarism |  |
| [**checkPlagiarismWithJPlagReport**](ProgrammingExercisePlagiarismResourceApi.md#checkPlagiarismWithJPlagReport) | **GET** /api/programming-exercises/{exerciseId}/check-plagiarism-jplag-report |  |
| [**getPlagiarismResult1**](ProgrammingExercisePlagiarismResourceApi.md#getPlagiarismResult1) | **GET** /api/programming-exercises/{exerciseId}/plagiarism-result |  |



## checkPlagiarism1

> TextPlagiarismResult checkPlagiarism1(exerciseId, similarityThreshold, minimumScore)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExercisePlagiarismResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExercisePlagiarismResourceApi apiInstance = new ProgrammingExercisePlagiarismResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Float similarityThreshold = 3.4F; // Float | 
        Integer minimumScore = 56; // Integer | 
        try {
            TextPlagiarismResult result = apiInstance.checkPlagiarism1(exerciseId, similarityThreshold, minimumScore);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExercisePlagiarismResourceApi#checkPlagiarism1");
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
| **similarityThreshold** | **Float**|  | |
| **minimumScore** | **Integer**|  | |

### Return type

[**TextPlagiarismResult**](TextPlagiarismResult.md)

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


## checkPlagiarismWithJPlagReport

> File checkPlagiarismWithJPlagReport(exerciseId, similarityThreshold, minimumScore)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExercisePlagiarismResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExercisePlagiarismResourceApi apiInstance = new ProgrammingExercisePlagiarismResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Float similarityThreshold = 3.4F; // Float | 
        Integer minimumScore = 56; // Integer | 
        try {
            File result = apiInstance.checkPlagiarismWithJPlagReport(exerciseId, similarityThreshold, minimumScore);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExercisePlagiarismResourceApi#checkPlagiarismWithJPlagReport");
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
| **similarityThreshold** | **Float**|  | |
| **minimumScore** | **Integer**|  | |

### Return type

[**File**](File.md)

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


## getPlagiarismResult1

> TextPlagiarismResult getPlagiarismResult1(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExercisePlagiarismResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExercisePlagiarismResourceApi apiInstance = new ProgrammingExercisePlagiarismResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            TextPlagiarismResult result = apiInstance.getPlagiarismResult1(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExercisePlagiarismResourceApi#getPlagiarismResult1");
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

[**TextPlagiarismResult**](TextPlagiarismResult.md)

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

