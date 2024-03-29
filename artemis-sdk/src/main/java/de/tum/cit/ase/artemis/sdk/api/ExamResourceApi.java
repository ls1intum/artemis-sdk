package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Exam;
import de.tum.cit.ase.artemis.sdk.model.ExamChecklistDTO;
import de.tum.cit.ase.artemis.sdk.model.ExamInformationDTO;
import de.tum.cit.ase.artemis.sdk.model.ExamScoresDTO;
import de.tum.cit.ase.artemis.sdk.model.ExamUserDTO;
import de.tum.cit.ase.artemis.sdk.model.ExerciseGroup;
import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.Pageable;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOExam;
import de.tum.cit.ase.artemis.sdk.model.StatsForDashboardDTO;
import de.tum.cit.ase.artemis.sdk.model.StudentDTO;
import de.tum.cit.ase.artemis.sdk.model.StudentExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ExamResourceApi {
  private ApiClient apiClient;

  public ExamResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExamResourceApi(ApiClient apiClient) {
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
   * @param studentLogin  (required)
   * @return StudentDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentDTO addStudentToExam(Long courseId, Long examId, String studentLogin) throws ApiException {
    return addStudentToExamWithHttpInfo(courseId, examId, studentLogin).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentLogin  (required)
   * @return ApiResponse&lt;StudentDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentDTO> addStudentToExamWithHttpInfo(Long courseId, Long examId, String studentLogin) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling addStudentToExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling addStudentToExam");
    }
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling addStudentToExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/students/{studentLogin}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentLogin}", apiClient.escapeString(studentLogin));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentDTO> localVarReturnType = new GenericType<StudentDTO>() {};
    return apiClient.invokeAPI("ExamResourceApi.addStudentToExam", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param examUserDTO  (required)
   * @return List&lt;ExamUserDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ExamUserDTO> addStudentsToExam(Long courseId, Long examId, List<ExamUserDTO> examUserDTO) throws ApiException {
    return addStudentsToExamWithHttpInfo(courseId, examId, examUserDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param examUserDTO  (required)
   * @return ApiResponse&lt;List&lt;ExamUserDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ExamUserDTO>> addStudentsToExamWithHttpInfo(Long courseId, Long examId, List<ExamUserDTO> examUserDTO) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling addStudentsToExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling addStudentsToExam");
    }
    if (examUserDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'examUserDTO' when calling addStudentsToExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/students"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<ExamUserDTO>> localVarReturnType = new GenericType<List<ExamUserDTO>>() {};
    return apiClient.invokeAPI("ExamResourceApi.addStudentsToExam", localVarPath, "POST", new ArrayList<>(), examUserDTO,
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
  public void archiveExam(Long courseId, Long examId) throws ApiException {
    archiveExamWithHttpInfo(courseId, examId);
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
  public ApiResponse<Void> archiveExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling archiveExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling archiveExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/archive"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExamResourceApi.archiveExam", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param exam  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam createExam(Long courseId, Exam exam) throws ApiException {
    return createExamWithHttpInfo(courseId, exam).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exam  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> createExamWithHttpInfo(Long courseId, Exam exam) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createExam");
    }
    if (exam == null) {
      throw new ApiException(400, "Missing the required parameter 'exam' when calling createExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.createExam", localVarPath, "POST", new ArrayList<>(), exam,
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
  public void deleteExam(Long courseId, Long examId) throws ApiException {
    deleteExamWithHttpInfo(courseId, examId);
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
  public ApiResponse<Void> deleteExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling deleteExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExamResourceApi.deleteExam", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File downloadExamArchive(Long courseId, Long examId) throws ApiException {
    return downloadExamArchiveWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadExamArchiveWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling downloadExamArchive");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling downloadExamArchive");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/download-archive"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ExamResourceApi.downloadExamArchive", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Integer evaluateQuizExercises(Long courseId, Long examId) throws ApiException {
    return evaluateQuizExercisesWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> evaluateQuizExercisesWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling evaluateQuizExercises");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling evaluateQuizExercises");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/evaluate-quiz-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("ExamResourceApi.evaluateQuizExercises", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
  public List<StudentExam> generateMissingStudentExams(Long courseId, Long examId) throws ApiException {
    return generateMissingStudentExamsWithHttpInfo(courseId, examId).getData();
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
  public ApiResponse<List<StudentExam>> generateMissingStudentExamsWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling generateMissingStudentExams");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling generateMissingStudentExams");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/generate-missing-student-exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<StudentExam>> localVarReturnType = new GenericType<List<StudentExam>>() {};
    return apiClient.invokeAPI("ExamResourceApi.generateMissingStudentExams", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
  public List<StudentExam> generateStudentExams(Long courseId, Long examId) throws ApiException {
    return generateStudentExamsWithHttpInfo(courseId, examId).getData();
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
  public ApiResponse<List<StudentExam>> generateStudentExamsWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling generateStudentExams");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling generateStudentExams");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/generate-student-exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<StudentExam>> localVarReturnType = new GenericType<List<StudentExam>>() {};
    return apiClient.invokeAPI("ExamResourceApi.generateStudentExams", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param pageable  (required)
   * @return List&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Exam> getAllActiveExams(Pageable pageable) throws ApiException {
    return getAllActiveExamsWithHttpInfo(pageable).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @return ApiResponse&lt;List&lt;Exam&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Exam>> getAllActiveExamsWithHttpInfo(Pageable pageable) throws ApiException {
    // Check required parameters
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getAllActiveExams");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "pageable", pageable)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Exam>> localVarReturnType = new GenericType<List<Exam>>() {};
    return apiClient.invokeAPI("ExamResourceApi.getAllActiveExams", "/api/exams/active", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param withExercises  (optional, default to false)
   * @return SearchResultPageDTOExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOExam getAllExamsOnPage(PageableSearchDTOString search, Boolean withExercises) throws ApiException {
    return getAllExamsOnPageWithHttpInfo(search, withExercises).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param withExercises  (optional, default to false)
   * @return ApiResponse&lt;SearchResultPageDTOExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOExam> getAllExamsOnPageWithHttpInfo(PageableSearchDTOString search, Boolean withExercises) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExamsOnPage");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withExercises", withExercises)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOExam> localVarReturnType = new GenericType<SearchResultPageDTOExam>() {};
    return apiClient.invokeAPI("ExamResourceApi.getAllExamsOnPage", "/api/exams", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param withStudents  (optional, default to false)
   * @param withExerciseGroups  (optional, default to false)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam getExam(Long courseId, Long examId, Boolean withStudents, Boolean withExerciseGroups) throws ApiException {
    return getExamWithHttpInfo(courseId, examId, withStudents, withExerciseGroups).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param withStudents  (optional, default to false)
   * @param withExerciseGroups  (optional, default to false)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> getExamWithHttpInfo(Long courseId, Long examId, Boolean withStudents, Boolean withExerciseGroups) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withStudents", withStudents)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withExerciseGroups", withExerciseGroups));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExam", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam getExamForAssessmentDashboard(Long courseId, Long examId) throws ApiException {
    return getExamForAssessmentDashboardWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> getExamForAssessmentDashboardWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExamForAssessmentDashboard");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExamForAssessmentDashboard");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exam-for-assessment-dashboard"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamForAssessmentDashboard", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam getExamForImportWithExercises(Long examId) throws ApiException {
    return getExamForImportWithExercisesWithHttpInfo(examId).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> getExamForImportWithExercisesWithHttpInfo(Long examId) throws ApiException {
    // Check required parameters
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExamForImportWithExercises");
    }

    // Path parameters
    String localVarPath = "/api/exams/{examId}"
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamForImportWithExercises", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam getExamForTestRunAssessmentDashboard(Long courseId, Long examId) throws ApiException {
    return getExamForTestRunAssessmentDashboardWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> getExamForTestRunAssessmentDashboardWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExamForTestRunAssessmentDashboard");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExamForTestRunAssessmentDashboard");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exam-for-test-run-assessment-dashboard"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamForTestRunAssessmentDashboard", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ExamScoresDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExamScoresDTO getExamScore(Long courseId, Long examId) throws ApiException {
    return getExamScoreWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;ExamScoresDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExamScoresDTO> getExamScoreWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExamScore");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExamScore");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/scores"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExamScoresDTO> localVarReturnType = new GenericType<ExamScoresDTO>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamScore", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ExamChecklistDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExamChecklistDTO getExamStatistics(Long courseId, Long examId) throws ApiException {
    return getExamStatisticsWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;ExamChecklistDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExamChecklistDTO> getExamStatisticsWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExamStatistics");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExamStatistics");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/statistics"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExamChecklistDTO> localVarReturnType = new GenericType<ExamChecklistDTO>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamStatistics", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getExamTitle(Long examId) throws ApiException {
    return getExamTitleWithHttpInfo(examId).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getExamTitleWithHttpInfo(Long examId) throws ApiException {
    // Check required parameters
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getExamTitle");
    }

    // Path parameters
    String localVarPath = "/api/exams/{examId}/title"
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Exam> getExamsForCourse(Long courseId) throws ApiException {
    return getExamsForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;Exam&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Exam>> getExamsForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExamsForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Exam>> localVarReturnType = new GenericType<List<Exam>>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamsForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Exam> getExamsWithQuizExercisesForUser(Long courseId) throws ApiException {
    return getExamsWithQuizExercisesForUserWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;Exam&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Exam>> getExamsWithQuizExercisesForUserWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getExamsWithQuizExercisesForUser");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams-for-user"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Exam>> localVarReturnType = new GenericType<List<Exam>>() {};
    return apiClient.invokeAPI("ExamResourceApi.getExamsWithQuizExercisesForUser", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ExamInformationDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExamInformationDTO getLatestIndividualEndDateOfExam(Long courseId, Long examId) throws ApiException {
    return getLatestIndividualEndDateOfExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;ExamInformationDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExamInformationDTO> getLatestIndividualEndDateOfExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLatestIndividualEndDateOfExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getLatestIndividualEndDateOfExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/latest-end-date"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExamInformationDTO> localVarReturnType = new GenericType<ExamInformationDTO>() {};
    return apiClient.invokeAPI("ExamResourceApi.getLatestIndividualEndDateOfExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return List&lt;GetAllTextSubmissions200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<GetAllTextSubmissions200ResponseInner> getLockedSubmissionsForExam(Long courseId, Long examId) throws ApiException {
    return getLockedSubmissionsForExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;GetAllTextSubmissions200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<GetAllTextSubmissions200ResponseInner>> getLockedSubmissionsForExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getLockedSubmissionsForExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getLockedSubmissionsForExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/lockedSubmissions"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<GetAllTextSubmissions200ResponseInner>> localVarReturnType = new GenericType<List<GetAllTextSubmissions200ResponseInner>>() {};
    return apiClient.invokeAPI("ExamResourceApi.getLockedSubmissionsForExam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return StatsForDashboardDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StatsForDashboardDTO getStatsForExamAssessmentDashboard(Long courseId, Long examId) throws ApiException {
    return getStatsForExamAssessmentDashboardWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;StatsForDashboardDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StatsForDashboardDTO> getStatsForExamAssessmentDashboardWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStatsForExamAssessmentDashboard");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStatsForExamAssessmentDashboard");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/stats-for-exam-assessment-dashboard"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StatsForDashboardDTO> localVarReturnType = new GenericType<StatsForDashboardDTO>() {};
    return apiClient.invokeAPI("ExamResourceApi.getStatsForExamAssessmentDashboard", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return StudentExam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public StudentExam getStudentExamForStart(Long courseId, Long examId) throws ApiException {
    return getStudentExamForStartWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;StudentExam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StudentExam> getStudentExamForStartWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getStudentExamForStart");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getStudentExamForStart");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/start"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<StudentExam> localVarReturnType = new GenericType<StudentExam>() {};
    return apiClient.invokeAPI("ExamResourceApi.getStudentExamForStart", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param exam  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam importExamWithExercises(Long courseId, Exam exam) throws ApiException {
    return importExamWithExercisesWithHttpInfo(courseId, exam).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exam  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> importExamWithExercisesWithHttpInfo(Long courseId, Exam exam) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importExamWithExercises");
    }
    if (exam == null) {
      throw new ApiException(400, "Missing the required parameter 'exam' when calling importExamWithExercises");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exam-import"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.importExamWithExercises", localVarPath, "POST", new ArrayList<>(), exam,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Integer lockAllRepositories1(Long courseId, Long examId) throws ApiException {
    return lockAllRepositories1WithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> lockAllRepositories1WithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling lockAllRepositories1");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling lockAllRepositories1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/lock-all-repositories"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("ExamResourceApi.lockAllRepositories1", localVarPath, "POST", new ArrayList<>(), null,
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
  public void registerCourseStudents(Long courseId, Long examId) throws ApiException {
    registerCourseStudentsWithHttpInfo(courseId, examId);
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
  public ApiResponse<Void> registerCourseStudentsWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling registerCourseStudents");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling registerCourseStudents");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/register-course-students"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExamResourceApi.registerCourseStudents", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param withParticipationsAndSubmission  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeAllStudentsFromExam(Long courseId, Long examId, Boolean withParticipationsAndSubmission) throws ApiException {
    removeAllStudentsFromExamWithHttpInfo(courseId, examId, withParticipationsAndSubmission);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param withParticipationsAndSubmission  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeAllStudentsFromExamWithHttpInfo(Long courseId, Long examId, Boolean withParticipationsAndSubmission) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removeAllStudentsFromExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling removeAllStudentsFromExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/students"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withParticipationsAndSubmission", withParticipationsAndSubmission)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExamResourceApi.removeAllStudentsFromExam", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentLogin  (required)
   * @param withParticipationsAndSubmission  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeStudentFromExam(Long courseId, Long examId, String studentLogin, Boolean withParticipationsAndSubmission) throws ApiException {
    removeStudentFromExamWithHttpInfo(courseId, examId, studentLogin, withParticipationsAndSubmission);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param studentLogin  (required)
   * @param withParticipationsAndSubmission  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeStudentFromExamWithHttpInfo(Long courseId, Long examId, String studentLogin, Boolean withParticipationsAndSubmission) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removeStudentFromExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling removeStudentFromExam");
    }
    if (studentLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'studentLogin' when calling removeStudentFromExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/students/{studentLogin}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()))
            .replaceAll("\\{studentLogin}", apiClient.escapeString(studentLogin));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withParticipationsAndSubmission", withParticipationsAndSubmission)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExamResourceApi.removeStudentFromExam", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam resetExam(Long courseId, Long examId) throws ApiException {
    return resetExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> resetExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling resetExam");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling resetExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/reset"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.resetExam", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Integer unlockAllRepositories1(Long courseId, Long examId) throws ApiException {
    return unlockAllRepositories1WithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> unlockAllRepositories1WithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling unlockAllRepositories1");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling unlockAllRepositories1");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/student-exams/unlock-all-repositories"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("ExamResourceApi.unlockAllRepositories1", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param exam  (required)
   * @return Exam
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Exam updateExam(Long courseId, Exam exam) throws ApiException {
    return updateExamWithHttpInfo(courseId, exam).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exam  (required)
   * @return ApiResponse&lt;Exam&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Exam> updateExamWithHttpInfo(Long courseId, Exam exam) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateExam");
    }
    if (exam == null) {
      throw new ApiException(400, "Missing the required parameter 'exam' when calling updateExam");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Exam> localVarReturnType = new GenericType<Exam>() {};
    return apiClient.invokeAPI("ExamResourceApi.updateExam", localVarPath, "PUT", new ArrayList<>(), exam,
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
  public List<ExerciseGroup> updateOrderOfExerciseGroups(Long courseId, Long examId, List<ExerciseGroup> exerciseGroup) throws ApiException {
    return updateOrderOfExerciseGroupsWithHttpInfo(courseId, examId, exerciseGroup).getData();
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
  public ApiResponse<List<ExerciseGroup>> updateOrderOfExerciseGroupsWithHttpInfo(Long courseId, Long examId, List<ExerciseGroup> exerciseGroup) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateOrderOfExerciseGroups");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateOrderOfExerciseGroups");
    }
    if (exerciseGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseGroup' when calling updateOrderOfExerciseGroups");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exercise-groups-order"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<ExerciseGroup>> localVarReturnType = new GenericType<List<ExerciseGroup>>() {};
    return apiClient.invokeAPI("ExamResourceApi.updateOrderOfExerciseGroups", localVarPath, "PUT", new ArrayList<>(), exerciseGroup,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
