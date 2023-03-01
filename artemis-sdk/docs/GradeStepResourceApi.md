# GradeStepResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllGradeStepsForCourse**](GradeStepResourceApi.md#getAllGradeStepsForCourse) | **GET** /api/courses/{courseId}/grading-scale/grade-steps |  |
| [**getAllGradeStepsForExam**](GradeStepResourceApi.md#getAllGradeStepsForExam) | **GET** /api/courses/{courseId}/exams/{examId}/grading-scale/grade-steps |  |
| [**getGradeStepByPercentageForCourse**](GradeStepResourceApi.md#getGradeStepByPercentageForCourse) | **GET** /api/courses/{courseId}/grading-scale/match-grade-step |  |
| [**getGradeStepByPercentageForExam**](GradeStepResourceApi.md#getGradeStepByPercentageForExam) | **GET** /api/courses/{courseId}/exams/{examId}/grading-scale/match-grade-step |  |
| [**getGradeStepsByIdForCourse**](GradeStepResourceApi.md#getGradeStepsByIdForCourse) | **GET** /api/courses/{courseId}/grading-scale/grade-steps/{gradeStepId} |  |
| [**getGradeStepsByIdForExam**](GradeStepResourceApi.md#getGradeStepsByIdForExam) | **GET** /api/courses/{courseId}/exams/{examId}/grading-scale/grade-steps/{gradeStepId} |  |



## getAllGradeStepsForCourse

> GradeStepsDTO getAllGradeStepsForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradeStepResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradeStepResourceApi apiInstance = new GradeStepResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            GradeStepsDTO result = apiInstance.getAllGradeStepsForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradeStepResourceApi#getAllGradeStepsForCourse");
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

[**GradeStepsDTO**](GradeStepsDTO.md)

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


## getAllGradeStepsForExam

> GradeStepsDTO getAllGradeStepsForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradeStepResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradeStepResourceApi apiInstance = new GradeStepResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            GradeStepsDTO result = apiInstance.getAllGradeStepsForExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradeStepResourceApi#getAllGradeStepsForExam");
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

[**GradeStepsDTO**](GradeStepsDTO.md)

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


## getGradeStepByPercentageForCourse

> GradeDTO getGradeStepByPercentageForCourse(courseId, gradePercentage)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradeStepResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradeStepResourceApi apiInstance = new GradeStepResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Double gradePercentage = 3.4D; // Double | 
        try {
            GradeDTO result = apiInstance.getGradeStepByPercentageForCourse(courseId, gradePercentage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradeStepResourceApi#getGradeStepByPercentageForCourse");
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
| **gradePercentage** | **Double**|  | |

### Return type

[**GradeDTO**](GradeDTO.md)

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


## getGradeStepByPercentageForExam

> GradeDTO getGradeStepByPercentageForExam(courseId, examId, gradePercentage)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradeStepResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradeStepResourceApi apiInstance = new GradeStepResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Double gradePercentage = 3.4D; // Double | 
        try {
            GradeDTO result = apiInstance.getGradeStepByPercentageForExam(courseId, examId, gradePercentage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradeStepResourceApi#getGradeStepByPercentageForExam");
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
| **gradePercentage** | **Double**|  | |

### Return type

[**GradeDTO**](GradeDTO.md)

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


## getGradeStepsByIdForCourse

> GradeStep getGradeStepsByIdForCourse(courseId, gradeStepId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradeStepResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradeStepResourceApi apiInstance = new GradeStepResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long gradeStepId = 56L; // Long | 
        try {
            GradeStep result = apiInstance.getGradeStepsByIdForCourse(courseId, gradeStepId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradeStepResourceApi#getGradeStepsByIdForCourse");
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
| **gradeStepId** | **Long**|  | |

### Return type

[**GradeStep**](GradeStep.md)

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


## getGradeStepsByIdForExam

> GradeStep getGradeStepsByIdForExam(courseId, examId, gradeStepId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GradeStepResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GradeStepResourceApi apiInstance = new GradeStepResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long gradeStepId = 56L; // Long | 
        try {
            GradeStep result = apiInstance.getGradeStepsByIdForExam(courseId, examId, gradeStepId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GradeStepResourceApi#getGradeStepsByIdForExam");
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
| **gradeStepId** | **Long**|  | |

### Return type

[**GradeStep**](GradeStep.md)

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

