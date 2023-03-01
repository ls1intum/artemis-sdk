# ExamResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addStudentToExam**](ExamResourceApi.md#addStudentToExam) | **POST** /api/courses/{courseId}/exams/{examId}/students/{studentLogin} |  |
| [**addStudentsToExam**](ExamResourceApi.md#addStudentsToExam) | **POST** /api/courses/{courseId}/exams/{examId}/students |  |
| [**archiveExam**](ExamResourceApi.md#archiveExam) | **PUT** /api/courses/{courseId}/exams/{examId}/archive |  |
| [**createExam**](ExamResourceApi.md#createExam) | **POST** /api/courses/{courseId}/exams |  |
| [**deleteExam**](ExamResourceApi.md#deleteExam) | **DELETE** /api/courses/{courseId}/exams/{examId} |  |
| [**downloadExamArchive**](ExamResourceApi.md#downloadExamArchive) | **GET** /api/courses/{courseId}/exams/{examId}/download-archive |  |
| [**evaluateQuizExercises**](ExamResourceApi.md#evaluateQuizExercises) | **POST** /api/courses/{courseId}/exams/{examId}/student-exams/evaluate-quiz-exercises |  |
| [**generateMissingStudentExams**](ExamResourceApi.md#generateMissingStudentExams) | **POST** /api/courses/{courseId}/exams/{examId}/generate-missing-student-exams |  |
| [**generateStudentExams**](ExamResourceApi.md#generateStudentExams) | **POST** /api/courses/{courseId}/exams/{examId}/generate-student-exams |  |
| [**getAllActiveExams**](ExamResourceApi.md#getAllActiveExams) | **GET** /api/exams/active |  |
| [**getAllExamsOnPage**](ExamResourceApi.md#getAllExamsOnPage) | **GET** /api/exams |  |
| [**getExam**](ExamResourceApi.md#getExam) | **GET** /api/courses/{courseId}/exams/{examId} |  |
| [**getExamForAssessmentDashboard**](ExamResourceApi.md#getExamForAssessmentDashboard) | **GET** /api/courses/{courseId}/exams/{examId}/exam-for-assessment-dashboard |  |
| [**getExamForImportWithExercises**](ExamResourceApi.md#getExamForImportWithExercises) | **GET** /api/exams/{examId} |  |
| [**getExamForTestRunAssessmentDashboard**](ExamResourceApi.md#getExamForTestRunAssessmentDashboard) | **GET** /api/courses/{courseId}/exams/{examId}/exam-for-test-run-assessment-dashboard |  |
| [**getExamScore**](ExamResourceApi.md#getExamScore) | **GET** /api/courses/{courseId}/exams/{examId}/scores |  |
| [**getExamStatistics**](ExamResourceApi.md#getExamStatistics) | **GET** /api/courses/{courseId}/exams/{examId}/statistics |  |
| [**getExamTitle**](ExamResourceApi.md#getExamTitle) | **GET** /api/exams/{examId}/title |  |
| [**getExamsForCourse**](ExamResourceApi.md#getExamsForCourse) | **GET** /api/courses/{courseId}/exams |  |
| [**getExamsWithQuizExercisesForUser**](ExamResourceApi.md#getExamsWithQuizExercisesForUser) | **GET** /api/courses/{courseId}/exams-for-user |  |
| [**getLatestIndividualEndDateOfExam**](ExamResourceApi.md#getLatestIndividualEndDateOfExam) | **GET** /api/courses/{courseId}/exams/{examId}/latest-end-date |  |
| [**getLockedSubmissionsForExam**](ExamResourceApi.md#getLockedSubmissionsForExam) | **GET** /api/courses/{courseId}/exams/{examId}/lockedSubmissions |  |
| [**getStatsForExamAssessmentDashboard**](ExamResourceApi.md#getStatsForExamAssessmentDashboard) | **GET** /api/courses/{courseId}/exams/{examId}/stats-for-exam-assessment-dashboard |  |
| [**getStudentExamForStart**](ExamResourceApi.md#getStudentExamForStart) | **GET** /api/courses/{courseId}/exams/{examId}/start |  |
| [**importExamWithExercises**](ExamResourceApi.md#importExamWithExercises) | **POST** /api/courses/{courseId}/exam-import |  |
| [**lockAllRepositories1**](ExamResourceApi.md#lockAllRepositories1) | **POST** /api/courses/{courseId}/exams/{examId}/student-exams/lock-all-repositories |  |
| [**registerCourseStudents**](ExamResourceApi.md#registerCourseStudents) | **POST** /api/courses/{courseId}/exams/{examId}/register-course-students |  |
| [**removeAllStudentsFromExam**](ExamResourceApi.md#removeAllStudentsFromExam) | **DELETE** /api/courses/{courseId}/exams/{examId}/students |  |
| [**removeStudentFromExam**](ExamResourceApi.md#removeStudentFromExam) | **DELETE** /api/courses/{courseId}/exams/{examId}/students/{studentLogin} |  |
| [**resetExam**](ExamResourceApi.md#resetExam) | **DELETE** /api/courses/{courseId}/exams/{examId}/reset |  |
| [**unlockAllRepositories1**](ExamResourceApi.md#unlockAllRepositories1) | **POST** /api/courses/{courseId}/exams/{examId}/student-exams/unlock-all-repositories |  |
| [**updateExam**](ExamResourceApi.md#updateExam) | **PUT** /api/courses/{courseId}/exams |  |
| [**updateOrderOfExerciseGroups**](ExamResourceApi.md#updateOrderOfExerciseGroups) | **PUT** /api/courses/{courseId}/exams/{examId}/exercise-groups-order |  |



## addStudentToExam

> StudentDTO addStudentToExam(courseId, examId, studentLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        try {
            StudentDTO result = apiInstance.addStudentToExam(courseId, examId, studentLogin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#addStudentToExam");
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
| **studentLogin** | **String**|  | |

### Return type

[**StudentDTO**](StudentDTO.md)

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


## addStudentsToExam

> List&lt;ExamUserDTO&gt; addStudentsToExam(courseId, examId, examUserDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        List<ExamUserDTO> examUserDTO = Arrays.asList(); // List<ExamUserDTO> | 
        try {
            List<ExamUserDTO> result = apiInstance.addStudentsToExam(courseId, examId, examUserDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#addStudentsToExam");
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
| **examUserDTO** | [**List&lt;ExamUserDTO&gt;**](ExamUserDTO.md)|  | |

### Return type

[**List&lt;ExamUserDTO&gt;**](ExamUserDTO.md)

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


## archiveExam

> archiveExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            apiInstance.archiveExam(courseId, examId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#archiveExam");
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


## createExam

> Exam createExam(courseId, exam)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Exam exam = new Exam(); // Exam | 
        try {
            Exam result = apiInstance.createExam(courseId, exam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#createExam");
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
| **exam** | [**Exam**](Exam.md)|  | |

### Return type

[**Exam**](Exam.md)

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


## deleteExam

> deleteExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            apiInstance.deleteExam(courseId, examId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#deleteExam");
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


## downloadExamArchive

> File downloadExamArchive(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            File result = apiInstance.downloadExamArchive(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#downloadExamArchive");
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

[**File**](File.md)

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


## evaluateQuizExercises

> Integer evaluateQuizExercises(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Integer result = apiInstance.evaluateQuizExercises(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#evaluateQuizExercises");
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

**Integer**

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


## generateMissingStudentExams

> List&lt;StudentExam&gt; generateMissingStudentExams(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<StudentExam> result = apiInstance.generateMissingStudentExams(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#generateMissingStudentExams");
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


## generateStudentExams

> List&lt;StudentExam&gt; generateStudentExams(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<StudentExam> result = apiInstance.generateStudentExams(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#generateStudentExams");
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


## getAllActiveExams

> List&lt;Exam&gt; getAllActiveExams(pageable)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Pageable pageable = new HashMap(); // Pageable | 
        try {
            List<Exam> result = apiInstance.getAllActiveExams(pageable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getAllActiveExams");
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
| **pageable** | [**Pageable**](Pageable.md)|  | |

### Return type

[**List&lt;Exam&gt;**](Exam.md)

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


## getAllExamsOnPage

> SearchResultPageDTOExam getAllExamsOnPage(search, withExercises)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        Boolean withExercises = false; // Boolean | 
        try {
            SearchResultPageDTOExam result = apiInstance.getAllExamsOnPage(search, withExercises);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getAllExamsOnPage");
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
| **withExercises** | **Boolean**|  | [optional] [default to false] |

### Return type

[**SearchResultPageDTOExam**](SearchResultPageDTOExam.md)

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


## getExam

> Exam getExam(courseId, examId, withStudents, withExerciseGroups)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Boolean withStudents = false; // Boolean | 
        Boolean withExerciseGroups = false; // Boolean | 
        try {
            Exam result = apiInstance.getExam(courseId, examId, withStudents, withExerciseGroups);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExam");
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
| **withStudents** | **Boolean**|  | [optional] [default to false] |
| **withExerciseGroups** | **Boolean**|  | [optional] [default to false] |

### Return type

[**Exam**](Exam.md)

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


## getExamForAssessmentDashboard

> Exam getExamForAssessmentDashboard(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Exam result = apiInstance.getExamForAssessmentDashboard(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamForAssessmentDashboard");
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

[**Exam**](Exam.md)

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


## getExamForImportWithExercises

> Exam getExamForImportWithExercises(examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long examId = 56L; // Long | 
        try {
            Exam result = apiInstance.getExamForImportWithExercises(examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamForImportWithExercises");
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
| **examId** | **Long**|  | |

### Return type

[**Exam**](Exam.md)

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


## getExamForTestRunAssessmentDashboard

> Exam getExamForTestRunAssessmentDashboard(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Exam result = apiInstance.getExamForTestRunAssessmentDashboard(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamForTestRunAssessmentDashboard");
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

[**Exam**](Exam.md)

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


## getExamScore

> ExamScoresDTO getExamScore(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            ExamScoresDTO result = apiInstance.getExamScore(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamScore");
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

[**ExamScoresDTO**](ExamScoresDTO.md)

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


## getExamStatistics

> ExamChecklistDTO getExamStatistics(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            ExamChecklistDTO result = apiInstance.getExamStatistics(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamStatistics");
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

[**ExamChecklistDTO**](ExamChecklistDTO.md)

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


## getExamTitle

> String getExamTitle(examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long examId = 56L; // Long | 
        try {
            String result = apiInstance.getExamTitle(examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamTitle");
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
| **examId** | **Long**|  | |

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


## getExamsForCourse

> List&lt;Exam&gt; getExamsForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<Exam> result = apiInstance.getExamsForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamsForCourse");
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

[**List&lt;Exam&gt;**](Exam.md)

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


## getExamsWithQuizExercisesForUser

> List&lt;Exam&gt; getExamsWithQuizExercisesForUser(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<Exam> result = apiInstance.getExamsWithQuizExercisesForUser(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getExamsWithQuizExercisesForUser");
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

[**List&lt;Exam&gt;**](Exam.md)

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


## getLatestIndividualEndDateOfExam

> ExamInformationDTO getLatestIndividualEndDateOfExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            ExamInformationDTO result = apiInstance.getLatestIndividualEndDateOfExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getLatestIndividualEndDateOfExam");
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

[**ExamInformationDTO**](ExamInformationDTO.md)

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


## getLockedSubmissionsForExam

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getLockedSubmissionsForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getLockedSubmissionsForExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getLockedSubmissionsForExam");
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

[**List&lt;GetAllTextSubmissions200ResponseInner&gt;**](GetAllTextSubmissions200ResponseInner.md)

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


## getStatsForExamAssessmentDashboard

> StatsForDashboardDTO getStatsForExamAssessmentDashboard(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            StatsForDashboardDTO result = apiInstance.getStatsForExamAssessmentDashboard(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getStatsForExamAssessmentDashboard");
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

[**StatsForDashboardDTO**](StatsForDashboardDTO.md)

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


## getStudentExamForStart

> StudentExam getStudentExamForStart(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            StudentExam result = apiInstance.getStudentExamForStart(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#getStudentExamForStart");
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


## importExamWithExercises

> Exam importExamWithExercises(courseId, exam)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Exam exam = new Exam(); // Exam | 
        try {
            Exam result = apiInstance.importExamWithExercises(courseId, exam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#importExamWithExercises");
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
| **exam** | [**Exam**](Exam.md)|  | |

### Return type

[**Exam**](Exam.md)

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


## lockAllRepositories1

> Integer lockAllRepositories1(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Integer result = apiInstance.lockAllRepositories1(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#lockAllRepositories1");
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

**Integer**

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


## registerCourseStudents

> registerCourseStudents(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            apiInstance.registerCourseStudents(courseId, examId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#registerCourseStudents");
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


## removeAllStudentsFromExam

> removeAllStudentsFromExam(courseId, examId, withParticipationsAndSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Boolean withParticipationsAndSubmission = false; // Boolean | 
        try {
            apiInstance.removeAllStudentsFromExam(courseId, examId, withParticipationsAndSubmission);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#removeAllStudentsFromExam");
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
| **withParticipationsAndSubmission** | **Boolean**|  | [optional] [default to false] |

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


## removeStudentFromExam

> removeStudentFromExam(courseId, examId, studentLogin, withParticipationsAndSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        Boolean withParticipationsAndSubmission = false; // Boolean | 
        try {
            apiInstance.removeStudentFromExam(courseId, examId, studentLogin, withParticipationsAndSubmission);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#removeStudentFromExam");
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
| **studentLogin** | **String**|  | |
| **withParticipationsAndSubmission** | **Boolean**|  | [optional] [default to false] |

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


## resetExam

> Exam resetExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Exam result = apiInstance.resetExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#resetExam");
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

[**Exam**](Exam.md)

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


## unlockAllRepositories1

> Integer unlockAllRepositories1(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Integer result = apiInstance.unlockAllRepositories1(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#unlockAllRepositories1");
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

**Integer**

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


## updateExam

> Exam updateExam(courseId, exam)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Exam exam = new Exam(); // Exam | 
        try {
            Exam result = apiInstance.updateExam(courseId, exam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#updateExam");
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
| **exam** | [**Exam**](Exam.md)|  | |

### Return type

[**Exam**](Exam.md)

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


## updateOrderOfExerciseGroups

> List&lt;ExerciseGroup&gt; updateOrderOfExerciseGroups(courseId, examId, exerciseGroup)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamResourceApi apiInstance = new ExamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        List<ExerciseGroup> exerciseGroup = Arrays.asList(); // List<ExerciseGroup> | 
        try {
            List<ExerciseGroup> result = apiInstance.updateOrderOfExerciseGroups(courseId, examId, exerciseGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamResourceApi#updateOrderOfExerciseGroups");
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
| **exerciseGroup** | [**List&lt;ExerciseGroup&gt;**](ExerciseGroup.md)|  | |

### Return type

[**List&lt;ExerciseGroup&gt;**](ExerciseGroup.md)

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

