package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.StudentDTO;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroup;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupRegistrationImportDTO;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupUpdateDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class TutorialGroupResourceApi {
  private ApiClient apiClient;

  public TutorialGroupResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TutorialGroupResourceApi(ApiClient apiClient) {
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
   * @param tutorialGroup  (required)
   * @return TutorialGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroup create(Long courseId, TutorialGroup tutorialGroup) throws ApiException {
    return createWithHttpInfo(courseId, tutorialGroup).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroup  (required)
   * @return ApiResponse&lt;TutorialGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroup> createWithHttpInfo(Long courseId, TutorialGroup tutorialGroup) throws ApiException {
    Object localVarPostBody = tutorialGroup;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create");
    }
    
    // verify the required parameter 'tutorialGroup' is set
    if (tutorialGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroup' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups"
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

    GenericType<TutorialGroup> localVarReturnType = new GenericType<TutorialGroup>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.create", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void delete(Long courseId, Long tutorialGroupId) throws ApiException {
    deleteWithHttpInfo(courseId, tutorialGroupId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteWithHttpInfo(Long courseId, Long tutorialGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling delete");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("TutorialGroupResourceApi.delete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param studentLogin  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deregisterStudent(Long courseId, Long tutorialGroupId, String studentLogin) throws ApiException {
    deregisterStudentWithHttpInfo(courseId, tutorialGroupId, studentLogin);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param studentLogin  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deregisterStudentWithHttpInfo(Long courseId, Long tutorialGroupId, String studentLogin) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deregisterStudent");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling deregisterStudent");
    }
    
    // verify the required parameter 'studentLogin' is set
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling deregisterStudent");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/deregister/{studentLogin}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "studentLogin" + "\\}", apiClient.escapeString(studentLogin.toString()));

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

    return apiClient.invokeAPI("TutorialGroupResourceApi.deregisterStudent", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;TutorialGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<TutorialGroup> getAllForCourse(Long courseId) throws ApiException {
    return getAllForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;TutorialGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TutorialGroup>> getAllForCourseWithHttpInfo(Long courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllForCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<TutorialGroup>> localVarReturnType = new GenericType<List<TutorialGroup>>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.getAllForCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @return List&lt;TutorialGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<TutorialGroup> getAllTutorialGroupsForNotifications() throws ApiException {
    return getAllTutorialGroupsForNotificationsWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;List&lt;TutorialGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TutorialGroup>> getAllTutorialGroupsForNotificationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/tutorial-groups/for-notifications";

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

    GenericType<List<TutorialGroup>> localVarReturnType = new GenericType<List<TutorialGroup>>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.getAllTutorialGroupsForNotifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @return TutorialGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroup getOneOfCourse(Long courseId, Long tutorialGroupId) throws ApiException {
    return getOneOfCourseWithHttpInfo(courseId, tutorialGroupId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @return ApiResponse&lt;TutorialGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroup> getOneOfCourseWithHttpInfo(Long courseId, Long tutorialGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfCourse");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling getOneOfCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TutorialGroup> localVarReturnType = new GenericType<TutorialGroup>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.getOneOfCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param tutorialGroupId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getTitle(Long tutorialGroupId) throws ApiException {
    return getTitleWithHttpInfo(tutorialGroupId).getData();
  }

  /**
   * 
   * 
   * @param tutorialGroupId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getTitleWithHttpInfo(Long tutorialGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling getTitle");
    }
    
    // create path and map variables
    String localVarPath = "/api/tutorial-groups/{tutorialGroupId}/title"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.getTitle", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return Set&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<String> getUniqueCampusValues(Long courseId) throws ApiException {
    return getUniqueCampusValuesWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;Set&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<String>> getUniqueCampusValuesWithHttpInfo(Long courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getUniqueCampusValues");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/campus-values"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Set<String>> localVarReturnType = new GenericType<Set<String>>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.getUniqueCampusValues", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupRegistrationImportDTO  (required)
   * @return List&lt;TutorialGroupRegistrationImportDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<TutorialGroupRegistrationImportDTO> importRegistrations(Long courseId, Set<TutorialGroupRegistrationImportDTO> tutorialGroupRegistrationImportDTO) throws ApiException {
    return importRegistrationsWithHttpInfo(courseId, tutorialGroupRegistrationImportDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupRegistrationImportDTO  (required)
   * @return ApiResponse&lt;List&lt;TutorialGroupRegistrationImportDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TutorialGroupRegistrationImportDTO>> importRegistrationsWithHttpInfo(Long courseId, Set<TutorialGroupRegistrationImportDTO> tutorialGroupRegistrationImportDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupRegistrationImportDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importRegistrations");
    }
    
    // verify the required parameter 'tutorialGroupRegistrationImportDTO' is set
    if (tutorialGroupRegistrationImportDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupRegistrationImportDTO' when calling importRegistrations");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/import"
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

    GenericType<List<TutorialGroupRegistrationImportDTO>> localVarReturnType = new GenericType<List<TutorialGroupRegistrationImportDTO>>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.importRegistrations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param studentDTO  (required)
   * @return Set&lt;StudentDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StudentDTO> registerMultipleStudentsToTutorialGroup(Long courseId, Long tutorialGroupId, Set<StudentDTO> studentDTO) throws ApiException {
    return registerMultipleStudentsToTutorialGroupWithHttpInfo(courseId, tutorialGroupId, studentDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param studentDTO  (required)
   * @return ApiResponse&lt;Set&lt;StudentDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StudentDTO>> registerMultipleStudentsToTutorialGroupWithHttpInfo(Long courseId, Long tutorialGroupId, Set<StudentDTO> studentDTO) throws ApiException {
    Object localVarPostBody = studentDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerMultipleStudentsToTutorialGroup");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling registerMultipleStudentsToTutorialGroup");
    }
    
    // verify the required parameter 'studentDTO' is set
    if (studentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'studentDTO' when calling registerMultipleStudentsToTutorialGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/register-multiple"
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

    GenericType<Set<StudentDTO>> localVarReturnType = new GenericType<Set<StudentDTO>>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.registerMultipleStudentsToTutorialGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param studentLogin  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void registerStudent(Long courseId, Long tutorialGroupId, String studentLogin) throws ApiException {
    registerStudentWithHttpInfo(courseId, tutorialGroupId, studentLogin);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param studentLogin  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> registerStudentWithHttpInfo(Long courseId, Long tutorialGroupId, String studentLogin) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerStudent");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling registerStudent");
    }
    
    // verify the required parameter 'studentLogin' is set
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling registerStudent");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/register/{studentLogin}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "tutorialGroupId" + "\\}", apiClient.escapeString(tutorialGroupId.toString()))
      .replaceAll("\\{" + "studentLogin" + "\\}", apiClient.escapeString(studentLogin.toString()));

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

    return apiClient.invokeAPI("TutorialGroupResourceApi.registerStudent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param tutorialGroupUpdateDTO  (required)
   * @return TutorialGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorialGroup update(Long courseId, Long tutorialGroupId, TutorialGroupUpdateDTO tutorialGroupUpdateDTO) throws ApiException {
    return updateWithHttpInfo(courseId, tutorialGroupId, tutorialGroupUpdateDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tutorialGroupId  (required)
   * @param tutorialGroupUpdateDTO  (required)
   * @return ApiResponse&lt;TutorialGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorialGroup> updateWithHttpInfo(Long courseId, Long tutorialGroupId, TutorialGroupUpdateDTO tutorialGroupUpdateDTO) throws ApiException {
    Object localVarPostBody = tutorialGroupUpdateDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update");
    }
    
    // verify the required parameter 'tutorialGroupId' is set
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling update");
    }
    
    // verify the required parameter 'tutorialGroupUpdateDTO' is set
    if (tutorialGroupUpdateDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupUpdateDTO' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}"
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

    GenericType<TutorialGroup> localVarReturnType = new GenericType<TutorialGroup>() {};

    return apiClient.invokeAPI("TutorialGroupResourceApi.update", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
