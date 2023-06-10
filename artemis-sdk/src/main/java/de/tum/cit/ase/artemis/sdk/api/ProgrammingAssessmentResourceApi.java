package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.AssessmentUpdate;
import de.tum.cit.ase.artemis.sdk.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ProgrammingAssessmentResourceApi {
  private ApiClient apiClient;

  public ProgrammingAssessmentResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingAssessmentResourceApi(ApiClient apiClient) {
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
  public void cancelAssessment(Long submissionId) throws ApiException {
    cancelAssessmentWithHttpInfo(submissionId);
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
  public ApiResponse<Void> cancelAssessmentWithHttpInfo(Long submissionId) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling cancelAssessment");
    }

    // Path parameters
    String localVarPath = "/api/programming-submissions/{submissionId}/cancel-assessment"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingAssessmentResourceApi.cancelAssessment", localVarPath, "PUT", new ArrayList<>(), null,
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
  public void deleteAssessment1(Long participationId, Long submissionId, Long resultId) throws ApiException {
    deleteAssessment1WithHttpInfo(participationId, submissionId, resultId);
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
  public ApiResponse<Void> deleteAssessment1WithHttpInfo(Long participationId, Long submissionId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteAssessment1");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteAssessment1");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteAssessment1");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/programming-submissions/{submissionId}/results/{resultId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingAssessmentResourceApi.deleteAssessment1", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param result  (required)
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
  public Result saveProgrammingAssessment(Long participationId, Result result, Boolean submit) throws ApiException {
    return saveProgrammingAssessmentWithHttpInfo(participationId, result, submit).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param result  (required)
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
  public ApiResponse<Result> saveProgrammingAssessmentWithHttpInfo(Long participationId, Result result, Boolean submit) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling saveProgrammingAssessment");
    }
    if (result == null) {
      throw new ApiException(400, "Missing the required parameter 'result' when calling saveProgrammingAssessment");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/manual-results"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "submit", submit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ProgrammingAssessmentResourceApi.saveProgrammingAssessment", localVarPath, "PUT", localVarQueryParams, result,
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
  public Result updateProgrammingManualResultAfterComplaint(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    return updateProgrammingManualResultAfterComplaintWithHttpInfo(submissionId, assessmentUpdate).getData();
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
  public ApiResponse<Result> updateProgrammingManualResultAfterComplaintWithHttpInfo(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling updateProgrammingManualResultAfterComplaint");
    }
    if (assessmentUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'assessmentUpdate' when calling updateProgrammingManualResultAfterComplaint");
    }

    // Path parameters
    String localVarPath = "/api/programming-submissions/{submissionId}/assessment-after-complaint"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ProgrammingAssessmentResourceApi.updateProgrammingManualResultAfterComplaint", localVarPath, "PUT", new ArrayList<>(), assessmentUpdate,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
