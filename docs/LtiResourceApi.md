# LtiResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**launch**](LtiResourceApi.md#launch) | **POST** /api/lti/launch/{exerciseId} |  |
| [**lti13DynamicRegistration**](LtiResourceApi.md#lti13DynamicRegistration) | **POST** /api/lti13/dynamic-registration/{courseId} |  |
| [**lti13LaunchRedirect**](LtiResourceApi.md#lti13LaunchRedirect) | **POST** /api/lti13/auth-callback |  |



## launch

> launch(exerciseId, ltiLaunchRequestDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LtiResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LtiResourceApi apiInstance = new LtiResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        LtiLaunchRequestDTO ltiLaunchRequestDTO = new LtiLaunchRequestDTO(); // LtiLaunchRequestDTO | 
        try {
            apiInstance.launch(exerciseId, ltiLaunchRequestDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtiResourceApi#launch");
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
| **ltiLaunchRequestDTO** | [**LtiLaunchRequestDTO**](LtiLaunchRequestDTO.md)|  | [optional] |

### Return type

null (empty response body)

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


## lti13DynamicRegistration

> lti13DynamicRegistration(courseId, openidConfiguration, registrationToken)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LtiResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LtiResourceApi apiInstance = new LtiResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String openidConfiguration = "openidConfiguration_example"; // String | 
        String registrationToken = "registrationToken_example"; // String | 
        try {
            apiInstance.lti13DynamicRegistration(courseId, openidConfiguration, registrationToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtiResourceApi#lti13DynamicRegistration");
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
| **openidConfiguration** | **String**|  | |
| **registrationToken** | **String**|  | [optional] |

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


## lti13LaunchRedirect

> lti13LaunchRedirect()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LtiResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LtiResourceApi apiInstance = new LtiResourceApi(defaultClient);
        try {
            apiInstance.lti13LaunchRedirect();
        } catch (ApiException e) {
            System.err.println("Exception when calling LtiResourceApi#lti13LaunchRedirect");
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

