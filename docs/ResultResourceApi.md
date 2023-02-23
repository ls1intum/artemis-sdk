# ResultResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExampleResult**](ResultResourceApi.md#createExampleResult) | **POST** /api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-results |  |
| [**createResultForExternalSubmission**](ResultResourceApi.md#createResultForExternalSubmission) | **POST** /api/exercises/{exerciseId}/external-submission-results |  |
| [**deleteResult**](ResultResourceApi.md#deleteResult) | **DELETE** /api/participations/{participationId}/results/{resultId} |  |
| [**getResult**](ResultResourceApi.md#getResult) | **GET** /api/participations/{participationId}/results/{resultId} |  |
| [**getResultDetails**](ResultResourceApi.md#getResultDetails) | **GET** /api/participations/{participationId}/results/{resultId}/details |  |
| [**getResultsForExercise**](ResultResourceApi.md#getResultsForExercise) | **GET** /api/exercises/{exerciseId}/results |  |
| [**getResultsForExerciseWithPointsPerCriterion**](ResultResourceApi.md#getResultsForExerciseWithPointsPerCriterion) | **GET** /api/exercises/{exerciseId}/results-with-points-per-criterion |  |
| [**processNewProgrammingExerciseResult**](ResultResourceApi.md#processNewProgrammingExerciseResult) | **POST** /api/programming-exercises/new-result |  |



## createExampleResult

> Result createExampleResult(exerciseId, exampleSubmissionId, isProgrammingExerciseWithFeedback)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exampleSubmissionId = 56L; // Long | 
        Boolean isProgrammingExerciseWithFeedback = false; // Boolean | 
        try {
            Result result = apiInstance.createExampleResult(exerciseId, exampleSubmissionId, isProgrammingExerciseWithFeedback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#createExampleResult");
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
| **isProgrammingExerciseWithFeedback** | **Boolean**|  | [optional] [default to false] |

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


## createResultForExternalSubmission

> Result createResultForExternalSubmission(exerciseId, studentLogin, result)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        Result result = new Result(); // Result | 
        try {
            Result result = apiInstance.createResultForExternalSubmission(exerciseId, studentLogin, result);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#createResultForExternalSubmission");
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
| **studentLogin** | **String**|  | |
| **result** | [**Result**](Result.md)|  | |

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


## deleteResult

> deleteResult(participationId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            apiInstance.deleteResult(participationId, resultId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#deleteResult");
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


## getResult

> Result getResult(participationId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            Result result = apiInstance.getResult(participationId, resultId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#getResult");
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


## getResultDetails

> List&lt;Feedback&gt; getResultDetails(participationId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            List<Feedback> result = apiInstance.getResultDetails(participationId, resultId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#getResultDetails");
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

### Return type

[**List&lt;Feedback&gt;**](Feedback.md)

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


## getResultsForExercise

> List&lt;Result&gt; getResultsForExercise(exerciseId, withSubmissions)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean withSubmissions = true; // Boolean | 
        try {
            List<Result> result = apiInstance.getResultsForExercise(exerciseId, withSubmissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#getResultsForExercise");
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
| **withSubmissions** | **Boolean**|  | [optional] [default to true] |

### Return type

[**List&lt;Result&gt;**](Result.md)

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


## getResultsForExerciseWithPointsPerCriterion

> List&lt;ResultWithPointsPerGradingCriterionDTO&gt; getResultsForExerciseWithPointsPerCriterion(exerciseId, withSubmissions)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean withSubmissions = true; // Boolean | 
        try {
            List<ResultWithPointsPerGradingCriterionDTO> result = apiInstance.getResultsForExerciseWithPointsPerCriterion(exerciseId, withSubmissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#getResultsForExerciseWithPointsPerCriterion");
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
| **withSubmissions** | **Boolean**|  | [optional] [default to true] |

### Return type

[**List&lt;ResultWithPointsPerGradingCriterionDTO&gt;**](ResultWithPointsPerGradingCriterionDTO.md)

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


## processNewProgrammingExerciseResult

> Object processNewProgrammingExerciseResult(authorization, body)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ResultResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ResultResourceApi apiInstance = new ResultResourceApi(defaultClient);
        String authorization = "authorization_example"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.processNewProgrammingExerciseResult(authorization, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultResourceApi#processNewProgrammingExerciseResult");
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
| **authorization** | **String**|  | |
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

