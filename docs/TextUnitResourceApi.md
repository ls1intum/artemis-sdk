# TextUnitResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTextUnit**](TextUnitResourceApi.md#createTextUnit) | **POST** /api/lectures/{lectureId}/text-units |  |
| [**getTextUnit**](TextUnitResourceApi.md#getTextUnit) | **GET** /api/lectures/{lectureId}/text-units/{textUnitId} |  |
| [**updateTextUnit**](TextUnitResourceApi.md#updateTextUnit) | **PUT** /api/lectures/{lectureId}/text-units |  |



## createTextUnit

> TextUnit createTextUnit(lectureId, textUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextUnitResourceApi apiInstance = new TextUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        TextUnit textUnit = new TextUnit(); // TextUnit | 
        try {
            TextUnit result = apiInstance.createTextUnit(lectureId, textUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextUnitResourceApi#createTextUnit");
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
| **textUnit** | [**TextUnit**](TextUnit.md)|  | |

### Return type

[**TextUnit**](TextUnit.md)

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


## getTextUnit

> TextUnit getTextUnit(textUnitId, lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextUnitResourceApi apiInstance = new TextUnitResourceApi(defaultClient);
        Long textUnitId = 56L; // Long | 
        Long lectureId = 56L; // Long | 
        try {
            TextUnit result = apiInstance.getTextUnit(textUnitId, lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextUnitResourceApi#getTextUnit");
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
| **textUnitId** | **Long**|  | |
| **lectureId** | **Long**|  | |

### Return type

[**TextUnit**](TextUnit.md)

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


## updateTextUnit

> TextUnit updateTextUnit(lectureId, textUnit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextUnitResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextUnitResourceApi apiInstance = new TextUnitResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        TextUnit textUnit = new TextUnit(); // TextUnit | 
        try {
            TextUnit result = apiInstance.updateTextUnit(lectureId, textUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextUnitResourceApi#updateTextUnit");
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
| **textUnit** | [**TextUnit**](TextUnit.md)|  | |

### Return type

[**TextUnit**](TextUnit.md)

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

