package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ConsistencyErrorDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class ConsistencyCheckResourceApi {
  private ApiClient apiClient;

  public ConsistencyCheckResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConsistencyCheckResourceApi(ApiClient apiClient) {
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
   * @param programmingExerciseId  (required)
   * @return List&lt;ConsistencyErrorDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ConsistencyErrorDTO> checkConsistencyOfProgrammingExercise(Long programmingExerciseId) throws ApiException {
    return checkConsistencyOfProgrammingExerciseWithHttpInfo(programmingExerciseId).getData();
  }

  /**
   * 
   * 
   * @param programmingExerciseId  (required)
   * @return ApiResponse&lt;List&lt;ConsistencyErrorDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConsistencyErrorDTO>> checkConsistencyOfProgrammingExerciseWithHttpInfo(Long programmingExerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'programmingExerciseId' is set
    if (programmingExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExerciseId' when calling checkConsistencyOfProgrammingExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{programmingExerciseId}/consistency-check"
      .replaceAll("\\{" + "programmingExerciseId" + "\\}", apiClient.escapeString(programmingExerciseId.toString()));

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

    GenericType<List<ConsistencyErrorDTO>> localVarReturnType = new GenericType<List<ConsistencyErrorDTO>>() {};

    return apiClient.invokeAPI("ConsistencyCheckResourceApi.checkConsistencyOfProgrammingExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
