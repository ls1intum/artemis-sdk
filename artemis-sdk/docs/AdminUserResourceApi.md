# AdminUserResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](AdminUserResourceApi.md#createUser) | **POST** /api/admin/users |  |
| [**deleteUser**](AdminUserResourceApi.md#deleteUser) | **DELETE** /api/admin/users/{login} |  |
| [**deleteUsers**](AdminUserResourceApi.md#deleteUsers) | **DELETE** /api/admin/users |  |
| [**getAllUsers**](AdminUserResourceApi.md#getAllUsers) | **GET** /api/admin/users |  |
| [**getAuthorities**](AdminUserResourceApi.md#getAuthorities) | **GET** /api/admin/users/authorities |  |
| [**syncUserViaLdap**](AdminUserResourceApi.md#syncUserViaLdap) | **PUT** /api/admin/users/{userId}/sync-ldap |  |
| [**updateUser**](AdminUserResourceApi.md#updateUser) | **PUT** /api/admin/users |  |



## createUser

> User createUser(managedUserVM)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        ManagedUserVM managedUserVM = new ManagedUserVM(); // ManagedUserVM | 
        try {
            User result = apiInstance.createUser(managedUserVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#createUser");
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
| **managedUserVM** | [**ManagedUserVM**](ManagedUserVM.md)|  | |

### Return type

[**User**](User.md)

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


## deleteUser

> deleteUser(login)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        String login = "login_example"; // String | 
        try {
            apiInstance.deleteUser(login);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#deleteUser");
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
| **login** | **String**|  | |

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


## deleteUsers

> List&lt;String&gt; deleteUsers(login)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        List<String> login = Arrays.asList(); // List<String> | 
        try {
            List<String> result = apiInstance.deleteUsers(login);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#deleteUsers");
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
| **login** | **List&lt;String&gt;**|  | |

### Return type

**List&lt;String&gt;**

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


## getAllUsers

> List&lt;UserDTO&gt; getAllUsers(userSearch)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        UserPageableSearchDTO userSearch = new HashMap(); // UserPageableSearchDTO | 
        try {
            List<UserDTO> result = apiInstance.getAllUsers(userSearch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#getAllUsers");
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
| **userSearch** | [**UserPageableSearchDTO**](UserPageableSearchDTO.md)|  | |

### Return type

[**List&lt;UserDTO&gt;**](UserDTO.md)

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


## getAuthorities

> List&lt;String&gt; getAuthorities()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        try {
            List<String> result = apiInstance.getAuthorities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#getAuthorities");
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

**List&lt;String&gt;**

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


## syncUserViaLdap

> UserDTO syncUserViaLdap(userId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        Long userId = 56L; // Long | 
        try {
            UserDTO result = apiInstance.syncUserViaLdap(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#syncUserViaLdap");
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

[**UserDTO**](UserDTO.md)

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


## updateUser

> UserDTO updateUser(managedUserVM)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.AdminUserResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdminUserResourceApi apiInstance = new AdminUserResourceApi(defaultClient);
        ManagedUserVM managedUserVM = new ManagedUserVM(); // ManagedUserVM | 
        try {
            UserDTO result = apiInstance.updateUser(managedUserVM);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminUserResourceApi#updateUser");
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
| **managedUserVM** | [**ManagedUserVM**](ManagedUserVM.md)|  | |

### Return type

[**UserDTO**](UserDTO.md)

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

