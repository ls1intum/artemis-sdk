# ConversationMessageResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessage**](ConversationMessageResourceApi.md#createMessage) | **POST** /api/courses/{courseId}/messages |  |
| [**deleteMessage**](ConversationMessageResourceApi.md#deleteMessage) | **DELETE** /api/courses/{courseId}/messages/{messageId} |  |
| [**getMessages**](ConversationMessageResourceApi.md#getMessages) | **GET** /api/courses/{courseId}/messages |  |
| [**updateMessage**](ConversationMessageResourceApi.md#updateMessage) | **PUT** /api/courses/{courseId}/messages/{messageId} |  |



## createMessage

> Post createMessage(courseId, post)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationMessageResourceApi apiInstance = new ConversationMessageResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Post post = new Post(); // Post | 
        try {
            Post result = apiInstance.createMessage(courseId, post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationMessageResourceApi#createMessage");
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
| **post** | [**Post**](Post.md)|  | |

### Return type

[**Post**](Post.md)

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


## deleteMessage

> deleteMessage(courseId, messageId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationMessageResourceApi apiInstance = new ConversationMessageResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long messageId = 56L; // Long | 
        try {
            apiInstance.deleteMessage(courseId, messageId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationMessageResourceApi#deleteMessage");
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
| **messageId** | **Long**|  | |

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


## getMessages

> List&lt;Post&gt; getMessages(pageable, postContextFilter, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationMessageResourceApi apiInstance = new ConversationMessageResourceApi(defaultClient);
        Pageable pageable = new HashMap(); // Pageable | 
        PostContextFilter postContextFilter = new HashMap(); // PostContextFilter | 
        Long courseId = 56L; // Long | 
        try {
            List<Post> result = apiInstance.getMessages(pageable, postContextFilter, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationMessageResourceApi#getMessages");
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
| **pageable** | [**Pageable**](Pageable.md)|  | |
| **postContextFilter** | [**PostContextFilter**](PostContextFilter.md)|  | |
| **courseId** | **Long**|  | |

### Return type

[**List&lt;Post&gt;**](Post.md)

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


## updateMessage

> Post updateMessage(courseId, messageId, post)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationMessageResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationMessageResourceApi apiInstance = new ConversationMessageResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long messageId = 56L; // Long | 
        Post post = new Post(); // Post | 
        try {
            Post result = apiInstance.updateMessage(courseId, messageId, post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationMessageResourceApi#updateMessage");
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
| **messageId** | **Long**|  | |
| **post** | [**Post**](Post.md)|  | |

### Return type

[**Post**](Post.md)

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

