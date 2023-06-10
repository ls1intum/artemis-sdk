# AppleAppSiteAssociationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppleAppSiteAssociation**](AppleAppSiteAssociationResourceApi.md#getAppleAppSiteAssociation) | **GET** /.well-known/apple-app-site-association |  |



## getAppleAppSiteAssociation

> AppleAppSiteAssociation getAppleAppSiteAssociation()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AppleAppSiteAssociationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AppleAppSiteAssociationResourceApi apiInstance = new AppleAppSiteAssociationResourceApi(defaultClient);
        try {
            AppleAppSiteAssociation result = apiInstance.getAppleAppSiteAssociation();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppleAppSiteAssociationResourceApi#getAppleAppSiteAssociation");
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

[**AppleAppSiteAssociation**](AppleAppSiteAssociation.md)

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

