# ExampleSubmissionResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExampleSubmission**](ExampleSubmissionResourceApi.md#createExampleSubmission) | **POST** /api/exercises/{exerciseId}/example-submissions |  |
| [**deleteExampleSubmission**](ExampleSubmissionResourceApi.md#deleteExampleSubmission) | **DELETE** /api/example-submissions/{exampleSubmissionId} |  |
| [**getExampleSubmission**](ExampleSubmissionResourceApi.md#getExampleSubmission) | **GET** /api/example-submissions/{exampleSubmissionId} |  |
| [**importExampleSubmission**](ExampleSubmissionResourceApi.md#importExampleSubmission) | **POST** /api/exercises/{exerciseId}/example-submissions/import/{sourceSubmissionId} |  |
| [**prepareExampleAssessment**](ExampleSubmissionResourceApi.md#prepareExampleAssessment) | **POST** /api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/prepare-assessment |  |
| [**updateExampleSubmission**](ExampleSubmissionResourceApi.md#updateExampleSubmission) | **PUT** /api/exercises/{exerciseId}/example-submissions |  |



## createExampleSubmission

> ExampleSubmission createExampleSubmission(exerciseId, exampleSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExampleSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExampleSubmissionResourceApi apiInstance = new ExampleSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ExampleSubmission exampleSubmission = new ExampleSubmission(); // ExampleSubmission | 
        try {
            ExampleSubmission result = apiInstance.createExampleSubmission(exerciseId, exampleSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExampleSubmissionResourceApi#createExampleSubmission");
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
| **exampleSubmission** | [**ExampleSubmission**](ExampleSubmission.md)|  | |

### Return type

[**ExampleSubmission**](ExampleSubmission.md)

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


## deleteExampleSubmission

> deleteExampleSubmission(exampleSubmissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExampleSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExampleSubmissionResourceApi apiInstance = new ExampleSubmissionResourceApi(defaultClient);
        Long exampleSubmissionId = 56L; // Long | 
        try {
            apiInstance.deleteExampleSubmission(exampleSubmissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExampleSubmissionResourceApi#deleteExampleSubmission");
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


## getExampleSubmission

> ExampleSubmission getExampleSubmission(exampleSubmissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExampleSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExampleSubmissionResourceApi apiInstance = new ExampleSubmissionResourceApi(defaultClient);
        Long exampleSubmissionId = 56L; // Long | 
        try {
            ExampleSubmission result = apiInstance.getExampleSubmission(exampleSubmissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExampleSubmissionResourceApi#getExampleSubmission");
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

### Return type

[**ExampleSubmission**](ExampleSubmission.md)

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


## importExampleSubmission

> ExampleSubmission importExampleSubmission(exerciseId, sourceSubmissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExampleSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExampleSubmissionResourceApi apiInstance = new ExampleSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long sourceSubmissionId = 56L; // Long | 
        try {
            ExampleSubmission result = apiInstance.importExampleSubmission(exerciseId, sourceSubmissionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExampleSubmissionResourceApi#importExampleSubmission");
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
| **sourceSubmissionId** | **Long**|  | |

### Return type

[**ExampleSubmission**](ExampleSubmission.md)

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


## prepareExampleAssessment

> prepareExampleAssessment(exerciseId, exampleSubmissionId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExampleSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExampleSubmissionResourceApi apiInstance = new ExampleSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exampleSubmissionId = 56L; // Long | 
        try {
            apiInstance.prepareExampleAssessment(exerciseId, exampleSubmissionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExampleSubmissionResourceApi#prepareExampleAssessment");
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
| **200** | OK |  -  |


## updateExampleSubmission

> ExampleSubmission updateExampleSubmission(exerciseId, exampleSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExampleSubmissionResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExampleSubmissionResourceApi apiInstance = new ExampleSubmissionResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ExampleSubmission exampleSubmission = new ExampleSubmission(); // ExampleSubmission | 
        try {
            ExampleSubmission result = apiInstance.updateExampleSubmission(exerciseId, exampleSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExampleSubmissionResourceApi#updateExampleSubmission");
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
| **exampleSubmission** | [**ExampleSubmission**](ExampleSubmission.md)|  | |

### Return type

[**ExampleSubmission**](ExampleSubmission.md)

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

