# ChannelResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveChannel**](ChannelResourceApi.md#archiveChannel) | **POST** /api/courses/{courseId}/channels/{channelId}/archive |  |
| [**createChannel**](ChannelResourceApi.md#createChannel) | **POST** /api/courses/{courseId}/channels |  |
| [**deleteChannel**](ChannelResourceApi.md#deleteChannel) | **DELETE** /api/courses/{courseId}/channels/{channelId} |  |
| [**deregisterUsers**](ChannelResourceApi.md#deregisterUsers) | **POST** /api/courses/{courseId}/channels/{channelId}/deregister |  |
| [**getCourseChannelsOverview**](ChannelResourceApi.md#getCourseChannelsOverview) | **GET** /api/courses/{courseId}/channels/overview |  |
| [**grantChannelModeratorRole**](ChannelResourceApi.md#grantChannelModeratorRole) | **POST** /api/courses/{courseId}/channels/{channelId}/grant-channel-moderator |  |
| [**registerUsersToChannel**](ChannelResourceApi.md#registerUsersToChannel) | **POST** /api/courses/{courseId}/channels/{channelId}/register |  |
| [**revokeChannelModeratorRole**](ChannelResourceApi.md#revokeChannelModeratorRole) | **POST** /api/courses/{courseId}/channels/{channelId}/revoke-channel-moderator |  |
| [**unArchiveChannel**](ChannelResourceApi.md#unArchiveChannel) | **POST** /api/courses/{courseId}/channels/{channelId}/unarchive |  |
| [**updateChannel**](ChannelResourceApi.md#updateChannel) | **PUT** /api/courses/{courseId}/channels/{channelId} |  |



## archiveChannel

> archiveChannel(courseId, channelId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        try {
            apiInstance.archiveChannel(courseId, channelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#archiveChannel");
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
| **channelId** | **Long**|  | |

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


## createChannel

> ChannelDTO createChannel(courseId, channelDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        ChannelDTO channelDTO = new ChannelDTO(); // ChannelDTO | 
        try {
            ChannelDTO result = apiInstance.createChannel(courseId, channelDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#createChannel");
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
| **channelDTO** | [**ChannelDTO**](ChannelDTO.md)|  | |

### Return type

[**ChannelDTO**](ChannelDTO.md)

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


## deleteChannel

> deleteChannel(courseId, channelId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        try {
            apiInstance.deleteChannel(courseId, channelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#deleteChannel");
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
| **channelId** | **Long**|  | |

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


## deregisterUsers

> deregisterUsers(courseId, channelId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            apiInstance.deregisterUsers(courseId, channelId, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#deregisterUsers");
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
| **channelId** | **Long**|  | |
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


## getCourseChannelsOverview

> List&lt;ChannelDTO&gt; getCourseChannelsOverview(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<ChannelDTO> result = apiInstance.getCourseChannelsOverview(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#getCourseChannelsOverview");
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

[**List&lt;ChannelDTO&gt;**](ChannelDTO.md)

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


## grantChannelModeratorRole

> grantChannelModeratorRole(courseId, channelId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            apiInstance.grantChannelModeratorRole(courseId, channelId, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#grantChannelModeratorRole");
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
| **channelId** | **Long**|  | |
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


## registerUsersToChannel

> registerUsersToChannel(courseId, channelId, addAllStudents, addAllTutors, addAllInstructors, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        Boolean addAllStudents = false; // Boolean | 
        Boolean addAllTutors = false; // Boolean | 
        Boolean addAllInstructors = false; // Boolean | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            apiInstance.registerUsersToChannel(courseId, channelId, addAllStudents, addAllTutors, addAllInstructors, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#registerUsersToChannel");
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
| **channelId** | **Long**|  | |
| **addAllStudents** | **Boolean**|  | [optional] [default to false] |
| **addAllTutors** | **Boolean**|  | [optional] [default to false] |
| **addAllInstructors** | **Boolean**|  | [optional] [default to false] |
| **requestBody** | **List&lt;String&gt;**|  | [optional] |

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


## revokeChannelModeratorRole

> revokeChannelModeratorRole(courseId, channelId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            apiInstance.revokeChannelModeratorRole(courseId, channelId, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#revokeChannelModeratorRole");
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
| **channelId** | **Long**|  | |
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


## unArchiveChannel

> unArchiveChannel(courseId, channelId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        try {
            apiInstance.unArchiveChannel(courseId, channelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#unArchiveChannel");
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
| **channelId** | **Long**|  | |

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


## updateChannel

> ChannelDTO updateChannel(courseId, channelId, channelDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ChannelResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ChannelResourceApi apiInstance = new ChannelResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long channelId = 56L; // Long | 
        ChannelDTO channelDTO = new ChannelDTO(); // ChannelDTO | 
        try {
            ChannelDTO result = apiInstance.updateChannel(courseId, channelId, channelDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelResourceApi#updateChannel");
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
| **channelId** | **Long**|  | |
| **channelDTO** | [**ChannelDTO**](ChannelDTO.md)|  | |

### Return type

[**ChannelDTO**](ChannelDTO.md)

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

