# TutorialGroupSessionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activate**](TutorialGroupSessionResourceApi.md#activate) | **POST** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}/activate |  |
| [**cancel**](TutorialGroupSessionResourceApi.md#cancel) | **POST** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}/cancel |  |
| [**create1**](TutorialGroupSessionResourceApi.md#create1) | **POST** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions |  |
| [**deleteSession**](TutorialGroupSessionResourceApi.md#deleteSession) | **DELETE** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId} |  |
| [**getOneOfTutorialGroup**](TutorialGroupSessionResourceApi.md#getOneOfTutorialGroup) | **GET** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId} |  |
| [**update1**](TutorialGroupSessionResourceApi.md#update1) | **PUT** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId} |  |
| [**updateAttendanceCount**](TutorialGroupSessionResourceApi.md#updateAttendanceCount) | **PATCH** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}/attendance-count |  |



## activate

> TutorialGroupSession activate(courseId, tutorialGroupId, sessionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Long sessionId = 56L; // Long | 
        try {
            TutorialGroupSession result = apiInstance.activate(courseId, tutorialGroupId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#activate");
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
| **tutorialGroupId** | **Long**|  | |
| **sessionId** | **Long**|  | |

### Return type

[**TutorialGroupSession**](TutorialGroupSession.md)

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


## cancel

> TutorialGroupSession cancel(courseId, tutorialGroupId, sessionId, tutorialGroupStatusDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Long sessionId = 56L; // Long | 
        TutorialGroupStatusDTO tutorialGroupStatusDTO = new TutorialGroupStatusDTO(); // TutorialGroupStatusDTO | 
        try {
            TutorialGroupSession result = apiInstance.cancel(courseId, tutorialGroupId, sessionId, tutorialGroupStatusDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#cancel");
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
| **tutorialGroupId** | **Long**|  | |
| **sessionId** | **Long**|  | |
| **tutorialGroupStatusDTO** | [**TutorialGroupStatusDTO**](TutorialGroupStatusDTO.md)|  | |

### Return type

[**TutorialGroupSession**](TutorialGroupSession.md)

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


## create1

> TutorialGroupSession create1(courseId, tutorialGroupId, tutorialGroupSessionDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        TutorialGroupSessionDTO tutorialGroupSessionDTO = new TutorialGroupSessionDTO(); // TutorialGroupSessionDTO | 
        try {
            TutorialGroupSession result = apiInstance.create1(courseId, tutorialGroupId, tutorialGroupSessionDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#create1");
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
| **tutorialGroupId** | **Long**|  | |
| **tutorialGroupSessionDTO** | [**TutorialGroupSessionDTO**](TutorialGroupSessionDTO.md)|  | |

### Return type

[**TutorialGroupSession**](TutorialGroupSession.md)

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


## deleteSession

> deleteSession(courseId, tutorialGroupId, sessionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Long sessionId = 56L; // Long | 
        try {
            apiInstance.deleteSession(courseId, tutorialGroupId, sessionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#deleteSession");
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
| **tutorialGroupId** | **Long**|  | |
| **sessionId** | **Long**|  | |

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


## getOneOfTutorialGroup

> TutorialGroupSession getOneOfTutorialGroup(courseId, tutorialGroupId, sessionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Long sessionId = 56L; // Long | 
        try {
            TutorialGroupSession result = apiInstance.getOneOfTutorialGroup(courseId, tutorialGroupId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#getOneOfTutorialGroup");
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
| **tutorialGroupId** | **Long**|  | |
| **sessionId** | **Long**|  | |

### Return type

[**TutorialGroupSession**](TutorialGroupSession.md)

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


## update1

> TutorialGroupSession update1(courseId, tutorialGroupId, sessionId, tutorialGroupSessionDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Long sessionId = 56L; // Long | 
        TutorialGroupSessionDTO tutorialGroupSessionDTO = new TutorialGroupSessionDTO(); // TutorialGroupSessionDTO | 
        try {
            TutorialGroupSession result = apiInstance.update1(courseId, tutorialGroupId, sessionId, tutorialGroupSessionDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#update1");
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
| **tutorialGroupId** | **Long**|  | |
| **sessionId** | **Long**|  | |
| **tutorialGroupSessionDTO** | [**TutorialGroupSessionDTO**](TutorialGroupSessionDTO.md)|  | |

### Return type

[**TutorialGroupSession**](TutorialGroupSession.md)

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


## updateAttendanceCount

> TutorialGroupSession updateAttendanceCount(courseId, tutorialGroupId, sessionId, attendanceCount)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupSessionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupSessionResourceApi apiInstance = new TutorialGroupSessionResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Long sessionId = 56L; // Long | 
        Integer attendanceCount = 56; // Integer | 
        try {
            TutorialGroupSession result = apiInstance.updateAttendanceCount(courseId, tutorialGroupId, sessionId, attendanceCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupSessionResourceApi#updateAttendanceCount");
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
| **tutorialGroupId** | **Long**|  | |
| **sessionId** | **Long**|  | |
| **attendanceCount** | **Integer**|  | [optional] |

### Return type

[**TutorialGroupSession**](TutorialGroupSession.md)

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

