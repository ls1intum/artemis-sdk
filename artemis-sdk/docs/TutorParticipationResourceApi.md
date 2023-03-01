# TutorParticipationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assessExampleSubmissionForTutorParticipation**](TutorParticipationResourceApi.md#assessExampleSubmissionForTutorParticipation) | **POST** /api/exercises/{exerciseId}/assess-example-submission |  |
| [**deleteTutorParticipationForGuidedTour**](TutorParticipationResourceApi.md#deleteTutorParticipationForGuidedTour) | **DELETE** /api/guided-tour/exercises/{exerciseId}/example-submission |  |
| [**initTutorParticipation**](TutorParticipationResourceApi.md#initTutorParticipation) | **POST** /api/exercises/{exerciseId}/tutor-participations |  |



## assessExampleSubmissionForTutorParticipation

> TutorParticipation assessExampleSubmissionForTutorParticipation(exerciseId, exampleSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorParticipationResourceApi apiInstance = new TutorParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ExampleSubmission exampleSubmission = new ExampleSubmission(); // ExampleSubmission | 
        try {
            TutorParticipation result = apiInstance.assessExampleSubmissionForTutorParticipation(exerciseId, exampleSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorParticipationResourceApi#assessExampleSubmissionForTutorParticipation");
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
| **exampleSubmission** | [**ExampleSubmission**](ExampleSubmission.md)|  | |

### Return type

[**TutorParticipation**](TutorParticipation.md)

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


## deleteTutorParticipationForGuidedTour

> TutorParticipation deleteTutorParticipationForGuidedTour(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorParticipationResourceApi apiInstance = new TutorParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            TutorParticipation result = apiInstance.deleteTutorParticipationForGuidedTour(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorParticipationResourceApi#deleteTutorParticipationForGuidedTour");
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

[**TutorParticipation**](TutorParticipation.md)

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


## initTutorParticipation

> TutorParticipation initTutorParticipation(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorParticipationResourceApi apiInstance = new TutorParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            TutorParticipation result = apiInstance.initTutorParticipation(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorParticipationResourceApi#initTutorParticipation");
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

[**TutorParticipation**](TutorParticipation.md)

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

