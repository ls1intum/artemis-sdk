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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
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
    Object localVarPostBody = getSubmissionPolicyOfExercise200Response;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling addSubmissionPolicyToProgrammingExercise");
    }
    
    // verify the required parameter 'getSubmissionPolicyOfExercise200Response' is set
    if (getSubmissionPolicyOfExercise200Response == null) {
      throw new ApiException(400, "Missing the required parameter 'getSubmissionPolicyOfExercise200Response' when calling addSubmissionPolicyToProgrammingExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
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

    GenericType<GetSubmissionPolicyOfExercise200Response> localVarReturnType = new GenericType<GetSubmissionPolicyOfExercise200Response>() {};

    return apiClient.invokeAPI("SubmissionPolicyResourceApi.addSubmissionPolicyToProgrammingExercise", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSubmissionPolicyOfExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
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

    GenericType<GetSubmissionPolicyOfExercise200Response> localVarReturnType = new GenericType<GetSubmissionPolicyOfExercise200Response>() {};

    return apiClient.invokeAPI("SubmissionPolicyResourceApi.getSubmissionPolicyOfExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling removeSubmissionPolicyFromProgrammingExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
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

    return apiClient.invokeAPI("SubmissionPolicyResourceApi.removeSubmissionPolicyFromProgrammingExercise", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling toggleSubmissionPolicy");
    }
    
    // verify the required parameter 'activate' is set
    if (activate == null) {
      throw new ApiException(400, "Missing the required parameter 'activate' when calling toggleSubmissionPolicy");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activate", activate));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("SubmissionPolicyResourceApi.toggleSubmissionPolicy", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = getSubmissionPolicyOfExercise200Response;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateSubmissionPolicy");
    }
    
    // verify the required parameter 'getSubmissionPolicyOfExercise200Response' is set
    if (getSubmissionPolicyOfExercise200Response == null) {
      throw new ApiException(400, "Missing the required parameter 'getSubmissionPolicyOfExercise200Response' when calling updateSubmissionPolicy");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/submission-policy"
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

    GenericType<GetSubmissionPolicyOfExercise200Response> localVarReturnType = new GenericType<GetSubmissionPolicyOfExercise200Response>() {};

    return apiClient.invokeAPI("SubmissionPolicyResourceApi.updateSubmissionPolicy", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
