# FileUploadSubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFileUploadSubmission**](FileUploadSubmissionResourceApi.md#createFileUploadSubmission) | **POST** /api/exercises/{exerciseId}/file-upload-submissions |  |
| [**getAllFileUploadSubmissions**](FileUploadSubmissionResourceApi.md#getAllFileUploadSubmissions) | **GET** /api/exercises/{exerciseId}/file-upload-submissions |  |
| [**getDataForFileUpload**](FileUploadSubmissionResourceApi.md#getDataForFileUpload) | **GET** /api/participations/{participationId}/file-upload-editor |  |
| [**getFileUploadSubmission1**](FileUploadSubmissionResourceApi.md#getFileUploadSubmission1) | **GET** /api/file-upload-submissions/{submissionId} |  |
| [**getFileUploadSubmissionWithoutAssessment**](FileUploadSubmissionResourceApi.md#getFileUploadSubmissionWithoutAssessment) | **GET** /api/exercises/{exerciseId}/file-upload-submission-without-assessment |  |



## createFileUploadSubmission

> FileUploadSubmission createFileUploadSubmission(exerciseId, createFileUploadSubmissionRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadSubmissionResourceApi apiInstance = new FileUploadSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        CreateFileUploadSubmissionRequest createFileUploadSubmissionRequest = new CreateFileUploadSubmissionRequest(); // CreateFileUploadSubmissionRequest | 
        try {
            FileUploadSubmission result = apiInstance.createFileUploadSubmission(exerciseId, createFileUploadSubmissionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadSubmissionResourceApi#createFileUploadSubmission");
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
| **createFileUploadSubmissionRequest** | [**CreateFileUploadSubmissionRequest**](CreateFileUploadSubmissionRequest.md)|  | [optional] |

### Return type

[**FileUploadSubmission**](FileUploadSubmission.md)

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


## getAllFileUploadSubmissions

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getAllFileUploadSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadSubmissionResourceApi apiInstance = new FileUploadSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean submittedOnly = false; // Boolean | 
        Boolean assessedByTutor = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getAllFileUploadSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadSubmissionResourceApi#getAllFileUploadSubmissions");
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


## getDataForFileUpload

> FileUploadSubmission getDataForFileUpload(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadSubmissionResourceApi apiInstance = new FileUploadSubmissionResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            FileUploadSubmission result = apiInstance.getDataForFileUpload(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadSubmissionResourceApi#getDataForFileUpload");
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

[**FileUploadSubmission**](FileUploadSubmission.md)

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


## getFileUploadSubmission1

> FileUploadSubmission getFileUploadSubmission1(submissionId, correctionRound, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadSubmissionResourceApi apiInstance = new FileUploadSubmissionResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        Integer correctionRound = 0; // Integer | 
        Long resultId = 56L; // Long | 
        try {
            FileUploadSubmission result = apiInstance.getFileUploadSubmission1(submissionId, correctionRound, resultId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadSubmissionResourceApi#getFileUploadSubmission1");
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
| **resultId** | **Long**|  | [optional] |

### Return type

[**FileUploadSubmission**](FileUploadSubmission.md)

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


## getFileUploadSubmissionWithoutAssessment

> FileUploadSubmission getFileUploadSubmissionWithoutAssessment(exerciseId, lock, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadSubmissionResourceApi apiInstance = new FileUploadSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean lock = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            FileUploadSubmission result = apiInstance.getFileUploadSubmissionWithoutAssessment(exerciseId, lock, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadSubmissionResourceApi#getFileUploadSubmissionWithoutAssessment");
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

[**FileUploadSubmission**](FileUploadSubmission.md)

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

