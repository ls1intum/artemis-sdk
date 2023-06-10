package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Pageable;
import de.tum.cit.ase.artemis.sdk.model.SystemNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class SystemNotificationResourceApi {
  private ApiClient apiClient;

  public SystemNotificationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SystemNotificationResourceApi(ApiClient apiClient) {
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
   * @return List&lt;SystemNotification&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<SystemNotification> getActiveAndFutureSystemNotifications() throws ApiException {
    return getActiveAndFutureSystemNotificationsWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;List&lt;SystemNotification&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SystemNotification>> getActiveAndFutureSystemNotificationsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<SystemNotification>> localVarReturnType = new GenericType<List<SystemNotification>>() {};
    return apiClient.invokeAPI("SystemNotificationResourceApi.getActiveAndFutureSystemNotifications", "/api/system-notifications/active", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param pageable  (required)
   * @return List&lt;SystemNotification&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<SystemNotification> getAllSystemNotifications(Pageable pageable) throws ApiException {
    return getAllSystemNotificationsWithHttpInfo(pageable).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @return ApiResponse&lt;List&lt;SystemNotification&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SystemNotification>> getAllSystemNotificationsWithHttpInfo(Pageable pageable) throws ApiException {
    // Check required parameters
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getAllSystemNotifications");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "pageable", pageable)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<SystemNotification>> localVarReturnType = new GenericType<List<SystemNotification>>() {};
    return apiClient.invokeAPI("SystemNotificationResourceApi.getAllSystemNotifications", "/api/system-notifications", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param notificationId  (required)
   * @return SystemNotification
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public SystemNotification getSystemNotification(Long notificationId) throws ApiException {
    return getSystemNotificationWithHttpInfo(notificationId).getData();
  }

  /**
   * 
   * 
   * @param notificationId  (required)
   * @return ApiResponse&lt;SystemNotification&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SystemNotification> getSystemNotificationWithHttpInfo(Long notificationId) throws ApiException {
    // Check required parameters
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling getSystemNotification");
    }

    // Path parameters
    String localVarPath = "/api/system-notifications/{notificationId}"
            .replaceAll("\\{notificationId}", apiClient.escapeString(notificationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SystemNotification> localVarReturnType = new GenericType<SystemNotification>() {};
    return apiClient.invokeAPI("SystemNotificationResourceApi.getSystemNotification", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
