# ReactionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReaction**](ReactionResourceApi.md#createReaction) | **POST** /api/courses/{courseId}/postings/reactions |  |
| [**deleteReaction**](ReactionResourceApi.md#deleteReaction) | **DELETE** /api/courses/{courseId}/postings/reactions/{reactionId} |  |



## createReaction

> Reaction createReaction(courseId, reaction)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ReactionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ReactionResourceApi apiInstance = new ReactionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Reaction reaction = new Reaction(); // Reaction | 
        try {
            Reaction result = apiInstance.createReaction(courseId, reaction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReactionResourceApi#createReaction");
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
| **reaction** | [**Reaction**](Reaction.md)|  | |

### Return type

[**Reaction**](Reaction.md)

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


## deleteReaction

> deleteReaction(courseId, reactionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ReactionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ReactionResourceApi apiInstance = new ReactionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long reactionId = 56L; // Long | 
        try {
            apiInstance.deleteReaction(courseId, reactionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReactionResourceApi#deleteReaction");
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
| **reactionId** | **Long**|  | |

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

