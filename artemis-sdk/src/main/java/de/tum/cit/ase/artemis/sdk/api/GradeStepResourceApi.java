package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GradeDTO;
import de.tum.cit.ase.artemis.sdk.model.GradeStep;
import de.tum.cit.ase.artemis.sdk.model.GradeStepsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class GradeStepResourceApi {
  private ApiClient apiClient;

  public GradeStepResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GradeStepResourceApi(ApiClient apiClient) {
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
   * @return GradeStepsDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GradeStepsDTO getAllGradeStepsForCourse(Long courseId) throws ApiException {
    return getAllGradeStepsForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;GradeStepsDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GradeStepsDTO> getAllGradeStepsForCourseWithHttpInfo(Long courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllGradeStepsForCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/grading-scale/grade-steps"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GradeStepsDTO> localVarReturnType = new GenericType<GradeStepsDTO>() {};

    return apiClient.invokeAPI("GradeStepResourceApi.getAllGradeStepsForCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return GradeStepsDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GradeStepsDTO getAllGradeStepsForExam(Long courseId, Long examId) throws ApiException {
    return getAllGradeStepsForExamWithHttpInfo(courseId, examId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @return ApiResponse&lt;GradeStepsDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GradeStepsDTO> getAllGradeStepsForExamWithHttpInfo(Long courseId, Long examId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAllGradeStepsForExam");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getAllGradeStepsForExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/grading-scale/grade-steps"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GradeStepsDTO> localVarReturnType = new GenericType<GradeStepsDTO>() {};

    return apiClient.invokeAPI("GradeStepResourceApi.getAllGradeStepsForExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param gradePercentage  (required)
   * @return GradeDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GradeDTO getGradeStepByPercentageForCourse(Long courseId, Double gradePercentage) throws ApiException {
    return getGradeStepByPercentageForCourseWithHttpInfo(courseId, gradePercentage).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param gradePercentage  (required)
   * @return ApiResponse&lt;GradeDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GradeDTO> getGradeStepByPercentageForCourseWithHttpInfo(Long courseId, Double gradePercentage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getGradeStepByPercentageForCourse");
    }
    
    // verify the required parameter 'gradePercentage' is set
    if (gradePercentage == null) {
      throw new ApiException(400, "Missing the required parameter 'gradePercentage' when calling getGradeStepByPercentageForCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/grading-scale/match-grade-step"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gradePercentage", gradePercentage));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GradeDTO> localVarReturnType = new GenericType<GradeDTO>() {};

    return apiClient.invokeAPI("GradeStepResourceApi.getGradeStepByPercentageForCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param gradePercentage  (required)
   * @return GradeDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GradeDTO getGradeStepByPercentageForExam(Long courseId, Long examId, Double gradePercentage) throws ApiException {
    return getGradeStepByPercentageForExamWithHttpInfo(courseId, examId, gradePercentage).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param gradePercentage  (required)
   * @return ApiResponse&lt;GradeDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GradeDTO> getGradeStepByPercentageForExamWithHttpInfo(Long courseId, Long examId, Double gradePercentage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getGradeStepByPercentageForExam");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getGradeStepByPercentageForExam");
    }
    
    // verify the required parameter 'gradePercentage' is set
    if (gradePercentage == null) {
      throw new ApiException(400, "Missing the required parameter 'gradePercentage' when calling getGradeStepByPercentageForExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/grading-scale/match-grade-step"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gradePercentage", gradePercentage));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GradeDTO> localVarReturnType = new GenericType<GradeDTO>() {};

    return apiClient.invokeAPI("GradeStepResourceApi.getGradeStepByPercentageForExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param gradeStepId  (required)
   * @return GradeStep
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GradeStep getGradeStepsByIdForCourse(Long courseId, Long gradeStepId) throws ApiException {
    return getGradeStepsByIdForCourseWithHttpInfo(courseId, gradeStepId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param gradeStepId  (required)
   * @return ApiResponse&lt;GradeStep&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GradeStep> getGradeStepsByIdForCourseWithHttpInfo(Long courseId, Long gradeStepId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getGradeStepsByIdForCourse");
    }
    
    // verify the required parameter 'gradeStepId' is set
    if (gradeStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'gradeStepId' when calling getGradeStepsByIdForCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/grading-scale/grade-steps/{gradeStepId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "gradeStepId" + "\\}", apiClient.escapeString(gradeStepId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GradeStep> localVarReturnType = new GenericType<GradeStep>() {};

    return apiClient.invokeAPI("GradeStepResourceApi.getGradeStepsByIdForCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param gradeStepId  (required)
   * @return GradeStep
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GradeStep getGradeStepsByIdForExam(Long courseId, Long examId, Long gradeStepId) throws ApiException {
    return getGradeStepsByIdForExamWithHttpInfo(courseId, examId, gradeStepId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param examId  (required)
   * @param gradeStepId  (required)
   * @return ApiResponse&lt;GradeStep&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GradeStep> getGradeStepsByIdForExamWithHttpInfo(Long courseId, Long examId, Long gradeStepId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getGradeStepsByIdForExam");
    }
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getGradeStepsByIdForExam");
    }
    
    // verify the required parameter 'gradeStepId' is set
    if (gradeStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'gradeStepId' when calling getGradeStepsByIdForExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exams/{examId}/grading-scale/grade-steps/{gradeStepId}"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()))
      .replaceAll("\\{" + "gradeStepId" + "\\}", apiClient.escapeString(gradeStepId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GradeStep> localVarReturnType = new GenericType<GradeStep>() {};

    return apiClient.invokeAPI("GradeStepResourceApi.getGradeStepsByIdForExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
