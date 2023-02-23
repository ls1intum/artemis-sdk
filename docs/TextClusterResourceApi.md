# TextClusterResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClusterStats**](TextClusterResourceApi.md#getClusterStats) | **GET** /api/text-exercises/{exerciseId}/cluster-statistics |  |
| [**toggleClusterDisabledPredicate**](TextClusterResourceApi.md#toggleClusterDisabledPredicate) | **PATCH** /api/text-exercises/{exerciseId}/text-clusters/{clusterId} |  |



## getClusterStats

> List&lt;TextClusterStatisticsDTO&gt; getClusterStats(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextClusterResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextClusterResourceApi apiInstance = new TextClusterResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<TextClusterStatisticsDTO> result = apiInstance.getClusterStats(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextClusterResourceApi#getClusterStats");
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

### Return type

[**List&lt;TextClusterStatisticsDTO&gt;**](TextClusterStatisticsDTO.md)

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


## toggleClusterDisabledPredicate

> toggleClusterDisabledPredicate(exerciseId, clusterId, disabled)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TextClusterResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TextClusterResourceApi apiInstance = new TextClusterResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long clusterId = 56L; // Long | 
        Boolean disabled = true; // Boolean | 
        try {
            apiInstance.toggleClusterDisabledPredicate(exerciseId, clusterId, disabled);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextClusterResourceApi#toggleClusterDisabledPredicate");
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
| **clusterId** | **Long**|  | |
| **disabled** | **Boolean**|  | |

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

