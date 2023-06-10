# PrivacyStatementResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPrivacyStatement**](PrivacyStatementResourceApi.md#getPrivacyStatement) | **GET** /api/privacy-statement |  |
| [**getPrivacyStatementForUpdate**](PrivacyStatementResourceApi.md#getPrivacyStatementForUpdate) | **GET** /api/privacy-statement-for-update |  |
| [**updatePrivacyStatement**](PrivacyStatementResourceApi.md#updatePrivacyStatement) | **PUT** /api/privacy-statement |  |



## getPrivacyStatement

> PrivacyStatement getPrivacyStatement(language)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PrivacyStatementResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PrivacyStatementResourceApi apiInstance = new PrivacyStatementResourceApi(defaultClient);
        String language = "language_example"; // String | 
        try {
            PrivacyStatement result = apiInstance.getPrivacyStatement(language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyStatementResourceApi#getPrivacyStatement");
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
| **language** | **String**|  | |

### Return type

[**PrivacyStatement**](PrivacyStatement.md)

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


## getPrivacyStatementForUpdate

> PrivacyStatement getPrivacyStatementForUpdate(language)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PrivacyStatementResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PrivacyStatementResourceApi apiInstance = new PrivacyStatementResourceApi(defaultClient);
        String language = "language_example"; // String | 
        try {
            PrivacyStatement result = apiInstance.getPrivacyStatementForUpdate(language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyStatementResourceApi#getPrivacyStatementForUpdate");
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
| **language** | **String**|  | |

### Return type

[**PrivacyStatement**](PrivacyStatement.md)

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


## updatePrivacyStatement

> PrivacyStatement updatePrivacyStatement(privacyStatement)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.PrivacyStatementResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PrivacyStatementResourceApi apiInstance = new PrivacyStatementResourceApi(defaultClient);
        PrivacyStatement privacyStatement = new PrivacyStatement(); // PrivacyStatement | 
        try {
            PrivacyStatement result = apiInstance.updatePrivacyStatement(privacyStatement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyStatementResourceApi#updatePrivacyStatement");
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
| **privacyStatement** | [**PrivacyStatement**](PrivacyStatement.md)|  | |

### Return type

[**PrivacyStatement**](PrivacyStatement.md)

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

