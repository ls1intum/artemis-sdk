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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
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
    Object localVarPostBody = onlineUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createOnlineUnit");
    }
    
    // verify the required parameter 'onlineUnit' is set
    if (onlineUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUnit' when calling createOnlineUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/online-units"
      .replaceAll("\\{" + "lectureId" + "\\}", apiClient.escapeString(lectureId.toString()));

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

    GenericType<OnlineUnit> localVarReturnType = new GenericType<OnlineUnit>() {};

    return apiClient.invokeAPI("OnlineUnitResourceApi.createOnlineUnit", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'link' is set
    if (link == null) {
      throw new ApiException(400, "Missing the required parameter 'link' when calling getOnlineResource");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/online-units/fetch-online-resource";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "link", link));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OnlineResourceDTO> localVarReturnType = new GenericType<OnlineResourceDTO>() {};

    return apiClient.invokeAPI("OnlineUnitResourceApi.getOnlineResource", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'onlineUnitId' is set
    if (onlineUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUnitId' when calling getOnlineUnit");
    }
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getOnlineUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/online-units/{onlineUnitId}"
      .replaceAll("\\{" + "onlineUnitId" + "\\}", apiClient.escapeString(onlineUnitId.toString()))
      .replaceAll("\\{" + "lectureId" + "\\}", apiClient.escapeString(lectureId.toString()));

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

    GenericType<OnlineUnit> localVarReturnType = new GenericType<OnlineUnit>() {};

    return apiClient.invokeAPI("OnlineUnitResourceApi.getOnlineUnit", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = onlineUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateOnlineUnit");
    }
    
    // verify the required parameter 'onlineUnit' is set
    if (onlineUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUnit' when calling updateOnlineUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/online-units"
      .replaceAll("\\{" + "lectureId" + "\\}", apiClient.escapeString(lectureId.toString()));

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

    GenericType<OnlineUnit> localVarReturnType = new GenericType<OnlineUnit>() {};

    return apiClient.invokeAPI("OnlineUnitResourceApi.updateOnlineUnit", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
