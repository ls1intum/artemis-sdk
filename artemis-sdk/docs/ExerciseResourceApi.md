# ExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExercise**](ExerciseResourceApi.md#getExercise) | **GET** /api/exercises/{exerciseId} |  |
| [**getExerciseDetails**](ExerciseResourceApi.md#getExerciseDetails) | **GET** /api/exercises/{exerciseId}/details |  |
| [**getExerciseForAssessmentDashboard**](ExerciseResourceApi.md#getExerciseForAssessmentDashboard) | **GET** /api/exercises/{exerciseId}/for-assessment-dashboard |  |
| [**getExerciseForExampleSolution**](ExerciseResourceApi.md#getExerciseForExampleSolution) | **GET** /api/exercises/{exerciseId}/example-solution |  |
| [**getExerciseTitle**](ExerciseResourceApi.md#getExerciseTitle) | **GET** /api/exercises/{exerciseId}/title |  |
| [**getLatestDueDate**](ExerciseResourceApi.md#getLatestDueDate) | **GET** /api/exercises/{exerciseId}/latest-due-date |  |
| [**getStatsForExerciseAssessmentDashboard**](ExerciseResourceApi.md#getStatsForExerciseAssessmentDashboard) | **GET** /api/exercises/{exerciseId}/stats-for-assessment-dashboard |  |
| [**reset1**](ExerciseResourceApi.md#reset1) | **DELETE** /api/exercises/{exerciseId}/reset |  |
| [**toggleSecondCorrectionEnabled**](ExerciseResourceApi.md#toggleSecondCorrectionEnabled) | **PUT** /api/exercises/{exerciseId}/toggle-second-correction |  |



## getExercise

> GetExercise200Response getExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            GetExercise200Response result = apiInstance.getExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getExercise");
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

[**GetExercise200Response**](GetExercise200Response.md)

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


## getExerciseDetails

> GetExercise200Response getExerciseDetails(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            GetExercise200Response result = apiInstance.getExerciseDetails(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getExerciseDetails");
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

[**GetExercise200Response**](GetExercise200Response.md)

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


## getExerciseForAssessmentDashboard

> GetExercise200Response getExerciseForAssessmentDashboard(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            GetExercise200Response result = apiInstance.getExerciseForAssessmentDashboard(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getExerciseForAssessmentDashboard");
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

[**GetExercise200Response**](GetExercise200Response.md)

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


## getExerciseForExampleSolution

> GetExercise200Response getExerciseForExampleSolution(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            GetExercise200Response result = apiInstance.getExerciseForExampleSolution(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getExerciseForExampleSolution");
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

[**GetExercise200Response**](GetExercise200Response.md)

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


## getExerciseTitle

> String getExerciseTitle(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            String result = apiInstance.getExerciseTitle(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getExerciseTitle");
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

**String**

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


## getLatestDueDate

> OffsetDateTime getLatestDueDate(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            OffsetDateTime result = apiInstance.getLatestDueDate(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getLatestDueDate");
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

[**OffsetDateTime**](OffsetDateTime.md)

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


## getStatsForExerciseAssessmentDashboard

> StatsForDashboardDTO getStatsForExerciseAssessmentDashboard(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            StatsForDashboardDTO result = apiInstance.getStatsForExerciseAssessmentDashboard(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#getStatsForExerciseAssessmentDashboard");
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

[**StatsForDashboardDTO**](StatsForDashboardDTO.md)

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


## reset1

> reset1(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.reset1(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#reset1");
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


## toggleSecondCorrectionEnabled

> Boolean toggleSecondCorrectionEnabled(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseResourceApi apiInstance = new ExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Boolean result = apiInstance.toggleSecondCorrectionEnabled(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseResourceApi#toggleSecondCorrectionEnabled");
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

**Boolean**

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

