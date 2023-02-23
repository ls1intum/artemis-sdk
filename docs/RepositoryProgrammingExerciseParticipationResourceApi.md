# RepositoryProgrammingExerciseParticipationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commitChanges1**](RepositoryProgrammingExerciseParticipationResourceApi.md#commitChanges1) | **POST** /api/repository/{participationId}/commit |  |
| [**createFile1**](RepositoryProgrammingExerciseParticipationResourceApi.md#createFile1) | **POST** /api/repository/{participationId}/file |  |
| [**createFolder1**](RepositoryProgrammingExerciseParticipationResourceApi.md#createFolder1) | **POST** /api/repository/{participationId}/folder |  |
| [**deleteFile1**](RepositoryProgrammingExerciseParticipationResourceApi.md#deleteFile1) | **DELETE** /api/repository/{participationId}/file |  |
| [**getBuildLogs**](RepositoryProgrammingExerciseParticipationResourceApi.md#getBuildLogs) | **GET** /api/repository/{participationId}/buildlogs |  |
| [**getFile1**](RepositoryProgrammingExerciseParticipationResourceApi.md#getFile1) | **GET** /api/repository/{participationId}/file |  |
| [**getFileNames**](RepositoryProgrammingExerciseParticipationResourceApi.md#getFileNames) | **GET** /api/repository/{participationId}/file-names |  |
| [**getFiles1**](RepositoryProgrammingExerciseParticipationResourceApi.md#getFiles1) | **GET** /api/repository/{participationId}/files |  |
| [**getFilesWithContent**](RepositoryProgrammingExerciseParticipationResourceApi.md#getFilesWithContent) | **GET** /api/repository/{participationId}/files-content |  |
| [**getFilesWithInformationAboutChange**](RepositoryProgrammingExerciseParticipationResourceApi.md#getFilesWithInformationAboutChange) | **GET** /api/repository/{participationId}/files-change |  |
| [**getStatus1**](RepositoryProgrammingExerciseParticipationResourceApi.md#getStatus1) | **GET** /api/repository/{participationId} |  |
| [**pullChanges1**](RepositoryProgrammingExerciseParticipationResourceApi.md#pullChanges1) | **GET** /api/repository/{participationId}/pull |  |
| [**renameFile1**](RepositoryProgrammingExerciseParticipationResourceApi.md#renameFile1) | **POST** /api/repository/{participationId}/rename-file |  |
| [**resetToLastCommit1**](RepositoryProgrammingExerciseParticipationResourceApi.md#resetToLastCommit1) | **POST** /api/repository/{participationId}/reset |  |
| [**updateParticipationFiles**](RepositoryProgrammingExerciseParticipationResourceApi.md#updateParticipationFiles) | **PUT** /api/repository/{participationId}/files |  |



## commitChanges1

> commitChanges1(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            apiInstance.commitChanges1(participationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#commitChanges1");
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
| **participationId** | **Long**|  | |

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


## createFile1

> createFile1(participationId, _file)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        String _file = "_file_example"; // String | 
        try {
            apiInstance.createFile1(participationId, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#createFile1");
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
| **participationId** | **Long**|  | |
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


## createFolder1

> createFolder1(participationId, folder)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        String folder = "folder_example"; // String | 
        try {
            apiInstance.createFolder1(participationId, folder);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#createFolder1");
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
| **participationId** | **Long**|  | |
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


## deleteFile1

> deleteFile1(participationId, _file)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        String _file = "_file_example"; // String | 
        try {
            apiInstance.deleteFile1(participationId, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#deleteFile1");
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
| **participationId** | **Long**|  | |
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


## getBuildLogs

> List&lt;BuildLogEntry&gt; getBuildLogs(participationId, resultId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Long resultId = 56L; // Long | 
        try {
            List<BuildLogEntry> result = apiInstance.getBuildLogs(participationId, resultId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getBuildLogs");
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
| **participationId** | **Long**|  | |
| **resultId** | **Long**|  | [optional] |

### Return type

[**List&lt;BuildLogEntry&gt;**](BuildLogEntry.md)

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


## getFile1

> List&lt;byte[]&gt; getFile1(participationId, _file)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        String _file = "_file_example"; // String | 
        try {
            List<byte[]> result = apiInstance.getFile1(participationId, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getFile1");
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
| **participationId** | **Long**|  | |
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


## getFileNames

> Set&lt;String&gt; getFileNames(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            Set<String> result = apiInstance.getFileNames(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getFileNames");
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
| **participationId** | **Long**|  | |

### Return type

**Set&lt;String&gt;**

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


## getFiles1

> Map&lt;String, String&gt; getFiles1(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            Map<String, String> result = apiInstance.getFiles1(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getFiles1");
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
| **participationId** | **Long**|  | |

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


## getFilesWithContent

> Map&lt;String, String&gt; getFilesWithContent(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            Map<String, String> result = apiInstance.getFilesWithContent(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getFilesWithContent");
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
| **participationId** | **Long**|  | |

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


## getFilesWithInformationAboutChange

> Map&lt;String, Boolean&gt; getFilesWithInformationAboutChange(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            Map<String, Boolean> result = apiInstance.getFilesWithInformationAboutChange(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getFilesWithInformationAboutChange");
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
| **participationId** | **Long**|  | |

### Return type

**Map&lt;String, Boolean&gt;**

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


## getStatus1

> RepositoryStatusDTO getStatus1(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            RepositoryStatusDTO result = apiInstance.getStatus1(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#getStatus1");
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
| **participationId** | **Long**|  | |

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


## pullChanges1

> pullChanges1(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            apiInstance.pullChanges1(participationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#pullChanges1");
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
| **participationId** | **Long**|  | |

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


## renameFile1

> renameFile1(participationId, fileMove)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        FileMove fileMove = new FileMove(); // FileMove | 
        try {
            apiInstance.renameFile1(participationId, fileMove);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#renameFile1");
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
| **participationId** | **Long**|  | |
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


## resetToLastCommit1

> resetToLastCommit1(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            apiInstance.resetToLastCommit1(participationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#resetToLastCommit1");
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
| **participationId** | **Long**|  | |

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


## updateParticipationFiles

> Map&lt;String, String&gt; updateParticipationFiles(participationId, fileSubmission, commit)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.RepositoryProgrammingExerciseParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RepositoryProgrammingExerciseParticipationResourceApi apiInstance = new RepositoryProgrammingExerciseParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        List<FileSubmission> fileSubmission = Arrays.asList(); // List<FileSubmission> | 
        Boolean commit = false; // Boolean | 
        try {
            Map<String, String> result = apiInstance.updateParticipationFiles(participationId, fileSubmission, commit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepositoryProgrammingExerciseParticipationResourceApi#updateParticipationFiles");
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
| **participationId** | **Long**|  | |
| **fileSubmission** | [**List&lt;FileSubmission&gt;**](FileSubmission.md)|  | |
| **commit** | **Boolean**|  | [optional] [default to false] |

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

