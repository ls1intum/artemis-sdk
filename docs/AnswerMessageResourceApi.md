# AnswerMessageResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnswerPost1**](AnswerMessageResourceApi.md#createAnswerPost1) | **POST** /api/courses/{courseId}/answer-messages |  |
| [**deleteAnswerPost1**](AnswerMessageResourceApi.md#deleteAnswerPost1) | **DELETE** /api/courses/{courseId}/answer-messages/{answerMessageId} |  |
| [**updateAnswerPost1**](AnswerMessageResourceApi.md#updateAnswerPost1) | **PUT** /api/courses/{courseId}/answer-messages/{answerMessageId} |  |



## createAnswerPost1

> AnswerPost createAnswerPost1(courseId, answerPost)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AnswerMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnswerMessageResourceApi apiInstance = new AnswerMessageResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        AnswerPost answerPost = new AnswerPost(); // AnswerPost | 
        try {
            AnswerPost result = apiInstance.createAnswerPost1(courseId, answerPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswerMessageResourceApi#createAnswerPost1");
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


## deleteAnswerPost1

> deleteAnswerPost1(courseId, answerMessageId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AnswerMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnswerMessageResourceApi apiInstance = new AnswerMessageResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long answerMessageId = 56L; // Long | 
        try {
            apiInstance.deleteAnswerPost1(courseId, answerMessageId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswerMessageResourceApi#deleteAnswerPost1");
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
| **answerMessageId** | **Long**|  | |

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


## updateAnswerPost1

> AnswerPost updateAnswerPost1(courseId, answerMessageId, answerPost)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AnswerMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnswerMessageResourceApi apiInstance = new AnswerMessageResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long answerMessageId = 56L; // Long | 
        AnswerPost answerPost = new AnswerPost(); // AnswerPost | 
        try {
            AnswerPost result = apiInstance.updateAnswerPost1(courseId, answerMessageId, answerPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswerMessageResourceApi#updateAnswerPost1");
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
| **answerMessageId** | **Long**|  | |
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

