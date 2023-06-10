package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseSolutionEntry;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ProgrammingExerciseSolutionEntryResourceApi {
  private ApiClient apiClient;

  public ProgrammingExerciseSolutionEntryResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingExerciseSolutionEntryResourceApi(ApiClient apiClient) {
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
   * @return List&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ProgrammingExerciseSolutionEntry> createBehavioralSolutionEntries(Long exerciseId) throws ApiException {
    return createBehavioralSolutionEntriesWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;ProgrammingExerciseSolutionEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ProgrammingExerciseSolutionEntry>> createBehavioralSolutionEntriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createBehavioralSolutionEntries");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/behavioral-solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ProgrammingExerciseSolutionEntry>> localVarReturnType = new GenericType<List<ProgrammingExerciseSolutionEntry>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.createBehavioralSolutionEntries", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @param programmingExerciseSolutionEntry  (required)
   * @return ProgrammingExerciseSolutionEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseSolutionEntry createSolutionEntryForTestCase(Long exerciseId, Long testCaseId, ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry) throws ApiException {
    return createSolutionEntryForTestCaseWithHttpInfo(exerciseId, testCaseId, programmingExerciseSolutionEntry).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @param programmingExerciseSolutionEntry  (required)
   * @return ApiResponse&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseSolutionEntry> createSolutionEntryForTestCaseWithHttpInfo(Long exerciseId, Long testCaseId, ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createSolutionEntryForTestCase");
    }
    if (testCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'testCaseId' when calling createSolutionEntryForTestCase");
    }
    if (programmingExerciseSolutionEntry == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExerciseSolutionEntry' when calling createSolutionEntryForTestCase");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{testCaseId}", apiClient.escapeString(testCaseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExerciseSolutionEntry> localVarReturnType = new GenericType<ProgrammingExerciseSolutionEntry>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.createSolutionEntryForTestCase", localVarPath, "POST", new ArrayList<>(), programmingExerciseSolutionEntry,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ProgrammingExerciseSolutionEntry> createStructuralSolutionEntries(Long exerciseId) throws ApiException {
    return createStructuralSolutionEntriesWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;ProgrammingExerciseSolutionEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ProgrammingExerciseSolutionEntry>> createStructuralSolutionEntriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createStructuralSolutionEntries");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/structural-solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ProgrammingExerciseSolutionEntry>> localVarReturnType = new GenericType<List<ProgrammingExerciseSolutionEntry>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.createStructuralSolutionEntries", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAllSolutionEntriesForExercise(Long exerciseId) throws ApiException {
    deleteAllSolutionEntriesForExerciseWithHttpInfo(exerciseId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAllSolutionEntriesForExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteAllSolutionEntriesForExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.deleteAllSolutionEntriesForExercise", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @param solutionEntryId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteSolutionEntry(Long exerciseId, Long testCaseId, Long solutionEntryId) throws ApiException {
    deleteSolutionEntryWithHttpInfo(exerciseId, testCaseId, solutionEntryId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
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
  public ApiResponse<Void> deleteSolutionEntryWithHttpInfo(Long exerciseId, Long testCaseId, Long solutionEntryId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteSolutionEntry");
    }
    if (testCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'testCaseId' when calling deleteSolutionEntry");
    }
    if (solutionEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'solutionEntryId' when calling deleteSolutionEntry");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries/{solutionEntryId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{testCaseId}", apiClient.escapeString(testCaseId.toString()))
            .replaceAll("\\{solutionEntryId}", apiClient.escapeString(solutionEntryId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.deleteSolutionEntry", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return Set&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<ProgrammingExerciseSolutionEntry> getAllSolutionEntries(Long exerciseId) throws ApiException {
    return getAllSolutionEntriesWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;Set&lt;ProgrammingExerciseSolutionEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<ProgrammingExerciseSolutionEntry>> getAllSolutionEntriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAllSolutionEntries");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<ProgrammingExerciseSolutionEntry>> localVarReturnType = new GenericType<Set<ProgrammingExerciseSolutionEntry>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.getAllSolutionEntries", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param codeHintId  (required)
   * @return Set&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<ProgrammingExerciseSolutionEntry> getSolutionEntriesForCodeHint(Long exerciseId, Long codeHintId) throws ApiException {
    return getSolutionEntriesForCodeHintWithHttpInfo(exerciseId, codeHintId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param codeHintId  (required)
   * @return ApiResponse&lt;Set&lt;ProgrammingExerciseSolutionEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<ProgrammingExerciseSolutionEntry>> getSolutionEntriesForCodeHintWithHttpInfo(Long exerciseId, Long codeHintId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSolutionEntriesForCodeHint");
    }
    if (codeHintId == null) {
      throw new ApiException(400, "Missing the required parameter 'codeHintId' when calling getSolutionEntriesForCodeHint");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/code-hints/{codeHintId}/solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{codeHintId}", apiClient.escapeString(codeHintId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<ProgrammingExerciseSolutionEntry>> localVarReturnType = new GenericType<Set<ProgrammingExerciseSolutionEntry>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.getSolutionEntriesForCodeHint", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @return Set&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<ProgrammingExerciseSolutionEntry> getSolutionEntriesForTestCase(Long exerciseId, Long testCaseId) throws ApiException {
    return getSolutionEntriesForTestCaseWithHttpInfo(exerciseId, testCaseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @return ApiResponse&lt;Set&lt;ProgrammingExerciseSolutionEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<ProgrammingExerciseSolutionEntry>> getSolutionEntriesForTestCaseWithHttpInfo(Long exerciseId, Long testCaseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSolutionEntriesForTestCase");
    }
    if (testCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'testCaseId' when calling getSolutionEntriesForTestCase");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{testCaseId}", apiClient.escapeString(testCaseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<ProgrammingExerciseSolutionEntry>> localVarReturnType = new GenericType<Set<ProgrammingExerciseSolutionEntry>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.getSolutionEntriesForTestCase", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param solutionEntryId  (required)
   * @return ProgrammingExerciseSolutionEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseSolutionEntry getSolutionEntry(Long exerciseId, Long solutionEntryId) throws ApiException {
    return getSolutionEntryWithHttpInfo(exerciseId, solutionEntryId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param solutionEntryId  (required)
   * @return ApiResponse&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseSolutionEntry> getSolutionEntryWithHttpInfo(Long exerciseId, Long solutionEntryId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getSolutionEntry");
    }
    if (solutionEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'solutionEntryId' when calling getSolutionEntry");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/solution-entries/{solutionEntryId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{solutionEntryId}", apiClient.escapeString(solutionEntryId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExerciseSolutionEntry> localVarReturnType = new GenericType<ProgrammingExerciseSolutionEntry>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.getSolutionEntry", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @param solutionEntryId  (required)
   * @param programmingExerciseSolutionEntry  (required)
   * @return ProgrammingExerciseSolutionEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseSolutionEntry updateSolutionEntry(Long exerciseId, Long testCaseId, Long solutionEntryId, ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry) throws ApiException {
    return updateSolutionEntryWithHttpInfo(exerciseId, testCaseId, solutionEntryId, programmingExerciseSolutionEntry).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param testCaseId  (required)
   * @param solutionEntryId  (required)
   * @param programmingExerciseSolutionEntry  (required)
   * @return ApiResponse&lt;ProgrammingExerciseSolutionEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseSolutionEntry> updateSolutionEntryWithHttpInfo(Long exerciseId, Long testCaseId, Long solutionEntryId, ProgrammingExerciseSolutionEntry programmingExerciseSolutionEntry) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateSolutionEntry");
    }
    if (testCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'testCaseId' when calling updateSolutionEntry");
    }
    if (solutionEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'solutionEntryId' when calling updateSolutionEntry");
    }
    if (programmingExerciseSolutionEntry == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExerciseSolutionEntry' when calling updateSolutionEntry");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/test-cases/{testCaseId}/solution-entries/{solutionEntryId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{testCaseId}", apiClient.escapeString(testCaseId.toString()))
            .replaceAll("\\{solutionEntryId}", apiClient.escapeString(solutionEntryId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExerciseSolutionEntry> localVarReturnType = new GenericType<ProgrammingExerciseSolutionEntry>() {};
    return apiClient.invokeAPI("ProgrammingExerciseSolutionEntryResourceApi.updateSolutionEntry", localVarPath, "PUT", new ArrayList<>(), programmingExerciseSolutionEntry,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
