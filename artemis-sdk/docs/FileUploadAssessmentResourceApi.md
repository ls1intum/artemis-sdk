# FileUploadAssessmentResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAssessment2**](FileUploadAssessmentResourceApi.md#cancelAssessment2) | **PUT** /api/file-upload-submissions/{submissionId}/cancel-assessment |  |
| [**deleteAssessment3**](FileUploadAssessmentResourceApi.md#deleteAssessment3) | **DELETE** /api/participations/{participationId}/file-upload-submissions/{submissionId}/results/{resultId} |  |
| [**getAssessmentBySubmissionId1**](FileUploadAssessmentResourceApi.md#getAssessmentBySubmissionId1) | **GET** /api/file-upload-submissions/{submissionId}/result |  |
| [**saveFileUploadAssessment**](FileUploadAssessmentResourceApi.md#saveFileUploadAssessment) | **PUT** /api/file-upload-submissions/{submissionId}/feedback |  |
| [**updateFileUploadAssessmentAfterComplaint**](FileUploadAssessmentResourceApi.md#updateFileUploadAssessmentAfterComplaint) | **PUT** /api/file-upload-submissions/{submissionId}/assessment-after-complaint |  |



## cancelAssessment2

> cancelAssessment2(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadAssessmentResourceApi apiInstance = new FileUploadAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            apiInstance.cancelAssessment2(submissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadAssessmentResourceApi#cancelAssessment2");
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


## deleteAssessment3

> deleteAssessment3(participationId, submissionId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadAssessmentResourceApi apiInstance = new FileUploadAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            apiInstance.deleteAssessment3(participationId, submissionId, resultId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadAssessmentResourceApi#deleteAssessment3");
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


## getAssessmentBySubmissionId1

> Result getAssessmentBySubmissionId1(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadAssessmentResourceApi apiInstance = new FileUploadAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            Result result = apiInstance.getAssessmentBySubmissionId1(submissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadAssessmentResourceApi#getAssessmentBySubmissionId1");
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


## saveFileUploadAssessment

> Result saveFileUploadAssessment(submissionId, feedback, submit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadAssessmentResourceApi apiInstance = new FileUploadAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        List<Feedback> feedback = Arrays.asList(); // List<Feedback> | 
        Boolean submit = false; // Boolean | 
        try {
            Result result = apiInstance.saveFileUploadAssessment(submissionId, feedback, submit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadAssessmentResourceApi#saveFileUploadAssessment");
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
| **feedback** | [**List&lt;Feedback&gt;**](Feedback.md)|  | |
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


## updateFileUploadAssessmentAfterComplaint

> Result updateFileUploadAssessmentAfterComplaint(submissionId, assessmentUpdate)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadAssessmentResourceApi apiInstance = new FileUploadAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        AssessmentUpdate assessmentUpdate = new AssessmentUpdate(); // AssessmentUpdate | 
        try {
            Result result = apiInstance.updateFileUploadAssessmentAfterComplaint(submissionId, assessmentUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadAssessmentResourceApi#updateFileUploadAssessmentAfterComplaint");
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

