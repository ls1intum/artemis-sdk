# LearningGoalResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPrerequisite**](LearningGoalResourceApi.md#addPrerequisite) | **POST** /api/courses/{courseId}/prerequisites/{learningGoalId} |  |
| [**createLearningGoal**](LearningGoalResourceApi.md#createLearningGoal) | **POST** /api/courses/{courseId}/learning-goals |  |
| [**createLearningGoalRelation**](LearningGoalResourceApi.md#createLearningGoalRelation) | **POST** /api/courses/{courseId}/learning-goals/{tailLearningGoalId}/relations/{headLearningGoalId} |  |
| [**deleteLearningGoal**](LearningGoalResourceApi.md#deleteLearningGoal) | **DELETE** /api/courses/{courseId}/learning-goals/{learningGoalId} |  |
| [**getAllLecturesOnPage1**](LearningGoalResourceApi.md#getAllLecturesOnPage1) | **GET** /api/learning-goals |  |
| [**getLearningGoal**](LearningGoalResourceApi.md#getLearningGoal) | **GET** /api/courses/{courseId}/learning-goals/{learningGoalId} |  |
| [**getLearningGoalCourseProgress**](LearningGoalResourceApi.md#getLearningGoalCourseProgress) | **GET** /api/courses/{courseId}/learning-goals/{learningGoalId}/course-progress |  |
| [**getLearningGoalRelations**](LearningGoalResourceApi.md#getLearningGoalRelations) | **GET** /api/courses/{courseId}/learning-goals/{learningGoalId}/relations |  |
| [**getLearningGoalStudentProgress**](LearningGoalResourceApi.md#getLearningGoalStudentProgress) | **GET** /api/courses/{courseId}/learning-goals/{learningGoalId}/student-progress |  |
| [**getLearningGoalTitle**](LearningGoalResourceApi.md#getLearningGoalTitle) | **GET** /api/learning-goals/{learningGoalId}/title |  |
| [**getLearningGoals**](LearningGoalResourceApi.md#getLearningGoals) | **GET** /api/courses/{courseId}/learning-goals |  |
| [**getPrerequisites**](LearningGoalResourceApi.md#getPrerequisites) | **GET** /api/courses/{courseId}/prerequisites |  |
| [**removeLearningGoalRelation**](LearningGoalResourceApi.md#removeLearningGoalRelation) | **DELETE** /api/courses/{courseId}/learning-goals/{learningGoalId}/relations/{learningGoalRelationId} |  |
| [**removePrerequisite**](LearningGoalResourceApi.md#removePrerequisite) | **DELETE** /api/courses/{courseId}/prerequisites/{learningGoalId} |  |
| [**updateLearningGoal**](LearningGoalResourceApi.md#updateLearningGoal) | **PUT** /api/courses/{courseId}/learning-goals |  |



## addPrerequisite

> LearningGoal addPrerequisite(learningGoalId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            LearningGoal result = apiInstance.addPrerequisite(learningGoalId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#addPrerequisite");
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
| **learningGoalId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**LearningGoal**](LearningGoal.md)

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


## createLearningGoal

> LearningGoal createLearningGoal(courseId, learningGoal)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        LearningGoal learningGoal = new LearningGoal(); // LearningGoal | 
        try {
            LearningGoal result = apiInstance.createLearningGoal(courseId, learningGoal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#createLearningGoal");
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
| **learningGoal** | [**LearningGoal**](LearningGoal.md)|  | |

### Return type

[**LearningGoal**](LearningGoal.md)

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


## createLearningGoalRelation

> LearningGoalRelation createLearningGoalRelation(courseId, tailLearningGoalId, headLearningGoalId, type)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tailLearningGoalId = 56L; // Long | 
        Long headLearningGoalId = 56L; // Long | 
        String type = ""; // String | 
        try {
            LearningGoalRelation result = apiInstance.createLearningGoalRelation(courseId, tailLearningGoalId, headLearningGoalId, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#createLearningGoalRelation");
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
| **tailLearningGoalId** | **Long**|  | |
| **headLearningGoalId** | **Long**|  | |
| **type** | **String**|  | [optional] [default to ] |

### Return type

[**LearningGoalRelation**](LearningGoalRelation.md)

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


## deleteLearningGoal

> deleteLearningGoal(learningGoalId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            apiInstance.deleteLearningGoal(learningGoalId, courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#deleteLearningGoal");
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
| **learningGoalId** | **Long**|  | |
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


## getAllLecturesOnPage1

> SearchResultPageDTOLearningGoal getAllLecturesOnPage1(search)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        try {
            SearchResultPageDTOLearningGoal result = apiInstance.getAllLecturesOnPage1(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getAllLecturesOnPage1");
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

[**SearchResultPageDTOLearningGoal**](SearchResultPageDTOLearningGoal.md)

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


## getLearningGoal

> LearningGoal getLearningGoal(learningGoalId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            LearningGoal result = apiInstance.getLearningGoal(learningGoalId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getLearningGoal");
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
| **learningGoalId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**LearningGoal**](LearningGoal.md)

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


## getLearningGoalCourseProgress

> CourseLearningGoalProgressDTO getLearningGoalCourseProgress(courseId, learningGoalId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long learningGoalId = 56L; // Long | 
        try {
            CourseLearningGoalProgressDTO result = apiInstance.getLearningGoalCourseProgress(courseId, learningGoalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getLearningGoalCourseProgress");
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
| **learningGoalId** | **Long**|  | |

### Return type

[**CourseLearningGoalProgressDTO**](CourseLearningGoalProgressDTO.md)

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


## getLearningGoalRelations

> Set&lt;LearningGoalRelation&gt; getLearningGoalRelations(learningGoalId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            Set<LearningGoalRelation> result = apiInstance.getLearningGoalRelations(learningGoalId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getLearningGoalRelations");
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
| **learningGoalId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**Set&lt;LearningGoalRelation&gt;**](LearningGoalRelation.md)

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


## getLearningGoalStudentProgress

> LearningGoalProgress getLearningGoalStudentProgress(courseId, learningGoalId, refresh)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long learningGoalId = 56L; // Long | 
        Boolean refresh = false; // Boolean | 
        try {
            LearningGoalProgress result = apiInstance.getLearningGoalStudentProgress(courseId, learningGoalId, refresh);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getLearningGoalStudentProgress");
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
| **learningGoalId** | **Long**|  | |
| **refresh** | **Boolean**|  | [optional] [default to false] |

### Return type

[**LearningGoalProgress**](LearningGoalProgress.md)

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


## getLearningGoalTitle

> String getLearningGoalTitle(learningGoalId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        try {
            String result = apiInstance.getLearningGoalTitle(learningGoalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getLearningGoalTitle");
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
| **learningGoalId** | **Long**|  | |

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


## getLearningGoals

> List&lt;LearningGoal&gt; getLearningGoals(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<LearningGoal> result = apiInstance.getLearningGoals(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getLearningGoals");
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

[**List&lt;LearningGoal&gt;**](LearningGoal.md)

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

> List&lt;LearningGoal&gt; getPrerequisites(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<LearningGoal> result = apiInstance.getPrerequisites(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#getPrerequisites");
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

[**List&lt;LearningGoal&gt;**](LearningGoal.md)

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


## removeLearningGoalRelation

> removeLearningGoalRelation(learningGoalId, courseId, learningGoalRelationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        Long learningGoalRelationId = 56L; // Long | 
        try {
            apiInstance.removeLearningGoalRelation(learningGoalId, courseId, learningGoalRelationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#removeLearningGoalRelation");
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
| **learningGoalId** | **Long**|  | |
| **courseId** | **Long**|  | |
| **learningGoalRelationId** | **Long**|  | |

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

> removePrerequisite(learningGoalId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long learningGoalId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            apiInstance.removePrerequisite(learningGoalId, courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#removePrerequisite");
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
| **learningGoalId** | **Long**|  | |
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


## updateLearningGoal

> LearningGoal updateLearningGoal(courseId, learningGoal)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LearningGoalResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LearningGoalResourceApi apiInstance = new LearningGoalResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        LearningGoal learningGoal = new LearningGoal(); // LearningGoal | 
        try {
            LearningGoal result = apiInstance.updateLearningGoal(courseId, learningGoal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LearningGoalResourceApi#updateLearningGoal");
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
| **learningGoal** | [**LearningGoal**](LearningGoal.md)|  | |

### Return type

[**LearningGoal**](LearningGoal.md)

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

