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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'settingsKey' is set
    if (settingsKey == null) {
      throw new ApiException(400, "Missing the required parameter 'settingsKey' when calling deleteGuidedTourSetting");
    }
    
    // create path and map variables
    String localVarPath = "/api/guided-tour-settings/{settingsKey}"
      .replaceAll("\\{" + "settingsKey" + "\\}", apiClient.escapeString(settingsKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Set<GuidedTourSetting>> localVarReturnType = new GenericType<Set<GuidedTourSetting>>() {};

    return apiClient.invokeAPI("GuidedTourSettingsResourceApi.deleteGuidedTourSetting", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = guidedTourSetting;
    
    // verify the required parameter 'guidedTourSetting' is set
    if (guidedTourSetting == null) {
      throw new ApiException(400, "Missing the required parameter 'guidedTourSetting' when calling updateGuidedTourSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/guided-tour-settings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Set<GuidedTourSetting>> localVarReturnType = new GenericType<Set<GuidedTourSetting>>() {};

    return apiClient.invokeAPI("GuidedTourSettingsResourceApi.updateGuidedTourSettings", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
