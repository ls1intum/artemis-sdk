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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'complaintId' is set
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling getComplaintResponseByComplaintId");
    }
    
    // create path and map variables
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}"
      .replaceAll("\\{" + "complaintId" + "\\}", apiClient.escapeString(complaintId.toString()));

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

    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};

    return apiClient.invokeAPI("ComplaintResponseResourceApi.getComplaintResponseByComplaintId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'complaintId' is set
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling lockComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/create-lock"
      .replaceAll("\\{" + "complaintId" + "\\}", apiClient.escapeString(complaintId.toString()));

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

    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};

    return apiClient.invokeAPI("ComplaintResponseResourceApi.lockComplaint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'complaintId' is set
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling refreshLockOnComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/refresh-lock"
      .replaceAll("\\{" + "complaintId" + "\\}", apiClient.escapeString(complaintId.toString()));

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

    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};

    return apiClient.invokeAPI("ComplaintResponseResourceApi.refreshLockOnComplaint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'complaintId' is set
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling removeLockFromComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/remove-lock"
      .replaceAll("\\{" + "complaintId" + "\\}", apiClient.escapeString(complaintId.toString()));

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

    return apiClient.invokeAPI("ComplaintResponseResourceApi.removeLockFromComplaint", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    Object localVarPostBody = complaintResponse;
    
    // verify the required parameter 'complaintId' is set
    if (complaintId == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintId' when calling resolveComplaint");
    }
    
    // verify the required parameter 'complaintResponse' is set
    if (complaintResponse == null) {
      throw new ApiException(400, "Missing the required parameter 'complaintResponse' when calling resolveComplaint");
    }
    
    // create path and map variables
    String localVarPath = "/api/complaint-responses/complaint/{complaintId}/resolve"
      .replaceAll("\\{" + "complaintId" + "\\}", apiClient.escapeString(complaintId.toString()));

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

    GenericType<ComplaintResponse> localVarReturnType = new GenericType<ComplaintResponse>() {};

    return apiClient.invokeAPI("ComplaintResponseResourceApi.resolveComplaint", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
