package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Pageable;
import de.tum.cit.ase.artemis.sdk.model.ParticipantScoreAverageDTO;
import de.tum.cit.ase.artemis.sdk.model.ParticipantScoreDTO;
import de.tum.cit.ase.artemis.sdk.model.ScoreDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
public class ParticipantScoreResourceApi {
  private ApiClient apiClient;

  public ParticipantScoreResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParticipantScoreResourceApi(ApiClient apiClient) {
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
   * @param onlyConsiderRatedScores  (optional, default to true)
   * @return Double
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Double getAverageScoreOfCourse(Long courseId, Boolean onlyConsiderRatedScores) throws ApiException {
    return getAverageScoreOfCourseWithHttpInfo(courseId, onlyConsiderRatedScores).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param onlyConsiderRatedScores  (optional, default to true)
   * @return ApiResponse&lt;Double&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Double> getAverageScoreOfCourseWithHttpInfo(Long courseId, Boolean onlyConsiderRatedScores) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAverageScoreOfCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/participant-scores/average"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyConsiderRatedScores", onlyConsiderRatedScores));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Double> localVarReturnType = new GenericType<Double>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getAverageScoreOfCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @param onlyConsiderRatedScores  (optional, default to true)
   * @return Double
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Double getAverageScoreOfExam(Long examId, Boolean onlyConsiderRatedScores) throws ApiException {
    return getAverageScoreOfExamWithHttpInfo(examId, onlyConsiderRatedScores).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @param onlyConsiderRatedScores  (optional, default to true)
   * @return ApiResponse&lt;Double&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Double> getAverageScoreOfExamWithHttpInfo(Long examId, Boolean onlyConsiderRatedScores) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getAverageScoreOfExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exams/{examId}/participant-scores/average"
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyConsiderRatedScores", onlyConsiderRatedScores));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Double> localVarReturnType = new GenericType<Double>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getAverageScoreOfExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;ParticipantScoreAverageDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ParticipantScoreAverageDTO> getAverageScoreOfParticipantInCourse(Long courseId) throws ApiException {
    return getAverageScoreOfParticipantInCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;ParticipantScoreAverageDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ParticipantScoreAverageDTO>> getAverageScoreOfParticipantInCourseWithHttpInfo(Long courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getAverageScoreOfParticipantInCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/participant-scores/average-participant"
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

    GenericType<List<ParticipantScoreAverageDTO>> localVarReturnType = new GenericType<List<ParticipantScoreAverageDTO>>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getAverageScoreOfParticipantInCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @return List&lt;ParticipantScoreAverageDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ParticipantScoreAverageDTO> getAverageScoreOfParticipantInExam(Long examId) throws ApiException {
    return getAverageScoreOfParticipantInExamWithHttpInfo(examId).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;ParticipantScoreAverageDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ParticipantScoreAverageDTO>> getAverageScoreOfParticipantInExamWithHttpInfo(Long examId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getAverageScoreOfParticipantInExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exams/{examId}/participant-scores/average-participant"
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

    GenericType<List<ParticipantScoreAverageDTO>> localVarReturnType = new GenericType<List<ParticipantScoreAverageDTO>>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getAverageScoreOfParticipantInExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param pageable  (required)
   * @param getUnpaged  (optional, default to false)
   * @return List&lt;ParticipantScoreDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ParticipantScoreDTO> getParticipantScoresOfCourse(Long courseId, Pageable pageable, Boolean getUnpaged) throws ApiException {
    return getParticipantScoresOfCourseWithHttpInfo(courseId, pageable, getUnpaged).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param pageable  (required)
   * @param getUnpaged  (optional, default to false)
   * @return ApiResponse&lt;List&lt;ParticipantScoreDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ParticipantScoreDTO>> getParticipantScoresOfCourseWithHttpInfo(Long courseId, Pageable pageable, Boolean getUnpaged) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getParticipantScoresOfCourse");
    }
    
    // verify the required parameter 'pageable' is set
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getParticipantScoresOfCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/participant-scores"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageable", pageable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "getUnpaged", getUnpaged));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ParticipantScoreDTO>> localVarReturnType = new GenericType<List<ParticipantScoreDTO>>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getParticipantScoresOfCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @param pageable  (required)
   * @param getUnpaged  (optional, default to false)
   * @return List&lt;ParticipantScoreDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ParticipantScoreDTO> getParticipantScoresOfExam(Long examId, Pageable pageable, Boolean getUnpaged) throws ApiException {
    return getParticipantScoresOfExamWithHttpInfo(examId, pageable, getUnpaged).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @param pageable  (required)
   * @param getUnpaged  (optional, default to false)
   * @return ApiResponse&lt;List&lt;ParticipantScoreDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ParticipantScoreDTO>> getParticipantScoresOfExamWithHttpInfo(Long examId, Pageable pageable, Boolean getUnpaged) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getParticipantScoresOfExam");
    }
    
    // verify the required parameter 'pageable' is set
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getParticipantScoresOfExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exams/{examId}/participant-scores"
      .replaceAll("\\{" + "examId" + "\\}", apiClient.escapeString(examId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageable", pageable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "getUnpaged", getUnpaged));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ParticipantScoreDTO>> localVarReturnType = new GenericType<List<ParticipantScoreDTO>>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getParticipantScoresOfExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;ScoreDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ScoreDTO> getScoresOfCourse(Long courseId) throws ApiException {
    return getScoresOfCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;ScoreDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ScoreDTO>> getScoresOfCourseWithHttpInfo(Long courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getScoresOfCourse");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/course-scores"
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

    GenericType<List<ScoreDTO>> localVarReturnType = new GenericType<List<ScoreDTO>>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getScoresOfCourse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examId  (required)
   * @return List&lt;ScoreDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ScoreDTO> getScoresOfExam(Long examId) throws ApiException {
    return getScoresOfExamWithHttpInfo(examId).getData();
  }

  /**
   * 
   * 
   * @param examId  (required)
   * @return ApiResponse&lt;List&lt;ScoreDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ScoreDTO>> getScoresOfExamWithHttpInfo(Long examId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'examId' is set
    if (examId == null) {
      throw new ApiException(400, "Missing the required parameter 'examId' when calling getScoresOfExam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exams/{examId}/exam-scores"
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

    GenericType<List<ScoreDTO>> localVarReturnType = new GenericType<List<ScoreDTO>>() {};

    return apiClient.invokeAPI("ParticipantScoreResourceApi.getScoresOfExam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
