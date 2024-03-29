package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.ModelingExercise;
import de.tum.cit.ase.artemis.sdk.model.ModelingPlagiarismResult;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOModelingExercise;
import de.tum.cit.ase.artemis.sdk.model.SubmissionExportOptionsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ModelingExerciseResourceApi {
  private ApiClient apiClient;

  public ModelingExerciseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModelingExerciseResourceApi(ApiClient apiClient) {
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
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @param minimumSize  (required)
   * @return ModelingPlagiarismResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingPlagiarismResult checkPlagiarism2(Long exerciseId, Float similarityThreshold, Integer minimumScore, Integer minimumSize) throws ApiException {
    return checkPlagiarism2WithHttpInfo(exerciseId, similarityThreshold, minimumScore, minimumSize).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @param minimumSize  (required)
   * @return ApiResponse&lt;ModelingPlagiarismResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingPlagiarismResult> checkPlagiarism2WithHttpInfo(Long exerciseId, Float similarityThreshold, Integer minimumScore, Integer minimumSize) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling checkPlagiarism2");
    }
    if (similarityThreshold == null) {
      throw new ApiException(400, "Missing the required parameter 'similarityThreshold' when calling checkPlagiarism2");
    }
    if (minimumScore == null) {
      throw new ApiException(400, "Missing the required parameter 'minimumScore' when calling checkPlagiarism2");
    }
    if (minimumSize == null) {
      throw new ApiException(400, "Missing the required parameter 'minimumSize' when calling checkPlagiarism2");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/{exerciseId}/check-plagiarism"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "similarityThreshold", similarityThreshold)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumScore", minimumScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumSize", minimumSize));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ModelingPlagiarismResult> localVarReturnType = new GenericType<ModelingPlagiarismResult>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.checkPlagiarism2", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param modelingExercise  (required)
   * @return ModelingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingExercise createModelingExercise(ModelingExercise modelingExercise) throws ApiException {
    return createModelingExerciseWithHttpInfo(modelingExercise).getData();
  }

  /**
   * 
   * 
   * @param modelingExercise  (required)
   * @return ApiResponse&lt;ModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingExercise> createModelingExerciseWithHttpInfo(ModelingExercise modelingExercise) throws ApiException {
    // Check required parameters
    if (modelingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'modelingExercise' when calling createModelingExercise");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ModelingExercise> localVarReturnType = new GenericType<ModelingExercise>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.createModelingExercise", "/api/modeling-exercises", "POST", new ArrayList<>(), modelingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteModelingExercise(Long exerciseId) throws ApiException {
    deleteModelingExerciseWithHttpInfo(exerciseId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteModelingExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteModelingExercise");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ModelingExerciseResourceApi.deleteModelingExercise", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionExportOptionsDTO  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportSubmissions1(Long exerciseId, SubmissionExportOptionsDTO submissionExportOptionsDTO) throws ApiException {
    return exportSubmissions1WithHttpInfo(exerciseId, submissionExportOptionsDTO).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionExportOptionsDTO  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportSubmissions1WithHttpInfo(Long exerciseId, SubmissionExportOptionsDTO submissionExportOptionsDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissions1");
    }
    if (submissionExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionExportOptionsDTO' when calling exportSubmissions1");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/{exerciseId}/export-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.exportSubmissions1", localVarPath, "POST", new ArrayList<>(), submissionExportOptionsDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return SearchResultPageDTOModelingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOModelingExercise getAllExercisesOnPage3(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    return getAllExercisesOnPage3WithHttpInfo(search, isCourseFilter, isExamFilter).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return ApiResponse&lt;SearchResultPageDTOModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOModelingExercise> getAllExercisesOnPage3WithHttpInfo(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExercisesOnPage3");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCourseFilter", isCourseFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isExamFilter", isExamFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOModelingExercise> localVarReturnType = new GenericType<SearchResultPageDTOModelingExercise>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.getAllExercisesOnPage3", "/api/modeling-exercises", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ModelingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingExercise getModelingExercise(Long exerciseId) throws ApiException {
    return getModelingExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingExercise> getModelingExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getModelingExercise");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ModelingExercise> localVarReturnType = new GenericType<ModelingExercise>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.getModelingExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;ModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ModelingExercise> getModelingExercisesForCourse(Long courseId) throws ApiException {
    return getModelingExercisesForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;ModelingExercise&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ModelingExercise>> getModelingExercisesForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getModelingExercisesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/modeling-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ModelingExercise>> localVarReturnType = new GenericType<List<ModelingExercise>>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.getModelingExercisesForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ModelingPlagiarismResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingPlagiarismResult getPlagiarismResult2(Long exerciseId) throws ApiException {
    return getPlagiarismResult2WithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ModelingPlagiarismResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingPlagiarismResult> getPlagiarismResult2WithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getPlagiarismResult2");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/{exerciseId}/plagiarism-result"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ModelingPlagiarismResult> localVarReturnType = new GenericType<ModelingPlagiarismResult>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.getPlagiarismResult2", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param modelingExercise  (required)
   * @return ModelingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingExercise importExercise2(Long sourceExerciseId, ModelingExercise modelingExercise) throws ApiException {
    return importExercise2WithHttpInfo(sourceExerciseId, modelingExercise).getData();
  }

  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param modelingExercise  (required)
   * @return ApiResponse&lt;ModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingExercise> importExercise2WithHttpInfo(Long sourceExerciseId, ModelingExercise modelingExercise) throws ApiException {
    // Check required parameters
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importExercise2");
    }
    if (modelingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'modelingExercise' when calling importExercise2");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/import/{sourceExerciseId}"
            .replaceAll("\\{sourceExerciseId}", apiClient.escapeString(sourceExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ModelingExercise> localVarReturnType = new GenericType<ModelingExercise>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.importExercise2", localVarPath, "POST", new ArrayList<>(), modelingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param modelingExercise  (required)
   * @param deleteFeedback  (optional)
   * @return ModelingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingExercise reEvaluateAndUpdateModelingExercise(Long exerciseId, ModelingExercise modelingExercise, Boolean deleteFeedback) throws ApiException {
    return reEvaluateAndUpdateModelingExerciseWithHttpInfo(exerciseId, modelingExercise, deleteFeedback).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param modelingExercise  (required)
   * @param deleteFeedback  (optional)
   * @return ApiResponse&lt;ModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingExercise> reEvaluateAndUpdateModelingExerciseWithHttpInfo(Long exerciseId, ModelingExercise modelingExercise, Boolean deleteFeedback) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling reEvaluateAndUpdateModelingExercise");
    }
    if (modelingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'modelingExercise' when calling reEvaluateAndUpdateModelingExercise");
    }

    // Path parameters
    String localVarPath = "/api/modeling-exercises/{exerciseId}/re-evaluate"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteFeedback", deleteFeedback)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ModelingExercise> localVarReturnType = new GenericType<ModelingExercise>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.reEvaluateAndUpdateModelingExercise", localVarPath, "PUT", localVarQueryParams, modelingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param modelingExercise  (required)
   * @param notificationText  (optional)
   * @return ModelingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ModelingExercise updateModelingExercise(ModelingExercise modelingExercise, String notificationText) throws ApiException {
    return updateModelingExerciseWithHttpInfo(modelingExercise, notificationText).getData();
  }

  /**
   * 
   * 
   * @param modelingExercise  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;ModelingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelingExercise> updateModelingExerciseWithHttpInfo(ModelingExercise modelingExercise, String notificationText) throws ApiException {
    // Check required parameters
    if (modelingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'modelingExercise' when calling updateModelingExercise");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ModelingExercise> localVarReturnType = new GenericType<ModelingExercise>() {};
    return apiClient.invokeAPI("ModelingExerciseResourceApi.updateModelingExercise", "/api/modeling-exercises", "PUT", localVarQueryParams, modelingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
