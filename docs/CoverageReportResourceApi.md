# CoverageReportResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLatestCoverageReport**](CoverageReportResourceApi.md#getLatestCoverageReport) | **GET** /api/programming-exercises/{exerciseId}/testwise-coverage-report |  |
| [**getLatestFullCoverageReport**](CoverageReportResourceApi.md#getLatestFullCoverageReport) | **GET** /api/programming-exercises/{exerciseId}/full-testwise-coverage-report |  |



## getLatestCoverageReport

> CoverageReport getLatestCoverageReport(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CoverageReportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CoverageReportResourceApi apiInstance = new CoverageReportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            CoverageReport result = apiInstance.getLatestCoverageReport(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoverageReportResourceApi#getLatestCoverageReport");
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

[**CoverageReport**](CoverageReport.md)

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


## getLatestFullCoverageReport

> CoverageReport getLatestFullCoverageReport(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CoverageReportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CoverageReportResourceApi apiInstance = new CoverageReportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            CoverageReport result = apiInstance.getLatestFullCoverageReport(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoverageReportResourceApi#getLatestFullCoverageReport");
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

[**CoverageReport**](CoverageReport.md)

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

