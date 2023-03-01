# QuizExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBatch**](QuizExerciseResourceApi.md#addBatch) | **PUT** /api/quiz-exercises/{quizExerciseId}/add-batch |  |
| [**createQuizExercise**](QuizExerciseResourceApi.md#createQuizExercise) | **POST** /api/quiz-exercises |  |
| [**deleteQuizExercise**](QuizExerciseResourceApi.md#deleteQuizExercise) | **DELETE** /api/quiz-exercises/{quizExerciseId} |  |
| [**getAllExercisesOnPage1**](QuizExerciseResourceApi.md#getAllExercisesOnPage1) | **GET** /api/quiz-exercises |  |
| [**getQuizExercise**](QuizExerciseResourceApi.md#getQuizExercise) | **GET** /api/quiz-exercises/{quizExerciseId} |  |
| [**getQuizExerciseForStudent**](QuizExerciseResourceApi.md#getQuizExerciseForStudent) | **GET** /api/quiz-exercises/{quizExerciseId}/for-student |  |
| [**getQuizExercisesForCourse**](QuizExerciseResourceApi.md#getQuizExercisesForCourse) | **GET** /api/courses/{courseId}/quiz-exercises |  |
| [**getQuizExercisesForExam**](QuizExerciseResourceApi.md#getQuizExercisesForExam) | **GET** /api/exams/{examId}/quiz-exercises |  |
| [**importExercise1**](QuizExerciseResourceApi.md#importExercise1) | **POST** /api/quiz-exercises/import/{sourceExerciseId} |  |
| [**joinBatch**](QuizExerciseResourceApi.md#joinBatch) | **POST** /api/quiz-exercises/{quizExerciseId}/join |  |
| [**performActionForQuizExercise**](QuizExerciseResourceApi.md#performActionForQuizExercise) | **PUT** /api/quiz-exercises/{quizExerciseId}/{action} |  |
| [**reEvaluateQuizExercise**](QuizExerciseResourceApi.md#reEvaluateQuizExercise) | **PUT** /api/quiz-exercises/{quizExerciseId}/re-evaluate |  |
| [**recalculateStatistics**](QuizExerciseResourceApi.md#recalculateStatistics) | **GET** /api/quiz-exercises/{quizExerciseId}/recalculate-statistics |  |
| [**startBatch**](QuizExerciseResourceApi.md#startBatch) | **PUT** /api/quiz-exercises/{quizBatchId}/start-batch |  |
| [**updateQuizExercise**](QuizExerciseResourceApi.md#updateQuizExercise) | **PUT** /api/quiz-exercises |  |



## addBatch

> QuizBatch addBatch(quizExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        try {
            QuizBatch result = apiInstance.addBatch(quizExerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#addBatch");
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
| **quizExerciseId** | **Long**|  | |

### Return type

[**QuizBatch**](QuizBatch.md)

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


## createQuizExercise

> QuizExercise createQuizExercise(quizExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        QuizExercise quizExercise = new QuizExercise(); // QuizExercise | 
        try {
            QuizExercise result = apiInstance.createQuizExercise(quizExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#createQuizExercise");
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
| **quizExercise** | [**QuizExercise**](QuizExercise.md)|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## deleteQuizExercise

> deleteQuizExercise(quizExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        try {
            apiInstance.deleteQuizExercise(quizExerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#deleteQuizExercise");
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
| **quizExerciseId** | **Long**|  | |

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


## getAllExercisesOnPage1

> SearchResultPageDTOQuizExercise getAllExercisesOnPage1(search, isCourseFilter, isExamFilter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        Boolean isCourseFilter = true; // Boolean | 
        Boolean isExamFilter = true; // Boolean | 
        try {
            SearchResultPageDTOQuizExercise result = apiInstance.getAllExercisesOnPage1(search, isCourseFilter, isExamFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#getAllExercisesOnPage1");
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

[**SearchResultPageDTOQuizExercise**](SearchResultPageDTOQuizExercise.md)

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


## getQuizExercise

> QuizExercise getQuizExercise(quizExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        try {
            QuizExercise result = apiInstance.getQuizExercise(quizExerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#getQuizExercise");
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
| **quizExerciseId** | **Long**|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## getQuizExerciseForStudent

> QuizExercise getQuizExerciseForStudent(quizExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        try {
            QuizExercise result = apiInstance.getQuizExerciseForStudent(quizExerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#getQuizExerciseForStudent");
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
| **quizExerciseId** | **Long**|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## getQuizExercisesForCourse

> List&lt;QuizExercise&gt; getQuizExercisesForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<QuizExercise> result = apiInstance.getQuizExercisesForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#getQuizExercisesForCourse");
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

[**List&lt;QuizExercise&gt;**](QuizExercise.md)

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


## getQuizExercisesForExam

> List&lt;QuizExercise&gt; getQuizExercisesForExam(examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long examId = 56L; // Long | 
        try {
            List<QuizExercise> result = apiInstance.getQuizExercisesForExam(examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#getQuizExercisesForExam");
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
| **examId** | **Long**|  | |

### Return type

[**List&lt;QuizExercise&gt;**](QuizExercise.md)

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


## importExercise1

> QuizExercise importExercise1(sourceExerciseId, quizExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long sourceExerciseId = 56L; // Long | 
        QuizExercise quizExercise = new QuizExercise(); // QuizExercise | 
        try {
            QuizExercise result = apiInstance.importExercise1(sourceExerciseId, quizExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#importExercise1");
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
| **quizExercise** | [**QuizExercise**](QuizExercise.md)|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## joinBatch

> QuizBatch joinBatch(quizExerciseId, quizBatchJoinDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        QuizBatchJoinDTO quizBatchJoinDTO = new QuizBatchJoinDTO(); // QuizBatchJoinDTO | 
        try {
            QuizBatch result = apiInstance.joinBatch(quizExerciseId, quizBatchJoinDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#joinBatch");
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
| **quizExerciseId** | **Long**|  | |
| **quizBatchJoinDTO** | [**QuizBatchJoinDTO**](QuizBatchJoinDTO.md)|  | |

### Return type

[**QuizBatch**](QuizBatch.md)

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


## performActionForQuizExercise

> QuizExercise performActionForQuizExercise(quizExerciseId, action)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        String action = "action_example"; // String | 
        try {
            QuizExercise result = apiInstance.performActionForQuizExercise(quizExerciseId, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#performActionForQuizExercise");
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
| **quizExerciseId** | **Long**|  | |
| **action** | **String**|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## reEvaluateQuizExercise

> QuizExercise reEvaluateQuizExercise(quizExerciseId, quizExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        QuizExercise quizExercise = new QuizExercise(); // QuizExercise | 
        try {
            QuizExercise result = apiInstance.reEvaluateQuizExercise(quizExerciseId, quizExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#reEvaluateQuizExercise");
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
| **quizExerciseId** | **Long**|  | |
| **quizExercise** | [**QuizExercise**](QuizExercise.md)|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## recalculateStatistics

> QuizExercise recalculateStatistics(quizExerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizExerciseId = 56L; // Long | 
        try {
            QuizExercise result = apiInstance.recalculateStatistics(quizExerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#recalculateStatistics");
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
| **quizExerciseId** | **Long**|  | |

### Return type

[**QuizExercise**](QuizExercise.md)

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


## startBatch

> QuizBatch startBatch(quizBatchId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        Long quizBatchId = 56L; // Long | 
        try {
            QuizBatch result = apiInstance.startBatch(quizBatchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#startBatch");
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
| **quizBatchId** | **Long**|  | |

### Return type

[**QuizBatch**](QuizBatch.md)

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


## updateQuizExercise

> QuizExercise updateQuizExercise(quizExercise, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.QuizExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        QuizExerciseResourceApi apiInstance = new QuizExerciseResourceApi(defaultClient);
        QuizExercise quizExercise = new QuizExercise(); // QuizExercise | 
        String notificationText = "notificationText_example"; // String | 
        try {
            QuizExercise result = apiInstance.updateQuizExercise(quizExercise, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuizExerciseResourceApi#updateQuizExercise");
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
| **quizExercise** | [**QuizExercise**](QuizExercise.md)|  | |
| **notificationText** | **String**|  | [optional] |

### Return type

[**QuizExercise**](QuizExercise.md)

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

