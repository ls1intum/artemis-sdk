# ExamUserResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllWhoDidNotSign**](ExamUserResourceApi.md#getAllWhoDidNotSign) | **GET** /api/courses/{courseId}/exams/{examId}/verify-exam-users |  |
| [**saveUsersImages**](ExamUserResourceApi.md#saveUsersImages) | **POST** /api/courses/{courseId}/exams/{examId}/exam-users-save-images |  |
| [**updateExamUser**](ExamUserResourceApi.md#updateExamUser) | **POST** /api/courses/{courseId}/exams/{examId}/exam-users |  |



## getAllWhoDidNotSign

> Set&lt;ExamUserAttendanceCheckDTO&gt; getAllWhoDidNotSign(courseId, examId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamUserResourceApi apiInstance = new ExamUserResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        try {
            Set<ExamUserAttendanceCheckDTO> result = apiInstance.getAllWhoDidNotSign(courseId, examId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamUserResourceApi#getAllWhoDidNotSign");
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

[**Set&lt;ExamUserAttendanceCheckDTO&gt;**](ExamUserAttendanceCheckDTO.md)

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


## saveUsersImages

> ExamUsersNotFoundDTO saveUsersImages(courseId, examId, saveMarkdownFileRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamUserResourceApi apiInstance = new ExamUserResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        SaveMarkdownFileRequest saveMarkdownFileRequest = new SaveMarkdownFileRequest(); // SaveMarkdownFileRequest | 
        try {
            ExamUsersNotFoundDTO result = apiInstance.saveUsersImages(courseId, examId, saveMarkdownFileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamUserResourceApi#saveUsersImages");
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
| **saveMarkdownFileRequest** | [**SaveMarkdownFileRequest**](SaveMarkdownFileRequest.md)|  | [optional] |

### Return type

[**ExamUsersNotFoundDTO**](ExamUsersNotFoundDTO.md)

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


## updateExamUser

> ExamUser updateExamUser(courseId, examId, updateExamUserRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ExamUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ExamUserResourceApi apiInstance = new ExamUserResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        UpdateExamUserRequest updateExamUserRequest = new UpdateExamUserRequest(); // UpdateExamUserRequest | 
        try {
            ExamUser result = apiInstance.updateExamUser(courseId, examId, updateExamUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExamUserResourceApi#updateExamUser");
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
| **updateExamUserRequest** | [**UpdateExamUserRequest**](UpdateExamUserRequest.md)|  | [optional] |

### Return type

[**ExamUser**](ExamUser.md)

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

