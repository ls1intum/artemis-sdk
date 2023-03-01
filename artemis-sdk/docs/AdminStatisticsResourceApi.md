# AdminStatisticsResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChartData1**](AdminStatisticsResourceApi.md#getChartData1) | **GET** /api/admin/management/statistics/data |  |



## getChartData1

> List&lt;Integer&gt; getChartData1(span, periodIndex, graphType)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminStatisticsResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminStatisticsResourceApi apiInstance = new AdminStatisticsResourceApi(defaultClient);
        String span = "DAY"; // String | 
        Integer periodIndex = 56; // Integer | 
        String graphType = "SUBMISSIONS"; // String | 
        try {
            List<Integer> result = apiInstance.getChartData1(span, periodIndex, graphType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminStatisticsResourceApi#getChartData1");
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
| **span** | **String**|  | [enum: DAY, WEEK, MONTH, QUARTER, YEAR] |
| **periodIndex** | **Integer**|  | |
| **graphType** | **String**|  | [enum: SUBMISSIONS, ACTIVE_USERS, LOGGED_IN_USERS, RELEASED_EXERCISES, EXERCISES_DUE, CONDUCTED_EXAMS, EXAM_PARTICIPATIONS, EXAM_REGISTRATIONS, ACTIVE_TUTORS, CREATED_RESULTS, CREATED_FEEDBACKS, POSTS, RESOLVED_POSTS] |

### Return type

**List&lt;Integer&gt;**

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

