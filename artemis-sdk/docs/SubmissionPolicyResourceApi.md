# SubmissionPolicyResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubmissionPolicyToProgrammingExercise**](SubmissionPolicyResourceApi.md#addSubmissionPolicyToProgrammingExercise) | **POST** /api/programming-exercises/{exerciseId}/submission-policy |  |
| [**getParticipationSubmissionCount**](SubmissionPolicyResourceApi.md#getParticipationSubmissionCount) | **GET** /api/participations/{participationId}/submission-count |  |
| [**getSubmissionPolicyOfExercise**](SubmissionPolicyResourceApi.md#getSubmissionPolicyOfExercise) | **GET** /api/programming-exercises/{exerciseId}/submission-policy |  |
| [**removeSubmissionPolicyFromProgrammingExercise**](SubmissionPolicyResourceApi.md#removeSubmissionPolicyFromProgrammingExercise) | **DELETE** /api/programming-exercises/{exerciseId}/submission-policy |  |
| [**toggleSubmissionPolicy**](SubmissionPolicyResourceApi.md#toggleSubmissionPolicy) | **PUT** /api/programming-exercises/{exerciseId}/submission-policy |  |
| [**updateSubmissionPolicy**](SubmissionPolicyResourceApi.md#updateSubmissionPolicy) | **PATCH** /api/programming-exercises/{exerciseId}/submission-policy |  |



## addSubmissionPolicyToProgrammingExercise

> GetSubmissionPolicyOfExercise200Response addSubmissionPolicyToProgrammingExercise(exerciseId, getSubmissionPolicyOfExercise200Response)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionPolicyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionPolicyResourceApi apiInstance = new SubmissionPolicyResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise200Response = new GetSubmissionPolicyOfExercise200Response(); // GetSubmissionPolicyOfExercise200Response | 
        try {
            GetSubmissionPolicyOfExercise200Response result = apiInstance.addSubmissionPolicyToProgrammingExercise(exerciseId, getSubmissionPolicyOfExercise200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionPolicyResourceApi#addSubmissionPolicyToProgrammingExercise");
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
| **getSubmissionPolicyOfExercise200Response** | [**GetSubmissionPolicyOfExercise200Response**](GetSubmissionPolicyOfExercise200Response.md)|  | |

### Return type

[**GetSubmissionPolicyOfExercise200Response**](GetSubmissionPolicyOfExercise200Response.md)

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


## getParticipationSubmissionCount

> Integer getParticipationSubmissionCount(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionPolicyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionPolicyResourceApi apiInstance = new SubmissionPolicyResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            Integer result = apiInstance.getParticipationSubmissionCount(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionPolicyResourceApi#getParticipationSubmissionCount");
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

**Integer**

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


## getSubmissionPolicyOfExercise

> GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionPolicyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionPolicyResourceApi apiInstance = new SubmissionPolicyResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            GetSubmissionPolicyOfExercise200Response result = apiInstance.getSubmissionPolicyOfExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionPolicyResourceApi#getSubmissionPolicyOfExercise");
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

[**GetSubmissionPolicyOfExercise200Response**](GetSubmissionPolicyOfExercise200Response.md)

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


## removeSubmissionPolicyFromProgrammingExercise

> removeSubmissionPolicyFromProgrammingExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionPolicyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionPolicyResourceApi apiInstance = new SubmissionPolicyResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.removeSubmissionPolicyFromProgrammingExercise(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionPolicyResourceApi#removeSubmissionPolicyFromProgrammingExercise");
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


## toggleSubmissionPolicy

> toggleSubmissionPolicy(exerciseId, activate)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionPolicyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionPolicyResourceApi apiInstance = new SubmissionPolicyResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean activate = true; // Boolean | 
        try {
            apiInstance.toggleSubmissionPolicy(exerciseId, activate);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionPolicyResourceApi#toggleSubmissionPolicy");
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
| **activate** | **Boolean**|  | |

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


## updateSubmissionPolicy

> GetSubmissionPolicyOfExercise200Response updateSubmissionPolicy(exerciseId, getSubmissionPolicyOfExercise200Response)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.SubmissionPolicyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubmissionPolicyResourceApi apiInstance = new SubmissionPolicyResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise200Response = new GetSubmissionPolicyOfExercise200Response(); // GetSubmissionPolicyOfExercise200Response | 
        try {
            GetSubmissionPolicyOfExercise200Response result = apiInstance.updateSubmissionPolicy(exerciseId, getSubmissionPolicyOfExercise200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmissionPolicyResourceApi#updateSubmissionPolicy");
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
| **getSubmissionPolicyOfExercise200Response** | [**GetSubmissionPolicyOfExercise200Response**](GetSubmissionPolicyOfExercise200Response.md)|  | |

### Return type

[**GetSubmissionPolicyOfExercise200Response**](GetSubmissionPolicyOfExercise200Response.md)

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

