package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExamExerciseStartPreparationStatus;
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.StudentExam;
import de.tum.cit.ase.artemis.sdk.model.StudentExamWithGradeDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class StudentExamResourceApi {
  private ApiClient apiClient;

  public StudentExamResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StudentExamResourceApi(ApiClient apiClient) {
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
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void assessUnsubmittedStudentExamsAndEmptySubmissions(Long courseId, Long examId) throws ApiException {
    assessUnsubmittedStudentExamsAndEmptySubmissionsWithHttpInfo(courseId, examId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> assessUnsubmittedStudentExamsAndEmptySubmissionsWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling assessUnsubmittedStudentExamsAndEmptySubmissions");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling assessUnsubmittedStudentExamsAndEmptySubmissions");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/assess-unsubmitted-and-empty-student-exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("StudentExamResourceApi.assessUnsubmittedStudentExamsAndEmptySubmissions", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExam  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam createTestRun(Long courseId, Long examId, StudentExam studentExam) throws ApiException {
    return createTestRunWithHttpInfo(courseId, examId, studentExam).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExam  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> createTestRunWithHttpInfo(Long courseId, Long examId, StudentExam studentExam) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createTestRun");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling createTestRun");
    }
    if (studentExam == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExam' when calling createTestRun");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/test-run"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.createTestRun", localVarPath, "POST", new ArrayList<>(), studentExam,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param testRunId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteTestRun(Long courseId, Long examId, Long testRunId) throws ApiException {
    deleteTestRunWithHttpInfo(courseId, examId, testRunId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param testRunId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteTestRunWithHttpInfo(Long courseId, Long examId, Long testRunId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteTestRun");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling deleteTestRun");
    }
    if (testRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'testRunId' when calling deleteTestRun");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/test-run/{testRunId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{testRunId}", apiClient.escapeString(testRunId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("StudentExamResourceApi.deleteTestRun", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return List&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<StudentExam> findAllTestRunsForExam(Long courseId, Long examId) throws ApiException {
    return findAllTestRunsForExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;StudentExam&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<StudentExam>> findAllTestRunsForExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling findAllTestRunsForExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling findAllTestRunsForExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/test-runs"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<StudentExam>> localVarReturnType = new GenericType<List<StudentExam>>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.findAllTestRunsForExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ExamExerciseStartPreparationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExamExerciseStartPreparationStatus getExerciseStartStatus(Long courseId, Long examId) throws ApiException {
    return getExerciseStartStatusWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;ExamExerciseStartPreparationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExamExerciseStartPreparationStatus> getExerciseStartStatusWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExerciseStartStatus");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExerciseStartStatus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/start-exercises/status"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExamExerciseStartPreparationStatus> localVarReturnType = new GenericType<ExamExerciseStartPreparationStatus>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getExerciseStartStatus", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return StudentExamWithGradeDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExamWithGradeDTO getStudentExam(Long courseId, Long examId, Long studentExamId) throws ApiException {
    return getStudentExamWithHttpInfo(courseId, examId, studentExamId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return ApiResponse&lt;StudentExamWithGradeDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExamWithGradeDTO> getStudentExamWithHttpInfo(Long courseId, Long examId, Long studentExamId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStudentExam");
    }
    if (studentExamId == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExamId' when calling getStudentExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentExamId}", apiClient.escapeString(studentExamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExamWithGradeDTO> localVarReturnType = new GenericType<StudentExamWithGradeDTO>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getStudentExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam getStudentExamForConduction(Long courseId, Long examId, Long studentExamId) throws ApiException {
    return getStudentExamForConductionWithHttpInfo(courseId, examId, studentExamId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> getStudentExamForConductionWithHttpInfo(Long courseId, Long examId, Long studentExamId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExamForConduction");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStudentExamForConduction");
    }
    if (studentExamId == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExamId' when calling getStudentExamForConduction");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/conduction"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentExamId}", apiClient.escapeString(studentExamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getStudentExamForConduction", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam getStudentExamForSummary(Long courseId, Long examId, Long studentExamId) throws ApiException {
    return getStudentExamForSummaryWithHttpInfo(courseId, examId, studentExamId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> getStudentExamForSummaryWithHttpInfo(Long courseId, Long examId, Long studentExamId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExamForSummary");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStudentExamForSummary");
    }
    if (studentExamId == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExamId' when calling getStudentExamForSummary");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/summary"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentExamId}", apiClient.escapeString(studentExamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getStudentExamForSummary", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param userId  (optional)
   * @return StudentExamWithGradeDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExamWithGradeDTO getStudentExamGradesForSummary(Long courseId, Long examId, Long userId) throws ApiException {
    return getStudentExamGradesForSummaryWithHttpInfo(courseId, examId, userId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param userId  (optional)
   * @return ApiResponse&lt;StudentExamWithGradeDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExamWithGradeDTO> getStudentExamGradesForSummaryWithHttpInfo(Long courseId, Long examId, Long userId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExamGradesForSummary");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStudentExamGradesForSummary");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/grade-summary"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "userId", userId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExamWithGradeDTO> localVarReturnType = new GenericType<StudentExamWithGradeDTO>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getStudentExamGradesForSummary", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<StudentExam> getStudentExamsForCoursePerUser(Long courseId) throws ApiException {
    return getStudentExamsForCoursePerUserWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;StudentExam&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<StudentExam>> getStudentExamsForCoursePerUserWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExamsForCoursePerUser");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/test-exams-per-user"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<StudentExam>> localVarReturnType = new GenericType<List<StudentExam>>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getStudentExamsForCoursePerUser", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Set&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StudentExam> getStudentExamsForExam(Long courseId, Long examId) throws ApiException {
    return getStudentExamsForExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Set&lt;StudentExam&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StudentExam>> getStudentExamsForExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExamsForExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStudentExamsForExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<StudentExam>> localVarReturnType = new GenericType<Set<StudentExam>>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getStudentExamsForExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param testRunId  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam getTestRunForConduction(Long courseId, Long examId, Long testRunId) throws ApiException {
    return getTestRunForConductionWithHttpInfo(courseId, examId, testRunId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param testRunId  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> getTestRunForConductionWithHttpInfo(Long courseId, Long examId, Long testRunId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getTestRunForConduction");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getTestRunForConduction");
    }
    if (testRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'testRunId' when calling getTestRunForConduction");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/test-run/{testRunId}/conduction"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{testRunId}", apiClient.escapeString(testRunId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.getTestRunForConduction", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void startExercises(Long courseId, Long examId) throws ApiException {
    startExercisesWithHttpInfo(courseId, examId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> startExercisesWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling startExercises");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling startExercises");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/start-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("StudentExamResourceApi.startExercises", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam submitStudentExam(Long courseId, Long examId, Long studentExamId) throws ApiException {
    return submitStudentExamWithHttpInfo(courseId, examId, studentExamId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> submitStudentExamWithHttpInfo(Long courseId, Long examId, Long studentExamId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling submitStudentExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling submitStudentExam");
    }
    if (studentExamId == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExamId' when calling submitStudentExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/toggle-to-submitted"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentExamId}", apiClient.escapeString(studentExamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.submitStudentExam", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExam  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam submitStudentExam1(Long courseId, Long examId, StudentExam studentExam) throws ApiException {
    return submitStudentExam1WithHttpInfo(courseId, examId, studentExam).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExam  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> submitStudentExam1WithHttpInfo(Long courseId, Long examId, StudentExam studentExam) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling submitStudentExam1");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling submitStudentExam1");
    }
    if (studentExam == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExam' when calling submitStudentExam1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/submit"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.submitStudentExam1", localVarPath, "POST", new ArrayList<>(), studentExam,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam unsubmitStudentExam(Long courseId, Long examId, Long studentExamId) throws ApiException {
    return unsubmitStudentExamWithHttpInfo(courseId, examId, studentExamId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> unsubmitStudentExamWithHttpInfo(Long courseId, Long examId, Long studentExamId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling unsubmitStudentExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling unsubmitStudentExam");
    }
    if (studentExamId == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExamId' when calling unsubmitStudentExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/toggle-to-unsubmitted"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentExamId}", apiClient.escapeString(studentExamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.unsubmitStudentExam", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @param body  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam updateWorkingTime(Long courseId, Long examId, Long studentExamId, Integer body) throws ApiException {
    return updateWorkingTimeWithHttpInfo(courseId, examId, studentExamId, body).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentExamId  (required)
   * @param body  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> updateWorkingTimeWithHttpInfo(Long courseId, Long examId, Long studentExamId, Integer body) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateWorkingTime");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateWorkingTime");
    }
    if (studentExamId == null) {
      throw new ApiException(400, "Missing the required parameter 'studentExamId' when calling updateWorkingTime");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkingTime");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/{studentExamId}/working-time"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentExamId}", apiClient.escapeString(studentExamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("StudentExamResourceApi.updateWorkingTime", localVarPath, "PATCH", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
