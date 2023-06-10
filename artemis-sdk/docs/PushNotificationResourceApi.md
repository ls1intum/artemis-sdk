# PushNotificationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**register**](PushNotificationResourceApi.md#register) | **POST** /api/push_notification/register |  |
| [**unregister**](PushNotificationResourceApi.md#unregister) | **DELETE** /api/push_notification/unregister |  |



## register

> PushNotificationRegisterDTO register(pushNotificationRegisterBody)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PushNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PushNotificationResourceApi apiInstance = new PushNotificationResourceApi(defaultClient);
        PushNotificationRegisterBody pushNotificationRegisterBody = new PushNotificationRegisterBody(); // PushNotificationRegisterBody | 
        try {
            PushNotificationRegisterDTO result = apiInstance.register(pushNotificationRegisterBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushNotificationResourceApi#register");
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
| **pushNotificationRegisterBody** | [**PushNotificationRegisterBody**](PushNotificationRegisterBody.md)|  | |

### Return type

[**PushNotificationRegisterDTO**](PushNotificationRegisterDTO.md)

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


## unregister

> unregister(pushNotificationUnregisterRequest)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PushNotificationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PushNotificationResourceApi apiInstance = new PushNotificationResourceApi(defaultClient);
        PushNotificationUnregisterRequest pushNotificationUnregisterRequest = new PushNotificationUnregisterRequest(); // PushNotificationUnregisterRequest | 
        try {
            apiInstance.unregister(pushNotificationUnregisterRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushNotificationResourceApi#unregister");
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
| **pushNotificationUnregisterRequest** | [**PushNotificationUnregisterRequest**](PushNotificationUnregisterRequest.md)|  | |

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

