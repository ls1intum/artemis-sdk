# ModelingAssessmentResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAssessment1**](ModelingAssessmentResourceApi.md#cancelAssessment1) | **PUT** /api/modeling-submissions/{submissionId}/cancel-assessment |  |
| [**deleteAssessment2**](ModelingAssessmentResourceApi.md#deleteAssessment2) | **DELETE** /api/participations/{participationId}/modeling-submissions/{submissionId}/results/{resultId} |  |
| [**getAssessmentBySubmissionId**](ModelingAssessmentResourceApi.md#getAssessmentBySubmissionId) | **GET** /api/modeling-submissions/{submissionId}/result |  |
| [**getModelingExampleAssessment**](ModelingAssessmentResourceApi.md#getModelingExampleAssessment) | **GET** /api/exercise/{exerciseId}/modeling-submissions/{submissionId}/example-assessment |  |
| [**saveModelingAssessment**](ModelingAssessmentResourceApi.md#saveModelingAssessment) | **PUT** /api/modeling-submissions/{submissionId}/result/{resultId}/assessment |  |
| [**saveModelingExampleAssessment**](ModelingAssessmentResourceApi.md#saveModelingExampleAssessment) | **PUT** /api/modeling-submissions/{exampleSubmissionId}/example-assessment |  |
| [**updateModelingAssessmentAfterComplaint**](ModelingAssessmentResourceApi.md#updateModelingAssessmentAfterComplaint) | **PUT** /api/modeling-submissions/{submissionId}/assessment-after-complaint |  |



## cancelAssessment1

> cancelAssessment1(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            apiInstance.cancelAssessment1(submissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#cancelAssessment1");
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


## deleteAssessment2

> deleteAssessment2(participationId, submissionId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            apiInstance.deleteAssessment2(participationId, submissionId, resultId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#deleteAssessment2");
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


## getAssessmentBySubmissionId

> Result getAssessmentBySubmissionId(submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        try {
            Result result = apiInstance.getAssessmentBySubmissionId(submissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#getAssessmentBySubmissionId");
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


## getModelingExampleAssessment

> Result getModelingExampleAssessment(exerciseId, submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        try {
            Result result = apiInstance.getModelingExampleAssessment(exerciseId, submissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#getModelingExampleAssessment");
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


## saveModelingAssessment

> Result saveModelingAssessment(submissionId, resultId, feedback, submit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        List<Feedback> feedback = Arrays.asList(); // List<Feedback> | 
        Boolean submit = false; // Boolean | 
        try {
            Result result = apiInstance.saveModelingAssessment(submissionId, resultId, feedback, submit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#saveModelingAssessment");
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
| **resultId** | **Long**|  | |
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


## saveModelingExampleAssessment

> Result saveModelingExampleAssessment(exampleSubmissionId, feedback)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long exampleSubmissionId = 56L; // Long | 
        List<Feedback> feedback = Arrays.asList(); // List<Feedback> | 
        try {
            Result result = apiInstance.saveModelingExampleAssessment(exampleSubmissionId, feedback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#saveModelingExampleAssessment");
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
| **exampleSubmissionId** | **Long**|  | |
| **feedback** | [**List&lt;Feedback&gt;**](Feedback.md)|  | |

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


## updateModelingAssessmentAfterComplaint

> Result updateModelingAssessmentAfterComplaint(submissionId, assessmentUpdate)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingAssessmentResourceApi apiInstance = new ModelingAssessmentResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        AssessmentUpdate assessmentUpdate = new AssessmentUpdate(); // AssessmentUpdate | 
        try {
            Result result = apiInstance.updateModelingAssessmentAfterComplaint(submissionId, assessmentUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingAssessmentResourceApi#updateModelingAssessmentAfterComplaint");
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

