package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.AssessmentUpdate;
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import de.tum.cit.ase.artemis.sdk.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class ModelingAssessmentResourceApi {
  private ApiClient apiClient;

  public ModelingAssessmentResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModelingAssessmentResourceApi(ApiClient apiClient) {
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
   * @param submissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void cancelAssessment1(Long submissionId) throws ApiException {
    cancelAssessment1WithHttpInfo(submissionId);
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelAssessment1WithHttpInfo(Long submissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling cancelAssessment1");
    }
    
    // create path and map variables
    String localVarPath = "/api/modeling-submissions/{submissionId}/cancel-assessment"
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.cancelAssessment1", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param resultId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAssessment2(Long participationId, Long submissionId, Long resultId) throws ApiException {
    deleteAssessment2WithHttpInfo(participationId, submissionId, resultId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param submissionId  (required)
   * @param resultId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAssessment2WithHttpInfo(Long participationId, Long submissionId, Long resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'participationId' is set
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteAssessment2");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling deleteAssessment2");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling deleteAssessment2");
    }
    
    // create path and map variables
    String localVarPath = "/api/participations/{participationId}/modeling-submissions/{submissionId}/results/{resultId}"
      .replaceAll("\\{" + "participationId" + "\\}", apiClient.escapeString(participationId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.deleteAssessment2", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result getAssessmentBySubmissionId(Long submissionId) throws ApiException {
    return getAssessmentBySubmissionIdWithHttpInfo(submissionId).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getAssessmentBySubmissionIdWithHttpInfo(Long submissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getAssessmentBySubmissionId");
    }
    
    // create path and map variables
    String localVarPath = "/api/modeling-submissions/{submissionId}/result"
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.getAssessmentBySubmissionId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionId  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result getModelingExampleAssessment(Long exerciseId, Long submissionId) throws ApiException {
    return getModelingExampleAssessmentWithHttpInfo(exerciseId, submissionId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionId  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getModelingExampleAssessmentWithHttpInfo(Long exerciseId, Long submissionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getModelingExampleAssessment");
    }
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getModelingExampleAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercise/{exerciseId}/modeling-submissions/{submissionId}/example-assessment"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.getModelingExampleAssessment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @param resultId  (required)
   * @param feedback  (required)
   * @param submit  (optional, default to false)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result saveModelingAssessment(Long submissionId, Long resultId, List<Feedback> feedback, Boolean submit) throws ApiException {
    return saveModelingAssessmentWithHttpInfo(submissionId, resultId, feedback, submit).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @param resultId  (required)
   * @param feedback  (required)
   * @param submit  (optional, default to false)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> saveModelingAssessmentWithHttpInfo(Long submissionId, Long resultId, List<Feedback> feedback, Boolean submit) throws ApiException {
    Object localVarPostBody = feedback;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling saveModelingAssessment");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling saveModelingAssessment");
    }
    
    // verify the required parameter 'feedback' is set
    if (feedback == null) {
      throw new ApiException(400, "Missing the required parameter 'feedback' when calling saveModelingAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/modeling-submissions/{submissionId}/result/{resultId}/assessment"
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "submit", submit));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.saveModelingAssessment", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @param feedback  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result saveModelingExampleAssessment(Long exampleSubmissionId, List<Feedback> feedback) throws ApiException {
    return saveModelingExampleAssessmentWithHttpInfo(exampleSubmissionId, feedback).getData();
  }

  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @param feedback  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> saveModelingExampleAssessmentWithHttpInfo(Long exampleSubmissionId, List<Feedback> feedback) throws ApiException {
    Object localVarPostBody = feedback;
    
    // verify the required parameter 'exampleSubmissionId' is set
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling saveModelingExampleAssessment");
    }
    
    // verify the required parameter 'feedback' is set
    if (feedback == null) {
      throw new ApiException(400, "Missing the required parameter 'feedback' when calling saveModelingExampleAssessment");
    }
    
    // create path and map variables
    String localVarPath = "/api/modeling-submissions/{exampleSubmissionId}/example-assessment"
      .replaceAll("\\{" + "exampleSubmissionId" + "\\}", apiClient.escapeString(exampleSubmissionId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.saveModelingExampleAssessment", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param submissionId  (required)
   * @param assessmentUpdate  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Result updateModelingAssessmentAfterComplaint(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    return updateModelingAssessmentAfterComplaintWithHttpInfo(submissionId, assessmentUpdate).getData();
  }

  /**
   * 
   * 
   * @param submissionId  (required)
   * @param assessmentUpdate  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> updateModelingAssessmentAfterComplaintWithHttpInfo(Long submissionId, AssessmentUpdate assessmentUpdate) throws ApiException {
    Object localVarPostBody = assessmentUpdate;
    
    // verify the required parameter 'submissionId' is set
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling updateModelingAssessmentAfterComplaint");
    }
    
    // verify the required parameter 'assessmentUpdate' is set
    if (assessmentUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'assessmentUpdate' when calling updateModelingAssessmentAfterComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/modeling-submissions/{submissionId}/assessment-after-complaint"
      .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};

    return apiClient.invokeAPI("ModelingAssessmentResourceApi.updateModelingAssessmentAfterComplaint", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
