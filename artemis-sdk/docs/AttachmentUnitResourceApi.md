# AttachmentUnitResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttachmentUnit**](AttachmentUnitResourceApi.md#createAttachmentUnit) | **POST** /api/lectures/{lectureId}/attachment-units |  |
| [**createAttachmentUnits**](AttachmentUnitResourceApi.md#createAttachmentUnits) | **POST** /api/lectures/{lectureId}/attachment-units/split |  |
| [**getAttachmentUnit**](AttachmentUnitResourceApi.md#getAttachmentUnit) | **GET** /api/lectures/{lectureId}/attachment-units/{attachmentUnitId} |  |
| [**getAttachmentUnitsData**](AttachmentUnitResourceApi.md#getAttachmentUnitsData) | **POST** /api/lectures/{lectureId}/process-units |  |
| [**updateAttachmentUnit**](AttachmentUnitResourceApi.md#updateAttachmentUnit) | **PUT** /api/lectures/{lectureId}/attachment-units/{attachmentUnitId} |  |



## createAttachmentUnit

> AttachmentUnit createAttachmentUnit(lectureId, attachmentUnit, attachment, _file, keepFilename)



### Example

```java
import java.io.File;
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentUnitResourceApi apiInstance = new AttachmentUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        AttachmentUnit attachmentUnit = new AttachmentUnit(); // AttachmentUnit | 
        Attachment attachment = new Attachment(); // Attachment | 
        File _file = new File("/path/to/file"); // File | 
        Boolean keepFilename = false; // Boolean | 
        try {
            AttachmentUnit result = apiInstance.createAttachmentUnit(lectureId, attachmentUnit, attachment, _file, keepFilename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentUnitResourceApi#createAttachmentUnit");
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
| **attachmentUnit** | [**AttachmentUnit**](AttachmentUnit.md)|  | |
| **attachment** | [**Attachment**](Attachment.md)|  | |
| **_file** | **File**|  | |
| **keepFilename** | **Boolean**|  | [optional] [default to false] |

### Return type

[**AttachmentUnit**](AttachmentUnit.md)

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


## createAttachmentUnits

> List&lt;AttachmentUnit&gt; createAttachmentUnits(lectureId, createAttachmentUnitsRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentUnitResourceApi apiInstance = new AttachmentUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        CreateAttachmentUnitsRequest createAttachmentUnitsRequest = new CreateAttachmentUnitsRequest(); // CreateAttachmentUnitsRequest | 
        try {
            List<AttachmentUnit> result = apiInstance.createAttachmentUnits(lectureId, createAttachmentUnitsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentUnitResourceApi#createAttachmentUnits");
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
| **createAttachmentUnitsRequest** | [**CreateAttachmentUnitsRequest**](CreateAttachmentUnitsRequest.md)|  | [optional] |

### Return type

[**List&lt;AttachmentUnit&gt;**](AttachmentUnit.md)

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


## getAttachmentUnit

> AttachmentUnit getAttachmentUnit(attachmentUnitId, lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentUnitResourceApi apiInstance = new AttachmentUnitResourceApi(defaultClient);
        Long attachmentUnitId = 56L; // Long | 
        Long lectureId = 56L; // Long | 
        try {
            AttachmentUnit result = apiInstance.getAttachmentUnit(attachmentUnitId, lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentUnitResourceApi#getAttachmentUnit");
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
| **lectureId** | **Long**|  | |

### Return type

[**AttachmentUnit**](AttachmentUnit.md)

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


## getAttachmentUnitsData

> LectureUnitInformationDTO getAttachmentUnitsData(lectureId, saveMarkdownFileRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentUnitResourceApi apiInstance = new AttachmentUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        SaveMarkdownFileRequest saveMarkdownFileRequest = new SaveMarkdownFileRequest(); // SaveMarkdownFileRequest | 
        try {
            LectureUnitInformationDTO result = apiInstance.getAttachmentUnitsData(lectureId, saveMarkdownFileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentUnitResourceApi#getAttachmentUnitsData");
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
| **saveMarkdownFileRequest** | [**SaveMarkdownFileRequest**](SaveMarkdownFileRequest.md)|  | [optional] |

### Return type

[**LectureUnitInformationDTO**](LectureUnitInformationDTO.md)

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


## updateAttachmentUnit

> AttachmentUnit updateAttachmentUnit(lectureId, attachmentUnitId, attachmentUnit, attachment, keepFilename, notificationText, _file)



### Example

```java
import java.io.File;
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AttachmentUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AttachmentUnitResourceApi apiInstance = new AttachmentUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        Long attachmentUnitId = 56L; // Long | 
        AttachmentUnit attachmentUnit = new AttachmentUnit(); // AttachmentUnit | 
        Attachment attachment = new Attachment(); // Attachment | 
        Boolean keepFilename = false; // Boolean | 
        String notificationText = "notificationText_example"; // String | 
        File _file = new File("/path/to/file"); // File | 
        try {
            AttachmentUnit result = apiInstance.updateAttachmentUnit(lectureId, attachmentUnitId, attachmentUnit, attachment, keepFilename, notificationText, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentUnitResourceApi#updateAttachmentUnit");
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
| **attachmentUnitId** | **Long**|  | |
| **attachmentUnit** | [**AttachmentUnit**](AttachmentUnit.md)|  | |
| **attachment** | [**Attachment**](Attachment.md)|  | |
| **keepFilename** | **Boolean**|  | [optional] [default to false] |
| **notificationText** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**AttachmentUnit**](AttachmentUnit.md)

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

