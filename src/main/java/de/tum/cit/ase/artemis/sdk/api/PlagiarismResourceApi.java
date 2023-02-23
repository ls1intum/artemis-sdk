package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.PlagiarismComparisonObject;
import de.tum.cit.ase.artemis.sdk.model.PlagiarismComparisonStatusDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class PlagiarismResourceApi {
  private ApiClient apiClient;

  public PlagiarismResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PlagiarismResourceApi(ApiClient apiClient) {
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
   * @param plagiarismResultId  (required)
   * @param deleteAll  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deletePlagiarismComparisons(Long exerciseId, Long plagiarismResultId, Boolean deleteAll) throws ApiException {
    deletePlagiarismComparisonsWithHttpInfo(exerciseId, plagiarismResultId, deleteAll);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param plagiarismResultId  (required)
   * @param deleteAll  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePlagiarismComparisonsWithHttpInfo(Long exerciseId, Long plagiarismResultId, Boolean deleteAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deletePlagiarismComparisons");
    }
    
    // verify the required parameter 'plagiarismResultId' is set
    if (plagiarismResultId == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismResultId' when calling deletePlagiarismComparisons");
    }
    
    // verify the required parameter 'deleteAll' is set
    if (deleteAll == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteAll' when calling deletePlagiarismComparisons");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/plagiarism-results/{plagiarismResultId}/plagiarism-comparisons"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "plagiarismResultId" + "\\}", apiClient.escapeString(plagiarismResultId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteAll", deleteAll));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("PlagiarismResourceApi.deletePlagiarismComparisons", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param comparisonId  (required)
   * @return PlagiarismComparisonObject
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PlagiarismComparisonObject getPlagiarismComparisonForSplitView(Long courseId, Long comparisonId) throws ApiException {
    return getPlagiarismComparisonForSplitViewWithHttpInfo(courseId, comparisonId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param comparisonId  (required)
   * @return ApiResponse&lt;PlagiarismComparisonObject&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlagiarismComparisonObject> getPlagiarismComparisonForSplitViewWithHttpInfo(Long courseId, Long comparisonId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismComparisonForSplitView");
    }
    
    // verify the required parameter 'comparisonId' is set
    if (comparisonId == null) {
      throw new ApiException(400, "Missing the required parameter 'comparisonId' when calling getPlagiarismComparisonForSplitView");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/plagiarism-comparisons/{comparisonId}/for-split-view"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "comparisonId" + "\\}", apiClient.escapeString(comparisonId.toString()));

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

    GenericType<PlagiarismComparisonObject> localVarReturnType = new GenericType<PlagiarismComparisonObject>() {};

    return apiClient.invokeAPI("PlagiarismResourceApi.getPlagiarismComparisonForSplitView", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param comparisonId  (required)
   * @param plagiarismComparisonStatusDTO  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void updatePlagiarismComparisonStatus(Long courseId, Long comparisonId, PlagiarismComparisonStatusDTO plagiarismComparisonStatusDTO) throws ApiException {
    updatePlagiarismComparisonStatusWithHttpInfo(courseId, comparisonId, plagiarismComparisonStatusDTO);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param comparisonId  (required)
   * @param plagiarismComparisonStatusDTO  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updatePlagiarismComparisonStatusWithHttpInfo(Long courseId, Long comparisonId, PlagiarismComparisonStatusDTO plagiarismComparisonStatusDTO) throws ApiException {
    Object localVarPostBody = plagiarismComparisonStatusDTO;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updatePlagiarismComparisonStatus");
    }
    
    // verify the required parameter 'comparisonId' is set
    if (comparisonId == null) {
      throw new ApiException(400, "Missing the required parameter 'comparisonId' when calling updatePlagiarismComparisonStatus");
    }
    
    // verify the required parameter 'plagiarismComparisonStatusDTO' is set
    if (plagiarismComparisonStatusDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismComparisonStatusDTO' when calling updatePlagiarismComparisonStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/plagiarism-comparisons/{comparisonId}/status"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "comparisonId" + "\\}", apiClient.escapeString(comparisonId.toString()));

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

    return apiClient.invokeAPI("PlagiarismResourceApi.updatePlagiarismComparisonStatus", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
