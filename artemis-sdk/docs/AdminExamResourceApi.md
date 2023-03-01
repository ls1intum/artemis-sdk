# AdminExamResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentAndUpcomingExams**](AdminExamResourceApi.md#getCurrentAndUpcomingExams) | **GET** /api/admin/courses/upcoming-exams |  |



## getCurrentAndUpcomingExams

> List&lt;Exam&gt; getCurrentAndUpcomingExams()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminExamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminExamResourceApi apiInstance = new AdminExamResourceApi(defaultClient);
        try {
            List<Exam> result = apiInstance.getCurrentAndUpcomingExams();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminExamResourceApi#getCurrentAndUpcomingExams");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

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

