package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GetExerciseHint200Response;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class ExerciseHintResourceApi {
  private ApiClient apiClient;

  public ExerciseHintResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExerciseHintResourceApi(ApiClient apiClient) {
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
   * @param exerciseHintId  (required)
   * @return GetExerciseHint200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetExerciseHint200Response activateExerciseHint(Long exerciseId, Long exerciseHintId) throws ApiException {
    return activateExerciseHintWithHttpInfo(exerciseId, exerciseHintId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @return ApiResponse&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetExerciseHint200Response> activateExerciseHintWithHttpInfo(Long exerciseId, Long exerciseHintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling activateExerciseHint");
    }
    
    // verify the required parameter 'exerciseHintId' is set
    if (exerciseHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseHintId' when calling activateExerciseHint");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}/activate"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exerciseHintId" + "\\}", apiClient.escapeString(exerciseHintId.toString()));

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

    GenericType<GetExerciseHint200Response> localVarReturnType = new GenericType<GetExerciseHint200Response>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.activateExerciseHint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param getExerciseHint200Response  (required)
   * @return GetExerciseHint200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetExerciseHint200Response createExerciseHint(Long exerciseId, GetExerciseHint200Response getExerciseHint200Response) throws ApiException {
    return createExerciseHintWithHttpInfo(exerciseId, getExerciseHint200Response).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param getExerciseHint200Response  (required)
   * @return ApiResponse&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetExerciseHint200Response> createExerciseHintWithHttpInfo(Long exerciseId, GetExerciseHint200Response getExerciseHint200Response) throws ApiException {
    Object localVarPostBody = getExerciseHint200Response;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createExerciseHint");
    }
    
    // verify the required parameter 'getExerciseHint200Response' is set
    if (getExerciseHint200Response == null) {
      throw new ApiException(400, "Missing the required parameter 'getExerciseHint200Response' when calling createExerciseHint");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints"
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

    GenericType<GetExerciseHint200Response> localVarReturnType = new GenericType<GetExerciseHint200Response>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.createExerciseHint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteExerciseHint(Long exerciseId, Long exerciseHintId) throws ApiException {
    deleteExerciseHintWithHttpInfo(exerciseId, exerciseHintId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteExerciseHintWithHttpInfo(Long exerciseId, Long exerciseHintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteExerciseHint");
    }
    
    // verify the required parameter 'exerciseHintId' is set
    if (exerciseHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseHintId' when calling deleteExerciseHint");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exerciseHintId" + "\\}", apiClient.escapeString(exerciseHintId.toString()));

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

    return apiClient.invokeAPI("ExerciseHintResourceApi.deleteExerciseHint", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Set&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<GetExerciseHint200Response> getActivatedExerciseHintsForExercise(Long exerciseId) throws ApiException {
    return getActivatedExerciseHintsForExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;GetExerciseHint200Response&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<GetExerciseHint200Response>> getActivatedExerciseHintsForExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getActivatedExerciseHintsForExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/activated"
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

    GenericType<Set<GetExerciseHint200Response>> localVarReturnType = new GenericType<Set<GetExerciseHint200Response>>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.getActivatedExerciseHintsForExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Set&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<GetExerciseHint200Response> getAvailableExerciseHintsForExercise(Long exerciseId) throws ApiException {
    return getAvailableExerciseHintsForExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;GetExerciseHint200Response&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<GetExerciseHint200Response>> getAvailableExerciseHintsForExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAvailableExerciseHintsForExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/available"
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

    GenericType<Set<GetExerciseHint200Response>> localVarReturnType = new GenericType<Set<GetExerciseHint200Response>>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.getAvailableExerciseHintsForExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @return GetExerciseHint200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetExerciseHint200Response getExerciseHint(Long exerciseId, Long exerciseHintId) throws ApiException {
    return getExerciseHintWithHttpInfo(exerciseId, exerciseHintId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @return ApiResponse&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetExerciseHint200Response> getExerciseHintWithHttpInfo(Long exerciseId, Long exerciseHintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getExerciseHint");
    }
    
    // verify the required parameter 'exerciseHintId' is set
    if (exerciseHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseHintId' when calling getExerciseHint");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exerciseHintId" + "\\}", apiClient.escapeString(exerciseHintId.toString()));

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

    GenericType<GetExerciseHint200Response> localVarReturnType = new GenericType<GetExerciseHint200Response>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.getExerciseHint", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Set&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<GetExerciseHint200Response> getExerciseHintsForExercise(Long exerciseId) throws ApiException {
    return getExerciseHintsForExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;GetExerciseHint200Response&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<GetExerciseHint200Response>> getExerciseHintsForExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getExerciseHintsForExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints"
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

    GenericType<Set<GetExerciseHint200Response>> localVarReturnType = new GenericType<Set<GetExerciseHint200Response>>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.getExerciseHintsForExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getHintTitle(Long exerciseId, Long exerciseHintId) throws ApiException {
    return getHintTitleWithHttpInfo(exerciseId, exerciseHintId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getHintTitleWithHttpInfo(Long exerciseId, Long exerciseHintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getHintTitle");
    }
    
    // verify the required parameter 'exerciseHintId' is set
    if (exerciseHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseHintId' when calling getHintTitle");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}/title"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exerciseHintId" + "\\}", apiClient.escapeString(exerciseHintId.toString()));

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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.getHintTitle", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @param ratingValue  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void rateExerciseHint(Long exerciseId, Long exerciseHintId, Integer ratingValue) throws ApiException {
    rateExerciseHintWithHttpInfo(exerciseId, exerciseHintId, ratingValue);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exerciseHintId  (required)
   * @param ratingValue  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> rateExerciseHintWithHttpInfo(Long exerciseId, Long exerciseHintId, Integer ratingValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling rateExerciseHint");
    }
    
    // verify the required parameter 'exerciseHintId' is set
    if (exerciseHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseHintId' when calling rateExerciseHint");
    }
    
    // verify the required parameter 'ratingValue' is set
    if (ratingValue == null) {
      throw new ApiException(400, "Missing the required parameter 'ratingValue' when calling rateExerciseHint");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}/rating/{ratingValue}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "exerciseHintId" + "\\}", apiClient.escapeString(exerciseHintId.toString()))
      .replaceAll("\\{" + "ratingValue" + "\\}", apiClient.escapeString(ratingValue.toString()));

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

    return apiClient.invokeAPI("ExerciseHintResourceApi.rateExerciseHint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param exerciseHintId  (required)
   * @param exerciseId  (required)
   * @param getExerciseHint200Response  (required)
   * @return GetExerciseHint200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetExerciseHint200Response updateExerciseHint(Long exerciseHintId, Long exerciseId, GetExerciseHint200Response getExerciseHint200Response) throws ApiException {
    return updateExerciseHintWithHttpInfo(exerciseHintId, exerciseId, getExerciseHint200Response).getData();
  }

  /**
   * 
   * 
   * @param exerciseHintId  (required)
   * @param exerciseId  (required)
   * @param getExerciseHint200Response  (required)
   * @return ApiResponse&lt;GetExerciseHint200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetExerciseHint200Response> updateExerciseHintWithHttpInfo(Long exerciseHintId, Long exerciseId, GetExerciseHint200Response getExerciseHint200Response) throws ApiException {
    Object localVarPostBody = getExerciseHint200Response;
    
    // verify the required parameter 'exerciseHintId' is set
    if (exerciseHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseHintId' when calling updateExerciseHint");
    }
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateExerciseHint");
    }
    
    // verify the required parameter 'getExerciseHint200Response' is set
    if (getExerciseHint200Response == null) {
      throw new ApiException(400, "Missing the required parameter 'getExerciseHint200Response' when calling updateExerciseHint");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/exercise-hints/{exerciseHintId}"
      .replaceAll("\\{" + "exerciseHintId" + "\\}", apiClient.escapeString(exerciseHintId.toString()))
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

    GenericType<GetExerciseHint200Response> localVarReturnType = new GenericType<GetExerciseHint200Response>() {};

    return apiClient.invokeAPI("ExerciseHintResourceApi.updateExerciseHint", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
