# GroupChatResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deregisterUsersFromGroupChat**](GroupChatResourceApi.md#deregisterUsersFromGroupChat) | **POST** /api/courses/{courseId}/group-chats/{groupChatId}/deregister |  |
| [**registerUsersToGroupChat**](GroupChatResourceApi.md#registerUsersToGroupChat) | **POST** /api/courses/{courseId}/group-chats/{groupChatId}/register |  |
| [**startGroupChat**](GroupChatResourceApi.md#startGroupChat) | **POST** /api/courses/{courseId}/group-chats |  |
| [**updateGroupChat**](GroupChatResourceApi.md#updateGroupChat) | **PUT** /api/courses/{courseId}/group-chats/{groupChatId} |  |



## deregisterUsersFromGroupChat

> deregisterUsersFromGroupChat(courseId, groupChatId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GroupChatResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GroupChatResourceApi apiInstance = new GroupChatResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long groupChatId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            apiInstance.deregisterUsersFromGroupChat(courseId, groupChatId, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChatResourceApi#deregisterUsersFromGroupChat");
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
| **groupChatId** | **Long**|  | |
| **requestBody** | **List&lt;String&gt;**|  | |

### Return type

null (empty response body)

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


## registerUsersToGroupChat

> registerUsersToGroupChat(courseId, groupChatId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GroupChatResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GroupChatResourceApi apiInstance = new GroupChatResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long groupChatId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            apiInstance.registerUsersToGroupChat(courseId, groupChatId, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChatResourceApi#registerUsersToGroupChat");
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
| **groupChatId** | **Long**|  | |
| **requestBody** | **List&lt;String&gt;**|  | |

### Return type

null (empty response body)

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


## startGroupChat

> GroupChatDTO startGroupChat(courseId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GroupChatResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GroupChatResourceApi apiInstance = new GroupChatResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            GroupChatDTO result = apiInstance.startGroupChat(courseId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChatResourceApi#startGroupChat");
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

[**GroupChatDTO**](GroupChatDTO.md)

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


## updateGroupChat

> GroupChatDTO updateGroupChat(courseId, groupChatId, groupChatDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GroupChatResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GroupChatResourceApi apiInstance = new GroupChatResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long groupChatId = 56L; // Long | 
        GroupChatDTO groupChatDTO = new GroupChatDTO(); // GroupChatDTO | 
        try {
            GroupChatDTO result = apiInstance.updateGroupChat(courseId, groupChatId, groupChatDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChatResourceApi#updateGroupChat");
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
| **groupChatId** | **Long**|  | |
| **groupChatDTO** | [**GroupChatDTO**](GroupChatDTO.md)|  | |

### Return type

[**GroupChatDTO**](GroupChatDTO.md)

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

