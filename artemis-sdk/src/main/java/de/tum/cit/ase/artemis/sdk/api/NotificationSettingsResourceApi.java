package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.NotificationSetting;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class NotificationSettingsResourceApi {
  private ApiClient apiClient;

  public NotificationSettingsResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationSettingsResourceApi(ApiClient apiClient) {
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
   * @return Set&lt;NotificationSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<NotificationSetting> getNotificationSettingsForCurrentUser() throws ApiException {
    return getNotificationSettingsForCurrentUserWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;Set&lt;NotificationSetting&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<NotificationSetting>> getNotificationSettingsForCurrentUserWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<NotificationSetting>> localVarReturnType = new GenericType<Set<NotificationSetting>>() {};
    return apiClient.invokeAPI("NotificationSettingsResourceApi.getNotificationSettingsForCurrentUser", "/api/notification-settings", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param notificationSetting  (required)
   * @return List&lt;NotificationSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<NotificationSetting> saveNotificationSettingsForCurrentUser(List<NotificationSetting> notificationSetting) throws ApiException {
    return saveNotificationSettingsForCurrentUserWithHttpInfo(notificationSetting).getData();
  }

  /**
   * 
   * 
   * @param notificationSetting  (required)
   * @return ApiResponse&lt;List&lt;NotificationSetting&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<NotificationSetting>> saveNotificationSettingsForCurrentUserWithHttpInfo(List<NotificationSetting> notificationSetting) throws ApiException {
    // Check required parameters
    if (notificationSetting == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationSetting' when calling saveNotificationSettingsForCurrentUser");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<NotificationSetting>> localVarReturnType = new GenericType<List<NotificationSetting>>() {};
    return apiClient.invokeAPI("NotificationSettingsResourceApi.saveNotificationSettingsForCurrentUser", "/api/notification-settings", "PUT", new ArrayList<>(), notificationSetting,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
