# PlagiarismResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePlagiarismComparisons**](PlagiarismResourceApi.md#deletePlagiarismComparisons) | **DELETE** /api/exercises/{exerciseId}/plagiarism-results/{plagiarismResultId}/plagiarism-comparisons |  |
| [**getPlagiarismComparisonForSplitView**](PlagiarismResourceApi.md#getPlagiarismComparisonForSplitView) | **GET** /api/courses/{courseId}/plagiarism-comparisons/{comparisonId}/for-split-view |  |
| [**updatePlagiarismComparisonStatus**](PlagiarismResourceApi.md#updatePlagiarismComparisonStatus) | **PUT** /api/courses/{courseId}/plagiarism-comparisons/{comparisonId}/status |  |



## deletePlagiarismComparisons

> deletePlagiarismComparisons(exerciseId, plagiarismResultId, deleteAll)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismResourceApi apiInstance = new PlagiarismResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long plagiarismResultId = 56L; // Long | 
        Boolean deleteAll = true; // Boolean | 
        try {
            apiInstance.deletePlagiarismComparisons(exerciseId, plagiarismResultId, deleteAll);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismResourceApi#deletePlagiarismComparisons");
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
| **plagiarismResultId** | **Long**|  | |
| **deleteAll** | **Boolean**|  | |

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


## getPlagiarismComparisonForSplitView

> PlagiarismComparisonObject getPlagiarismComparisonForSplitView(courseId, comparisonId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismResourceApi apiInstance = new PlagiarismResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long comparisonId = 56L; // Long | 
        try {
            PlagiarismComparisonObject result = apiInstance.getPlagiarismComparisonForSplitView(courseId, comparisonId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismResourceApi#getPlagiarismComparisonForSplitView");
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
| **comparisonId** | **Long**|  | |

### Return type

[**PlagiarismComparisonObject**](PlagiarismComparisonObject.md)

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


## updatePlagiarismComparisonStatus

> updatePlagiarismComparisonStatus(courseId, comparisonId, plagiarismComparisonStatusDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismResourceApi apiInstance = new PlagiarismResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long comparisonId = 56L; // Long | 
        PlagiarismComparisonStatusDTO plagiarismComparisonStatusDTO = new PlagiarismComparisonStatusDTO(); // PlagiarismComparisonStatusDTO | 
        try {
            apiInstance.updatePlagiarismComparisonStatus(courseId, comparisonId, plagiarismComparisonStatusDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismResourceApi#updatePlagiarismComparisonStatus");
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
| **comparisonId** | **Long**|  | |
| **plagiarismComparisonStatusDTO** | [**PlagiarismComparisonStatusDTO**](PlagiarismComparisonStatusDTO.md)|  | |

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

