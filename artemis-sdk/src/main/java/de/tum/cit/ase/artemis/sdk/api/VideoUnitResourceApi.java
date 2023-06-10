package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.VideoUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class VideoUnitResourceApi {
  private ApiClient apiClient;

  public VideoUnitResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VideoUnitResourceApi(ApiClient apiClient) {
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
   * @param videoUnit  (required)
   * @return VideoUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public VideoUnit createVideoUnit(Long lectureId, VideoUnit videoUnit) throws ApiException {
    return createVideoUnitWithHttpInfo(lectureId, videoUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param videoUnit  (required)
   * @return ApiResponse&lt;VideoUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VideoUnit> createVideoUnitWithHttpInfo(Long lectureId, VideoUnit videoUnit) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createVideoUnit");
    }
    if (videoUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'videoUnit' when calling createVideoUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/video-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<VideoUnit> localVarReturnType = new GenericType<VideoUnit>() {};
    return apiClient.invokeAPI("VideoUnitResourceApi.createVideoUnit", localVarPath, "POST", new ArrayList<>(), videoUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param videoUnitId  (required)
   * @param lectureId  (required)
   * @return VideoUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public VideoUnit getVideoUnit(Long videoUnitId, Long lectureId) throws ApiException {
    return getVideoUnitWithHttpInfo(videoUnitId, lectureId).getData();
  }

  /**
   * 
   * 
   * @param videoUnitId  (required)
   * @param lectureId  (required)
   * @return ApiResponse&lt;VideoUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VideoUnit> getVideoUnitWithHttpInfo(Long videoUnitId, Long lectureId) throws ApiException {
    // Check required parameters
    if (videoUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoUnitId' when calling getVideoUnit");
    }
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getVideoUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/video-units/{videoUnitId}"
            .replaceAll("\\{videoUnitId}", apiClient.escapeString(videoUnitId.toString()))
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<VideoUnit> localVarReturnType = new GenericType<VideoUnit>() {};
    return apiClient.invokeAPI("VideoUnitResourceApi.getVideoUnit", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param videoUnit  (required)
   * @return VideoUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public VideoUnit updateVideoUnit(Long lectureId, VideoUnit videoUnit) throws ApiException {
    return updateVideoUnitWithHttpInfo(lectureId, videoUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param videoUnit  (required)
   * @return ApiResponse&lt;VideoUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VideoUnit> updateVideoUnitWithHttpInfo(Long lectureId, VideoUnit videoUnit) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateVideoUnit");
    }
    if (videoUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'videoUnit' when calling updateVideoUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/video-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<VideoUnit> localVarReturnType = new GenericType<VideoUnit>() {};
    return apiClient.invokeAPI("VideoUnitResourceApi.updateVideoUnit", localVarPath, "PUT", new ArrayList<>(), videoUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
