package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GuidedTourSetting;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class GuidedTourSettingsResourceApi {
  private ApiClient apiClient;

  public GuidedTourSettingsResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GuidedTourSettingsResourceApi(ApiClient apiClient) {
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
   * @param settingsKey  (required)
   * @return Set&lt;GuidedTourSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<GuidedTourSetting> deleteGuidedTourSetting(String settingsKey) throws ApiException {
    return deleteGuidedTourSettingWithHttpInfo(settingsKey).getData();
  }

  /**
   * 
   * 
   * @param settingsKey  (required)
   * @return ApiResponse&lt;Set&lt;GuidedTourSetting&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<GuidedTourSetting>> deleteGuidedTourSettingWithHttpInfo(String settingsKey) throws ApiException {
    // Check required parameters
    if (settingsKey == null) {
      throw new ApiException(400, "Missing the required parameter 'settingsKey' when calling deleteGuidedTourSetting");
    }

    // Path parameters
    String localVarPath = "/api/guided-tour-settings/{settingsKey}"
            .replaceAll("\\{settingsKey}", apiClient.escapeString(settingsKey));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<GuidedTourSetting>> localVarReturnType = new GenericType<Set<GuidedTourSetting>>() {};
    return apiClient.invokeAPI("GuidedTourSettingsResourceApi.deleteGuidedTourSetting", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param guidedTourSetting  (required)
   * @return Set&lt;GuidedTourSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<GuidedTourSetting> updateGuidedTourSettings(Set<GuidedTourSetting> guidedTourSetting) throws ApiException {
    return updateGuidedTourSettingsWithHttpInfo(guidedTourSetting).getData();
  }

  /**
   * 
   * 
   * @param guidedTourSetting  (required)
   * @return ApiResponse&lt;Set&lt;GuidedTourSetting&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<GuidedTourSetting>> updateGuidedTourSettingsWithHttpInfo(Set<GuidedTourSetting> guidedTourSetting) throws ApiException {
    // Check required parameters
    if (guidedTourSetting == null) {
      throw new ApiException(400, "Missing the required parameter 'guidedTourSetting' when calling updateGuidedTourSettings");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Set<GuidedTourSetting>> localVarReturnType = new GenericType<Set<GuidedTourSetting>>() {};
    return apiClient.invokeAPI("GuidedTourSettingsResourceApi.updateGuidedTourSettings", "/api/guided-tour-settings", "PUT", new ArrayList<>(), guidedTourSetting,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
