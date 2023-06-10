# CompetencyResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPrerequisite**](CompetencyResourceApi.md#addPrerequisite) | **POST** /api/courses/{courseId}/prerequisites/{competencyId} |  |
| [**createCompetency**](CompetencyResourceApi.md#createCompetency) | **POST** /api/courses/{courseId}/competencies |  |
| [**createCompetencyRelation**](CompetencyResourceApi.md#createCompetencyRelation) | **POST** /api/courses/{courseId}/competencies/{tailCompetencyId}/relations/{headCompetencyId} |  |
| [**deleteCompetency**](CompetencyResourceApi.md#deleteCompetency) | **DELETE** /api/courses/{courseId}/competencies/{competencyId} |  |
| [**getAllCompetenciesOnPage**](CompetencyResourceApi.md#getAllCompetenciesOnPage) | **GET** /api/competencies |  |
| [**getCompetencies**](CompetencyResourceApi.md#getCompetencies) | **GET** /api/courses/{courseId}/competencies |  |
| [**getCompetency**](CompetencyResourceApi.md#getCompetency) | **GET** /api/courses/{courseId}/competencies/{competencyId} |  |
| [**getCompetencyCourseProgress**](CompetencyResourceApi.md#getCompetencyCourseProgress) | **GET** /api/courses/{courseId}/competencies/{competencyId}/course-progress |  |
| [**getCompetencyRelations**](CompetencyResourceApi.md#getCompetencyRelations) | **GET** /api/courses/{courseId}/competencies/{competencyId}/relations |  |
| [**getCompetencyStudentProgress**](CompetencyResourceApi.md#getCompetencyStudentProgress) | **GET** /api/courses/{courseId}/competencies/{competencyId}/student-progress |  |
| [**getCompetencyTitle**](CompetencyResourceApi.md#getCompetencyTitle) | **GET** /api/competencies/{competencyId}/title |  |
| [**getPrerequisites**](CompetencyResourceApi.md#getPrerequisites) | **GET** /api/courses/{courseId}/prerequisites |  |
| [**importCompetency**](CompetencyResourceApi.md#importCompetency) | **POST** /api/courses/{courseId}/competencies/import |  |
| [**removeCompetencyRelation**](CompetencyResourceApi.md#removeCompetencyRelation) | **DELETE** /api/courses/{courseId}/competencies/{competencyId}/relations/{competencyRelationId} |  |
| [**removePrerequisite**](CompetencyResourceApi.md#removePrerequisite) | **DELETE** /api/courses/{courseId}/prerequisites/{competencyId} |  |
| [**updateCompetency**](CompetencyResourceApi.md#updateCompetency) | **PUT** /api/courses/{courseId}/competencies |  |



## addPrerequisite

> Competency addPrerequisite(competencyId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            Competency result = apiInstance.addPrerequisite(competencyId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#addPrerequisite");
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
| **competencyId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**Competency**](Competency.md)

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


## createCompetency

> Competency createCompetency(courseId, competency)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Competency competency = new Competency(); // Competency | 
        try {
            Competency result = apiInstance.createCompetency(courseId, competency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#createCompetency");
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
| **competency** | [**Competency**](Competency.md)|  | |

### Return type

[**Competency**](Competency.md)

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


## createCompetencyRelation

> CompetencyRelation createCompetencyRelation(courseId, tailCompetencyId, headCompetencyId, type)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tailCompetencyId = 56L; // Long | 
        Long headCompetencyId = 56L; // Long | 
        String type = ""; // String | 
        try {
            CompetencyRelation result = apiInstance.createCompetencyRelation(courseId, tailCompetencyId, headCompetencyId, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#createCompetencyRelation");
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
| **tailCompetencyId** | **Long**|  | |
| **headCompetencyId** | **Long**|  | |
| **type** | **String**|  | [optional] [default to ] |

### Return type

[**CompetencyRelation**](CompetencyRelation.md)

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


## deleteCompetency

> deleteCompetency(competencyId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            apiInstance.deleteCompetency(competencyId, courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#deleteCompetency");
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
| **competencyId** | **Long**|  | |
| **courseId** | **Long**|  | |

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


## getAllCompetenciesOnPage

> SearchResultPageDTOCompetency getAllCompetenciesOnPage(search)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        try {
            SearchResultPageDTOCompetency result = apiInstance.getAllCompetenciesOnPage(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getAllCompetenciesOnPage");
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

### Return type

[**SearchResultPageDTOCompetency**](SearchResultPageDTOCompetency.md)

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


## getCompetencies

> List&lt;Competency&gt; getCompetencies(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<Competency> result = apiInstance.getCompetencies(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getCompetencies");
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

[**List&lt;Competency&gt;**](Competency.md)

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


## getCompetency

> Competency getCompetency(competencyId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            Competency result = apiInstance.getCompetency(competencyId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getCompetency");
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
| **competencyId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**Competency**](Competency.md)

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


## getCompetencyCourseProgress

> CourseCompetencyProgressDTO getCompetencyCourseProgress(courseId, competencyId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long competencyId = 56L; // Long | 
        try {
            CourseCompetencyProgressDTO result = apiInstance.getCompetencyCourseProgress(courseId, competencyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getCompetencyCourseProgress");
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
| **competencyId** | **Long**|  | |

### Return type

[**CourseCompetencyProgressDTO**](CourseCompetencyProgressDTO.md)

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


## getCompetencyRelations

> Set&lt;CompetencyRelation&gt; getCompetencyRelations(competencyId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            Set<CompetencyRelation> result = apiInstance.getCompetencyRelations(competencyId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getCompetencyRelations");
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
| **competencyId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**Set&lt;CompetencyRelation&gt;**](CompetencyRelation.md)

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


## getCompetencyStudentProgress

> CompetencyProgress getCompetencyStudentProgress(courseId, competencyId, refresh)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long competencyId = 56L; // Long | 
        Boolean refresh = false; // Boolean | 
        try {
            CompetencyProgress result = apiInstance.getCompetencyStudentProgress(courseId, competencyId, refresh);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getCompetencyStudentProgress");
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
| **competencyId** | **Long**|  | |
| **refresh** | **Boolean**|  | [optional] [default to false] |

### Return type

[**CompetencyProgress**](CompetencyProgress.md)

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


## getCompetencyTitle

> String getCompetencyTitle(competencyId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        try {
            String result = apiInstance.getCompetencyTitle(competencyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getCompetencyTitle");
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
| **competencyId** | **Long**|  | |

### Return type

**String**

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


## getPrerequisites

> List&lt;Competency&gt; getPrerequisites(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<Competency> result = apiInstance.getPrerequisites(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#getPrerequisites");
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

[**List&lt;Competency&gt;**](Competency.md)

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


## importCompetency

> Competency importCompetency(courseId, competency)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Competency competency = new Competency(); // Competency | 
        try {
            Competency result = apiInstance.importCompetency(courseId, competency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#importCompetency");
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
| **competency** | [**Competency**](Competency.md)|  | |

### Return type

[**Competency**](Competency.md)

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


## removeCompetencyRelation

> removeCompetencyRelation(competencyId, courseId, competencyRelationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        Long competencyRelationId = 56L; // Long | 
        try {
            apiInstance.removeCompetencyRelation(competencyId, courseId, competencyRelationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#removeCompetencyRelation");
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
| **competencyId** | **Long**|  | |
| **courseId** | **Long**|  | |
| **competencyRelationId** | **Long**|  | |

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


## removePrerequisite

> removePrerequisite(competencyId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long competencyId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            apiInstance.removePrerequisite(competencyId, courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#removePrerequisite");
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
| **competencyId** | **Long**|  | |
| **courseId** | **Long**|  | |

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


## updateCompetency

> Competency updateCompetency(courseId, competency)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CompetencyResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CompetencyResourceApi apiInstance = new CompetencyResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Competency competency = new Competency(); // Competency | 
        try {
            Competency result = apiInstance.updateCompetency(courseId, competency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompetencyResourceApi#updateCompetency");
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
| **competency** | [**Competency**](Competency.md)|  | |

### Return type

[**Competency**](Competency.md)

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

