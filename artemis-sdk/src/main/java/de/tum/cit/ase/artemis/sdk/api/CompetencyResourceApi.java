package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Competency;
import de.tum.cit.ase.artemis.sdk.model.CompetencyProgress;
import de.tum.cit.ase.artemis.sdk.model.CompetencyRelation;
import de.tum.cit.ase.artemis.sdk.model.CourseCompetencyProgressDTO;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOCompetency;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class CompetencyResourceApi {
  private ApiClient apiClient;

  public CompetencyResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompetencyResourceApi(ApiClient apiClient) {
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
   * @param competencyId  (required)
   * @param courseId  (required)
   * @return Competency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Competency addPrerequisite(Long competencyId, Long courseId) throws ApiException {
    return addPrerequisiteWithHttpInfo(competencyId, courseId).getData();
  }

  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Competency> addPrerequisiteWithHttpInfo(Long competencyId, Long courseId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling addPrerequisite");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling addPrerequisite");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/prerequisites/{competencyId}"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Competency> localVarReturnType = new GenericType<Competency>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.addPrerequisite", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param competency  (required)
   * @return Competency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Competency createCompetency(Long courseId, Competency competency) throws ApiException {
    return createCompetencyWithHttpInfo(courseId, competency).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param competency  (required)
   * @return ApiResponse&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Competency> createCompetencyWithHttpInfo(Long courseId, Competency competency) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createCompetency");
    }
    if (competency == null) {
      throw new ApiException(400, "Missing the required parameter 'competency' when calling createCompetency");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Competency> localVarReturnType = new GenericType<Competency>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.createCompetency", localVarPath, "POST", new ArrayList<>(), competency,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param tailCompetencyId  (required)
   * @param headCompetencyId  (required)
   * @param type  (optional, default to )
   * @return CompetencyRelation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CompetencyRelation createCompetencyRelation(Long courseId, Long tailCompetencyId, Long headCompetencyId, String type) throws ApiException {
    return createCompetencyRelationWithHttpInfo(courseId, tailCompetencyId, headCompetencyId, type).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param tailCompetencyId  (required)
   * @param headCompetencyId  (required)
   * @param type  (optional, default to )
   * @return ApiResponse&lt;CompetencyRelation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompetencyRelation> createCompetencyRelationWithHttpInfo(Long courseId, Long tailCompetencyId, Long headCompetencyId, String type) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createCompetencyRelation");
    }
    if (tailCompetencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'tailCompetencyId' when calling createCompetencyRelation");
    }
    if (headCompetencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'headCompetencyId' when calling createCompetencyRelation");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{tailCompetencyId}/relations/{headCompetencyId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{tailCompetencyId}", apiClient.escapeString(tailCompetencyId.toString()))
            .replaceAll("\\{headCompetencyId}", apiClient.escapeString(headCompetencyId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "type", type)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CompetencyRelation> localVarReturnType = new GenericType<CompetencyRelation>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.createCompetencyRelation", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteCompetency(Long competencyId, Long courseId) throws ApiException {
    deleteCompetencyWithHttpInfo(competencyId, courseId);
  }

  /**
   * 
   * 
   * @param competencyId  (required)
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
  public ApiResponse<Void> deleteCompetencyWithHttpInfo(Long competencyId, Long courseId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling deleteCompetency");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCompetency");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{competencyId}"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("CompetencyResourceApi.deleteCompetency", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @return SearchResultPageDTOCompetency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOCompetency getAllCompetenciesOnPage(PageableSearchDTOString search) throws ApiException {
    return getAllCompetenciesOnPageWithHttpInfo(search).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @return ApiResponse&lt;SearchResultPageDTOCompetency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOCompetency> getAllCompetenciesOnPageWithHttpInfo(PageableSearchDTOString search) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllCompetenciesOnPage");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOCompetency> localVarReturnType = new GenericType<SearchResultPageDTOCompetency>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getAllCompetenciesOnPage", "/api/competencies", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Competency> getCompetencies(Long courseId) throws ApiException {
    return getCompetenciesWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;Competency&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Competency>> getCompetenciesWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCompetencies");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Competency>> localVarReturnType = new GenericType<List<Competency>>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getCompetencies", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @return Competency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Competency getCompetency(Long competencyId, Long courseId) throws ApiException {
    return getCompetencyWithHttpInfo(competencyId, courseId).getData();
  }

  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Competency> getCompetencyWithHttpInfo(Long competencyId, Long courseId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling getCompetency");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCompetency");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{competencyId}"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Competency> localVarReturnType = new GenericType<Competency>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getCompetency", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param competencyId  (required)
   * @return CourseCompetencyProgressDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CourseCompetencyProgressDTO getCompetencyCourseProgress(Long courseId, Long competencyId) throws ApiException {
    return getCompetencyCourseProgressWithHttpInfo(courseId, competencyId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param competencyId  (required)
   * @return ApiResponse&lt;CourseCompetencyProgressDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CourseCompetencyProgressDTO> getCompetencyCourseProgressWithHttpInfo(Long courseId, Long competencyId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCompetencyCourseProgress");
    }
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling getCompetencyCourseProgress");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{competencyId}/course-progress"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CourseCompetencyProgressDTO> localVarReturnType = new GenericType<CourseCompetencyProgressDTO>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getCompetencyCourseProgress", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @return Set&lt;CompetencyRelation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<CompetencyRelation> getCompetencyRelations(Long competencyId, Long courseId) throws ApiException {
    return getCompetencyRelationsWithHttpInfo(competencyId, courseId).getData();
  }

  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Set&lt;CompetencyRelation&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<CompetencyRelation>> getCompetencyRelationsWithHttpInfo(Long competencyId, Long courseId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling getCompetencyRelations");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCompetencyRelations");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{competencyId}/relations"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<CompetencyRelation>> localVarReturnType = new GenericType<Set<CompetencyRelation>>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getCompetencyRelations", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param competencyId  (required)
   * @param refresh  (optional, default to false)
   * @return CompetencyProgress
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CompetencyProgress getCompetencyStudentProgress(Long courseId, Long competencyId, Boolean refresh) throws ApiException {
    return getCompetencyStudentProgressWithHttpInfo(courseId, competencyId, refresh).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param competencyId  (required)
   * @param refresh  (optional, default to false)
   * @return ApiResponse&lt;CompetencyProgress&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompetencyProgress> getCompetencyStudentProgressWithHttpInfo(Long courseId, Long competencyId, Boolean refresh) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCompetencyStudentProgress");
    }
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling getCompetencyStudentProgress");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{competencyId}/student-progress"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "refresh", refresh)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CompetencyProgress> localVarReturnType = new GenericType<CompetencyProgress>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getCompetencyStudentProgress", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param competencyId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getCompetencyTitle(Long competencyId) throws ApiException {
    return getCompetencyTitleWithHttpInfo(competencyId).getData();
  }

  /**
   * 
   * 
   * @param competencyId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getCompetencyTitleWithHttpInfo(Long competencyId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling getCompetencyTitle");
    }

    // Path parameters
    String localVarPath = "/api/competencies/{competencyId}/title"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getCompetencyTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Competency> getPrerequisites(Long courseId) throws ApiException {
    return getPrerequisitesWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;Competency&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Competency>> getPrerequisitesWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPrerequisites");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/prerequisites"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Competency>> localVarReturnType = new GenericType<List<Competency>>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.getPrerequisites", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param competency  (required)
   * @return Competency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Competency importCompetency(Long courseId, Competency competency) throws ApiException {
    return importCompetencyWithHttpInfo(courseId, competency).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param competency  (required)
   * @return ApiResponse&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Competency> importCompetencyWithHttpInfo(Long courseId, Competency competency) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importCompetency");
    }
    if (competency == null) {
      throw new ApiException(400, "Missing the required parameter 'competency' when calling importCompetency");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/import"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Competency> localVarReturnType = new GenericType<Competency>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.importCompetency", localVarPath, "POST", new ArrayList<>(), competency,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @param competencyRelationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeCompetencyRelation(Long competencyId, Long courseId, Long competencyRelationId) throws ApiException {
    removeCompetencyRelationWithHttpInfo(competencyId, courseId, competencyRelationId);
  }

  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @param competencyRelationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeCompetencyRelationWithHttpInfo(Long competencyId, Long courseId, Long competencyRelationId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling removeCompetencyRelation");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removeCompetencyRelation");
    }
    if (competencyRelationId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyRelationId' when calling removeCompetencyRelation");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies/{competencyId}/relations/{competencyRelationId}"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{competencyRelationId}", apiClient.escapeString(competencyRelationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("CompetencyResourceApi.removeCompetencyRelation", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param competencyId  (required)
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removePrerequisite(Long competencyId, Long courseId) throws ApiException {
    removePrerequisiteWithHttpInfo(competencyId, courseId);
  }

  /**
   * 
   * 
   * @param competencyId  (required)
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
  public ApiResponse<Void> removePrerequisiteWithHttpInfo(Long competencyId, Long courseId) throws ApiException {
    // Check required parameters
    if (competencyId == null) {
      throw new ApiException(400, "Missing the required parameter 'competencyId' when calling removePrerequisite");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removePrerequisite");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/prerequisites/{competencyId}"
            .replaceAll("\\{competencyId}", apiClient.escapeString(competencyId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("CompetencyResourceApi.removePrerequisite", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param competency  (required)
   * @return Competency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Competency updateCompetency(Long courseId, Competency competency) throws ApiException {
    return updateCompetencyWithHttpInfo(courseId, competency).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param competency  (required)
   * @return ApiResponse&lt;Competency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Competency> updateCompetencyWithHttpInfo(Long courseId, Competency competency) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateCompetency");
    }
    if (competency == null) {
      throw new ApiException(400, "Missing the required parameter 'competency' when calling updateCompetency");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/competencies"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Competency> localVarReturnType = new GenericType<Competency>() {};
    return apiClient.invokeAPI("CompetencyResourceApi.updateCompetency", localVarPath, "PUT", new ArrayList<>(), competency,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
