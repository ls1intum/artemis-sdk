package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ProgrammingSubmissionResourceApi {
  private ApiClient apiClient;

  public ProgrammingSubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingSubmissionResourceApi(ApiClient apiClient) {
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
   * @param submittedOnly  (optional, default to false)
   * @param assessedByTutor  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return List&lt;ProgrammingSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ProgrammingSubmission> getAllProgrammingSubmissions(Long exerciseId, Boolean submittedOnly, Boolean assessedByTutor, Integer correctionRound) throws ApiException {
    return getAllProgrammingSubmissionsWithHttpInfo(exerciseId, submittedOnly, assessedByTutor, correctionRound).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submittedOnly  (optional, default to false)
   * @param assessedByTutor  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return ApiResponse&lt;List&lt;ProgrammingSubmission&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ProgrammingSubmission>> getAllProgrammingSubmissionsWithHttpInfo(Long exerciseId, Boolean submittedOnly, Boolean assessedByTutor, Integer correctionRound) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllProgrammingSubmissions");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/programming-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "submittedOnly", submittedOnly)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assessedByTutor", assessedByTutor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ProgrammingSubmission>> localVarReturnType = new GenericType<List<ProgrammingSubmission>>() {};
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.getAllProgrammingSubmissions", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param lock  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return ProgrammingSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingSubmission getProgrammingSubmissionWithoutAssessment(Long exerciseId, Boolean lock, Integer correctionRound) throws ApiException {
    return getProgrammingSubmissionWithoutAssessmentWithHttpInfo(exerciseId, lock, correctionRound).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param lock  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return ApiResponse&lt;ProgrammingSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingSubmission> getProgrammingSubmissionWithoutAssessmentWithHttpInfo(Long exerciseId, Boolean lock, Integer correctionRound) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getProgrammingSubmissionWithoutAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/programming-submission-without-assessment"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "lock", lock)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingSubmission> localVarReturnType = new GenericType<ProgrammingSubmission>() {};
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.getProgrammingSubmissionWithoutAssessment", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @param correctionRound  (optional, default to 0)
   * @return ProgrammingSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingSubmission lockAndGetProgrammingSubmission(Long submissionId, Integer correctionRound) throws ApiException {
    return lockAndGetProgrammingSubmissionWithHttpInfo(submissionId, correctionRound).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @param correctionRound  (optional, default to 0)
   * @return ApiResponse&lt;ProgrammingSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingSubmission> lockAndGetProgrammingSubmissionWithHttpInfo(Long submissionId, Integer correctionRound) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling lockAndGetProgrammingSubmission");
    }

    // Path parameters
    String localVarPath = "/api/programming-submissions/{submissionId}/lock"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "correction-round", correctionRound)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingSubmission> localVarReturnType = new GenericType<ProgrammingSubmission>() {};
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.lockAndGetProgrammingSubmission", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
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
  public Object processNewProgrammingSubmission(Long participationId, Object body) throws ApiException {
    return processNewProgrammingSubmissionWithHttpInfo(participationId, body).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
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
  public ApiResponse<Object> processNewProgrammingSubmissionWithHttpInfo(Long participationId, Object body) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling processNewProgrammingSubmission");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling processNewProgrammingSubmission");
    }

    // Path parameters
    String localVarPath = "/api/programming-submissions/{participationId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.processNewProgrammingSubmission", localVarPath, "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void testCaseChanged(Long exerciseId, Object body) throws ApiException {
    testCaseChangedWithHttpInfo(exerciseId, body);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testCaseChangedWithHttpInfo(Long exerciseId, Object body) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling testCaseChanged");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testCaseChanged");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/test-cases-changed/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.testCaseChanged", localVarPath, "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionType  (optional, default to MANUAL)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void triggerBuild(Long participationId, String submissionType) throws ApiException {
    triggerBuildWithHttpInfo(participationId, submissionType);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionType  (optional, default to MANUAL)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> triggerBuildWithHttpInfo(Long participationId, String submissionType) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling triggerBuild");
    }

    // Path parameters
    String localVarPath = "/api/programming-submissions/{participationId}/trigger-build"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "submissionType", submissionType)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.triggerBuild", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param lastGraded  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void triggerFailedBuild(Long participationId, Boolean lastGraded) throws ApiException {
    triggerFailedBuildWithHttpInfo(participationId, lastGraded);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param lastGraded  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> triggerFailedBuildWithHttpInfo(Long participationId, Boolean lastGraded) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling triggerFailedBuild");
    }

    // Path parameters
    String localVarPath = "/api/programming-submissions/{participationId}/trigger-failed-build"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "lastGraded", lastGraded)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.triggerFailedBuild", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param requestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void triggerInstructorBuildForExercise(Long exerciseId, Set<Long> requestBody) throws ApiException {
    triggerInstructorBuildForExerciseWithHttpInfo(exerciseId, requestBody);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> triggerInstructorBuildForExerciseWithHttpInfo(Long exerciseId, Set<Long> requestBody) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling triggerInstructorBuildForExercise");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling triggerInstructorBuildForExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/trigger-instructor-build"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.triggerInstructorBuildForExercise", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void triggerInstructorBuildForExercise1(Long exerciseId) throws ApiException {
    triggerInstructorBuildForExercise1WithHttpInfo(exerciseId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> triggerInstructorBuildForExercise1WithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling triggerInstructorBuildForExercise1");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/trigger-instructor-build-all"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingSubmissionResourceApi.triggerInstructorBuildForExercise1", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
