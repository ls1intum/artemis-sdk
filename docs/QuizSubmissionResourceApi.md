# QuizSubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submitForLiveMode**](QuizSubmissionResourceApi.md#submitForLiveMode) | **POST** /api/exercises/{exerciseId}/submissions/live |  |
| [**submitForPractice**](QuizSubmissionResourceApi.md#submitForPractice) | **POST** /api/exercises/{exerciseId}/submissions/practice |  |
| [**submitForPreview**](QuizSubmissionResourceApi.md#submitForPreview) | **POST** /api/exercises/{exerciseId}/submissions/preview |  |
| [**submitQuizForExam**](QuizSubmissionResourceApi.md#submitQuizForExam) | **PUT** /api/exercises/{exerciseId}/submissions/exam |  |



## submitForLiveMode

> QuizSubmission submitForLiveMode(exerciseId, quizSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizSubmissionResourceApi apiInstance = new QuizSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        QuizSubmission quizSubmission = new QuizSubmission(); // QuizSubmission | 
        try {
            QuizSubmission result = apiInstance.submitForLiveMode(exerciseId, quizSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizSubmissionResourceApi#submitForLiveMode");
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
| **quizSubmission** | [**QuizSubmission**](QuizSubmission.md)|  | |

### Return type

[**QuizSubmission**](QuizSubmission.md)

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


## submitForPractice

> Result submitForPractice(exerciseId, quizSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizSubmissionResourceApi apiInstance = new QuizSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        QuizSubmission quizSubmission = new QuizSubmission(); // QuizSubmission | 
        try {
            Result result = apiInstance.submitForPractice(exerciseId, quizSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizSubmissionResourceApi#submitForPractice");
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
| **quizSubmission** | [**QuizSubmission**](QuizSubmission.md)|  | |

### Return type

[**Result**](Result.md)

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


## submitForPreview

> Result submitForPreview(exerciseId, quizSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizSubmissionResourceApi apiInstance = new QuizSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        QuizSubmission quizSubmission = new QuizSubmission(); // QuizSubmission | 
        try {
            Result result = apiInstance.submitForPreview(exerciseId, quizSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizSubmissionResourceApi#submitForPreview");
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
| **quizSubmission** | [**QuizSubmission**](QuizSubmission.md)|  | |

### Return type

[**Result**](Result.md)

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


## submitQuizForExam

> QuizSubmission submitQuizForExam(exerciseId, quizSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizSubmissionResourceApi apiInstance = new QuizSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        QuizSubmission quizSubmission = new QuizSubmission(); // QuizSubmission | 
        try {
            QuizSubmission result = apiInstance.submitQuizForExam(exerciseId, quizSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizSubmissionResourceApi#submitQuizForExam");
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
| **quizSubmission** | [**QuizSubmission**](QuizSubmission.md)|  | |

### Return type

[**QuizSubmission**](QuizSubmission.md)

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

