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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create3");
    }
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling create3");
    }
    if (tutorialGroupFreePeriodDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodDTO' when calling create3");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupsConfigurationId}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorialGroupFreePeriod> localVarReturnType = new GenericType<TutorialGroupFreePeriod>() {};
    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.create3", localVarPath, "POST", new ArrayList<>(), tutorialGroupFreePeriodDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling delete1");
    }
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling delete1");
    }
    if (tutorialGroupFreePeriodId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodId' when calling delete1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupsConfigurationId}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()))
            .replaceAll("\\{tutorialGroupFreePeriodId}", apiClient.escapeString(tutorialGroupFreePeriodId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.delete1", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfConfiguration");
    }
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling getOneOfConfiguration");
    }
    if (tutorialGroupFreePeriodId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodId' when calling getOneOfConfiguration");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupsConfigurationId}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()))
            .replaceAll("\\{tutorialGroupFreePeriodId}", apiClient.escapeString(tutorialGroupFreePeriodId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TutorialGroupFreePeriod> localVarReturnType = new GenericType<TutorialGroupFreePeriod>() {};
    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.getOneOfConfiguration", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update3");
    }
    if (tutorialGroupsConfigurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupsConfigurationId' when calling update3");
    }
    if (tutorialGroupFreePeriodId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodId' when calling update3");
    }
    if (tutorialGroupFreePeriodDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupFreePeriodDTO' when calling update3");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups-configuration/{tutorialGroupsConfigurationId}/tutorial-free-periods/{tutorialGroupFreePeriodId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupsConfigurationId}", apiClient.escapeString(tutorialGroupsConfigurationId.toString()))
            .replaceAll("\\{tutorialGroupFreePeriodId}", apiClient.escapeString(tutorialGroupFreePeriodId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorialGroupFreePeriod> localVarReturnType = new GenericType<TutorialGroupFreePeriod>() {};
    return apiClient.invokeAPI("TutorialGroupFreePeriodResourceApi.update3", localVarPath, "PUT", new ArrayList<>(), tutorialGroupFreePeriodDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
