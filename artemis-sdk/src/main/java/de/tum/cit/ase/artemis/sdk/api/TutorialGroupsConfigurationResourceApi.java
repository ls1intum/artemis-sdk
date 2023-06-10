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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create2");
    }
    if (tutorialGroupsConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfiguration' when calling create2");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorialGroupsConfiguration> localVarReturnType = new GenericType<TutorialGroupsConfiguration>() {};
    return apiClient.invokeAPI("TutorialGroupsConfigurationResourceApi.create2", localVarPath, "POST", new ArrayList<>(), tutorialGroupsConfiguration,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfCourse1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TutorialGroupsConfiguration> localVarReturnType = new GenericType<TutorialGroupsConfiguration>() {};
    return apiClient.invokeAPI("TutorialGroupsConfigurationResourceApi.getOneOfCourse1", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update2");
    }
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling update2");
    }
    if (tutorialGroupsConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfiguration' when calling update2");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupsConfigurationId}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorialGroupsConfiguration> localVarReturnType = new GenericType<TutorialGroupsConfiguration>() {};
    return apiClient.invokeAPI("TutorialGroupsConfigurationResourceApi.update2", localVarPath, "PUT", new ArrayList<>(), tutorialGroupsConfiguration,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
