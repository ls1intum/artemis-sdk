# StaticCodeAnalysisResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStaticCodeAnalysisCategories**](StaticCodeAnalysisResourceApi.md#getStaticCodeAnalysisCategories) | **GET** /api/programming-exercises/{exerciseId}/static-code-analysis-categories |  |
| [**importStaticCodeAnalysisCategoriesFromExercise**](StaticCodeAnalysisResourceApi.md#importStaticCodeAnalysisCategoriesFromExercise) | **PATCH** /api/programming-exercises/{exerciseId}/static-code-analysis-categories/import |  |
| [**resetStaticCodeAnalysisCategories**](StaticCodeAnalysisResourceApi.md#resetStaticCodeAnalysisCategories) | **PATCH** /api/programming-exercises/{exerciseId}/static-code-analysis-categories/reset |  |
| [**updateStaticCodeAnalysisCategories**](StaticCodeAnalysisResourceApi.md#updateStaticCodeAnalysisCategories) | **PATCH** /api/programming-exercises/{exerciseId}/static-code-analysis-categories |  |



## getStaticCodeAnalysisCategories

> Set&lt;StaticCodeAnalysisCategory&gt; getStaticCodeAnalysisCategories(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StaticCodeAnalysisResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StaticCodeAnalysisResourceApi apiInstance = new StaticCodeAnalysisResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<StaticCodeAnalysisCategory> result = apiInstance.getStaticCodeAnalysisCategories(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticCodeAnalysisResourceApi#getStaticCodeAnalysisCategories");
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

[**Set&lt;StaticCodeAnalysisCategory&gt;**](StaticCodeAnalysisCategory.md)

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


## importStaticCodeAnalysisCategoriesFromExercise

> Set&lt;StaticCodeAnalysisCategory&gt; importStaticCodeAnalysisCategoriesFromExercise(exerciseId, sourceExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StaticCodeAnalysisResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StaticCodeAnalysisResourceApi apiInstance = new StaticCodeAnalysisResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long sourceExerciseId = 56L; // Long | 
        try {
            Set<StaticCodeAnalysisCategory> result = apiInstance.importStaticCodeAnalysisCategoriesFromExercise(exerciseId, sourceExerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticCodeAnalysisResourceApi#importStaticCodeAnalysisCategoriesFromExercise");
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
| **sourceExerciseId** | **Long**|  | |

### Return type

[**Set&lt;StaticCodeAnalysisCategory&gt;**](StaticCodeAnalysisCategory.md)

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


## resetStaticCodeAnalysisCategories

> Set&lt;StaticCodeAnalysisCategory&gt; resetStaticCodeAnalysisCategories(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StaticCodeAnalysisResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StaticCodeAnalysisResourceApi apiInstance = new StaticCodeAnalysisResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<StaticCodeAnalysisCategory> result = apiInstance.resetStaticCodeAnalysisCategories(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticCodeAnalysisResourceApi#resetStaticCodeAnalysisCategories");
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

[**Set&lt;StaticCodeAnalysisCategory&gt;**](StaticCodeAnalysisCategory.md)

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


## updateStaticCodeAnalysisCategories

> Set&lt;StaticCodeAnalysisCategory&gt; updateStaticCodeAnalysisCategories(exerciseId, staticCodeAnalysisCategory)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StaticCodeAnalysisResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StaticCodeAnalysisResourceApi apiInstance = new StaticCodeAnalysisResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Set<StaticCodeAnalysisCategory> staticCodeAnalysisCategory = Arrays.asList(); // Set<StaticCodeAnalysisCategory> | 
        try {
            Set<StaticCodeAnalysisCategory> result = apiInstance.updateStaticCodeAnalysisCategories(exerciseId, staticCodeAnalysisCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticCodeAnalysisResourceApi#updateStaticCodeAnalysisCategories");
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
| **staticCodeAnalysisCategory** | [**List&lt;StaticCodeAnalysisCategory&gt;**](StaticCodeAnalysisCategory.md)|  | |

### Return type

[**Set&lt;StaticCodeAnalysisCategory&gt;**](StaticCodeAnalysisCategory.md)

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

