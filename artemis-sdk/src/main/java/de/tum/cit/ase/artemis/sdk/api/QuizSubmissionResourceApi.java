package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.QuizSubmission;
import de.tum.cit.ase.artemis.sdk.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class QuizSubmissionResourceApi {
  private ApiClient apiClient;

  public QuizSubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuizSubmissionResourceApi(ApiClient apiClient) {
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
   * @param quizSubmission  (required)
   * @return QuizSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizSubmission submitForLiveMode(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    return submitForLiveModeWithHttpInfo(exerciseId, quizSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return ApiResponse&lt;QuizSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizSubmission> submitForLiveModeWithHttpInfo(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling submitForLiveMode");
    }
    if (quizSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'quizSubmission' when calling submitForLiveMode");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/submissions/live"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizSubmission> localVarReturnType = new GenericType<QuizSubmission>() {};
    return apiClient.invokeAPI("QuizSubmissionResourceApi.submitForLiveMode", localVarPath, "POST", new ArrayList<>(), quizSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result submitForPractice(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    return submitForPracticeWithHttpInfo(exerciseId, quizSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> submitForPracticeWithHttpInfo(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling submitForPractice");
    }
    if (quizSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'quizSubmission' when calling submitForPractice");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/submissions/practice"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("QuizSubmissionResourceApi.submitForPractice", localVarPath, "POST", new ArrayList<>(), quizSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result submitForPreview(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    return submitForPreviewWithHttpInfo(exerciseId, quizSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> submitForPreviewWithHttpInfo(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling submitForPreview");
    }
    if (quizSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'quizSubmission' when calling submitForPreview");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/submissions/preview"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("QuizSubmissionResourceApi.submitForPreview", localVarPath, "POST", new ArrayList<>(), quizSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return QuizSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public QuizSubmission submitQuizForExam(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    return submitQuizForExamWithHttpInfo(exerciseId, quizSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param quizSubmission  (required)
   * @return ApiResponse&lt;QuizSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QuizSubmission> submitQuizForExamWithHttpInfo(Long exerciseId, QuizSubmission quizSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling submitQuizForExam");
    }
    if (quizSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'quizSubmission' when calling submitQuizForExam");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/submissions/exam"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<QuizSubmission> localVarReturnType = new GenericType<QuizSubmission>() {};
    return apiClient.invokeAPI("QuizSubmissionResourceApi.submitQuizForExam", localVarPath, "PUT", new ArrayList<>(), quizSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
