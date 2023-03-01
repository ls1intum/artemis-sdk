# ParticipationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cleanupBuildPlan**](ParticipationResourceApi.md#cleanupBuildPlan) | **PUT** /api/participations/{participationId}/cleanupBuildPlan |  |
| [**deleteParticipation**](ParticipationResourceApi.md#deleteParticipation) | **DELETE** /api/participations/{participationId} |  |
| [**deleteParticipationForGuidedTour**](ParticipationResourceApi.md#deleteParticipationForGuidedTour) | **DELETE** /api/guided-tour/participations/{participationId} |  |
| [**getAllParticipationsForCourse**](ParticipationResourceApi.md#getAllParticipationsForCourse) | **GET** /api/courses/{courseId}/participations |  |
| [**getAllParticipationsForExercise**](ParticipationResourceApi.md#getAllParticipationsForExercise) | **GET** /api/exercises/{exerciseId}/participations |  |
| [**getParticipationBuildArtifact**](ParticipationResourceApi.md#getParticipationBuildArtifact) | **GET** /api/participations/{participationId}/buildArtifact |  |
| [**getParticipationForCurrentUser**](ParticipationResourceApi.md#getParticipationForCurrentUser) | **GET** /api/participations/{participationId} |  |
| [**getParticipationForCurrentUser1**](ParticipationResourceApi.md#getParticipationForCurrentUser1) | **GET** /api/exercises/{exerciseId}/participation |  |
| [**getParticipationWithLatestResult**](ParticipationResourceApi.md#getParticipationWithLatestResult) | **GET** /api/participations/{participationId}/withLatestResult |  |
| [**getSubmissionsOfParticipation**](ParticipationResourceApi.md#getSubmissionsOfParticipation) | **GET** /api/participations/{participationId}/submissions |  |
| [**requestFeedback**](ParticipationResourceApi.md#requestFeedback) | **PUT** /api/exercises/{exerciseId}/request-feedback |  |
| [**resumeParticipation**](ParticipationResourceApi.md#resumeParticipation) | **PUT** /api/exercises/{exerciseId}/resume-programming-participation/{participationId} |  |
| [**startParticipation**](ParticipationResourceApi.md#startParticipation) | **POST** /api/exercises/{exerciseId}/participations |  |
| [**startPracticeParticipation**](ParticipationResourceApi.md#startPracticeParticipation) | **POST** /api/exercises/{exerciseId}/participations/practice |  |
| [**updateParticipation**](ParticipationResourceApi.md#updateParticipation) | **PUT** /api/exercises/{exerciseId}/participations |  |
| [**updateParticipationDueDates**](ParticipationResourceApi.md#updateParticipationDueDates) | **PUT** /api/exercises/{exerciseId}/participations/update-individual-due-date |  |



## cleanupBuildPlan

> CleanupBuildPlan200Response cleanupBuildPlan(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            CleanupBuildPlan200Response result = apiInstance.cleanupBuildPlan(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#cleanupBuildPlan");
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

[**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md)

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


## deleteParticipation

> deleteParticipation(participationId, deleteBuildPlan, deleteRepository)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Boolean deleteBuildPlan = false; // Boolean | 
        Boolean deleteRepository = false; // Boolean | 
        try {
            apiInstance.deleteParticipation(participationId, deleteBuildPlan, deleteRepository);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#deleteParticipation");
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
| **deleteBuildPlan** | **Boolean**|  | [optional] [default to false] |
| **deleteRepository** | **Boolean**|  | [optional] [default to false] |

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


## deleteParticipationForGuidedTour

> deleteParticipationForGuidedTour(participationId, deleteBuildPlan, deleteRepository)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        Boolean deleteBuildPlan = false; // Boolean | 
        Boolean deleteRepository = false; // Boolean | 
        try {
            apiInstance.deleteParticipationForGuidedTour(participationId, deleteBuildPlan, deleteRepository);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#deleteParticipationForGuidedTour");
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
| **deleteBuildPlan** | **Boolean**|  | [optional] [default to false] |
| **deleteRepository** | **Boolean**|  | [optional] [default to false] |

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


## getAllParticipationsForCourse

> List&lt;StudentParticipation&gt; getAllParticipationsForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<StudentParticipation> result = apiInstance.getAllParticipationsForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getAllParticipationsForCourse");
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

[**List&lt;StudentParticipation&gt;**](StudentParticipation.md)

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


## getAllParticipationsForExercise

> Set&lt;StudentParticipation&gt; getAllParticipationsForExercise(exerciseId, withLatestResult)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean withLatestResult = false; // Boolean | 
        try {
            Set<StudentParticipation> result = apiInstance.getAllParticipationsForExercise(exerciseId, withLatestResult);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getAllParticipationsForExercise");
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
| **withLatestResult** | **Boolean**|  | [optional] [default to false] |

### Return type

[**Set&lt;StudentParticipation&gt;**](StudentParticipation.md)

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


## getParticipationBuildArtifact

> List&lt;byte[]&gt; getParticipationBuildArtifact(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            List<byte[]> result = apiInstance.getParticipationBuildArtifact(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getParticipationBuildArtifact");
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

**List&lt;byte[]&gt;**

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


## getParticipationForCurrentUser

> StudentParticipation getParticipationForCurrentUser(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            StudentParticipation result = apiInstance.getParticipationForCurrentUser(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getParticipationForCurrentUser");
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

[**StudentParticipation**](StudentParticipation.md)

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


## getParticipationForCurrentUser1

> MappingJacksonValue getParticipationForCurrentUser1(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            MappingJacksonValue result = apiInstance.getParticipationForCurrentUser1(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getParticipationForCurrentUser1");
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

[**MappingJacksonValue**](MappingJacksonValue.md)

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


## getParticipationWithLatestResult

> StudentParticipation getParticipationWithLatestResult(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            StudentParticipation result = apiInstance.getParticipationWithLatestResult(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getParticipationWithLatestResult");
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

[**StudentParticipation**](StudentParticipation.md)

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


## getSubmissionsOfParticipation

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getSubmissionsOfParticipation(participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long participationId = 56L; // Long | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getSubmissionsOfParticipation(participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#getSubmissionsOfParticipation");
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

[**List&lt;GetAllTextSubmissions200ResponseInner&gt;**](GetAllTextSubmissions200ResponseInner.md)

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


## requestFeedback

> ProgrammingExerciseStudentParticipation requestFeedback(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ProgrammingExerciseStudentParticipation result = apiInstance.requestFeedback(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#requestFeedback");
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

[**ProgrammingExerciseStudentParticipation**](ProgrammingExerciseStudentParticipation.md)

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


## resumeParticipation

> ProgrammingExerciseStudentParticipation resumeParticipation(exerciseId, participationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long participationId = 56L; // Long | 
        try {
            ProgrammingExerciseStudentParticipation result = apiInstance.resumeParticipation(exerciseId, participationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#resumeParticipation");
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
| **participationId** | **Long**|  | |

### Return type

[**ProgrammingExerciseStudentParticipation**](ProgrammingExerciseStudentParticipation.md)

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


## startParticipation

> CleanupBuildPlan200Response startParticipation(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            CleanupBuildPlan200Response result = apiInstance.startParticipation(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#startParticipation");
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

[**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md)

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


## startPracticeParticipation

> CleanupBuildPlan200Response startPracticeParticipation(exerciseId, useGradedParticipation)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean useGradedParticipation = false; // Boolean | 
        try {
            CleanupBuildPlan200Response result = apiInstance.startPracticeParticipation(exerciseId, useGradedParticipation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#startPracticeParticipation");
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
| **useGradedParticipation** | **Boolean**|  | [optional] [default to false] |

### Return type

[**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md)

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


## updateParticipation

> CleanupBuildPlan200Response updateParticipation(exerciseId, studentParticipation)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        StudentParticipation studentParticipation = new StudentParticipation(); // StudentParticipation | 
        try {
            CleanupBuildPlan200Response result = apiInstance.updateParticipation(exerciseId, studentParticipation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#updateParticipation");
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
| **studentParticipation** | [**StudentParticipation**](StudentParticipation.md)|  | |

### Return type

[**CleanupBuildPlan200Response**](CleanupBuildPlan200Response.md)

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


## updateParticipationDueDates

> List&lt;StudentParticipation&gt; updateParticipationDueDates(exerciseId, studentParticipation)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ParticipationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ParticipationResourceApi apiInstance = new ParticipationResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        List<StudentParticipation> studentParticipation = Arrays.asList(); // List<StudentParticipation> | 
        try {
            List<StudentParticipation> result = apiInstance.updateParticipationDueDates(exerciseId, studentParticipation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipationResourceApi#updateParticipationDueDates");
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
| **studentParticipation** | [**List&lt;StudentParticipation&gt;**](StudentParticipation.md)|  | |

### Return type

[**List&lt;StudentParticipation&gt;**](StudentParticipation.md)

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

