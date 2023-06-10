# AttachmentResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttachment**](AttachmentResourceApi.md#createAttachment) | **POST** /api/attachments |  |
| [**deleteAttachment**](AttachmentResourceApi.md#deleteAttachment) | **DELETE** /api/attachments/{attachmentId} |  |
| [**getAttachment**](AttachmentResourceApi.md#getAttachment) | **GET** /api/attachments/{id} |  |
| [**getAttachmentsForLecture**](AttachmentResourceApi.md#getAttachmentsForLecture) | **GET** /api/lectures/{lectureId}/attachments |  |
| [**updateAttachment**](AttachmentResourceApi.md#updateAttachment) | **PUT** /api/attachments/{attachmentId} |  |



## createAttachment

> Attachment createAttachment(attachment, _file)



### Example

```java
import java.io.File;
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentResourceApi apiInstance = new AttachmentResourceApi(defaultClient);
        Attachment attachment = new Attachment(); // Attachment | 
        File _file = new File("/path/to/file"); // File | 
        try {
            Attachment result = apiInstance.createAttachment(attachment, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentResourceApi#createAttachment");
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
| **attachment** | [**Attachment**](Attachment.md)|  | |
| **_file** | **File**|  | |

### Return type

[**Attachment**](Attachment.md)

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


## deleteAttachment

> deleteAttachment(attachmentId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentResourceApi apiInstance = new AttachmentResourceApi(defaultClient);
        Long attachmentId = 56L; // Long | 
        try {
            apiInstance.deleteAttachment(attachmentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentResourceApi#deleteAttachment");
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
| **attachmentId** | **Long**|  | |

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


## getAttachment

> Attachment getAttachment(id)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentResourceApi apiInstance = new AttachmentResourceApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            Attachment result = apiInstance.getAttachment(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentResourceApi#getAttachment");
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
| **id** | **Long**|  | |

### Return type

[**Attachment**](Attachment.md)

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


## getAttachmentsForLecture

> List&lt;Attachment&gt; getAttachmentsForLecture(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentResourceApi apiInstance = new AttachmentResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            List<Attachment> result = apiInstance.getAttachmentsForLecture(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentResourceApi#getAttachmentsForLecture");
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

[**List&lt;Attachment&gt;**](Attachment.md)

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


## updateAttachment

> Attachment updateAttachment(attachmentId, attachment, notificationText, _file)



### Example

```java
import java.io.File;
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentResourceApi apiInstance = new AttachmentResourceApi(defaultClient);
        Long attachmentId = 56L; // Long | 
        Attachment attachment = new Attachment(); // Attachment | 
        String notificationText = "notificationText_example"; // String | 
        File _file = new File("/path/to/file"); // File | 
        try {
            Attachment result = apiInstance.updateAttachment(attachmentId, attachment, notificationText, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentResourceApi#updateAttachment");
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
| **attachmentId** | **Long**|  | |
| **attachment** | [**Attachment**](Attachment.md)|  | |
| **notificationText** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**Attachment**](Attachment.md)

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

