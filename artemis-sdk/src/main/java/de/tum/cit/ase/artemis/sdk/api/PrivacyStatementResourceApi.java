package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.PrivacyStatement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class PrivacyStatementResourceApi {
  private ApiClient apiClient;

  public PrivacyStatementResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PrivacyStatementResourceApi(ApiClient apiClient) {
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
   * @param language  (required)
   * @return PrivacyStatement
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PrivacyStatement getPrivacyStatement(String language) throws ApiException {
    return getPrivacyStatementWithHttpInfo(language).getData();
  }

  /**
   * 
   * 
   * @param language  (required)
   * @return ApiResponse&lt;PrivacyStatement&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PrivacyStatement> getPrivacyStatementWithHttpInfo(String language) throws ApiException {
    // Check required parameters
    if (language == null) {
      throw new ApiException(400, "Missing the required parameter 'language' when calling getPrivacyStatement");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "language", language)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PrivacyStatement> localVarReturnType = new GenericType<PrivacyStatement>() {};
    return apiClient.invokeAPI("PrivacyStatementResourceApi.getPrivacyStatement", "/api/privacy-statement", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param language  (required)
   * @return PrivacyStatement
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PrivacyStatement getPrivacyStatementForUpdate(String language) throws ApiException {
    return getPrivacyStatementForUpdateWithHttpInfo(language).getData();
  }

  /**
   * 
   * 
   * @param language  (required)
   * @return ApiResponse&lt;PrivacyStatement&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PrivacyStatement> getPrivacyStatementForUpdateWithHttpInfo(String language) throws ApiException {
    // Check required parameters
    if (language == null) {
      throw new ApiException(400, "Missing the required parameter 'language' when calling getPrivacyStatementForUpdate");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "language", language)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PrivacyStatement> localVarReturnType = new GenericType<PrivacyStatement>() {};
    return apiClient.invokeAPI("PrivacyStatementResourceApi.getPrivacyStatementForUpdate", "/api/privacy-statement-for-update", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param privacyStatement  (required)
   * @return PrivacyStatement
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public PrivacyStatement updatePrivacyStatement(PrivacyStatement privacyStatement) throws ApiException {
    return updatePrivacyStatementWithHttpInfo(privacyStatement).getData();
  }

  /**
   * 
   * 
   * @param privacyStatement  (required)
   * @return ApiResponse&lt;PrivacyStatement&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PrivacyStatement> updatePrivacyStatementWithHttpInfo(PrivacyStatement privacyStatement) throws ApiException {
    // Check required parameters
    if (privacyStatement == null) {
      throw new ApiException(400, "Missing the required parameter 'privacyStatement' when calling updatePrivacyStatement");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<PrivacyStatement> localVarReturnType = new GenericType<PrivacyStatement>() {};
    return apiClient.invokeAPI("PrivacyStatementResourceApi.updatePrivacyStatement", "/api/privacy-statement", "PUT", new ArrayList<>(), privacyStatement,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
