package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CourseLearningGoalProgressDTO;
import de.tum.cit.ase.artemis.sdk.model.LearningGoal;
import de.tum.cit.ase.artemis.sdk.model.LearningGoalProgress;
import de.tum.cit.ase.artemis.sdk.model.LearningGoalRelation;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOLearningGoal;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class LearningGoalResourceApi {
  private ApiClient apiClient;

  public LearningGoalResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LearningGoalResourceApi(ApiClient apiClient) {
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
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return LearningGoal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LearningGoal addPrerequisite(Long learningGoalId, Long courseId) throws ApiException {
    return addPrerequisiteWithHttpInfo(learningGoalId, courseId).getData();
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;LearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LearningGoal> addPrerequisiteWithHttpInfo(Long learningGoalId, Long courseId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling addPrerequisite");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling addPrerequisite");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/prerequisites/{learningGoalId}"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<LearningGoal> localVarReturnType = new GenericType<LearningGoal>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.addPrerequisite", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoal  (required)
   * @return LearningGoal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LearningGoal createLearningGoal(Long courseId, LearningGoal learningGoal) throws ApiException {
    return createLearningGoalWithHttpInfo(courseId, learningGoal).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoal  (required)
   * @return ApiResponse&lt;LearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LearningGoal> createLearningGoalWithHttpInfo(Long courseId, LearningGoal learningGoal) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createLearningGoal");
    }
    if (learningGoal == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoal' when calling createLearningGoal");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<LearningGoal> localVarReturnType = new GenericType<LearningGoal>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.createLearningGoal", localVarPath, "POST", new ArrayList<>(), learningGoal,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tailLearningGoalId  (required)
   * @param headLearningGoalId  (required)
   * @param type  (optional, default to )
   * @return LearningGoalRelation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LearningGoalRelation createLearningGoalRelation(Long courseId, Long tailLearningGoalId, Long headLearningGoalId, String type) throws ApiException {
    return createLearningGoalRelationWithHttpInfo(courseId, tailLearningGoalId, headLearningGoalId, type).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tailLearningGoalId  (required)
   * @param headLearningGoalId  (required)
   * @param type  (optional, default to )
   * @return ApiResponse&lt;LearningGoalRelation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LearningGoalRelation> createLearningGoalRelationWithHttpInfo(Long courseId, Long tailLearningGoalId, Long headLearningGoalId, String type) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createLearningGoalRelation");
    }
    if (tailLearningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'tailLearningGoalId' when calling createLearningGoalRelation");
    }
    if (headLearningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'headLearningGoalId' when calling createLearningGoalRelation");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{tailLearningGoalId}/relations/{headLearningGoalId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tailLearningGoalId}", apiClient.escapeString(tailLearningGoalId.toString()))
            .replaceAll("\\{headLearningGoalId}", apiClient.escapeString(headLearningGoalId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "type", type)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<LearningGoalRelation> localVarReturnType = new GenericType<LearningGoalRelation>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.createLearningGoalRelation", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteLearningGoal(Long learningGoalId, Long courseId) throws ApiException {
    deleteLearningGoalWithHttpInfo(learningGoalId, courseId);
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteLearningGoalWithHttpInfo(Long learningGoalId, Long courseId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling deleteLearningGoal");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteLearningGoal");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{learningGoalId}"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("LearningGoalResourceApi.deleteLearningGoal", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @return SearchResultPageDTOLearningGoal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOLearningGoal getAllLecturesOnPage1(PageableSearchDTOString search) throws ApiException {
    return getAllLecturesOnPage1WithHttpInfo(search).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @return ApiResponse&lt;SearchResultPageDTOLearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOLearningGoal> getAllLecturesOnPage1WithHttpInfo(PageableSearchDTOString search) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllLecturesOnPage1");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOLearningGoal> localVarReturnType = new GenericType<SearchResultPageDTOLearningGoal>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getAllLecturesOnPage1", "/api/learning-goals", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return LearningGoal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LearningGoal getLearningGoal(Long learningGoalId, Long courseId) throws ApiException {
    return getLearningGoalWithHttpInfo(learningGoalId, courseId).getData();
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;LearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LearningGoal> getLearningGoalWithHttpInfo(Long learningGoalId, Long courseId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling getLearningGoal");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLearningGoal");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{learningGoalId}"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<LearningGoal> localVarReturnType = new GenericType<LearningGoal>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getLearningGoal", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoalId  (required)
   * @return CourseLearningGoalProgressDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CourseLearningGoalProgressDTO getLearningGoalCourseProgress(Long courseId, Long learningGoalId) throws ApiException {
    return getLearningGoalCourseProgressWithHttpInfo(courseId, learningGoalId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoalId  (required)
   * @return ApiResponse&lt;CourseLearningGoalProgressDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CourseLearningGoalProgressDTO> getLearningGoalCourseProgressWithHttpInfo(Long courseId, Long learningGoalId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLearningGoalCourseProgress");
    }
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling getLearningGoalCourseProgress");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{learningGoalId}/course-progress"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CourseLearningGoalProgressDTO> localVarReturnType = new GenericType<CourseLearningGoalProgressDTO>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getLearningGoalCourseProgress", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return Set&lt;LearningGoalRelation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<LearningGoalRelation> getLearningGoalRelations(Long learningGoalId, Long courseId) throws ApiException {
    return getLearningGoalRelationsWithHttpInfo(learningGoalId, courseId).getData();
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Set&lt;LearningGoalRelation&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<LearningGoalRelation>> getLearningGoalRelationsWithHttpInfo(Long learningGoalId, Long courseId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling getLearningGoalRelations");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLearningGoalRelations");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{learningGoalId}/relations"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<LearningGoalRelation>> localVarReturnType = new GenericType<Set<LearningGoalRelation>>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getLearningGoalRelations", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoalId  (required)
   * @param refresh  (optional, default to false)
   * @return LearningGoalProgress
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LearningGoalProgress getLearningGoalStudentProgress(Long courseId, Long learningGoalId, Boolean refresh) throws ApiException {
    return getLearningGoalStudentProgressWithHttpInfo(courseId, learningGoalId, refresh).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoalId  (required)
   * @param refresh  (optional, default to false)
   * @return ApiResponse&lt;LearningGoalProgress&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LearningGoalProgress> getLearningGoalStudentProgressWithHttpInfo(Long courseId, Long learningGoalId, Boolean refresh) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLearningGoalStudentProgress");
    }
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling getLearningGoalStudentProgress");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{learningGoalId}/student-progress"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "refresh", refresh)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<LearningGoalProgress> localVarReturnType = new GenericType<LearningGoalProgress>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getLearningGoalStudentProgress", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getLearningGoalTitle(Long learningGoalId) throws ApiException {
    return getLearningGoalTitleWithHttpInfo(learningGoalId).getData();
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getLearningGoalTitleWithHttpInfo(Long learningGoalId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling getLearningGoalTitle");
    }

    // Path parameters
    String localVarPath = "/api/learning-goals/{learningGoalId}/title"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getLearningGoalTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;LearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<LearningGoal> getLearningGoals(Long courseId) throws ApiException {
    return getLearningGoalsWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;LearningGoal&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<LearningGoal>> getLearningGoalsWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLearningGoals");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<LearningGoal>> localVarReturnType = new GenericType<List<LearningGoal>>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getLearningGoals", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;LearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<LearningGoal> getPrerequisites(Long courseId) throws ApiException {
    return getPrerequisitesWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;LearningGoal&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<LearningGoal>> getPrerequisitesWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPrerequisites");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/prerequisites"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<LearningGoal>> localVarReturnType = new GenericType<List<LearningGoal>>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.getPrerequisites", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @param learningGoalRelationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeLearningGoalRelation(Long learningGoalId, Long courseId, Long learningGoalRelationId) throws ApiException {
    removeLearningGoalRelationWithHttpInfo(learningGoalId, courseId, learningGoalRelationId);
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @param learningGoalRelationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeLearningGoalRelationWithHttpInfo(Long learningGoalId, Long courseId, Long learningGoalRelationId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling removeLearningGoalRelation");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removeLearningGoalRelation");
    }
    if (learningGoalRelationId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalRelationId' when calling removeLearningGoalRelation");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals/{learningGoalId}/relations/{learningGoalRelationId}"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{learningGoalRelationId}", apiClient.escapeString(learningGoalRelationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("LearningGoalResourceApi.removeLearningGoalRelation", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removePrerequisite(Long learningGoalId, Long courseId) throws ApiException {
    removePrerequisiteWithHttpInfo(learningGoalId, courseId);
  }

  /**
   * 
   * 
   * @param learningGoalId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removePrerequisiteWithHttpInfo(Long learningGoalId, Long courseId) throws ApiException {
    // Check required parameters
    if (learningGoalId == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoalId' when calling removePrerequisite");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removePrerequisite");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/prerequisites/{learningGoalId}"
            .replaceAll("\\{learningGoalId}", apiClient.escapeString(learningGoalId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("LearningGoalResourceApi.removePrerequisite", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoal  (required)
   * @return LearningGoal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LearningGoal updateLearningGoal(Long courseId, LearningGoal learningGoal) throws ApiException {
    return updateLearningGoalWithHttpInfo(courseId, learningGoal).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param learningGoal  (required)
   * @return ApiResponse&lt;LearningGoal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LearningGoal> updateLearningGoalWithHttpInfo(Long courseId, LearningGoal learningGoal) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateLearningGoal");
    }
    if (learningGoal == null) {
      throw new ApiException(400, "Missing the required parameter 'learningGoal' when calling updateLearningGoal");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/learning-goals"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<LearningGoal> localVarReturnType = new GenericType<LearningGoal>() {};
    return apiClient.invokeAPI("LearningGoalResourceApi.updateLearningGoal", localVarPath, "PUT", new ArrayList<>(), learningGoal,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
