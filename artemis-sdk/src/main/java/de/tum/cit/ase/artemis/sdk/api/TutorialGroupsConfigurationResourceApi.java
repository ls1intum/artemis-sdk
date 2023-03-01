package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.TutorialGroupsConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TutorialGroupsConfigurationResourceApi {
  private ApiClient apiClient;

  public TutorialGroupsConfigurationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TutorialGroupsConfigurationResourceApi(ApiClient apiClient) {
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
   * @param tutorialGroupsConfiguration  (required)
   * @return TutorialGroupsConfiguration
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupsConfiguration create2(Long courseId, TutorialGroupsConfiguration tutorialGroupsConfiguration) throws ApiException {
    return create2WithHttpInfo(courseId, tutorialGroupsConfiguration).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfiguration  (required)
   * @return ApiResponse&lt;TutorialGroupsConfiguration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupsConfiguration> create2WithHttpInfo(Long courseId, TutorialGroupsConfiguration tutorialGroupsConfiguration) throws ApiException {
    Object localVarPostBody = tutorialGroupsConfiguration;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create2");
    }
    
    // verify the required parameter 'tutorialGroupsConfiguration' is set
    if (tutorialGroupsConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfiguration' when calling create2");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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

    GenericType<TutorialGroupsConfiguration> localVarReturnType = new GenericType<TutorialGroupsConfiguration>() {};

    return apiClient.invokeAPI("TutorialGroupsConfigurationResourceApi.create2", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return TutorialGroupsConfiguration
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupsConfiguration getOneOfCourse1(Long courseId) throws ApiException {
    return getOneOfCourse1WithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;TutorialGroupsConfiguration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupsConfiguration> getOneOfCourse1WithHttpInfo(Long courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfCourse1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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

    GenericType<TutorialGroupsConfiguration> localVarReturnType = new GenericType<TutorialGroupsConfiguration>() {};

    return apiClient.invokeAPI("TutorialGroupsConfigurationResourceApi.getOneOfCourse1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupsConfiguration  (required)
   * @return TutorialGroupsConfiguration
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupsConfiguration update2(Long courseId, Long tutorialGroupsConfigurationId, TutorialGroupsConfiguration tutorialGroupsConfiguration) throws ApiException {
    return update2WithHttpInfo(courseId, tutorialGroupsConfigurationId, tutorialGroupsConfiguration).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupsConfigurationId  (required)
   * @param tutorialGroupsConfiguration  (required)
   * @return ApiResponse&lt;TutorialGroupsConfiguration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupsConfiguration> update2WithHttpInfo(Long courseId, Long tutorialGroupsConfigurationId, TutorialGroupsConfiguration tutorialGroupsConfiguration) throws ApiException {
    Object localVarPostBody = tutorialGroupsConfiguration;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update2");
    }
    
    // verify the required parameter 'tutorialGroupsConfigurationId' is set
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling update2");
    }
    
    // verify the required parameter 'tutorialGroupsConfiguration' is set
    if (tutorialGroupsConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfiguration' when calling update2");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}"
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

    GenericType<TutorialGroupsConfiguration> localVarReturnType = new GenericType<TutorialGroupsConfiguration>() {};

    return apiClient.invokeAPI("TutorialGroupsConfigurationResourceApi.update2", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
