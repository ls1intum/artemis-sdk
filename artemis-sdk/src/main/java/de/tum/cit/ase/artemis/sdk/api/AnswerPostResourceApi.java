package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.AnswerPost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class AnswerPostResourceApi {
  private ApiClient apiClient;

  public AnswerPostResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnswerPostResourceApi(ApiClient apiClient) {
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
   * @param answerPost  (required)
   * @return AnswerPost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AnswerPost createAnswerPost(Long courseId, AnswerPost answerPost) throws ApiException {
    return createAnswerPostWithHttpInfo(courseId, answerPost).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerPost  (required)
   * @return ApiResponse&lt;AnswerPost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnswerPost> createAnswerPostWithHttpInfo(Long courseId, AnswerPost answerPost) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createAnswerPost");
    }
    if (answerPost == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPost' when calling createAnswerPost");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/answer-posts"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<AnswerPost> localVarReturnType = new GenericType<AnswerPost>() {};
    return apiClient.invokeAPI("AnswerPostResourceApi.createAnswerPost", localVarPath, "POST", new ArrayList<>(), answerPost,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerPostId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnswerPost(Long courseId, Long answerPostId) throws ApiException {
    deleteAnswerPostWithHttpInfo(courseId, answerPostId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerPostId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnswerPostWithHttpInfo(Long courseId, Long answerPostId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteAnswerPost");
    }
    if (answerPostId == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPostId' when calling deleteAnswerPost");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/answer-posts/{answerPostId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{answerPostId}", apiClient.escapeString(answerPostId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AnswerPostResourceApi.deleteAnswerPost", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerPostId  (required)
   * @param answerPost  (required)
   * @return AnswerPost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AnswerPost updateAnswerPost(Long courseId, Long answerPostId, AnswerPost answerPost) throws ApiException {
    return updateAnswerPostWithHttpInfo(courseId, answerPostId, answerPost).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerPostId  (required)
   * @param answerPost  (required)
   * @return ApiResponse&lt;AnswerPost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnswerPost> updateAnswerPostWithHttpInfo(Long courseId, Long answerPostId, AnswerPost answerPost) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateAnswerPost");
    }
    if (answerPostId == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPostId' when calling updateAnswerPost");
    }
    if (answerPost == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPost' when calling updateAnswerPost");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/answer-posts/{answerPostId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{answerPostId}", apiClient.escapeString(answerPostId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<AnswerPost> localVarReturnType = new GenericType<AnswerPost>() {};
    return apiClient.invokeAPI("AnswerPostResourceApi.updateAnswerPost", localVarPath, "PUT", new ArrayList<>(), answerPost,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
