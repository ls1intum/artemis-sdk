# StudentExamResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assessUnsubmittedStudentExamsAndEmptySubmissions**](StudentExamResourceApi.md#assessUnsubmittedStudentExamsAndEmptySubmissions) | **POST** /api/courses/{courseId}/exams/{examId}/student-exams/assess-unsubmitted-and-empty-student-exams |  |
| [**createTestRun**](StudentExamResourceApi.md#createTestRun) | **POST** /api/courses/{courseId}/exams/{examId}/test-run |  |
| [**deleteTestRun**](StudentExamResourceApi.md#deleteTestRun) | **DELETE** /api/courses/{courseId}/exams/{examId}/test-run/{testRunId} |  |
| [**findAllTestRunsForExam**](StudentExamResourceApi.md#findAllTestRunsForExam) | **GET** /api/courses/{courseId}/exams/{examId}/test-runs |  |
| [**getExerciseStartStatus**](StudentExamResourceApi.md#getExerciseStartStatus) | **GET** /api/courses/{courseId}/exams/{examId}/student-exams/start-exercises/status |  |
| [**getStudentExam**](StudentExamResourceApi.md#getStudentExam) | **GET** /api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId} |  |
| [**getStudentExamForConduction**](StudentExamResourceApi.md#getStudentExamForConduction) | **GET** /api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/conduction |  |
| [**getStudentExamForSummary**](StudentExamResourceApi.md#getStudentExamForSummary) | **GET** /api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/summary |  |
| [**getStudentExamGradesForSummary**](StudentExamResourceApi.md#getStudentExamGradesForSummary) | **GET** /api/courses/{courseId}/exams/{examId}/student-exams/grade-summary |  |
| [**getStudentExamsForCoursePerUser**](StudentExamResourceApi.md#getStudentExamsForCoursePerUser) | **GET** /api/courses/{courseId}/test-exams-per-user |  |
| [**getStudentExamsForExam**](StudentExamResourceApi.md#getStudentExamsForExam) | **GET** /api/courses/{courseId}/exams/{examId}/student-exams |  |
| [**getTestRunForConduction**](StudentExamResourceApi.md#getTestRunForConduction) | **GET** /api/courses/{courseId}/exams/{examId}/test-run/{testRunId}/conduction |  |
| [**startExercises**](StudentExamResourceApi.md#startExercises) | **POST** /api/courses/{courseId}/exams/{examId}/student-exams/start-exercises |  |
| [**submitStudentExam**](StudentExamResourceApi.md#submitStudentExam) | **PUT** /api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/toggle-to-submitted |  |
| [**submitStudentExam1**](StudentExamResourceApi.md#submitStudentExam1) | **POST** /api/courses/{courseId}/exams/{examId}/student-exams/submit |  |
| [**unsubmitStudentExam**](StudentExamResourceApi.md#unsubmitStudentExam) | **PUT** /api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/toggle-to-unsubmitted |  |
| [**updateWorkingTime**](StudentExamResourceApi.md#updateWorkingTime) | **PATCH** /api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/working-time |  |



## assessUnsubmittedStudentExamsAndEmptySubmissions

> assessUnsubmittedStudentExamsAndEmptySubmissions(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            apiInstance.assessUnsubmittedStudentExamsAndEmptySubmissions(courseId, examId);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#assessUnsubmittedStudentExamsAndEmptySubmissions");
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


## createTestRun

> StudentExam createTestRun(courseId, examId, studentExam)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        StudentExam studentExam = new StudentExam(); // StudentExam | 
        try {
            StudentExam result = apiInstance.createTestRun(courseId, examId, studentExam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#createTestRun");
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
| **studentExam** | [**StudentExam**](StudentExam.md)|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## deleteTestRun

> StudentExam deleteTestRun(courseId, examId, testRunId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long testRunId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.deleteTestRun(courseId, examId, testRunId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#deleteTestRun");
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
| **testRunId** | **Long**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## findAllTestRunsForExam

> List&lt;StudentExam&gt; findAllTestRunsForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<StudentExam> result = apiInstance.findAllTestRunsForExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#findAllTestRunsForExam");
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

[**List&lt;StudentExam&gt;**](StudentExam.md)

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


## getExerciseStartStatus

> ExamExerciseStartPreparationStatus getExerciseStartStatus(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            ExamExerciseStartPreparationStatus result = apiInstance.getExerciseStartStatus(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getExerciseStartStatus");
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

[**ExamExerciseStartPreparationStatus**](ExamExerciseStartPreparationStatus.md)

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


## getStudentExam

> StudentExamWithGradeDTO getStudentExam(courseId, examId, studentExamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long studentExamId = 56L; // Long | 
        try {
            StudentExamWithGradeDTO result = apiInstance.getStudentExam(courseId, examId, studentExamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getStudentExam");
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
| **studentExamId** | **Long**|  | |

### Return type

[**StudentExamWithGradeDTO**](StudentExamWithGradeDTO.md)

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


## getStudentExamForConduction

> StudentExam getStudentExamForConduction(courseId, examId, studentExamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long studentExamId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.getStudentExamForConduction(courseId, examId, studentExamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getStudentExamForConduction");
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
| **studentExamId** | **Long**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## getStudentExamForSummary

> StudentExam getStudentExamForSummary(courseId, examId, studentExamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long studentExamId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.getStudentExamForSummary(courseId, examId, studentExamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getStudentExamForSummary");
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
| **studentExamId** | **Long**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## getStudentExamGradesForSummary

> StudentExamWithGradeDTO getStudentExamGradesForSummary(courseId, examId, userId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long userId = 56L; // Long | 
        try {
            StudentExamWithGradeDTO result = apiInstance.getStudentExamGradesForSummary(courseId, examId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getStudentExamGradesForSummary");
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
| **userId** | **Long**|  | [optional] |

### Return type

[**StudentExamWithGradeDTO**](StudentExamWithGradeDTO.md)

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


## getStudentExamsForCoursePerUser

> List&lt;StudentExam&gt; getStudentExamsForCoursePerUser(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<StudentExam> result = apiInstance.getStudentExamsForCoursePerUser(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getStudentExamsForCoursePerUser");
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

[**List&lt;StudentExam&gt;**](StudentExam.md)

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


## getStudentExamsForExam

> Set&lt;StudentExam&gt; getStudentExamsForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Set<StudentExam> result = apiInstance.getStudentExamsForExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getStudentExamsForExam");
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

[**Set&lt;StudentExam&gt;**](StudentExam.md)

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


## getTestRunForConduction

> StudentExam getTestRunForConduction(courseId, examId, testRunId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long testRunId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.getTestRunForConduction(courseId, examId, testRunId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#getTestRunForConduction");
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
| **testRunId** | **Long**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## startExercises

> startExercises(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            apiInstance.startExercises(courseId, examId);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#startExercises");
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


## submitStudentExam

> StudentExam submitStudentExam(courseId, examId, studentExamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long studentExamId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.submitStudentExam(courseId, examId, studentExamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#submitStudentExam");
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
| **studentExamId** | **Long**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## submitStudentExam1

> StudentExam submitStudentExam1(courseId, examId, studentExam)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        StudentExam studentExam = new StudentExam(); // StudentExam | 
        try {
            StudentExam result = apiInstance.submitStudentExam1(courseId, examId, studentExam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#submitStudentExam1");
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
| **studentExam** | [**StudentExam**](StudentExam.md)|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## unsubmitStudentExam

> StudentExam unsubmitStudentExam(courseId, examId, studentExamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long studentExamId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.unsubmitStudentExam(courseId, examId, studentExamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#unsubmitStudentExam");
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
| **studentExamId** | **Long**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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


## updateWorkingTime

> StudentExam updateWorkingTime(courseId, examId, studentExamId, body)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.StudentExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        StudentExamResourceApi apiInstance = new StudentExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long studentExamId = 56L; // Long | 
        Integer body = 56; // Integer | 
        try {
            StudentExam result = apiInstance.updateWorkingTime(courseId, examId, studentExamId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentExamResourceApi#updateWorkingTime");
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
| **studentExamId** | **Long**|  | |
| **body** | **Integer**|  | |

### Return type

[**StudentExam**](StudentExam.md)

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

