# ModelingSubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createModelingSubmission**](ModelingSubmissionResourceApi.md#createModelingSubmission) | **POST** /api/exercises/{exerciseId}/modeling-submissions |  |
| [**getAllModelingSubmissions**](ModelingSubmissionResourceApi.md#getAllModelingSubmissions) | **GET** /api/exercises/{exerciseId}/modeling-submissions |  |
| [**getLatestSubmissionForModelingEditor**](ModelingSubmissionResourceApi.md#getLatestSubmissionForModelingEditor) | **GET** /api/participations/{participationId}/latest-modeling-submission |  |
| [**getModelingSubmission**](ModelingSubmissionResourceApi.md#getModelingSubmission) | **GET** /api/modeling-submissions/{submissionId} |  |
| [**getModelingSubmissionWithoutAssessment**](ModelingSubmissionResourceApi.md#getModelingSubmissionWithoutAssessment) | **GET** /api/exercises/{exerciseId}/modeling-submission-without-assessment |  |
| [**updateModelingSubmission**](ModelingSubmissionResourceApi.md#updateModelingSubmission) | **PUT** /api/exercises/{exerciseId}/modeling-submissions |  |



## createModelingSubmission

> ModelingSubmission createModelingSubmission(exerciseId, modelingSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingSubmissionResourceApi apiInstance = new ModelingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ModelingSubmission modelingSubmission = new ModelingSubmission(); // ModelingSubmission | 
        try {
            ModelingSubmission result = apiInstance.createModelingSubmission(exerciseId, modelingSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingSubmissionResourceApi#createModelingSubmission");
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
| **modelingSubmission** | [**ModelingSubmission**](ModelingSubmission.md)|  | |

### Return type

[**ModelingSubmission**](ModelingSubmission.md)

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


## getAllModelingSubmissions

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getAllModelingSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingSubmissionResourceApi apiInstance = new ModelingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean submittedOnly = false; // Boolean | 
        Boolean assessedByTutor = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getAllModelingSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingSubmissionResourceApi#getAllModelingSubmissions");
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


## getLatestSubmissionForModelingEditor

> ModelingSubmission getLatestSubmissionForModelingEditor(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingSubmissionResourceApi apiInstance = new ModelingSubmissionResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            ModelingSubmission result = apiInstance.getLatestSubmissionForModelingEditor(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingSubmissionResourceApi#getLatestSubmissionForModelingEditor");
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

[**ModelingSubmission**](ModelingSubmission.md)

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


## getModelingSubmission

> ModelingSubmission getModelingSubmission(submissionId, correctionRound, resultId, withoutResults)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingSubmissionResourceApi apiInstance = new ModelingSubmissionResourceApi(defaultClient);
        Long submissionId = 56L; // Long | 
        Integer correctionRound = 0; // Integer | 
        Long resultId = 56L; // Long | 
        Boolean withoutResults = false; // Boolean | 
        try {
            ModelingSubmission result = apiInstance.getModelingSubmission(submissionId, correctionRound, resultId, withoutResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingSubmissionResourceApi#getModelingSubmission");
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
| **withoutResults** | **Boolean**|  | [optional] [default to false] |

### Return type

[**ModelingSubmission**](ModelingSubmission.md)

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


## getModelingSubmissionWithoutAssessment

> ModelingSubmission getModelingSubmissionWithoutAssessment(exerciseId, lock, correctionRound)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingSubmissionResourceApi apiInstance = new ModelingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean lock = false; // Boolean | 
        Integer correctionRound = 0; // Integer | 
        try {
            ModelingSubmission result = apiInstance.getModelingSubmissionWithoutAssessment(exerciseId, lock, correctionRound);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingSubmissionResourceApi#getModelingSubmissionWithoutAssessment");
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

[**ModelingSubmission**](ModelingSubmission.md)

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


## updateModelingSubmission

> ModelingSubmission updateModelingSubmission(exerciseId, modelingSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingSubmissionResourceApi apiInstance = new ModelingSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ModelingSubmission modelingSubmission = new ModelingSubmission(); // ModelingSubmission | 
        try {
            ModelingSubmission result = apiInstance.updateModelingSubmission(exerciseId, modelingSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingSubmissionResourceApi#updateModelingSubmission");
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
| **modelingSubmission** | [**ModelingSubmission**](ModelingSubmission.md)|  | |

### Return type

[**ModelingSubmission**](ModelingSubmission.md)

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

