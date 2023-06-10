# AndroidAppSiteAssociationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAndroidAssetLinks**](AndroidAppSiteAssociationResourceApi.md#getAndroidAssetLinks) | **GET** /.well-known/assetlinks.json |  |



## getAndroidAssetLinks

> List&lt;AndroidAssetLinksEntry&gt; getAndroidAssetLinks()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AndroidAppSiteAssociationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AndroidAppSiteAssociationResourceApi apiInstance = new AndroidAppSiteAssociationResourceApi(defaultClient);
        try {
            List<AndroidAssetLinksEntry> result = apiInstance.getAndroidAssetLinks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AndroidAppSiteAssociationResourceApi#getAndroidAssetLinks");
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

[**List&lt;AndroidAssetLinksEntry&gt;**](AndroidAssetLinksEntry.md)

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

