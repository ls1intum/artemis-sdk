package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.TutorEffort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class TutorEffortResourceApi {
  private ApiClient apiClient;

  public TutorEffortResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TutorEffortResourceApi(ApiClient apiClient) {
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
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @return List&lt;TutorEffort&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<TutorEffort> calculateTutorEfforts(Long courseId, Long exerciseId) throws ApiException {
    return calculateTutorEffortsWithHttpInfo(courseId, exerciseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @return ApiResponse&lt;List&lt;TutorEffort&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TutorEffort>> calculateTutorEffortsWithHttpInfo(Long courseId, Long exerciseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling calculateTutorEfforts");
    }
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling calculateTutorEfforts");
    }

    // Path parameters
    String localVarPath = "/api/courses/{courseId}/exercises/{exerciseId}/tutor-effort"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<TutorEffort>> localVarReturnType = new GenericType<List<TutorEffort>>() {};
    return apiClient.invokeAPI("TutorEffortResourceApi.calculateTutorEfforts", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
