# AdminOrganizationResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCourseToOrganization**](AdminOrganizationResourceApi.md#addCourseToOrganization) | **POST** /api/admin/organizations/{organizationId}/courses/{courseId} |  |
| [**addOrganization**](AdminOrganizationResourceApi.md#addOrganization) | **POST** /api/admin/organizations |  |
| [**addUserToOrganization**](AdminOrganizationResourceApi.md#addUserToOrganization) | **POST** /api/admin/organizations/{organizationId}/users/{userLogin} |  |
| [**deleteOrganization**](AdminOrganizationResourceApi.md#deleteOrganization) | **DELETE** /api/admin/organizations/{organizationId} |  |
| [**getAllOrganizations**](AdminOrganizationResourceApi.md#getAllOrganizations) | **GET** /api/admin/organizations |  |
| [**getAllOrganizationsByUser**](AdminOrganizationResourceApi.md#getAllOrganizationsByUser) | **GET** /api/admin/organizations/users/{userId} |  |
| [**getNumberOfUsersAndCoursesByOrganization**](AdminOrganizationResourceApi.md#getNumberOfUsersAndCoursesByOrganization) | **GET** /api/admin/organizations/{organizationId}/count |  |
| [**getNumberOfUsersAndCoursesOfAllOrganizations**](AdminOrganizationResourceApi.md#getNumberOfUsersAndCoursesOfAllOrganizations) | **GET** /api/admin/organizations/count-all |  |
| [**getOrganizationById**](AdminOrganizationResourceApi.md#getOrganizationById) | **GET** /api/admin/organizations/{organizationId} |  |
| [**getOrganizationByIdWithUsersAndCourses**](AdminOrganizationResourceApi.md#getOrganizationByIdWithUsersAndCourses) | **GET** /api/admin/organizations/{organizationId}/full |  |
| [**getOrganizationTitle**](AdminOrganizationResourceApi.md#getOrganizationTitle) | **GET** /api/admin/organizations/{organizationId}/title |  |
| [**removeCourseFromOrganization**](AdminOrganizationResourceApi.md#removeCourseFromOrganization) | **DELETE** /api/admin/organizations/{organizationId}/courses/{courseId} |  |
| [**removeUserFromOrganization**](AdminOrganizationResourceApi.md#removeUserFromOrganization) | **DELETE** /api/admin/organizations/{organizationId}/users/{userLogin} |  |
| [**updateOrganization**](AdminOrganizationResourceApi.md#updateOrganization) | **PUT** /api/admin/organizations/{organizationId} |  |



## addCourseToOrganization

> addCourseToOrganization(courseId, organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long organizationId = 56L; // Long | 
        try {
            apiInstance.addCourseToOrganization(courseId, organizationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#addCourseToOrganization");
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
| **organizationId** | **Long**|  | |

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


## addOrganization

> Organization addOrganization(organization)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Organization organization = new Organization(); // Organization | 
        try {
            Organization result = apiInstance.addOrganization(organization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#addOrganization");
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
| **organization** | [**Organization**](Organization.md)|  | |

### Return type

[**Organization**](Organization.md)

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


## addUserToOrganization

> addUserToOrganization(userLogin, organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        String userLogin = "userLogin_example"; // String | 
        Long organizationId = 56L; // Long | 
        try {
            apiInstance.addUserToOrganization(userLogin, organizationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#addUserToOrganization");
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
| **userLogin** | **String**|  | |
| **organizationId** | **Long**|  | |

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


## deleteOrganization

> deleteOrganization(organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long organizationId = 56L; // Long | 
        try {
            apiInstance.deleteOrganization(organizationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#deleteOrganization");
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
| **organizationId** | **Long**|  | |

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


## getAllOrganizations

> List&lt;Organization&gt; getAllOrganizations()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        try {
            List<Organization> result = apiInstance.getAllOrganizations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getAllOrganizations");
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

[**List&lt;Organization&gt;**](Organization.md)

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


## getAllOrganizationsByUser

> Set&lt;Organization&gt; getAllOrganizationsByUser(userId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long userId = 56L; // Long | 
        try {
            Set<Organization> result = apiInstance.getAllOrganizationsByUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getAllOrganizationsByUser");
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
| **userId** | **Long**|  | |

### Return type

[**Set&lt;Organization&gt;**](Organization.md)

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


## getNumberOfUsersAndCoursesByOrganization

> OrganizationCountDTO getNumberOfUsersAndCoursesByOrganization(organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long organizationId = 56L; // Long | 
        try {
            OrganizationCountDTO result = apiInstance.getNumberOfUsersAndCoursesByOrganization(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getNumberOfUsersAndCoursesByOrganization");
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
| **organizationId** | **Long**|  | |

### Return type

[**OrganizationCountDTO**](OrganizationCountDTO.md)

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


## getNumberOfUsersAndCoursesOfAllOrganizations

> List&lt;OrganizationCountDTO&gt; getNumberOfUsersAndCoursesOfAllOrganizations()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        try {
            List<OrganizationCountDTO> result = apiInstance.getNumberOfUsersAndCoursesOfAllOrganizations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getNumberOfUsersAndCoursesOfAllOrganizations");
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

[**List&lt;OrganizationCountDTO&gt;**](OrganizationCountDTO.md)

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


## getOrganizationById

> Organization getOrganizationById(organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long organizationId = 56L; // Long | 
        try {
            Organization result = apiInstance.getOrganizationById(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getOrganizationById");
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
| **organizationId** | **Long**|  | |

### Return type

[**Organization**](Organization.md)

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


## getOrganizationByIdWithUsersAndCourses

> Organization getOrganizationByIdWithUsersAndCourses(organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long organizationId = 56L; // Long | 
        try {
            Organization result = apiInstance.getOrganizationByIdWithUsersAndCourses(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getOrganizationByIdWithUsersAndCourses");
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
| **organizationId** | **Long**|  | |

### Return type

[**Organization**](Organization.md)

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


## getOrganizationTitle

> String getOrganizationTitle(organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long organizationId = 56L; // Long | 
        try {
            String result = apiInstance.getOrganizationTitle(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#getOrganizationTitle");
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
| **organizationId** | **Long**|  | |

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


## removeCourseFromOrganization

> removeCourseFromOrganization(courseId, organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long organizationId = 56L; // Long | 
        try {
            apiInstance.removeCourseFromOrganization(courseId, organizationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#removeCourseFromOrganization");
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
| **organizationId** | **Long**|  | |

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


## removeUserFromOrganization

> removeUserFromOrganization(userLogin, organizationId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        String userLogin = "userLogin_example"; // String | 
        Long organizationId = 56L; // Long | 
        try {
            apiInstance.removeUserFromOrganization(userLogin, organizationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#removeUserFromOrganization");
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
| **userLogin** | **String**|  | |
| **organizationId** | **Long**|  | |

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


## updateOrganization

> Organization updateOrganization(organizationId, organization)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminOrganizationResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminOrganizationResourceApi apiInstance = new AdminOrganizationResourceApi(defaultClient);
        Long organizationId = 56L; // Long | 
        Organization organization = new Organization(); // Organization | 
        try {
            Organization result = apiInstance.updateOrganization(organizationId, organization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminOrganizationResourceApi#updateOrganization");
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
| **organizationId** | **Long**|  | |
| **organization** | [**Organization**](Organization.md)|  | |

### Return type

[**Organization**](Organization.md)

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

