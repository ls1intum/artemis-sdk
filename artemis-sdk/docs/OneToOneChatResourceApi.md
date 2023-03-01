# OneToOneChatResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**startOneToOneChat**](OneToOneChatResourceApi.md#startOneToOneChat) | **POST** /api/courses/{courseId}/one-to-one-chats |  |



## startOneToOneChat

> OneToOneChatDTO startOneToOneChat(courseId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.OneToOneChatResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OneToOneChatResourceApi apiInstance = new OneToOneChatResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            OneToOneChatDTO result = apiInstance.startOneToOneChat(courseId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneToOneChatResourceApi#startOneToOneChat");
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
| **requestBody** | **List&lt;String&gt;**|  | |

### Return type

[**OneToOneChatDTO**](OneToOneChatDTO.md)

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

