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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createAttachmentUnit");
    }
    if (attachmentUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnit' when calling createAttachmentUnit");
    }
    if (attachment == null) {
      throw new ApiException(400, "Missing the required parameter 'attachment' when calling createAttachmentUnit");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling createAttachmentUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/attachment-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "keepFilename", keepFilename)
    );

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("attachmentUnit", attachmentUnit);
    localVarFormParams.put("attachment", attachment);
    localVarFormParams.put("file", _file);

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<AttachmentUnit> localVarReturnType = new GenericType<AttachmentUnit>() {};
    return apiClient.invokeAPI("AttachmentUnitResourceApi.createAttachmentUnit", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createAttachmentUnits");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/attachment-units/split"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<AttachmentUnit>> localVarReturnType = new GenericType<List<AttachmentUnit>>() {};
    return apiClient.invokeAPI("AttachmentUnitResourceApi.createAttachmentUnits", localVarPath, "POST", new ArrayList<>(), createAttachmentUnitsRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (attachmentUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnitId' when calling getAttachmentUnit");
    }
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getAttachmentUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/attachment-units/{attachmentUnitId}"
            .replaceAll("\\{attachmentUnitId}", apiClient.escapeString(attachmentUnitId.toString()))
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<AttachmentUnit> localVarReturnType = new GenericType<AttachmentUnit>() {};
    return apiClient.invokeAPI("AttachmentUnitResourceApi.getAttachmentUnit", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getAttachmentUnitsData");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/process-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<LectureUnitInformationDTO> localVarReturnType = new GenericType<LectureUnitInformationDTO>() {};
    return apiClient.invokeAPI("AttachmentUnitResourceApi.getAttachmentUnitsData", localVarPath, "POST", new ArrayList<>(), saveMarkdownFileRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling updateAttachmentUnit");
    }
    if (attachmentUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnitId' when calling updateAttachmentUnit");
    }
    if (attachmentUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnit' when calling updateAttachmentUnit");
    }
    if (attachment == null) {
      throw new ApiException(400, "Missing the required parameter 'attachment' when calling updateAttachmentUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/attachment-units/{attachmentUnitId}"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()))
            .replaceAll("\\{attachmentUnitId}", apiClient.escapeString(attachmentUnitId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "keepFilename", keepFilename)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationText", notificationText));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("attachmentUnit", attachmentUnit);
    localVarFormParams.put("attachment", attachment);
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<AttachmentUnit> localVarReturnType = new GenericType<AttachmentUnit>() {};
    return apiClient.invokeAPI("AttachmentUnitResourceApi.updateAttachmentUnit", localVarPath, "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
