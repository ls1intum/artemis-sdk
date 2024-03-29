package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExamUser;
import de.tum.cit.ase.artemis.sdk.model.ExamUserAttendanceCheckDTO;
import de.tum.cit.ase.artemis.sdk.model.ExamUsersNotFoundDTO;
import de.tum.cit.ase.artemis.sdk.model.SaveMarkdownFileRequest;
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.UpdateExamUserRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ExamUserResourceApi {
  private ApiClient apiClient;

  public ExamUserResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExamUserResourceApi(ApiClient apiClient) {
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
   * @return Set&lt;ExamUserAttendanceCheckDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<ExamUserAttendanceCheckDTO> getAllWhoDidNotSign(Long courseId, Long examId) throws ApiException {
    return getAllWhoDidNotSignWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;Set&lt;ExamUserAttendanceCheckDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<ExamUserAttendanceCheckDTO>> getAllWhoDidNotSignWithHttpInfo(Long courseId, Long examId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllWhoDidNotSign");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getAllWhoDidNotSign");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/verify-exam-users"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<ExamUserAttendanceCheckDTO>> localVarReturnType = new GenericType<Set<ExamUserAttendanceCheckDTO>>() {};
    return apiClient.invokeAPI("ExamUserResourceApi.getAllWhoDidNotSign", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param saveMarkdownFileRequest  (optional)
   * @return ExamUsersNotFoundDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExamUsersNotFoundDTO saveUsersImages(Long courseId, Long examId, SaveMarkdownFileRequest saveMarkdownFileRequest) throws ApiException {
    return saveUsersImagesWithHttpInfo(courseId, examId, saveMarkdownFileRequest).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param saveMarkdownFileRequest  (optional)
   * @return ApiResponse&lt;ExamUsersNotFoundDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExamUsersNotFoundDTO> saveUsersImagesWithHttpInfo(Long courseId, Long examId, SaveMarkdownFileRequest saveMarkdownFileRequest) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling saveUsersImages");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling saveUsersImages");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exam-users-save-images"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExamUsersNotFoundDTO> localVarReturnType = new GenericType<ExamUsersNotFoundDTO>() {};
    return apiClient.invokeAPI("ExamUserResourceApi.saveUsersImages", localVarPath, "POST", new ArrayList<>(), saveMarkdownFileRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param updateExamUserRequest  (optional)
   * @return ExamUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExamUser updateExamUser(Long courseId, Long examId, UpdateExamUserRequest updateExamUserRequest) throws ApiException {
    return updateExamUserWithHttpInfo(courseId, examId, updateExamUserRequest).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param updateExamUserRequest  (optional)
   * @return ApiResponse&lt;ExamUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExamUser> updateExamUserWithHttpInfo(Long courseId, Long examId, UpdateExamUserRequest updateExamUserRequest) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateExamUser");
    }
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling updateExamUser");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/exam-users"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{examId}", apiClient.escapeString(examId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExamUser> localVarReturnType = new GenericType<ExamUser>() {};
    return apiClient.invokeAPI("ExamUserResourceApi.updateExamUser", localVarPath, "POST", new ArrayList<>(), updateExamUserRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
