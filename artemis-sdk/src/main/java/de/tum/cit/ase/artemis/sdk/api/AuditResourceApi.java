package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.AuditEvent;
import java.time.LocalDate;
import de.tum.cit.ase.artemis.sdk.model.Pageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class AuditResourceApi {
  private ApiClient apiClient;

  public AuditResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditResourceApi(ApiClient apiClient) {
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
   * @param id  (required)
   * @return AuditEvent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AuditEvent get(Long id) throws ApiException {
    return getWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ApiResponse&lt;AuditEvent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AuditEvent> getWithHttpInfo(Long id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling get");
    }

    // Path parameters
    String localVarPath = "/api/admin/audits/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<AuditEvent> localVarReturnType = new GenericType<AuditEvent>() {};
    return apiClient.invokeAPI("AuditResourceApi.get", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param pageable  (required)
   * @param fromDate  (required)
   * @param toDate  (required)
   * @return List&lt;AuditEvent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<AuditEvent> getAll1(Pageable pageable, LocalDate fromDate, LocalDate toDate) throws ApiException {
    return getAll1WithHttpInfo(pageable, fromDate, toDate).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @param fromDate  (required)
   * @param toDate  (required)
   * @return ApiResponse&lt;List&lt;AuditEvent&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AuditEvent>> getAll1WithHttpInfo(Pageable pageable, LocalDate fromDate, LocalDate toDate) throws ApiException {
    // Check required parameters
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getAll1");
    }
    if (fromDate == null) {
      throw new ApiException(400, "Missing the required parameter 'fromDate' when calling getAll1");
    }
    if (toDate == null) {
      throw new ApiException(400, "Missing the required parameter 'toDate' when calling getAll1");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "pageable", pageable)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromDate", fromDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toDate", toDate));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<AuditEvent>> localVarReturnType = new GenericType<List<AuditEvent>>() {};
    return apiClient.invokeAPI("AuditResourceApi.getAll1", "/api/admin/audits", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
