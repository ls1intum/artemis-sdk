package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Bonus;
import de.tum.cit.ase.artemis.sdk.model.BonusExampleDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class BonusResourceApi {
  private ApiClient apiClient;

  public BonusResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BonusResourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonusStrategy  (required)
   * @param calculationSign  (required)
   * @param bonusToPoints  (required)
   * @param sourceGradingScaleId  (required)
   * @param sourcePoints  (required)
   * @return BonusExampleDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BonusExampleDTO calculateGradeWithBonus(Long courseId, Long examId, String bonusStrategy, Double calculationSign, Double bonusToPoints, Long sourceGradingScaleId, Double sourcePoints) throws ApiException {
    return calculateGradeWithBonusWithHttpInfo(courseId, examId, bonusStrategy, calculationSign, bonusToPoints, sourceGradingScaleId, sourcePoints).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonusStrategy  (required)
   * @param calculationSign  (required)
   * @param bonusToPoints  (required)
   * @param sourceGradingScaleId  (required)
   * @param sourcePoints  (required)
   * @return ApiResponse&lt;BonusExampleDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BonusExampleDTO> calculateGradeWithBonusWithHttpInfo(Long courseId, Long examId, String bonusStrategy, Double calculationSign, Double bonusToPoints, Long sourceGradingScaleId, Double sourcePoints) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling calculateGradeWithBonus");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling calculateGradeWithBonus");
    }
    
    // verify the required parameter 'bonusStrategy' is set
    if (bonusStrategy == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusStrategy' when calling calculateGradeWithBonus");
    }
    
    // verify the required parameter 'calculationSign' is set
    if (calculationSign == null) {
      throw new ApiException(400, "Missing the required parameter 'calculationSign' when calling calculateGradeWithBonus");
    }
    
    // verify the required parameter 'bonusToPoints' is set
    if (bonusToPoints == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusToPoints' when calling calculateGradeWithBonus");
    }
    
    // verify the required parameter 'sourceGradingScaleId' is set
    if (sourceGradingScaleId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceGradingScaleId' when calling calculateGradeWithBonus");
    }
    
    // verify the required parameter 'sourcePoints' is set
    if (sourcePoints == null) {
      throw new ApiException(400, "Missing the required parameter 'sourcePoints' when calling calculateGradeWithBonus");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus/calculate-raw"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bonusStrategy", bonusStrategy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calculationSign", calculationSign));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bonusToPoints", bonusToPoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceGradingScaleId", sourceGradingScaleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourcePoints", sourcePoints));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BonusExampleDTO> localVarReturnType = new GenericType<BonusExampleDTO>() {};

    return apiClient.invokeAPI("BonusResourceApi.calculateGradeWithBonus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonus  (required)
   * @return Bonus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Bonus createBonusForExam(Long courseId, Long examId, Bonus bonus) throws ApiException {
    return createBonusForExamWithHttpInfo(courseId, examId, bonus).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonus  (required)
   * @return ApiResponse&lt;Bonus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Bonus> createBonusForExamWithHttpInfo(Long courseId, Long examId, Bonus bonus) throws ApiException {
    Object localVarPostBody = bonus;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createBonusForExam");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling createBonusForExam");
    }
    
    // verify the required parameter 'bonus' is set
    if (bonus == null) {
      throw new ApiException(400, "Missing the required parameter 'bonus' when calling createBonusForExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Bonus> localVarReturnType = new GenericType<Bonus>() {};

    return apiClient.invokeAPI("BonusResourceApi.createBonusForExam", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonusId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteBonus(Long courseId, Long examId, Long bonusId) throws ApiException {
    deleteBonusWithHttpInfo(courseId, examId, bonusId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonusId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteBonusWithHttpInfo(Long courseId, Long examId, Long bonusId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteBonus");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling deleteBonus");
    }
    
    // verify the required parameter 'bonusId' is set
    if (bonusId == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusId' when calling deleteBonus");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus/{bonusId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()))
      .replaceAll("\\{" + "bonusId" + "\\}", apiClient.escapeString(bonusId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("BonusResourceApi.deleteBonus", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param includeSourceGradeSteps  (optional)
   * @return Bonus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Bonus getBonusForExam(Long courseId, Long examId, Boolean includeSourceGradeSteps) throws ApiException {
    return getBonusForExamWithHttpInfo(courseId, examId, includeSourceGradeSteps).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param includeSourceGradeSteps  (optional)
   * @return ApiResponse&lt;Bonus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Bonus> getBonusForExamWithHttpInfo(Long courseId, Long examId, Boolean includeSourceGradeSteps) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getBonusForExam");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getBonusForExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSourceGradeSteps", includeSourceGradeSteps));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Bonus> localVarReturnType = new GenericType<Bonus>() {};

    return apiClient.invokeAPI("BonusResourceApi.getBonusForExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonusId  (required)
   * @param bonus  (required)
   * @return Bonus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Bonus updateBonus(Long courseId, Long examId, Long bonusId, Bonus bonus) throws ApiException {
    return updateBonusWithHttpInfo(courseId, examId, bonusId, bonus).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param bonusId  (required)
   * @param bonus  (required)
   * @return ApiResponse&lt;Bonus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Bonus> updateBonusWithHttpInfo(Long courseId, Long examId, Long bonusId, Bonus bonus) throws ApiException {
    Object localVarPostBody = bonus;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateBonus");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateBonus");
    }
    
    // verify the required parameter 'bonusId' is set
    if (bonusId == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusId' when calling updateBonus");
    }
    
    // verify the required parameter 'bonus' is set
    if (bonus == null) {
      throw new ApiException(400, "Missing the required parameter 'bonus' when calling updateBonus");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus/{bonusId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()))
      .replaceAll("\\{" + "bonusId" + "\\}", apiClient.escapeString(bonusId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Bonus> localVarReturnType = new GenericType<Bonus>() {};

    return apiClient.invokeAPI("BonusResourceApi.updateBonus", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
