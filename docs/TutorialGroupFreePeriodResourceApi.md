# TutorialGroupFreePeriodResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create3**](TutorialGroupFreePeriodResourceApi.md#create3) | **POST** /api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods |  |
| [**delete1**](TutorialGroupFreePeriodResourceApi.md#delete1) | **DELETE** /api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId} |  |
| [**getOneOfConfiguration**](TutorialGroupFreePeriodResourceApi.md#getOneOfConfiguration) | **GET** /api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId} |  |
| [**update3**](TutorialGroupFreePeriodResourceApi.md#update3) | **PUT** /api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId} |  |



## create3

> TutorialGroupFreePeriod create3(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupFreePeriodResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupFreePeriodResourceApi apiInstance = new TutorialGroupFreePeriodResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupsConfigurationId = 56L; // Long | 
        TutorialGroupFreePeriodDTO tutorialGroupFreePeriodDTO = new TutorialGroupFreePeriodDTO(); // TutorialGroupFreePeriodDTO | 
        try {
            TutorialGroupFreePeriod result = apiInstance.create3(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupFreePeriodResourceApi#create3");
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
| **tutorialGroupFreePeriodDTO** | [**TutorialGroupFreePeriodDTO**](TutorialGroupFreePeriodDTO.md)|  | |

### Return type

[**TutorialGroupFreePeriod**](TutorialGroupFreePeriod.md)

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


## delete1

> delete1(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupFreePeriodResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupFreePeriodResourceApi apiInstance = new TutorialGroupFreePeriodResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupsConfigurationId = 56L; // Long | 
        Long tutorialGroupFreePeriodId = 56L; // Long | 
        try {
            apiInstance.delete1(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupFreePeriodResourceApi#delete1");
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
| **tutorialGroupFreePeriodId** | **Long**|  | |

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


## getOneOfConfiguration

> TutorialGroupFreePeriod getOneOfConfiguration(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupFreePeriodResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupFreePeriodResourceApi apiInstance = new TutorialGroupFreePeriodResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupsConfigurationId = 56L; // Long | 
        Long tutorialGroupFreePeriodId = 56L; // Long | 
        try {
            TutorialGroupFreePeriod result = apiInstance.getOneOfConfiguration(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupFreePeriodResourceApi#getOneOfConfiguration");
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
| **tutorialGroupFreePeriodId** | **Long**|  | |

### Return type

[**TutorialGroupFreePeriod**](TutorialGroupFreePeriod.md)

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


## update3

> TutorialGroupFreePeriod update3(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId, tutorialGroupFreePeriodDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupFreePeriodResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupFreePeriodResourceApi apiInstance = new TutorialGroupFreePeriodResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupsConfigurationId = 56L; // Long | 
        Long tutorialGroupFreePeriodId = 56L; // Long | 
        TutorialGroupFreePeriodDTO tutorialGroupFreePeriodDTO = new TutorialGroupFreePeriodDTO(); // TutorialGroupFreePeriodDTO | 
        try {
            TutorialGroupFreePeriod result = apiInstance.update3(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId, tutorialGroupFreePeriodDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupFreePeriodResourceApi#update3");
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
| **tutorialGroupFreePeriodId** | **Long**|  | |
| **tutorialGroupFreePeriodDTO** | [**TutorialGroupFreePeriodDTO**](TutorialGroupFreePeriodDTO.md)|  | |

### Return type

[**TutorialGroupFreePeriod**](TutorialGroupFreePeriod.md)

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

