# TextAssessmentResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAssessment3**](TextAssessmentResourceApi.md#cancelAssessment3) | **POST** /api/participations/{participationId}/submissions/{submissionId}/cancel-assessment |  |
| [**deleteAssessment**](TextAssessmentResourceApi.md#deleteAssessment) | **DELETE** /api/participations/{participationId}/text-submissions/{submissionId}/results/{resultId} |  |
| [**deleteTextExampleAssessment**](TextAssessmentResourceApi.md#deleteTextExampleAssessment) | **DELETE** /api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-text-assessment/feedback |  |
| [**getConflictingTextSubmissions**](TextAssessmentResourceApi.md#getConflictingTextSubmissions) | **GET** /api/participations/{participationId}/submissions/{submissionId}/feedbacks/{feedbackId}/feedback-conflicts |  |
| [**getExampleResultForTutor**](TextAssessmentResourceApi.md#getExampleResultForTutor) | **GET** /api/exercises/{exerciseId}/submissions/{submissionId}/example-result |  |
| [**retrieveParticipationForSubmission**](TextAssessmentResourceApi.md#retrieveParticipationForSubmission) | **GET** /api/participations/{participationId}/submissions/{submissionId}/for-text-assessment |  |
| [**saveTextAssessment**](TextAssessmentResourceApi.md#saveTextAssessment) | **PUT** /api/participations/{participationId}/results/{resultId}/text-assessment |  |
| [**saveTextExampleAssessment**](TextAssessmentResourceApi.md#saveTextExampleAssessment) | **PUT** /api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-text-assessment |  |
| [**solveFeedbackConflict**](TextAssessmentResourceApi.md#solveFeedbackConflict) | **POST** /api/exercises/{exerciseId}/feedback-conflicts/{feedbackConflictId}/solve |  |
| [**submitTextAssessment**](TextAssessmentResourceApi.md#submitTextAssessment) | **POST** /api/participations/{participationId}/results/{resultId}/submit-text-assessment |  |
| [**updateTextAssessmentAfterComplaint**](TextAssessmentResourceApi.md#updateTextAssessmentAfterComplaint) | **PUT** /api/participations/{participationId}/submissions/{submissionId}/text-assessment-after-complaint |  |



## cancelAssessment3

> cancelAssessment3(participationId, submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        try {
            apiInstance.cancelAssessment3(participationId, submissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#cancelAssessment3");
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


## deleteAssessment

> deleteAssessment(participationId, submissionId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            apiInstance.deleteAssessment(participationId, submissionId, resultId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#deleteAssessment");
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


## deleteTextExampleAssessment

> deleteTextExampleAssessment(exerciseId, exampleSubmissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exampleSubmissionId = 56L; // Long | 
        try {
            apiInstance.deleteTextExampleAssessment(exerciseId, exampleSubmissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#deleteTextExampleAssessment");
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
| **exampleSubmissionId** | **Long**|  | |

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
| **204** | No Content |  -  |


## getConflictingTextSubmissions

> Set&lt;TextSubmission&gt; getConflictingTextSubmissions(participationId, submissionId, feedbackId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        Long feedbackId = 56L; // Long | 
        try {
            Set<TextSubmission> result = apiInstance.getConflictingTextSubmissions(participationId, submissionId, feedbackId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#getConflictingTextSubmissions");
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
| **feedbackId** | **Long**|  | |

### Return type

[**Set&lt;TextSubmission&gt;**](TextSubmission.md)

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


## getExampleResultForTutor

> Result getExampleResultForTutor(exerciseId, submissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        try {
            Result result = apiInstance.getExampleResultForTutor(exerciseId, submissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#getExampleResultForTutor");
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


## retrieveParticipationForSubmission

> CleanupBuildPlan200Response retrieveParticipationForSubmission(participationId, submissionId, correctionRound, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        Integer correctionRound = 0; // Integer | 
        Long resultId = 56L; // Long | 
        try {
            CleanupBuildPlan200Response result = apiInstance.retrieveParticipationForSubmission(participationId, submissionId, correctionRound, resultId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#retrieveParticipationForSubmission");
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
| **correctionRound** | **Integer**|  | [optional] [default to 0] |
| **resultId** | **Long**|  | [optional] |

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


## saveTextAssessment

> Result saveTextAssessment(participationId, resultId, textAssessmentDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        TextAssessmentDTO textAssessmentDTO = new TextAssessmentDTO(); // TextAssessmentDTO | 
        try {
            Result result = apiInstance.saveTextAssessment(participationId, resultId, textAssessmentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#saveTextAssessment");
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
| **resultId** | **Long**|  | |
| **textAssessmentDTO** | [**TextAssessmentDTO**](TextAssessmentDTO.md)|  | |

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


## saveTextExampleAssessment

> Result saveTextExampleAssessment(exerciseId, exampleSubmissionId, textAssessmentDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exampleSubmissionId = 56L; // Long | 
        TextAssessmentDTO textAssessmentDTO = new TextAssessmentDTO(); // TextAssessmentDTO | 
        try {
            Result result = apiInstance.saveTextExampleAssessment(exerciseId, exampleSubmissionId, textAssessmentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#saveTextExampleAssessment");
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
| **exampleSubmissionId** | **Long**|  | |
| **textAssessmentDTO** | [**TextAssessmentDTO**](TextAssessmentDTO.md)|  | |

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


## solveFeedbackConflict

> FeedbackConflict solveFeedbackConflict(exerciseId, feedbackConflictId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long feedbackConflictId = 56L; // Long | 
        try {
            FeedbackConflict result = apiInstance.solveFeedbackConflict(exerciseId, feedbackConflictId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#solveFeedbackConflict");
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
| **feedbackConflictId** | **Long**|  | |

### Return type

[**FeedbackConflict**](FeedbackConflict.md)

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


## submitTextAssessment

> Result submitTextAssessment(participationId, resultId, textAssessmentDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        TextAssessmentDTO textAssessmentDTO = new TextAssessmentDTO(); // TextAssessmentDTO | 
        try {
            Result result = apiInstance.submitTextAssessment(participationId, resultId, textAssessmentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#submitTextAssessment");
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
| **resultId** | **Long**|  | |
| **textAssessmentDTO** | [**TextAssessmentDTO**](TextAssessmentDTO.md)|  | |

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


## updateTextAssessmentAfterComplaint

> Result updateTextAssessmentAfterComplaint(participationId, submissionId, textAssessmentUpdateDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextAssessmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextAssessmentResourceApi apiInstance = new TextAssessmentResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        TextAssessmentUpdateDTO textAssessmentUpdateDTO = new TextAssessmentUpdateDTO(); // TextAssessmentUpdateDTO | 
        try {
            Result result = apiInstance.updateTextAssessmentAfterComplaint(participationId, submissionId, textAssessmentUpdateDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextAssessmentResourceApi#updateTextAssessmentAfterComplaint");
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
| **textAssessmentUpdateDTO** | [**TextAssessmentUpdateDTO**](TextAssessmentUpdateDTO.md)|  | |

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

