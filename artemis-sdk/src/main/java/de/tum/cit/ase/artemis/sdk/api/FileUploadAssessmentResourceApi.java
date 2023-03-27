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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class FileUploadAssessmentResourceApi {
  private ApiClient apiClient;

  public FileUploadAssessmentResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileUploadAssessmentResourceApi(ApiClient apiClient) {
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
  public void cancelAssessment2(Long submissionId) throws ApiException {
    cancelAssessment2WithHttpInfo(submissionId);
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
  public ApiResponse<Void> cancelAssessment2WithHttpInfo(Long submissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling cancelAssessment2");
    }
    
    // create path and map variables
    String localVarPath = "/api/file-upload-submissions/{submissionId}/cancel-assessment"
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

    return apiClient.invokeAPI("FileUploadAssessmentResourceApi.cancelAssessment2", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
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
  public void deleteAssessment3(Long participationId, Long submissionId, Long resultId) throws ApiException {
    deleteAssessment3WithHttpInfo(participationId, submissionId, resultId);
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
  public ApiResponse<Void> deleteAssessment3WithHttpInfo(Long participationId, Long submissionId, Long resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteAssessment3");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteAssessment3");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteAssessment3");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/file-upload-submissions/{submissionId}/results/{resultId}"
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

    return apiClient.invokeAPI("FileUploadAssessmentResourceApi.deleteAssessment3", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public Result getAssessmentBySubmissionId1(Long submissionId) throws ApiException {
    return getAssessmentBySubmissionId1WithHttpInfo(submissionId).getData();
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
  public ApiResponse<Result> getAssessmentBySubmissionId1WithHttpInfo(Long submissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getAssessmentBySubmissionId1");
    }
    
    // create path and map variables
    String localVarPath = "/api/file-upload-submissions/{submissionId}/result"
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

    return apiClient.invokeAPI("FileUploadAssessmentResourceApi.getAssessmentBySubmissionId1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
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
  public Result saveFileUploadAssessment(Long submissionId, List<Feedback> feedback, Boolean submit) throws ApiException {
    return saveFileUploadAssessmentWithHttpInfo(submissionId, feedback, submit).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
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
  public ApiResponse<Result> saveFileUploadAssessmentWithHttpInfo(Long submissionId, List<Feedback> feedback, Boolean submit) throws ApiException {
    Object localVarPostBody = feedback;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling saveFileUploadAssessment");
    }
    
    // verify the required parameter 'feedback' is set
    if (feedback == null) {
      throw new ApiException(400, "Missing the required parameter 'feedback' when calling saveFileUploadAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/file-upload-submissions/{submissionId}/feedback"
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "submit", submit));

    
    
    
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

    return apiClient.invokeAPI("FileUploadAssessmentResourceApi.saveFileUploadAssessment", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public Result updateFileUploadAssessmentAfterComplaint(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    return updateFileUploadAssessmentAfterComplaintWithHttpInfo(submissionId, assessmentUpdate).getData();
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
  public ApiResponse<Result> updateFileUploadAssessmentAfterComplaintWithHttpInfo(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    Object localVarPostBody = assessmentUpdate;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling updateFileUploadAssessmentAfterComplaint");
    }
    
    // verify the required parameter 'assessmentUpdate' is set
    if (assessmentUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'assessmentUpdate' when calling updateFileUploadAssessmentAfterComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/file-upload-submissions/{submissionId}/assessment-after-complaint"
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

    return apiClient.invokeAPI("FileUploadAssessmentResourceApi.updateFileUploadAssessmentAfterComplaint", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
