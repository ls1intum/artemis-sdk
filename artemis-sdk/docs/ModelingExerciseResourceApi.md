# ModelingExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkPlagiarism2**](ModelingExerciseResourceApi.md#checkPlagiarism2) | **GET** /api/modeling-exercises/{exerciseId}/check-plagiarism |  |
| [**createModelingExercise**](ModelingExerciseResourceApi.md#createModelingExercise) | **POST** /api/modeling-exercises |  |
| [**deleteModelingExercise**](ModelingExerciseResourceApi.md#deleteModelingExercise) | **DELETE** /api/modeling-exercises/{exerciseId} |  |
| [**exportSubmissions1**](ModelingExerciseResourceApi.md#exportSubmissions1) | **POST** /api/modeling-exercises/{exerciseId}/export-submissions |  |
| [**getAllExercisesOnPage3**](ModelingExerciseResourceApi.md#getAllExercisesOnPage3) | **GET** /api/modeling-exercises |  |
| [**getModelingExercise**](ModelingExerciseResourceApi.md#getModelingExercise) | **GET** /api/modeling-exercises/{exerciseId} |  |
| [**getModelingExercisesForCourse**](ModelingExerciseResourceApi.md#getModelingExercisesForCourse) | **GET** /api/courses/{courseId}/modeling-exercises |  |
| [**getPlagiarismResult2**](ModelingExerciseResourceApi.md#getPlagiarismResult2) | **GET** /api/modeling-exercises/{exerciseId}/plagiarism-result |  |
| [**importExercise2**](ModelingExerciseResourceApi.md#importExercise2) | **POST** /api/modeling-exercises/import/{sourceExerciseId} |  |
| [**reEvaluateAndUpdateModelingExercise**](ModelingExerciseResourceApi.md#reEvaluateAndUpdateModelingExercise) | **PUT** /api/modeling-exercises/{exerciseId}/re-evaluate |  |
| [**updateModelingExercise**](ModelingExerciseResourceApi.md#updateModelingExercise) | **PUT** /api/modeling-exercises |  |



## checkPlagiarism2

> ModelingPlagiarismResult checkPlagiarism2(exerciseId, similarityThreshold, minimumScore, minimumSize)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Float similarityThreshold = 3.4F; // Float | 
        Integer minimumScore = 56; // Integer | 
        Integer minimumSize = 56; // Integer | 
        try {
            ModelingPlagiarismResult result = apiInstance.checkPlagiarism2(exerciseId, similarityThreshold, minimumScore, minimumSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#checkPlagiarism2");
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
| **similarityThreshold** | **Float**|  | |
| **minimumScore** | **Integer**|  | |
| **minimumSize** | **Integer**|  | |

### Return type

[**ModelingPlagiarismResult**](ModelingPlagiarismResult.md)

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


## createModelingExercise

> ModelingExercise createModelingExercise(modelingExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        ModelingExercise modelingExercise = new ModelingExercise(); // ModelingExercise | 
        try {
            ModelingExercise result = apiInstance.createModelingExercise(modelingExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#createModelingExercise");
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
| **modelingExercise** | [**ModelingExercise**](ModelingExercise.md)|  | |

### Return type

[**ModelingExercise**](ModelingExercise.md)

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


## deleteModelingExercise

> deleteModelingExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.deleteModelingExercise(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#deleteModelingExercise");
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


## exportSubmissions1

> File exportSubmissions1(exerciseId, submissionExportOptionsDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        SubmissionExportOptionsDTO submissionExportOptionsDTO = new SubmissionExportOptionsDTO(); // SubmissionExportOptionsDTO | 
        try {
            File result = apiInstance.exportSubmissions1(exerciseId, submissionExportOptionsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#exportSubmissions1");
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
| **submissionExportOptionsDTO** | [**SubmissionExportOptionsDTO**](SubmissionExportOptionsDTO.md)|  | |

### Return type

[**File**](File.md)

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


## getAllExercisesOnPage3

> SearchResultPageDTOModelingExercise getAllExercisesOnPage3(search, isCourseFilter, isExamFilter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        Boolean isCourseFilter = true; // Boolean | 
        Boolean isExamFilter = true; // Boolean | 
        try {
            SearchResultPageDTOModelingExercise result = apiInstance.getAllExercisesOnPage3(search, isCourseFilter, isExamFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#getAllExercisesOnPage3");
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
| **search** | [**PageableSearchDTOString**](PageableSearchDTOString.md)|  | |
| **isCourseFilter** | **Boolean**|  | [optional] [default to true] |
| **isExamFilter** | **Boolean**|  | [optional] [default to true] |

### Return type

[**SearchResultPageDTOModelingExercise**](SearchResultPageDTOModelingExercise.md)

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


## getModelingExercise

> ModelingExercise getModelingExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ModelingExercise result = apiInstance.getModelingExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#getModelingExercise");
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

[**ModelingExercise**](ModelingExercise.md)

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


## getModelingExercisesForCourse

> List&lt;ModelingExercise&gt; getModelingExercisesForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<ModelingExercise> result = apiInstance.getModelingExercisesForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#getModelingExercisesForCourse");
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
| **courseId** | **Long**|  | |

### Return type

[**List&lt;ModelingExercise&gt;**](ModelingExercise.md)

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


## getPlagiarismResult2

> ModelingPlagiarismResult getPlagiarismResult2(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ModelingPlagiarismResult result = apiInstance.getPlagiarismResult2(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#getPlagiarismResult2");
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

[**ModelingPlagiarismResult**](ModelingPlagiarismResult.md)

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


## importExercise2

> ModelingExercise importExercise2(sourceExerciseId, modelingExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long sourceExerciseId = 56L; // Long | 
        ModelingExercise modelingExercise = new ModelingExercise(); // ModelingExercise | 
        try {
            ModelingExercise result = apiInstance.importExercise2(sourceExerciseId, modelingExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#importExercise2");
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
| **sourceExerciseId** | **Long**|  | |
| **modelingExercise** | [**ModelingExercise**](ModelingExercise.md)|  | |

### Return type

[**ModelingExercise**](ModelingExercise.md)

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


## reEvaluateAndUpdateModelingExercise

> ModelingExercise reEvaluateAndUpdateModelingExercise(exerciseId, modelingExercise, deleteFeedback)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ModelingExercise modelingExercise = new ModelingExercise(); // ModelingExercise | 
        Boolean deleteFeedback = true; // Boolean | 
        try {
            ModelingExercise result = apiInstance.reEvaluateAndUpdateModelingExercise(exerciseId, modelingExercise, deleteFeedback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#reEvaluateAndUpdateModelingExercise");
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
| **modelingExercise** | [**ModelingExercise**](ModelingExercise.md)|  | |
| **deleteFeedback** | **Boolean**|  | [optional] |

### Return type

[**ModelingExercise**](ModelingExercise.md)

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


## updateModelingExercise

> ModelingExercise updateModelingExercise(modelingExercise, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ModelingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ModelingExerciseResourceApi apiInstance = new ModelingExerciseResourceApi(defaultClient);
        ModelingExercise modelingExercise = new ModelingExercise(); // ModelingExercise | 
        String notificationText = "notificationText_example"; // String | 
        try {
            ModelingExercise result = apiInstance.updateModelingExercise(modelingExercise, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelingExerciseResourceApi#updateModelingExercise");
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
| **modelingExercise** | [**ModelingExercise**](ModelingExercise.md)|  | |
| **notificationText** | **String**|  | [optional] |

### Return type

[**ModelingExercise**](ModelingExercise.md)

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

