package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.TextSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class TextSubmissionResourceApi {
  private ApiClient apiClient;

  public TextSubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TextSubmissionResourceApi(ApiClient apiClient) {
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
   * @param textSubmission  (required)
   * @return TextSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextSubmission createTextSubmission(Long exerciseId, TextSubmission textSubmission) throws ApiException {
    return createTextSubmissionWithHttpInfo(exerciseId, textSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param textSubmission  (required)
   * @return ApiResponse&lt;TextSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextSubmission> createTextSubmissionWithHttpInfo(Long exerciseId, TextSubmission textSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createTextSubmission");
    }
    if (textSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'textSubmission' when calling createTextSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/text-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextSubmission> localVarReturnType = new GenericType<TextSubmission>() {};
    return apiClient.invokeAPI("TextSubmissionResourceApi.createTextSubmission", localVarPath, "POST", new ArrayList<>(), textSubmission,
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
  public List<GetAllTextSubmissions200ResponseInner> getAllTextSubmissions(Long exerciseId, Boolean submittedOnly, Boolean assessedByTutor, Integer correctionRound) throws ApiException {
    return getAllTextSubmissionsWithHttpInfo(exerciseId, submittedOnly, assessedByTutor, correctionRound).getData();
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
  public ApiResponse<List<GetAllTextSubmissions200ResponseInner>> getAllTextSubmissionsWithHttpInfo(Long exerciseId, Boolean submittedOnly, Boolean assessedByTutor, Integer correctionRound) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllTextSubmissions");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/text-submissions"
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
    return apiClient.invokeAPI("TextSubmissionResourceApi.getAllTextSubmissions", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @return TextSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextSubmission getTextSubmissionWithResults(Long submissionId) throws ApiException {
    return getTextSubmissionWithResultsWithHttpInfo(submissionId).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @return ApiResponse&lt;TextSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextSubmission> getTextSubmissionWithResultsWithHttpInfo(Long submissionId) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getTextSubmissionWithResults");
    }

    // Path parameters
    String localVarPath = "/api/text-submissions/{submissionId}"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TextSubmission> localVarReturnType = new GenericType<TextSubmission>() {};
    return apiClient.invokeAPI("TextSubmissionResourceApi.getTextSubmissionWithResults", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param head  (optional, default to false)
   * @param lock  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return TextSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextSubmission getTextSubmissionWithoutAssessment(Long exerciseId, Boolean head, Boolean lock, Integer correctionRound) throws ApiException {
    return getTextSubmissionWithoutAssessmentWithHttpInfo(exerciseId, head, lock, correctionRound).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param head  (optional, default to false)
   * @param lock  (optional, default to false)
   * @param correctionRound  (optional, default to 0)
   * @return ApiResponse&lt;TextSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextSubmission> getTextSubmissionWithoutAssessmentWithHttpInfo(Long exerciseId, Boolean head, Boolean lock, Integer correctionRound) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getTextSubmissionWithoutAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/text-submission-without-assessment"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "head", head)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lock", lock));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correction-round", correctionRound));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TextSubmission> localVarReturnType = new GenericType<TextSubmission>() {};
    return apiClient.invokeAPI("TextSubmissionResourceApi.getTextSubmissionWithoutAssessment", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param textSubmission  (required)
   * @return TextSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextSubmission updateTextSubmission(Long exerciseId, TextSubmission textSubmission) throws ApiException {
    return updateTextSubmissionWithHttpInfo(exerciseId, textSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param textSubmission  (required)
   * @return ApiResponse&lt;TextSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextSubmission> updateTextSubmissionWithHttpInfo(Long exerciseId, TextSubmission textSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateTextSubmission");
    }
    if (textSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'textSubmission' when calling updateTextSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/text-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextSubmission> localVarReturnType = new GenericType<TextSubmission>() {};
    return apiClient.invokeAPI("TextSubmissionResourceApi.updateTextSubmission", localVarPath, "PUT", new ArrayList<>(), textSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
