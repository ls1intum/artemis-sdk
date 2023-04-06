package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.BuildLogEntry;
import de.tum.cit.ase.artemis.sdk.model.FileMove;
import de.tum.cit.ase.artemis.sdk.model.FileSubmission;
import de.tum.cit.ase.artemis.sdk.model.RepositoryStatusDTO;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class RepositoryProgrammingExerciseParticipationResourceApi {
  private ApiClient apiClient;

  public RepositoryProgrammingExerciseParticipationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RepositoryProgrammingExerciseParticipationResourceApi(ApiClient apiClient) {
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
   * @param participationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void commitChanges1(Long participationId) throws ApiException {
    commitChanges1WithHttpInfo(participationId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> commitChanges1WithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling commitChanges1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/commit"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.commitChanges1", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param _file  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void createFile1(Long participationId, String _file) throws ApiException {
    createFile1WithHttpInfo(participationId, _file);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param _file  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createFile1WithHttpInfo(Long participationId, String _file) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling createFile1");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling createFile1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/file"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "file", _file)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.createFile1", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param folder  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void createFolder1(Long participationId, String folder) throws ApiException {
    createFolder1WithHttpInfo(participationId, folder);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param folder  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createFolder1WithHttpInfo(Long participationId, String folder) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling createFolder1");
    }
    if (folder == null) {
      throw new ApiException(400, "Missing the required parameter 'folder' when calling createFolder1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/folder"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "folder", folder)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.createFolder1", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param _file  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteFile1(Long participationId, String _file) throws ApiException {
    deleteFile1WithHttpInfo(participationId, _file);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param _file  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteFile1WithHttpInfo(Long participationId, String _file) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling deleteFile1");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling deleteFile1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/file"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "file", _file)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.deleteFile1", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (optional)
   * @return List&lt;BuildLogEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<BuildLogEntry> getBuildLogs(Long participationId, Long resultId) throws ApiException {
    return getBuildLogsWithHttpInfo(participationId, resultId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param resultId  (optional)
   * @return ApiResponse&lt;List&lt;BuildLogEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<BuildLogEntry>> getBuildLogsWithHttpInfo(Long participationId, Long resultId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getBuildLogs");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/buildlogs"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "resultId", resultId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<BuildLogEntry>> localVarReturnType = new GenericType<List<BuildLogEntry>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getBuildLogs", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param _file  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getFile1(Long participationId, String _file) throws ApiException {
    return getFile1WithHttpInfo(participationId, _file).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param _file  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getFile1WithHttpInfo(Long participationId, String _file) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getFile1");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling getFile1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/file"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "file", _file)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/octet-stream");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getFile1", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return Set&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<String> getFileNames(Long participationId) throws ApiException {
    return getFileNamesWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Set&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<String>> getFileNamesWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getFileNames");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/file-names"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<String>> localVarReturnType = new GenericType<Set<String>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getFileNames", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, String> getFiles1(Long participationId) throws ApiException {
    return getFiles1WithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, String>> getFiles1WithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getFiles1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/files"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getFiles1", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, String> getFilesWithContent(Long participationId) throws ApiException {
    return getFilesWithContentWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, String>> getFilesWithContentWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getFilesWithContent");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/files-content"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getFilesWithContent", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return Map&lt;String, Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, Boolean> getFilesWithInformationAboutChange(Long participationId) throws ApiException {
    return getFilesWithInformationAboutChangeWithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Map&lt;String, Boolean&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, Boolean>> getFilesWithInformationAboutChangeWithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getFilesWithInformationAboutChange");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/files-change"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Map<String, Boolean>> localVarReturnType = new GenericType<Map<String, Boolean>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getFilesWithInformationAboutChange", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @return RepositoryStatusDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public RepositoryStatusDTO getStatus1(Long participationId) throws ApiException {
    return getStatus1WithHttpInfo(participationId).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;RepositoryStatusDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RepositoryStatusDTO> getStatus1WithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling getStatus1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<RepositoryStatusDTO> localVarReturnType = new GenericType<RepositoryStatusDTO>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.getStatus1", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void pullChanges1(Long participationId) throws ApiException {
    pullChanges1WithHttpInfo(participationId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> pullChanges1WithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling pullChanges1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/pull"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.pullChanges1", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param fileMove  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void renameFile1(Long participationId, FileMove fileMove) throws ApiException {
    renameFile1WithHttpInfo(participationId, fileMove);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param fileMove  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> renameFile1WithHttpInfo(Long participationId, FileMove fileMove) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling renameFile1");
    }
    if (fileMove == null) {
      throw new ApiException(400, "Missing the required parameter 'fileMove' when calling renameFile1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/rename-file"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.renameFile1", localVarPath, "POST", new ArrayList<>(), fileMove,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void resetToLastCommit1(Long participationId) throws ApiException {
    resetToLastCommit1WithHttpInfo(participationId);
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> resetToLastCommit1WithHttpInfo(Long participationId) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling resetToLastCommit1");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/reset"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.resetToLastCommit1", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param participationId  (required)
   * @param fileSubmission  (required)
   * @param commit  (optional, default to false)
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, String> updateParticipationFiles(Long participationId, List<FileSubmission> fileSubmission, Boolean commit) throws ApiException {
    return updateParticipationFilesWithHttpInfo(participationId, fileSubmission, commit).getData();
  }

  /**
   * 
   * 
   * @param participationId  (required)
   * @param fileSubmission  (required)
   * @param commit  (optional, default to false)
   * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, String>> updateParticipationFilesWithHttpInfo(Long participationId, List<FileSubmission> fileSubmission, Boolean commit) throws ApiException {
    // Check required parameters
    if (participationId == null) {
      throw new ApiException(400, "Missing the required parameter 'participationId' when calling updateParticipationFiles");
    }
    if (fileSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'fileSubmission' when calling updateParticipationFiles");
    }

    // Path parameters
    String localVarPath = "/api/repository/{participationId}/files"
            .replaceAll("\\{participationId}", apiClient.escapeString(participationId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "commit", commit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};
    return apiClient.invokeAPI("RepositoryProgrammingExerciseParticipationResourceApi.updateParticipationFiles", localVarPath, "PUT", localVarQueryParams, fileSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
