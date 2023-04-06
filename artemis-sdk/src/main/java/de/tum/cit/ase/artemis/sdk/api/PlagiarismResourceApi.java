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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
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
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deletePlagiarismComparisons");
    }
    if (plagiarismResultId == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismResultId' when calling deletePlagiarismComparisons");
    }
    if (deleteAll == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteAll' when calling deletePlagiarismComparisons");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/plagiarism-results/{plagiarismResultId}/plagiarism-comparisons"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{plagiarismResultId}", apiClient.escapeString(plagiarismResultId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteAll", deleteAll)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("PlagiarismResourceApi.deletePlagiarismComparisons", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getPlagiarismComparisonForSplitView");
    }
    if (comparisonId == null) {
      throw new ApiException(400, "Missing the required parameter 'comparisonId' when calling getPlagiarismComparisonForSplitView");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-comparisons/{comparisonId}/for-split-view"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{comparisonId}", apiClient.escapeString(comparisonId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PlagiarismComparisonObject> localVarReturnType = new GenericType<PlagiarismComparisonObject>() {};
    return apiClient.invokeAPI("PlagiarismResourceApi.getPlagiarismComparisonForSplitView", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updatePlagiarismComparisonStatus");
    }
    if (comparisonId == null) {
      throw new ApiException(400, "Missing the required parameter 'comparisonId' when calling updatePlagiarismComparisonStatus");
    }
    if (plagiarismComparisonStatusDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'plagiarismComparisonStatusDTO' when calling updatePlagiarismComparisonStatus");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/plagiarism-comparisons/{comparisonId}/status"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{comparisonId}", apiClient.escapeString(comparisonId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("PlagiarismResourceApi.updatePlagiarismComparisonStatus", localVarPath, "PUT", new ArrayList<>(), plagiarismComparisonStatusDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
