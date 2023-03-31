# FileResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttachmentUnitAttachment**](FileResourceApi.md#getAttachmentUnitAttachment) | **GET** /api/files/attachments/attachment-unit/{attachmentUnitId}/{filename} |  |
| [**getCourseIcon**](FileResourceApi.md#getCourseIcon) | **GET** /api/files/course/icons/{courseId}/{filename} |  |
| [**getDragAndDropBackgroundFile**](FileResourceApi.md#getDragAndDropBackgroundFile) | **GET** /api/files/drag-and-drop/backgrounds/{questionId}/{filename} |  |
| [**getDragItemFile**](FileResourceApi.md#getDragItemFile) | **GET** /api/files/drag-and-drop/drag-items/{dragItemId}/{filename} |  |
| [**getExamUserImage**](FileResourceApi.md#getExamUserImage) | **GET** /api/files/exam-user/{examUserId}/{filename} |  |
| [**getFileUploadSubmission**](FileResourceApi.md#getFileUploadSubmission) | **GET** /api/files/file-upload-exercises/{exerciseId}/submissions/{submissionId}/{filename} |  |
| [**getLectureAttachment**](FileResourceApi.md#getLectureAttachment) | **GET** /api/files/attachments/lecture/{lectureId}/{filename} |  |
| [**getLecturePdfAttachmentsMerged**](FileResourceApi.md#getLecturePdfAttachmentsMerged) | **GET** /api/files/attachments/lecture/{lectureId}/merge-pdf |  |
| [**getMarkdownFile**](FileResourceApi.md#getMarkdownFile) | **GET** /api/files/markdown/{filename} |  |
| [**getTempFile**](FileResourceApi.md#getTempFile) | **GET** /api/files/temp/{filename} |  |
| [**getTemplateFile**](FileResourceApi.md#getTemplateFile) | **GET** /api/files/templates/{language}/{projectType}/{filename} |  |
| [**getTemplateFile1**](FileResourceApi.md#getTemplateFile1) | **GET** /api/files/templates/{language}/{filename} |  |
| [**getTemplateFile2**](FileResourceApi.md#getTemplateFile2) | **GET** /api/files/templates/{filename} |  |
| [**getUserSignature**](FileResourceApi.md#getUserSignature) | **GET** /api/files/exam-user/signatures/{examUserId}/{filename} |  |
| [**saveFile**](FileResourceApi.md#saveFile) | **POST** /api/fileUpload |  |
| [**saveMarkdownFile**](FileResourceApi.md#saveMarkdownFile) | **POST** /api/markdown-file-upload |  |



## getAttachmentUnitAttachment

> List&lt;byte[]&gt; getAttachmentUnitAttachment(attachmentUnitId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long attachmentUnitId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getAttachmentUnitAttachment(attachmentUnitId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getAttachmentUnitAttachment");
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
| **attachmentUnitId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getCourseIcon

> List&lt;byte[]&gt; getCourseIcon(courseId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getCourseIcon(courseId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getCourseIcon");
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
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getDragAndDropBackgroundFile

> List&lt;byte[]&gt; getDragAndDropBackgroundFile(questionId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long questionId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getDragAndDropBackgroundFile(questionId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getDragAndDropBackgroundFile");
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
| **questionId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getDragItemFile

> List&lt;byte[]&gt; getDragItemFile(dragItemId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long dragItemId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getDragItemFile(dragItemId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getDragItemFile");
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
| **dragItemId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getExamUserImage

> List&lt;byte[]&gt; getExamUserImage(examUserId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long examUserId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getExamUserImage(examUserId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getExamUserImage");
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
| **examUserId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getFileUploadSubmission

> List&lt;byte[]&gt; getFileUploadSubmission(exerciseId, submissionId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long submissionId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getFileUploadSubmission(exerciseId, submissionId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getFileUploadSubmission");
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
| **submissionId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getLectureAttachment

> List&lt;byte[]&gt; getLectureAttachment(lectureId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getLectureAttachment(lectureId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getLectureAttachment");
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
| **lectureId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getLecturePdfAttachmentsMerged

> List&lt;byte[]&gt; getLecturePdfAttachmentsMerged(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            List<byte[]> result = apiInstance.getLecturePdfAttachmentsMerged(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getLecturePdfAttachmentsMerged");
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
| **lectureId** | **Long**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getMarkdownFile

> List&lt;byte[]&gt; getMarkdownFile(filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getMarkdownFile(filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getMarkdownFile");
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
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getTempFile

> List&lt;byte[]&gt; getTempFile(filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getTempFile(filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getTempFile");
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
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getTemplateFile

> List&lt;byte[]&gt; getTemplateFile(language, projectType, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        String language = "JAVA"; // String | 
        String projectType = "MAVEN_MAVEN"; // String | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getTemplateFile(language, projectType, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getTemplateFile");
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
| **language** | **String**|  | [enum: JAVA, PYTHON, C, HASKELL, KOTLIN, VHDL, ASSEMBLER, SWIFT, OCAML, EMPTY] |
| **projectType** | **String**|  | [enum: MAVEN_MAVEN, PLAIN_MAVEN, PLAIN, XCODE, FACT, GCC, PLAIN_GRADLE, GRADLE_GRADLE] |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getTemplateFile1

> List&lt;byte[]&gt; getTemplateFile1(language, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        String language = "JAVA"; // String | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getTemplateFile1(language, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getTemplateFile1");
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
| **language** | **String**|  | [enum: JAVA, PYTHON, C, HASKELL, KOTLIN, VHDL, ASSEMBLER, SWIFT, OCAML, EMPTY] |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getTemplateFile2

> List&lt;byte[]&gt; getTemplateFile2(filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getTemplateFile2(filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getTemplateFile2");
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
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## getUserSignature

> List&lt;byte[]&gt; getUserSignature(examUserId, filename)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Long examUserId = 56L; // Long | 
        String filename = "filename_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getUserSignature(examUserId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#getUserSignature");
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
| **examUserId** | **Long**|  | |
| **filename** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

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


## saveFile

> String saveFile(_file, keepFileName)



### Example

```java
import java.io.File;
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        File _file = new File("/path/to/file"); // File | 
        Boolean keepFileName = false; // Boolean | 
        try {
            String result = apiInstance.saveFile(_file, keepFileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#saveFile");
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
| **_file** | **File**|  | |
| **keepFileName** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## saveMarkdownFile

> String saveMarkdownFile(keepFileName, saveMarkdownFileRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.FileResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        FileResourceApi apiInstance = new FileResourceApi(defaultClient);
        Boolean keepFileName = false; // Boolean | 
        SaveMarkdownFileRequest saveMarkdownFileRequest = new SaveMarkdownFileRequest(); // SaveMarkdownFileRequest | 
        try {
            String result = apiInstance.saveMarkdownFile(keepFileName, saveMarkdownFileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileResourceApi#saveMarkdownFile");
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
| **keepFileName** | **Boolean**|  | [optional] [default to false] |
| **saveMarkdownFileRequest** | [**SaveMarkdownFileRequest**](SaveMarkdownFileRequest.md)|  | [optional] |

### Return type

**String**

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

