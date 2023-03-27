# FileUploadExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFileUploadExercise**](FileUploadExerciseResourceApi.md#createFileUploadExercise) | **POST** /api/file-upload-exercises |  |
| [**deleteFileUploadExercise**](FileUploadExerciseResourceApi.md#deleteFileUploadExercise) | **DELETE** /api/file-upload-exercises/{exerciseId} |  |
| [**exportSubmissions2**](FileUploadExerciseResourceApi.md#exportSubmissions2) | **POST** /api/file-upload-exercises/{exerciseId}/export-submissions |  |
| [**getAllExercisesOnPage4**](FileUploadExerciseResourceApi.md#getAllExercisesOnPage4) | **GET** /api/file-upload-exercises |  |
| [**getFileUploadExercise**](FileUploadExerciseResourceApi.md#getFileUploadExercise) | **GET** /api/file-upload-exercises/{exerciseId} |  |
| [**getFileUploadExercisesForCourse**](FileUploadExerciseResourceApi.md#getFileUploadExercisesForCourse) | **GET** /api/courses/{courseId}/file-upload-exercises |  |
| [**importFileUploadExercise**](FileUploadExerciseResourceApi.md#importFileUploadExercise) | **POST** /api/file-upload-exercises/import/{sourceId} |  |
| [**reEvaluateAndUpdateFileUploadExercise**](FileUploadExerciseResourceApi.md#reEvaluateAndUpdateFileUploadExercise) | **PUT** /api/file-upload-exercises/{exerciseId}/re-evaluate |  |
| [**updateFileUploadExercise**](FileUploadExerciseResourceApi.md#updateFileUploadExercise) | **PUT** /api/file-upload-exercises/{exerciseId} |  |



## createFileUploadExercise

> FileUploadExercise createFileUploadExercise(fileUploadExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        FileUploadExercise fileUploadExercise = new FileUploadExercise(); // FileUploadExercise | 
        try {
            FileUploadExercise result = apiInstance.createFileUploadExercise(fileUploadExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#createFileUploadExercise");
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
| **fileUploadExercise** | [**FileUploadExercise**](FileUploadExercise.md)|  | |

### Return type

[**FileUploadExercise**](FileUploadExercise.md)

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


## deleteFileUploadExercise

> deleteFileUploadExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.deleteFileUploadExercise(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#deleteFileUploadExercise");
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


## exportSubmissions2

> File exportSubmissions2(exerciseId, submissionExportOptionsDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        SubmissionExportOptionsDTO submissionExportOptionsDTO = new SubmissionExportOptionsDTO(); // SubmissionExportOptionsDTO | 
        try {
            File result = apiInstance.exportSubmissions2(exerciseId, submissionExportOptionsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#exportSubmissions2");
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


## getAllExercisesOnPage4

> SearchResultPageDTOFileUploadExercise getAllExercisesOnPage4(search, isCourseFilter, isExamFilter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        Boolean isCourseFilter = true; // Boolean | 
        Boolean isExamFilter = true; // Boolean | 
        try {
            SearchResultPageDTOFileUploadExercise result = apiInstance.getAllExercisesOnPage4(search, isCourseFilter, isExamFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#getAllExercisesOnPage4");
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

[**SearchResultPageDTOFileUploadExercise**](SearchResultPageDTOFileUploadExercise.md)

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


## getFileUploadExercise

> FileUploadExercise getFileUploadExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            FileUploadExercise result = apiInstance.getFileUploadExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#getFileUploadExercise");
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

[**FileUploadExercise**](FileUploadExercise.md)

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


## getFileUploadExercisesForCourse

> List&lt;FileUploadExercise&gt; getFileUploadExercisesForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<FileUploadExercise> result = apiInstance.getFileUploadExercisesForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#getFileUploadExercisesForCourse");
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

[**List&lt;FileUploadExercise&gt;**](FileUploadExercise.md)

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


## importFileUploadExercise

> FileUploadExercise importFileUploadExercise(sourceId, fileUploadExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long sourceId = 56L; // Long | 
        FileUploadExercise fileUploadExercise = new FileUploadExercise(); // FileUploadExercise | 
        try {
            FileUploadExercise result = apiInstance.importFileUploadExercise(sourceId, fileUploadExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#importFileUploadExercise");
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
| **sourceId** | **Long**|  | |
| **fileUploadExercise** | [**FileUploadExercise**](FileUploadExercise.md)|  | |

### Return type

[**FileUploadExercise**](FileUploadExercise.md)

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


## reEvaluateAndUpdateFileUploadExercise

> FileUploadExercise reEvaluateAndUpdateFileUploadExercise(exerciseId, fileUploadExercise, deleteFeedback)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        FileUploadExercise fileUploadExercise = new FileUploadExercise(); // FileUploadExercise | 
        Boolean deleteFeedback = true; // Boolean | 
        try {
            FileUploadExercise result = apiInstance.reEvaluateAndUpdateFileUploadExercise(exerciseId, fileUploadExercise, deleteFeedback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#reEvaluateAndUpdateFileUploadExercise");
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
| **fileUploadExercise** | [**FileUploadExercise**](FileUploadExercise.md)|  | |
| **deleteFeedback** | **Boolean**|  | [optional] |

### Return type

[**FileUploadExercise**](FileUploadExercise.md)

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


## updateFileUploadExercise

> FileUploadExercise updateFileUploadExercise(exerciseId, fileUploadExercise, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileUploadExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileUploadExerciseResourceApi apiInstance = new FileUploadExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        FileUploadExercise fileUploadExercise = new FileUploadExercise(); // FileUploadExercise | 
        String notificationText = "notificationText_example"; // String | 
        try {
            FileUploadExercise result = apiInstance.updateFileUploadExercise(exerciseId, fileUploadExercise, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileUploadExerciseResourceApi#updateFileUploadExercise");
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
| **fileUploadExercise** | [**FileUploadExercise**](FileUploadExercise.md)|  | |
| **notificationText** | **String**|  | [optional] |

### Return type

[**FileUploadExercise**](FileUploadExercise.md)

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

