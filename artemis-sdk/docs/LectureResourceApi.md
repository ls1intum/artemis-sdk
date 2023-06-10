# LectureResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLecture**](LectureResourceApi.md#createLecture) | **POST** /api/lectures |  |
| [**deleteLecture**](LectureResourceApi.md#deleteLecture) | **DELETE** /api/lectures/{lectureId} |  |
| [**getAllLecturesOnPage**](LectureResourceApi.md#getAllLecturesOnPage) | **GET** /api/lectures |  |
| [**getLecture**](LectureResourceApi.md#getLecture) | **GET** /api/lectures/{lectureId} |  |
| [**getLectureTitle**](LectureResourceApi.md#getLectureTitle) | **GET** /api/lectures/{lectureId}/title |  |
| [**getLectureWithDetails**](LectureResourceApi.md#getLectureWithDetails) | **GET** /api/lectures/{lectureId}/details |  |
| [**getLectureWithDetailsAndSlides**](LectureResourceApi.md#getLectureWithDetailsAndSlides) | **GET** /api/lectures/{lectureId}/details-with-slides |  |
| [**getLecturesForCourse**](LectureResourceApi.md#getLecturesForCourse) | **GET** /api/courses/{courseId}/lectures |  |
| [**getLecturesWithSlidesForCourse**](LectureResourceApi.md#getLecturesWithSlidesForCourse) | **GET** /api/courses/{courseId}/lectures-with-slides |  |
| [**importLecture**](LectureResourceApi.md#importLecture) | **POST** /api/lectures/import/{sourceLectureId} |  |
| [**updateLecture**](LectureResourceApi.md#updateLecture) | **PUT** /api/lectures |  |



## createLecture

> Lecture createLecture(lecture)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Lecture lecture = new Lecture(); // Lecture | 
        try {
            Lecture result = apiInstance.createLecture(lecture);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#createLecture");
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
| **lecture** | [**Lecture**](Lecture.md)|  | |

### Return type

[**Lecture**](Lecture.md)

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


## deleteLecture

> deleteLecture(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            apiInstance.deleteLecture(lectureId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#deleteLecture");
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
| **lectureId** | **Long**|  | |

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


## getAllLecturesOnPage

> SearchResultPageDTOLecture getAllLecturesOnPage(search)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        PageableSearchDTOString search = new HashMap(); // PageableSearchDTOString | 
        try {
            SearchResultPageDTOLecture result = apiInstance.getAllLecturesOnPage(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getAllLecturesOnPage");
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

[**SearchResultPageDTOLecture**](SearchResultPageDTOLecture.md)

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


## getLecture

> Lecture getLecture(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            Lecture result = apiInstance.getLecture(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getLecture");
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
| **lectureId** | **Long**|  | |

### Return type

[**Lecture**](Lecture.md)

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


## getLectureTitle

> String getLectureTitle(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            String result = apiInstance.getLectureTitle(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getLectureTitle");
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
| **lectureId** | **Long**|  | |

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


## getLectureWithDetails

> Lecture getLectureWithDetails(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            Lecture result = apiInstance.getLectureWithDetails(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getLectureWithDetails");
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
| **lectureId** | **Long**|  | |

### Return type

[**Lecture**](Lecture.md)

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


## getLectureWithDetailsAndSlides

> Lecture getLectureWithDetailsAndSlides(lectureId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long lectureId = 56L; // Long | 
        try {
            Lecture result = apiInstance.getLectureWithDetailsAndSlides(lectureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getLectureWithDetailsAndSlides");
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
| **lectureId** | **Long**|  | |

### Return type

[**Lecture**](Lecture.md)

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


## getLecturesForCourse

> Set&lt;Lecture&gt; getLecturesForCourse(courseId, withLectureUnits)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Boolean withLectureUnits = false; // Boolean | 
        try {
            Set<Lecture> result = apiInstance.getLecturesForCourse(courseId, withLectureUnits);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getLecturesForCourse");
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
| **withLectureUnits** | **Boolean**|  | [optional] [default to false] |

### Return type

[**Set&lt;Lecture&gt;**](Lecture.md)

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


## getLecturesWithSlidesForCourse

> Set&lt;Lecture&gt; getLecturesWithSlidesForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Set<Lecture> result = apiInstance.getLecturesWithSlidesForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#getLecturesWithSlidesForCourse");
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

[**Set&lt;Lecture&gt;**](Lecture.md)

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


## importLecture

> Lecture importLecture(sourceLectureId, courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Long sourceLectureId = 56L; // Long | 
        Long courseId = 56L; // Long | 
        try {
            Lecture result = apiInstance.importLecture(sourceLectureId, courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#importLecture");
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
| **sourceLectureId** | **Long**|  | |
| **courseId** | **Long**|  | |

### Return type

[**Lecture**](Lecture.md)

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


## updateLecture

> Lecture updateLecture(lecture)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.LectureResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LectureResourceApi apiInstance = new LectureResourceApi(defaultClient);
        Lecture lecture = new Lecture(); // Lecture | 
        try {
            Lecture result = apiInstance.updateLecture(lecture);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LectureResourceApi#updateLecture");
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
| **lecture** | [**Lecture**](Lecture.md)|  | |

### Return type

[**Lecture**](Lecture.md)

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

