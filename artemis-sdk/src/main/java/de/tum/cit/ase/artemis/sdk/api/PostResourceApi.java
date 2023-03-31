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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class PostResourceApi {
  private ApiClient apiClient;

  public PostResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PostResourceApi(ApiClient apiClient) {
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
   * @return List&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Post> computeSimilarityScoresWitCoursePosts(Long courseId, Post post) throws ApiException {
    return computeSimilarityScoresWitCoursePostsWithHttpInfo(courseId, post).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param post  (required)
   * @return ApiResponse&lt;List&lt;Post&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Post>> computeSimilarityScoresWitCoursePostsWithHttpInfo(Long courseId, Post post) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling computeSimilarityScoresWitCoursePosts");
    }
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling computeSimilarityScoresWitCoursePosts");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts/similarity-check"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
    return apiClient.invokeAPI("PostResourceApi.computeSimilarityScoresWitCoursePosts", localVarPath, "POST", new ArrayList<>(), post,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
  public Post createPost(Long courseId, Post post) throws ApiException {
    return createPostWithHttpInfo(courseId, post).getData();
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
  public ApiResponse<Post> createPostWithHttpInfo(Long courseId, Post post) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createPost");
    }
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling createPost");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI("PostResourceApi.createPost", localVarPath, "POST", new ArrayList<>(), post,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param postId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deletePost(Long courseId, Long postId) throws ApiException {
    deletePostWithHttpInfo(courseId, postId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param postId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePostWithHttpInfo(Long courseId, Long postId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deletePost");
    }
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling deletePost");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts/{postId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{postId}", apiClient.escapeString(postId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("PostResourceApi.deletePost", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<String> getAllPostTagsForCourse(Long courseId) throws ApiException {
    return getAllPostTagsForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> getAllPostTagsForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllPostTagsForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts/tags"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("PostResourceApi.getAllPostTagsForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param pageable  (required)
   * @param postContextFilter  (required)
   * @param courseId  (required)
   * @param pagingEnabled  (optional, default to false)
   * @return List&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Post> getPostsInCourse(Pageable pageable, PostContextFilter postContextFilter, Long courseId, Boolean pagingEnabled) throws ApiException {
    return getPostsInCourseWithHttpInfo(pageable, postContextFilter, courseId, pagingEnabled).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @param postContextFilter  (required)
   * @param courseId  (required)
   * @param pagingEnabled  (optional, default to false)
   * @return ApiResponse&lt;List&lt;Post&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Post>> getPostsInCourseWithHttpInfo(Pageable pageable, PostContextFilter postContextFilter, Long courseId, Boolean pagingEnabled) throws ApiException {
    // Check required parameters
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getPostsInCourse");
    }
    if (postContextFilter == null) {
      throw new ApiException(400, "Missing the required parameter 'postContextFilter' when calling getPostsInCourse");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPostsInCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "pageable", pageable)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pagingEnabled", pagingEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postContextFilter", postContextFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
    return apiClient.invokeAPI("PostResourceApi.getPostsInCourse", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param postId  (required)
   * @param displayPriority  (required)
   * @return Post
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Post updateDisplayPriority(Long courseId, Long postId, String displayPriority) throws ApiException {
    return updateDisplayPriorityWithHttpInfo(courseId, postId, displayPriority).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param postId  (required)
   * @param displayPriority  (required)
   * @return ApiResponse&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Post> updateDisplayPriorityWithHttpInfo(Long courseId, Long postId, String displayPriority) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateDisplayPriority");
    }
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling updateDisplayPriority");
    }
    if (displayPriority == null) {
      throw new ApiException(400, "Missing the required parameter 'displayPriority' when calling updateDisplayPriority");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts/{postId}/display-priority"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{postId}", apiClient.escapeString(postId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "displayPriority", displayPriority)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI("PostResourceApi.updateDisplayPriority", localVarPath, "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param postId  (required)
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
  public Post updatePost(Long courseId, Long postId, Post post) throws ApiException {
    return updatePostWithHttpInfo(courseId, postId, post).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param postId  (required)
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
  public ApiResponse<Post> updatePostWithHttpInfo(Long courseId, Long postId, Post post) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updatePost");
    }
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling updatePost");
    }
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling updatePost");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/posts/{postId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{postId}", apiClient.escapeString(postId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI("PostResourceApi.updatePost", localVarPath, "PUT", new ArrayList<>(), post,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
