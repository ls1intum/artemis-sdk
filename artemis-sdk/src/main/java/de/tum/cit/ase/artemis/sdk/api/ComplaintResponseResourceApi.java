package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ComplaintResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class ComplaintResponseResourceApi {
  private ApiClient apiClient;

  public ComplaintResponseResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ComplaintResponseResourceApi(ApiClient apiClient) {
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
   * @param complaintId  (required)
   * @return ComplaintResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ComplaintResponse getComplaintResponseByComplaintId(Long complaintId) throws ApiException {
    return getComplaintResponseByComplaintIdWithHttpInfo(complaintId).getData();
  }

  /**
   * 
   * 
   * @param complaintId  (required)
   * @return ApiResponse&lt;ComplaintResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ComplaintResponse> getComplaintResponseByComplaintIdWithHttpInfo(Long complaintId) throws ApiException {
    // Check required parameters
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling getComplaintResponseByComplaintId");
    }

    // Path parameters
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}"
            .replaceAll("\\{complaintId}", apiClient.escapeString(complaintId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};
    return apiClient.invokeAPI("ComplaintResponseResourceApi.getComplaintResponseByComplaintId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param complaintId  (required)
   * @return ComplaintResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ComplaintResponse lockComplaint(Long complaintId) throws ApiException {
    return lockComplaintWithHttpInfo(complaintId).getData();
  }

  /**
   * 
   * 
   * @param complaintId  (required)
   * @return ApiResponse&lt;ComplaintResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ComplaintResponse> lockComplaintWithHttpInfo(Long complaintId) throws ApiException {
    // Check required parameters
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling lockComplaint");
    }

    // Path parameters
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/create-lock"
            .replaceAll("\\{complaintId}", apiClient.escapeString(complaintId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};
    return apiClient.invokeAPI("ComplaintResponseResourceApi.lockComplaint", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param complaintId  (required)
   * @return ComplaintResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ComplaintResponse refreshLockOnComplaint(Long complaintId) throws ApiException {
    return refreshLockOnComplaintWithHttpInfo(complaintId).getData();
  }

  /**
   * 
   * 
   * @param complaintId  (required)
   * @return ApiResponse&lt;ComplaintResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ComplaintResponse> refreshLockOnComplaintWithHttpInfo(Long complaintId) throws ApiException {
    // Check required parameters
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling refreshLockOnComplaint");
    }

    // Path parameters
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/refresh-lock"
            .replaceAll("\\{complaintId}", apiClient.escapeString(complaintId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};
    return apiClient.invokeAPI("ComplaintResponseResourceApi.refreshLockOnComplaint", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param complaintId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeLockFromComplaint(Long complaintId) throws ApiException {
    removeLockFromComplaintWithHttpInfo(complaintId);
  }

  /**
   * 
   * 
   * @param complaintId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeLockFromComplaintWithHttpInfo(Long complaintId) throws ApiException {
    // Check required parameters
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling removeLockFromComplaint");
    }

    // Path parameters
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/remove-lock"
            .replaceAll("\\{complaintId}", apiClient.escapeString(complaintId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ComplaintResponseResourceApi.removeLockFromComplaint", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param complaintId  (required)
   * @param complaintResponse  (required)
   * @return ComplaintResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ComplaintResponse resolveComplaint(Long complaintId, ComplaintResponse complaintResponse) throws ApiException {
    return resolveComplaintWithHttpInfo(complaintId, complaintResponse).getData();
  }

  /**
   * 
   * 
   * @param complaintId  (required)
   * @param complaintResponse  (required)
   * @return ApiResponse&lt;ComplaintResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ComplaintResponse> resolveComplaintWithHttpInfo(Long complaintId, ComplaintResponse complaintResponse) throws ApiException {
    // Check required parameters
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling resolveComplaint");
    }
    if (complaintResponse == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintResponse' when calling resolveComplaint");
    }

    // Path parameters
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/resolve"
            .replaceAll("\\{complaintId}", apiClient.escapeString(complaintId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};
    return apiClient.invokeAPI("ComplaintResponseResourceApi.resolveComplaint", localVarPath, "PUT", new ArrayList<>(), complaintResponse,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
