package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.AuxiliaryRepository;
import de.tum.cit.ase.artemis.sdk.model.BuildLogStatisticsDTO;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseResetOptionsDTO;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTestCaseStateDTO;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOProgrammingExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class ProgrammingExerciseResourceApi {
  private ApiClient apiClient;

  public ProgrammingExerciseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingExerciseResourceApi(ApiClient apiClient) {
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
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void combineTemplateRepositoryCommits(Long exerciseId) throws ApiException {
    combineTemplateRepositoryCommitsWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> combineTemplateRepositoryCommitsWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling combineTemplateRepositoryCommits");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/combine-template-commits"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.combineTemplateRepositoryCommits", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param programmingExercise  (required)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise createProgrammingExercise(ProgrammingExercise programmingExercise) throws ApiException {
    return createProgrammingExerciseWithHttpInfo(programmingExercise).getData();
  }

  /**
   * 
   * 
   * @param programmingExercise  (required)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> createProgrammingExerciseWithHttpInfo(ProgrammingExercise programmingExercise) throws ApiException {
    // Check required parameters
    if (programmingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExercise' when calling createProgrammingExercise");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.createProgrammingExercise", "/api/programming-exercises/setup", "POST", new ArrayList<>(), programmingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param deleteStudentReposBuildPlans  (optional, default to false)
   * @param deleteBaseReposBuildPlans  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProgrammingExercise(Long exerciseId, Boolean deleteStudentReposBuildPlans, Boolean deleteBaseReposBuildPlans) throws ApiException {
    deleteProgrammingExerciseWithHttpInfo(exerciseId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param deleteStudentReposBuildPlans  (optional, default to false)
   * @param deleteBaseReposBuildPlans  (optional, default to false)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProgrammingExerciseWithHttpInfo(Long exerciseId, Boolean deleteStudentReposBuildPlans, Boolean deleteBaseReposBuildPlans) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteProgrammingExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteStudentReposBuildPlans", deleteStudentReposBuildPlans)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteBaseReposBuildPlans", deleteBaseReposBuildPlans));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.deleteProgrammingExercise", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
  public void deleteTaskWithSolutionEntries(Long exerciseId) throws ApiException {
    deleteTaskWithSolutionEntriesWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> deleteTaskWithSolutionEntriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteTaskWithSolutionEntries");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/tasks"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.deleteTaskWithSolutionEntries", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String generateStructureOracleForExercise(Long exerciseId) throws ApiException {
    return generateStructureOracleForExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> generateStructureOracleForExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling generateStructureOracleForExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/generate-tests"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "text/plain");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.generateStructureOracleForExercise", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return SearchResultPageDTOProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOProgrammingExercise getAllExercisesOnPage2(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    return getAllExercisesOnPage2WithHttpInfo(search, isCourseFilter, isExamFilter).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return ApiResponse&lt;SearchResultPageDTOProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOProgrammingExercise> getAllExercisesOnPage2WithHttpInfo(PageableSearchDTOString search, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExercisesOnPage2");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCourseFilter", isCourseFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isExamFilter", isExamFilter));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOProgrammingExercise> localVarReturnType = new GenericType<SearchResultPageDTOProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getAllExercisesOnPage2", "/api/programming-exercises", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param search  (required)
   * @param programmingLanguage  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return SearchResultPageDTOProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SearchResultPageDTOProgrammingExercise getAllExercisesWithSCAOnPage(PageableSearchDTOString search, String programmingLanguage, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    return getAllExercisesWithSCAOnPageWithHttpInfo(search, programmingLanguage, isCourseFilter, isExamFilter).getData();
  }

  /**
   * 
   * 
   * @param search  (required)
   * @param programmingLanguage  (required)
   * @param isCourseFilter  (optional, default to true)
   * @param isExamFilter  (optional, default to true)
   * @return ApiResponse&lt;SearchResultPageDTOProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResultPageDTOProgrammingExercise> getAllExercisesWithSCAOnPageWithHttpInfo(PageableSearchDTOString search, String programmingLanguage, Boolean isCourseFilter, Boolean isExamFilter) throws ApiException {
    // Check required parameters
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling getAllExercisesWithSCAOnPage");
    }
    if (programmingLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingLanguage' when calling getAllExercisesWithSCAOnPage");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCourseFilter", isCourseFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isExamFilter", isExamFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "programmingLanguage", programmingLanguage));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SearchResultPageDTOProgrammingExercise> localVarReturnType = new GenericType<SearchResultPageDTOProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getAllExercisesWithSCAOnPage", "/api/programming-exercises/with-sca", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return List&lt;AuxiliaryRepository&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<AuxiliaryRepository> getAuxiliaryRepositories(Long exerciseId) throws ApiException {
    return getAuxiliaryRepositoriesWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;AuxiliaryRepository&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AuxiliaryRepository>> getAuxiliaryRepositoriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getAuxiliaryRepositories");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/auxiliary-repository"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<AuxiliaryRepository>> localVarReturnType = new GenericType<List<AuxiliaryRepository>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getAuxiliaryRepositories", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return BuildLogStatisticsDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BuildLogStatisticsDTO getBuildLogStatistics(Long exerciseId) throws ApiException {
    return getBuildLogStatisticsWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;BuildLogStatisticsDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildLogStatisticsDTO> getBuildLogStatisticsWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getBuildLogStatistics");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/build-log-statistics"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BuildLogStatisticsDTO> localVarReturnType = new GenericType<BuildLogStatisticsDTO>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getBuildLogStatistics", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise getProgrammingExercise(Long exerciseId) throws ApiException {
    return getProgrammingExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> getProgrammingExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getProgrammingExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getProgrammingExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise getProgrammingExerciseWithSetupParticipations(Long exerciseId) throws ApiException {
    return getProgrammingExerciseWithSetupParticipationsWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> getProgrammingExerciseWithSetupParticipationsWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getProgrammingExerciseWithSetupParticipations");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/with-participations"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getProgrammingExerciseWithSetupParticipations", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param withSubmissionResults  (optional, default to false)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise getProgrammingExerciseWithTemplateAndSolutionParticipation(Long exerciseId, Boolean withSubmissionResults) throws ApiException {
    return getProgrammingExerciseWithTemplateAndSolutionParticipationWithHttpInfo(exerciseId, withSubmissionResults).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param withSubmissionResults  (optional, default to false)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> getProgrammingExerciseWithTemplateAndSolutionParticipationWithHttpInfo(Long exerciseId, Boolean withSubmissionResults) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getProgrammingExerciseWithTemplateAndSolutionParticipation");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/with-template-and-solution-participation"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "withSubmissionResults", withSubmissionResults)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getProgrammingExerciseWithTemplateAndSolutionParticipation", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ProgrammingExercise> getProgrammingExercisesForCourse(Long courseId) throws ApiException {
    return getProgrammingExercisesForCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;ProgrammingExercise&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ProgrammingExercise>> getProgrammingExercisesForCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getProgrammingExercisesForCourse");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/programming-exercises"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ProgrammingExercise>> localVarReturnType = new GenericType<List<ProgrammingExercise>>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.getProgrammingExercisesForCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ProgrammingExerciseTestCaseStateDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExerciseTestCaseStateDTO hasAtLeastOneStudentResult(Long exerciseId) throws ApiException {
    return hasAtLeastOneStudentResultWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ProgrammingExerciseTestCaseStateDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExerciseTestCaseStateDTO> hasAtLeastOneStudentResultWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling hasAtLeastOneStudentResult");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/test-case-state"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ProgrammingExerciseTestCaseStateDTO> localVarReturnType = new GenericType<ProgrammingExerciseTestCaseStateDTO>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.hasAtLeastOneStudentResult", localVarPath, "GET", new ArrayList<>(), null,
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
  public void lockAllRepositories(Long exerciseId) throws ApiException {
    lockAllRepositoriesWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> lockAllRepositoriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling lockAllRepositories");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/lock-all-repositories"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.lockAllRepositories", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param programmingExercise  (required)
   * @param deleteFeedback  (optional)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise reEvaluateAndUpdateProgrammingExercise(Long exerciseId, ProgrammingExercise programmingExercise, Boolean deleteFeedback) throws ApiException {
    return reEvaluateAndUpdateProgrammingExerciseWithHttpInfo(exerciseId, programmingExercise, deleteFeedback).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param programmingExercise  (required)
   * @param deleteFeedback  (optional)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> reEvaluateAndUpdateProgrammingExerciseWithHttpInfo(Long exerciseId, ProgrammingExercise programmingExercise, Boolean deleteFeedback) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling reEvaluateAndUpdateProgrammingExercise");
    }
    if (programmingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExercise' when calling reEvaluateAndUpdateProgrammingExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/re-evaluate"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "deleteFeedback", deleteFeedback)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.reEvaluateAndUpdateProgrammingExercise", localVarPath, "PUT", localVarQueryParams, programmingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param programmingExerciseResetOptionsDTO  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void reset(Long exerciseId, ProgrammingExerciseResetOptionsDTO programmingExerciseResetOptionsDTO) throws ApiException {
    resetWithHttpInfo(exerciseId, programmingExerciseResetOptionsDTO);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param programmingExerciseResetOptionsDTO  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> resetWithHttpInfo(Long exerciseId, ProgrammingExerciseResetOptionsDTO programmingExerciseResetOptionsDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling reset");
    }
    if (programmingExerciseResetOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExerciseResetOptionsDTO' when calling reset");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/reset"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.reset", localVarPath, "PUT", new ArrayList<>(), programmingExerciseResetOptionsDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
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
  public void unlockAllRepositories(Long exerciseId) throws ApiException {
    unlockAllRepositoriesWithHttpInfo(exerciseId);
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
  public ApiResponse<Void> unlockAllRepositoriesWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling unlockAllRepositories");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/unlock-all-repositories"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.unlockAllRepositories", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param body  (required)
   * @param notificationText  (optional)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise updateProblemStatement(Long exerciseId, String body, String notificationText) throws ApiException {
    return updateProblemStatementWithHttpInfo(exerciseId, body, notificationText).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param body  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> updateProblemStatementWithHttpInfo(Long exerciseId, String body, String notificationText) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateProblemStatement");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateProblemStatement");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/problem-statement"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.updateProblemStatement", localVarPath, "PATCH", localVarQueryParams, body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param programmingExercise  (required)
   * @param notificationText  (optional)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise updateProgrammingExercise(ProgrammingExercise programmingExercise, String notificationText) throws ApiException {
    return updateProgrammingExerciseWithHttpInfo(programmingExercise, notificationText).getData();
  }

  /**
   * 
   * 
   * @param programmingExercise  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> updateProgrammingExerciseWithHttpInfo(ProgrammingExercise programmingExercise, String notificationText) throws ApiException {
    // Check required parameters
    if (programmingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExercise' when calling updateProgrammingExercise");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.updateProgrammingExercise", "/api/programming-exercises", "PUT", localVarQueryParams, programmingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param programmingExercise  (required)
   * @param notificationText  (optional)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise updateProgrammingExerciseTimeline(ProgrammingExercise programmingExercise, String notificationText) throws ApiException {
    return updateProgrammingExerciseTimelineWithHttpInfo(programmingExercise, notificationText).getData();
  }

  /**
   * 
   * 
   * @param programmingExercise  (required)
   * @param notificationText  (optional)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> updateProgrammingExerciseTimelineWithHttpInfo(ProgrammingExercise programmingExercise, String notificationText) throws ApiException {
    // Check required parameters
    if (programmingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExercise' when calling updateProgrammingExerciseTimeline");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notificationText", notificationText)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseResourceApi.updateProgrammingExerciseTimeline", "/api/programming-exercises/timeline", "PUT", localVarQueryParams, programmingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
