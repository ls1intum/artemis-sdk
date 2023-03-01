# AdminModelingExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkClusters**](AdminModelingExerciseResourceApi.md#checkClusters) | **GET** /api/admin/modeling-exercises/{exerciseId}/check-clusters |  |
| [**deleteModelingExerciseClustersAndElements**](AdminModelingExerciseResourceApi.md#deleteModelingExerciseClustersAndElements) | **DELETE** /api/admin/modeling-exercises/{exerciseId}/clusters |  |
| [**triggerAutomaticAssessment1**](AdminModelingExerciseResourceApi.md#triggerAutomaticAssessment1) | **POST** /api/admin/modeling-exercises/{exerciseId}/trigger-automatic-assessment |  |



## checkClusters

> Integer checkClusters(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminModelingExerciseResourceApi apiInstance = new AdminModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Integer result = apiInstance.checkClusters(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminModelingExerciseResourceApi#checkClusters");
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


## deleteModelingExerciseClustersAndElements

> deleteModelingExerciseClustersAndElements(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminModelingExerciseResourceApi apiInstance = new AdminModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.deleteModelingExerciseClustersAndElements(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminModelingExerciseResourceApi#deleteModelingExerciseClustersAndElements");
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


## triggerAutomaticAssessment1

> triggerAutomaticAssessment1(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminModelingExerciseResourceApi apiInstance = new AdminModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.triggerAutomaticAssessment1(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminModelingExerciseResourceApi#triggerAutomaticAssessment1");
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

