package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOTextExercise;
import de.tum.cit.ase.artemis.sdk.model.StudentParticipation;
import de.tum.cit.ase.artemis.sdk.model.SubmissionExportOptionsDTO;
import de.tum.cit.ase.artemis.sdk.model.TextExercise;
import de.tum.cit.ase.artemis.sdk.model.TextPlagiarismResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class TextExerciseResourceApi {
  private ApiClient apiClient;

  public TextExerciseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TextExerciseResourceApi(ApiClient apiClient) {
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
   * @return TextPlagiarismResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextPlagiarismResult checkPlagiarism(Long exerciseId, Float similarityThreshold, Integer minimumScore, Integer minimumSize) throws ApiException {
    return checkPlagiarismWithHttpInfo(exerciseId, similarityThreshold, minimumScore, minimumSize).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @param minimumSize  (required)
   * @return ApiResponse&lt;TextPlagiarismResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextPlagiarismResult> checkPlagiarismWithHttpInfo(Long exerciseId, Float similarityThreshold, Integer minimumScore, Integer minimumSize) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling checkPlagiarism");
    }
    if (similarityThreshold == null) {
      throw new ApiException(400, "Missing the required parameter 'similarityThreshold' when calling checkPlagiarism");
    }
    if (minimumScore == null) {
      throw new ApiException(400, "Missing the required parameter 'minimumScore' when calling checkPlagiarism");
    }
    if (minimumSize == null) {
      throw new ApiException(400, "Missing the required parameter 'minimumSize' when calling checkPlagiarism");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/{exerciseId}/check-plagiarism"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "similarityThreshold", similarityThreshold)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumScore", minimumScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumSize", minimumSize));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TextPlagiarismResult> localVarReturnType = new GenericType<TextPlagiarismResult>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.checkPlagiarism", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param textExercise  (required)
   * @return TextExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextExercise createTextExercise(TextExercise textExercise) throws ApiException {
    return createTextExerciseWithHttpInfo(textExercise).getData();
  }

  /**
   * 
   * 
   * @param textExercise  (required)
   * @return ApiResponse&lt;TextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextExercise> createTextExerciseWithHttpInfo(TextExercise textExercise) throws ApiException {
    // Check required parameters
    if (textExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'textExercise' when calling createTextExercise");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextExercise> localVarReturnType = new GenericType<TextExercise>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.createTextExercise", "/api/text-exercises", "POST", new ArrayList<>(), textExercise,
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
  public void deleteTextExercise(Long exerciseId) throws ApiException {
    deleteTextExerciseWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> deleteTextExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteTextExercise");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("TextExerciseResourceApi.deleteTextExercise", localVarPath, "DELETE", new ArrayList<>(), null,
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
  public File exportSubmissions(Long exerciseId, SubmissionExportOptionsDTO submissionExportOptionsDTO) throws ApiException {
    return exportSubmissionsWithHttpInfo(exerciseId, submissionExportOptionsDTO).getData();
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
  public ApiResponse<File> exportSubmissionsWithHttpInfo(Long exerciseId, SubmissionExportOptionsDTO submissionExportOptionsDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissions");
    }
    if (submissionExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionExportOptionsDTO' when calling exportSubmissions");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/{exerciseId}/export-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.exportSubmissions", localVarPath, "POST", new ArrayList<>(), submissionExportOptionsDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return SearchResultPageDTOTextExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOTextExercise getAllExercisesOnPage(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    return getAllExercisesOnPageWithHttpInfo(search, isCourseFilter, isExamFilter).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return ApiResponse&lt;SearchResultPageDTOTextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOTextExercise> getAllExercisesOnPageWithHttpInfo(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExercisesOnPage");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCourseFilter", isCourseFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isExamFilter", isExamFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOTextExercise> localVarReturnType = new GenericType<SearchResultPageDTOTextExercise>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.getAllExercisesOnPage", "/api/text-exercises", "GET", localVarQueryParams, null,
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
  public StudentParticipation getDataForTextEditor(Long participationId) throws ApiException {
    return getDataForTextEditorWithHttpInfo(participationId).getData();
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
  public ApiResponse<StudentParticipation> getDataForTextEditorWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getDataForTextEditor");
    }

    // Path parameters
    String localVarPath = "/api/text-editor/{participationId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentParticipation> localVarReturnType = new GenericType<StudentParticipation>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.getDataForTextEditor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return TextPlagiarismResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextPlagiarismResult getPlagiarismResult(Long exerciseId) throws ApiException {
    return getPlagiarismResultWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;TextPlagiarismResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextPlagiarismResult> getPlagiarismResultWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getPlagiarismResult");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/{exerciseId}/plagiarism-result"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TextPlagiarismResult> localVarReturnType = new GenericType<TextPlagiarismResult>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.getPlagiarismResult", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return TextExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextExercise getTextExercise(Long exerciseId) throws ApiException {
    return getTextExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;TextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextExercise> getTextExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getTextExercise");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TextExercise> localVarReturnType = new GenericType<TextExercise>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.getTextExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;TextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<TextExercise> getTextExercisesForCourse(Long courseId) throws ApiException {
    return getTextExercisesForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;TextExercise&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TextExercise>> getTextExercisesForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getTextExercisesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/text-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<TextExercise>> localVarReturnType = new GenericType<List<TextExercise>>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.getTextExercisesForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param textExercise  (required)
   * @return TextExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextExercise importExercise(Long sourceExerciseId, TextExercise textExercise) throws ApiException {
    return importExerciseWithHttpInfo(sourceExerciseId, textExercise).getData();
  }

  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param textExercise  (required)
   * @return ApiResponse&lt;TextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextExercise> importExerciseWithHttpInfo(Long sourceExerciseId, TextExercise textExercise) throws ApiException {
    // Check required parameters
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importExercise");
    }
    if (textExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'textExercise' when calling importExercise");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/import/{sourceExerciseId}"
            .replaceAll("\\{sourceExerciseId}", apiClient.escapeString(sourceExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextExercise> localVarReturnType = new GenericType<TextExercise>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.importExercise", localVarPath, "POST", new ArrayList<>(), textExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param textExercise  (required)
   * @param deleteFeedback  (optional)
   * @return TextExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextExercise reEvaluateAndUpdateTextExercise(Long exerciseId, TextExercise textExercise, Boolean deleteFeedback) throws ApiException {
    return reEvaluateAndUpdateTextExerciseWithHttpInfo(exerciseId, textExercise, deleteFeedback).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param textExercise  (required)
   * @param deleteFeedback  (optional)
   * @return ApiResponse&lt;TextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextExercise> reEvaluateAndUpdateTextExerciseWithHttpInfo(Long exerciseId, TextExercise textExercise, Boolean deleteFeedback) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling reEvaluateAndUpdateTextExercise");
    }
    if (textExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'textExercise' when calling reEvaluateAndUpdateTextExercise");
    }

    // Path parameters
    String localVarPath = "/api/text-exercises/{exerciseId}/re-evaluate"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteFeedback", deleteFeedback)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextExercise> localVarReturnType = new GenericType<TextExercise>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.reEvaluateAndUpdateTextExercise", localVarPath, "PUT", localVarQueryParams, textExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param textExercise  (required)
   * @param notificationText  (optional)
   * @return TextExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextExercise updateTextExercise(TextExercise textExercise, String notificationText) throws ApiException {
    return updateTextExerciseWithHttpInfo(textExercise, notificationText).getData();
  }

  /**
   * 
   * 
   * @param textExercise  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;TextExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextExercise> updateTextExerciseWithHttpInfo(TextExercise textExercise, String notificationText) throws ApiException {
    // Check required parameters
    if (textExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'textExercise' when calling updateTextExercise");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextExercise> localVarReturnType = new GenericType<TextExercise>() {};
    return apiClient.invokeAPI("TextExerciseResourceApi.updateTextExercise", "/api/text-exercises", "PUT", localVarQueryParams, textExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
