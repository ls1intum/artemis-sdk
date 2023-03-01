# AnswerPostResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnswerPost**](AnswerPostResourceApi.md#createAnswerPost) | **POST** /api/courses/{courseId}/answer-posts |  |
| [**deleteAnswerPost**](AnswerPostResourceApi.md#deleteAnswerPost) | **DELETE** /api/courses/{courseId}/answer-posts/{answerPostId} |  |
| [**updateAnswerPost**](AnswerPostResourceApi.md#updateAnswerPost) | **PUT** /api/courses/{courseId}/answer-posts/{answerPostId} |  |



## createAnswerPost

> AnswerPost createAnswerPost(courseId, answerPost)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AnswerPostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnswerPostResourceApi apiInstance = new AnswerPostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        AnswerPost answerPost = new AnswerPost(); // AnswerPost | 
        try {
            AnswerPost result = apiInstance.createAnswerPost(courseId, answerPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswerPostResourceApi#createAnswerPost");
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
| **answerPost** | [**AnswerPost**](AnswerPost.md)|  | |

### Return type

[**AnswerPost**](AnswerPost.md)

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


## deleteAnswerPost

> deleteAnswerPost(courseId, answerPostId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AnswerPostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnswerPostResourceApi apiInstance = new AnswerPostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long answerPostId = 56L; // Long | 
        try {
            apiInstance.deleteAnswerPost(courseId, answerPostId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswerPostResourceApi#deleteAnswerPost");
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
| **answerPostId** | **Long**|  | |

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


## updateAnswerPost

> AnswerPost updateAnswerPost(courseId, answerPostId, answerPost)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AnswerPostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnswerPostResourceApi apiInstance = new AnswerPostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long answerPostId = 56L; // Long | 
        AnswerPost answerPost = new AnswerPost(); // AnswerPost | 
        try {
            AnswerPost result = apiInstance.updateAnswerPost(courseId, answerPostId, answerPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswerPostResourceApi#updateAnswerPost");
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
| **answerPostId** | **Long**|  | |
| **answerPost** | [**AnswerPost**](AnswerPost.md)|  | |

### Return type

[**AnswerPost**](AnswerPost.md)

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

