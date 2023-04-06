package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CleanupBuildPlan200Response;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.MappingJacksonValue;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseStudentParticipation;
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.StudentParticipation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ParticipationResourceApi {
  private ApiClient apiClient;

  public ParticipationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParticipationResourceApi(ApiClient apiClient) {
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
   * @param participationId  (required)
   * @return CleanupBuildPlan200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CleanupBuildPlan200Response cleanupBuildPlan(Long participationId) throws ApiException {
    return cleanupBuildPlanWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;CleanupBuildPlan200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CleanupBuildPlan200Response> cleanupBuildPlanWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling cleanupBuildPlan");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/cleanupBuildPlan"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CleanupBuildPlan200Response> localVarReturnType = new GenericType<CleanupBuildPlan200Response>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.cleanupBuildPlan", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param deleteBuildPlan  (optional, default to false)
   * @param deleteRepository  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteParticipation(Long participationId, Boolean deleteBuildPlan, Boolean deleteRepository) throws ApiException {
    deleteParticipationWithHttpInfo(participationId, deleteBuildPlan, deleteRepository);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param deleteBuildPlan  (optional, default to false)
   * @param deleteRepository  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteParticipationWithHttpInfo(Long participationId, Boolean deleteBuildPlan, Boolean deleteRepository) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteParticipation");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteBuildPlan", deleteBuildPlan)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteRepository", deleteRepository));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ParticipationResourceApi.deleteParticipation", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param deleteBuildPlan  (optional, default to false)
   * @param deleteRepository  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteParticipationForGuidedTour(Long participationId, Boolean deleteBuildPlan, Boolean deleteRepository) throws ApiException {
    deleteParticipationForGuidedTourWithHttpInfo(participationId, deleteBuildPlan, deleteRepository);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param deleteBuildPlan  (optional, default to false)
   * @param deleteRepository  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteParticipationForGuidedTourWithHttpInfo(Long participationId, Boolean deleteBuildPlan, Boolean deleteRepository) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteParticipationForGuidedTour");
    }

    // Path parameters
    String localVarPath = "/api/guided-tour/participations/{participationId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteBuildPlan", deleteBuildPlan)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteRepository", deleteRepository));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ParticipationResourceApi.deleteParticipationForGuidedTour", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;StudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<StudentParticipation> getAllParticipationsForCourse(Long courseId) throws ApiException {
    return getAllParticipationsForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;StudentParticipation&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<StudentParticipation>> getAllParticipationsForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllParticipationsForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/participations"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<StudentParticipation>> localVarReturnType = new GenericType<List<StudentParticipation>>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getAllParticipationsForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param withLatestResult  (optional, default to false)
   * @return Set&lt;StudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StudentParticipation> getAllParticipationsForExercise(Long exerciseId, Boolean withLatestResult) throws ApiException {
    return getAllParticipationsForExerciseWithHttpInfo(exerciseId, withLatestResult).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param withLatestResult  (optional, default to false)
   * @return ApiResponse&lt;Set&lt;StudentParticipation&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StudentParticipation>> getAllParticipationsForExerciseWithHttpInfo(Long exerciseId, Boolean withLatestResult) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllParticipationsForExercise");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/participations"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withLatestResult", withLatestResult)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<StudentParticipation>> localVarReturnType = new GenericType<Set<StudentParticipation>>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getAllParticipationsForExercise", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getParticipationBuildArtifact(Long participationId) throws ApiException {
    return getParticipationBuildArtifactWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getParticipationBuildArtifactWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getParticipationBuildArtifact");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/buildArtifact"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getParticipationBuildArtifact", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return StudentParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentParticipation getParticipationForCurrentUser(Long participationId) throws ApiException {
    return getParticipationForCurrentUserWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;StudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentParticipation> getParticipationForCurrentUserWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getParticipationForCurrentUser");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentParticipation> localVarReturnType = new GenericType<StudentParticipation>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getParticipationForCurrentUser", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return MappingJacksonValue
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public MappingJacksonValue getParticipationForCurrentUser1(Long exerciseId) throws ApiException {
    return getParticipationForCurrentUser1WithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;MappingJacksonValue&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MappingJacksonValue> getParticipationForCurrentUser1WithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getParticipationForCurrentUser1");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/participation"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<MappingJacksonValue> localVarReturnType = new GenericType<MappingJacksonValue>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getParticipationForCurrentUser1", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return StudentParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentParticipation getParticipationWithLatestResult(Long participationId) throws ApiException {
    return getParticipationWithLatestResultWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;StudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentParticipation> getParticipationWithLatestResultWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getParticipationWithLatestResult");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/withLatestResult"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentParticipation> localVarReturnType = new GenericType<StudentParticipation>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getParticipationWithLatestResult", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return List&lt;GetAllTextSubmissions200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<GetAllTextSubmissions200ResponseInner> getSubmissionsOfParticipation(Long participationId) throws ApiException {
    return getSubmissionsOfParticipationWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;List&lt;GetAllTextSubmissions200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<GetAllTextSubmissions200ResponseInner>> getSubmissionsOfParticipationWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getSubmissionsOfParticipation");
    }

    // Path parameters
    String localVarPath = "/api/participations/{participationId}/submissions"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<GetAllTextSubmissions200ResponseInner>> localVarReturnType = new GenericType<List<GetAllTextSubmissions200ResponseInner>>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.getSubmissionsOfParticipation", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ProgrammingExerciseStudentParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseStudentParticipation requestFeedback(Long exerciseId) throws ApiException {
    return requestFeedbackWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ProgrammingExerciseStudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseStudentParticipation> requestFeedbackWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling requestFeedback");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/request-feedback"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExerciseStudentParticipation> localVarReturnType = new GenericType<ProgrammingExerciseStudentParticipation>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.requestFeedback", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param participationId  (required)
   * @return ProgrammingExerciseStudentParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseStudentParticipation resumeParticipation(Long exerciseId, Long participationId) throws ApiException {
    return resumeParticipationWithHttpInfo(exerciseId, participationId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param participationId  (required)
   * @return ApiResponse&lt;ProgrammingExerciseStudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseStudentParticipation> resumeParticipationWithHttpInfo(Long exerciseId, Long participationId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling resumeParticipation");
    }
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling resumeParticipation");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/resume-programming-participation/{participationId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExerciseStudentParticipation> localVarReturnType = new GenericType<ProgrammingExerciseStudentParticipation>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.resumeParticipation", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return CleanupBuildPlan200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CleanupBuildPlan200Response startParticipation(Long exerciseId) throws ApiException {
    return startParticipationWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;CleanupBuildPlan200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CleanupBuildPlan200Response> startParticipationWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling startParticipation");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/participations"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CleanupBuildPlan200Response> localVarReturnType = new GenericType<CleanupBuildPlan200Response>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.startParticipation", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param useGradedParticipation  (optional, default to false)
   * @return CleanupBuildPlan200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CleanupBuildPlan200Response startPracticeParticipation(Long exerciseId, Boolean useGradedParticipation) throws ApiException {
    return startPracticeParticipationWithHttpInfo(exerciseId, useGradedParticipation).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param useGradedParticipation  (optional, default to false)
   * @return ApiResponse&lt;CleanupBuildPlan200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CleanupBuildPlan200Response> startPracticeParticipationWithHttpInfo(Long exerciseId, Boolean useGradedParticipation) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling startPracticeParticipation");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/participations/practice"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "useGradedParticipation", useGradedParticipation)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CleanupBuildPlan200Response> localVarReturnType = new GenericType<CleanupBuildPlan200Response>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.startPracticeParticipation", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param studentParticipation  (required)
   * @return CleanupBuildPlan200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CleanupBuildPlan200Response updateParticipation(Long exerciseId, StudentParticipation studentParticipation) throws ApiException {
    return updateParticipationWithHttpInfo(exerciseId, studentParticipation).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param studentParticipation  (required)
   * @return ApiResponse&lt;CleanupBuildPlan200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CleanupBuildPlan200Response> updateParticipationWithHttpInfo(Long exerciseId, StudentParticipation studentParticipation) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateParticipation");
    }
    if (studentParticipation == null) {
      throw new ApiException(400, "Missing the required parameter 'studentParticipation' when calling updateParticipation");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/participations"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CleanupBuildPlan200Response> localVarReturnType = new GenericType<CleanupBuildPlan200Response>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.updateParticipation", localVarPath, "PUT", new ArrayList<>(), studentParticipation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param studentParticipation  (required)
   * @return List&lt;StudentParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<StudentParticipation> updateParticipationDueDates(Long exerciseId, List<StudentParticipation> studentParticipation) throws ApiException {
    return updateParticipationDueDatesWithHttpInfo(exerciseId, studentParticipation).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param studentParticipation  (required)
   * @return ApiResponse&lt;List&lt;StudentParticipation&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<StudentParticipation>> updateParticipationDueDatesWithHttpInfo(Long exerciseId, List<StudentParticipation> studentParticipation) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateParticipationDueDates");
    }
    if (studentParticipation == null) {
      throw new ApiException(400, "Missing the required parameter 'studentParticipation' when calling updateParticipationDueDates");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/participations/update-individual-due-date"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<StudentParticipation>> localVarReturnType = new GenericType<List<StudentParticipation>>() {};
    return apiClient.invokeAPI("ParticipationResourceApi.updateParticipationDueDates", localVarPath, "PUT", new ArrayList<>(), studentParticipation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
