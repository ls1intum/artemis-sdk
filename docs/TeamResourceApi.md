# TeamResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTeam**](TeamResourceApi.md#createTeam) | **POST** /api/exercises/{exerciseId}/teams |  |
| [**deleteTeam**](TeamResourceApi.md#deleteTeam) | **DELETE** /api/exercises/{exerciseId}/teams/{teamId} |  |
| [**existsTeamByShortName**](TeamResourceApi.md#existsTeamByShortName) | **GET** /api/courses/{courseId}/teams/exists |  |
| [**getCourseWithExercisesAndParticipationsForTeam**](TeamResourceApi.md#getCourseWithExercisesAndParticipationsForTeam) | **GET** /api/courses/{courseId}/teams/{teamShortName}/with-exercises-and-participations |  |
| [**getTeam**](TeamResourceApi.md#getTeam) | **GET** /api/exercises/{exerciseId}/teams/{teamId} |  |
| [**getTeamsForExercise**](TeamResourceApi.md#getTeamsForExercise) | **GET** /api/exercises/{exerciseId}/teams |  |
| [**importTeamsFromList**](TeamResourceApi.md#importTeamsFromList) | **PUT** /api/exercises/{exerciseId}/teams/import-from-list |  |
| [**importTeamsFromSourceExercise**](TeamResourceApi.md#importTeamsFromSourceExercise) | **PUT** /api/exercises/{destinationExerciseId}/teams/import-from-exercise/{sourceExerciseId} |  |
| [**searchTeamInExercise**](TeamResourceApi.md#searchTeamInExercise) | **GET** /api/courses/{courseId}/exercises/{exerciseId}/team-search-users |  |
| [**updateTeam**](TeamResourceApi.md#updateTeam) | **PUT** /api/exercises/{exerciseId}/teams/{teamId} |  |



## createTeam

> Team createTeam(exerciseId, team)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Team team = new Team(); // Team | 
        try {
            Team result = apiInstance.createTeam(exerciseId, team);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#createTeam");
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
| **team** | [**Team**](Team.md)|  | |

### Return type

[**Team**](Team.md)

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


## deleteTeam

> deleteTeam(exerciseId, teamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long teamId = 56L; // Long | 
        try {
            apiInstance.deleteTeam(exerciseId, teamId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#deleteTeam");
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
| **teamId** | **Long**|  | |

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


## existsTeamByShortName

> Boolean existsTeamByShortName(courseId, shortName)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String shortName = "shortName_example"; // String | 
        try {
            Boolean result = apiInstance.existsTeamByShortName(courseId, shortName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#existsTeamByShortName");
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
| **shortName** | **String**|  | |

### Return type

**Boolean**

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


## getCourseWithExercisesAndParticipationsForTeam

> Course getCourseWithExercisesAndParticipationsForTeam(courseId, teamShortName)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String teamShortName = "teamShortName_example"; // String | 
        try {
            Course result = apiInstance.getCourseWithExercisesAndParticipationsForTeam(courseId, teamShortName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#getCourseWithExercisesAndParticipationsForTeam");
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
| **teamShortName** | **String**|  | |

### Return type

[**Course**](Course.md)

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


## getTeam

> Team getTeam(exerciseId, teamId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long teamId = 56L; // Long | 
        try {
            Team result = apiInstance.getTeam(exerciseId, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#getTeam");
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
| **teamId** | **Long**|  | |

### Return type

[**Team**](Team.md)

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


## getTeamsForExercise

> List&lt;Team&gt; getTeamsForExercise(exerciseId, teamOwnerId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long teamOwnerId = 56L; // Long | 
        try {
            List<Team> result = apiInstance.getTeamsForExercise(exerciseId, teamOwnerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#getTeamsForExercise");
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
| **teamOwnerId** | **Long**|  | [optional] |

### Return type

[**List&lt;Team&gt;**](Team.md)

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


## importTeamsFromList

> List&lt;Team&gt; importTeamsFromList(exerciseId, importStrategyType, team)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        String importStrategyType = "PURGE_EXISTING"; // String | 
        List<Team> team = Arrays.asList(); // List<Team> | 
        try {
            List<Team> result = apiInstance.importTeamsFromList(exerciseId, importStrategyType, team);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#importTeamsFromList");
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
| **importStrategyType** | **String**|  | [enum: PURGE_EXISTING, CREATE_ONLY] |
| **team** | [**List&lt;Team&gt;**](Team.md)|  | |

### Return type

[**List&lt;Team&gt;**](Team.md)

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


## importTeamsFromSourceExercise

> List&lt;Team&gt; importTeamsFromSourceExercise(destinationExerciseId, sourceExerciseId, importStrategyType)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long destinationExerciseId = 56L; // Long | 
        Long sourceExerciseId = 56L; // Long | 
        String importStrategyType = "PURGE_EXISTING"; // String | 
        try {
            List<Team> result = apiInstance.importTeamsFromSourceExercise(destinationExerciseId, sourceExerciseId, importStrategyType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#importTeamsFromSourceExercise");
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
| **destinationExerciseId** | **Long**|  | |
| **sourceExerciseId** | **Long**|  | |
| **importStrategyType** | **String**|  | [enum: PURGE_EXISTING, CREATE_ONLY] |

### Return type

[**List&lt;Team&gt;**](Team.md)

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


## searchTeamInExercise

> List&lt;TeamSearchUserDTO&gt; searchTeamInExercise(courseId, exerciseId, loginOrName)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long exerciseId = 56L; // Long | 
        String loginOrName = "loginOrName_example"; // String | 
        try {
            List<TeamSearchUserDTO> result = apiInstance.searchTeamInExercise(courseId, exerciseId, loginOrName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#searchTeamInExercise");
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
| **exerciseId** | **Long**|  | |
| **loginOrName** | **String**|  | |

### Return type

[**List&lt;TeamSearchUserDTO&gt;**](TeamSearchUserDTO.md)

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


## updateTeam

> Team updateTeam(exerciseId, teamId, team)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TeamResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TeamResourceApi apiInstance = new TeamResourceApi(defaultClient);
        Long exerciseId = 56L; // Long | 
        Long teamId = 56L; // Long | 
        Team team = new Team(); // Team | 
        try {
            Team result = apiInstance.updateTeam(exerciseId, teamId, team);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamResourceApi#updateTeam");
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
| **teamId** | **Long**|  | |
| **team** | [**Team**](Team.md)|  | |

### Return type

[**Team**](Team.md)

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

