# GuidedTourSettingsResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGuidedTourSetting**](GuidedTourSettingsResourceApi.md#deleteGuidedTourSetting) | **DELETE** /api/guided-tour-settings/{settingsKey} |  |
| [**updateGuidedTourSettings**](GuidedTourSettingsResourceApi.md#updateGuidedTourSettings) | **PUT** /api/guided-tour-settings |  |



## deleteGuidedTourSetting

> Set&lt;GuidedTourSetting&gt; deleteGuidedTourSetting(settingsKey)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GuidedTourSettingsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GuidedTourSettingsResourceApi apiInstance = new GuidedTourSettingsResourceApi(defaultClient);
        String settingsKey = "settingsKey_example"; // String | 
        try {
            Set<GuidedTourSetting> result = apiInstance.deleteGuidedTourSetting(settingsKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GuidedTourSettingsResourceApi#deleteGuidedTourSetting");
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
| **settingsKey** | **String**|  | |

### Return type

[**Set&lt;GuidedTourSetting&gt;**](GuidedTourSetting.md)

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


## updateGuidedTourSettings

> Set&lt;GuidedTourSetting&gt; updateGuidedTourSettings(guidedTourSetting)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.GuidedTourSettingsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        GuidedTourSettingsResourceApi apiInstance = new GuidedTourSettingsResourceApi(defaultClient);
        Set<GuidedTourSetting> guidedTourSetting = Arrays.asList(); // Set<GuidedTourSetting> | 
        try {
            Set<GuidedTourSetting> result = apiInstance.updateGuidedTourSettings(guidedTourSetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GuidedTourSettingsResourceApi#updateGuidedTourSettings");
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
| **guidedTourSetting** | [**List&lt;GuidedTourSetting&gt;**](GuidedTourSetting.md)|  | |

### Return type

[**Set&lt;GuidedTourSetting&gt;**](GuidedTourSetting.md)

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

