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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
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
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deregisterUsersFromGroupChat");
    }
    
    // verify the required parameter 'groupChatId' is set
    if (groupChatId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatId' when calling deregisterUsersFromGroupChat");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling deregisterUsersFromGroupChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/group-chats/{groupChatId}/deregister"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "groupChatId" + "\\}", apiClient.escapeString(groupChatId.toString()));

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

    return apiClient.invokeAPI("GroupChatResourceApi.deregisterUsersFromGroupChat", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerUsersToGroupChat");
    }
    
    // verify the required parameter 'groupChatId' is set
    if (groupChatId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatId' when calling registerUsersToGroupChat");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling registerUsersToGroupChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/group-chats/{groupChatId}/register"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "groupChatId" + "\\}", apiClient.escapeString(groupChatId.toString()));

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

    return apiClient.invokeAPI("GroupChatResourceApi.registerUsersToGroupChat", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling startGroupChat");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling startGroupChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/group-chats"
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

    GenericType<GroupChatDTO> localVarReturnType = new GenericType<GroupChatDTO>() {};

    return apiClient.invokeAPI("GroupChatResourceApi.startGroupChat", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = groupChatDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateGroupChat");
    }
    
    // verify the required parameter 'groupChatId' is set
    if (groupChatId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatId' when calling updateGroupChat");
    }
    
    // verify the required parameter 'groupChatDTO' is set
    if (groupChatDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'groupChatDTO' when calling updateGroupChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/group-chats/{groupChatId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "groupChatId" + "\\}", apiClient.escapeString(groupChatId.toString()));

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

    GenericType<GroupChatDTO> localVarReturnType = new GenericType<GroupChatDTO>() {};

    return apiClient.invokeAPI("GroupChatResourceApi.updateGroupChat", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
