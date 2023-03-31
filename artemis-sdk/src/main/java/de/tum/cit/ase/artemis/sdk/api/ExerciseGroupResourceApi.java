package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ExerciseGroupResourceApi {
  private ApiClient apiClient;

  public ExerciseGroupResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExerciseGroupResourceApi(ApiClient apiClient) {
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
   * @param examId  (required)
   * @param exerciseGroup  (required)
   * @return ExerciseGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExerciseGroup createExerciseGroup(Long courseId, Long examId, ExerciseGroup exerciseGroup) throws ApiException {
    return createExerciseGroupWithHttpInfo(courseId, examId, exerciseGroup).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroup  (required)
   * @return ApiResponse&lt;ExerciseGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExerciseGroup> createExerciseGroupWithHttpInfo(Long courseId, Long examId, ExerciseGroup exerciseGroup) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createExerciseGroup");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling createExerciseGroup");
    }
    if (exerciseGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseGroup' when calling createExerciseGroup");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exerciseGroups"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExerciseGroup> localVarReturnType = new GenericType<ExerciseGroup>() {};
    return apiClient.invokeAPI("ExerciseGroupResourceApi.createExerciseGroup", localVarPath, "POST", new ArrayList<>(), exerciseGroup,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroupId  (required)
   * @param deleteStudentReposBuildPlans  (optional, default to false)
   * @param deleteBaseReposBuildPlans  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteExerciseGroup(Long courseId, Long examId, Long exerciseGroupId, Boolean deleteStudentReposBuildPlans, Boolean deleteBaseReposBuildPlans) throws ApiException {
    deleteExerciseGroupWithHttpInfo(courseId, examId, exerciseGroupId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroupId  (required)
   * @param deleteStudentReposBuildPlans  (optional, default to false)
   * @param deleteBaseReposBuildPlans  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteExerciseGroupWithHttpInfo(Long courseId, Long examId, Long exerciseGroupId, Boolean deleteStudentReposBuildPlans, Boolean deleteBaseReposBuildPlans) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteExerciseGroup");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling deleteExerciseGroup");
    }
    if (exerciseGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseGroupId' when calling deleteExerciseGroup");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exerciseGroups/{exerciseGroupId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{exerciseGroupId}", apiClient.escapeString(exerciseGroupId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteStudentReposBuildPlans", deleteStudentReposBuildPlans)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteBaseReposBuildPlans", deleteBaseReposBuildPlans));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExerciseGroupResourceApi.deleteExerciseGroup", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroupId  (required)
   * @return ExerciseGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExerciseGroup getExerciseGroup(Long courseId, Long examId, Long exerciseGroupId) throws ApiException {
    return getExerciseGroupWithHttpInfo(courseId, examId, exerciseGroupId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroupId  (required)
   * @return ApiResponse&lt;ExerciseGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExerciseGroup> getExerciseGroupWithHttpInfo(Long courseId, Long examId, Long exerciseGroupId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExerciseGroup");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExerciseGroup");
    }
    if (exerciseGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseGroupId' when calling getExerciseGroup");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exerciseGroups/{exerciseGroupId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{exerciseGroupId}", apiClient.escapeString(exerciseGroupId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExerciseGroup> localVarReturnType = new GenericType<ExerciseGroup>() {};
    return apiClient.invokeAPI("ExerciseGroupResourceApi.getExerciseGroup", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return List&lt;ExerciseGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ExerciseGroup> getExerciseGroupsForExam(Long courseId, Long examId) throws ApiException {
    return getExerciseGroupsForExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;ExerciseGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ExerciseGroup>> getExerciseGroupsForExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExerciseGroupsForExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExerciseGroupsForExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exerciseGroups"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ExerciseGroup>> localVarReturnType = new GenericType<List<ExerciseGroup>>() {};
    return apiClient.invokeAPI("ExerciseGroupResourceApi.getExerciseGroupsForExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroup  (required)
   * @return List&lt;ExerciseGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ExerciseGroup> importExerciseGroup(Long courseId, Long examId, List<ExerciseGroup> exerciseGroup) throws ApiException {
    return importExerciseGroupWithHttpInfo(courseId, examId, exerciseGroup).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroup  (required)
   * @return ApiResponse&lt;List&lt;ExerciseGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ExerciseGroup>> importExerciseGroupWithHttpInfo(Long courseId, Long examId, List<ExerciseGroup> exerciseGroup) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importExerciseGroup");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling importExerciseGroup");
    }
    if (exerciseGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseGroup' when calling importExerciseGroup");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/import-exercise-group"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<ExerciseGroup>> localVarReturnType = new GenericType<List<ExerciseGroup>>() {};
    return apiClient.invokeAPI("ExerciseGroupResourceApi.importExerciseGroup", localVarPath, "POST", new ArrayList<>(), exerciseGroup,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroup  (required)
   * @return ExerciseGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExerciseGroup updateExerciseGroup(Long courseId, Long examId, ExerciseGroup exerciseGroup) throws ApiException {
    return updateExerciseGroupWithHttpInfo(courseId, examId, exerciseGroup).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param exerciseGroup  (required)
   * @return ApiResponse&lt;ExerciseGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExerciseGroup> updateExerciseGroupWithHttpInfo(Long courseId, Long examId, ExerciseGroup exerciseGroup) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateExerciseGroup");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateExerciseGroup");
    }
    if (exerciseGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseGroup' when calling updateExerciseGroup");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exerciseGroups"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExerciseGroup> localVarReturnType = new GenericType<ExerciseGroup>() {};
    return apiClient.invokeAPI("ExerciseGroupResourceApi.updateExerciseGroup", localVarPath, "PUT", new ArrayList<>(), exerciseGroup,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
