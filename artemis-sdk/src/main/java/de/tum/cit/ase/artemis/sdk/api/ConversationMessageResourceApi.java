package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Pageable;
import de.tum.cit.ase.artemis.sdk.model.Post;
import de.tum.cit.ase.artemis.sdk.model.PostContextFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ConversationMessageResourceApi {
  private ApiClient apiClient;

  public ConversationMessageResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversationMessageResourceApi(ApiClient apiClient) {
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
   * @param post  (required)
   * @return Post
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Post createMessage(Long courseId, Post post) throws ApiException {
    return createMessageWithHttpInfo(courseId, post).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param post  (required)
   * @return ApiResponse&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Post> createMessageWithHttpInfo(Long courseId, Post post) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createMessage");
    }
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling createMessage");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/messages"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI("ConversationMessageResourceApi.createMessage", localVarPath, "POST", new ArrayList<>(), post,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param messageId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteMessage(Long courseId, Long messageId) throws ApiException {
    deleteMessageWithHttpInfo(courseId, messageId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param messageId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteMessageWithHttpInfo(Long courseId, Long messageId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteMessage");
    }
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling deleteMessage");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/messages/{messageId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{messageId}", apiClient.escapeString(messageId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ConversationMessageResourceApi.deleteMessage", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param pageable  (required)
   * @param postContextFilter  (required)
   * @param courseId  (required)
   * @return List&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Post> getMessages(Pageable pageable, PostContextFilter postContextFilter, Long courseId) throws ApiException {
    return getMessagesWithHttpInfo(pageable, postContextFilter, courseId).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @param postContextFilter  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;Post&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Post>> getMessagesWithHttpInfo(Pageable pageable, PostContextFilter postContextFilter, Long courseId) throws ApiException {
    // Check required parameters
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getMessages");
    }
    if (postContextFilter == null) {
      throw new ApiException(400, "Missing the required parameter 'postContextFilter' when calling getMessages");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getMessages");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/messages"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "pageable", pageable)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postContextFilter", postContextFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
    return apiClient.invokeAPI("ConversationMessageResourceApi.getMessages", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param messageId  (required)
   * @param post  (required)
   * @return Post
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Post updateMessage(Long courseId, Long messageId, Post post) throws ApiException {
    return updateMessageWithHttpInfo(courseId, messageId, post).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param messageId  (required)
   * @param post  (required)
   * @return ApiResponse&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Post> updateMessageWithHttpInfo(Long courseId, Long messageId, Post post) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateMessage");
    }
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling updateMessage");
    }
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling updateMessage");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/messages/{messageId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{messageId}", apiClient.escapeString(messageId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI("ConversationMessageResourceApi.updateMessage", localVarPath, "PUT", new ArrayList<>(), post,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
