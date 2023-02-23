# ProgrammingExerciseParticipationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkIfParticipationHashResult**](ProgrammingExerciseParticipationResourceApi.md#checkIfParticipationHashResult) | **GET** /api/programming-exercise-participations/{participationId}/has-result |  |
| [**getLatestPendingSubmission**](ProgrammingExerciseParticipationResourceApi.md#getLatestPendingSubmission) | **GET** /api/programming-exercise-participations/{participationId}/latest-pending-submission |  |
| [**getLatestPendingSubmissionsByExerciseId**](ProgrammingExerciseParticipationResourceApi.md#getLatestPendingSubmissionsByExerciseId) | **GET** /api/programming-exercises/{exerciseId}/latest-pending-submissions |  |
| [**getLatestResultWithFeedbacksForProgrammingExerciseParticipation**](ProgrammingExerciseParticipationResourceApi.md#getLatestResultWithFeedbacksForProgrammingExerciseParticipation) | **GET** /api/programming-exercise-participations/{participationId}/latest-result-with-feedbacks |  |
| [**getParticipationWithLatestResultForStudentParticipation**](ProgrammingExerciseParticipationResourceApi.md#getParticipationWithLatestResultForStudentParticipation) | **GET** /api/programming-exercise-participations/{participationId}/student-participation-with-latest-result-and-feedbacks |  |
| [**resetRepository**](ProgrammingExerciseParticipationResourceApi.md#resetRepository) | **PUT** /api/programming-exercise-participations/{participationId}/reset-repository |  |



## checkIfParticipationHashResult

> Boolean checkIfParticipationHashResult(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseParticipationResourceApi apiInstance = new ProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            Boolean result = apiInstance.checkIfParticipationHashResult(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseParticipationResourceApi#checkIfParticipationHashResult");
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

### Return type

**Boolean**

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


## getLatestPendingSubmission

> ProgrammingSubmission getLatestPendingSubmission(participationId, lastGraded)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseParticipationResourceApi apiInstance = new ProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Boolean lastGraded = false; // Boolean | 
        try {
            ProgrammingSubmission result = apiInstance.getLatestPendingSubmission(participationId, lastGraded);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseParticipationResourceApi#getLatestPendingSubmission");
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


## getLatestPendingSubmissionsByExerciseId

> Map&lt;String, ProgrammingSubmission&gt; getLatestPendingSubmissionsByExerciseId(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseParticipationResourceApi apiInstance = new ProgrammingExerciseParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Map<String, ProgrammingSubmission> result = apiInstance.getLatestPendingSubmissionsByExerciseId(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseParticipationResourceApi#getLatestPendingSubmissionsByExerciseId");
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

[**Map&lt;String, ProgrammingSubmission&gt;**](ProgrammingSubmission.md)

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


## getLatestResultWithFeedbacksForProgrammingExerciseParticipation

> Result getLatestResultWithFeedbacksForProgrammingExerciseParticipation(participationId, withSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseParticipationResourceApi apiInstance = new ProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Boolean withSubmission = false; // Boolean | 
        try {
            Result result = apiInstance.getLatestResultWithFeedbacksForProgrammingExerciseParticipation(participationId, withSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseParticipationResourceApi#getLatestResultWithFeedbacksForProgrammingExerciseParticipation");
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
| **withSubmission** | **Boolean**|  | [optional] [default to false] |

### Return type

[**Result**](Result.md)

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


## getParticipationWithLatestResultForStudentParticipation

> CleanupBuildPlan200Response getParticipationWithLatestResultForStudentParticipation(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseParticipationResourceApi apiInstance = new ProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            CleanupBuildPlan200Response result = apiInstance.getParticipationWithLatestResultForStudentParticipation(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseParticipationResourceApi#getParticipationWithLatestResultForStudentParticipation");
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

### Return type

[**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md)

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


## resetRepository

> resetRepository(participationId, gradedParticipationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseParticipationResourceApi apiInstance = new ProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long gradedParticipationId = 56L; // Long | 
        try {
            apiInstance.resetRepository(participationId, gradedParticipationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseParticipationResourceApi#resetRepository");
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
| **gradedParticipationId** | **Long**|  | [optional] |

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

