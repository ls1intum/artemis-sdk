# ProgrammingExerciseGitDiffReportResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGitDiffReport**](ProgrammingExerciseGitDiffReportResourceApi.md#getGitDiffReport) | **GET** /api/programming-exercises/{exerciseId}/diff-report |  |



## getGitDiffReport

> ProgrammingExerciseGitDiffReport getGitDiffReport(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseGitDiffReportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseGitDiffReportResourceApi apiInstance = new ProgrammingExerciseGitDiffReportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ProgrammingExerciseGitDiffReport result = apiInstance.getGitDiffReport(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseGitDiffReportResourceApi#getGitDiffReport");
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

[**ProgrammingExerciseGitDiffReport**](ProgrammingExerciseGitDiffReport.md)

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

