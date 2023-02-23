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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling cancelAssessment3");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling cancelAssessment3");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/cancel-assessment"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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

    return apiClient.invokeAPI("TextAssessmentResourceApi.cancelAssessment3", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteAssessment");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteAssessment");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/text-submissions/{submissionId}/results/{resultId}"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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

    return apiClient.invokeAPI("TextAssessmentResourceApi.deleteAssessment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteTextExampleAssessment");
    }
    
    // verify the required parameter 'exampleSubmissionId' is set
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling deleteTextExampleAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-text-assessment/feedback"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exampleSubmissionId" + "\\}", apiClient.escapeString(exampleSubmissionId.toString()));

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

    return apiClient.invokeAPI("TextAssessmentResourceApi.deleteTextExampleAssessment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getConflictingTextSubmissions");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getConflictingTextSubmissions");
    }
    
    // verify the required parameter 'feedbackId' is set
    if (feedbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'feedbackId' when calling getConflictingTextSubmissions");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/feedbacks/{feedbackId}/feedback-conflicts"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()))
      .replaceAll("\\{" + "feedbackId" + "\\}", apiClient.escapeString(feedbackId.toString()));

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

    GenericType<Set<TextSubmission>> localVarReturnType = new GenericType<Set<TextSubmission>>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.getConflictingTextSubmissions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getExampleResultForTutor");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getExampleResultForTutor");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/submissions/{submissionId}/example-result"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.getExampleResultForTutor", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling retrieveParticipationForSubmission");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling retrieveParticipationForSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/for-text-assessment"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resultId", resultId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CleanupBuildPlan200Response> localVarReturnType = new GenericType<CleanupBuildPlan200Response>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.retrieveParticipationForSubmission", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = textAssessmentDTO;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling saveTextAssessment");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling saveTextAssessment");
    }
    
    // verify the required parameter 'textAssessmentDTO' is set
    if (textAssessmentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentDTO' when calling saveTextAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/results/{resultId}/text-assessment"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.saveTextAssessment", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = textAssessmentDTO;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling saveTextExampleAssessment");
    }
    
    // verify the required parameter 'exampleSubmissionId' is set
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling saveTextExampleAssessment");
    }
    
    // verify the required parameter 'textAssessmentDTO' is set
    if (textAssessmentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentDTO' when calling saveTextExampleAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/example-text-assessment"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exampleSubmissionId" + "\\}", apiClient.escapeString(exampleSubmissionId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.saveTextExampleAssessment", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling solveFeedbackConflict");
    }
    
    // verify the required parameter 'feedbackConflictId' is set
    if (feedbackConflictId == null) {
      throw new ApiException(400, "Missing the required parameter 'feedbackConflictId' when calling solveFeedbackConflict");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/feedback-conflicts/{feedbackConflictId}/solve"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "feedbackConflictId" + "\\}", apiClient.escapeString(feedbackConflictId.toString()));

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

    GenericType<FeedbackConflict> localVarReturnType = new GenericType<FeedbackConflict>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.solveFeedbackConflict", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = textAssessmentDTO;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling submitTextAssessment");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling submitTextAssessment");
    }
    
    // verify the required parameter 'textAssessmentDTO' is set
    if (textAssessmentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentDTO' when calling submitTextAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/results/{resultId}/submit-text-assessment"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.submitTextAssessment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = textAssessmentUpdateDTO;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling updateTextAssessmentAfterComplaint");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling updateTextAssessmentAfterComplaint");
    }
    
    // verify the required parameter 'textAssessmentUpdateDTO' is set
    if (textAssessmentUpdateDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'textAssessmentUpdateDTO' when calling updateTextAssessmentAfterComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/submissions/{submissionId}/text-assessment-after-complaint"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("TextAssessmentResourceApi.updateTextAssessmentAfterComplaint", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
