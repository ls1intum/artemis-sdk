package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CreateFileUploadSubmissionRequest;
import de.tum.cit.ase.artemis.sdk.model.FileUploadSubmission;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class FileUploadSubmissionResourceApi {
  private ApiClient apiClient;

  public FileUploadSubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileUploadSubmissionResourceApi(ApiClient apiClient) {
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
   * @param createFileUploadSubmissionRequest  (optional)
   * @return FileUploadSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadSubmission createFileUploadSubmission(Long exerciseId, CreateFileUploadSubmissionRequest createFileUploadSubmissionRequest) throws ApiException {
    return createFileUploadSubmissionWithHttpInfo(exerciseId, createFileUploadSubmissionRequest).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param createFileUploadSubmissionRequest  (optional)
   * @return ApiResponse&lt;FileUploadSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadSubmission> createFileUploadSubmissionWithHttpInfo(Long exerciseId, CreateFileUploadSubmissionRequest createFileUploadSubmissionRequest) throws ApiException {
    Object localVarPostBody = createFileUploadSubmissionRequest;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createFileUploadSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/file-upload-submissions"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};

    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.createFileUploadSubmission", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submittedOnly  (optional, default to false)
   * @param assessedByTutor  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return List&lt;GetAllTextSubmissions200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<GetAllTextSubmissions200ResponseInner> getAllFileUploadSubmissions(Long exerciseId, Boolean submittedOnly, Boolean assessedByTutor, Integer correctionRound) throws ApiException {
    return getAllFileUploadSubmissionsWithHttpInfo(exerciseId, submittedOnly, assessedByTutor, correctionRound).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submittedOnly  (optional, default to false)
   * @param assessedByTutor  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return ApiResponse&lt;List&lt;GetAllTextSubmissions200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<GetAllTextSubmissions200ResponseInner>> getAllFileUploadSubmissionsWithHttpInfo(Long exerciseId, Boolean submittedOnly, Boolean assessedByTutor, Integer correctionRound) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllFileUploadSubmissions");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/file-upload-submissions"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "submittedOnly", submittedOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assessedByTutor", assessedByTutor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<GetAllTextSubmissions200ResponseInner>> localVarReturnType = new GenericType<List<GetAllTextSubmissions200ResponseInner>>() {};

    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getAllFileUploadSubmissions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return FileUploadSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadSubmission getDataForFileUpload(Long participationId) throws ApiException {
    return getDataForFileUploadWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;FileUploadSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadSubmission> getDataForFileUploadWithHttpInfo(Long participationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getDataForFileUpload");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/file-upload-editor"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()));

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

    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};

    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getDataForFileUpload", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @param correctionRound  (optional, default to 0)
   * @param resultId  (optional)
   * @return FileUploadSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadSubmission getFileUploadSubmission1(Long submissionId, Integer correctionRound, Long resultId) throws ApiException {
    return getFileUploadSubmission1WithHttpInfo(submissionId, correctionRound, resultId).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @param correctionRound  (optional, default to 0)
   * @param resultId  (optional)
   * @return ApiResponse&lt;FileUploadSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadSubmission> getFileUploadSubmission1WithHttpInfo(Long submissionId, Integer correctionRound, Long resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getFileUploadSubmission1");
    }
    
    // create path and map variables
    String localVarPath = "/api/file-upload-submissions/{submissionId}"
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

    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};

    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getFileUploadSubmission1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param lock  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return FileUploadSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadSubmission getFileUploadSubmissionWithoutAssessment(Long exerciseId, Boolean lock, Integer correctionRound) throws ApiException {
    return getFileUploadSubmissionWithoutAssessmentWithHttpInfo(exerciseId, lock, correctionRound).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param lock  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return ApiResponse&lt;FileUploadSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadSubmission> getFileUploadSubmissionWithoutAssessmentWithHttpInfo(Long exerciseId, Boolean lock, Integer correctionRound) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getFileUploadSubmissionWithoutAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/file-upload-submission-without-assessment"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lock", lock));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};

    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getFileUploadSubmissionWithoutAssessment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
