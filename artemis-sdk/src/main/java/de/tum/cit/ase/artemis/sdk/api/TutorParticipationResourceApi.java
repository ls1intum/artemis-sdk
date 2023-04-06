package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExampleSubmission;
import de.tum.cit.ase.artemis.sdk.model.TutorParticipation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class TutorParticipationResourceApi {
  private ApiClient apiClient;

  public TutorParticipationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TutorParticipationResourceApi(ApiClient apiClient) {
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
   * @return TutorParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorParticipation assessExampleSubmissionForTutorParticipation(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    return assessExampleSubmissionForTutorParticipationWithHttpInfo(exerciseId, exampleSubmission).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param exampleSubmission  (required)
   * @return ApiResponse&lt;TutorParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorParticipation> assessExampleSubmissionForTutorParticipationWithHttpInfo(Long exerciseId, ExampleSubmission exampleSubmission) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling assessExampleSubmissionForTutorParticipation");
    }
    if (exampleSubmission == null) {
      throw new ApiException(400, "Missing the required parameter 'exampleSubmission' when calling assessExampleSubmissionForTutorParticipation");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/assess-example-submission"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TutorParticipation> localVarReturnType = new GenericType<TutorParticipation>() {};
    return apiClient.invokeAPI("TutorParticipationResourceApi.assessExampleSubmissionForTutorParticipation", localVarPath, "POST", new ArrayList<>(), exampleSubmission,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return TutorParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorParticipation deleteTutorParticipationForGuidedTour(Long exerciseId) throws ApiException {
    return deleteTutorParticipationForGuidedTourWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;TutorParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorParticipation> deleteTutorParticipationForGuidedTourWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteTutorParticipationForGuidedTour");
    }

    // Path parameters
    String localVarPath = "/api/guided-tour/exercises/{exerciseId}/example-submission"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TutorParticipation> localVarReturnType = new GenericType<TutorParticipation>() {};
    return apiClient.invokeAPI("TutorParticipationResourceApi.deleteTutorParticipationForGuidedTour", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return TutorParticipation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TutorParticipation initTutorParticipation(Long exerciseId) throws ApiException {
    return initTutorParticipationWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;TutorParticipation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TutorParticipation> initTutorParticipationWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling initTutorParticipation");
    }

    // Path parameters
    String localVarPath = "/api/exercises/{exerciseId}/tutor-participations"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TutorParticipation> localVarReturnType = new GenericType<TutorParticipation>() {};
    return apiClient.invokeAPI("TutorParticipationResourceApi.initTutorParticipation", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
