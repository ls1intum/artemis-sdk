package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.StaticCodeAnalysisCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class StaticCodeAnalysisResourceApi {
  private ApiClient apiClient;

  public StaticCodeAnalysisResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StaticCodeAnalysisResourceApi(ApiClient apiClient) {
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
   * @return Set&lt;StaticCodeAnalysisCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StaticCodeAnalysisCategory> getStaticCodeAnalysisCategories(Long exerciseId) throws ApiException {
    return getStaticCodeAnalysisCategoriesWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;StaticCodeAnalysisCategory&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StaticCodeAnalysisCategory>> getStaticCodeAnalysisCategoriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getStaticCodeAnalysisCategories");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/static-code-analysis-categories"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<StaticCodeAnalysisCategory>> localVarReturnType = new GenericType<Set<StaticCodeAnalysisCategory>>() {};
    return apiClient.invokeAPI("StaticCodeAnalysisResourceApi.getStaticCodeAnalysisCategories", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param sourceExerciseId  (required)
   * @return Set&lt;StaticCodeAnalysisCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StaticCodeAnalysisCategory> importStaticCodeAnalysisCategoriesFromExercise(Long exerciseId, Long sourceExerciseId) throws ApiException {
    return importStaticCodeAnalysisCategoriesFromExerciseWithHttpInfo(exerciseId, sourceExerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param sourceExerciseId  (required)
   * @return ApiResponse&lt;Set&lt;StaticCodeAnalysisCategory&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StaticCodeAnalysisCategory>> importStaticCodeAnalysisCategoriesFromExerciseWithHttpInfo(Long exerciseId, Long sourceExerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling importStaticCodeAnalysisCategoriesFromExercise");
    }
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importStaticCodeAnalysisCategoriesFromExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/static-code-analysis-categories/import"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "sourceExerciseId", sourceExerciseId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<StaticCodeAnalysisCategory>> localVarReturnType = new GenericType<Set<StaticCodeAnalysisCategory>>() {};
    return apiClient.invokeAPI("StaticCodeAnalysisResourceApi.importStaticCodeAnalysisCategoriesFromExercise", localVarPath, "PATCH", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Set&lt;StaticCodeAnalysisCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StaticCodeAnalysisCategory> resetStaticCodeAnalysisCategories(Long exerciseId) throws ApiException {
    return resetStaticCodeAnalysisCategoriesWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;StaticCodeAnalysisCategory&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StaticCodeAnalysisCategory>> resetStaticCodeAnalysisCategoriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling resetStaticCodeAnalysisCategories");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/static-code-analysis-categories/reset"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<StaticCodeAnalysisCategory>> localVarReturnType = new GenericType<Set<StaticCodeAnalysisCategory>>() {};
    return apiClient.invokeAPI("StaticCodeAnalysisResourceApi.resetStaticCodeAnalysisCategories", localVarPath, "PATCH", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param staticCodeAnalysisCategory  (required)
   * @return Set&lt;StaticCodeAnalysisCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<StaticCodeAnalysisCategory> updateStaticCodeAnalysisCategories(Long exerciseId, Set<StaticCodeAnalysisCategory> staticCodeAnalysisCategory) throws ApiException {
    return updateStaticCodeAnalysisCategoriesWithHttpInfo(exerciseId, staticCodeAnalysisCategory).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param staticCodeAnalysisCategory  (required)
   * @return ApiResponse&lt;Set&lt;StaticCodeAnalysisCategory&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<StaticCodeAnalysisCategory>> updateStaticCodeAnalysisCategoriesWithHttpInfo(Long exerciseId, Set<StaticCodeAnalysisCategory> staticCodeAnalysisCategory) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateStaticCodeAnalysisCategories");
    }
    if (staticCodeAnalysisCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'staticCodeAnalysisCategory' when calling updateStaticCodeAnalysisCategories");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/static-code-analysis-categories"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Set<StaticCodeAnalysisCategory>> localVarReturnType = new GenericType<Set<StaticCodeAnalysisCategory>>() {};
    return apiClient.invokeAPI("StaticCodeAnalysisResourceApi.updateStaticCodeAnalysisCategories", localVarPath, "PATCH", new ArrayList<>(), staticCodeAnalysisCategory,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
