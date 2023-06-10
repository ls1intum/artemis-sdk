# ConversationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeFavoriteStatus**](ConversationResourceApi.md#changeFavoriteStatus) | **POST** /api/courses/{courseId}/conversations/{conversationId}/favorite |  |
| [**getAllConversationsForNotifications**](ConversationResourceApi.md#getAllConversationsForNotifications) | **GET** /api/courses/conversations-for-notifications |  |
| [**getConversationsOfUser**](ConversationResourceApi.md#getConversationsOfUser) | **GET** /api/courses/{courseId}/conversations |  |
| [**hasUnreadMessages**](ConversationResourceApi.md#hasUnreadMessages) | **GET** /api/courses/{courseId}/unread-messages |  |
| [**searchMembersOfConversation**](ConversationResourceApi.md#searchMembersOfConversation) | **GET** /api/courses/{courseId}/conversations/{conversationId}/members/search |  |
| [**switchHiddenStatus**](ConversationResourceApi.md#switchHiddenStatus) | **POST** /api/courses/{courseId}/conversations/{conversationId}/hidden |  |



## changeFavoriteStatus

> changeFavoriteStatus(courseId, conversationId, isFavorite)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationResourceApi apiInstance = new ConversationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long conversationId = 56L; // Long | 
        Boolean isFavorite = true; // Boolean | 
        try {
            apiInstance.changeFavoriteStatus(courseId, conversationId, isFavorite);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationResourceApi#changeFavoriteStatus");
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
| **conversationId** | **Long**|  | |
| **isFavorite** | **Boolean**|  | |

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


## getAllConversationsForNotifications

> List&lt;GetAllConversationsForNotifications200ResponseInner&gt; getAllConversationsForNotifications()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationResourceApi apiInstance = new ConversationResourceApi(defaultClient);
        try {
            List<GetAllConversationsForNotifications200ResponseInner> result = apiInstance.getAllConversationsForNotifications();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationResourceApi#getAllConversationsForNotifications");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetAllConversationsForNotifications200ResponseInner&gt;**](GetAllConversationsForNotifications200ResponseInner.md)

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


## getConversationsOfUser

> List&lt;GetConversationsOfUser200ResponseInner&gt; getConversationsOfUser(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationResourceApi apiInstance = new ConversationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<GetConversationsOfUser200ResponseInner> result = apiInstance.getConversationsOfUser(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationResourceApi#getConversationsOfUser");
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

[**List&lt;GetConversationsOfUser200ResponseInner&gt;**](GetConversationsOfUser200ResponseInner.md)

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


## hasUnreadMessages

> Boolean hasUnreadMessages(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationResourceApi apiInstance = new ConversationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Boolean result = apiInstance.hasUnreadMessages(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationResourceApi#hasUnreadMessages");
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

**Boolean**

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


## searchMembersOfConversation

> List&lt;ConversationUserDTO&gt; searchMembersOfConversation(courseId, conversationId, loginOrName, pageable, filter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationResourceApi apiInstance = new ConversationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long conversationId = 56L; // Long | 
        String loginOrName = "loginOrName_example"; // String | 
        Pageable pageable = new HashMap(); // Pageable | 
        String filter = "INSTRUCTOR"; // String | 
        try {
            List<ConversationUserDTO> result = apiInstance.searchMembersOfConversation(courseId, conversationId, loginOrName, pageable, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationResourceApi#searchMembersOfConversation");
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
| **conversationId** | **Long**|  | |
| **loginOrName** | **String**|  | |
| **pageable** | [**Pageable**](Pageable.md)|  | |
| **filter** | **String**|  | [optional] [enum: INSTRUCTOR, EDITOR, TUTOR, STUDENT, CHANNEL_MODERATOR] |

### Return type

[**List&lt;ConversationUserDTO&gt;**](ConversationUserDTO.md)

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


## switchHiddenStatus

> switchHiddenStatus(courseId, conversationId, isHidden)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ConversationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ConversationResourceApi apiInstance = new ConversationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long conversationId = 56L; // Long | 
        Boolean isHidden = true; // Boolean | 
        try {
            apiInstance.switchHiddenStatus(courseId, conversationId, isHidden);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationResourceApi#switchHiddenStatus");
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
| **conversationId** | **Long**|  | |
| **isHidden** | **Boolean**|  | |

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

