package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.LongFeedbackText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class LongFeedbackTextResourceApi {
  private ApiClient apiClient;

  public LongFeedbackTextResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LongFeedbackTextResourceApi(ApiClient apiClient) {
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
   * @param resultId  (required)
   * @param feedbackId  (required)
   * @return LongFeedbackText
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LongFeedbackText getLongFeedback(Long resultId, Long feedbackId) throws ApiException {
    return getLongFeedbackWithHttpInfo(resultId, feedbackId).getData();
  }

  /**
   * 
   * 
   * @param resultId  (required)
   * @param feedbackId  (required)
   * @return ApiResponse&lt;LongFeedbackText&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LongFeedbackText> getLongFeedbackWithHttpInfo(Long resultId, Long feedbackId) throws ApiException {
    // Check required parameters
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getLongFeedback");
    }
    if (feedbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'feedbackId' when calling getLongFeedback");
    }

    // Path parameters
    String localVarPath = "/api/results/{resultId}/feedbacks/{feedbackId}/long-feedback"
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()))
            .replaceAll("\\{feedbackId}", apiClient.escapeString(feedbackId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<LongFeedbackText> localVarReturnType = new GenericType<LongFeedbackText>() {};
    return apiClient.invokeAPI("LongFeedbackTextResourceApi.getLongFeedback", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
