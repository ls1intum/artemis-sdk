package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOSubmission;
import de.tum.cit.ase.artemis.sdk.model.SubmissionWithComplaintDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class SubmissionResourceApi {
  private ApiClient apiClient;

  public SubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubmissionResourceApi(ApiClient apiClient) {
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
  public void deleteSubmission(Long submissionId) throws ApiException {
    deleteSubmissionWithHttpInfo(submissionId);
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
  public ApiResponse<Void> deleteSubmissionWithHttpInfo(Long submissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/submissions/{submissionId}"
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

    return apiClient.invokeAPI("SubmissionResourceApi.deleteSubmission", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param search  (required)
   * @return SearchResultPageDTOSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOSubmission getSubmissionsOnPageWithSize(Long exerciseId, PageableSearchDTOString search) throws ApiException {
    return getSubmissionsOnPageWithSizeWithHttpInfo(exerciseId, search).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param search  (required)
   * @return ApiResponse&lt;SearchResultPageDTOSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOSubmission> getSubmissionsOnPageWithSizeWithHttpInfo(Long exerciseId, PageableSearchDTOString search) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSubmissionsOnPageWithSize");
    }
    
    // verify the required parameter 'search' is set
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getSubmissionsOnPageWithSize");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/submissions-for-import"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SearchResultPageDTOSubmission> localVarReturnType = new GenericType<SearchResultPageDTOSubmission>() {};

    return apiClient.invokeAPI("SubmissionResourceApi.getSubmissionsOnPageWithSize", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;SubmissionWithComplaintDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<SubmissionWithComplaintDTO> getSubmissionsWithComplaintsForAssessmentDashboard(Long exerciseId) throws ApiException {
    return getSubmissionsWithComplaintsForAssessmentDashboardWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;SubmissionWithComplaintDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SubmissionWithComplaintDTO>> getSubmissionsWithComplaintsForAssessmentDashboardWithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSubmissionsWithComplaintsForAssessmentDashboard");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/submissions-with-complaints"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

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

    GenericType<List<SubmissionWithComplaintDTO>> localVarReturnType = new GenericType<List<SubmissionWithComplaintDTO>>() {};

    return apiClient.invokeAPI("SubmissionResourceApi.getSubmissionsWithComplaintsForAssessmentDashboard", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;SubmissionWithComplaintDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<SubmissionWithComplaintDTO> getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard(Long exerciseId) throws ApiException {
    return getSubmissionsWithMoreFeedbackRequestForAssessmentDashboardWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;SubmissionWithComplaintDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SubmissionWithComplaintDTO>> getSubmissionsWithMoreFeedbackRequestForAssessmentDashboardWithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/more-feedback-requests-with-complaints"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

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

    GenericType<List<SubmissionWithComplaintDTO>> localVarReturnType = new GenericType<List<SubmissionWithComplaintDTO>>() {};

    return apiClient.invokeAPI("SubmissionResourceApi.getSubmissionsWithMoreFeedbackRequestForAssessmentDashboard", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;GetAllTextSubmissions200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<GetAllTextSubmissions200ResponseInner> getTestRunSubmissionsForAssessment(Long exerciseId) throws ApiException {
    return getTestRunSubmissionsForAssessmentWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;GetAllTextSubmissions200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<GetAllTextSubmissions200ResponseInner>> getTestRunSubmissionsForAssessmentWithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getTestRunSubmissionsForAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/test-run-submissions"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

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

    GenericType<List<GetAllTextSubmissions200ResponseInner>> localVarReturnType = new GenericType<List<GetAllTextSubmissions200ResponseInner>>() {};

    return apiClient.invokeAPI("SubmissionResourceApi.getTestRunSubmissionsForAssessment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
