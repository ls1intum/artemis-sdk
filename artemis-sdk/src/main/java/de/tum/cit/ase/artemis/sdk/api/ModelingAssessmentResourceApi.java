package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.AssessmentUpdate;
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import de.tum.cit.ase.artemis.sdk.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ModelingAssessmentResourceApi {
  private ApiClient apiClient;

  public ModelingAssessmentResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModelingAssessmentResourceApi(ApiClient apiClient) {
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
   * @param submissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void cancelAssessment1(Long submissionId) throws ApiException {
    cancelAssessment1WithHttpInfo(submissionId);
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelAssessment1WithHttpInfo(Long submissionId) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling cancelAssessment1");
    }

    // Path parameters
    String localVarPath = "/api/modeling-submissions/{submissionId}/cancel-assessment"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.cancelAssessment1", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param resultId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAssessment2(Long participationId, Long submissionId, Long resultId) throws ApiException {
    deleteAssessment2WithHttpInfo(participationId, submissionId, resultId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
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
  public ApiResponse<Void> deleteAssessment2WithHttpInfo(Long participationId, Long submissionId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteAssessment2");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteAssessment2");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteAssessment2");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/modeling-submissions/{submissionId}/results/{resultId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.deleteAssessment2", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result getAssessmentBySubmissionId(Long submissionId) throws ApiException {
    return getAssessmentBySubmissionIdWithHttpInfo(submissionId).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getAssessmentBySubmissionIdWithHttpInfo(Long submissionId) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getAssessmentBySubmissionId");
    }

    // Path parameters
    String localVarPath = "/api/modeling-submissions/{submissionId}/result"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.getAssessmentBySubmissionId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionId  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result getModelingExampleAssessment(Long exerciseId, Long submissionId) throws ApiException {
    return getModelingExampleAssessmentWithHttpInfo(exerciseId, submissionId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionId  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getModelingExampleAssessmentWithHttpInfo(Long exerciseId, Long submissionId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getModelingExampleAssessment");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getModelingExampleAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercise/{exerciseId}/modeling-submissions/{submissionId}/example-assessment"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.getModelingExampleAssessment", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @param resultId  (required)
   * @param feedback  (required)
   * @param submit  (optional, default to false)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result saveModelingAssessment(Long submissionId, Long resultId, List<Feedback> feedback, Boolean submit) throws ApiException {
    return saveModelingAssessmentWithHttpInfo(submissionId, resultId, feedback, submit).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @param resultId  (required)
   * @param feedback  (required)
   * @param submit  (optional, default to false)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> saveModelingAssessmentWithHttpInfo(Long submissionId, Long resultId, List<Feedback> feedback, Boolean submit) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling saveModelingAssessment");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling saveModelingAssessment");
    }
    if (feedback == null) {
      throw new ApiException(400, "Missing the required parameter 'feedback' when calling saveModelingAssessment");
    }

    // Path parameters
    String localVarPath = "/api/modeling-submissions/{submissionId}/result/{resultId}/assessment"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "submit", submit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.saveModelingAssessment", localVarPath, "PUT", localVarQueryParams, feedback,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @param feedback  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result saveModelingExampleAssessment(Long exampleSubmissionId, List<Feedback> feedback) throws ApiException {
    return saveModelingExampleAssessmentWithHttpInfo(exampleSubmissionId, feedback).getData();
  }

  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @param feedback  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> saveModelingExampleAssessmentWithHttpInfo(Long exampleSubmissionId, List<Feedback> feedback) throws ApiException {
    // Check required parameters
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling saveModelingExampleAssessment");
    }
    if (feedback == null) {
      throw new ApiException(400, "Missing the required parameter 'feedback' when calling saveModelingExampleAssessment");
    }

    // Path parameters
    String localVarPath = "/api/modeling-submissions/{exampleSubmissionId}/example-assessment"
            .replaceAll("\\{exampleSubmissionId}", apiClient.escapeString(exampleSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.saveModelingExampleAssessment", localVarPath, "PUT", new ArrayList<>(), feedback,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @param assessmentUpdate  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result updateModelingAssessmentAfterComplaint(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    return updateModelingAssessmentAfterComplaintWithHttpInfo(submissionId, assessmentUpdate).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @param assessmentUpdate  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> updateModelingAssessmentAfterComplaintWithHttpInfo(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling updateModelingAssessmentAfterComplaint");
    }
    if (assessmentUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'assessmentUpdate' when calling updateModelingAssessmentAfterComplaint");
    }

    // Path parameters
    String localVarPath = "/api/modeling-submissions/{submissionId}/assessment-after-complaint"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ModelingAssessmentResourceApi.updateModelingAssessmentAfterComplaint", localVarPath, "PUT", new ArrayList<>(), assessmentUpdate,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
