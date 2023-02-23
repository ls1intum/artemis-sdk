# ApollonDiagramResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApollonDiagram**](ApollonDiagramResourceApi.md#createApollonDiagram) | **POST** /api/course/{courseId}/apollon-diagrams |  |
| [**deleteApollonDiagram**](ApollonDiagramResourceApi.md#deleteApollonDiagram) | **DELETE** /api/course/{courseId}/apollon-diagrams/{apollonDiagramId} |  |
| [**getApollonDiagram**](ApollonDiagramResourceApi.md#getApollonDiagram) | **GET** /api/course/{courseId}/apollon-diagrams/{apollonDiagramId} |  |
| [**getDiagramTitle**](ApollonDiagramResourceApi.md#getDiagramTitle) | **GET** /api/apollon-diagrams/{diagramId}/title |  |
| [**getDiagramsByCourse**](ApollonDiagramResourceApi.md#getDiagramsByCourse) | **GET** /api/course/{courseId}/apollon-diagrams |  |
| [**updateApollonDiagram**](ApollonDiagramResourceApi.md#updateApollonDiagram) | **PUT** /api/course/{courseId}/apollon-diagrams |  |



## createApollonDiagram

> ApollonDiagram createApollonDiagram(courseId, apollonDiagram)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ApollonDiagramResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ApollonDiagramResourceApi apiInstance = new ApollonDiagramResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        ApollonDiagram apollonDiagram = new ApollonDiagram(); // ApollonDiagram | 
        try {
            ApollonDiagram result = apiInstance.createApollonDiagram(courseId, apollonDiagram);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApollonDiagramResourceApi#createApollonDiagram");
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
| **apollonDiagram** | [**ApollonDiagram**](ApollonDiagram.md)|  | |

### Return type

[**ApollonDiagram**](ApollonDiagram.md)

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


## deleteApollonDiagram

> deleteApollonDiagram(apollonDiagramId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ApollonDiagramResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ApollonDiagramResourceApi apiInstance = new ApollonDiagramResourceApi(defaultClient);
        Long apollonDiagramId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            apiInstance.deleteApollonDiagram(apollonDiagramId, courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApollonDiagramResourceApi#deleteApollonDiagram");
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
| **apollonDiagramId** | **Long**|  | |
| **courseId** | **Long**|  | |

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


## getApollonDiagram

> ApollonDiagram getApollonDiagram(apollonDiagramId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ApollonDiagramResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ApollonDiagramResourceApi apiInstance = new ApollonDiagramResourceApi(defaultClient);
        Long apollonDiagramId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            ApollonDiagram result = apiInstance.getApollonDiagram(apollonDiagramId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApollonDiagramResourceApi#getApollonDiagram");
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
| **apollonDiagramId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**ApollonDiagram**](ApollonDiagram.md)

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


## getDiagramTitle

> String getDiagramTitle(diagramId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ApollonDiagramResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ApollonDiagramResourceApi apiInstance = new ApollonDiagramResourceApi(defaultClient);
        Long diagramId = 56L; // Long | 
        try {
            String result = apiInstance.getDiagramTitle(diagramId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApollonDiagramResourceApi#getDiagramTitle");
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
| **diagramId** | **Long**|  | |

### Return type

**String**

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


## getDiagramsByCourse

> List&lt;ApollonDiagram&gt; getDiagramsByCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ApollonDiagramResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ApollonDiagramResourceApi apiInstance = new ApollonDiagramResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<ApollonDiagram> result = apiInstance.getDiagramsByCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApollonDiagramResourceApi#getDiagramsByCourse");
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

[**List&lt;ApollonDiagram&gt;**](ApollonDiagram.md)

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


## updateApollonDiagram

> ApollonDiagram updateApollonDiagram(courseId, apollonDiagram)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ApollonDiagramResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ApollonDiagramResourceApi apiInstance = new ApollonDiagramResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        ApollonDiagram apollonDiagram = new ApollonDiagram(); // ApollonDiagram | 
        try {
            ApollonDiagram result = apiInstance.updateApollonDiagram(courseId, apollonDiagram);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApollonDiagramResourceApi#updateApollonDiagram");
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
| **apollonDiagram** | [**ApollonDiagram**](ApollonDiagram.md)|  | |

### Return type

[**ApollonDiagram**](ApollonDiagram.md)

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

