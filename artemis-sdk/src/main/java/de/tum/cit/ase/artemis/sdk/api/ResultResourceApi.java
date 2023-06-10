package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Feedback;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.ResultWithPointsPerGradingCriterionDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ResultResourceApi {
  private ApiClient apiClient;

  public ResultResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ResultResourceApi(ApiClient apiClient) {
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
   * @param exerciseId  (required)
   * @param studentLogin  (required)
   * @param result  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result createResultForExternalSubmission(Long exerciseId, String studentLogin, Result result) throws ApiException {
    return createResultForExternalSubmissionWithHttpInfo(exerciseId, studentLogin, result).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param studentLogin  (required)
   * @param result  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> createResultForExternalSubmissionWithHttpInfo(Long exerciseId, String studentLogin, Result result) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createResultForExternalSubmission");
    }
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling createResultForExternalSubmission");
    }
    if (result == null) {
      throw new ApiException(400, "Missing the required parameter 'result' when calling createResultForExternalSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/external-submission-results"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "studentLogin", studentLogin)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ResultResourceApi.createResultForExternalSubmission", localVarPath, "POST", localVarQueryParams, result,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteResult(Long participationId, Long resultId) throws ApiException {
    deleteResultWithHttpInfo(participationId, resultId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteResultWithHttpInfo(Long participationId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteResult");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteResult");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/results/{resultId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ResultResourceApi.deleteResult", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result getResult(Long participationId, Long resultId) throws ApiException {
    return getResultWithHttpInfo(participationId, resultId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getResultWithHttpInfo(Long participationId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getResult");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getResult");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/results/{resultId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ResultResourceApi.getResult", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @return List&lt;Feedback&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Feedback> getResultDetails(Long participationId, Long resultId) throws ApiException {
    return getResultDetailsWithHttpInfo(participationId, resultId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @return ApiResponse&lt;List&lt;Feedback&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Feedback>> getResultDetailsWithHttpInfo(Long participationId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getResultDetails");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getResultDetails");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/results/{resultId}/details"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Feedback>> localVarReturnType = new GenericType<List<Feedback>>() {};
    return apiClient.invokeAPI("ResultResourceApi.getResultDetails", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param withSubmissions  (optional, default to true)
   * @return List&lt;ResultWithPointsPerGradingCriterionDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ResultWithPointsPerGradingCriterionDTO> getResultsForExerciseWithPointsPerCriterion(Long exerciseId, Boolean withSubmissions) throws ApiException {
    return getResultsForExerciseWithPointsPerCriterionWithHttpInfo(exerciseId, withSubmissions).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param withSubmissions  (optional, default to true)
   * @return ApiResponse&lt;List&lt;ResultWithPointsPerGradingCriterionDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ResultWithPointsPerGradingCriterionDTO>> getResultsForExerciseWithPointsPerCriterionWithHttpInfo(Long exerciseId, Boolean withSubmissions) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getResultsForExerciseWithPointsPerCriterion");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/results-with-points-per-criterion"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withSubmissions", withSubmissions)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ResultWithPointsPerGradingCriterionDTO>> localVarReturnType = new GenericType<List<ResultWithPointsPerGradingCriterionDTO>>() {};
    return apiClient.invokeAPI("ResultResourceApi.getResultsForExerciseWithPointsPerCriterion", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param authorization  (required)
   * @param body  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Object processNewProgrammingExerciseResult(String authorization, Object body) throws ApiException {
    return processNewProgrammingExerciseResultWithHttpInfo(authorization, body).getData();
  }

  /**
   * 
   * 
   * @param authorization  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> processNewProgrammingExerciseResultWithHttpInfo(String authorization, Object body) throws ApiException {
    // Check required parameters
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling processNewProgrammingExerciseResult");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling processNewProgrammingExerciseResult");
    }

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("ResultResourceApi.processNewProgrammingExerciseResult", "/api/programming-exercises/new-result", "POST", new ArrayList<>(), body,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
