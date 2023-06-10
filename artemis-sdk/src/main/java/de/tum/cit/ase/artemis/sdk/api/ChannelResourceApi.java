package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ChannelDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ChannelResourceApi {
  private ApiClient apiClient;

  public ChannelResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChannelResourceApi(ApiClient apiClient) {
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
   * @param channelId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void archiveChannel(Long courseId, Long channelId) throws ApiException {
    archiveChannelWithHttpInfo(courseId, channelId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> archiveChannelWithHttpInfo(Long courseId, Long channelId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling archiveChannel");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling archiveChannel");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}/archive"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ChannelResourceApi.archiveChannel", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelDTO  (required)
   * @return ChannelDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ChannelDTO createChannel(Long courseId, ChannelDTO channelDTO) throws ApiException {
    return createChannelWithHttpInfo(courseId, channelDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelDTO  (required)
   * @return ApiResponse&lt;ChannelDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChannelDTO> createChannelWithHttpInfo(Long courseId, ChannelDTO channelDTO) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createChannel");
    }
    if (channelDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'channelDTO' when calling createChannel");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ChannelDTO> localVarReturnType = new GenericType<ChannelDTO>() {};
    return apiClient.invokeAPI("ChannelResourceApi.createChannel", localVarPath, "POST", new ArrayList<>(), channelDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteChannel(Long courseId, Long channelId) throws ApiException {
    deleteChannelWithHttpInfo(courseId, channelId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteChannelWithHttpInfo(Long courseId, Long channelId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteChannel");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling deleteChannel");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ChannelResourceApi.deleteChannel", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param requestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deregisterUsers(Long courseId, Long channelId, List<String> requestBody) throws ApiException {
    deregisterUsersWithHttpInfo(courseId, channelId, requestBody);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deregisterUsersWithHttpInfo(Long courseId, Long channelId, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deregisterUsers");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling deregisterUsers");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling deregisterUsers");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}/deregister"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ChannelResourceApi.deregisterUsers", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;ChannelDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ChannelDTO> getCourseChannelsOverview(Long courseId) throws ApiException {
    return getCourseChannelsOverviewWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;ChannelDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ChannelDTO>> getCourseChannelsOverviewWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseChannelsOverview");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/overview"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ChannelDTO>> localVarReturnType = new GenericType<List<ChannelDTO>>() {};
    return apiClient.invokeAPI("ChannelResourceApi.getCourseChannelsOverview", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param requestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void grantChannelModeratorRole(Long courseId, Long channelId, List<String> requestBody) throws ApiException {
    grantChannelModeratorRoleWithHttpInfo(courseId, channelId, requestBody);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> grantChannelModeratorRoleWithHttpInfo(Long courseId, Long channelId, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling grantChannelModeratorRole");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling grantChannelModeratorRole");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling grantChannelModeratorRole");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}/grant-channel-moderator"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ChannelResourceApi.grantChannelModeratorRole", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param addAllStudents  (optional, default to false)
   * @param addAllTutors  (optional, default to false)
   * @param addAllInstructors  (optional, default to false)
   * @param requestBody  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void registerUsersToChannel(Long courseId, Long channelId, Boolean addAllStudents, Boolean addAllTutors, Boolean addAllInstructors, List<String> requestBody) throws ApiException {
    registerUsersToChannelWithHttpInfo(courseId, channelId, addAllStudents, addAllTutors, addAllInstructors, requestBody);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param addAllStudents  (optional, default to false)
   * @param addAllTutors  (optional, default to false)
   * @param addAllInstructors  (optional, default to false)
   * @param requestBody  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> registerUsersToChannelWithHttpInfo(Long courseId, Long channelId, Boolean addAllStudents, Boolean addAllTutors, Boolean addAllInstructors, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerUsersToChannel");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling registerUsersToChannel");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}/register"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "addAllStudents", addAllStudents)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "addAllTutors", addAllTutors));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "addAllInstructors", addAllInstructors));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ChannelResourceApi.registerUsersToChannel", localVarPath, "POST", localVarQueryParams, requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param requestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void revokeChannelModeratorRole(Long courseId, Long channelId, List<String> requestBody) throws ApiException {
    revokeChannelModeratorRoleWithHttpInfo(courseId, channelId, requestBody);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> revokeChannelModeratorRoleWithHttpInfo(Long courseId, Long channelId, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling revokeChannelModeratorRole");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling revokeChannelModeratorRole");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling revokeChannelModeratorRole");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}/revoke-channel-moderator"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ChannelResourceApi.revokeChannelModeratorRole", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void unArchiveChannel(Long courseId, Long channelId) throws ApiException {
    unArchiveChannelWithHttpInfo(courseId, channelId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> unArchiveChannelWithHttpInfo(Long courseId, Long channelId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling unArchiveChannel");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling unArchiveChannel");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}/unarchive"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ChannelResourceApi.unArchiveChannel", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param channelDTO  (required)
   * @return ChannelDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ChannelDTO updateChannel(Long courseId, Long channelId, ChannelDTO channelDTO) throws ApiException {
    return updateChannelWithHttpInfo(courseId, channelId, channelDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param channelId  (required)
   * @param channelDTO  (required)
   * @return ApiResponse&lt;ChannelDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChannelDTO> updateChannelWithHttpInfo(Long courseId, Long channelId, ChannelDTO channelDTO) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateChannel");
    }
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling updateChannel");
    }
    if (channelDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'channelDTO' when calling updateChannel");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/channels/{channelId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{channelId}", apiClient.escapeString(channelId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ChannelDTO> localVarReturnType = new GenericType<ChannelDTO>() {};
    return apiClient.invokeAPI("ChannelResourceApi.updateChannel", localVarPath, "PUT", new ArrayList<>(), channelDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
