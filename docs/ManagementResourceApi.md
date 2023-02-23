# ManagementResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toggleFeatures**](ManagementResourceApi.md#toggleFeatures) | **PUT** /api/admin/management/feature-toggle |  |



## toggleFeatures

> List&lt;String&gt; toggleFeatures(requestBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ManagementResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ManagementResourceApi apiInstance = new ManagementResourceApi(defaultClient);
        Map<String, Boolean> requestBody = new HashMap(); // Map<String, Boolean> | 
        try {
            List<String> result = apiInstance.toggleFeatures(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementResourceApi#toggleFeatures");
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
| **requestBody** | **Map&lt;String,Boolean&gt;**|  | |

### Return type

**List&lt;String&gt;**

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

