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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
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
    Object localVarPostBody = answerPost;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createAnswerPost1");
    }
    
    // verify the required parameter 'answerPost' is set
    if (answerPost == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPost' when calling createAnswerPost1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/answer-messages"
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

    GenericType<AnswerPost> localVarReturnType = new GenericType<AnswerPost>() {};

    return apiClient.invokeAPI("AnswerMessageResourceApi.createAnswerPost1", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteAnswerPost1");
    }
    
    // verify the required parameter 'answerMessageId' is set
    if (answerMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'answerMessageId' when calling deleteAnswerPost1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/answer-messages/{answerMessageId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "answerMessageId" + "\\}", apiClient.escapeString(answerMessageId.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("AnswerMessageResourceApi.deleteAnswerPost1", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = answerPost;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateAnswerPost1");
    }
    
    // verify the required parameter 'answerMessageId' is set
    if (answerMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'answerMessageId' when calling updateAnswerPost1");
    }
    
    // verify the required parameter 'answerPost' is set
    if (answerPost == null) {
      throw new ApiException(400, "Missing the required parameter 'answerPost' when calling updateAnswerPost1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/answer-messages/{answerMessageId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "answerMessageId" + "\\}", apiClient.escapeString(answerMessageId.toString()));

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

    GenericType<AnswerPost> localVarReturnType = new GenericType<AnswerPost>() {};

    return apiClient.invokeAPI("AnswerMessageResourceApi.updateAnswerPost1", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
