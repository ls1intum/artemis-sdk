# TextSubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTextSubmission**](TextSubmissionResourceApi.md#createTextSubmission) | **POST** /api/exercises/{exerciseId}/text-submissions |  |
| [**getAllTextSubmissions**](TextSubmissionResourceApi.md#getAllTextSubmissions) | **GET** /api/exercises/{exerciseId}/text-submissions |  |
| [**getTextSubmissionWithResults**](TextSubmissionResourceApi.md#getTextSubmissionWithResults) | **GET** /api/text-submissions/{submissionId} |  |
| [**getTextSubmissionWithoutAssessment**](TextSubmissionResourceApi.md#getTextSubmissionWithoutAssessment) | **GET** /api/exercises/{exerciseId}/text-submission-without-assessment |  |
| [**updateTextSubmission**](TextSubmissionResourceApi.md#updateTextSubmission) | **PUT** /api/exercises/{exerciseId}/text-submissions |  |



## createTextSubmission

> TextSubmission createTextSubmission(exerciseId, textSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextSubmissionResourceApi apiInstance = new TextSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        TextSubmission textSubmission = new TextSubmission(); // TextSubmission | 
        try {
            TextSubmission result = apiInstance.createTextSubmission(exerciseId, textSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextSubmissionResourceApi#createTextSubmission");
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
| **textSubmission** | [**TextSubmission**](TextSubmission.md)|  | |

### Return type

[**TextSubmission**](TextSubmission.md)

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


## getAllTextSubmissions

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getAllTextSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextSubmissionResourceApi apiInstance = new TextSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean submittedOnly = false; // Boolean | 
        Boolean assessedByTutor = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getAllTextSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextSubmissionResourceApi#getAllTextSubmissions");
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


## getTextSubmissionWithResults

> TextSubmission getTextSubmissionWithResults(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextSubmissionResourceApi apiInstance = new TextSubmissionResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            TextSubmission result = apiInstance.getTextSubmissionWithResults(submissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextSubmissionResourceApi#getTextSubmissionWithResults");
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

[**TextSubmission**](TextSubmission.md)

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


## getTextSubmissionWithoutAssessment

> TextSubmission getTextSubmissionWithoutAssessment(exerciseId, head, lock, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextSubmissionResourceApi apiInstance = new TextSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean head = false; // Boolean | 
        Boolean lock = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            TextSubmission result = apiInstance.getTextSubmissionWithoutAssessment(exerciseId, head, lock, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextSubmissionResourceApi#getTextSubmissionWithoutAssessment");
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
| **head** | **Boolean**|  | [optional] [default to false] |
| **lock** | **Boolean**|  | [optional] [default to false] |
| **correctionRound** | **Integer**|  | [optional] [default to 0] |

### Return type

[**TextSubmission**](TextSubmission.md)

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


## updateTextSubmission

> TextSubmission updateTextSubmission(exerciseId, textSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextSubmissionResourceApi apiInstance = new TextSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        TextSubmission textSubmission = new TextSubmission(); // TextSubmission | 
        try {
            TextSubmission result = apiInstance.updateTextSubmission(exerciseId, textSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextSubmissionResourceApi#updateTextSubmission");
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
| **textSubmission** | [**TextSubmission**](TextSubmission.md)|  | |

### Return type

[**TextSubmission**](TextSubmission.md)

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

