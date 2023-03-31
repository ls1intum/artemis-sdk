package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Complaint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ComplaintResourceApi {
  private ApiClient apiClient;

  public ComplaintResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ComplaintResourceApi(ApiClient apiClient) {
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
   * @param complaint  (required)
   * @return Complaint
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Complaint createComplaint(Complaint complaint) throws ApiException {
    return createComplaintWithHttpInfo(complaint).getData();
  }

  /**
   * 
   * 
   * @param complaint  (required)
   * @return ApiResponse&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Complaint> createComplaintWithHttpInfo(Complaint complaint) throws ApiException {
    // Check required parameters
    if (complaint == null) {
      throw new ApiException(400, "Missing the required parameter 'complaint' when calling createComplaint");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Complaint> localVarReturnType = new GenericType<Complaint>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.createComplaint", "/api/complaints", "POST", new ArrayList<>(), complaint,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @param complaint  (required)
   * @return Complaint
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Complaint createComplaintForExamExercise(Long examId, Complaint complaint) throws ApiException {
    return createComplaintForExamExerciseWithHttpInfo(examId, complaint).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @param complaint  (required)
   * @return ApiResponse&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Complaint> createComplaintForExamExerciseWithHttpInfo(Long examId, Complaint complaint) throws ApiException {
    // Check required parameters
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling createComplaintForExamExercise");
    }
    if (complaint == null) {
      throw new ApiException(400, "Missing the required parameter 'complaint' when calling createComplaintForExamExercise");
    }

    // Path parameters
    String localVarPath = "/api/complaints/exam/{examId}"
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Complaint> localVarReturnType = new GenericType<Complaint>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.createComplaintForExamExercise", localVarPath, "POST", new ArrayList<>(), complaint,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @return Complaint
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Complaint getComplaintBySubmissionId(Long submissionId) throws ApiException {
    return getComplaintBySubmissionIdWithHttpInfo(submissionId).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @return ApiResponse&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Complaint> getComplaintBySubmissionIdWithHttpInfo(Long submissionId) throws ApiException {
    // Check required parameters
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getComplaintBySubmissionId");
    }

    // Path parameters
    String localVarPath = "/api/complaints/submissions/{submissionId}"
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Complaint> localVarReturnType = new GenericType<Complaint>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getComplaintBySubmissionId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param complaintType  (required)
   * @param tutorId  (optional)
   * @param allComplaintsForTutor  (optional)
   * @return List&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Complaint> getComplaintsByCourseId(Long courseId, String complaintType, Long tutorId, Boolean allComplaintsForTutor) throws ApiException {
    return getComplaintsByCourseIdWithHttpInfo(courseId, complaintType, tutorId, allComplaintsForTutor).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param complaintType  (required)
   * @param tutorId  (optional)
   * @param allComplaintsForTutor  (optional)
   * @return ApiResponse&lt;List&lt;Complaint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Complaint>> getComplaintsByCourseIdWithHttpInfo(Long courseId, String complaintType, Long tutorId, Boolean allComplaintsForTutor) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getComplaintsByCourseId");
    }
    if (complaintType == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintType' when calling getComplaintsByCourseId");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/complaints"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "complaintType", complaintType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tutorId", tutorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allComplaintsForTutor", allComplaintsForTutor));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Complaint>> localVarReturnType = new GenericType<List<Complaint>>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getComplaintsByCourseId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return List&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Complaint> getComplaintsByCourseIdAndExamId(Long courseId, Long examId) throws ApiException {
    return getComplaintsByCourseIdAndExamIdWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;Complaint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Complaint>> getComplaintsByCourseIdAndExamIdWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getComplaintsByCourseIdAndExamId");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getComplaintsByCourseIdAndExamId");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/complaints"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Complaint>> localVarReturnType = new GenericType<List<Complaint>>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getComplaintsByCourseIdAndExamId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param complaintType  (required)
   * @param tutorId  (optional)
   * @return List&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Complaint> getComplaintsByExerciseId(Long exerciseId, String complaintType, Long tutorId) throws ApiException {
    return getComplaintsByExerciseIdWithHttpInfo(exerciseId, complaintType, tutorId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param complaintType  (required)
   * @param tutorId  (optional)
   * @return ApiResponse&lt;List&lt;Complaint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Complaint>> getComplaintsByExerciseIdWithHttpInfo(Long exerciseId, String complaintType, Long tutorId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getComplaintsByExerciseId");
    }
    if (complaintType == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintType' when calling getComplaintsByExerciseId");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/complaints"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "complaintType", complaintType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tutorId", tutorId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Complaint>> localVarReturnType = new GenericType<List<Complaint>>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getComplaintsByExerciseId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Complaint> getComplaintsForTestRunDashboard(Long exerciseId) throws ApiException {
    return getComplaintsForTestRunDashboardWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;Complaint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Complaint>> getComplaintsForTestRunDashboardWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getComplaintsForTestRunDashboard");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/complaints-for-test-run-dashboard"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Complaint>> localVarReturnType = new GenericType<List<Complaint>>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getComplaintsForTestRunDashboard", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param complaintType  (required)
   * @return List&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Complaint> getComplaintsForTutor(String complaintType) throws ApiException {
    return getComplaintsForTutorWithHttpInfo(complaintType).getData();
  }

  /**
   * 
   * 
   * @param complaintType  (required)
   * @return ApiResponse&lt;List&lt;Complaint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Complaint>> getComplaintsForTutorWithHttpInfo(String complaintType) throws ApiException {
    // Check required parameters
    if (complaintType == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintType' when calling getComplaintsForTutor");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "complaintType", complaintType)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Complaint>> localVarReturnType = new GenericType<List<Complaint>>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getComplaintsForTutor", "/api/complaints", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;Complaint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Complaint> getMoreFeedbackRequestsForAssessmentDashboard(Long exerciseId) throws ApiException {
    return getMoreFeedbackRequestsForAssessmentDashboardWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;Complaint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Complaint>> getMoreFeedbackRequestsForAssessmentDashboardWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getMoreFeedbackRequestsForAssessmentDashboard");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/more-feedback-for-assessment-dashboard"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Complaint>> localVarReturnType = new GenericType<List<Complaint>>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getMoreFeedbackRequestsForAssessmentDashboard", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param teamMode  (optional, default to false)
   * @return Long
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Long getNumberOfAllowedComplaintsInCourse(Long courseId, Boolean teamMode) throws ApiException {
    return getNumberOfAllowedComplaintsInCourseWithHttpInfo(courseId, teamMode).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param teamMode  (optional, default to false)
   * @return ApiResponse&lt;Long&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Long> getNumberOfAllowedComplaintsInCourseWithHttpInfo(Long courseId, Boolean teamMode) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getNumberOfAllowedComplaintsInCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/allowed-complaints"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "teamMode", teamMode)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI("ComplaintResourceApi.getNumberOfAllowedComplaintsInCourse", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
