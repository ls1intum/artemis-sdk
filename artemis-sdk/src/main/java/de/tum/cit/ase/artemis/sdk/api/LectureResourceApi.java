package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Lecture;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOLecture;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class LectureResourceApi {
  private ApiClient apiClient;

  public LectureResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LectureResourceApi(ApiClient apiClient) {
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
   * @param lecture  (required)
   * @return Lecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Lecture createLecture(Lecture lecture) throws ApiException {
    return createLectureWithHttpInfo(lecture).getData();
  }

  /**
   * 
   * 
   * @param lecture  (required)
   * @return ApiResponse&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Lecture> createLectureWithHttpInfo(Lecture lecture) throws ApiException {
    // Check required parameters
    if (lecture == null) {
      throw new ApiException(400, "Missing the required parameter 'lecture' when calling createLecture");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Lecture> localVarReturnType = new GenericType<Lecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.createLecture", "/api/lectures", "POST", new ArrayList<>(), lecture,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteLecture(Long lectureId) throws ApiException {
    deleteLectureWithHttpInfo(lectureId);
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteLectureWithHttpInfo(Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling deleteLecture");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("LectureResourceApi.deleteLecture", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @return SearchResultPageDTOLecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOLecture getAllLecturesOnPage(PageableSearchDTOString search) throws ApiException {
    return getAllLecturesOnPageWithHttpInfo(search).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @return ApiResponse&lt;SearchResultPageDTOLecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOLecture> getAllLecturesOnPageWithHttpInfo(PageableSearchDTOString search) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllLecturesOnPage");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOLecture> localVarReturnType = new GenericType<SearchResultPageDTOLecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.getAllLecturesOnPage", "/api/lectures", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @return Lecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Lecture getLecture(Long lectureId) throws ApiException {
    return getLectureWithHttpInfo(lectureId).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Lecture> getLectureWithHttpInfo(Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getLecture");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Lecture> localVarReturnType = new GenericType<Lecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.getLecture", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getLectureTitle(Long lectureId) throws ApiException {
    return getLectureTitleWithHttpInfo(lectureId).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getLectureTitleWithHttpInfo(Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getLectureTitle");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/title"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("LectureResourceApi.getLectureTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @return Lecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Lecture getLectureWithDetails(Long lectureId) throws ApiException {
    return getLectureWithDetailsWithHttpInfo(lectureId).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Lecture> getLectureWithDetailsWithHttpInfo(Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getLectureWithDetails");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/details"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Lecture> localVarReturnType = new GenericType<Lecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.getLectureWithDetails", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @return Lecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Lecture getLectureWithDetailsAndSlides(Long lectureId) throws ApiException {
    return getLectureWithDetailsAndSlidesWithHttpInfo(lectureId).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Lecture> getLectureWithDetailsAndSlidesWithHttpInfo(Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getLectureWithDetailsAndSlides");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/details-with-slides"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Lecture> localVarReturnType = new GenericType<Lecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.getLectureWithDetailsAndSlides", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param withLectureUnits  (optional, default to false)
   * @return Set&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<Lecture> getLecturesForCourse(Long courseId, Boolean withLectureUnits) throws ApiException {
    return getLecturesForCourseWithHttpInfo(courseId, withLectureUnits).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param withLectureUnits  (optional, default to false)
   * @return ApiResponse&lt;Set&lt;Lecture&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<Lecture>> getLecturesForCourseWithHttpInfo(Long courseId, Boolean withLectureUnits) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLecturesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/lectures"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withLectureUnits", withLectureUnits)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<Lecture>> localVarReturnType = new GenericType<Set<Lecture>>() {};
    return apiClient.invokeAPI("LectureResourceApi.getLecturesForCourse", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return Set&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<Lecture> getLecturesWithSlidesForCourse(Long courseId) throws ApiException {
    return getLecturesWithSlidesForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;Set&lt;Lecture&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<Lecture>> getLecturesWithSlidesForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLecturesWithSlidesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/lectures-with-slides"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<Lecture>> localVarReturnType = new GenericType<Set<Lecture>>() {};
    return apiClient.invokeAPI("LectureResourceApi.getLecturesWithSlidesForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sourceLectureId  (required)
   * @param courseId  (required)
   * @return Lecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Lecture importLecture(Long sourceLectureId, Long courseId) throws ApiException {
    return importLectureWithHttpInfo(sourceLectureId, courseId).getData();
  }

  /**
   * 
   * 
   * @param sourceLectureId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Lecture> importLectureWithHttpInfo(Long sourceLectureId, Long courseId) throws ApiException {
    // Check required parameters
    if (sourceLectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLectureId' when calling importLecture");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importLecture");
    }

    // Path parameters
    String localVarPath = "/api/lectures/import/{sourceLectureId}"
            .replaceAll("\\{sourceLectureId}", apiClient.escapeString(sourceLectureId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "courseId", courseId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Lecture> localVarReturnType = new GenericType<Lecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.importLecture", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lecture  (required)
   * @return Lecture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Lecture updateLecture(Lecture lecture) throws ApiException {
    return updateLectureWithHttpInfo(lecture).getData();
  }

  /**
   * 
   * 
   * @param lecture  (required)
   * @return ApiResponse&lt;Lecture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Lecture> updateLectureWithHttpInfo(Lecture lecture) throws ApiException {
    // Check required parameters
    if (lecture == null) {
      throw new ApiException(400, "Missing the required parameter 'lecture' when calling updateLecture");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Lecture> localVarReturnType = new GenericType<Lecture>() {};
    return apiClient.invokeAPI("LectureResourceApi.updateLecture", "/api/lectures", "PUT", new ArrayList<>(), lecture,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
