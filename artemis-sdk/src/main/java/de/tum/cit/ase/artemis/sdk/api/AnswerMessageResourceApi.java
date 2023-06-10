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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class AnswerMessageResourceApi {
  private ApiClient apiClient;

  public AnswerMessageResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnswerMessageResourceApi(ApiClient apiClient) {
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
  public AnswerPost createAnswerPost1(Long courseId, AnswerPost answerPost) throws ApiException {
    return createAnswerPost1WithHttpInfo(courseId, answerPost).getData();
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
  public ApiResponse<AnswerPost> createAnswerPost1WithHttpInfo(Long courseId, AnswerPost answerPost) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createAnswerPost1");
    }
    if (answerPost == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPost' when calling createAnswerPost1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/answer-messages"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<AnswerPost> localVarReturnType = new GenericType<AnswerPost>() {};
    return apiClient.invokeAPI("AnswerMessageResourceApi.createAnswerPost1", localVarPath, "POST", new ArrayList<>(), answerPost,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerMessageId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnswerPost1(Long courseId, Long answerMessageId) throws ApiException {
    deleteAnswerPost1WithHttpInfo(courseId, answerMessageId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerMessageId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnswerPost1WithHttpInfo(Long courseId, Long answerMessageId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteAnswerPost1");
    }
    if (answerMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'answerMessageId' when calling deleteAnswerPost1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/answer-messages/{answerMessageId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{answerMessageId}", apiClient.escapeString(answerMessageId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AnswerMessageResourceApi.deleteAnswerPost1", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerMessageId  (required)
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
  public AnswerPost updateAnswerPost1(Long courseId, Long answerMessageId, AnswerPost answerPost) throws ApiException {
    return updateAnswerPost1WithHttpInfo(courseId, answerMessageId, answerPost).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param answerMessageId  (required)
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
  public ApiResponse<AnswerPost> updateAnswerPost1WithHttpInfo(Long courseId, Long answerMessageId, AnswerPost answerPost) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateAnswerPost1");
    }
    if (answerMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'answerMessageId' when calling updateAnswerPost1");
    }
    if (answerPost == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPost' when calling updateAnswerPost1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/answer-messages/{answerMessageId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{answerMessageId}", apiClient.escapeString(answerMessageId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<AnswerPost> localVarReturnType = new GenericType<AnswerPost>() {};
    return apiClient.invokeAPI("AnswerMessageResourceApi.updateAnswerPost1", localVarPath, "PUT", new ArrayList<>(), answerPost,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
