# TestRepositoryResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commitChanges**](TestRepositoryResourceApi.md#commitChanges) | **POST** /api/test-repository/{exerciseId}/commit |  |
| [**createFile**](TestRepositoryResourceApi.md#createFile) | **POST** /api/test-repository/{exerciseId}/file |  |
| [**createFolder**](TestRepositoryResourceApi.md#createFolder) | **POST** /api/test-repository/{exerciseId}/folder |  |
| [**deleteFile**](TestRepositoryResourceApi.md#deleteFile) | **DELETE** /api/test-repository/{exerciseId}/file |  |
| [**getFile**](TestRepositoryResourceApi.md#getFile) | **GET** /api/test-repository/{exerciseId}/file |  |
| [**getFiles**](TestRepositoryResourceApi.md#getFiles) | **GET** /api/test-repository/{exerciseId}/files |  |
| [**getStatus**](TestRepositoryResourceApi.md#getStatus) | **GET** /api/test-repository/{exerciseId} |  |
| [**pullChanges**](TestRepositoryResourceApi.md#pullChanges) | **GET** /api/test-repository/{exerciseId}/pull |  |
| [**renameFile**](TestRepositoryResourceApi.md#renameFile) | **POST** /api/test-repository/{exerciseId}/rename-file |  |
| [**resetToLastCommit**](TestRepositoryResourceApi.md#resetToLastCommit) | **POST** /api/test-repository/{exerciseId}/reset |  |
| [**updateTestFiles**](TestRepositoryResourceApi.md#updateTestFiles) | **PUT** /api/test-repository/{exerciseId}/files |  |



## commitChanges

> commitChanges(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.commitChanges(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#commitChanges");
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


## createFile

> createFile(exerciseId, _file)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String _file = "_file_example"; // String | 
        try {
            apiInstance.createFile(exerciseId, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#createFile");
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
| **_file** | **String**|  | |

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


## createFolder

> createFolder(exerciseId, folder)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String folder = "folder_example"; // String | 
        try {
            apiInstance.createFolder(exerciseId, folder);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#createFolder");
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
| **folder** | **String**|  | |

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


## deleteFile

> deleteFile(exerciseId, _file)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String _file = "_file_example"; // String | 
        try {
            apiInstance.deleteFile(exerciseId, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#deleteFile");
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
| **_file** | **String**|  | |

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


## getFile

> List&lt;byte[]&gt; getFile(exerciseId, _file)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String _file = "_file_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getFile(exerciseId, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#getFile");
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
| **_file** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## getFiles

> Map&lt;String, String&gt; getFiles(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Map<String, String> result = apiInstance.getFiles(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#getFiles");
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

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## getStatus

> RepositoryStatusDTO getStatus(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            RepositoryStatusDTO result = apiInstance.getStatus(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#getStatus");
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

[**RepositoryStatusDTO**](RepositoryStatusDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## pullChanges

> pullChanges(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.pullChanges(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#pullChanges");
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


## renameFile

> renameFile(exerciseId, fileMove)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        FileMove fileMove = new FileMove(); // FileMove | 
        try {
            apiInstance.renameFile(exerciseId, fileMove);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#renameFile");
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
| **fileMove** | [**FileMove**](FileMove.md)|  | |

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


## resetToLastCommit

> resetToLastCommit(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.resetToLastCommit(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#resetToLastCommit");
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


## updateTestFiles

> Map&lt;String, String&gt; updateTestFiles(exerciseId, commit, fileSubmission)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TestRepositoryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TestRepositoryResourceApi apiInstance = new TestRepositoryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean commit = true; // Boolean | 
        List<FileSubmission> fileSubmission = Arrays.asList(); // List<FileSubmission> | 
        try {
            Map<String, String> result = apiInstance.updateTestFiles(exerciseId, commit, fileSubmission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRepositoryResourceApi#updateTestFiles");
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
| **commit** | **Boolean**|  | |
| **fileSubmission** | [**List&lt;FileSubmission&gt;**](FileSubmission.md)|  | |

### Return type

**Map&lt;String, String&gt;**

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

