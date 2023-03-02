package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.LoadAllActions200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ExamActivityResourceApi {
  private ApiClient apiClient;

  public ExamActivityResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExamActivityResourceApi(ApiClient apiClient) {
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
   * @param examId  (required)
   * @return List&lt;LoadAllActions200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<LoadAllActions200ResponseInner> loadAllActions(Long examId) throws ApiException {
    return loadAllActionsWithHttpInfo(examId).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;LoadAllActions200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<LoadAllActions200ResponseInner>> loadAllActionsWithHttpInfo(Long examId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling loadAllActions");
    }
    
    // create path and map variables
    String localVarPath = "/api/exam-monitoring/{examId}/load-actions"
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

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

    GenericType<List<LoadAllActions200ResponseInner>> localVarReturnType = new GenericType<List<LoadAllActions200ResponseInner>>() {};

    return apiClient.invokeAPI("ExamActivityResourceApi.loadAllActions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param body  (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Boolean updateMonitoring(Long courseId, Long examId, Boolean body) throws ApiException {
    return updateMonitoringWithHttpInfo(courseId, examId, body).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> updateMonitoringWithHttpInfo(Long courseId, Long examId, Boolean body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateMonitoring");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateMonitoring");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMonitoring");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/statistics"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

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

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};

    return apiClient.invokeAPI("ExamActivityResourceApi.updateMonitoring", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
