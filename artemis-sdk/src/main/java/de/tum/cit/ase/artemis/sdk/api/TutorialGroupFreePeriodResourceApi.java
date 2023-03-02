package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.TutorialGroupFreePeriod;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupFreePeriodDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class TutorialGroupFreePeriodResourceApi {
  private ApiClient apiClient;

  public TutorialGroupFreePeriodResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TutorialGroupFreePeriodResourceApi(ApiClient apiClient) {
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
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodDTO  (required)
   * @return TutorialGroupFreePeriod
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupFreePeriod create3(Long courseId, Long tutorialGroupsConfigurationId, TutorialGroupFreePeriodDTO tutorialGroupFreePeriodDTO) throws ApiException {
    return create3WithHttpInfo(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodDTO  (required)
   * @return ApiResponse&lt;TutorialGroupFreePeriod&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupFreePeriod> create3WithHttpInfo(Long courseId, Long tutorialGroupsConfigurationId, TutorialGroupFreePeriodDTO tutorialGroupFreePeriodDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupFreePeriodDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create3");
    }
    
    // verify the required parameter 'tutorialGroupsConfigurationId' is set
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling create3");
    }
    
    // verify the required parameter 'tutorialGroupFreePeriodDTO' is set
    if (tutorialGroupFreePeriodDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodDTO' when calling create3");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupsConfigurationId" + "\\}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()));

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

    GenericType<TutorialGroupFreePeriod> localVarReturnType = new GenericType<TutorialGroupFreePeriod>() {};

    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.create3", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void delete1(Long courseId, Long tutorialGroupsConfigurationId, Long tutorialGroupFreePeriodId) throws ApiException {
    delete1WithHttpInfo(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> delete1WithHttpInfo(Long courseId, Long tutorialGroupsConfigurationId, Long tutorialGroupFreePeriodId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling delete1");
    }
    
    // verify the required parameter 'tutorialGroupsConfigurationId' is set
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling delete1");
    }
    
    // verify the required parameter 'tutorialGroupFreePeriodId' is set
    if (tutorialGroupFreePeriodId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodId' when calling delete1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupsConfigurationId" + "\\}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()))
      .replaceAll("\\{" + "tutorialGroupFreePeriodId" + "\\}", apiClient.escapeString(tutorialGroupFreePeriodId.toString()));

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

    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.delete1", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodId  (required)
   * @return TutorialGroupFreePeriod
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupFreePeriod getOneOfConfiguration(Long courseId, Long tutorialGroupsConfigurationId, Long tutorialGroupFreePeriodId) throws ApiException {
    return getOneOfConfigurationWithHttpInfo(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodId  (required)
   * @return ApiResponse&lt;TutorialGroupFreePeriod&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupFreePeriod> getOneOfConfigurationWithHttpInfo(Long courseId, Long tutorialGroupsConfigurationId, Long tutorialGroupFreePeriodId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfConfiguration");
    }
    
    // verify the required parameter 'tutorialGroupsConfigurationId' is set
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling getOneOfConfiguration");
    }
    
    // verify the required parameter 'tutorialGroupFreePeriodId' is set
    if (tutorialGroupFreePeriodId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodId' when calling getOneOfConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupsConfigurationId" + "\\}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()))
      .replaceAll("\\{" + "tutorialGroupFreePeriodId" + "\\}", apiClient.escapeString(tutorialGroupFreePeriodId.toString()));

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

    GenericType<TutorialGroupFreePeriod> localVarReturnType = new GenericType<TutorialGroupFreePeriod>() {};

    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.getOneOfConfiguration", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodId  (required)
   * @param tutorialGroupFreePeriodDTO  (required)
   * @return TutorialGroupFreePeriod
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupFreePeriod update3(Long courseId, Long tutorialGroupsConfigurationId, Long tutorialGroupFreePeriodId, TutorialGroupFreePeriodDTO tutorialGroupFreePeriodDTO) throws ApiException {
    return update3WithHttpInfo(courseId, tutorialGroupsConfigurationId, tutorialGroupFreePeriodId, tutorialGroupFreePeriodDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupFreePeriodId  (required)
   * @param tutorialGroupFreePeriodDTO  (required)
   * @return ApiResponse&lt;TutorialGroupFreePeriod&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupFreePeriod> update3WithHttpInfo(Long courseId, Long tutorialGroupsConfigurationId, Long tutorialGroupFreePeriodId, TutorialGroupFreePeriodDTO tutorialGroupFreePeriodDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupFreePeriodDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update3");
    }
    
    // verify the required parameter 'tutorialGroupsConfigurationId' is set
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling update3");
    }
    
    // verify the required parameter 'tutorialGroupFreePeriodId' is set
    if (tutorialGroupFreePeriodId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodId' when calling update3");
    }
    
    // verify the required parameter 'tutorialGroupFreePeriodDTO' is set
    if (tutorialGroupFreePeriodDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodDTO' when calling update3");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupsConfigurationId" + "\\}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()))
      .replaceAll("\\{" + "tutorialGroupFreePeriodId" + "\\}", apiClient.escapeString(tutorialGroupFreePeriodId.toString()));

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

    GenericType<TutorialGroupFreePeriod> localVarReturnType = new GenericType<TutorialGroupFreePeriod>() {};

    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.update3", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
