# ProgrammingExerciseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**combineTemplateRepositoryCommits**](ProgrammingExerciseResourceApi.md#combineTemplateRepositoryCommits) | **PUT** /api/programming-exercises/{exerciseId}/combine-template-commits |  |
| [**createProgrammingExercise**](ProgrammingExerciseResourceApi.md#createProgrammingExercise) | **POST** /api/programming-exercises/setup |  |
| [**deleteProgrammingExercise**](ProgrammingExerciseResourceApi.md#deleteProgrammingExercise) | **DELETE** /api/programming-exercises/{exerciseId} |  |
| [**deleteTaskWithSolutionEntries**](ProgrammingExerciseResourceApi.md#deleteTaskWithSolutionEntries) | **DELETE** /api/programming-exercises/{exerciseId}/tasks |  |
| [**generateStructureOracleForExercise**](ProgrammingExerciseResourceApi.md#generateStructureOracleForExercise) | **PUT** /api/programming-exercises/{exerciseId}/generate-tests |  |
| [**getAllExercisesOnPage2**](ProgrammingExerciseResourceApi.md#getAllExercisesOnPage2) | **GET** /api/programming-exercises |  |
| [**getAllExercisesWithSCAOnPage**](ProgrammingExerciseResourceApi.md#getAllExercisesWithSCAOnPage) | **GET** /api/programming-exercises/with-sca |  |
| [**getAuxiliaryRepositories**](ProgrammingExerciseResourceApi.md#getAuxiliaryRepositories) | **GET** /api/programming-exercises/{exerciseId}/auxiliary-repository |  |
| [**getBuildLogStatistics**](ProgrammingExerciseResourceApi.md#getBuildLogStatistics) | **GET** /api/programming-exercises/{exerciseId}/build-log-statistics |  |
| [**getProgrammingExercise**](ProgrammingExerciseResourceApi.md#getProgrammingExercise) | **GET** /api/programming-exercises/{exerciseId} |  |
| [**getProgrammingExerciseWithSetupParticipations**](ProgrammingExerciseResourceApi.md#getProgrammingExerciseWithSetupParticipations) | **GET** /api/programming-exercises/{exerciseId}/with-participations |  |
| [**getProgrammingExerciseWithTemplateAndSolutionParticipation**](ProgrammingExerciseResourceApi.md#getProgrammingExerciseWithTemplateAndSolutionParticipation) | **GET** /api/programming-exercises/{exerciseId}/with-template-and-solution-participation |  |
| [**getProgrammingExercisesForCourse**](ProgrammingExerciseResourceApi.md#getProgrammingExercisesForCourse) | **GET** /api/courses/{courseId}/programming-exercises |  |
| [**hasAtLeastOneStudentResult**](ProgrammingExerciseResourceApi.md#hasAtLeastOneStudentResult) | **GET** /api/programming-exercises/{exerciseId}/test-case-state |  |
| [**lockAllRepositories**](ProgrammingExerciseResourceApi.md#lockAllRepositories) | **PUT** /api/programming-exercises/{exerciseId}/lock-all-repositories |  |
| [**reEvaluateAndUpdateProgrammingExercise**](ProgrammingExerciseResourceApi.md#reEvaluateAndUpdateProgrammingExercise) | **PUT** /api/programming-exercises/{exerciseId}/re-evaluate |  |
| [**recreateBuildPlans**](ProgrammingExerciseResourceApi.md#recreateBuildPlans) | **PUT** /api/programming-exercises/{exerciseId}/recreate-build-plans |  |
| [**unlockAllRepositories**](ProgrammingExerciseResourceApi.md#unlockAllRepositories) | **PUT** /api/programming-exercises/{exerciseId}/unlock-all-repositories |  |
| [**updateProblemStatement**](ProgrammingExerciseResourceApi.md#updateProblemStatement) | **PATCH** /api/programming-exercises/{exerciseId}/problem-statement |  |
| [**updateProgrammingExercise**](ProgrammingExerciseResourceApi.md#updateProgrammingExercise) | **PUT** /api/programming-exercises |  |
| [**updateProgrammingExerciseTimeline**](ProgrammingExerciseResourceApi.md#updateProgrammingExerciseTimeline) | **PUT** /api/programming-exercises/timeline |  |



## combineTemplateRepositoryCommits

> combineTemplateRepositoryCommits(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.combineTemplateRepositoryCommits(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#combineTemplateRepositoryCommits");
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


## createProgrammingExercise

> ProgrammingExercise createProgrammingExercise(programmingExercise)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        ProgrammingExercise programmingExercise = new ProgrammingExercise(); // ProgrammingExercise | 
        try {
            ProgrammingExercise result = apiInstance.createProgrammingExercise(programmingExercise);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#createProgrammingExercise");
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
| **programmingExercise** | [**ProgrammingExercise**](ProgrammingExercise.md)|  | |

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


## deleteProgrammingExercise

> deleteProgrammingExercise(exerciseId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean deleteStudentReposBuildPlans = false; // Boolean | 
        Boolean deleteBaseReposBuildPlans = false; // Boolean | 
        try {
            apiInstance.deleteProgrammingExercise(exerciseId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#deleteProgrammingExercise");
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
| **deleteStudentReposBuildPlans** | **Boolean**|  | [optional] [default to false] |
| **deleteBaseReposBuildPlans** | **Boolean**|  | [optional] [default to false] |

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


## deleteTaskWithSolutionEntries

> deleteTaskWithSolutionEntries(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.deleteTaskWithSolutionEntries(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#deleteTaskWithSolutionEntries");
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


## generateStructureOracleForExercise

> String generateStructureOracleForExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            String result = apiInstance.generateStructureOracleForExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#generateStructureOracleForExercise");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## getAllExercisesOnPage2

> SearchResultPageDTOProgrammingExercise getAllExercisesOnPage2(search, isCourseFilter, isExamFilter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        Boolean isCourseFilter = true; // Boolean | 
        Boolean isExamFilter = true; // Boolean | 
        try {
            SearchResultPageDTOProgrammingExercise result = apiInstance.getAllExercisesOnPage2(search, isCourseFilter, isExamFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getAllExercisesOnPage2");
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
| **search** | [**PageableSearchDTOString**](PageableSearchDTOString.md)|  | |
| **isCourseFilter** | **Boolean**|  | [optional] [default to true] |
| **isExamFilter** | **Boolean**|  | [optional] [default to true] |

### Return type

[**SearchResultPageDTOProgrammingExercise**](SearchResultPageDTOProgrammingExercise.md)

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


## getAllExercisesWithSCAOnPage

> SearchResultPageDTOProgrammingExercise getAllExercisesWithSCAOnPage(search, programmingLanguage, isCourseFilter, isExamFilter)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        String programmingLanguage = "JAVA"; // String | 
        Boolean isCourseFilter = true; // Boolean | 
        Boolean isExamFilter = true; // Boolean | 
        try {
            SearchResultPageDTOProgrammingExercise result = apiInstance.getAllExercisesWithSCAOnPage(search, programmingLanguage, isCourseFilter, isExamFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getAllExercisesWithSCAOnPage");
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
| **search** | [**PageableSearchDTOString**](PageableSearchDTOString.md)|  | |
| **programmingLanguage** | **String**|  | [enum: JAVA, PYTHON, C, HASKELL, KOTLIN, VHDL, ASSEMBLER, SWIFT, OCAML, EMPTY] |
| **isCourseFilter** | **Boolean**|  | [optional] [default to true] |
| **isExamFilter** | **Boolean**|  | [optional] [default to true] |

### Return type

[**SearchResultPageDTOProgrammingExercise**](SearchResultPageDTOProgrammingExercise.md)

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


## getAuxiliaryRepositories

> List&lt;AuxiliaryRepository&gt; getAuxiliaryRepositories(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            List<AuxiliaryRepository> result = apiInstance.getAuxiliaryRepositories(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getAuxiliaryRepositories");
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

[**List&lt;AuxiliaryRepository&gt;**](AuxiliaryRepository.md)

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


## getBuildLogStatistics

> BuildLogStatisticsDTO getBuildLogStatistics(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            BuildLogStatisticsDTO result = apiInstance.getBuildLogStatistics(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getBuildLogStatistics");
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

[**BuildLogStatisticsDTO**](BuildLogStatisticsDTO.md)

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


## getProgrammingExercise

> ProgrammingExercise getProgrammingExercise(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ProgrammingExercise result = apiInstance.getProgrammingExercise(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getProgrammingExercise");
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

[**ProgrammingExercise**](ProgrammingExercise.md)

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


## getProgrammingExerciseWithSetupParticipations

> ProgrammingExercise getProgrammingExerciseWithSetupParticipations(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ProgrammingExercise result = apiInstance.getProgrammingExerciseWithSetupParticipations(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getProgrammingExerciseWithSetupParticipations");
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

[**ProgrammingExercise**](ProgrammingExercise.md)

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


## getProgrammingExerciseWithTemplateAndSolutionParticipation

> ProgrammingExercise getProgrammingExerciseWithTemplateAndSolutionParticipation(exerciseId, withSubmissionResults)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Boolean withSubmissionResults = false; // Boolean | 
        try {
            ProgrammingExercise result = apiInstance.getProgrammingExerciseWithTemplateAndSolutionParticipation(exerciseId, withSubmissionResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getProgrammingExerciseWithTemplateAndSolutionParticipation");
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
| **withSubmissionResults** | **Boolean**|  | [optional] [default to false] |

### Return type

[**ProgrammingExercise**](ProgrammingExercise.md)

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


## getProgrammingExercisesForCourse

> List&lt;ProgrammingExercise&gt; getProgrammingExercisesForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<ProgrammingExercise> result = apiInstance.getProgrammingExercisesForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#getProgrammingExercisesForCourse");
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

[**List&lt;ProgrammingExercise&gt;**](ProgrammingExercise.md)

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


## hasAtLeastOneStudentResult

> ProgrammingExerciseTestCaseStateDTO hasAtLeastOneStudentResult(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            ProgrammingExerciseTestCaseStateDTO result = apiInstance.hasAtLeastOneStudentResult(exerciseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#hasAtLeastOneStudentResult");
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

[**ProgrammingExerciseTestCaseStateDTO**](ProgrammingExerciseTestCaseStateDTO.md)

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


## lockAllRepositories

> lockAllRepositories(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.lockAllRepositories(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#lockAllRepositories");
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


## reEvaluateAndUpdateProgrammingExercise

> ProgrammingExercise reEvaluateAndUpdateProgrammingExercise(exerciseId, programmingExercise, deleteFeedback)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        ProgrammingExercise programmingExercise = new ProgrammingExercise(); // ProgrammingExercise | 
        Boolean deleteFeedback = true; // Boolean | 
        try {
            ProgrammingExercise result = apiInstance.reEvaluateAndUpdateProgrammingExercise(exerciseId, programmingExercise, deleteFeedback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#reEvaluateAndUpdateProgrammingExercise");
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
| **programmingExercise** | [**ProgrammingExercise**](ProgrammingExercise.md)|  | |
| **deleteFeedback** | **Boolean**|  | [optional] |

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


## recreateBuildPlans

> recreateBuildPlans(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.recreateBuildPlans(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#recreateBuildPlans");
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


## unlockAllRepositories

> unlockAllRepositories(exerciseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        try {
            apiInstance.unlockAllRepositories(exerciseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#unlockAllRepositories");
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


## updateProblemStatement

> ProgrammingExercise updateProblemStatement(exerciseId, body, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String body = "body_example"; // String | 
        String notificationText = "notificationText_example"; // String | 
        try {
            ProgrammingExercise result = apiInstance.updateProblemStatement(exerciseId, body, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#updateProblemStatement");
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
| **body** | **String**|  | |
| **notificationText** | **String**|  | [optional] |

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


## updateProgrammingExercise

> ProgrammingExercise updateProgrammingExercise(programmingExercise, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        ProgrammingExercise programmingExercise = new ProgrammingExercise(); // ProgrammingExercise | 
        String notificationText = "notificationText_example"; // String | 
        try {
            ProgrammingExercise result = apiInstance.updateProgrammingExercise(programmingExercise, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#updateProgrammingExercise");
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
| **programmingExercise** | [**ProgrammingExercise**](ProgrammingExercise.md)|  | |
| **notificationText** | **String**|  | [optional] |

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


## updateProgrammingExerciseTimeline

> ProgrammingExercise updateProgrammingExerciseTimeline(programmingExercise, notificationText)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.ProgrammingExerciseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProgrammingExerciseResourceApi apiInstance = new ProgrammingExerciseResourceApi(defaultClient);
        ProgrammingExercise programmingExercise = new ProgrammingExercise(); // ProgrammingExercise | 
        String notificationText = "notificationText_example"; // String | 
        try {
            ProgrammingExercise result = apiInstance.updateProgrammingExerciseTimeline(programmingExercise, notificationText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammingExerciseResourceApi#updateProgrammingExerciseTimeline");
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
| **programmingExercise** | [**ProgrammingExercise**](ProgrammingExercise.md)|  | |
| **notificationText** | **String**|  | [optional] |

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

