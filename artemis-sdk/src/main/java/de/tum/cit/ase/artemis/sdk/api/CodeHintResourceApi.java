package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CodeHint;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class CodeHintResourceApi {
  private ApiClient apiClient;

  public CodeHintResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CodeHintResourceApi(ApiClient apiClient) {
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
   * @param deleteOldCodeHints  (optional, default to true)
   * @return List&lt;CodeHint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<CodeHint> generateCodeHintsForExercise(Long exerciseId, Boolean deleteOldCodeHints) throws ApiException {
    return generateCodeHintsForExerciseWithHttpInfo(exerciseId, deleteOldCodeHints).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param deleteOldCodeHints  (optional, default to true)
   * @return ApiResponse&lt;List&lt;CodeHint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CodeHint>> generateCodeHintsForExerciseWithHttpInfo(Long exerciseId, Boolean deleteOldCodeHints) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling generateCodeHintsForExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/code-hints"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteOldCodeHints", deleteOldCodeHints)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CodeHint>> localVarReturnType = new GenericType<List<CodeHint>>() {};
    return apiClient.invokeAPI("CodeHintResourceApi.generateCodeHintsForExercise", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Set&lt;CodeHint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<CodeHint> getAllCodeHints(Long exerciseId) throws ApiException {
    return getAllCodeHintsWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;CodeHint&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<CodeHint>> getAllCodeHintsWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllCodeHints");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/code-hints"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<CodeHint>> localVarReturnType = new GenericType<Set<CodeHint>>() {};
    return apiClient.invokeAPI("CodeHintResourceApi.getAllCodeHints", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param codeHintId  (required)
   * @param solutionEntryId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeSolutionEntryFromCodeHint(Long exerciseId, Long codeHintId, Long solutionEntryId) throws ApiException {
    removeSolutionEntryFromCodeHintWithHttpInfo(exerciseId, codeHintId, solutionEntryId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param codeHintId  (required)
   * @param solutionEntryId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeSolutionEntryFromCodeHintWithHttpInfo(Long exerciseId, Long codeHintId, Long solutionEntryId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling removeSolutionEntryFromCodeHint");
    }
    if (codeHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'codeHintId' when calling removeSolutionEntryFromCodeHint");
    }
    if (solutionEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'solutionEntryId' when calling removeSolutionEntryFromCodeHint");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/code-hints/{codeHintId}/solution-entries/{solutionEntryId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{codeHintId}", apiClient.escapeString(codeHintId.toString()))
            .replaceAll("\\{solutionEntryId}", apiClient.escapeString(solutionEntryId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("CodeHintResourceApi.removeSolutionEntryFromCodeHint", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
