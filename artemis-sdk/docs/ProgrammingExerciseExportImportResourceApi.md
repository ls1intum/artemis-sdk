# ProgrammingExerciseExportImportResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportInstructorAuxiliaryRepository**](ProgrammingExerciseExportImportResourceApi.md#exportInstructorAuxiliaryRepository) | **GET** /api/programming-exercises/{exerciseId}/export-instructor-auxiliary-repository/{repositoryId} |  |
| [**exportInstructorExercise**](ProgrammingExerciseExportImportResourceApi.md#exportInstructorExercise) | **GET** /api/programming-exercises/{exerciseId}/export-instructor-exercise |  |
| [**exportInstructorRepository**](ProgrammingExerciseExportImportResourceApi.md#exportInstructorRepository) | **GET** /api/programming-exercises/{exerciseId}/export-instructor-repository/{repositoryType} |  |
| [**exportStudentRequestedRepository**](ProgrammingExerciseExportImportResourceApi.md#exportStudentRequestedRepository) | **GET** /api/programming-exercises/{exerciseId}/export-student-requested-repository |  |
| [**exportSubmissionsByParticipationIds**](ProgrammingExerciseExportImportResourceApi.md#exportSubmissionsByParticipationIds) | **POST** /api/programming-exercises/{exerciseId}/export-repos-by-participation-ids/{participationIds} |  |
| [**exportSubmissionsByStudentLogins**](ProgrammingExerciseExportImportResourceApi.md#exportSubmissionsByStudentLogins) | **POST** /api/programming-exercises/{exerciseId}/export-repos-by-participant-identifiers/{participantIdentifiers} |  |
| [**importProgrammingExercise**](ProgrammingExerciseExportImportResourceApi.md#importProgrammingExercise) | **POST** /api/programming-exercises/import/{sourceExerciseId} |  |



## exportInstructorAuxiliaryRepository

> File exportInstructorAuxiliaryRepository(exerciseId, repositoryId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long repositoryId = 56L; // Long | 
        try {
            File result = apiInstance.exportInstructorAuxiliaryRepository(exerciseId, repositoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#exportInstructorAuxiliaryRepository");
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
| **repositoryId** | **Long**|  | |

### Return type

[**File**](File.md)

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


## exportInstructorExercise

> File exportInstructorExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            File result = apiInstance.exportInstructorExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#exportInstructorExercise");
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

[**File**](File.md)

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


## exportInstructorRepository

> File exportInstructorRepository(exerciseId, repositoryType)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String repositoryType = "exercise"; // String | 
        try {
            File result = apiInstance.exportInstructorRepository(exerciseId, repositoryType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#exportInstructorRepository");
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
| **repositoryType** | **String**|  | [enum: exercise, solution, tests, auxiliary] |

### Return type

[**File**](File.md)

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


## exportStudentRequestedRepository

> File exportStudentRequestedRepository(exerciseId, includeTests)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean includeTests = true; // Boolean | 
        try {
            File result = apiInstance.exportStudentRequestedRepository(exerciseId, includeTests);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#exportStudentRequestedRepository");
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
| **includeTests** | **Boolean**|  | |

### Return type

[**File**](File.md)

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


## exportSubmissionsByParticipationIds

> File exportSubmissionsByParticipationIds(exerciseId, participationIds, repositoryExportOptionsDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String participationIds = "participationIds_example"; // String | 
        RepositoryExportOptionsDTO repositoryExportOptionsDTO = new RepositoryExportOptionsDTO(); // RepositoryExportOptionsDTO | 
        try {
            File result = apiInstance.exportSubmissionsByParticipationIds(exerciseId, participationIds, repositoryExportOptionsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#exportSubmissionsByParticipationIds");
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
| **participationIds** | **String**|  | |
| **repositoryExportOptionsDTO** | [**RepositoryExportOptionsDTO**](RepositoryExportOptionsDTO.md)|  | |

### Return type

[**File**](File.md)

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


## exportSubmissionsByStudentLogins

> File exportSubmissionsByStudentLogins(exerciseId, participantIdentifiers, repositoryExportOptionsDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String participantIdentifiers = "participantIdentifiers_example"; // String | 
        RepositoryExportOptionsDTO repositoryExportOptionsDTO = new RepositoryExportOptionsDTO(); // RepositoryExportOptionsDTO | 
        try {
            File result = apiInstance.exportSubmissionsByStudentLogins(exerciseId, participantIdentifiers, repositoryExportOptionsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#exportSubmissionsByStudentLogins");
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
| **participantIdentifiers** | **String**|  | |
| **repositoryExportOptionsDTO** | [**RepositoryExportOptionsDTO**](RepositoryExportOptionsDTO.md)|  | |

### Return type

[**File**](File.md)

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


## importProgrammingExercise

> ProgrammingExercise importProgrammingExercise(sourceExerciseId, programmingExercise, recreateBuildPlans, updateTemplate)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseExportImportResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseExportImportResourceApi apiInstance = new ProgrammingExerciseExportImportResourceApi(defaultClient);
        Long sourceExerciseId = 56L; // Long | 
        ProgrammingExercise programmingExercise = new ProgrammingExercise(); // ProgrammingExercise | 
        Boolean recreateBuildPlans = false; // Boolean | 
        Boolean updateTemplate = false; // Boolean | 
        try {
            ProgrammingExercise result = apiInstance.importProgrammingExercise(sourceExerciseId, programmingExercise, recreateBuildPlans, updateTemplate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseExportImportResourceApi#importProgrammingExercise");
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
| **sourceExerciseId** | **Long**|  | |
| **programmingExercise** | [**ProgrammingExercise**](ProgrammingExercise.md)|  | |
| **recreateBuildPlans** | **Boolean**|  | [optional] [default to false] |
| **updateTemplate** | **Boolean**|  | [optional] [default to false] |

### Return type

[**ProgrammingExercise**](ProgrammingExercise.md)

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

