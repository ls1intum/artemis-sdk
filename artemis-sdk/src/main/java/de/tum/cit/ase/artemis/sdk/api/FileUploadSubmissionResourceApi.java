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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
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
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createFileUploadSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/file-upload-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};
    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.createFileUploadSubmission", localVarPath, "POST", new ArrayList<>(), createFileUploadSubmissionRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllFileUploadSubmissions");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/file-upload-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "submittedOnly", submittedOnly)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assessedByTutor", assessedByTutor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<GetAllTextSubmissions200ResponseInner>> localVarReturnType = new GenericType<List<GetAllTextSubmissions200ResponseInner>>() {};
    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getAllFileUploadSubmissions", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getDataForFileUpload");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/file-upload-editor"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};
    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getDataForFileUpload", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getFileUploadSubmission1");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-submissions/{submissionId}"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "correction-round", correctionRound)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resultId", resultId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};
    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getFileUploadSubmission1", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getFileUploadSubmissionWithoutAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/file-upload-submission-without-assessment"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "lock", lock)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FileUploadSubmission> localVarReturnType = new GenericType<FileUploadSubmission>() {};
    return apiClient.invokeAPI("FileUploadSubmissionResourceApi.getFileUploadSubmissionWithoutAssessment", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
