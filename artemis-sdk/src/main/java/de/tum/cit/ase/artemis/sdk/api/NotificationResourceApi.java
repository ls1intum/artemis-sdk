package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.Pageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T15:54:21.223567Z[Etc/UTC]")
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
   * @param getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner  (required)
   * @return GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner createNotification(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner) throws ApiException {
    return createNotificationWithHttpInfo(getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner).getData();
  }

  /**
   * 
   * 
   * @param getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner  (required)
   * @return ApiResponse&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> createNotificationWithHttpInfo(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner) throws ApiException {
    Object localVarPostBody = getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner;
    
    // verify the required parameter 'getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner' is set
    if (getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner == null) {
      throw new ApiException(400, "Missing the required parameter 'getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner' when calling createNotification");
    }
    
    // create path and map variables
    String localVarPath = "/api/notifications";

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

    GenericType<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> localVarReturnType = new GenericType<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner>() {};

    return apiClient.invokeAPI("NotificationResourceApi.createNotification", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteNotification(Long id) throws ApiException {
    deleteNotificationWithHttpInfo(id);
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteNotificationWithHttpInfo(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNotification");
    }
    
    // create path and map variables
    String localVarPath = "/api/notifications/{id}"
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

    return apiClient.invokeAPI("NotificationResourceApi.deleteNotification", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param pageable  (required)
   * @return List&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> getAllNotificationsForCurrentUserFilteredBySettings(Pageable pageable) throws ApiException {
    return getAllNotificationsForCurrentUserFilteredBySettingsWithHttpInfo(pageable).getData();
  }

  /**
   * 
   * 
   * @param pageable  (required)
   * @return ApiResponse&lt;List&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner>> getAllNotificationsForCurrentUserFilteredBySettingsWithHttpInfo(Pageable pageable) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pageable' is set
    if (pageable == null) {
      throw new ApiException(400, "Missing the required parameter 'pageable' when calling getAllNotificationsForCurrentUserFilteredBySettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/notifications";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageable", pageable));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner>> localVarReturnType = new GenericType<List<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner>>() {};

    return apiClient.invokeAPI("NotificationResourceApi.getAllNotificationsForCurrentUserFilteredBySettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @return GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getNotification(Long id) throws ApiException {
    return getNotificationWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ApiResponse&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> getNotificationWithHttpInfo(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotification");
    }
    
    // create path and map variables
    String localVarPath = "/api/notifications/{id}"
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

    GenericType<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> localVarReturnType = new GenericType<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner>() {};

    return apiClient.invokeAPI("NotificationResourceApi.getNotification", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner  (required)
   * @return GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner updateNotification(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner) throws ApiException {
    return updateNotificationWithHttpInfo(getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner).getData();
  }

  /**
   * 
   * 
   * @param getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner  (required)
   * @return ApiResponse&lt;GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> updateNotificationWithHttpInfo(GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner) throws ApiException {
    Object localVarPostBody = getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner;
    
    // verify the required parameter 'getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner' is set
    if (getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner == null) {
      throw new ApiException(400, "Missing the required parameter 'getAllNotificationsForCurrentUserFilteredBySettings200ResponseInner' when calling updateNotification");
    }
    
    // create path and map variables
    String localVarPath = "/api/notifications";

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

    GenericType<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner> localVarReturnType = new GenericType<GetAllNotificationsForCurrentUserFilteredBySettings200ResponseInner>() {};

    return apiClient.invokeAPI("NotificationResourceApi.updateNotification", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
