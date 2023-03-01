# StatisticsResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChartData**](StatisticsResourceApi.md#getChartData) | **GET** /api/management/statistics/data-for-content |  |
| [**getCourseStatistics**](StatisticsResourceApi.md#getCourseStatistics) | **GET** /api/management/statistics/course-statistics |  |
| [**getExerciseStatistics**](StatisticsResourceApi.md#getExerciseStatistics) | **GET** /api/management/statistics/exercise-statistics |  |



## getChartData

> List&lt;Integer&gt; getChartData(span, periodIndex, graphType, view, entityId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StatisticsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StatisticsResourceApi apiInstance = new StatisticsResourceApi(defaultClient);
        String span = "DAY"; // String | 
        Integer periodIndex = 56; // Integer | 
        String graphType = "SUBMISSIONS"; // String | 
        String view = "ARTEMIS"; // String | 
        Long entityId = 56L; // Long | 
        try {
            List<Integer> result = apiInstance.getChartData(span, periodIndex, graphType, view, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsResourceApi#getChartData");
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
| **span** | **String**|  | [enum: DAY, WEEK, MONTH, QUARTER, YEAR] |
| **periodIndex** | **Integer**|  | |
| **graphType** | **String**|  | [enum: SUBMISSIONS, ACTIVE_USERS, LOGGED_IN_USERS, RELEASED_EXERCISES, EXERCISES_DUE, CONDUCTED_EXAMS, EXAM_PARTICIPATIONS, EXAM_REGISTRATIONS, ACTIVE_TUTORS, CREATED_RESULTS, CREATED_FEEDBACKS, POSTS, RESOLVED_POSTS] |
| **view** | **String**|  | [enum: ARTEMIS, COURSE, EXERCISE] |
| **entityId** | **Long**|  | |

### Return type

**List&lt;Integer&gt;**

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


## getCourseStatistics

> CourseManagementStatisticsDTO getCourseStatistics(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StatisticsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StatisticsResourceApi apiInstance = new StatisticsResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            CourseManagementStatisticsDTO result = apiInstance.getCourseStatistics(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsResourceApi#getCourseStatistics");
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

### Return type

[**CourseManagementStatisticsDTO**](CourseManagementStatisticsDTO.md)

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


## getExerciseStatistics

> ExerciseManagementStatisticsDTO getExerciseStatistics(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StatisticsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StatisticsResourceApi apiInstance = new StatisticsResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ExerciseManagementStatisticsDTO result = apiInstance.getExerciseStatistics(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsResourceApi#getExerciseStatistics");
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

[**ExerciseManagementStatisticsDTO**](ExerciseManagementStatisticsDTO.md)

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

