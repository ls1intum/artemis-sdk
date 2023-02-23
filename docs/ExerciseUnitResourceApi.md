# ExerciseUnitResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExerciseUnit**](ExerciseUnitResourceApi.md#createExerciseUnit) | **POST** /api/lectures/{lectureId}/exercise-units |  |
| [**getAllExerciseUnitsOfLecture**](ExerciseUnitResourceApi.md#getAllExerciseUnitsOfLecture) | **GET** /api/lectures/{lectureId}/exercise-units |  |



## createExerciseUnit

> ExerciseUnit createExerciseUnit(lectureId, exerciseUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseUnitResourceApi apiInstance = new ExerciseUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        ExerciseUnit exerciseUnit = new ExerciseUnit(); // ExerciseUnit | 
        try {
            ExerciseUnit result = apiInstance.createExerciseUnit(lectureId, exerciseUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseUnitResourceApi#createExerciseUnit");
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
| **lectureId** | **Long**|  | |
| **exerciseUnit** | [**ExerciseUnit**](ExerciseUnit.md)|  | |

### Return type

[**ExerciseUnit**](ExerciseUnit.md)

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


## getAllExerciseUnitsOfLecture

> List&lt;ExerciseUnit&gt; getAllExerciseUnitsOfLecture(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseUnitResourceApi apiInstance = new ExerciseUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            List<ExerciseUnit> result = apiInstance.getAllExerciseUnitsOfLecture(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseUnitResourceApi#getAllExerciseUnitsOfLecture");
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
| **lectureId** | **Long**|  | |

### Return type

[**List&lt;ExerciseUnit&gt;**](ExerciseUnit.md)

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

