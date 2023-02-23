# ExerciseHintResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateExerciseHint**](ExerciseHintResourceApi.md#activateExerciseHint) | **POST** /api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}/activate |  |
| [**createExerciseHint**](ExerciseHintResourceApi.md#createExerciseHint) | **POST** /api/programming-exercises/{exerciseId}/exercise-hints |  |
| [**deleteExerciseHint**](ExerciseHintResourceApi.md#deleteExerciseHint) | **DELETE** /api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId} |  |
| [**getActivatedExerciseHintsForExercise**](ExerciseHintResourceApi.md#getActivatedExerciseHintsForExercise) | **GET** /api/programming-exercises/{exerciseId}/exercise-hints/activated |  |
| [**getAvailableExerciseHintsForExercise**](ExerciseHintResourceApi.md#getAvailableExerciseHintsForExercise) | **GET** /api/programming-exercises/{exerciseId}/exercise-hints/available |  |
| [**getExerciseHint**](ExerciseHintResourceApi.md#getExerciseHint) | **GET** /api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId} |  |
| [**getExerciseHintsForExercise**](ExerciseHintResourceApi.md#getExerciseHintsForExercise) | **GET** /api/programming-exercises/{exerciseId}/exercise-hints |  |
| [**getHintTitle**](ExerciseHintResourceApi.md#getHintTitle) | **GET** /api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}/title |  |
| [**rateExerciseHint**](ExerciseHintResourceApi.md#rateExerciseHint) | **POST** /api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}/rating/{ratingValue} |  |
| [**updateExerciseHint**](ExerciseHintResourceApi.md#updateExerciseHint) | **PUT** /api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId} |  |



## activateExerciseHint

> GetExerciseHint200Response activateExerciseHint(exerciseId, exerciseHintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exerciseHintId = 56L; // Long | 
        try {
            GetExerciseHint200Response result = apiInstance.activateExerciseHint(exerciseId, exerciseHintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#activateExerciseHint");
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
| **exerciseHintId** | **Long**|  | |

### Return type

[**GetExerciseHint200Response**](GetExerciseHint200Response.md)

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


## createExerciseHint

> GetExerciseHint200Response createExerciseHint(exerciseId, getExerciseHint200Response)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        GetExerciseHint200Response getExerciseHint200Response = new GetExerciseHint200Response(); // GetExerciseHint200Response | 
        try {
            GetExerciseHint200Response result = apiInstance.createExerciseHint(exerciseId, getExerciseHint200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#createExerciseHint");
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
| **getExerciseHint200Response** | [**GetExerciseHint200Response**](GetExerciseHint200Response.md)|  | |

### Return type

[**GetExerciseHint200Response**](GetExerciseHint200Response.md)

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


## deleteExerciseHint

> deleteExerciseHint(exerciseId, exerciseHintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exerciseHintId = 56L; // Long | 
        try {
            apiInstance.deleteExerciseHint(exerciseId, exerciseHintId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#deleteExerciseHint");
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
| **exerciseHintId** | **Long**|  | |

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


## getActivatedExerciseHintsForExercise

> Set&lt;GetExerciseHint200Response&gt; getActivatedExerciseHintsForExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<GetExerciseHint200Response> result = apiInstance.getActivatedExerciseHintsForExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#getActivatedExerciseHintsForExercise");
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

[**Set&lt;GetExerciseHint200Response&gt;**](GetExerciseHint200Response.md)

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


## getAvailableExerciseHintsForExercise

> Set&lt;GetExerciseHint200Response&gt; getAvailableExerciseHintsForExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<GetExerciseHint200Response> result = apiInstance.getAvailableExerciseHintsForExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#getAvailableExerciseHintsForExercise");
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

[**Set&lt;GetExerciseHint200Response&gt;**](GetExerciseHint200Response.md)

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


## getExerciseHint

> GetExerciseHint200Response getExerciseHint(exerciseId, exerciseHintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exerciseHintId = 56L; // Long | 
        try {
            GetExerciseHint200Response result = apiInstance.getExerciseHint(exerciseId, exerciseHintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#getExerciseHint");
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
| **exerciseHintId** | **Long**|  | |

### Return type

[**GetExerciseHint200Response**](GetExerciseHint200Response.md)

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


## getExerciseHintsForExercise

> Set&lt;GetExerciseHint200Response&gt; getExerciseHintsForExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<GetExerciseHint200Response> result = apiInstance.getExerciseHintsForExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#getExerciseHintsForExercise");
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

[**Set&lt;GetExerciseHint200Response&gt;**](GetExerciseHint200Response.md)

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


## getHintTitle

> String getHintTitle(exerciseId, exerciseHintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exerciseHintId = 56L; // Long | 
        try {
            String result = apiInstance.getHintTitle(exerciseId, exerciseHintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#getHintTitle");
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
| **exerciseHintId** | **Long**|  | |

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


## rateExerciseHint

> rateExerciseHint(exerciseId, exerciseHintId, ratingValue)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long exerciseHintId = 56L; // Long | 
        Integer ratingValue = 56; // Integer | 
        try {
            apiInstance.rateExerciseHint(exerciseId, exerciseHintId, ratingValue);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#rateExerciseHint");
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
| **exerciseHintId** | **Long**|  | |
| **ratingValue** | **Integer**|  | |

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


## updateExerciseHint

> GetExerciseHint200Response updateExerciseHint(exerciseHintId, exerciseId, getExerciseHint200Response)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseHintResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseHintResourceApi apiInstance = new ExerciseHintResourceApi(defaultClient);
        Long exerciseHintId = 56L; // Long | 
        Long exerciseId = 56L; // Long | 
        GetExerciseHint200Response getExerciseHint200Response = new GetExerciseHint200Response(); // GetExerciseHint200Response | 
        try {
            GetExerciseHint200Response result = apiInstance.updateExerciseHint(exerciseHintId, exerciseId, getExerciseHint200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseHintResourceApi#updateExerciseHint");
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
| **exerciseHintId** | **Long**|  | |
| **exerciseId** | **Long**|  | |
| **getExerciseHint200Response** | [**GetExerciseHint200Response**](GetExerciseHint200Response.md)|  | |

### Return type

[**GetExerciseHint200Response**](GetExerciseHint200Response.md)

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

