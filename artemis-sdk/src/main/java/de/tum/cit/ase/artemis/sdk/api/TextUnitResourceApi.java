package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.TextUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class TextUnitResourceApi {
  private ApiClient apiClient;

  public TextUnitResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TextUnitResourceApi(ApiClient apiClient) {
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
   * @param textUnit  (required)
   * @return TextUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextUnit createTextUnit(Long lectureId, TextUnit textUnit) throws ApiException {
    return createTextUnitWithHttpInfo(lectureId, textUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param textUnit  (required)
   * @return ApiResponse&lt;TextUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextUnit> createTextUnitWithHttpInfo(Long lectureId, TextUnit textUnit) throws ApiException {
    Object localVarPostBody = textUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createTextUnit");
    }
    
    // verify the required parameter 'textUnit' is set
    if (textUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'textUnit' when calling createTextUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/text-units"
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

    GenericType<TextUnit> localVarReturnType = new GenericType<TextUnit>() {};

    return apiClient.invokeAPI("TextUnitResourceApi.createTextUnit", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param textUnitId  (required)
   * @param lectureId  (required)
   * @return TextUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextUnit getTextUnit(Long textUnitId, Long lectureId) throws ApiException {
    return getTextUnitWithHttpInfo(textUnitId, lectureId).getData();
  }

  /**
   * 
   * 
   * @param textUnitId  (required)
   * @param lectureId  (required)
   * @return ApiResponse&lt;TextUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextUnit> getTextUnitWithHttpInfo(Long textUnitId, Long lectureId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'textUnitId' is set
    if (textUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'textUnitId' when calling getTextUnit");
    }
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getTextUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/text-units/{textUnitId}"
      .replaceAll("\\{" + "textUnitId" + "\\}", apiClient.escapeString(textUnitId.toString()))
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

    GenericType<TextUnit> localVarReturnType = new GenericType<TextUnit>() {};

    return apiClient.invokeAPI("TextUnitResourceApi.getTextUnit", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param textUnit  (required)
   * @return TextUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextUnit updateTextUnit(Long lectureId, TextUnit textUnit) throws ApiException {
    return updateTextUnitWithHttpInfo(lectureId, textUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param textUnit  (required)
   * @return ApiResponse&lt;TextUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextUnit> updateTextUnitWithHttpInfo(Long lectureId, TextUnit textUnit) throws ApiException {
    Object localVarPostBody = textUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateTextUnit");
    }
    
    // verify the required parameter 'textUnit' is set
    if (textUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'textUnit' when calling updateTextUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/text-units"
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

    GenericType<TextUnit> localVarReturnType = new GenericType<TextUnit>() {};

    return apiClient.invokeAPI("TextUnitResourceApi.updateTextUnit", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
