package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.FileUploadExercise;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOFileUploadExercise;
import de.tum.cit.ase.artemis.sdk.model.SubmissionExportOptionsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class FileUploadExerciseResourceApi {
  private ApiClient apiClient;

  public FileUploadExerciseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileUploadExerciseResourceApi(ApiClient apiClient) {
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
   * @param fileUploadExercise  (required)
   * @return FileUploadExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadExercise createFileUploadExercise(FileUploadExercise fileUploadExercise) throws ApiException {
    return createFileUploadExerciseWithHttpInfo(fileUploadExercise).getData();
  }

  /**
   * 
   * 
   * @param fileUploadExercise  (required)
   * @return ApiResponse&lt;FileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadExercise> createFileUploadExerciseWithHttpInfo(FileUploadExercise fileUploadExercise) throws ApiException {
    // Check required parameters
    if (fileUploadExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'fileUploadExercise' when calling createFileUploadExercise");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<FileUploadExercise> localVarReturnType = new GenericType<FileUploadExercise>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.createFileUploadExercise", "/api/file-upload-exercises", "POST", new ArrayList<>(), fileUploadExercise,
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
  public void deleteFileUploadExercise(Long exerciseId) throws ApiException {
    deleteFileUploadExerciseWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> deleteFileUploadExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteFileUploadExercise");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.deleteFileUploadExercise", localVarPath, "DELETE", new ArrayList<>(), null,
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
  public File exportSubmissions2(Long exerciseId, SubmissionExportOptionsDTO submissionExportOptionsDTO) throws ApiException {
    return exportSubmissions2WithHttpInfo(exerciseId, submissionExportOptionsDTO).getData();
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
  public ApiResponse<File> exportSubmissions2WithHttpInfo(Long exerciseId, SubmissionExportOptionsDTO submissionExportOptionsDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissions2");
    }
    if (submissionExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionExportOptionsDTO' when calling exportSubmissions2");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-exercises/{exerciseId}/export-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.exportSubmissions2", localVarPath, "POST", new ArrayList<>(), submissionExportOptionsDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return SearchResultPageDTOFileUploadExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOFileUploadExercise getAllExercisesOnPage4(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    return getAllExercisesOnPage4WithHttpInfo(search, isCourseFilter, isExamFilter).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return ApiResponse&lt;SearchResultPageDTOFileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOFileUploadExercise> getAllExercisesOnPage4WithHttpInfo(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExercisesOnPage4");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCourseFilter", isCourseFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isExamFilter", isExamFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOFileUploadExercise> localVarReturnType = new GenericType<SearchResultPageDTOFileUploadExercise>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.getAllExercisesOnPage4", "/api/file-upload-exercises", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return FileUploadExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadExercise getFileUploadExercise(Long exerciseId) throws ApiException {
    return getFileUploadExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;FileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadExercise> getFileUploadExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getFileUploadExercise");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FileUploadExercise> localVarReturnType = new GenericType<FileUploadExercise>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.getFileUploadExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;FileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<FileUploadExercise> getFileUploadExercisesForCourse(Long courseId) throws ApiException {
    return getFileUploadExercisesForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;FileUploadExercise&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<FileUploadExercise>> getFileUploadExercisesForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getFileUploadExercisesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/file-upload-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<FileUploadExercise>> localVarReturnType = new GenericType<List<FileUploadExercise>>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.getFileUploadExercisesForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sourceId  (required)
   * @param fileUploadExercise  (required)
   * @return FileUploadExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadExercise importFileUploadExercise(Long sourceId, FileUploadExercise fileUploadExercise) throws ApiException {
    return importFileUploadExerciseWithHttpInfo(sourceId, fileUploadExercise).getData();
  }

  /**
   * 
   * 
   * @param sourceId  (required)
   * @param fileUploadExercise  (required)
   * @return ApiResponse&lt;FileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadExercise> importFileUploadExerciseWithHttpInfo(Long sourceId, FileUploadExercise fileUploadExercise) throws ApiException {
    // Check required parameters
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling importFileUploadExercise");
    }
    if (fileUploadExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'fileUploadExercise' when calling importFileUploadExercise");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-exercises/import/{sourceId}"
            .replaceAll("\\{sourceId}", apiClient.escapeString(sourceId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<FileUploadExercise> localVarReturnType = new GenericType<FileUploadExercise>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.importFileUploadExercise", localVarPath, "POST", new ArrayList<>(), fileUploadExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param fileUploadExercise  (required)
   * @param deleteFeedback  (optional)
   * @return FileUploadExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadExercise reEvaluateAndUpdateFileUploadExercise(Long exerciseId, FileUploadExercise fileUploadExercise, Boolean deleteFeedback) throws ApiException {
    return reEvaluateAndUpdateFileUploadExerciseWithHttpInfo(exerciseId, fileUploadExercise, deleteFeedback).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param fileUploadExercise  (required)
   * @param deleteFeedback  (optional)
   * @return ApiResponse&lt;FileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadExercise> reEvaluateAndUpdateFileUploadExerciseWithHttpInfo(Long exerciseId, FileUploadExercise fileUploadExercise, Boolean deleteFeedback) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling reEvaluateAndUpdateFileUploadExercise");
    }
    if (fileUploadExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'fileUploadExercise' when calling reEvaluateAndUpdateFileUploadExercise");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-exercises/{exerciseId}/re-evaluate"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteFeedback", deleteFeedback)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<FileUploadExercise> localVarReturnType = new GenericType<FileUploadExercise>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.reEvaluateAndUpdateFileUploadExercise", localVarPath, "PUT", localVarQueryParams, fileUploadExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param fileUploadExercise  (required)
   * @param notificationText  (optional)
   * @return FileUploadExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public FileUploadExercise updateFileUploadExercise(Long exerciseId, FileUploadExercise fileUploadExercise, String notificationText) throws ApiException {
    return updateFileUploadExerciseWithHttpInfo(exerciseId, fileUploadExercise, notificationText).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param fileUploadExercise  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;FileUploadExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadExercise> updateFileUploadExerciseWithHttpInfo(Long exerciseId, FileUploadExercise fileUploadExercise, String notificationText) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateFileUploadExercise");
    }
    if (fileUploadExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'fileUploadExercise' when calling updateFileUploadExercise");
    }

    // Path parameters
    String localVarPath = "/api/file-upload-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<FileUploadExercise> localVarReturnType = new GenericType<FileUploadExercise>() {};
    return apiClient.invokeAPI("FileUploadExerciseResourceApi.updateFileUploadExercise", localVarPath, "PUT", localVarQueryParams, fileUploadExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
