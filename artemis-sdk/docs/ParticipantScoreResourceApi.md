# ParticipantScoreResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getScoresOfCourse**](ParticipantScoreResourceApi.md#getScoresOfCourse) | **GET** /api/courses/{courseId}/course-scores |  |
| [**getScoresOfExam**](ParticipantScoreResourceApi.md#getScoresOfExam) | **GET** /api/exams/{examId}/exam-scores |  |



## getScoresOfCourse

> List&lt;ScoreDTO&gt; getScoresOfCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipantScoreResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipantScoreResourceApi apiInstance = new ParticipantScoreResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<ScoreDTO> result = apiInstance.getScoresOfCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getScoresOfCourse");
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

[**List&lt;ScoreDTO&gt;**](ScoreDTO.md)

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


## getScoresOfExam

> List&lt;ScoreDTO&gt; getScoresOfExam(examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipantScoreResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipantScoreResourceApi apiInstance = new ParticipantScoreResourceApi(defaultClient);
        Long examId = 56L; // Long | 
        try {
            List<ScoreDTO> result = apiInstance.getScoresOfExam(examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getScoresOfExam");
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
| **examId** | **Long**|  | |

### Return type

[**List&lt;ScoreDTO&gt;**](ScoreDTO.md)

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

