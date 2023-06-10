package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.QuizBatch;
import de.tum.cit.ase.artemis.sdk.model.QuizBatchJoinDTO;
import de.tum.cit.ase.artemis.sdk.model.QuizExercise;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOQuizExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class QuizExerciseResourceApi {
  private ApiClient apiClient;

  public QuizExerciseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuizExerciseResourceApi(ApiClient apiClient) {
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
   * @param quizExerciseId  (required)
   * @return QuizBatch
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizBatch addBatch(Long quizExerciseId) throws ApiException {
    return addBatchWithHttpInfo(quizExerciseId).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return ApiResponse&lt;QuizBatch&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizBatch> addBatchWithHttpInfo(Long quizExerciseId) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling addBatch");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}/add-batch"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<QuizBatch> localVarReturnType = new GenericType<QuizBatch>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.addBatch", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExercise  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise createQuizExercise(QuizExercise quizExercise) throws ApiException {
    return createQuizExerciseWithHttpInfo(quizExercise).getData();
  }

  /**
   * 
   * 
   * @param quizExercise  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> createQuizExerciseWithHttpInfo(QuizExercise quizExercise) throws ApiException {
    // Check required parameters
    if (quizExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExercise' when calling createQuizExercise");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.createQuizExercise", "/api/quiz-exercises", "POST", new ArrayList<>(), quizExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteQuizExercise(Long quizExerciseId) throws ApiException {
    deleteQuizExerciseWithHttpInfo(quizExerciseId);
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteQuizExerciseWithHttpInfo(Long quizExerciseId) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling deleteQuizExercise");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("QuizExerciseResourceApi.deleteQuizExercise", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return SearchResultPageDTOQuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOQuizExercise getAllExercisesOnPage1(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    return getAllExercisesOnPage1WithHttpInfo(search, isCourseFilter, isExamFilter).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return ApiResponse&lt;SearchResultPageDTOQuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOQuizExercise> getAllExercisesOnPage1WithHttpInfo(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExercisesOnPage1");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCourseFilter", isCourseFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isExamFilter", isExamFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOQuizExercise> localVarReturnType = new GenericType<SearchResultPageDTOQuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.getAllExercisesOnPage1", "/api/quiz-exercises", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise getQuizExercise(Long quizExerciseId) throws ApiException {
    return getQuizExerciseWithHttpInfo(quizExerciseId).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> getQuizExerciseWithHttpInfo(Long quizExerciseId) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling getQuizExercise");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.getQuizExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise getQuizExerciseForStudent(Long quizExerciseId) throws ApiException {
    return getQuizExerciseForStudentWithHttpInfo(quizExerciseId).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> getQuizExerciseForStudentWithHttpInfo(Long quizExerciseId) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling getQuizExerciseForStudent");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}/for-student"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.getQuizExerciseForStudent", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<QuizExercise> getQuizExercisesForCourse(Long courseId) throws ApiException {
    return getQuizExercisesForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;QuizExercise&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<QuizExercise>> getQuizExercisesForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getQuizExercisesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/quiz-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<QuizExercise>> localVarReturnType = new GenericType<List<QuizExercise>>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.getQuizExercisesForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @return List&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<QuizExercise> getQuizExercisesForExam(Long examId) throws ApiException {
    return getQuizExercisesForExamWithHttpInfo(examId).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;QuizExercise&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<QuizExercise>> getQuizExercisesForExamWithHttpInfo(Long examId) throws ApiException {
    // Check required parameters
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getQuizExercisesForExam");
    }

    // Path parameters
    String localVarPath = "/api/exams/{examId}/quiz-exercises"
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<QuizExercise>> localVarReturnType = new GenericType<List<QuizExercise>>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.getQuizExercisesForExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param quizExercise  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise importExercise1(Long sourceExerciseId, QuizExercise quizExercise) throws ApiException {
    return importExercise1WithHttpInfo(sourceExerciseId, quizExercise).getData();
  }

  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param quizExercise  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> importExercise1WithHttpInfo(Long sourceExerciseId, QuizExercise quizExercise) throws ApiException {
    // Check required parameters
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importExercise1");
    }
    if (quizExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExercise' when calling importExercise1");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/import/{sourceExerciseId}"
            .replaceAll("\\{sourceExerciseId}", apiClient.escapeString(sourceExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.importExercise1", localVarPath, "POST", new ArrayList<>(), quizExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @param quizBatchJoinDTO  (required)
   * @return QuizBatch
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizBatch joinBatch(Long quizExerciseId, QuizBatchJoinDTO quizBatchJoinDTO) throws ApiException {
    return joinBatchWithHttpInfo(quizExerciseId, quizBatchJoinDTO).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @param quizBatchJoinDTO  (required)
   * @return ApiResponse&lt;QuizBatch&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizBatch> joinBatchWithHttpInfo(Long quizExerciseId, QuizBatchJoinDTO quizBatchJoinDTO) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling joinBatch");
    }
    if (quizBatchJoinDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'quizBatchJoinDTO' when calling joinBatch");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}/join"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizBatch> localVarReturnType = new GenericType<QuizBatch>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.joinBatch", localVarPath, "POST", new ArrayList<>(), quizBatchJoinDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @param action  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise performActionForQuizExercise(Long quizExerciseId, String action) throws ApiException {
    return performActionForQuizExerciseWithHttpInfo(quizExerciseId, action).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @param action  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> performActionForQuizExerciseWithHttpInfo(Long quizExerciseId, String action) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling performActionForQuizExercise");
    }
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling performActionForQuizExercise");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}/{action}"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()))
            .replaceAll("\\{action}", apiClient.escapeString(action));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.performActionForQuizExercise", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @param quizExercise  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise reEvaluateQuizExercise(Long quizExerciseId, QuizExercise quizExercise) throws ApiException {
    return reEvaluateQuizExerciseWithHttpInfo(quizExerciseId, quizExercise).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @param quizExercise  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> reEvaluateQuizExerciseWithHttpInfo(Long quizExerciseId, QuizExercise quizExercise) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling reEvaluateQuizExercise");
    }
    if (quizExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExercise' when calling reEvaluateQuizExercise");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}/re-evaluate"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.reEvaluateQuizExercise", localVarPath, "PUT", new ArrayList<>(), quizExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise recalculateStatistics(Long quizExerciseId) throws ApiException {
    return recalculateStatisticsWithHttpInfo(quizExerciseId).getData();
  }

  /**
   * 
   * 
   * @param quizExerciseId  (required)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> recalculateStatisticsWithHttpInfo(Long quizExerciseId) throws ApiException {
    // Check required parameters
    if (quizExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExerciseId' when calling recalculateStatistics");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizExerciseId}/recalculate-statistics"
            .replaceAll("\\{quizExerciseId}", apiClient.escapeString(quizExerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.recalculateStatistics", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizBatchId  (required)
   * @return QuizBatch
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizBatch startBatch(Long quizBatchId) throws ApiException {
    return startBatchWithHttpInfo(quizBatchId).getData();
  }

  /**
   * 
   * 
   * @param quizBatchId  (required)
   * @return ApiResponse&lt;QuizBatch&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizBatch> startBatchWithHttpInfo(Long quizBatchId) throws ApiException {
    // Check required parameters
    if (quizBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'quizBatchId' when calling startBatch");
    }

    // Path parameters
    String localVarPath = "/api/quiz-exercises/{quizBatchId}/start-batch"
            .replaceAll("\\{quizBatchId}", apiClient.escapeString(quizBatchId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<QuizBatch> localVarReturnType = new GenericType<QuizBatch>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.startBatch", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param quizExercise  (required)
   * @param notificationText  (optional)
   * @return QuizExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizExercise updateQuizExercise(QuizExercise quizExercise, String notificationText) throws ApiException {
    return updateQuizExerciseWithHttpInfo(quizExercise, notificationText).getData();
  }

  /**
   * 
   * 
   * @param quizExercise  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;QuizExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizExercise> updateQuizExerciseWithHttpInfo(QuizExercise quizExercise, String notificationText) throws ApiException {
    // Check required parameters
    if (quizExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'quizExercise' when calling updateQuizExercise");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizExercise> localVarReturnType = new GenericType<QuizExercise>() {};
    return apiClient.invokeAPI("QuizExerciseResourceApi.updateQuizExercise", "/api/quiz-exercises", "PUT", localVarQueryParams, quizExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
