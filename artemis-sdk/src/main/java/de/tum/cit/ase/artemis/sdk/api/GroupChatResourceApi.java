package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GroupChatDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class GroupChatResourceApi {
  private ApiClient apiClient;

  public GroupChatResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupChatResourceApi(ApiClient apiClient) {
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
   * @param groupChatId  (required)
   * @param requestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deregisterUsersFromGroupChat(Long courseId, Long groupChatId, List<String> requestBody) throws ApiException {
    deregisterUsersFromGroupChatWithHttpInfo(courseId, groupChatId, requestBody);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param groupChatId  (required)
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
  public ApiResponse<Void> deregisterUsersFromGroupChatWithHttpInfo(Long courseId, Long groupChatId, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deregisterUsersFromGroupChat");
    }
    if (groupChatId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatId' when calling deregisterUsersFromGroupChat");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling deregisterUsersFromGroupChat");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/group-chats/{groupChatId}/deregister"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{groupChatId}", apiClient.escapeString(groupChatId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("GroupChatResourceApi.deregisterUsersFromGroupChat", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param groupChatId  (required)
   * @param requestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void registerUsersToGroupChat(Long courseId, Long groupChatId, List<String> requestBody) throws ApiException {
    registerUsersToGroupChatWithHttpInfo(courseId, groupChatId, requestBody);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param groupChatId  (required)
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
  public ApiResponse<Void> registerUsersToGroupChatWithHttpInfo(Long courseId, Long groupChatId, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerUsersToGroupChat");
    }
    if (groupChatId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatId' when calling registerUsersToGroupChat");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling registerUsersToGroupChat");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/group-chats/{groupChatId}/register"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{groupChatId}", apiClient.escapeString(groupChatId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("GroupChatResourceApi.registerUsersToGroupChat", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param requestBody  (required)
   * @return GroupChatDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GroupChatDTO startGroupChat(Long courseId, List<String> requestBody) throws ApiException {
    return startGroupChatWithHttpInfo(courseId, requestBody).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;GroupChatDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GroupChatDTO> startGroupChatWithHttpInfo(Long courseId, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling startGroupChat");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling startGroupChat");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/group-chats"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<GroupChatDTO> localVarReturnType = new GenericType<GroupChatDTO>() {};
    return apiClient.invokeAPI("GroupChatResourceApi.startGroupChat", localVarPath, "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param groupChatId  (required)
   * @param groupChatDTO  (required)
   * @return GroupChatDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GroupChatDTO updateGroupChat(Long courseId, Long groupChatId, GroupChatDTO groupChatDTO) throws ApiException {
    return updateGroupChatWithHttpInfo(courseId, groupChatId, groupChatDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param groupChatId  (required)
   * @param groupChatDTO  (required)
   * @return ApiResponse&lt;GroupChatDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GroupChatDTO> updateGroupChatWithHttpInfo(Long courseId, Long groupChatId, GroupChatDTO groupChatDTO) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateGroupChat");
    }
    if (groupChatId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatId' when calling updateGroupChat");
    }
    if (groupChatDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatDTO' when calling updateGroupChat");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/group-chats/{groupChatId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{groupChatId}", apiClient.escapeString(groupChatId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<GroupChatDTO> localVarReturnType = new GenericType<GroupChatDTO>() {};
    return apiClient.invokeAPI("GroupChatResourceApi.updateGroupChat", localVarPath, "PUT", new ArrayList<>(), groupChatDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
