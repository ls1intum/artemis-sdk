# PostResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**computeSimilarityScoresWitCoursePosts**](PostResourceApi.md#computeSimilarityScoresWitCoursePosts) | **POST** /api/courses/{courseId}/posts/similarity-check |  |
| [**createPost**](PostResourceApi.md#createPost) | **POST** /api/courses/{courseId}/posts |  |
| [**deletePost**](PostResourceApi.md#deletePost) | **DELETE** /api/courses/{courseId}/posts/{postId} |  |
| [**getAllPostTagsForCourse**](PostResourceApi.md#getAllPostTagsForCourse) | **GET** /api/courses/{courseId}/posts/tags |  |
| [**getPostsInCourse**](PostResourceApi.md#getPostsInCourse) | **GET** /api/courses/{courseId}/posts |  |
| [**updateDisplayPriority**](PostResourceApi.md#updateDisplayPriority) | **PUT** /api/courses/{courseId}/posts/{postId}/display-priority |  |
| [**updatePost**](PostResourceApi.md#updatePost) | **PUT** /api/courses/{courseId}/posts/{postId} |  |



## computeSimilarityScoresWitCoursePosts

> List&lt;Post&gt; computeSimilarityScoresWitCoursePosts(courseId, post)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Post post = new Post(); // Post | 
        try {
            List<Post> result = apiInstance.computeSimilarityScoresWitCoursePosts(courseId, post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#computeSimilarityScoresWitCoursePosts");
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

[**List&lt;Post&gt;**](Post.md)

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


## createPost

> Post createPost(courseId, post)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Post post = new Post(); // Post | 
        try {
            Post result = apiInstance.createPost(courseId, post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#createPost");
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


## deletePost

> deletePost(courseId, postId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long postId = 56L; // Long | 
        try {
            apiInstance.deletePost(courseId, postId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#deletePost");
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
| **postId** | **Long**|  | |

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


## getAllPostTagsForCourse

> List&lt;String&gt; getAllPostTagsForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<String> result = apiInstance.getAllPostTagsForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#getAllPostTagsForCourse");
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

**List&lt;String&gt;**

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


## getPostsInCourse

> List&lt;Post&gt; getPostsInCourse(pageable, postContextFilter, courseId, pagingEnabled)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Pageable pageable = new HashMap(); // Pageable | 
        PostContextFilter postContextFilter = new HashMap(); // PostContextFilter | 
        Long courseId = 56L; // Long | 
        Boolean pagingEnabled = false; // Boolean | 
        try {
            List<Post> result = apiInstance.getPostsInCourse(pageable, postContextFilter, courseId, pagingEnabled);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#getPostsInCourse");
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
| **pagingEnabled** | **Boolean**|  | [optional] [default to false] |

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


## updateDisplayPriority

> Post updateDisplayPriority(courseId, postId, displayPriority)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long postId = 56L; // Long | 
        String displayPriority = "PINNED"; // String | 
        try {
            Post result = apiInstance.updateDisplayPriority(courseId, postId, displayPriority);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#updateDisplayPriority");
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
| **postId** | **Long**|  | |
| **displayPriority** | **String**|  | [enum: PINNED, ARCHIVED, NONE] |

### Return type

[**Post**](Post.md)

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


## updatePost

> Post updatePost(courseId, postId, post)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PostResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PostResourceApi apiInstance = new PostResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long postId = 56L; // Long | 
        Post post = new Post(); // Post | 
        try {
            Post result = apiInstance.updatePost(courseId, postId, post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostResourceApi#updatePost");
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
| **postId** | **Long**|  | |
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

