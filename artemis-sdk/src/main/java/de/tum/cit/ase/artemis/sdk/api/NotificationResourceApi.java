package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CreateSystemNotification200Response;
import de.tum.cit.ase.artemis.sdk.model.Pageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class NotificationResourceApi {
  private ApiClient apiClient;

  public NotificationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationResourceApi(ApiClient apiClient) {
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
   * @param pageable  (required)
   * @return List&lt;CreateSystemNotification200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<CreateSystemNotification200Response> getAllNotificationsForCurrentUserFilteredBySettings(Pageable pageable) throws ApiException {
    return getAllNotificationsForCurrentUserFilteredBySettingsWithHttpInfo(pageable).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @return ApiResponse&lt;List&lt;CreateSystemNotification200Response&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CreateSystemNotification200Response>> getAllNotificationsForCurrentUserFilteredBySettingsWithHttpInfo(Pageable pageable) throws ApiException {
    // Check required parameters
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getAllNotificationsForCurrentUserFilteredBySettings");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "pageable", pageable)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CreateSystemNotification200Response>> localVarReturnType = new GenericType<List<CreateSystemNotification200Response>>() {};
    return apiClient.invokeAPI("NotificationResourceApi.getAllNotificationsForCurrentUserFilteredBySettings", "/api/notifications", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
