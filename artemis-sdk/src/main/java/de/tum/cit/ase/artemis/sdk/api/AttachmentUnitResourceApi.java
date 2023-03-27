package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Attachment;
import de.tum.cit.ase.artemis.sdk.model.AttachmentUnit;
import de.tum.cit.ase.artemis.sdk.model.CreateAttachmentUnitsRequest;
import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.LectureUnitInformationDTO;
import de.tum.cit.ase.artemis.sdk.model.SaveMarkdownFileRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
public class AttachmentUnitResourceApi {
  private ApiClient apiClient;

  public AttachmentUnitResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentUnitResourceApi(ApiClient apiClient) {
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
   * @param attachmentUnit  (required)
   * @param attachment  (required)
   * @param _file  (required)
   * @param keepFilename  (optional, default to false)
   * @return AttachmentUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AttachmentUnit createAttachmentUnit(Long lectureId, AttachmentUnit attachmentUnit, Attachment attachment, File _file, Boolean keepFilename) throws ApiException {
    return createAttachmentUnitWithHttpInfo(lectureId, attachmentUnit, attachment, _file, keepFilename).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param attachmentUnit  (required)
   * @param attachment  (required)
   * @param _file  (required)
   * @param keepFilename  (optional, default to false)
   * @return ApiResponse&lt;AttachmentUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AttachmentUnit> createAttachmentUnitWithHttpInfo(Long lectureId, AttachmentUnit attachmentUnit, Attachment attachment, File _file, Boolean keepFilename) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createAttachmentUnit");
    }
    
    // verify the required parameter 'attachmentUnit' is set
    if (attachmentUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnit' when calling createAttachmentUnit");
    }
    
    // verify the required parameter 'attachment' is set
    if (attachment == null) {
      throw new ApiException(400, "Missing the required parameter 'attachment' when calling createAttachmentUnit");
    }
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling createAttachmentUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/attachment-units"
      .replaceAll("\\{" + "lectureId" + "\\}", apiClient.escapeString(lectureId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keepFilename", keepFilename));

    
    
    if (attachmentUnit != null)
      localVarFormParams.put("attachmentUnit", attachmentUnit);
if (attachment != null)
      localVarFormParams.put("attachment", attachment);
if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AttachmentUnit> localVarReturnType = new GenericType<AttachmentUnit>() {};

    return apiClient.invokeAPI("AttachmentUnitResourceApi.createAttachmentUnit", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param createAttachmentUnitsRequest  (optional)
   * @return List&lt;AttachmentUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<AttachmentUnit> createAttachmentUnits(Long lectureId, CreateAttachmentUnitsRequest createAttachmentUnitsRequest) throws ApiException {
    return createAttachmentUnitsWithHttpInfo(lectureId, createAttachmentUnitsRequest).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param createAttachmentUnitsRequest  (optional)
   * @return ApiResponse&lt;List&lt;AttachmentUnit&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AttachmentUnit>> createAttachmentUnitsWithHttpInfo(Long lectureId, CreateAttachmentUnitsRequest createAttachmentUnitsRequest) throws ApiException {
    Object localVarPostBody = createAttachmentUnitsRequest;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createAttachmentUnits");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/attachment-units/split"
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

    GenericType<List<AttachmentUnit>> localVarReturnType = new GenericType<List<AttachmentUnit>>() {};

    return apiClient.invokeAPI("AttachmentUnitResourceApi.createAttachmentUnits", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param attachmentUnitId  (required)
   * @param lectureId  (required)
   * @return AttachmentUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AttachmentUnit getAttachmentUnit(Long attachmentUnitId, Long lectureId) throws ApiException {
    return getAttachmentUnitWithHttpInfo(attachmentUnitId, lectureId).getData();
  }

  /**
   * 
   * 
   * @param attachmentUnitId  (required)
   * @param lectureId  (required)
   * @return ApiResponse&lt;AttachmentUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AttachmentUnit> getAttachmentUnitWithHttpInfo(Long attachmentUnitId, Long lectureId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'attachmentUnitId' is set
    if (attachmentUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnitId' when calling getAttachmentUnit");
    }
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getAttachmentUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/attachment-units/{attachmentUnitId}"
      .replaceAll("\\{" + "attachmentUnitId" + "\\}", apiClient.escapeString(attachmentUnitId.toString()))
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

    GenericType<AttachmentUnit> localVarReturnType = new GenericType<AttachmentUnit>() {};

    return apiClient.invokeAPI("AttachmentUnitResourceApi.getAttachmentUnit", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param saveMarkdownFileRequest  (optional)
   * @return LectureUnitInformationDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public LectureUnitInformationDTO getAttachmentUnitsData(Long lectureId, SaveMarkdownFileRequest saveMarkdownFileRequest) throws ApiException {
    return getAttachmentUnitsDataWithHttpInfo(lectureId, saveMarkdownFileRequest).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param saveMarkdownFileRequest  (optional)
   * @return ApiResponse&lt;LectureUnitInformationDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LectureUnitInformationDTO> getAttachmentUnitsDataWithHttpInfo(Long lectureId, SaveMarkdownFileRequest saveMarkdownFileRequest) throws ApiException {
    Object localVarPostBody = saveMarkdownFileRequest;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getAttachmentUnitsData");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/process-units"
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

    GenericType<LectureUnitInformationDTO> localVarReturnType = new GenericType<LectureUnitInformationDTO>() {};

    return apiClient.invokeAPI("AttachmentUnitResourceApi.getAttachmentUnitsData", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param attachmentUnitId  (required)
   * @param attachmentUnit  (required)
   * @param attachment  (required)
   * @param keepFilename  (optional, default to false)
   * @param notificationText  (optional)
   * @param _file  (optional)
   * @return AttachmentUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AttachmentUnit updateAttachmentUnit(Long lectureId, Long attachmentUnitId, AttachmentUnit attachmentUnit, Attachment attachment, Boolean keepFilename, String notificationText, File _file) throws ApiException {
    return updateAttachmentUnitWithHttpInfo(lectureId, attachmentUnitId, attachmentUnit, attachment, keepFilename, notificationText, _file).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param attachmentUnitId  (required)
   * @param attachmentUnit  (required)
   * @param attachment  (required)
   * @param keepFilename  (optional, default to false)
   * @param notificationText  (optional)
   * @param _file  (optional)
   * @return ApiResponse&lt;AttachmentUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AttachmentUnit> updateAttachmentUnitWithHttpInfo(Long lectureId, Long attachmentUnitId, AttachmentUnit attachmentUnit, Attachment attachment, Boolean keepFilename, String notificationText, File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateAttachmentUnit");
    }
    
    // verify the required parameter 'attachmentUnitId' is set
    if (attachmentUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnitId' when calling updateAttachmentUnit");
    }
    
    // verify the required parameter 'attachmentUnit' is set
    if (attachmentUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnit' when calling updateAttachmentUnit");
    }
    
    // verify the required parameter 'attachment' is set
    if (attachment == null) {
      throw new ApiException(400, "Missing the required parameter 'attachment' when calling updateAttachmentUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/attachment-units/{attachmentUnitId}"
      .replaceAll("\\{" + "lectureId" + "\\}", apiClient.escapeString(lectureId.toString()))
      .replaceAll("\\{" + "attachmentUnitId" + "\\}", apiClient.escapeString(attachmentUnitId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keepFilename", keepFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationText", notificationText));

    
    
    if (attachmentUnit != null)
      localVarFormParams.put("attachmentUnit", attachmentUnit);
if (attachment != null)
      localVarFormParams.put("attachment", attachment);
if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AttachmentUnit> localVarReturnType = new GenericType<AttachmentUnit>() {};

    return apiClient.invokeAPI("AttachmentUnitResourceApi.updateAttachmentUnit", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
