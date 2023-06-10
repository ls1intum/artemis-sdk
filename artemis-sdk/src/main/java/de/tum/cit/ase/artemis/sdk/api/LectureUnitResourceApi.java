package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.UpdateLectureUnitsOrder200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class LectureUnitResourceApi {
  private ApiClient apiClient;

  public LectureUnitResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LectureUnitResourceApi(ApiClient apiClient) {
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
   * @param lectureUnitId  (required)
   * @param lectureId  (required)
   * @param completed  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void completeLectureUnit(Long lectureUnitId, Long lectureId, Boolean completed) throws ApiException {
    completeLectureUnitWithHttpInfo(lectureUnitId, lectureId, completed);
  }

  /**
   * 
   * 
   * @param lectureUnitId  (required)
   * @param lectureId  (required)
   * @param completed  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> completeLectureUnitWithHttpInfo(Long lectureUnitId, Long lectureId, Boolean completed) throws ApiException {
    // Check required parameters
    if (lectureUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureUnitId' when calling completeLectureUnit");
    }
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling completeLectureUnit");
    }
    if (completed == null) {
      throw new ApiException(400, "Missing the required parameter 'completed' when calling completeLectureUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/lecture-units/{lectureUnitId}/completion"
            .replaceAll("\\{lectureUnitId}", apiClient.escapeString(lectureUnitId.toString()))
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "completed", completed)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("LectureUnitResourceApi.completeLectureUnit", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param lectureUnitId  (required)
   * @param lectureId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteLectureUnit(Long lectureUnitId, Long lectureId) throws ApiException {
    deleteLectureUnitWithHttpInfo(lectureUnitId, lectureId);
  }

  /**
   * 
   * 
   * @param lectureUnitId  (required)
   * @param lectureId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteLectureUnitWithHttpInfo(Long lectureUnitId, Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureUnitId' when calling deleteLectureUnit");
    }
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling deleteLectureUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/lecture-units/{lectureUnitId}"
            .replaceAll("\\{lectureUnitId}", apiClient.escapeString(lectureUnitId.toString()))
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("LectureUnitResourceApi.deleteLectureUnit", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param requestBody  (required)
   * @return List&lt;UpdateLectureUnitsOrder200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<UpdateLectureUnitsOrder200ResponseInner> updateLectureUnitsOrder(Long lectureId, List<Long> requestBody) throws ApiException {
    return updateLectureUnitsOrderWithHttpInfo(lectureId, requestBody).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;List&lt;UpdateLectureUnitsOrder200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UpdateLectureUnitsOrder200ResponseInner>> updateLectureUnitsOrderWithHttpInfo(Long lectureId, List<Long> requestBody) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateLectureUnitsOrder");
    }
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling updateLectureUnitsOrder");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/lecture-units-order"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<UpdateLectureUnitsOrder200ResponseInner>> localVarReturnType = new GenericType<List<UpdateLectureUnitsOrder200ResponseInner>>() {};
    return apiClient.invokeAPI("LectureUnitResourceApi.updateLectureUnitsOrder", localVarPath, "PUT", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
