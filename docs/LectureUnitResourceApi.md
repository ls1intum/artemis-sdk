# LectureUnitResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeLectureUnit**](LectureUnitResourceApi.md#completeLectureUnit) | **POST** /api/lectures/{lectureId}/lecture-units/{lectureUnitId}/completion |  |
| [**deleteLectureUnit**](LectureUnitResourceApi.md#deleteLectureUnit) | **DELETE** /api/lectures/{lectureId}/lecture-units/{lectureUnitId} |  |
| [**updateLectureUnitsOrder**](LectureUnitResourceApi.md#updateLectureUnitsOrder) | **PUT** /api/lectures/{lectureId}/lecture-units-order |  |



## completeLectureUnit

> completeLectureUnit(lectureUnitId, lectureId, completed)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureUnitResourceApi apiInstance = new LectureUnitResourceApi(defaultClient);
        Long lectureUnitId = 56L; // Long | 
        Long lectureId = 56L; // Long | 
        Boolean completed = true; // Boolean | 
        try {
            apiInstance.completeLectureUnit(lectureUnitId, lectureId, completed);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureUnitResourceApi#completeLectureUnit");
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
| **lectureUnitId** | **Long**|  | |
| **lectureId** | **Long**|  | |
| **completed** | **Boolean**|  | |

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


## deleteLectureUnit

> deleteLectureUnit(lectureUnitId, lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureUnitResourceApi apiInstance = new LectureUnitResourceApi(defaultClient);
        Long lectureUnitId = 56L; // Long | 
        Long lectureId = 56L; // Long | 
        try {
            apiInstance.deleteLectureUnit(lectureUnitId, lectureId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureUnitResourceApi#deleteLectureUnit");
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
| **lectureUnitId** | **Long**|  | |
| **lectureId** | **Long**|  | |

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


## updateLectureUnitsOrder

> List&lt;UpdateLectureUnitsOrder200ResponseInner&gt; updateLectureUnitsOrder(lectureId, requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureUnitResourceApi apiInstance = new LectureUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        List<Long> requestBody = Arrays.asList(); // List<Long> | 
        try {
            List<UpdateLectureUnitsOrder200ResponseInner> result = apiInstance.updateLectureUnitsOrder(lectureId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureUnitResourceApi#updateLectureUnitsOrder");
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
| **requestBody** | **List&lt;Long&gt;**|  | |

### Return type

[**List&lt;UpdateLectureUnitsOrder200ResponseInner&gt;**](UpdateLectureUnitsOrder200ResponseInner.md)

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

