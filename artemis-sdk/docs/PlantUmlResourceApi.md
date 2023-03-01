# PlantUmlResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generatePng**](PlantUmlResourceApi.md#generatePng) | **GET** /api/plantuml/png |  |
| [**generateSvg**](PlantUmlResourceApi.md#generateSvg) | **GET** /api/plantuml/svg |  |



## generatePng

> List&lt;byte[]&gt; generatePng(plantuml, useDarkTheme)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlantUmlResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlantUmlResourceApi apiInstance = new PlantUmlResourceApi(defaultClient);
        String plantuml = "plantuml_example"; // String | 
        Boolean useDarkTheme = false; // Boolean | 
        try {
            List<byte[]> result = apiInstance.generatePng(plantuml, useDarkTheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlantUmlResourceApi#generatePng");
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
| **plantuml** | **String**|  | |
| **useDarkTheme** | **Boolean**|  | [optional] [default to false] |

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


## generateSvg

> String generateSvg(plantuml, useDarkTheme)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PlantUmlResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PlantUmlResourceApi apiInstance = new PlantUmlResourceApi(defaultClient);
        String plantuml = "plantuml_example"; // String | 
        Boolean useDarkTheme = false; // Boolean | 
        try {
            String result = apiInstance.generateSvg(plantuml, useDarkTheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlantUmlResourceApi#generateSvg");
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
| **plantuml** | **String**|  | |
| **useDarkTheme** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

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

