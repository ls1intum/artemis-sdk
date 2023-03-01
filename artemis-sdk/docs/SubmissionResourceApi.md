# SubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSubmission**](SubmissionResourceApi.md#deleteSubmission) | **DELETE** /api/submissions/{id} |  |
| [**getSubmissionsOnPageWithSize**](SubmissionResourceApi.md#getSubmissionsOnPageWithSize) | **GET** /api/exercises/{exerciseId}/submissions-for-import |  |
| [**getSubmissionsWithComplaintsForAssessmentDashboard**](SubmissionResourceApi.md#getSubmissionsWithComplaintsForAssessmentDashboard) | **GET** /api/exercises/{exerciseId}/submissions-with-complaints |  |
| [**getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard**](SubmissionResourceApi.md#getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard) | **GET** /api/exercises/{exerciseId}/more-feedback-requests-with-complaints |  |
| [**getTestRunSubmissionsForAssessment**](SubmissionResourceApi.md#getTestRunSubmissionsForAssessment) | **GET** /api/exercises/{exerciseId}/test-run-submissions |  |



## deleteSubmission

> deleteSubmission(id)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionResourceApi apiInstance = new SubmissionResourceApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            apiInstance.deleteSubmission(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionResourceApi#deleteSubmission");
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
| **id** | **Long**|  | |

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


## getSubmissionsOnPageWithSize

> SearchResultPageDTOSubmission getSubmissionsOnPageWithSize(exerciseId, search)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionResourceApi apiInstance = new SubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        try {
            SearchResultPageDTOSubmission result = apiInstance.getSubmissionsOnPageWithSize(exerciseId, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionResourceApi#getSubmissionsOnPageWithSize");
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
| **search** | [**PageableSearchDTOString**](PageableSearchDTOString.md)|  | |

### Return type

[**SearchResultPageDTOSubmission**](SearchResultPageDTOSubmission.md)

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


## getSubmissionsWithComplaintsForAssessmentDashboard

> List&lt;SubmissionWithComplaintDTO&gt; getSubmissionsWithComplaintsForAssessmentDashboard(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionResourceApi apiInstance = new SubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<SubmissionWithComplaintDTO> result = apiInstance.getSubmissionsWithComplaintsForAssessmentDashboard(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionResourceApi#getSubmissionsWithComplaintsForAssessmentDashboard");
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

[**List&lt;SubmissionWithComplaintDTO&gt;**](SubmissionWithComplaintDTO.md)

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


## getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard

> List&lt;SubmissionWithComplaintDTO&gt; getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionResourceApi apiInstance = new SubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<SubmissionWithComplaintDTO> result = apiInstance.getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionResourceApi#getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard");
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

[**List&lt;SubmissionWithComplaintDTO&gt;**](SubmissionWithComplaintDTO.md)

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


## getTestRunSubmissionsForAssessment

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getTestRunSubmissionsForAssessment(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionResourceApi apiInstance = new SubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getTestRunSubmissionsForAssessment(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionResourceApi#getTestRunSubmissionsForAssessment");
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

