package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GetSubmissionPolicyOfExercise200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class SubmissionPolicyResourceApi {
  private ApiClient apiClient;

  public SubmissionPolicyResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubmissionPolicyResourceApi(ApiClient apiClient) {
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
   * @param getSubmissionPolicyOfExercise200Response  (required)
   * @return GetSubmissionPolicyOfExercise200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetSubmissionPolicyOfExercise200Response addSubmissionPolicyToProgrammingExercise(Long exerciseId, GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise200Response) throws ApiException {
    return addSubmissionPolicyToProgrammingExerciseWithHttpInfo(exerciseId, getSubmissionPolicyOfExercise200Response).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param getSubmissionPolicyOfExercise200Response  (required)
   * @return ApiResponse&lt;GetSubmissionPolicyOfExercise200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubmissionPolicyOfExercise200Response> addSubmissionPolicyToProgrammingExerciseWithHttpInfo(Long exerciseId, GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise200Response) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling addSubmissionPolicyToProgrammingExercise");
    }
    if (getSubmissionPolicyOfExercise200Response == null) {
      throw new ApiException(400, "Missing the required parameter 'getSubmissionPolicyOfExercise200Response' when calling addSubmissionPolicyToProgrammingExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<GetSubmissionPolicyOfExercise200Response> localVarReturnType = new GenericType<GetSubmissionPolicyOfExercise200Response>() {};
    return apiClient.invokeAPI("SubmissionPolicyResourceApi.addSubmissionPolicyToProgrammingExercise", localVarPath, "POST", new ArrayList<>(), getSubmissionPolicyOfExercise200Response,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Integer getParticipationSubmissionCount(Long participationId) throws ApiException {
    return getParticipationSubmissionCountWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> getParticipationSubmissionCountWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getParticipationSubmissionCount");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/submission-count"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("SubmissionPolicyResourceApi.getParticipationSubmissionCount", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return GetSubmissionPolicyOfExercise200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise(Long exerciseId) throws ApiException {
    return getSubmissionPolicyOfExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;GetSubmissionPolicyOfExercise200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubmissionPolicyOfExercise200Response> getSubmissionPolicyOfExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSubmissionPolicyOfExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GetSubmissionPolicyOfExercise200Response> localVarReturnType = new GenericType<GetSubmissionPolicyOfExercise200Response>() {};
    return apiClient.invokeAPI("SubmissionPolicyResourceApi.getSubmissionPolicyOfExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
  public void removeSubmissionPolicyFromProgrammingExercise(Long exerciseId) throws ApiException {
    removeSubmissionPolicyFromProgrammingExerciseWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> removeSubmissionPolicyFromProgrammingExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling removeSubmissionPolicyFromProgrammingExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("SubmissionPolicyResourceApi.removeSubmissionPolicyFromProgrammingExercise", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param activate  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void toggleSubmissionPolicy(Long exerciseId, Boolean activate) throws ApiException {
    toggleSubmissionPolicyWithHttpInfo(exerciseId, activate);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param activate  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> toggleSubmissionPolicyWithHttpInfo(Long exerciseId, Boolean activate) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling toggleSubmissionPolicy");
    }
    if (activate == null) {
      throw new ApiException(400, "Missing the required parameter 'activate' when calling toggleSubmissionPolicy");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "activate", activate)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("SubmissionPolicyResourceApi.toggleSubmissionPolicy", localVarPath, "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param getSubmissionPolicyOfExercise200Response  (required)
   * @return GetSubmissionPolicyOfExercise200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetSubmissionPolicyOfExercise200Response updateSubmissionPolicy(Long exerciseId, GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise200Response) throws ApiException {
    return updateSubmissionPolicyWithHttpInfo(exerciseId, getSubmissionPolicyOfExercise200Response).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param getSubmissionPolicyOfExercise200Response  (required)
   * @return ApiResponse&lt;GetSubmissionPolicyOfExercise200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSubmissionPolicyOfExercise200Response> updateSubmissionPolicyWithHttpInfo(Long exerciseId, GetSubmissionPolicyOfExercise200Response getSubmissionPolicyOfExercise200Response) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateSubmissionPolicy");
    }
    if (getSubmissionPolicyOfExercise200Response == null) {
      throw new ApiException(400, "Missing the required parameter 'getSubmissionPolicyOfExercise200Response' when calling updateSubmissionPolicy");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<GetSubmissionPolicyOfExercise200Response> localVarReturnType = new GenericType<GetSubmissionPolicyOfExercise200Response>() {};
    return apiClient.invokeAPI("SubmissionPolicyResourceApi.updateSubmissionPolicy", localVarPath, "PATCH", new ArrayList<>(), getSubmissionPolicyOfExercise200Response,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
