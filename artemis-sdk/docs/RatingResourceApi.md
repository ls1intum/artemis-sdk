# RatingResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRatingForResult**](RatingResourceApi.md#createRatingForResult) | **POST** /api/results/{resultId}/rating/{ratingValue} |  |
| [**getRatingForInstructorDashboard**](RatingResourceApi.md#getRatingForInstructorDashboard) | **GET** /api/course/{courseId}/rating |  |
| [**getRatingForResult**](RatingResourceApi.md#getRatingForResult) | **GET** /api/results/{resultId}/rating |  |
| [**updateRatingForResult**](RatingResourceApi.md#updateRatingForResult) | **PUT** /api/results/{resultId}/rating/{ratingValue} |  |



## createRatingForResult

> Rating createRatingForResult(resultId, ratingValue)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RatingResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RatingResourceApi apiInstance = new RatingResourceApi(defaultClient);
        Long resultId = 56L; // Long | 
        Integer ratingValue = 56; // Integer | 
        try {
            Rating result = apiInstance.createRatingForResult(resultId, ratingValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RatingResourceApi#createRatingForResult");
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
| **resultId** | **Long**|  | |
| **ratingValue** | **Integer**|  | |

### Return type

[**Rating**](Rating.md)

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


## getRatingForInstructorDashboard

> List&lt;Rating&gt; getRatingForInstructorDashboard(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RatingResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RatingResourceApi apiInstance = new RatingResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<Rating> result = apiInstance.getRatingForInstructorDashboard(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RatingResourceApi#getRatingForInstructorDashboard");
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
| **courseId** | **Long**|  | |

### Return type

[**List&lt;Rating&gt;**](Rating.md)

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


## getRatingForResult

> Rating getRatingForResult(resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RatingResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RatingResourceApi apiInstance = new RatingResourceApi(defaultClient);
        Long resultId = 56L; // Long | 
        try {
            Rating result = apiInstance.getRatingForResult(resultId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RatingResourceApi#getRatingForResult");
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
| **resultId** | **Long**|  | |

### Return type

[**Rating**](Rating.md)

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


## updateRatingForResult

> Rating updateRatingForResult(resultId, ratingValue)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RatingResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RatingResourceApi apiInstance = new RatingResourceApi(defaultClient);
        Long resultId = 56L; // Long | 
        Integer ratingValue = 56; // Integer | 
        try {
            Rating result = apiInstance.updateRatingForResult(resultId, ratingValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RatingResourceApi#updateRatingForResult");
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
| **resultId** | **Long**|  | |
| **ratingValue** | **Integer**|  | |

### Return type

[**Rating**](Rating.md)

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

