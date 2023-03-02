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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/api/admin/audits/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<AuditEvent> localVarReturnType = new GenericType<AuditEvent>() {};

    return apiClient.invokeAPI("AuditResourceApi.get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'pageable' is set
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getAll1");
    }
    
    // verify the required parameter 'fromDate' is set
    if (fromDate == null) {
      throw new ApiException(400, "Missing the required parameter 'fromDate' when calling getAll1");
    }
    
    // verify the required parameter 'toDate' is set
    if (toDate == null) {
      throw new ApiException(400, "Missing the required parameter 'toDate' when calling getAll1");
    }
    
    // create path and map variables
    String localVarPath = "/api/admin/audits";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageable", pageable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromDate", fromDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toDate", toDate));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<AuditEvent>> localVarReturnType = new GenericType<List<AuditEvent>>() {};

    return apiClient.invokeAPI("AuditResourceApi.getAll1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
