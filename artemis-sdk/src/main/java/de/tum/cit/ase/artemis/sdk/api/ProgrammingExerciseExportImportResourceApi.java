package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.RepositoryExportOptionsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ProgrammingExerciseExportImportResourceApi {
  private ApiClient apiClient;

  public ProgrammingExerciseExportImportResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingExerciseExportImportResourceApi(ApiClient apiClient) {
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
   * @param repositoryId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportInstructorAuxiliaryRepository(Long exerciseId, Long repositoryId) throws ApiException {
    return exportInstructorAuxiliaryRepositoryWithHttpInfo(exerciseId, repositoryId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param repositoryId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportInstructorAuxiliaryRepositoryWithHttpInfo(Long exerciseId, Long repositoryId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportInstructorAuxiliaryRepository");
    }
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling exportInstructorAuxiliaryRepository");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-instructor-auxiliary-repository/{repositoryId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{repositoryId}", apiClient.escapeString(repositoryId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportInstructorAuxiliaryRepository", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportInstructorExercise(Long exerciseId) throws ApiException {
    return exportInstructorExerciseWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportInstructorExerciseWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportInstructorExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-instructor-exercise"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportInstructorExercise", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param repositoryType  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportInstructorRepository(Long exerciseId, String repositoryType) throws ApiException {
    return exportInstructorRepositoryWithHttpInfo(exerciseId, repositoryType).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param repositoryType  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportInstructorRepositoryWithHttpInfo(Long exerciseId, String repositoryType) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportInstructorRepository");
    }
    if (repositoryType == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryType' when calling exportInstructorRepository");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-instructor-repository/{repositoryType}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{repositoryType}", apiClient.escapeString(repositoryType));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportInstructorRepository", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param includeTests  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportStudentRequestedRepository(Long exerciseId, Boolean includeTests) throws ApiException {
    return exportStudentRequestedRepositoryWithHttpInfo(exerciseId, includeTests).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param includeTests  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportStudentRequestedRepositoryWithHttpInfo(Long exerciseId, Boolean includeTests) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportStudentRequestedRepository");
    }
    if (includeTests == null) {
      throw new ApiException(400, "Missing the required parameter 'includeTests' when calling exportStudentRequestedRepository");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-student-requested-repository"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeTests", includeTests)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportStudentRequestedRepository", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param participationIds  (required)
   * @param repositoryExportOptionsDTO  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportSubmissionsByParticipationIds(Long exerciseId, String participationIds, RepositoryExportOptionsDTO repositoryExportOptionsDTO) throws ApiException {
    return exportSubmissionsByParticipationIdsWithHttpInfo(exerciseId, participationIds, repositoryExportOptionsDTO).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param participationIds  (required)
   * @param repositoryExportOptionsDTO  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportSubmissionsByParticipationIdsWithHttpInfo(Long exerciseId, String participationIds, RepositoryExportOptionsDTO repositoryExportOptionsDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissionsByParticipationIds");
    }
    if (participationIds == null) {
      throw new ApiException(400, "Missing the required parameter 'participationIds' when calling exportSubmissionsByParticipationIds");
    }
    if (repositoryExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryExportOptionsDTO' when calling exportSubmissionsByParticipationIds");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-repos-by-participation-ids/{participationIds}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{participationIds}", apiClient.escapeString(participationIds));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportSubmissionsByParticipationIds", localVarPath, "POST", new ArrayList<>(), repositoryExportOptionsDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param participantIdentifiers  (required)
   * @param repositoryExportOptionsDTO  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File exportSubmissionsByStudentLogins(Long exerciseId, String participantIdentifiers, RepositoryExportOptionsDTO repositoryExportOptionsDTO) throws ApiException {
    return exportSubmissionsByStudentLoginsWithHttpInfo(exerciseId, participantIdentifiers, repositoryExportOptionsDTO).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param participantIdentifiers  (required)
   * @param repositoryExportOptionsDTO  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportSubmissionsByStudentLoginsWithHttpInfo(Long exerciseId, String participantIdentifiers, RepositoryExportOptionsDTO repositoryExportOptionsDTO) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissionsByStudentLogins");
    }
    if (participantIdentifiers == null) {
      throw new ApiException(400, "Missing the required parameter 'participantIdentifiers' when calling exportSubmissionsByStudentLogins");
    }
    if (repositoryExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryExportOptionsDTO' when calling exportSubmissionsByStudentLogins");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-repos-by-participant-identifiers/{participantIdentifiers}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{participantIdentifiers}", apiClient.escapeString(participantIdentifiers));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportSubmissionsByStudentLogins", localVarPath, "POST", new ArrayList<>(), repositoryExportOptionsDTO,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param programmingExercise  (required)
   * @param recreateBuildPlans  (optional, default to false)
   * @param updateTemplate  (optional, default to false)
   * @return ProgrammingExercise
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ProgrammingExercise importProgrammingExercise(Long sourceExerciseId, ProgrammingExercise programmingExercise, Boolean recreateBuildPlans, Boolean updateTemplate) throws ApiException {
    return importProgrammingExerciseWithHttpInfo(sourceExerciseId, programmingExercise, recreateBuildPlans, updateTemplate).getData();
  }

  /**
   * 
   * 
   * @param sourceExerciseId  (required)
   * @param programmingExercise  (required)
   * @param recreateBuildPlans  (optional, default to false)
   * @param updateTemplate  (optional, default to false)
   * @return ApiResponse&lt;ProgrammingExercise&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProgrammingExercise> importProgrammingExerciseWithHttpInfo(Long sourceExerciseId, ProgrammingExercise programmingExercise, Boolean recreateBuildPlans, Boolean updateTemplate) throws ApiException {
    // Check required parameters
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importProgrammingExercise");
    }
    if (programmingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExercise' when calling importProgrammingExercise");
    }

    // Path parameters
    String localVarPath = "/api/programming-exercises/import/{sourceExerciseId}"
            .replaceAll("\\{sourceExerciseId}", apiClient.escapeString(sourceExerciseId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "recreateBuildPlans", recreateBuildPlans)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateTemplate", updateTemplate));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};
    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.importProgrammingExercise", localVarPath, "POST", localVarQueryParams, programmingExercise,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
