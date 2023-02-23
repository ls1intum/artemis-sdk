# ProgrammingExerciseSolutionEntryResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBehavioralSolutionEntries**](ProgrammingExerciseSolutionEntryResourceApi.md#createBehavioralSolutionEntries) | **POST** /api/programming-exercises/{exerciseId}/behavioral-solution-entries |  |
| [**createSolutionEntryForTestCase**](ProgrammingExerciseSolutionEntryResourceApi.md#createSolutionEntryForTestCase) | **POST** /api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries |  |
| [**createStructuralSolutionEntries**](ProgrammingExerciseSolutionEntryResourceApi.md#createStructuralSolutionEntries) | **POST** /api/programming-exercises/{exerciseId}/structural-solution-entries |  |
| [**deleteAllSolutionEntriesForExercise**](ProgrammingExerciseSolutionEntryResourceApi.md#deleteAllSolutionEntriesForExercise) | **DELETE** /api/programming-exercises/{exerciseId}/solution-entries |  |
| [**deleteSolutionEntry**](ProgrammingExerciseSolutionEntryResourceApi.md#deleteSolutionEntry) | **DELETE** /api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries/{solutionEntryId} |  |
| [**getAllSolutionEntries**](ProgrammingExerciseSolutionEntryResourceApi.md#getAllSolutionEntries) | **GET** /api/programming-exercises/{exerciseId}/solution-entries |  |
| [**getSolutionEntriesForCodeHint**](ProgrammingExerciseSolutionEntryResourceApi.md#getSolutionEntriesForCodeHint) | **GET** /api/programming-exercises/{exerciseId}/code-hints/{codeHintId}/solution-entries |  |
| [**getSolutionEntriesForTestCase**](ProgrammingExerciseSolutionEntryResourceApi.md#getSolutionEntriesForTestCase) | **GET** /api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries |  |
| [**getSolutionEntry**](ProgrammingExerciseSolutionEntryResourceApi.md#getSolutionEntry) | **GET** /api/programming-exercises/{exerciseId}/solution-entries/{solutionEntryId} |  |
| [**updateSolutionEntry**](ProgrammingExerciseSolutionEntryResourceApi.md#updateSolutionEntry) | **PUT** /api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries/{solutionEntryId} |  |



## createBehavioralSolutionEntries

> List&lt;ProgrammingExerciseSolutionEntry&gt; createBehavioralSolutionEntries(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<ProgrammingExerciseSolutionEntry> result = apiInstance.createBehavioralSolutionEntries(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#createBehavioralSolutionEntries");
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

[**List&lt;ProgrammingExerciseSolutionEntry&gt;**](ProgrammingExerciseSolutionEntry.md)

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


## createSolutionEntryForTestCase

> ProgrammingExerciseSolutionEntry createSolutionEntryForTestCase(exerciseId, testCaseId, programmingExerciseSolutionEntry)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long testCaseId = 56L; // Long | 
        ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry = new ProgrammingExerciseSolutionEntry(); // ProgrammingExerciseSolutionEntry | 
        try {
            ProgrammingExerciseSolutionEntry result = apiInstance.createSolutionEntryForTestCase(exerciseId, testCaseId, programmingExerciseSolutionEntry);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#createSolutionEntryForTestCase");
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
| **testCaseId** | **Long**|  | |
| **programmingExerciseSolutionEntry** | [**ProgrammingExerciseSolutionEntry**](ProgrammingExerciseSolutionEntry.md)|  | |

### Return type

[**ProgrammingExerciseSolutionEntry**](ProgrammingExerciseSolutionEntry.md)

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


## createStructuralSolutionEntries

> List&lt;ProgrammingExerciseSolutionEntry&gt; createStructuralSolutionEntries(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<ProgrammingExerciseSolutionEntry> result = apiInstance.createStructuralSolutionEntries(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#createStructuralSolutionEntries");
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

[**List&lt;ProgrammingExerciseSolutionEntry&gt;**](ProgrammingExerciseSolutionEntry.md)

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


## deleteAllSolutionEntriesForExercise

> deleteAllSolutionEntriesForExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.deleteAllSolutionEntriesForExercise(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#deleteAllSolutionEntriesForExercise");
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


## deleteSolutionEntry

> deleteSolutionEntry(exerciseId, testCaseId, solutionEntryId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long testCaseId = 56L; // Long | 
        Long solutionEntryId = 56L; // Long | 
        try {
            apiInstance.deleteSolutionEntry(exerciseId, testCaseId, solutionEntryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#deleteSolutionEntry");
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
| **testCaseId** | **Long**|  | |
| **solutionEntryId** | **Long**|  | |

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


## getAllSolutionEntries

> Set&lt;ProgrammingExerciseSolutionEntry&gt; getAllSolutionEntries(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            Set<ProgrammingExerciseSolutionEntry> result = apiInstance.getAllSolutionEntries(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#getAllSolutionEntries");
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

[**Set&lt;ProgrammingExerciseSolutionEntry&gt;**](ProgrammingExerciseSolutionEntry.md)

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


## getSolutionEntriesForCodeHint

> Set&lt;ProgrammingExerciseSolutionEntry&gt; getSolutionEntriesForCodeHint(exerciseId, codeHintId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long codeHintId = 56L; // Long | 
        try {
            Set<ProgrammingExerciseSolutionEntry> result = apiInstance.getSolutionEntriesForCodeHint(exerciseId, codeHintId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#getSolutionEntriesForCodeHint");
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
| **codeHintId** | **Long**|  | |

### Return type

[**Set&lt;ProgrammingExerciseSolutionEntry&gt;**](ProgrammingExerciseSolutionEntry.md)

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


## getSolutionEntriesForTestCase

> Set&lt;ProgrammingExerciseSolutionEntry&gt; getSolutionEntriesForTestCase(exerciseId, testCaseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long testCaseId = 56L; // Long | 
        try {
            Set<ProgrammingExerciseSolutionEntry> result = apiInstance.getSolutionEntriesForTestCase(exerciseId, testCaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#getSolutionEntriesForTestCase");
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
| **testCaseId** | **Long**|  | |

### Return type

[**Set&lt;ProgrammingExerciseSolutionEntry&gt;**](ProgrammingExerciseSolutionEntry.md)

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


## getSolutionEntry

> ProgrammingExerciseSolutionEntry getSolutionEntry(exerciseId, solutionEntryId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long solutionEntryId = 56L; // Long | 
        try {
            ProgrammingExerciseSolutionEntry result = apiInstance.getSolutionEntry(exerciseId, solutionEntryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#getSolutionEntry");
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
| **solutionEntryId** | **Long**|  | |

### Return type

[**ProgrammingExerciseSolutionEntry**](ProgrammingExerciseSolutionEntry.md)

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


## updateSolutionEntry

> ProgrammingExerciseSolutionEntry updateSolutionEntry(exerciseId, testCaseId, solutionEntryId, programmingExerciseSolutionEntry)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseSolutionEntryResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseSolutionEntryResourceApi apiInstance = new ProgrammingExerciseSolutionEntryResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long testCaseId = 56L; // Long | 
        Long solutionEntryId = 56L; // Long | 
        ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry = new ProgrammingExerciseSolutionEntry(); // ProgrammingExerciseSolutionEntry | 
        try {
            ProgrammingExerciseSolutionEntry result = apiInstance.updateSolutionEntry(exerciseId, testCaseId, solutionEntryId, programmingExerciseSolutionEntry);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseSolutionEntryResourceApi#updateSolutionEntry");
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
| **testCaseId** | **Long**|  | |
| **solutionEntryId** | **Long**|  | |
| **programmingExerciseSolutionEntry** | [**ProgrammingExerciseSolutionEntry**](ProgrammingExerciseSolutionEntry.md)|  | |

### Return type

[**ProgrammingExerciseSolutionEntry**](ProgrammingExerciseSolutionEntry.md)

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

