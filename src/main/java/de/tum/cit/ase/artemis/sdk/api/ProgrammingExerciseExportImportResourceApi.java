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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportInstructorAuxiliaryRepository");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling exportInstructorAuxiliaryRepository");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-instructor-auxiliary-repository/{repositoryId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()));

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

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportInstructorAuxiliaryRepository", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportInstructorExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-instructor-exercise"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

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

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportInstructorExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportInstructorRepository");
    }
    
    // verify the required parameter 'repositoryType' is set
    if (repositoryType == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryType' when calling exportInstructorRepository");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-instructor-repository/{repositoryType}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "repositoryType" + "\\}", apiClient.escapeString(repositoryType.toString()));

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

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportInstructorRepository", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportStudentRequestedRepository");
    }
    
    // verify the required parameter 'includeTests' is set
    if (includeTests == null) {
      throw new ApiException(400, "Missing the required parameter 'includeTests' when calling exportStudentRequestedRepository");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-student-requested-repository"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTests", includeTests));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportStudentRequestedRepository", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = repositoryExportOptionsDTO;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissionsByParticipationIds");
    }
    
    // verify the required parameter 'participationIds' is set
    if (participationIds == null) {
      throw new ApiException(400, "Missing the required parameter 'participationIds' when calling exportSubmissionsByParticipationIds");
    }
    
    // verify the required parameter 'repositoryExportOptionsDTO' is set
    if (repositoryExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryExportOptionsDTO' when calling exportSubmissionsByParticipationIds");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-repos-by-participation-ids/{participationIds}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "participationIds" + "\\}", apiClient.escapeString(participationIds.toString()));

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

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportSubmissionsByParticipationIds", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = repositoryExportOptionsDTO;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling exportSubmissionsByStudentLogins");
    }
    
    // verify the required parameter 'participantIdentifiers' is set
    if (participantIdentifiers == null) {
      throw new ApiException(400, "Missing the required parameter 'participantIdentifiers' when calling exportSubmissionsByStudentLogins");
    }
    
    // verify the required parameter 'repositoryExportOptionsDTO' is set
    if (repositoryExportOptionsDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryExportOptionsDTO' when calling exportSubmissionsByStudentLogins");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/export-repos-by-participant-identifiers/{participantIdentifiers}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "participantIdentifiers" + "\\}", apiClient.escapeString(participantIdentifiers.toString()));

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

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.exportSubmissionsByStudentLogins", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = programmingExercise;
    
    // verify the required parameter 'sourceExerciseId' is set
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importProgrammingExercise");
    }
    
    // verify the required parameter 'programmingExercise' is set
    if (programmingExercise == null) {
      throw new ApiException(400, "Missing the required parameter 'programmingExercise' when calling importProgrammingExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/import/{sourceExerciseId}"
      .replaceAll("\\{" + "sourceExerciseId" + "\\}", apiClient.escapeString(sourceExerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recreateBuildPlans", recreateBuildPlans));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateTemplate", updateTemplate));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProgrammingExercise> localVarReturnType = new GenericType<ProgrammingExercise>() {};

    return apiClient.invokeAPI("ProgrammingExerciseExportImportResourceApi.importProgrammingExercise", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
