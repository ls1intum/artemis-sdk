package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CleanupBuildPlan200Response;
import de.tum.cit.ase.artemis.sdk.model.FeedbackConflict;
import de.tum.cit.ase.artemis.sdk.model.Result;
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.TextAssessmentDTO;
import de.tum.cit.ase.artemis.sdk.model.TextAssessmentUpdateDTO;
import de.tum.cit.ase.artemis.sdk.model.TextSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class TextAssessmentResourceApi {
  private ApiClient apiClient;

  public TextAssessmentResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TextAssessmentResourceApi(ApiClient apiClient) {
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
   * @param submissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void cancelAssessment3(Long participationId, Long submissionId) throws ApiException {
    cancelAssessment3WithHttpInfo(participationId, submissionId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
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
  public ApiResponse<Void> cancelAssessment3WithHttpInfo(Long participationId, Long submissionId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling cancelAssessment3");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling cancelAssessment3");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/cancel-assessment"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TextAssessmentResourceApi.cancelAssessment3", localVarPath, "POST", new ArrayList<>(), null,
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
  public void deleteAssessment(Long participationId, Long submissionId, Long resultId) throws ApiException {
    deleteAssessmentWithHttpInfo(participationId, submissionId, resultId);
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
  public ApiResponse<Void> deleteAssessmentWithHttpInfo(Long participationId, Long submissionId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteAssessment");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteAssessment");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteAssessment");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/text-submissions/{submissionId}/results/{resultId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TextAssessmentResourceApi.deleteAssessment", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void deleteTextExampleAssessment(Long exerciseId, Long exampleSubmissionId) throws ApiException {
    deleteTextExampleAssessmentWithHttpInfo(exerciseId, exampleSubmissionId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmissionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteTextExampleAssessmentWithHttpInfo(Long exerciseId, Long exampleSubmissionId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteTextExampleAssessment");
    }
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling deleteTextExampleAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-text-assessment/feedback"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{exampleSubmissionId}", apiClient.escapeString(exampleSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TextAssessmentResourceApi.deleteTextExampleAssessment", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param feedbackId  (required)
   * @return Set&lt;TextSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<TextSubmission> getConflictingTextSubmissions(Long participationId, Long submissionId, Long feedbackId) throws ApiException {
    return getConflictingTextSubmissionsWithHttpInfo(participationId, submissionId, feedbackId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param feedbackId  (required)
   * @return ApiResponse&lt;Set&lt;TextSubmission&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<TextSubmission>> getConflictingTextSubmissionsWithHttpInfo(Long participationId, Long submissionId, Long feedbackId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getConflictingTextSubmissions");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getConflictingTextSubmissions");
    }
    if (feedbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'feedbackId' when calling getConflictingTextSubmissions");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/feedbacks/{feedbackId}/feedback-conflicts"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()))
            .replaceAll("\\{feedbackId}", apiClient.escapeString(feedbackId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<TextSubmission>> localVarReturnType = new GenericType<Set<TextSubmission>>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.getConflictingTextSubmissions", localVarPath, "GET", new ArrayList<>(), null,
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
  public Result getExampleResultForTutor(Long exerciseId, Long submissionId) throws ApiException {
    return getExampleResultForTutorWithHttpInfo(exerciseId, submissionId).getData();
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
  public ApiResponse<Result> getExampleResultForTutorWithHttpInfo(Long exerciseId, Long submissionId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getExampleResultForTutor");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getExampleResultForTutor");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/submissions/{submissionId}/example-result"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.getExampleResultForTutor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param correctionRound  (optional, default to 0)
   * @param resultId  (optional)
   * @return CleanupBuildPlan200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CleanupBuildPlan200Response retrieveParticipationForSubmission(Long participationId, Long submissionId, Integer correctionRound, Long resultId) throws ApiException {
    return retrieveParticipationForSubmissionWithHttpInfo(participationId, submissionId, correctionRound, resultId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param correctionRound  (optional, default to 0)
   * @param resultId  (optional)
   * @return ApiResponse&lt;CleanupBuildPlan200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CleanupBuildPlan200Response> retrieveParticipationForSubmissionWithHttpInfo(Long participationId, Long submissionId, Integer correctionRound, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling retrieveParticipationForSubmission");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling retrieveParticipationForSubmission");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/for-text-assessment"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "correction-round", correctionRound)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resultId", resultId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CleanupBuildPlan200Response> localVarReturnType = new GenericType<CleanupBuildPlan200Response>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.retrieveParticipationForSubmission", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @param textAssessmentDTO  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result saveTextAssessment(Long participationId, Long resultId, TextAssessmentDTO textAssessmentDTO) throws ApiException {
    return saveTextAssessmentWithHttpInfo(participationId, resultId, textAssessmentDTO).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @param textAssessmentDTO  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> saveTextAssessmentWithHttpInfo(Long participationId, Long resultId, TextAssessmentDTO textAssessmentDTO) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling saveTextAssessment");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling saveTextAssessment");
    }
    if (textAssessmentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentDTO' when calling saveTextAssessment");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/results/{resultId}/text-assessment"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.saveTextAssessment", localVarPath, "PUT", new ArrayList<>(), textAssessmentDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmissionId  (required)
   * @param textAssessmentDTO  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result saveTextExampleAssessment(Long exerciseId, Long exampleSubmissionId, TextAssessmentDTO textAssessmentDTO) throws ApiException {
    return saveTextExampleAssessmentWithHttpInfo(exerciseId, exampleSubmissionId, textAssessmentDTO).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmissionId  (required)
   * @param textAssessmentDTO  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> saveTextExampleAssessmentWithHttpInfo(Long exerciseId, Long exampleSubmissionId, TextAssessmentDTO textAssessmentDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling saveTextExampleAssessment");
    }
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling saveTextExampleAssessment");
    }
    if (textAssessmentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentDTO' when calling saveTextExampleAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-text-assessment"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{exampleSubmissionId}", apiClient.escapeString(exampleSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.saveTextExampleAssessment", localVarPath, "PUT", new ArrayList<>(), textAssessmentDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param feedbackConflictId  (required)
   * @return FeedbackConflict
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FeedbackConflict solveFeedbackConflict(Long exerciseId, Long feedbackConflictId) throws ApiException {
    return solveFeedbackConflictWithHttpInfo(exerciseId, feedbackConflictId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param feedbackConflictId  (required)
   * @return ApiResponse&lt;FeedbackConflict&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FeedbackConflict> solveFeedbackConflictWithHttpInfo(Long exerciseId, Long feedbackConflictId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling solveFeedbackConflict");
    }
    if (feedbackConflictId == null) {
      throw new ApiException(400, "Missing the required parameter 'feedbackConflictId' when calling solveFeedbackConflict");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/feedback-conflicts/{feedbackConflictId}/solve"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{feedbackConflictId}", apiClient.escapeString(feedbackConflictId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FeedbackConflict> localVarReturnType = new GenericType<FeedbackConflict>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.solveFeedbackConflict", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @param textAssessmentDTO  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result submitTextAssessment(Long participationId, Long resultId, TextAssessmentDTO textAssessmentDTO) throws ApiException {
    return submitTextAssessmentWithHttpInfo(participationId, resultId, textAssessmentDTO).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (required)
   * @param textAssessmentDTO  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> submitTextAssessmentWithHttpInfo(Long participationId, Long resultId, TextAssessmentDTO textAssessmentDTO) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling submitTextAssessment");
    }
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling submitTextAssessment");
    }
    if (textAssessmentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentDTO' when calling submitTextAssessment");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/results/{resultId}/submit-text-assessment"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.submitTextAssessment", localVarPath, "POST", new ArrayList<>(), textAssessmentDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param textAssessmentUpdateDTO  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result updateTextAssessmentAfterComplaint(Long participationId, Long submissionId, TextAssessmentUpdateDTO textAssessmentUpdateDTO) throws ApiException {
    return updateTextAssessmentAfterComplaintWithHttpInfo(participationId, submissionId, textAssessmentUpdateDTO).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param textAssessmentUpdateDTO  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> updateTextAssessmentAfterComplaintWithHttpInfo(Long participationId, Long submissionId, TextAssessmentUpdateDTO textAssessmentUpdateDTO) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling updateTextAssessmentAfterComplaint");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling updateTextAssessmentAfterComplaint");
    }
    if (textAssessmentUpdateDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentUpdateDTO' when calling updateTextAssessmentAfterComplaint");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/text-assessment-after-complaint"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("TextAssessmentResourceApi.updateTextAssessmentAfterComplaint", localVarPath, "PUT", new ArrayList<>(), textAssessmentUpdateDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
