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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling calculateGradeWithBonus");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling calculateGradeWithBonus");
    }
    if (bonusStrategy == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusStrategy' when calling calculateGradeWithBonus");
    }
    if (calculationSign == null) {
      throw new ApiException(400, "Missing the required parameter 'calculationSign' when calling calculateGradeWithBonus");
    }
    if (bonusToPoints == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusToPoints' when calling calculateGradeWithBonus");
    }
    if (sourceGradingScaleId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceGradingScaleId' when calling calculateGradeWithBonus");
    }
    if (sourcePoints == null) {
      throw new ApiException(400, "Missing the required parameter 'sourcePoints' when calling calculateGradeWithBonus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus/calculate-raw"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "bonusStrategy", bonusStrategy)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calculationSign", calculationSign));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bonusToPoints", bonusToPoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceGradingScaleId", sourceGradingScaleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourcePoints", sourcePoints));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BonusExampleDTO> localVarReturnType = new GenericType<BonusExampleDTO>() {};
    return apiClient.invokeAPI("BonusResourceApi.calculateGradeWithBonus", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createBonusForExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling createBonusForExam");
    }
    if (bonus == null) {
      throw new ApiException(400, "Missing the required parameter 'bonus' when calling createBonusForExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Bonus> localVarReturnType = new GenericType<Bonus>() {};
    return apiClient.invokeAPI("BonusResourceApi.createBonusForExam", localVarPath, "POST", new ArrayList<>(), bonus,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteBonus");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling deleteBonus");
    }
    if (bonusId == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusId' when calling deleteBonus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus/{bonusId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{bonusId}", apiClient.escapeString(bonusId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("BonusResourceApi.deleteBonus", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getBonusForExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getBonusForExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeSourceGradeSteps", includeSourceGradeSteps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Bonus> localVarReturnType = new GenericType<Bonus>() {};
    return apiClient.invokeAPI("BonusResourceApi.getBonusForExam", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateBonus");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateBonus");
    }
    if (bonusId == null) {
      throw new ApiException(400, "Missing the required parameter 'bonusId' when calling updateBonus");
    }
    if (bonus == null) {
      throw new ApiException(400, "Missing the required parameter 'bonus' when calling updateBonus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/bonus/{bonusId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{bonusId}", apiClient.escapeString(bonusId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Bonus> localVarReturnType = new GenericType<Bonus>() {};
    return apiClient.invokeAPI("BonusResourceApi.updateBonus", localVarPath, "PUT", new ArrayList<>(), bonus,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
