# TutorialGroupResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](TutorialGroupResourceApi.md#create) | **POST** /api/courses/{courseId}/tutorial-groups |  |
| [**delete**](TutorialGroupResourceApi.md#delete) | **DELETE** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId} |  |
| [**deregisterStudent**](TutorialGroupResourceApi.md#deregisterStudent) | **DELETE** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/deregister/{studentLogin} |  |
| [**getAllForCourse**](TutorialGroupResourceApi.md#getAllForCourse) | **GET** /api/courses/{courseId}/tutorial-groups |  |
| [**getAllTutorialGroupsForNotifications**](TutorialGroupResourceApi.md#getAllTutorialGroupsForNotifications) | **GET** /api/tutorial-groups/for-notifications |  |
| [**getOneOfCourse**](TutorialGroupResourceApi.md#getOneOfCourse) | **GET** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId} |  |
| [**getTitle**](TutorialGroupResourceApi.md#getTitle) | **GET** /api/tutorial-groups/{tutorialGroupId}/title |  |
| [**getUniqueCampusValues**](TutorialGroupResourceApi.md#getUniqueCampusValues) | **GET** /api/courses/{courseId}/tutorial-groups/campus-values |  |
| [**getUniqueLanguageValues**](TutorialGroupResourceApi.md#getUniqueLanguageValues) | **GET** /api/courses/{courseId}/tutorial-groups/language-values |  |
| [**importRegistrations**](TutorialGroupResourceApi.md#importRegistrations) | **POST** /api/courses/{courseId}/tutorial-groups/import |  |
| [**registerMultipleStudentsToTutorialGroup**](TutorialGroupResourceApi.md#registerMultipleStudentsToTutorialGroup) | **POST** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/register-multiple |  |
| [**registerStudent**](TutorialGroupResourceApi.md#registerStudent) | **POST** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/register/{studentLogin} |  |
| [**update**](TutorialGroupResourceApi.md#update) | **PUT** /api/courses/{courseId}/tutorial-groups/{tutorialGroupId} |  |



## create

> TutorialGroup create(courseId, tutorialGroup)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        TutorialGroup tutorialGroup = new TutorialGroup(); // TutorialGroup | 
        try {
            TutorialGroup result = apiInstance.create(courseId, tutorialGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#create");
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
| **tutorialGroup** | [**TutorialGroup**](TutorialGroup.md)|  | |

### Return type

[**TutorialGroup**](TutorialGroup.md)

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


## delete

> delete(courseId, tutorialGroupId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        try {
            apiInstance.delete(courseId, tutorialGroupId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#delete");
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
| **tutorialGroupId** | **Long**|  | |

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


## deregisterStudent

> deregisterStudent(courseId, tutorialGroupId, studentLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        try {
            apiInstance.deregisterStudent(courseId, tutorialGroupId, studentLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#deregisterStudent");
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
| **tutorialGroupId** | **Long**|  | |
| **studentLogin** | **String**|  | |

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


## getAllForCourse

> List&lt;TutorialGroup&gt; getAllForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<TutorialGroup> result = apiInstance.getAllForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#getAllForCourse");
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

[**List&lt;TutorialGroup&gt;**](TutorialGroup.md)

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


## getAllTutorialGroupsForNotifications

> List&lt;TutorialGroup&gt; getAllTutorialGroupsForNotifications()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        try {
            List<TutorialGroup> result = apiInstance.getAllTutorialGroupsForNotifications();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#getAllTutorialGroupsForNotifications");
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

[**List&lt;TutorialGroup&gt;**](TutorialGroup.md)

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


## getOneOfCourse

> TutorialGroup getOneOfCourse(courseId, tutorialGroupId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        try {
            TutorialGroup result = apiInstance.getOneOfCourse(courseId, tutorialGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#getOneOfCourse");
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
| **tutorialGroupId** | **Long**|  | |

### Return type

[**TutorialGroup**](TutorialGroup.md)

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


## getTitle

> String getTitle(tutorialGroupId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long tutorialGroupId = 56L; // Long | 
        try {
            String result = apiInstance.getTitle(tutorialGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#getTitle");
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
| **tutorialGroupId** | **Long**|  | |

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


## getUniqueCampusValues

> Set&lt;String&gt; getUniqueCampusValues(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Set<String> result = apiInstance.getUniqueCampusValues(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#getUniqueCampusValues");
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

**Set&lt;String&gt;**

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


## getUniqueLanguageValues

> Set&lt;String&gt; getUniqueLanguageValues(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Set<String> result = apiInstance.getUniqueLanguageValues(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#getUniqueLanguageValues");
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

**Set&lt;String&gt;**

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


## importRegistrations

> List&lt;TutorialGroupRegistrationImportDTO&gt; importRegistrations(courseId, tutorialGroupRegistrationImportDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Set<TutorialGroupRegistrationImportDTO> tutorialGroupRegistrationImportDTO = Arrays.asList(); // Set<TutorialGroupRegistrationImportDTO> | 
        try {
            List<TutorialGroupRegistrationImportDTO> result = apiInstance.importRegistrations(courseId, tutorialGroupRegistrationImportDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#importRegistrations");
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
| **tutorialGroupRegistrationImportDTO** | [**List&lt;TutorialGroupRegistrationImportDTO&gt;**](TutorialGroupRegistrationImportDTO.md)|  | |

### Return type

[**List&lt;TutorialGroupRegistrationImportDTO&gt;**](TutorialGroupRegistrationImportDTO.md)

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


## registerMultipleStudentsToTutorialGroup

> Set&lt;StudentDTO&gt; registerMultipleStudentsToTutorialGroup(courseId, tutorialGroupId, studentDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        Set<StudentDTO> studentDTO = Arrays.asList(); // Set<StudentDTO> | 
        try {
            Set<StudentDTO> result = apiInstance.registerMultipleStudentsToTutorialGroup(courseId, tutorialGroupId, studentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#registerMultipleStudentsToTutorialGroup");
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
| **tutorialGroupId** | **Long**|  | |
| **studentDTO** | [**List&lt;StudentDTO&gt;**](StudentDTO.md)|  | |

### Return type

[**Set&lt;StudentDTO&gt;**](StudentDTO.md)

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


## registerStudent

> registerStudent(courseId, tutorialGroupId, studentLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        try {
            apiInstance.registerStudent(courseId, tutorialGroupId, studentLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#registerStudent");
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
| **tutorialGroupId** | **Long**|  | |
| **studentLogin** | **String**|  | |

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


## update

> TutorialGroup update(courseId, tutorialGroupId, tutorialGroupUpdateDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.TutorialGroupResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TutorialGroupResourceApi apiInstance = new TutorialGroupResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long tutorialGroupId = 56L; // Long | 
        TutorialGroupUpdateDTO tutorialGroupUpdateDTO = new TutorialGroupUpdateDTO(); // TutorialGroupUpdateDTO | 
        try {
            TutorialGroup result = apiInstance.update(courseId, tutorialGroupId, tutorialGroupUpdateDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TutorialGroupResourceApi#update");
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
| **tutorialGroupId** | **Long**|  | |
| **tutorialGroupUpdateDTO** | [**TutorialGroupUpdateDTO**](TutorialGroupUpdateDTO.md)|  | |

### Return type

[**TutorialGroup**](TutorialGroup.md)

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

