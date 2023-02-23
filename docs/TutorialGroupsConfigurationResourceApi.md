# TutorialGroupsConfigurationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create2**](TutorialGroupsConfigurationResourceApi.md#create2) | **POST** /api/courses/{courseId}/tutorial-groups-configuration |  |
| [**getOneOfCourse1**](TutorialGroupsConfigurationResourceApi.md#getOneOfCourse1) | **GET** /api/courses/{courseId}/tutorial-groups-configuration |  |
| [**update2**](TutorialGroupsConfigurationResourceApi.md#update2) | **PUT** /api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId} |  |



## create2

> TutorialGroupsConfiguration create2(courseId, tutorialGroupsConfiguration)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupsConfigurationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupsConfigurationResourceApi apiInstance = new TutorialGroupsConfigurationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        TutorialGroupsConfiguration tutorialGroupsConfiguration = new TutorialGroupsConfiguration(); // TutorialGroupsConfiguration | 
        try {
            TutorialGroupsConfiguration result = apiInstance.create2(courseId, tutorialGroupsConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupsConfigurationResourceApi#create2");
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
| **tutorialGroupsConfiguration** | [**TutorialGroupsConfiguration**](TutorialGroupsConfiguration.md)|  | |

### Return type

[**TutorialGroupsConfiguration**](TutorialGroupsConfiguration.md)

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


## getOneOfCourse1

> TutorialGroupsConfiguration getOneOfCourse1(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupsConfigurationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupsConfigurationResourceApi apiInstance = new TutorialGroupsConfigurationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            TutorialGroupsConfiguration result = apiInstance.getOneOfCourse1(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupsConfigurationResourceApi#getOneOfCourse1");
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

[**TutorialGroupsConfiguration**](TutorialGroupsConfiguration.md)

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


## update2

> TutorialGroupsConfiguration update2(courseId, tutorialGroupsConfigurationId, tutorialGroupsConfiguration)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupsConfigurationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupsConfigurationResourceApi apiInstance = new TutorialGroupsConfigurationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupsConfigurationId = 56L; // Long | 
        TutorialGroupsConfiguration tutorialGroupsConfiguration = new TutorialGroupsConfiguration(); // TutorialGroupsConfiguration | 
        try {
            TutorialGroupsConfiguration result = apiInstance.update2(courseId, tutorialGroupsConfigurationId, tutorialGroupsConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupsConfigurationResourceApi#update2");
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
| **tutorialGroupsConfigurationId** | **Long**|  | |
| **tutorialGroupsConfiguration** | [**TutorialGroupsConfiguration**](TutorialGroupsConfiguration.md)|  | |

### Return type

[**TutorialGroupsConfiguration**](TutorialGroupsConfiguration.md)

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

