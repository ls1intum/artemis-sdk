# PlagiarismCaseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlagiarismCaseForExerciseForStudent**](PlagiarismCaseResourceApi.md#getPlagiarismCaseForExerciseForStudent) | **GET** /api/courses/{courseId}/exercises/{exerciseId}/plagiarism-case |  |
| [**getPlagiarismCaseForInstructor**](PlagiarismCaseResourceApi.md#getPlagiarismCaseForInstructor) | **GET** /api/courses/{courseId}/plagiarism-cases/{plagiarismCaseId}/for-instructor |  |
| [**getPlagiarismCaseForStudent**](PlagiarismCaseResourceApi.md#getPlagiarismCaseForStudent) | **GET** /api/courses/{courseId}/plagiarism-cases/{plagiarismCaseId}/for-student |  |
| [**getPlagiarismCasesForCourseForInstructor**](PlagiarismCaseResourceApi.md#getPlagiarismCasesForCourseForInstructor) | **GET** /api/courses/{courseId}/plagiarism-cases/for-instructor |  |
| [**getPlagiarismCasesForExamForInstructor**](PlagiarismCaseResourceApi.md#getPlagiarismCasesForExamForInstructor) | **GET** /api/courses/{courseId}/exams/{examId}/plagiarism-cases/for-instructor |  |
| [**getPlagiarismCasesForExercisesForStudent**](PlagiarismCaseResourceApi.md#getPlagiarismCasesForExercisesForStudent) | **GET** /api/courses/{courseId}/plagiarism-cases |  |
| [**savePlagiarismCaseVerdict**](PlagiarismCaseResourceApi.md#savePlagiarismCaseVerdict) | **PUT** /api/courses/{courseId}/plagiarism-cases/{plagiarismCaseId}/verdict |  |



## getPlagiarismCaseForExerciseForStudent

> PlagiarismCaseInfoDTO getPlagiarismCaseForExerciseForStudent(courseId, exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long exerciseId = 56L; // Long | 
        try {
            PlagiarismCaseInfoDTO result = apiInstance.getPlagiarismCaseForExerciseForStudent(courseId, exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#getPlagiarismCaseForExerciseForStudent");
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
| **exerciseId** | **Long**|  | |

### Return type

[**PlagiarismCaseInfoDTO**](PlagiarismCaseInfoDTO.md)

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


## getPlagiarismCaseForInstructor

> PlagiarismCase getPlagiarismCaseForInstructor(courseId, plagiarismCaseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long plagiarismCaseId = 56L; // Long | 
        try {
            PlagiarismCase result = apiInstance.getPlagiarismCaseForInstructor(courseId, plagiarismCaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#getPlagiarismCaseForInstructor");
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
| **plagiarismCaseId** | **Long**|  | |

### Return type

[**PlagiarismCase**](PlagiarismCase.md)

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


## getPlagiarismCaseForStudent

> PlagiarismCase getPlagiarismCaseForStudent(courseId, plagiarismCaseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long plagiarismCaseId = 56L; // Long | 
        try {
            PlagiarismCase result = apiInstance.getPlagiarismCaseForStudent(courseId, plagiarismCaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#getPlagiarismCaseForStudent");
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
| **plagiarismCaseId** | **Long**|  | |

### Return type

[**PlagiarismCase**](PlagiarismCase.md)

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


## getPlagiarismCasesForCourseForInstructor

> List&lt;PlagiarismCase&gt; getPlagiarismCasesForCourseForInstructor(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<PlagiarismCase> result = apiInstance.getPlagiarismCasesForCourseForInstructor(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#getPlagiarismCasesForCourseForInstructor");
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

[**List&lt;PlagiarismCase&gt;**](PlagiarismCase.md)

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


## getPlagiarismCasesForExamForInstructor

> List&lt;PlagiarismCase&gt; getPlagiarismCasesForExamForInstructor(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<PlagiarismCase> result = apiInstance.getPlagiarismCasesForExamForInstructor(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#getPlagiarismCasesForExamForInstructor");
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

[**List&lt;PlagiarismCase&gt;**](PlagiarismCase.md)

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


## getPlagiarismCasesForExercisesForStudent

> Map&lt;String, PlagiarismCaseInfoDTO&gt; getPlagiarismCasesForExercisesForStudent(courseId, exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Set<Long> exerciseId = Arrays.asList(); // Set<Long> | 
        try {
            Map<String, PlagiarismCaseInfoDTO> result = apiInstance.getPlagiarismCasesForExercisesForStudent(courseId, exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#getPlagiarismCasesForExercisesForStudent");
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
| **exerciseId** | **List&lt;Long&gt;**|  | |

### Return type

[**Map&lt;String, PlagiarismCaseInfoDTO&gt;**](PlagiarismCaseInfoDTO.md)

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


## savePlagiarismCaseVerdict

> PlagiarismCase savePlagiarismCaseVerdict(courseId, plagiarismCaseId, plagiarismVerdictDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlagiarismCaseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlagiarismCaseResourceApi apiInstance = new PlagiarismCaseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long plagiarismCaseId = 56L; // Long | 
        PlagiarismVerdictDTO plagiarismVerdictDTO = new PlagiarismVerdictDTO(); // PlagiarismVerdictDTO | 
        try {
            PlagiarismCase result = apiInstance.savePlagiarismCaseVerdict(courseId, plagiarismCaseId, plagiarismVerdictDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlagiarismCaseResourceApi#savePlagiarismCaseVerdict");
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
| **plagiarismCaseId** | **Long**|  | |
| **plagiarismVerdictDTO** | [**PlagiarismVerdictDTO**](PlagiarismVerdictDTO.md)|  | |

### Return type

[**PlagiarismCase**](PlagiarismCase.md)

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

