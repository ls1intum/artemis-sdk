# ParticipantScoreResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAverageScoreOfCourse**](ParticipantScoreResourceApi.md#getAverageScoreOfCourse) | **GET** /api/courses/{courseId}/participant-scores/average |  |
| [**getAverageScoreOfExam**](ParticipantScoreResourceApi.md#getAverageScoreOfExam) | **GET** /api/exams/{examId}/participant-scores/average |  |
| [**getAverageScoreOfParticipantInCourse**](ParticipantScoreResourceApi.md#getAverageScoreOfParticipantInCourse) | **GET** /api/courses/{courseId}/participant-scores/average-participant |  |
| [**getAverageScoreOfParticipantInExam**](ParticipantScoreResourceApi.md#getAverageScoreOfParticipantInExam) | **GET** /api/exams/{examId}/participant-scores/average-participant |  |
| [**getParticipantScoresOfCourse**](ParticipantScoreResourceApi.md#getParticipantScoresOfCourse) | **GET** /api/courses/{courseId}/participant-scores |  |
| [**getParticipantScoresOfExam**](ParticipantScoreResourceApi.md#getParticipantScoresOfExam) | **GET** /api/exams/{examId}/participant-scores |  |
| [**getScoresOfCourse**](ParticipantScoreResourceApi.md#getScoresOfCourse) | **GET** /api/courses/{courseId}/course-scores |  |
| [**getScoresOfExam**](ParticipantScoreResourceApi.md#getScoresOfExam) | **GET** /api/exams/{examId}/exam-scores |  |



## getAverageScoreOfCourse

> Double getAverageScoreOfCourse(courseId, onlyConsiderRatedScores)



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
        Boolean onlyConsiderRatedScores = true; // Boolean | 
        try {
            Double result = apiInstance.getAverageScoreOfCourse(courseId, onlyConsiderRatedScores);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getAverageScoreOfCourse");
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
| **onlyConsiderRatedScores** | **Boolean**|  | [optional] [default to true] |

### Return type

**Double**

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


## getAverageScoreOfExam

> Double getAverageScoreOfExam(examId, onlyConsiderRatedScores)



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
        Boolean onlyConsiderRatedScores = true; // Boolean | 
        try {
            Double result = apiInstance.getAverageScoreOfExam(examId, onlyConsiderRatedScores);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getAverageScoreOfExam");
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
| **onlyConsiderRatedScores** | **Boolean**|  | [optional] [default to true] |

### Return type

**Double**

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


## getAverageScoreOfParticipantInCourse

> List&lt;ParticipantScoreAverageDTO&gt; getAverageScoreOfParticipantInCourse(courseId)



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
            List<ParticipantScoreAverageDTO> result = apiInstance.getAverageScoreOfParticipantInCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getAverageScoreOfParticipantInCourse");
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

[**List&lt;ParticipantScoreAverageDTO&gt;**](ParticipantScoreAverageDTO.md)

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


## getAverageScoreOfParticipantInExam

> List&lt;ParticipantScoreAverageDTO&gt; getAverageScoreOfParticipantInExam(examId)



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
            List<ParticipantScoreAverageDTO> result = apiInstance.getAverageScoreOfParticipantInExam(examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getAverageScoreOfParticipantInExam");
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

[**List&lt;ParticipantScoreAverageDTO&gt;**](ParticipantScoreAverageDTO.md)

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


## getParticipantScoresOfCourse

> List&lt;ParticipantScoreDTO&gt; getParticipantScoresOfCourse(courseId, pageable, getUnpaged)



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
        Pageable pageable = new HashMap(); // Pageable | 
        Boolean getUnpaged = false; // Boolean | 
        try {
            List<ParticipantScoreDTO> result = apiInstance.getParticipantScoresOfCourse(courseId, pageable, getUnpaged);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getParticipantScoresOfCourse");
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
| **pageable** | [**Pageable**](Pageable.md)|  | |
| **getUnpaged** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;ParticipantScoreDTO&gt;**](ParticipantScoreDTO.md)

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


## getParticipantScoresOfExam

> List&lt;ParticipantScoreDTO&gt; getParticipantScoresOfExam(examId, pageable, getUnpaged)



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
        Pageable pageable = new HashMap(); // Pageable | 
        Boolean getUnpaged = false; // Boolean | 
        try {
            List<ParticipantScoreDTO> result = apiInstance.getParticipantScoresOfExam(examId, pageable, getUnpaged);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantScoreResourceApi#getParticipantScoresOfExam");
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
| **pageable** | [**Pageable**](Pageable.md)|  | |
| **getUnpaged** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;ParticipantScoreDTO&gt;**](ParticipantScoreDTO.md)

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

