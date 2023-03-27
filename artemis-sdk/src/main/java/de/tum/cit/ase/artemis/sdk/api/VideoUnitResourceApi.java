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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
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
    Object localVarPostBody = videoUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createVideoUnit");
    }
    
    // verify the required parameter 'videoUnit' is set
    if (videoUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'videoUnit' when calling createVideoUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/video-units"
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

    GenericType<VideoUnit> localVarReturnType = new GenericType<VideoUnit>() {};

    return apiClient.invokeAPI("VideoUnitResourceApi.createVideoUnit", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoUnitId' is set
    if (videoUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoUnitId' when calling getVideoUnit");
    }
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getVideoUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/video-units/{videoUnitId}"
      .replaceAll("\\{" + "videoUnitId" + "\\}", apiClient.escapeString(videoUnitId.toString()))
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

    GenericType<VideoUnit> localVarReturnType = new GenericType<VideoUnit>() {};

    return apiClient.invokeAPI("VideoUnitResourceApi.getVideoUnit", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = videoUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateVideoUnit");
    }
    
    // verify the required parameter 'videoUnit' is set
    if (videoUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'videoUnit' when calling updateVideoUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/video-units"
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

    GenericType<VideoUnit> localVarReturnType = new GenericType<VideoUnit>() {};

    return apiClient.invokeAPI("VideoUnitResourceApi.updateVideoUnit", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
