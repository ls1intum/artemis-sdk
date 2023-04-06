package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ExampleSubmissionResourceApi {
  private ApiClient apiClient;

  public ExampleSubmissionResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExampleSubmissionResourceApi(ApiClient apiClient) {
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
   * @param exampleSubmission  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission createExampleSubmission(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    return createExampleSubmissionWithHttpInfo(exerciseId, exampleSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> createExampleSubmissionWithHttpInfo(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createExampleSubmission");
    }
    if (exampleSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmission' when calling createExampleSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};
    return apiClient.invokeAPI("ExampleSubmissionResourceApi.createExampleSubmission", localVarPath, "POST", new ArrayList<>(), exampleSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteExampleSubmission(Long exampleSubmissionId) throws ApiException {
    deleteExampleSubmissionWithHttpInfo(exampleSubmissionId);
  }

  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteExampleSubmissionWithHttpInfo(Long exampleSubmissionId) throws ApiException {
    // Check required parameters
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling deleteExampleSubmission");
    }

    // Path parameters
    String localVarPath = "/api/example-submissions/{exampleSubmissionId}"
            .replaceAll("\\{exampleSubmissionId}", apiClient.escapeString(exampleSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExampleSubmissionResourceApi.deleteExampleSubmission", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission getExampleSubmission(Long exampleSubmissionId) throws ApiException {
    return getExampleSubmissionWithHttpInfo(exampleSubmissionId).getData();
  }

  /**
   * 
   * 
   * @param exampleSubmissionId  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> getExampleSubmissionWithHttpInfo(Long exampleSubmissionId) throws ApiException {
    // Check required parameters
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling getExampleSubmission");
    }

    // Path parameters
    String localVarPath = "/api/example-submissions/{exampleSubmissionId}"
            .replaceAll("\\{exampleSubmissionId}", apiClient.escapeString(exampleSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};
    return apiClient.invokeAPI("ExampleSubmissionResourceApi.getExampleSubmission", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param sourceSubmissionId  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission importExampleSubmission(Long exerciseId, Long sourceSubmissionId) throws ApiException {
    return importExampleSubmissionWithHttpInfo(exerciseId, sourceSubmissionId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param sourceSubmissionId  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> importExampleSubmissionWithHttpInfo(Long exerciseId, Long sourceSubmissionId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling importExampleSubmission");
    }
    if (sourceSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceSubmissionId' when calling importExampleSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/import/{sourceSubmissionId}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{sourceSubmissionId}", apiClient.escapeString(sourceSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};
    return apiClient.invokeAPI("ExampleSubmissionResourceApi.importExampleSubmission", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmissionId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void prepareExampleAssessment(Long exerciseId, Long exampleSubmissionId) throws ApiException {
    prepareExampleAssessmentWithHttpInfo(exerciseId, exampleSubmissionId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmissionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> prepareExampleAssessmentWithHttpInfo(Long exerciseId, Long exampleSubmissionId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling prepareExampleAssessment");
    }
    if (exampleSubmissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmissionId' when calling prepareExampleAssessment");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions/{exampleSubmissionId}/prepare-assessment"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{exampleSubmissionId}", apiClient.escapeString(exampleSubmissionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExampleSubmissionResourceApi.prepareExampleAssessment", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ExampleSubmission
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExampleSubmission updateExampleSubmission(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    return updateExampleSubmissionWithHttpInfo(exerciseId, exampleSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ApiResponse&lt;ExampleSubmission&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExampleSubmission> updateExampleSubmissionWithHttpInfo(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateExampleSubmission");
    }
    if (exampleSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmission' when calling updateExampleSubmission");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/example-submissions"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExampleSubmission> localVarReturnType = new GenericType<ExampleSubmission>() {};
    return apiClient.invokeAPI("ExampleSubmissionResourceApi.updateExampleSubmission", localVarPath, "PUT", new ArrayList<>(), exampleSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
