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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createTextUnit");
    }
    if (textUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'textUnit' when calling createTextUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/text-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextUnit> localVarReturnType = new GenericType<TextUnit>() {};
    return apiClient.invokeAPI("TextUnitResourceApi.createTextUnit", localVarPath, "POST", new ArrayList<>(), textUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (textUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'textUnitId' when calling getTextUnit");
    }
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getTextUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/text-units/{textUnitId}"
            .replaceAll("\\{textUnitId}", apiClient.escapeString(textUnitId.toString()))
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TextUnit> localVarReturnType = new GenericType<TextUnit>() {};
    return apiClient.invokeAPI("TextUnitResourceApi.getTextUnit", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateTextUnit");
    }
    if (textUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'textUnit' when calling updateTextUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/text-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TextUnit> localVarReturnType = new GenericType<TextUnit>() {};
    return apiClient.invokeAPI("TextUnitResourceApi.updateTextUnit", localVarPath, "PUT", new ArrayList<>(), textUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
