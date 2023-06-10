package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.PushNotificationRegisterBody;
import de.tum.cit.ase.artemis.sdk.model.PushNotificationRegisterDTO;
import de.tum.cit.ase.artemis.sdk.model.PushNotificationUnregisterRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class PushNotificationResourceApi {
  private ApiClient apiClient;

  public PushNotificationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PushNotificationResourceApi(ApiClient apiClient) {
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
   * @param pushNotificationRegisterBody  (required)
   * @return PushNotificationRegisterDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PushNotificationRegisterDTO register(PushNotificationRegisterBody pushNotificationRegisterBody) throws ApiException {
    return registerWithHttpInfo(pushNotificationRegisterBody).getData();
  }

  /**
   * 
   * 
   * @param pushNotificationRegisterBody  (required)
   * @return ApiResponse&lt;PushNotificationRegisterDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PushNotificationRegisterDTO> registerWithHttpInfo(PushNotificationRegisterBody pushNotificationRegisterBody) throws ApiException {
    // Check required parameters
    if (pushNotificationRegisterBody == null) {
      throw new ApiException(400, "Missing the required parameter 'pushNotificationRegisterBody' when calling register");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<PushNotificationRegisterDTO> localVarReturnType = new GenericType<PushNotificationRegisterDTO>() {};
    return apiClient.invokeAPI("PushNotificationResourceApi.register", "/api/push_notification/register", "POST", new ArrayList<>(), pushNotificationRegisterBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param pushNotificationUnregisterRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void unregister(PushNotificationUnregisterRequest pushNotificationUnregisterRequest) throws ApiException {
    unregisterWithHttpInfo(pushNotificationUnregisterRequest);
  }

  /**
   * 
   * 
   * @param pushNotificationUnregisterRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> unregisterWithHttpInfo(PushNotificationUnregisterRequest pushNotificationUnregisterRequest) throws ApiException {
    // Check required parameters
    if (pushNotificationUnregisterRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'pushNotificationUnregisterRequest' when calling unregister");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("PushNotificationResourceApi.unregister", "/api/push_notification/unregister", "DELETE", new ArrayList<>(), pushNotificationUnregisterRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
