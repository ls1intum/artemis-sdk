package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.TutorialGroupSession;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupSessionDTO;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupStatusDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class TutorialGroupSessionResourceApi {
  private ApiClient apiClient;

  public TutorialGroupSessionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TutorialGroupSessionResourceApi(ApiClient apiClient) {
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
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @return TutorialGroupSession
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupSession activate(Long courseId, Long tutorialGroupId, Long sessionId) throws ApiException {
    return activateWithHttpInfo(courseId, tutorialGroupId, sessionId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @return ApiResponse&lt;TutorialGroupSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupSession> activateWithHttpInfo(Long courseId, Long tutorialGroupId, Long sessionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling activate");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling activate");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling activate");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}/activate"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()));

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

    GenericType<TutorialGroupSession> localVarReturnType = new GenericType<TutorialGroupSession>() {};

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.activate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @param tutorialGroupStatusDTO  (required)
   * @return TutorialGroupSession
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupSession cancel(Long courseId, Long tutorialGroupId, Long sessionId, TutorialGroupStatusDTO tutorialGroupStatusDTO) throws ApiException {
    return cancelWithHttpInfo(courseId, tutorialGroupId, sessionId, tutorialGroupStatusDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @param tutorialGroupStatusDTO  (required)
   * @return ApiResponse&lt;TutorialGroupSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupSession> cancelWithHttpInfo(Long courseId, Long tutorialGroupId, Long sessionId, TutorialGroupStatusDTO tutorialGroupStatusDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupStatusDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling cancel");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling cancel");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling cancel");
    }
    
    // verify the required parameter 'tutorialGroupStatusDTO' is set
    if (tutorialGroupStatusDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupStatusDTO' when calling cancel");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}/cancel"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()));

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

    GenericType<TutorialGroupSession> localVarReturnType = new GenericType<TutorialGroupSession>() {};

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.cancel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param tutorialGroupSessionDTO  (required)
   * @return TutorialGroupSession
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupSession create1(Long courseId, Long tutorialGroupId, TutorialGroupSessionDTO tutorialGroupSessionDTO) throws ApiException {
    return create1WithHttpInfo(courseId, tutorialGroupId, tutorialGroupSessionDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param tutorialGroupSessionDTO  (required)
   * @return ApiResponse&lt;TutorialGroupSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupSession> create1WithHttpInfo(Long courseId, Long tutorialGroupId, TutorialGroupSessionDTO tutorialGroupSessionDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupSessionDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create1");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling create1");
    }
    
    // verify the required parameter 'tutorialGroupSessionDTO' is set
    if (tutorialGroupSessionDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupSessionDTO' when calling create1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()));

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

    GenericType<TutorialGroupSession> localVarReturnType = new GenericType<TutorialGroupSession>() {};

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.create1", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteSession(Long courseId, Long tutorialGroupId, Long sessionId) throws ApiException {
    deleteSessionWithHttpInfo(courseId, tutorialGroupId, sessionId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteSessionWithHttpInfo(Long courseId, Long tutorialGroupId, Long sessionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteSession");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling deleteSession");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling deleteSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()));

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

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.deleteSession", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @return TutorialGroupSession
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupSession getOneOfTutorialGroup(Long courseId, Long tutorialGroupId, Long sessionId) throws ApiException {
    return getOneOfTutorialGroupWithHttpInfo(courseId, tutorialGroupId, sessionId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @return ApiResponse&lt;TutorialGroupSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupSession> getOneOfTutorialGroupWithHttpInfo(Long courseId, Long tutorialGroupId, Long sessionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfTutorialGroup");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling getOneOfTutorialGroup");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getOneOfTutorialGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()));

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

    GenericType<TutorialGroupSession> localVarReturnType = new GenericType<TutorialGroupSession>() {};

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.getOneOfTutorialGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @param tutorialGroupSessionDTO  (required)
   * @return TutorialGroupSession
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupSession update1(Long courseId, Long tutorialGroupId, Long sessionId, TutorialGroupSessionDTO tutorialGroupSessionDTO) throws ApiException {
    return update1WithHttpInfo(courseId, tutorialGroupId, sessionId, tutorialGroupSessionDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @param tutorialGroupSessionDTO  (required)
   * @return ApiResponse&lt;TutorialGroupSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupSession> update1WithHttpInfo(Long courseId, Long tutorialGroupId, Long sessionId, TutorialGroupSessionDTO tutorialGroupSessionDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupSessionDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update1");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling update1");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling update1");
    }
    
    // verify the required parameter 'tutorialGroupSessionDTO' is set
    if (tutorialGroupSessionDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupSessionDTO' when calling update1");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()));

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

    GenericType<TutorialGroupSession> localVarReturnType = new GenericType<TutorialGroupSession>() {};

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.update1", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @param attendanceCount  (optional)
   * @return TutorialGroupSession
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroupSession updateAttendanceCount(Long courseId, Long tutorialGroupId, Long sessionId, Integer attendanceCount) throws ApiException {
    return updateAttendanceCountWithHttpInfo(courseId, tutorialGroupId, sessionId, attendanceCount).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param sessionId  (required)
   * @param attendanceCount  (optional)
   * @return ApiResponse&lt;TutorialGroupSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroupSession> updateAttendanceCountWithHttpInfo(Long courseId, Long tutorialGroupId, Long sessionId, Integer attendanceCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateAttendanceCount");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling updateAttendanceCount");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling updateAttendanceCount");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/sessions/{sessionId}/attendance-count"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attendanceCount", attendanceCount));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TutorialGroupSession> localVarReturnType = new GenericType<TutorialGroupSession>() {};

    return apiClient.invokeAPI("TutorialGroupSessionResourceApi.updateAttendanceCount", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
