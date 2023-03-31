package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ConversationUserDTO;
import de.tum.cit.ase.artemis.sdk.model.GetConversationsOfUser200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.Pageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ConversationResourceApi {
  private ApiClient apiClient;

  public ConversationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversationResourceApi(ApiClient apiClient) {
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
   * @param conversationId  (required)
   * @param isFavorite  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void changeFavoriteStatus(Long courseId, Long conversationId, Boolean isFavorite) throws ApiException {
    changeFavoriteStatusWithHttpInfo(courseId, conversationId, isFavorite);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param conversationId  (required)
   * @param isFavorite  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> changeFavoriteStatusWithHttpInfo(Long courseId, Long conversationId, Boolean isFavorite) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling changeFavoriteStatus");
    }
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling changeFavoriteStatus");
    }
    if (isFavorite == null) {
      throw new ApiException(400, "Missing the required parameter 'isFavorite' when calling changeFavoriteStatus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/conversations/{conversationId}/favorite"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{conversationId}", apiClient.escapeString(conversationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isFavorite", isFavorite)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ConversationResourceApi.changeFavoriteStatus", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;GetConversationsOfUser200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<GetConversationsOfUser200ResponseInner> getConversationsOfUser(Long courseId) throws ApiException {
    return getConversationsOfUserWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;GetConversationsOfUser200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<GetConversationsOfUser200ResponseInner>> getConversationsOfUserWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getConversationsOfUser");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/conversations"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<GetConversationsOfUser200ResponseInner>> localVarReturnType = new GenericType<List<GetConversationsOfUser200ResponseInner>>() {};
    return apiClient.invokeAPI("ConversationResourceApi.getConversationsOfUser", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param conversationId  (required)
   * @param loginOrName  (required)
   * @param pageable  (required)
   * @param filter  (optional)
   * @return List&lt;ConversationUserDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ConversationUserDTO> searchMembersOfConversation(Long courseId, Long conversationId, String loginOrName, Pageable pageable, String filter) throws ApiException {
    return searchMembersOfConversationWithHttpInfo(courseId, conversationId, loginOrName, pageable, filter).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param conversationId  (required)
   * @param loginOrName  (required)
   * @param pageable  (required)
   * @param filter  (optional)
   * @return ApiResponse&lt;List&lt;ConversationUserDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConversationUserDTO>> searchMembersOfConversationWithHttpInfo(Long courseId, Long conversationId, String loginOrName, Pageable pageable, String filter) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling searchMembersOfConversation");
    }
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling searchMembersOfConversation");
    }
    if (loginOrName == null) {
      throw new ApiException(400, "Missing the required parameter 'loginOrName' when calling searchMembersOfConversation");
    }
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling searchMembersOfConversation");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/conversations/{conversationId}/members/search"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{conversationId}", apiClient.escapeString(conversationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "loginOrName", loginOrName)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageable", pageable));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ConversationUserDTO>> localVarReturnType = new GenericType<List<ConversationUserDTO>>() {};
    return apiClient.invokeAPI("ConversationResourceApi.searchMembersOfConversation", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param conversationId  (required)
   * @param isHidden  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void switchHiddenStatus(Long courseId, Long conversationId, Boolean isHidden) throws ApiException {
    switchHiddenStatusWithHttpInfo(courseId, conversationId, isHidden);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param conversationId  (required)
   * @param isHidden  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> switchHiddenStatusWithHttpInfo(Long courseId, Long conversationId, Boolean isHidden) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling switchHiddenStatus");
    }
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling switchHiddenStatus");
    }
    if (isHidden == null) {
      throw new ApiException(400, "Missing the required parameter 'isHidden' when calling switchHiddenStatus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/conversations/{conversationId}/hidden"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{conversationId}", apiClient.escapeString(conversationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isHidden", isHidden)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ConversationResourceApi.switchHiddenStatus", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
