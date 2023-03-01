# ProgrammingSubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllProgrammingSubmissions**](ProgrammingSubmissionResourceApi.md#getAllProgrammingSubmissions) | **GET** /api/exercises/{exerciseId}/programming-submissions |  |
| [**getProgrammingSubmissionWithoutAssessment**](ProgrammingSubmissionResourceApi.md#getProgrammingSubmissionWithoutAssessment) | **GET** /api/exercises/{exerciseId}/programming-submission-without-assessment |  |
| [**lockAndGetProgrammingSubmission**](ProgrammingSubmissionResourceApi.md#lockAndGetProgrammingSubmission) | **GET** /api/programming-submissions/{submissionId}/lock |  |
| [**processNewProgrammingSubmission**](ProgrammingSubmissionResourceApi.md#processNewProgrammingSubmission) | **POST** /api/programming-submissions/{participationId} |  |
| [**testCaseChanged**](ProgrammingSubmissionResourceApi.md#testCaseChanged) | **POST** /api/programming-exercises/test-cases-changed/{exerciseId} |  |
| [**triggerBuild**](ProgrammingSubmissionResourceApi.md#triggerBuild) | **POST** /api/programming-submissions/{participationId}/trigger-build |  |
| [**triggerFailedBuild**](ProgrammingSubmissionResourceApi.md#triggerFailedBuild) | **POST** /api/programming-submissions/{participationId}/trigger-failed-build |  |
| [**triggerInstructorBuildForExercise**](ProgrammingSubmissionResourceApi.md#triggerInstructorBuildForExercise) | **POST** /api/programming-exercises/{exerciseId}/trigger-instructor-build |  |
| [**triggerInstructorBuildForExercise1**](ProgrammingSubmissionResourceApi.md#triggerInstructorBuildForExercise1) | **POST** /api/programming-exercises/{exerciseId}/trigger-instructor-build-all |  |



## getAllProgrammingSubmissions

> List&lt;ProgrammingSubmission&gt; getAllProgrammingSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean submittedOnly = false; // Boolean | 
        Boolean assessedByTutor = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            List<ProgrammingSubmission> result = apiInstance.getAllProgrammingSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#getAllProgrammingSubmissions");
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
| **submittedOnly** | **Boolean**|  | [optional] [default to false] |
| **assessedByTutor** | **Boolean**|  | [optional] [default to false] |
| **correctionRound** | **Integer**|  | [optional] [default to 0] |

### Return type

[**List&lt;ProgrammingSubmission&gt;**](ProgrammingSubmission.md)

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


## getProgrammingSubmissionWithoutAssessment

> ProgrammingSubmission getProgrammingSubmissionWithoutAssessment(exerciseId, lock, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean lock = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            ProgrammingSubmission result = apiInstance.getProgrammingSubmissionWithoutAssessment(exerciseId, lock, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#getProgrammingSubmissionWithoutAssessment");
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
| **lock** | **Boolean**|  | [optional] [default to false] |
| **correctionRound** | **Integer**|  | [optional] [default to 0] |

### Return type

[**ProgrammingSubmission**](ProgrammingSubmission.md)

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


## lockAndGetProgrammingSubmission

> ProgrammingSubmission lockAndGetProgrammingSubmission(submissionId, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        Integer correctionRound = 0; // Integer | 
        try {
            ProgrammingSubmission result = apiInstance.lockAndGetProgrammingSubmission(submissionId, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#lockAndGetProgrammingSubmission");
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
| **correctionRound** | **Integer**|  | [optional] [default to 0] |

### Return type

[**ProgrammingSubmission**](ProgrammingSubmission.md)

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


## processNewProgrammingSubmission

> Object processNewProgrammingSubmission(participationId, body)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.processNewProgrammingSubmission(participationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#processNewProgrammingSubmission");
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
| **participationId** | **Long**|  | |
| **body** | **Object**|  | |

### Return type

**Object**

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


## testCaseChanged

> testCaseChanged(exerciseId, body)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Object body = null; // Object | 
        try {
            apiInstance.testCaseChanged(exerciseId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#testCaseChanged");
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
| **body** | **Object**|  | |

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


## triggerBuild

> triggerBuild(participationId, submissionType)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        String submissionType = "MANUAL"; // String | 
        try {
            apiInstance.triggerBuild(participationId, submissionType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#triggerBuild");
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
| **participationId** | **Long**|  | |
| **submissionType** | **String**|  | [optional] [default to MANUAL] [enum: MANUAL, TIMEOUT, TEST, OTHER, INSTRUCTOR, EXTERNAL, ILLEGAL] |

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


## triggerFailedBuild

> triggerFailedBuild(participationId, lastGraded)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Boolean lastGraded = false; // Boolean | 
        try {
            apiInstance.triggerFailedBuild(participationId, lastGraded);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#triggerFailedBuild");
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
| **participationId** | **Long**|  | |
| **lastGraded** | **Boolean**|  | [optional] [default to false] |

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


## triggerInstructorBuildForExercise

> triggerInstructorBuildForExercise(exerciseId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Set<Long> requestBody = Arrays.asList(); // Set<Long> | 
        try {
            apiInstance.triggerInstructorBuildForExercise(exerciseId, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#triggerInstructorBuildForExercise");
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
| **requestBody** | **List&lt;Long&gt;**|  | |

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


## triggerInstructorBuildForExercise1

> triggerInstructorBuildForExercise1(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingSubmissionResourceApi apiInstance = new ProgrammingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.triggerInstructorBuildForExercise1(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingSubmissionResourceApi#triggerInstructorBuildForExercise1");
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

