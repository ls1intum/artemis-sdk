# ProgrammingAssessmentResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAssessment**](ProgrammingAssessmentResourceApi.md#cancelAssessment) | **PUT** /api/programming-submissions/{submissionId}/cancel-assessment |  |
| [**deleteAssessment1**](ProgrammingAssessmentResourceApi.md#deleteAssessment1) | **DELETE** /api/participations/{participationId}/programming-submissions/{submissionId}/results/{resultId} |  |
| [**saveProgrammingAssessment**](ProgrammingAssessmentResourceApi.md#saveProgrammingAssessment) | **PUT** /api/participations/{participationId}/manual-results |  |
| [**updateProgrammingManualResultAfterComplaint**](ProgrammingAssessmentResourceApi.md#updateProgrammingManualResultAfterComplaint) | **PUT** /api/programming-submissions/{submissionId}/assessment-after-complaint |  |



## cancelAssessment

> cancelAssessment(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingAssessmentResourceApi apiInstance = new ProgrammingAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            apiInstance.cancelAssessment(submissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingAssessmentResourceApi#cancelAssessment");
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


## deleteAssessment1

> deleteAssessment1(participationId, submissionId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingAssessmentResourceApi apiInstance = new ProgrammingAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            apiInstance.deleteAssessment1(participationId, submissionId, resultId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingAssessmentResourceApi#deleteAssessment1");
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
| **submissionId** | **Long**|  | |
| **resultId** | **Long**|  | |

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


## saveProgrammingAssessment

> Result saveProgrammingAssessment(participationId, result, submit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingAssessmentResourceApi apiInstance = new ProgrammingAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Result result = new Result(); // Result | 
        Boolean submit = false; // Boolean | 
        try {
            Result result = apiInstance.saveProgrammingAssessment(participationId, result, submit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingAssessmentResourceApi#saveProgrammingAssessment");
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
| **result** | [**Result**](Result.md)|  | |
| **submit** | **Boolean**|  | [optional] [default to false] |

### Return type

[**Result**](Result.md)

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


## updateProgrammingManualResultAfterComplaint

> Result updateProgrammingManualResultAfterComplaint(submissionId, assessmentUpdate)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingAssessmentResourceApi apiInstance = new ProgrammingAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        AssessmentUpdate assessmentUpdate = new AssessmentUpdate(); // AssessmentUpdate | 
        try {
            Result result = apiInstance.updateProgrammingManualResultAfterComplaint(submissionId, assessmentUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingAssessmentResourceApi#updateProgrammingManualResultAfterComplaint");
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
| **assessmentUpdate** | [**AssessmentUpdate**](AssessmentUpdate.md)|  | |

### Return type

[**Result**](Result.md)

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

