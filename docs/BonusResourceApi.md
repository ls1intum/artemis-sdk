# BonusResourceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateGradeWithBonus**](BonusResourceApi.md#calculateGradeWithBonus) | **GET** /api/courses/{courseId}/exams/{examId}/bonus/calculate-raw |  |
| [**createBonusForExam**](BonusResourceApi.md#createBonusForExam) | **POST** /api/courses/{courseId}/exams/{examId}/bonus |  |
| [**deleteBonus**](BonusResourceApi.md#deleteBonus) | **DELETE** /api/courses/{courseId}/exams/{examId}/bonus/{bonusId} |  |
| [**getBonusForExam**](BonusResourceApi.md#getBonusForExam) | **GET** /api/courses/{courseId}/exams/{examId}/bonus |  |
| [**updateBonus**](BonusResourceApi.md#updateBonus) | **PUT** /api/courses/{courseId}/exams/{examId}/bonus/{bonusId} |  |



## calculateGradeWithBonus

> BonusExampleDTO calculateGradeWithBonus(courseId, examId, bonusStrategy, calculationSign, bonusToPoints, sourceGradingScaleId, sourcePoints)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.BonusResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BonusResourceApi apiInstance = new BonusResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        String bonusStrategy = "GRADES_DISCRETE"; // String | 
        Double calculationSign = 3.4D; // Double | 
        Double bonusToPoints = 3.4D; // Double | 
        Long sourceGradingScaleId = 56L; // Long | 
        Double sourcePoints = 3.4D; // Double | 
        try {
            BonusExampleDTO result = apiInstance.calculateGradeWithBonus(courseId, examId, bonusStrategy, calculationSign, bonusToPoints, sourceGradingScaleId, sourcePoints);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BonusResourceApi#calculateGradeWithBonus");
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
| **examId** | **Long**|  | |
| **bonusStrategy** | **String**|  | [enum: GRADES_DISCRETE, GRADES_CONTINUOUS, POINTS] |
| **calculationSign** | **Double**|  | |
| **bonusToPoints** | **Double**|  | |
| **sourceGradingScaleId** | **Long**|  | |
| **sourcePoints** | **Double**|  | |

### Return type

[**BonusExampleDTO**](BonusExampleDTO.md)

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


## createBonusForExam

> Bonus createBonusForExam(courseId, examId, bonus)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.BonusResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BonusResourceApi apiInstance = new BonusResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Bonus bonus = new Bonus(); // Bonus | 
        try {
            Bonus result = apiInstance.createBonusForExam(courseId, examId, bonus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BonusResourceApi#createBonusForExam");
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
| **examId** | **Long**|  | |
| **bonus** | [**Bonus**](Bonus.md)|  | |

### Return type

[**Bonus**](Bonus.md)

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


## deleteBonus

> deleteBonus(courseId, examId, bonusId)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.BonusResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BonusResourceApi apiInstance = new BonusResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long bonusId = 56L; // Long | 
        try {
            apiInstance.deleteBonus(courseId, examId, bonusId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BonusResourceApi#deleteBonus");
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
| **examId** | **Long**|  | |
| **bonusId** | **Long**|  | |

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


## getBonusForExam

> Bonus getBonusForExam(courseId, examId, includeSourceGradeSteps)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.BonusResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BonusResourceApi apiInstance = new BonusResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Boolean includeSourceGradeSteps = true; // Boolean | 
        try {
            Bonus result = apiInstance.getBonusForExam(courseId, examId, includeSourceGradeSteps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BonusResourceApi#getBonusForExam");
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
| **examId** | **Long**|  | |
| **includeSourceGradeSteps** | **Boolean**|  | [optional] |

### Return type

[**Bonus**](Bonus.md)

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


## updateBonus

> Bonus updateBonus(courseId, examId, bonusId, bonus)



### Example

```java
// Import classes:
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.BonusResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BonusResourceApi apiInstance = new BonusResourceApi(defaultClient);
        Long courseId = 56L; // Long | 
        Long examId = 56L; // Long | 
        Long bonusId = 56L; // Long | 
        Bonus bonus = new Bonus(); // Bonus | 
        try {
            Bonus result = apiInstance.updateBonus(courseId, examId, bonusId, bonus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BonusResourceApi#updateBonus");
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
| **examId** | **Long**|  | |
| **bonusId** | **Long**|  | |
| **bonus** | [**Bonus**](Bonus.md)|  | |

### Return type

[**Bonus**](Bonus.md)

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

