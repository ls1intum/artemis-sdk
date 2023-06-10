package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class PlantUmlResourceApi {
  private ApiClient apiClient;

  public PlantUmlResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PlantUmlResourceApi(ApiClient apiClient) {
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
   * @param plantuml  (required)
   * @param useDarkTheme  (optional, default to false)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> generatePng(String plantuml, Boolean useDarkTheme) throws ApiException {
    return generatePngWithHttpInfo(plantuml, useDarkTheme).getData();
  }

  /**
   * 
   * 
   * @param plantuml  (required)
   * @param useDarkTheme  (optional, default to false)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> generatePngWithHttpInfo(String plantuml, Boolean useDarkTheme) throws ApiException {
    // Check required parameters
    if (plantuml == null) {
      throw new ApiException(400, "Missing the required parameter 'plantuml' when calling generatePng");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "plantuml", plantuml)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useDarkTheme", useDarkTheme));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("PlantUmlResourceApi.generatePng", "/api/plantuml/png", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param plantuml  (required)
   * @param useDarkTheme  (optional, default to false)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String generateSvg(String plantuml, Boolean useDarkTheme) throws ApiException {
    return generateSvgWithHttpInfo(plantuml, useDarkTheme).getData();
  }

  /**
   * 
   * 
   * @param plantuml  (required)
   * @param useDarkTheme  (optional, default to false)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> generateSvgWithHttpInfo(String plantuml, Boolean useDarkTheme) throws ApiException {
    // Check required parameters
    if (plantuml == null) {
      throw new ApiException(400, "Missing the required parameter 'plantuml' when calling generateSvg");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "plantuml", plantuml)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useDarkTheme", useDarkTheme));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("PlantUmlResourceApi.generateSvg", "/api/plantuml/svg", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
