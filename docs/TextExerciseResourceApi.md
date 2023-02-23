# TextExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkPlagiarism**](TextExerciseResourceApi.md#checkPlagiarism) | **GET** /api/text-exercises/{exerciseId}/check-plagiarism |  |
| [**createTextExercise**](TextExerciseResourceApi.md#createTextExercise) | **POST** /api/text-exercises |  |
| [**deleteTextExercise**](TextExerciseResourceApi.md#deleteTextExercise) | **DELETE** /api/text-exercises/{exerciseId} |  |
| [**exportSubmissions**](TextExerciseResourceApi.md#exportSubmissions) | **POST** /api/text-exercises/{exerciseId}/export-submissions |  |
| [**getAllExercisesOnPage**](TextExerciseResourceApi.md#getAllExercisesOnPage) | **GET** /api/text-exercises |  |
| [**getDataForTextEditor**](TextExerciseResourceApi.md#getDataForTextEditor) | **GET** /api/text-editor/{participationId} |  |
| [**getPlagiarismResult**](TextExerciseResourceApi.md#getPlagiarismResult) | **GET** /api/text-exercises/{exerciseId}/plagiarism-result |  |
| [**getTextExercise**](TextExerciseResourceApi.md#getTextExercise) | **GET** /api/text-exercises/{exerciseId} |  |
| [**getTextExercisesForCourse**](TextExerciseResourceApi.md#getTextExercisesForCourse) | **GET** /api/courses/{courseId}/text-exercises |  |
| [**importExercise**](TextExerciseResourceApi.md#importExercise) | **POST** /api/text-exercises/import/{sourceExerciseId} |  |
| [**reEvaluateAndUpdateTextExercise**](TextExerciseResourceApi.md#reEvaluateAndUpdateTextExercise) | **PUT** /api/text-exercises/{exerciseId}/re-evaluate |  |
| [**updateTextExercise**](TextExerciseResourceApi.md#updateTextExercise) | **PUT** /api/text-exercises |  |



## checkPlagiarism

> TextPlagiarismResult checkPlagiarism(exerciseId, similarityThreshold, minimumScore, minimumSize)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Float similarityThreshold = 3.4F; // Float | 
        Integer minimumScore = 56; // Integer | 
        Integer minimumSize = 56; // Integer | 
        try {
            TextPlagiarismResult result = apiInstance.checkPlagiarism(exerciseId, similarityThreshold, minimumScore, minimumSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#checkPlagiarism");
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

[**TextPlagiarismResult**](TextPlagiarismResult.md)

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


## createTextExercise

> TextExercise createTextExercise(textExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        TextExercise textExercise = new TextExercise(); // TextExercise | 
        try {
            TextExercise result = apiInstance.createTextExercise(textExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#createTextExercise");
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
| **textExercise** | [**TextExercise**](TextExercise.md)|  | |

### Return type

[**TextExercise**](TextExercise.md)

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


## deleteTextExercise

> deleteTextExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.deleteTextExercise(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#deleteTextExercise");
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


## exportSubmissions

> File exportSubmissions(exerciseId, submissionExportOptionsDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        SubmissionExportOptionsDTO submissionExportOptionsDTO = new SubmissionExportOptionsDTO(); // SubmissionExportOptionsDTO | 
        try {
            File result = apiInstance.exportSubmissions(exerciseId, submissionExportOptionsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#exportSubmissions");
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


## getAllExercisesOnPage

> SearchResultPageDTOTextExercise getAllExercisesOnPage(search, isCourseFilter, isExamFilter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        Boolean isCourseFilter = true; // Boolean | 
        Boolean isExamFilter = true; // Boolean | 
        try {
            SearchResultPageDTOTextExercise result = apiInstance.getAllExercisesOnPage(search, isCourseFilter, isExamFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#getAllExercisesOnPage");
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

[**SearchResultPageDTOTextExercise**](SearchResultPageDTOTextExercise.md)

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


## getDataForTextEditor

> StudentParticipation getDataForTextEditor(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            StudentParticipation result = apiInstance.getDataForTextEditor(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#getDataForTextEditor");
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

[**StudentParticipation**](StudentParticipation.md)

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


## getPlagiarismResult

> TextPlagiarismResult getPlagiarismResult(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            TextPlagiarismResult result = apiInstance.getPlagiarismResult(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#getPlagiarismResult");
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

[**TextPlagiarismResult**](TextPlagiarismResult.md)

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


## getTextExercise

> TextExercise getTextExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            TextExercise result = apiInstance.getTextExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#getTextExercise");
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

[**TextExercise**](TextExercise.md)

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


## getTextExercisesForCourse

> List&lt;TextExercise&gt; getTextExercisesForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<TextExercise> result = apiInstance.getTextExercisesForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#getTextExercisesForCourse");
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

[**List&lt;TextExercise&gt;**](TextExercise.md)

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


## importExercise

> TextExercise importExercise(sourceExerciseId, textExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long sourceExerciseId = 56L; // Long | 
        TextExercise textExercise = new TextExercise(); // TextExercise | 
        try {
            TextExercise result = apiInstance.importExercise(sourceExerciseId, textExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#importExercise");
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
| **textExercise** | [**TextExercise**](TextExercise.md)|  | |

### Return type

[**TextExercise**](TextExercise.md)

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


## reEvaluateAndUpdateTextExercise

> TextExercise reEvaluateAndUpdateTextExercise(exerciseId, textExercise, deleteFeedback)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        TextExercise textExercise = new TextExercise(); // TextExercise | 
        Boolean deleteFeedback = true; // Boolean | 
        try {
            TextExercise result = apiInstance.reEvaluateAndUpdateTextExercise(exerciseId, textExercise, deleteFeedback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#reEvaluateAndUpdateTextExercise");
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
| **textExercise** | [**TextExercise**](TextExercise.md)|  | |
| **deleteFeedback** | **Boolean**|  | [optional] |

### Return type

[**TextExercise**](TextExercise.md)

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


## updateTextExercise

> TextExercise updateTextExercise(textExercise, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextExerciseResourceApi apiInstance = new TextExerciseResourceApi(defaultClient);
        TextExercise textExercise = new TextExercise(); // TextExercise | 
        String notificationText = "notificationText_example"; // String | 
        try {
            TextExercise result = apiInstance.updateTextExercise(textExercise, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextExerciseResourceApi#updateTextExercise");
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
| **textExercise** | [**TextExercise**](TextExercise.md)|  | |
| **notificationText** | **String**|  | [optional] |

### Return type

[**TextExercise**](TextExercise.md)

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

