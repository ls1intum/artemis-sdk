package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.OnlineResourceDTO;
import de.tum.cit.ase.artemis.sdk.model.OnlineUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class OnlineUnitResourceApi {
  private ApiClient apiClient;

  public OnlineUnitResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OnlineUnitResourceApi(ApiClient apiClient) {
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
   * @param lectureId  (required)
   * @param onlineUnit  (required)
   * @return OnlineUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public OnlineUnit createOnlineUnit(Long lectureId, OnlineUnit onlineUnit) throws ApiException {
    return createOnlineUnitWithHttpInfo(lectureId, onlineUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param onlineUnit  (required)
   * @return ApiResponse&lt;OnlineUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OnlineUnit> createOnlineUnitWithHttpInfo(Long lectureId, OnlineUnit onlineUnit) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createOnlineUnit");
    }
    if (onlineUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUnit' when calling createOnlineUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/online-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<OnlineUnit> localVarReturnType = new GenericType<OnlineUnit>() {};
    return apiClient.invokeAPI("OnlineUnitResourceApi.createOnlineUnit", localVarPath, "POST", new ArrayList<>(), onlineUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param link  (required)
   * @return OnlineResourceDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public OnlineResourceDTO getOnlineResource(String link) throws ApiException {
    return getOnlineResourceWithHttpInfo(link).getData();
  }

  /**
   * 
   * 
   * @param link  (required)
   * @return ApiResponse&lt;OnlineResourceDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OnlineResourceDTO> getOnlineResourceWithHttpInfo(String link) throws ApiException {
    // Check required parameters
    if (link == null) {
      throw new ApiException(400, "Missing the required parameter 'link' when calling getOnlineResource");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "link", link)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<OnlineResourceDTO> localVarReturnType = new GenericType<OnlineResourceDTO>() {};
    return apiClient.invokeAPI("OnlineUnitResourceApi.getOnlineResource", "/api/lectures/online-units/fetch-online-resource", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param onlineUnitId  (required)
   * @param lectureId  (required)
   * @return OnlineUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public OnlineUnit getOnlineUnit(Long onlineUnitId, Long lectureId) throws ApiException {
    return getOnlineUnitWithHttpInfo(onlineUnitId, lectureId).getData();
  }

  /**
   * 
   * 
   * @param onlineUnitId  (required)
   * @param lectureId  (required)
   * @return ApiResponse&lt;OnlineUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OnlineUnit> getOnlineUnitWithHttpInfo(Long onlineUnitId, Long lectureId) throws ApiException {
    // Check required parameters
    if (onlineUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUnitId' when calling getOnlineUnit");
    }
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getOnlineUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/online-units/{onlineUnitId}"
            .replaceAll("\\{onlineUnitId}", apiClient.escapeString(onlineUnitId.toString()))
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<OnlineUnit> localVarReturnType = new GenericType<OnlineUnit>() {};
    return apiClient.invokeAPI("OnlineUnitResourceApi.getOnlineUnit", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param onlineUnit  (required)
   * @return OnlineUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public OnlineUnit updateOnlineUnit(Long lectureId, OnlineUnit onlineUnit) throws ApiException {
    return updateOnlineUnitWithHttpInfo(lectureId, onlineUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param onlineUnit  (required)
   * @return ApiResponse&lt;OnlineUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OnlineUnit> updateOnlineUnitWithHttpInfo(Long lectureId, OnlineUnit onlineUnit) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateOnlineUnit");
    }
    if (onlineUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUnit' when calling updateOnlineUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/online-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<OnlineUnit> localVarReturnType = new GenericType<OnlineUnit>() {};
    return apiClient.invokeAPI("OnlineUnitResourceApi.updateOnlineUnit", localVarPath, "PUT", new ArrayList<>(), onlineUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
