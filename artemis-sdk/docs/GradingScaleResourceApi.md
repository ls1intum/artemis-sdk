# GradingScaleResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGradingScaleForCourse**](GradingScaleResourceApi.md#createGradingScaleForCourse) | **POST** /api/courses/{courseId}/grading-scale |  |
| [**createGradingScaleForExam**](GradingScaleResourceApi.md#createGradingScaleForExam) | **POST** /api/courses/{courseId}/exams/{examId}/grading-scale |  |
| [**deleteGradingScaleForCourse**](GradingScaleResourceApi.md#deleteGradingScaleForCourse) | **DELETE** /api/courses/{courseId}/grading-scale |  |
| [**deleteGradingScaleForExam**](GradingScaleResourceApi.md#deleteGradingScaleForExam) | **DELETE** /api/courses/{courseId}/exams/{examId}/grading-scale |  |
| [**getAllGradingScalesInInstructorGroupOnPage**](GradingScaleResourceApi.md#getAllGradingScalesInInstructorGroupOnPage) | **GET** /api/grading-scales |  |
| [**getGradingScaleForCourse**](GradingScaleResourceApi.md#getGradingScaleForCourse) | **GET** /api/courses/{courseId}/grading-scale |  |
| [**getGradingScaleForExam**](GradingScaleResourceApi.md#getGradingScaleForExam) | **GET** /api/courses/{courseId}/exams/{examId}/grading-scale |  |
| [**updateGradingScaleForCourse**](GradingScaleResourceApi.md#updateGradingScaleForCourse) | **PUT** /api/courses/{courseId}/grading-scale |  |
| [**updateGradingScaleForExam**](GradingScaleResourceApi.md#updateGradingScaleForExam) | **PUT** /api/courses/{courseId}/exams/{examId}/grading-scale |  |



## createGradingScaleForCourse

> GradingScale createGradingScaleForCourse(courseId, gradingScale)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        GradingScale gradingScale = new GradingScale(); // GradingScale | 
        try {
            GradingScale result = apiInstance.createGradingScaleForCourse(courseId, gradingScale);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#createGradingScaleForCourse");
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
| **gradingScale** | [**GradingScale**](GradingScale.md)|  | |

### Return type

[**GradingScale**](GradingScale.md)

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


## createGradingScaleForExam

> GradingScale createGradingScaleForExam(courseId, examId, gradingScale)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        GradingScale gradingScale = new GradingScale(); // GradingScale | 
        try {
            GradingScale result = apiInstance.createGradingScaleForExam(courseId, examId, gradingScale);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#createGradingScaleForExam");
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
| **examId** | **Long**|  | |
| **gradingScale** | [**GradingScale**](GradingScale.md)|  | |

### Return type

[**GradingScale**](GradingScale.md)

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


## deleteGradingScaleForCourse

> deleteGradingScaleForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            apiInstance.deleteGradingScaleForCourse(courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#deleteGradingScaleForCourse");
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


## deleteGradingScaleForExam

> deleteGradingScaleForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            apiInstance.deleteGradingScaleForExam(courseId, examId);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#deleteGradingScaleForExam");
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
| **examId** | **Long**|  | |

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


## getAllGradingScalesInInstructorGroupOnPage

> SearchResultPageDTOGradingScale getAllGradingScalesInInstructorGroupOnPage(search)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        try {
            SearchResultPageDTOGradingScale result = apiInstance.getAllGradingScalesInInstructorGroupOnPage(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#getAllGradingScalesInInstructorGroupOnPage");
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
| **search** | [**PageableSearchDTOString**](PageableSearchDTOString.md)|  | |

### Return type

[**SearchResultPageDTOGradingScale**](SearchResultPageDTOGradingScale.md)

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


## getGradingScaleForCourse

> GradingScale getGradingScaleForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            GradingScale result = apiInstance.getGradingScaleForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#getGradingScaleForCourse");
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

[**GradingScale**](GradingScale.md)

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


## getGradingScaleForExam

> GradingScale getGradingScaleForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            GradingScale result = apiInstance.getGradingScaleForExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#getGradingScaleForExam");
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
| **examId** | **Long**|  | |

### Return type

[**GradingScale**](GradingScale.md)

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


## updateGradingScaleForCourse

> GradingScale updateGradingScaleForCourse(courseId, gradingScale)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        GradingScale gradingScale = new GradingScale(); // GradingScale | 
        try {
            GradingScale result = apiInstance.updateGradingScaleForCourse(courseId, gradingScale);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#updateGradingScaleForCourse");
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
| **gradingScale** | [**GradingScale**](GradingScale.md)|  | |

### Return type

[**GradingScale**](GradingScale.md)

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


## updateGradingScaleForExam

> GradingScale updateGradingScaleForExam(courseId, examId, gradingScale)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradingScaleResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradingScaleResourceApi apiInstance = new GradingScaleResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        GradingScale gradingScale = new GradingScale(); // GradingScale | 
        try {
            GradingScale result = apiInstance.updateGradingScaleForExam(courseId, examId, gradingScale);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradingScaleResourceApi#updateGradingScaleForExam");
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
| **examId** | **Long**|  | |
| **gradingScale** | [**GradingScale**](GradingScale.md)|  | |

### Return type

[**GradingScale**](GradingScale.md)

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

