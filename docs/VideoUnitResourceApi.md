# VideoUnitResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVideoUnit**](VideoUnitResourceApi.md#createVideoUnit) | **POST** /api/lectures/{lectureId}/video-units |  |
| [**getVideoUnit**](VideoUnitResourceApi.md#getVideoUnit) | **GET** /api/lectures/{lectureId}/video-units/{videoUnitId} |  |
| [**updateVideoUnit**](VideoUnitResourceApi.md#updateVideoUnit) | **PUT** /api/lectures/{lectureId}/video-units |  |



## createVideoUnit

> VideoUnit createVideoUnit(lectureId, videoUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.VideoUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        VideoUnitResourceApi apiInstance = new VideoUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        VideoUnit videoUnit = new VideoUnit(); // VideoUnit | 
        try {
            VideoUnit result = apiInstance.createVideoUnit(lectureId, videoUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoUnitResourceApi#createVideoUnit");
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
| **videoUnit** | [**VideoUnit**](VideoUnit.md)|  | |

### Return type

[**VideoUnit**](VideoUnit.md)

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


## getVideoUnit

> VideoUnit getVideoUnit(videoUnitId, lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.VideoUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        VideoUnitResourceApi apiInstance = new VideoUnitResourceApi(defaultClient);
        Long videoUnitId = 56L; // Long | 
        Long lectureId = 56L; // Long | 
        try {
            VideoUnit result = apiInstance.getVideoUnit(videoUnitId, lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoUnitResourceApi#getVideoUnit");
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
| **videoUnitId** | **Long**|  | |
| **lectureId** | **Long**|  | |

### Return type

[**VideoUnit**](VideoUnit.md)

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


## updateVideoUnit

> VideoUnit updateVideoUnit(lectureId, videoUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.VideoUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        VideoUnitResourceApi apiInstance = new VideoUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        VideoUnit videoUnit = new VideoUnit(); // VideoUnit | 
        try {
            VideoUnit result = apiInstance.updateVideoUnit(lectureId, videoUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoUnitResourceApi#updateVideoUnit");
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
| **videoUnit** | [**VideoUnit**](VideoUnit.md)|  | |

### Return type

[**VideoUnit**](VideoUnit.md)

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

