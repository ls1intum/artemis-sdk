package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CreateSystemNotification200Response;
import de.tum.cit.ase.artemis.sdk.model.SystemNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class AdminSystemNotificationResourceApi {
  private ApiClient apiClient;

  public AdminSystemNotificationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminSystemNotificationResourceApi(ApiClient apiClient) {
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
   * @param systemNotification  (required)
   * @return CreateSystemNotification200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CreateSystemNotification200Response createSystemNotification(SystemNotification systemNotification) throws ApiException {
    return createSystemNotificationWithHttpInfo(systemNotification).getData();
  }

  /**
   * 
   * 
   * @param systemNotification  (required)
   * @return ApiResponse&lt;CreateSystemNotification200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSystemNotification200Response> createSystemNotificationWithHttpInfo(SystemNotification systemNotification) throws ApiException {
    // Check required parameters
    if (systemNotification == null) {
      throw new ApiException(400, "Missing the required parameter 'systemNotification' when calling createSystemNotification");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateSystemNotification200Response> localVarReturnType = new GenericType<CreateSystemNotification200Response>() {};
    return apiClient.invokeAPI("AdminSystemNotificationResourceApi.createSystemNotification", "/api/admin/system-notifications", "POST", new ArrayList<>(), systemNotification,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param notificationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteSystemNotification(Long notificationId) throws ApiException {
    deleteSystemNotificationWithHttpInfo(notificationId);
  }

  /**
   * 
   * 
   * @param notificationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteSystemNotificationWithHttpInfo(Long notificationId) throws ApiException {
    // Check required parameters
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling deleteSystemNotification");
    }

    // Path parameters
    String localVarPath = "/api/admin/system-notifications/{notificationId}"
            .replaceAll("\\{notificationId}", apiClient.escapeString(notificationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminSystemNotificationResourceApi.deleteSystemNotification", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param systemNotification  (required)
   * @return SystemNotification
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SystemNotification updateSystemNotification(SystemNotification systemNotification) throws ApiException {
    return updateSystemNotificationWithHttpInfo(systemNotification).getData();
  }

  /**
   * 
   * 
   * @param systemNotification  (required)
   * @return ApiResponse&lt;SystemNotification&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SystemNotification> updateSystemNotificationWithHttpInfo(SystemNotification systemNotification) throws ApiException {
    // Check required parameters
    if (systemNotification == null) {
      throw new ApiException(400, "Missing the required parameter 'systemNotification' when calling updateSystemNotification");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SystemNotification> localVarReturnType = new GenericType<SystemNotification>() {};
    return apiClient.invokeAPI("AdminSystemNotificationResourceApi.updateSystemNotification", "/api/admin/system-notifications", "PUT", new ArrayList<>(), systemNotification,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
