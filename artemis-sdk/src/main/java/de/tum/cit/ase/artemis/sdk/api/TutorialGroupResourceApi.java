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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling create");
    }
    if (tutorialGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroup' when calling create");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorialGroup> localVarReturnType = new GenericType<TutorialGroup>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.create", localVarPath, "POST", new ArrayList<>(), tutorialGroup,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling delete");
    }
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling delete");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TutorialGroupResourceApi.delete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deregisterStudent");
    }
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling deregisterStudent");
    }
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling deregisterStudent");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/deregister/{studentLogin}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()))
            .replaceAll("\\{studentLogin}", apiClient.escapeString(studentLogin));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TutorialGroupResourceApi.deregisterStudent", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<TutorialGroup>> localVarReturnType = new GenericType<List<TutorialGroup>>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.getAllForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<TutorialGroup>> localVarReturnType = new GenericType<List<TutorialGroup>>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.getAllTutorialGroupsForNotifications", "/api/tutorial-groups/for-notifications", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getOneOfCourse");
    }
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling getOneOfCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TutorialGroup> localVarReturnType = new GenericType<TutorialGroup>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.getOneOfCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling getTitle");
    }

    // Path parameters
    String localVarPath = "/api/tutorial-groups/{tutorialGroupId}/title"
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.getTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getUniqueCampusValues");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/campus-values"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<String>> localVarReturnType = new GenericType<Set<String>>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.getUniqueCampusValues", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importRegistrations");
    }
    if (tutorialGroupRegistrationImportDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupRegistrationImportDTO' when calling importRegistrations");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/import"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<TutorialGroupRegistrationImportDTO>> localVarReturnType = new GenericType<List<TutorialGroupRegistrationImportDTO>>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.importRegistrations", localVarPath, "POST", new ArrayList<>(), tutorialGroupRegistrationImportDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerMultipleStudentsToTutorialGroup");
    }
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling registerMultipleStudentsToTutorialGroup");
    }
    if (studentDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'studentDTO' when calling registerMultipleStudentsToTutorialGroup");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/register-multiple"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Set<StudentDTO>> localVarReturnType = new GenericType<Set<StudentDTO>>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.registerMultipleStudentsToTutorialGroup", localVarPath, "POST", new ArrayList<>(), studentDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerStudent");
    }
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling registerStudent");
    }
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling registerStudent");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}/register/{studentLogin}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()))
            .replaceAll("\\{studentLogin}", apiClient.escapeString(studentLogin));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TutorialGroupResourceApi.registerStudent", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling update");
    }
    if (tutorialGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupId' when calling update");
    }
    if (tutorialGroupUpdateDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tutorialGroupUpdateDTO' when calling update");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/tutorial-groups/{tutorialGroupId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tutorialGroupId}", apiClient.escapeString(tutorialGroupId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorialGroup> localVarReturnType = new GenericType<TutorialGroup>() {};
    return apiClient.invokeAPI("TutorialGroupResourceApi.update", localVarPath, "PUT", new ArrayList<>(), tutorialGroupUpdateDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
