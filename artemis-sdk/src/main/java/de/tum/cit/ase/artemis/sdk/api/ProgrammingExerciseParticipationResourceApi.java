package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseStudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import de.tum.cit.ase.artemis.sdk.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ProgrammingExerciseParticipationResourceApi {
  private ApiClient apiClient;

  public ProgrammingExerciseParticipationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingExerciseParticipationResourceApi(ApiClient apiClient) {
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
   * @param participationId  (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Boolean checkIfParticipationHashResult(Long participationId) throws ApiException {
    return checkIfParticipationHashResultWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> checkIfParticipationHashResultWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling checkIfParticipationHashResult");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercise-participations/{participationId}/has-result"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("ProgrammingExerciseParticipationResourceApi.checkIfParticipationHashResult", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param lastGraded  (optional, default to false)
   * @return ProgrammingSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingSubmission getLatestPendingSubmission(Long participationId, Boolean lastGraded) throws ApiException {
    return getLatestPendingSubmissionWithHttpInfo(participationId, lastGraded).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param lastGraded  (optional, default to false)
   * @return ApiResponse&lt;ProgrammingSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingSubmission> getLatestPendingSubmissionWithHttpInfo(Long participationId, Boolean lastGraded) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getLatestPendingSubmission");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercise-participations/{participationId}/latest-pending-submission"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "lastGraded", lastGraded)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingSubmission> localVarReturnType = new GenericType<ProgrammingSubmission>() {};
    return apiClient.invokeAPI("ProgrammingExerciseParticipationResourceApi.getLatestPendingSubmission", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Map&lt;String, ProgrammingSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, ProgrammingSubmission> getLatestPendingSubmissionsByExerciseId(Long exerciseId) throws ApiException {
    return getLatestPendingSubmissionsByExerciseIdWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Map&lt;String, ProgrammingSubmission&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, ProgrammingSubmission>> getLatestPendingSubmissionsByExerciseIdWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getLatestPendingSubmissionsByExerciseId");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/latest-pending-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Map<String, ProgrammingSubmission>> localVarReturnType = new GenericType<Map<String, ProgrammingSubmission>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseParticipationResourceApi.getLatestPendingSubmissionsByExerciseId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param withSubmission  (optional, default to false)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result getLatestResultWithFeedbacksForProgrammingExerciseParticipation(Long participationId, Boolean withSubmission) throws ApiException {
    return getLatestResultWithFeedbacksForProgrammingExerciseParticipationWithHttpInfo(participationId, withSubmission).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param withSubmission  (optional, default to false)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getLatestResultWithFeedbacksForProgrammingExerciseParticipationWithHttpInfo(Long participationId, Boolean withSubmission) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getLatestResultWithFeedbacksForProgrammingExerciseParticipation");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercise-participations/{participationId}/latest-result-with-feedbacks"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withSubmission", withSubmission)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ProgrammingExerciseParticipationResourceApi.getLatestResultWithFeedbacksForProgrammingExerciseParticipation", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return ProgrammingExerciseStudentParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseStudentParticipation getParticipationWithLatestResultForStudentParticipation(Long participationId) throws ApiException {
    return getParticipationWithLatestResultForStudentParticipationWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;ProgrammingExerciseStudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseStudentParticipation> getParticipationWithLatestResultForStudentParticipationWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getParticipationWithLatestResultForStudentParticipation");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercise-participations/{participationId}/student-participation-with-latest-result-and-feedbacks"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExerciseStudentParticipation> localVarReturnType = new GenericType<ProgrammingExerciseStudentParticipation>() {};
    return apiClient.invokeAPI("ProgrammingExerciseParticipationResourceApi.getParticipationWithLatestResultForStudentParticipation", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param gradedParticipationId  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void resetRepository(Long participationId, Long gradedParticipationId) throws ApiException {
    resetRepositoryWithHttpInfo(participationId, gradedParticipationId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param gradedParticipationId  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> resetRepositoryWithHttpInfo(Long participationId, Long gradedParticipationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling resetRepository");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercise-participations/{participationId}/reset-repository"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "gradedParticipationId", gradedParticipationId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseParticipationResourceApi.resetRepository", localVarPath, "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
