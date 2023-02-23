# ComplaintResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComplaint**](ComplaintResourceApi.md#createComplaint) | **POST** /api/complaints |  |
| [**createComplaintForExamExercise**](ComplaintResourceApi.md#createComplaintForExamExercise) | **POST** /api/complaints/exam/{examId} |  |
| [**getComplaintBySubmissionId**](ComplaintResourceApi.md#getComplaintBySubmissionId) | **GET** /api/complaints/submissions/{submissionId} |  |
| [**getComplaintsByCourseId**](ComplaintResourceApi.md#getComplaintsByCourseId) | **GET** /api/courses/{courseId}/complaints |  |
| [**getComplaintsByCourseIdAndExamId**](ComplaintResourceApi.md#getComplaintsByCourseIdAndExamId) | **GET** /api/courses/{courseId}/exams/{examId}/complaints |  |
| [**getComplaintsByExerciseId**](ComplaintResourceApi.md#getComplaintsByExerciseId) | **GET** /api/exercises/{exerciseId}/complaints |  |
| [**getComplaintsForTestRunDashboard**](ComplaintResourceApi.md#getComplaintsForTestRunDashboard) | **GET** /api/exercises/{exerciseId}/complaints-for-test-run-dashboard |  |
| [**getComplaintsForTutor**](ComplaintResourceApi.md#getComplaintsForTutor) | **GET** /api/complaints |  |
| [**getMoreFeedbackRequestsForAssessmentDashboard**](ComplaintResourceApi.md#getMoreFeedbackRequestsForAssessmentDashboard) | **GET** /api/exercises/{exerciseId}/more-feedback-for-assessment-dashboard |  |
| [**getNumberOfAllowedComplaintsInCourse**](ComplaintResourceApi.md#getNumberOfAllowedComplaintsInCourse) | **GET** /api/courses/{courseId}/allowed-complaints |  |



## createComplaint

> Complaint createComplaint(complaint)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Complaint complaint = new Complaint(); // Complaint | 
        try {
            Complaint result = apiInstance.createComplaint(complaint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#createComplaint");
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
| **complaint** | [**Complaint**](Complaint.md)|  | |

### Return type

[**Complaint**](Complaint.md)

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


## createComplaintForExamExercise

> Complaint createComplaintForExamExercise(examId, complaint)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long examId = 56L; // Long | 
        Complaint complaint = new Complaint(); // Complaint | 
        try {
            Complaint result = apiInstance.createComplaintForExamExercise(examId, complaint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#createComplaintForExamExercise");
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
| **complaint** | [**Complaint**](Complaint.md)|  | |

### Return type

[**Complaint**](Complaint.md)

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


## getComplaintBySubmissionId

> Complaint getComplaintBySubmissionId(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            Complaint result = apiInstance.getComplaintBySubmissionId(submissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getComplaintBySubmissionId");
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
| **submissionId** | **Long**|  | |

### Return type

[**Complaint**](Complaint.md)

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


## getComplaintsByCourseId

> List&lt;Complaint&gt; getComplaintsByCourseId(courseId, complaintType, tutorId, allComplaintsForTutor)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String complaintType = "COMPLAINT"; // String | 
        Long tutorId = 56L; // Long | 
        Boolean allComplaintsForTutor = true; // Boolean | 
        try {
            List<Complaint> result = apiInstance.getComplaintsByCourseId(courseId, complaintType, tutorId, allComplaintsForTutor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getComplaintsByCourseId");
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
| **complaintType** | **String**|  | [enum: COMPLAINT, MORE_FEEDBACK] |
| **tutorId** | **Long**|  | [optional] |
| **allComplaintsForTutor** | **Boolean**|  | [optional] |

### Return type

[**List&lt;Complaint&gt;**](Complaint.md)

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


## getComplaintsByCourseIdAndExamId

> List&lt;Complaint&gt; getComplaintsByCourseIdAndExamId(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<Complaint> result = apiInstance.getComplaintsByCourseIdAndExamId(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getComplaintsByCourseIdAndExamId");
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

[**List&lt;Complaint&gt;**](Complaint.md)

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


## getComplaintsByExerciseId

> List&lt;Complaint&gt; getComplaintsByExerciseId(exerciseId, complaintType, tutorId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String complaintType = "COMPLAINT"; // String | 
        Long tutorId = 56L; // Long | 
        try {
            List<Complaint> result = apiInstance.getComplaintsByExerciseId(exerciseId, complaintType, tutorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getComplaintsByExerciseId");
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
| **exerciseId** | **Long**|  | |
| **complaintType** | **String**|  | [enum: COMPLAINT, MORE_FEEDBACK] |
| **tutorId** | **Long**|  | [optional] |

### Return type

[**List&lt;Complaint&gt;**](Complaint.md)

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


## getComplaintsForTestRunDashboard

> List&lt;Complaint&gt; getComplaintsForTestRunDashboard(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<Complaint> result = apiInstance.getComplaintsForTestRunDashboard(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getComplaintsForTestRunDashboard");
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
| **exerciseId** | **Long**|  | |

### Return type

[**List&lt;Complaint&gt;**](Complaint.md)

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


## getComplaintsForTutor

> List&lt;Complaint&gt; getComplaintsForTutor(complaintType)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        String complaintType = "COMPLAINT"; // String | 
        try {
            List<Complaint> result = apiInstance.getComplaintsForTutor(complaintType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getComplaintsForTutor");
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
| **complaintType** | **String**|  | [enum: COMPLAINT, MORE_FEEDBACK] |

### Return type

[**List&lt;Complaint&gt;**](Complaint.md)

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


## getMoreFeedbackRequestsForAssessmentDashboard

> List&lt;Complaint&gt; getMoreFeedbackRequestsForAssessmentDashboard(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<Complaint> result = apiInstance.getMoreFeedbackRequestsForAssessmentDashboard(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getMoreFeedbackRequestsForAssessmentDashboard");
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
| **exerciseId** | **Long**|  | |

### Return type

[**List&lt;Complaint&gt;**](Complaint.md)

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


## getNumberOfAllowedComplaintsInCourse

> Long getNumberOfAllowedComplaintsInCourse(courseId, teamMode)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ComplaintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ComplaintResourceApi apiInstance = new ComplaintResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Boolean teamMode = false; // Boolean | 
        try {
            Long result = apiInstance.getNumberOfAllowedComplaintsInCourse(courseId, teamMode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplaintResourceApi#getNumberOfAllowedComplaintsInCourse");
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
| **teamMode** | **Boolean**|  | [optional] [default to false] |

### Return type

**Long**

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

