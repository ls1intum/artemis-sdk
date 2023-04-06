package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.PlagiarismCase;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismCaseInfoDTO;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismVerdictDTO;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class PlagiarismCaseResourceApi {
  private ApiClient apiClient;

  public PlagiarismCaseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PlagiarismCaseResourceApi(ApiClient apiClient) {
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
   * @param exerciseId  (required)
   * @return PlagiarismCaseInfoDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PlagiarismCaseInfoDTO getPlagiarismCaseForExerciseForStudent(Long courseId, Long exerciseId) throws ApiException {
    return getPlagiarismCaseForExerciseForStudentWithHttpInfo(courseId, exerciseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @return ApiResponse&lt;PlagiarismCaseInfoDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlagiarismCaseInfoDTO> getPlagiarismCaseForExerciseForStudentWithHttpInfo(Long courseId, Long exerciseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismCaseForExerciseForStudent");
    }
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getPlagiarismCaseForExerciseForStudent");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exercises/{exerciseId}/plagiarism-case"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PlagiarismCaseInfoDTO> localVarReturnType = new GenericType<PlagiarismCaseInfoDTO>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.getPlagiarismCaseForExerciseForStudent", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param plagiarismCaseId  (required)
   * @return PlagiarismCase
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PlagiarismCase getPlagiarismCaseForInstructor(Long courseId, Long plagiarismCaseId) throws ApiException {
    return getPlagiarismCaseForInstructorWithHttpInfo(courseId, plagiarismCaseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param plagiarismCaseId  (required)
   * @return ApiResponse&lt;PlagiarismCase&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlagiarismCase> getPlagiarismCaseForInstructorWithHttpInfo(Long courseId, Long plagiarismCaseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismCaseForInstructor");
    }
    if (plagiarismCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismCaseId' when calling getPlagiarismCaseForInstructor");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-cases/{plagiarismCaseId}/for-instructor"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{plagiarismCaseId}", apiClient.escapeString(plagiarismCaseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PlagiarismCase> localVarReturnType = new GenericType<PlagiarismCase>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.getPlagiarismCaseForInstructor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param plagiarismCaseId  (required)
   * @return PlagiarismCase
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PlagiarismCase getPlagiarismCaseForStudent(Long courseId, Long plagiarismCaseId) throws ApiException {
    return getPlagiarismCaseForStudentWithHttpInfo(courseId, plagiarismCaseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param plagiarismCaseId  (required)
   * @return ApiResponse&lt;PlagiarismCase&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlagiarismCase> getPlagiarismCaseForStudentWithHttpInfo(Long courseId, Long plagiarismCaseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismCaseForStudent");
    }
    if (plagiarismCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismCaseId' when calling getPlagiarismCaseForStudent");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-cases/{plagiarismCaseId}/for-student"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{plagiarismCaseId}", apiClient.escapeString(plagiarismCaseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PlagiarismCase> localVarReturnType = new GenericType<PlagiarismCase>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.getPlagiarismCaseForStudent", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;PlagiarismCase&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<PlagiarismCase> getPlagiarismCasesForCourseForInstructor(Long courseId) throws ApiException {
    return getPlagiarismCasesForCourseForInstructorWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;PlagiarismCase&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<PlagiarismCase>> getPlagiarismCasesForCourseForInstructorWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismCasesForCourseForInstructor");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-cases/for-instructor"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<PlagiarismCase>> localVarReturnType = new GenericType<List<PlagiarismCase>>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.getPlagiarismCasesForCourseForInstructor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return List&lt;PlagiarismCase&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<PlagiarismCase> getPlagiarismCasesForExamForInstructor(Long courseId, Long examId) throws ApiException {
    return getPlagiarismCasesForExamForInstructorWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;PlagiarismCase&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<PlagiarismCase>> getPlagiarismCasesForExamForInstructorWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismCasesForExamForInstructor");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getPlagiarismCasesForExamForInstructor");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/plagiarism-cases/for-instructor"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<PlagiarismCase>> localVarReturnType = new GenericType<List<PlagiarismCase>>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.getPlagiarismCasesForExamForInstructor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @return Map&lt;String, PlagiarismCaseInfoDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, PlagiarismCaseInfoDTO> getPlagiarismCasesForExercisesForStudent(Long courseId, Set<Long> exerciseId) throws ApiException {
    return getPlagiarismCasesForExercisesForStudentWithHttpInfo(courseId, exerciseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Map&lt;String, PlagiarismCaseInfoDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, PlagiarismCaseInfoDTO>> getPlagiarismCasesForExercisesForStudentWithHttpInfo(Long courseId, Set<Long> exerciseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismCasesForExercisesForStudent");
    }
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getPlagiarismCasesForExercisesForStudent");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-cases"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "exerciseId", exerciseId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Map<String, PlagiarismCaseInfoDTO>> localVarReturnType = new GenericType<Map<String, PlagiarismCaseInfoDTO>>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.getPlagiarismCasesForExercisesForStudent", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param plagiarismCaseId  (required)
   * @param plagiarismVerdictDTO  (required)
   * @return PlagiarismCase
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PlagiarismCase savePlagiarismCaseVerdict(Long courseId, Long plagiarismCaseId, PlagiarismVerdictDTO plagiarismVerdictDTO) throws ApiException {
    return savePlagiarismCaseVerdictWithHttpInfo(courseId, plagiarismCaseId, plagiarismVerdictDTO).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param plagiarismCaseId  (required)
   * @param plagiarismVerdictDTO  (required)
   * @return ApiResponse&lt;PlagiarismCase&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlagiarismCase> savePlagiarismCaseVerdictWithHttpInfo(Long courseId, Long plagiarismCaseId, PlagiarismVerdictDTO plagiarismVerdictDTO) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling savePlagiarismCaseVerdict");
    }
    if (plagiarismCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismCaseId' when calling savePlagiarismCaseVerdict");
    }
    if (plagiarismVerdictDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismVerdictDTO' when calling savePlagiarismCaseVerdict");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-cases/{plagiarismCaseId}/verdict"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{plagiarismCaseId}", apiClient.escapeString(plagiarismCaseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<PlagiarismCase> localVarReturnType = new GenericType<PlagiarismCase>() {};
    return apiClient.invokeAPI("PlagiarismCaseResourceApi.savePlagiarismCaseVerdict", localVarPath, "PUT", new ArrayList<>(), plagiarismVerdictDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
