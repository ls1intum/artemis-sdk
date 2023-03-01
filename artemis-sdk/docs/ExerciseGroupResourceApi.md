# ExerciseGroupResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExerciseGroup**](ExerciseGroupResourceApi.md#createExerciseGroup) | **POST** /api/courses/{courseId}/exams/{examId}/exerciseGroups |  |
| [**deleteExerciseGroup**](ExerciseGroupResourceApi.md#deleteExerciseGroup) | **DELETE** /api/courses/{courseId}/exams/{examId}/exerciseGroups/{exerciseGroupId} |  |
| [**getExerciseGroup**](ExerciseGroupResourceApi.md#getExerciseGroup) | **GET** /api/courses/{courseId}/exams/{examId}/exerciseGroups/{exerciseGroupId} |  |
| [**getExerciseGroupsForExam**](ExerciseGroupResourceApi.md#getExerciseGroupsForExam) | **GET** /api/courses/{courseId}/exams/{examId}/exerciseGroups |  |
| [**importExerciseGroup**](ExerciseGroupResourceApi.md#importExerciseGroup) | **POST** /api/courses/{courseId}/exams/{examId}/import-exercise-group |  |
| [**updateExerciseGroup**](ExerciseGroupResourceApi.md#updateExerciseGroup) | **PUT** /api/courses/{courseId}/exams/{examId}/exerciseGroups |  |



## createExerciseGroup

> ExerciseGroup createExerciseGroup(courseId, examId, exerciseGroup)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseGroupResourceApi apiInstance = new ExerciseGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        ExerciseGroup exerciseGroup = new ExerciseGroup(); // ExerciseGroup | 
        try {
            ExerciseGroup result = apiInstance.createExerciseGroup(courseId, examId, exerciseGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseGroupResourceApi#createExerciseGroup");
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
| **examId** | **Long**|  | |
| **exerciseGroup** | [**ExerciseGroup**](ExerciseGroup.md)|  | |

### Return type

[**ExerciseGroup**](ExerciseGroup.md)

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


## deleteExerciseGroup

> deleteExerciseGroup(courseId, examId, exerciseGroupId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseGroupResourceApi apiInstance = new ExerciseGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long exerciseGroupId = 56L; // Long | 
        Boolean deleteStudentReposBuildPlans = false; // Boolean | 
        Boolean deleteBaseReposBuildPlans = false; // Boolean | 
        try {
            apiInstance.deleteExerciseGroup(courseId, examId, exerciseGroupId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseGroupResourceApi#deleteExerciseGroup");
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
| **examId** | **Long**|  | |
| **exerciseGroupId** | **Long**|  | |
| **deleteStudentReposBuildPlans** | **Boolean**|  | [optional] [default to false] |
| **deleteBaseReposBuildPlans** | **Boolean**|  | [optional] [default to false] |

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


## getExerciseGroup

> ExerciseGroup getExerciseGroup(courseId, examId, exerciseGroupId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseGroupResourceApi apiInstance = new ExerciseGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long exerciseGroupId = 56L; // Long | 
        try {
            ExerciseGroup result = apiInstance.getExerciseGroup(courseId, examId, exerciseGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseGroupResourceApi#getExerciseGroup");
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
| **examId** | **Long**|  | |
| **exerciseGroupId** | **Long**|  | |

### Return type

[**ExerciseGroup**](ExerciseGroup.md)

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


## getExerciseGroupsForExam

> List&lt;ExerciseGroup&gt; getExerciseGroupsForExam(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseGroupResourceApi apiInstance = new ExerciseGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            List<ExerciseGroup> result = apiInstance.getExerciseGroupsForExam(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseGroupResourceApi#getExerciseGroupsForExam");
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
| **examId** | **Long**|  | |

### Return type

[**List&lt;ExerciseGroup&gt;**](ExerciseGroup.md)

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


## importExerciseGroup

> List&lt;ExerciseGroup&gt; importExerciseGroup(courseId, examId, exerciseGroup)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseGroupResourceApi apiInstance = new ExerciseGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        List<ExerciseGroup> exerciseGroup = Arrays.asList(); // List<ExerciseGroup> | 
        try {
            List<ExerciseGroup> result = apiInstance.importExerciseGroup(courseId, examId, exerciseGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseGroupResourceApi#importExerciseGroup");
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
| **examId** | **Long**|  | |
| **exerciseGroup** | [**List&lt;ExerciseGroup&gt;**](ExerciseGroup.md)|  | |

### Return type

[**List&lt;ExerciseGroup&gt;**](ExerciseGroup.md)

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


## updateExerciseGroup

> ExerciseGroup updateExerciseGroup(courseId, examId, exerciseGroup)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExerciseGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExerciseGroupResourceApi apiInstance = new ExerciseGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        ExerciseGroup exerciseGroup = new ExerciseGroup(); // ExerciseGroup | 
        try {
            ExerciseGroup result = apiInstance.updateExerciseGroup(courseId, examId, exerciseGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseGroupResourceApi#updateExerciseGroup");
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
| **examId** | **Long**|  | |
| **exerciseGroup** | [**ExerciseGroup**](ExerciseGroup.md)|  | |

### Return type

[**ExerciseGroup**](ExerciseGroup.md)

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

