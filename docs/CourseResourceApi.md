# CourseResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEditorToCourse**](CourseResourceApi.md#addEditorToCourse) | **POST** /api/courses/{courseId}/editors/{editorLogin} |  |
| [**addInstructorToCourse**](CourseResourceApi.md#addInstructorToCourse) | **POST** /api/courses/{courseId}/instructors/{instructorLogin} |  |
| [**addStudentToCourse**](CourseResourceApi.md#addStudentToCourse) | **POST** /api/courses/{courseId}/students/{studentLogin} |  |
| [**addTutorToCourse**](CourseResourceApi.md#addTutorToCourse) | **POST** /api/courses/{courseId}/tutors/{tutorLogin} |  |
| [**addUsersToCourseGroup**](CourseResourceApi.md#addUsersToCourseGroup) | **POST** /api/courses/{courseId}/{courseGroup} |  |
| [**archiveCourse**](CourseResourceApi.md#archiveCourse) | **PUT** /api/courses/{courseId}/archive |  |
| [**cleanup1**](CourseResourceApi.md#cleanup1) | **DELETE** /api/courses/{courseId}/cleanup |  |
| [**downloadCourseArchive**](CourseResourceApi.md#downloadCourseArchive) | **GET** /api/courses/{courseId}/download-archive |  |
| [**getActiveStudentsForCourseDetailView**](CourseResourceApi.md#getActiveStudentsForCourseDetailView) | **GET** /api/courses/{courseId}/statistics |  |
| [**getActiveStudentsForCourseLiveTime**](CourseResourceApi.md#getActiveStudentsForCourseLiveTime) | **GET** /api/courses/{courseId}/statistics-lifetime-overview |  |
| [**getAllCourses**](CourseResourceApi.md#getAllCourses) | **GET** /api/courses |  |
| [**getAllCoursesForDashboard**](CourseResourceApi.md#getAllCoursesForDashboard) | **GET** /api/courses/for-dashboard |  |
| [**getAllCoursesForManagementOverview**](CourseResourceApi.md#getAllCoursesForManagementOverview) | **GET** /api/courses/course-management-overview |  |
| [**getAllCoursesForNotifications**](CourseResourceApi.md#getAllCoursesForNotifications) | **GET** /api/courses/for-notifications |  |
| [**getAllCoursesToRegister**](CourseResourceApi.md#getAllCoursesToRegister) | **GET** /api/courses/for-registration |  |
| [**getAllCoursesWithQuizExercises**](CourseResourceApi.md#getAllCoursesWithQuizExercises) | **GET** /api/courses/courses-with-quiz |  |
| [**getAllCoursesWithUserStats**](CourseResourceApi.md#getAllCoursesWithUserStats) | **GET** /api/courses/with-user-stats |  |
| [**getAllEditorsInCourse**](CourseResourceApi.md#getAllEditorsInCourse) | **GET** /api/courses/{courseId}/editors |  |
| [**getAllInstructorsInCourse**](CourseResourceApi.md#getAllInstructorsInCourse) | **GET** /api/courses/{courseId}/instructors |  |
| [**getAllStudentsInCourse**](CourseResourceApi.md#getAllStudentsInCourse) | **GET** /api/courses/{courseId}/students |  |
| [**getAllTutorsInCourse**](CourseResourceApi.md#getAllTutorsInCourse) | **GET** /api/courses/{courseId}/tutors |  |
| [**getCategoriesInCourse**](CourseResourceApi.md#getCategoriesInCourse) | **GET** /api/courses/{courseId}/categories |  |
| [**getCourse**](CourseResourceApi.md#getCourse) | **GET** /api/courses/{courseId} |  |
| [**getCourseDTOForDetailView**](CourseResourceApi.md#getCourseDTOForDetailView) | **GET** /api/courses/{courseId}/management-detail |  |
| [**getCourseForAssessmentDashboard**](CourseResourceApi.md#getCourseForAssessmentDashboard) | **GET** /api/courses/{courseId}/for-assessment-dashboard |  |
| [**getCourseForDashboard**](CourseResourceApi.md#getCourseForDashboard) | **GET** /api/courses/{courseId}/for-dashboard |  |
| [**getCourseTitle**](CourseResourceApi.md#getCourseTitle) | **GET** /api/courses/{courseId}/title |  |
| [**getCourseWithExercises**](CourseResourceApi.md#getCourseWithExercises) | **GET** /api/courses/{courseId}/with-exercises |  |
| [**getCourseWithOrganizations**](CourseResourceApi.md#getCourseWithOrganizations) | **GET** /api/courses/{courseId}/with-organizations |  |
| [**getExerciseStatsForCourseOverview**](CourseResourceApi.md#getExerciseStatsForCourseOverview) | **GET** /api/courses/stats-for-management-overview |  |
| [**getExercisesForCourseOverview**](CourseResourceApi.md#getExercisesForCourseOverview) | **GET** /api/courses/exercises-for-management-overview |  |
| [**getLockedSubmissionsForCourse**](CourseResourceApi.md#getLockedSubmissionsForCourse) | **GET** /api/courses/{courseId}/lockedSubmissions |  |
| [**getStatsForAssessmentDashboard**](CourseResourceApi.md#getStatsForAssessmentDashboard) | **GET** /api/courses/{courseId}/stats-for-assessment-dashboard |  |
| [**registerForCourse**](CourseResourceApi.md#registerForCourse) | **POST** /api/courses/{courseId}/register |  |
| [**removeEditorFromCourse**](CourseResourceApi.md#removeEditorFromCourse) | **DELETE** /api/courses/{courseId}/editors/{editorLogin} |  |
| [**removeInstructorFromCourse**](CourseResourceApi.md#removeInstructorFromCourse) | **DELETE** /api/courses/{courseId}/instructors/{instructorLogin} |  |
| [**removeStudentFromCourse**](CourseResourceApi.md#removeStudentFromCourse) | **DELETE** /api/courses/{courseId}/students/{studentLogin} |  |
| [**removeTutorFromCourse**](CourseResourceApi.md#removeTutorFromCourse) | **DELETE** /api/courses/{courseId}/tutors/{tutorLogin} |  |
| [**searchOtherUsersInCourse**](CourseResourceApi.md#searchOtherUsersInCourse) | **GET** /api/courses/{courseId}/search-other-users |  |
| [**searchStudentsInCourse**](CourseResourceApi.md#searchStudentsInCourse) | **GET** /api/courses/{courseId}/students/search |  |
| [**searchUsersInCourse**](CourseResourceApi.md#searchUsersInCourse) | **GET** /api/courses/{courseId}/users/search |  |
| [**updateCourse**](CourseResourceApi.md#updateCourse) | **PUT** /api/courses/{courseId} |  |
| [**updateOnlineCourseConfiguration**](CourseResourceApi.md#updateOnlineCourseConfiguration) | **PUT** /api/courses/{courseId}/onlineCourseConfiguration |  |



## addEditorToCourse

> addEditorToCourse(courseId, editorLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String editorLogin = "editorLogin_example"; // String | 
        try {
            apiInstance.addEditorToCourse(courseId, editorLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#addEditorToCourse");
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
| **editorLogin** | **String**|  | |

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


## addInstructorToCourse

> addInstructorToCourse(courseId, instructorLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String instructorLogin = "instructorLogin_example"; // String | 
        try {
            apiInstance.addInstructorToCourse(courseId, instructorLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#addInstructorToCourse");
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
| **instructorLogin** | **String**|  | |

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


## addStudentToCourse

> addStudentToCourse(courseId, studentLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        try {
            apiInstance.addStudentToCourse(courseId, studentLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#addStudentToCourse");
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


## addTutorToCourse

> addTutorToCourse(courseId, tutorLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String tutorLogin = "tutorLogin_example"; // String | 
        try {
            apiInstance.addTutorToCourse(courseId, tutorLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#addTutorToCourse");
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
| **tutorLogin** | **String**|  | |

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


## addUsersToCourseGroup

> List&lt;StudentDTO&gt; addUsersToCourseGroup(courseId, courseGroup, studentDTO)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String courseGroup = "courseGroup_example"; // String | 
        List<StudentDTO> studentDTO = Arrays.asList(); // List<StudentDTO> | 
        try {
            List<StudentDTO> result = apiInstance.addUsersToCourseGroup(courseId, courseGroup, studentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#addUsersToCourseGroup");
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
| **courseGroup** | **String**|  | |
| **studentDTO** | [**List&lt;StudentDTO&gt;**](StudentDTO.md)|  | |

### Return type

[**List&lt;StudentDTO&gt;**](StudentDTO.md)

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


## archiveCourse

> archiveCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            apiInstance.archiveCourse(courseId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#archiveCourse");
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


## cleanup1

> File cleanup1(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            File result = apiInstance.cleanup1(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#cleanup1");
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


## downloadCourseArchive

> File downloadCourseArchive(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            File result = apiInstance.downloadCourseArchive(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#downloadCourseArchive");
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


## getActiveStudentsForCourseDetailView

> List&lt;Integer&gt; getActiveStudentsForCourseDetailView(courseId, periodIndex)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long periodIndex = 56L; // Long | 
        try {
            List<Integer> result = apiInstance.getActiveStudentsForCourseDetailView(courseId, periodIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getActiveStudentsForCourseDetailView");
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
| **periodIndex** | **Long**|  | |

### Return type

**List&lt;Integer&gt;**

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


## getActiveStudentsForCourseLiveTime

> List&lt;Integer&gt; getActiveStudentsForCourseLiveTime(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<Integer> result = apiInstance.getActiveStudentsForCourseLiveTime(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getActiveStudentsForCourseLiveTime");
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

**List&lt;Integer&gt;**

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


## getAllCourses

> List&lt;Course&gt; getAllCourses(onlyActive)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Boolean onlyActive = false; // Boolean | 
        try {
            List<Course> result = apiInstance.getAllCourses(onlyActive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCourses");
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
| **onlyActive** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;Course&gt;**](Course.md)

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


## getAllCoursesForDashboard

> List&lt;Course&gt; getAllCoursesForDashboard()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        try {
            List<Course> result = apiInstance.getAllCoursesForDashboard();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCoursesForDashboard");
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

[**List&lt;Course&gt;**](Course.md)

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


## getAllCoursesForManagementOverview

> List&lt;Course&gt; getAllCoursesForManagementOverview(onlyActive)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Boolean onlyActive = false; // Boolean | 
        try {
            List<Course> result = apiInstance.getAllCoursesForManagementOverview(onlyActive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCoursesForManagementOverview");
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
| **onlyActive** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;Course&gt;**](Course.md)

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


## getAllCoursesForNotifications

> List&lt;Course&gt; getAllCoursesForNotifications()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        try {
            List<Course> result = apiInstance.getAllCoursesForNotifications();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCoursesForNotifications");
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

[**List&lt;Course&gt;**](Course.md)

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


## getAllCoursesToRegister

> List&lt;Course&gt; getAllCoursesToRegister()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        try {
            List<Course> result = apiInstance.getAllCoursesToRegister();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCoursesToRegister");
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

[**List&lt;Course&gt;**](Course.md)

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


## getAllCoursesWithQuizExercises

> List&lt;Course&gt; getAllCoursesWithQuizExercises()



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        try {
            List<Course> result = apiInstance.getAllCoursesWithQuizExercises();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCoursesWithQuizExercises");
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

[**List&lt;Course&gt;**](Course.md)

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


## getAllCoursesWithUserStats

> List&lt;Course&gt; getAllCoursesWithUserStats(onlyActive)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Boolean onlyActive = false; // Boolean | 
        try {
            List<Course> result = apiInstance.getAllCoursesWithUserStats(onlyActive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllCoursesWithUserStats");
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
| **onlyActive** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;Course&gt;**](Course.md)

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


## getAllEditorsInCourse

> List&lt;User&gt; getAllEditorsInCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<User> result = apiInstance.getAllEditorsInCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllEditorsInCourse");
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

[**List&lt;User&gt;**](User.md)

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


## getAllInstructorsInCourse

> List&lt;User&gt; getAllInstructorsInCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<User> result = apiInstance.getAllInstructorsInCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllInstructorsInCourse");
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

[**List&lt;User&gt;**](User.md)

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


## getAllStudentsInCourse

> List&lt;User&gt; getAllStudentsInCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<User> result = apiInstance.getAllStudentsInCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllStudentsInCourse");
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

[**List&lt;User&gt;**](User.md)

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


## getAllTutorsInCourse

> List&lt;User&gt; getAllTutorsInCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<User> result = apiInstance.getAllTutorsInCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getAllTutorsInCourse");
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

[**List&lt;User&gt;**](User.md)

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


## getCategoriesInCourse

> Set&lt;String&gt; getCategoriesInCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Set<String> result = apiInstance.getCategoriesInCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCategoriesInCourse");
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


## getCourse

> Course getCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Course result = apiInstance.getCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourse");
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


## getCourseDTOForDetailView

> CourseManagementDetailViewDTO getCourseDTOForDetailView(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            CourseManagementDetailViewDTO result = apiInstance.getCourseDTOForDetailView(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourseDTOForDetailView");
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

[**CourseManagementDetailViewDTO**](CourseManagementDetailViewDTO.md)

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


## getCourseForAssessmentDashboard

> Course getCourseForAssessmentDashboard(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Course result = apiInstance.getCourseForAssessmentDashboard(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourseForAssessmentDashboard");
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


## getCourseForDashboard

> Course getCourseForDashboard(courseId, refresh)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Boolean refresh = false; // Boolean | 
        try {
            Course result = apiInstance.getCourseForDashboard(courseId, refresh);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourseForDashboard");
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
| **refresh** | **Boolean**|  | [optional] [default to false] |

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


## getCourseTitle

> String getCourseTitle(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            String result = apiInstance.getCourseTitle(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourseTitle");
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


## getCourseWithExercises

> Course getCourseWithExercises(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Course result = apiInstance.getCourseWithExercises(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourseWithExercises");
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


## getCourseWithOrganizations

> Course getCourseWithOrganizations(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            Course result = apiInstance.getCourseWithOrganizations(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getCourseWithOrganizations");
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


## getExerciseStatsForCourseOverview

> List&lt;CourseManagementOverviewStatisticsDTO&gt; getExerciseStatsForCourseOverview(onlyActive)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Boolean onlyActive = false; // Boolean | 
        try {
            List<CourseManagementOverviewStatisticsDTO> result = apiInstance.getExerciseStatsForCourseOverview(onlyActive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getExerciseStatsForCourseOverview");
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
| **onlyActive** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;CourseManagementOverviewStatisticsDTO&gt;**](CourseManagementOverviewStatisticsDTO.md)

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


## getExercisesForCourseOverview

> List&lt;Course&gt; getExercisesForCourseOverview(onlyActive)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Boolean onlyActive = false; // Boolean | 
        try {
            List<Course> result = apiInstance.getExercisesForCourseOverview(onlyActive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getExercisesForCourseOverview");
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
| **onlyActive** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;Course&gt;**](Course.md)

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


## getLockedSubmissionsForCourse

> List&lt;GetAllTextSubmissions200ResponseInner&gt; getLockedSubmissionsForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            List<GetAllTextSubmissions200ResponseInner> result = apiInstance.getLockedSubmissionsForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getLockedSubmissionsForCourse");
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


## getStatsForAssessmentDashboard

> StatsForDashboardDTO getStatsForAssessmentDashboard(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            StatsForDashboardDTO result = apiInstance.getStatsForAssessmentDashboard(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#getStatsForAssessmentDashboard");
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

[**StatsForDashboardDTO**](StatsForDashboardDTO.md)

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


## registerForCourse

> User registerForCourse(courseId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        try {
            User result = apiInstance.registerForCourse(courseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#registerForCourse");
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

[**User**](User.md)

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


## removeEditorFromCourse

> removeEditorFromCourse(courseId, editorLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String editorLogin = "editorLogin_example"; // String | 
        try {
            apiInstance.removeEditorFromCourse(courseId, editorLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#removeEditorFromCourse");
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
| **editorLogin** | **String**|  | |

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


## removeInstructorFromCourse

> removeInstructorFromCourse(courseId, instructorLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String instructorLogin = "instructorLogin_example"; // String | 
        try {
            apiInstance.removeInstructorFromCourse(courseId, instructorLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#removeInstructorFromCourse");
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
| **instructorLogin** | **String**|  | |

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


## removeStudentFromCourse

> removeStudentFromCourse(courseId, studentLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String studentLogin = "studentLogin_example"; // String | 
        try {
            apiInstance.removeStudentFromCourse(courseId, studentLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#removeStudentFromCourse");
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


## removeTutorFromCourse

> removeTutorFromCourse(courseId, tutorLogin)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String tutorLogin = "tutorLogin_example"; // String | 
        try {
            apiInstance.removeTutorFromCourse(courseId, tutorLogin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#removeTutorFromCourse");
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
| **tutorLogin** | **String**|  | |

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


## searchOtherUsersInCourse

> List&lt;User&gt; searchOtherUsersInCourse(courseId, nameOfUser)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String nameOfUser = "nameOfUser_example"; // String | 
        try {
            List<User> result = apiInstance.searchOtherUsersInCourse(courseId, nameOfUser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#searchOtherUsersInCourse");
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
| **nameOfUser** | **String**|  | |

### Return type

[**List&lt;User&gt;**](User.md)

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


## searchStudentsInCourse

> List&lt;UserDTO&gt; searchStudentsInCourse(courseId, loginOrName)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String loginOrName = "loginOrName_example"; // String | 
        try {
            List<UserDTO> result = apiInstance.searchStudentsInCourse(courseId, loginOrName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#searchStudentsInCourse");
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
| **loginOrName** | **String**|  | |

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


## searchUsersInCourse

> List&lt;UserPublicInfoDTO&gt; searchUsersInCourse(courseId, loginOrName, roles)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        String loginOrName = "loginOrName_example"; // String | 
        List<String> roles = Arrays.asList(); // List<String> | 
        try {
            List<UserPublicInfoDTO> result = apiInstance.searchUsersInCourse(courseId, loginOrName, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#searchUsersInCourse");
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
| **loginOrName** | **String**|  | |
| **roles** | **List&lt;String&gt;**|  | |

### Return type

[**List&lt;UserPublicInfoDTO&gt;**](UserPublicInfoDTO.md)

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


## updateCourse

> Course updateCourse(courseId, course, _file)



### Example

```java
import java.io.File;
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Course course = new Course(); // Course | 
        File _file = new File("/path/to/file"); // File | 
        try {
            Course result = apiInstance.updateCourse(courseId, course, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#updateCourse");
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
| **course** | [**Course**](Course.md)|  | |
| **_file** | **File**|  | [optional] |

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **200** | OK |  -  |


## updateOnlineCourseConfiguration

> OnlineCourseConfiguration updateOnlineCourseConfiguration(courseId, onlineCourseConfiguration)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        OnlineCourseConfiguration onlineCourseConfiguration = new OnlineCourseConfiguration(); // OnlineCourseConfiguration | 
        try {
            OnlineCourseConfiguration result = apiInstance.updateOnlineCourseConfiguration(courseId, onlineCourseConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CourseResourceApi#updateOnlineCourseConfiguration");
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
| **onlineCourseConfiguration** | [**OnlineCourseConfiguration**](OnlineCourseConfiguration.md)|  | |

### Return type

[**OnlineCourseConfiguration**](OnlineCourseConfiguration.md)

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

