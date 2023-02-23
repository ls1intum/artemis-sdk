package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class ExampleSubmissionResourceApi {
  private ApiClient apiClient;

  public ExampleSubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExampleSubmissionResourceApi(ApiClient apiClient) {
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
   * @param exampleSubmission  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission createExampleSubmission(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    return createExampleSubmissionWithHttpInfo(exerciseId, exampleSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> createExampleSubmissionWithHttpInfo(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    Object localVarPostBody = exampleSubmission;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createExampleSubmission");
    }
    
    // verify the required parameter 'exampleSubmission' is set
    if (exampleSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmission' when calling createExampleSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions"
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

    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};

    return apiClient.invokeAPI("ExampleSubmissionResourceApi.createExampleSubmission", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteExampleSubmission(Long exampleSubmissionId) throws ApiException {
    deleteExampleSubmissionWithHttpInfo(exampleSubmissionId);
  }

  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteExampleSubmissionWithHttpInfo(Long exampleSubmissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exampleSubmissionId' is set
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling deleteExampleSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/example-submissions/{exampleSubmissionId}"
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

    return apiClient.invokeAPI("ExampleSubmissionResourceApi.deleteExampleSubmission", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission getExampleSubmission(Long exampleSubmissionId) throws ApiException {
    return getExampleSubmissionWithHttpInfo(exampleSubmissionId).getData();
  }

  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> getExampleSubmissionWithHttpInfo(Long exampleSubmissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exampleSubmissionId' is set
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling getExampleSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/example-submissions/{exampleSubmissionId}"
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

    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};

    return apiClient.invokeAPI("ExampleSubmissionResourceApi.getExampleSubmission", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param sourceSubmissionId  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission importExampleSubmission(Long exerciseId, Long sourceSubmissionId) throws ApiException {
    return importExampleSubmissionWithHttpInfo(exerciseId, sourceSubmissionId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param sourceSubmissionId  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> importExampleSubmissionWithHttpInfo(Long exerciseId, Long sourceSubmissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling importExampleSubmission");
    }
    
    // verify the required parameter 'sourceSubmissionId' is set
    if (sourceSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceSubmissionId' when calling importExampleSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/import/{sourceSubmissionId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "sourceSubmissionId" + "\\}", apiClient.escapeString(sourceSubmissionId.toString()));

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

    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};

    return apiClient.invokeAPI("ExampleSubmissionResourceApi.importExampleSubmission", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void prepareExampleAssessment(Long exerciseId, Long exampleSubmissionId) throws ApiException {
    prepareExampleAssessmentWithHttpInfo(exerciseId, exampleSubmissionId);
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
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> prepareExampleAssessmentWithHttpInfo(Long exerciseId, Long exampleSubmissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling prepareExampleAssessment");
    }
    
    // verify the required parameter 'exampleSubmissionId' is set
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling prepareExampleAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/prepare-assessment"
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

    return apiClient.invokeAPI("ExampleSubmissionResourceApi.prepareExampleAssessment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission updateExampleSubmission(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    return updateExampleSubmissionWithHttpInfo(exerciseId, exampleSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> updateExampleSubmissionWithHttpInfo(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    Object localVarPostBody = exampleSubmission;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateExampleSubmission");
    }
    
    // verify the required parameter 'exampleSubmission' is set
    if (exampleSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmission' when calling updateExampleSubmission");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions"
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

    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};

    return apiClient.invokeAPI("ExampleSubmissionResourceApi.updateExampleSubmission", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
