package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.SaveMarkdownFileRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T15:20:01.980101Z[Etc/UTC]")
public class FileResourceApi {
  private ApiClient apiClient;

  public FileResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileResourceApi(ApiClient apiClient) {
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
   * @param attachmentUnitId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getAttachmentUnitAttachment(Long attachmentUnitId, String filename) throws ApiException {
    return getAttachmentUnitAttachmentWithHttpInfo(attachmentUnitId, filename).getData();
  }

  /**
   * 
   * 
   * @param attachmentUnitId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getAttachmentUnitAttachmentWithHttpInfo(Long attachmentUnitId, String filename) throws ApiException {
    // Check required parameters
    if (attachmentUnitId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentUnitId' when calling getAttachmentUnitAttachment");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getAttachmentUnitAttachment");
    }

    // Path parameters
    String localVarPath = "/api/files/attachments/attachment-unit/{attachmentUnitId}/{filename}"
            .replaceAll("\\{attachmentUnitId}", apiClient.escapeString(attachmentUnitId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getAttachmentUnitAttachment", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getCourseIcon(Long courseId, String filename) throws ApiException {
    return getCourseIconWithHttpInfo(courseId, filename).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getCourseIconWithHttpInfo(Long courseId, String filename) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseIcon");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getCourseIcon");
    }

    // Path parameters
    String localVarPath = "/api/files/course/icons/{courseId}/{filename}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getCourseIcon", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param questionId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getDragAndDropBackgroundFile(Long questionId, String filename) throws ApiException {
    return getDragAndDropBackgroundFileWithHttpInfo(questionId, filename).getData();
  }

  /**
   * 
   * 
   * @param questionId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getDragAndDropBackgroundFileWithHttpInfo(Long questionId, String filename) throws ApiException {
    // Check required parameters
    if (questionId == null) {
      throw new ApiException(400, "Missing the required parameter 'questionId' when calling getDragAndDropBackgroundFile");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getDragAndDropBackgroundFile");
    }

    // Path parameters
    String localVarPath = "/api/files/drag-and-drop/backgrounds/{questionId}/{filename}"
            .replaceAll("\\{questionId}", apiClient.escapeString(questionId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getDragAndDropBackgroundFile", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param dragItemId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getDragItemFile(Long dragItemId, String filename) throws ApiException {
    return getDragItemFileWithHttpInfo(dragItemId, filename).getData();
  }

  /**
   * 
   * 
   * @param dragItemId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getDragItemFileWithHttpInfo(Long dragItemId, String filename) throws ApiException {
    // Check required parameters
    if (dragItemId == null) {
      throw new ApiException(400, "Missing the required parameter 'dragItemId' when calling getDragItemFile");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getDragItemFile");
    }

    // Path parameters
    String localVarPath = "/api/files/drag-and-drop/drag-items/{dragItemId}/{filename}"
            .replaceAll("\\{dragItemId}", apiClient.escapeString(dragItemId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getDragItemFile", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examUserId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getExamUserImage(Long examUserId, String filename) throws ApiException {
    return getExamUserImageWithHttpInfo(examUserId, filename).getData();
  }

  /**
   * 
   * 
   * @param examUserId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getExamUserImageWithHttpInfo(Long examUserId, String filename) throws ApiException {
    // Check required parameters
    if (examUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'examUserId' when calling getExamUserImage");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getExamUserImage");
    }

    // Path parameters
    String localVarPath = "/api/files/exam-user/{examUserId}/{filename}"
            .replaceAll("\\{examUserId}", apiClient.escapeString(examUserId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getExamUserImage", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getFileUploadSubmission(Long exerciseId, Long submissionId, String filename) throws ApiException {
    return getFileUploadSubmissionWithHttpInfo(exerciseId, submissionId, filename).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param submissionId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getFileUploadSubmissionWithHttpInfo(Long exerciseId, Long submissionId, String filename) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getFileUploadSubmission");
    }
    if (submissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionId' when calling getFileUploadSubmission");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getFileUploadSubmission");
    }

    // Path parameters
    String localVarPath = "/api/files/file-upload-exercises/{exerciseId}/submissions/{submissionId}/{filename}"
            .replaceAll("\\{exerciseId}", apiClient.escapeString(exerciseId.toString()))
            .replaceAll("\\{submissionId}", apiClient.escapeString(submissionId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getFileUploadSubmission", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getLectureAttachment(Long lectureId, String filename) throws ApiException {
    return getLectureAttachmentWithHttpInfo(lectureId, filename).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getLectureAttachmentWithHttpInfo(Long lectureId, String filename) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getLectureAttachment");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getLectureAttachment");
    }

    // Path parameters
    String localVarPath = "/api/files/attachments/lecture/{lectureId}/{filename}"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getLectureAttachment", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getLecturePdfAttachmentsMerged(Long lectureId) throws ApiException {
    return getLecturePdfAttachmentsMergedWithHttpInfo(lectureId).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getLecturePdfAttachmentsMergedWithHttpInfo(Long lectureId) throws ApiException {
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getLecturePdfAttachmentsMerged");
    }

    // Path parameters
    String localVarPath = "/api/files/attachments/lecture/{lectureId}/merge-pdf"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getLecturePdfAttachmentsMerged", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getMarkdownFile(String filename) throws ApiException {
    return getMarkdownFileWithHttpInfo(filename).getData();
  }

  /**
   * 
   * 
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getMarkdownFileWithHttpInfo(String filename) throws ApiException {
    // Check required parameters
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getMarkdownFile");
    }

    // Path parameters
    String localVarPath = "/api/files/markdown/{filename}"
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getMarkdownFile", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getTempFile(String filename) throws ApiException {
    return getTempFileWithHttpInfo(filename).getData();
  }

  /**
   * 
   * 
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getTempFileWithHttpInfo(String filename) throws ApiException {
    // Check required parameters
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getTempFile");
    }

    // Path parameters
    String localVarPath = "/api/files/temp/{filename}"
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getTempFile", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param language  (required)
   * @param projectType  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getTemplateFile(String language, String projectType, String filename) throws ApiException {
    return getTemplateFileWithHttpInfo(language, projectType, filename).getData();
  }

  /**
   * 
   * 
   * @param language  (required)
   * @param projectType  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getTemplateFileWithHttpInfo(String language, String projectType, String filename) throws ApiException {
    // Check required parameters
    if (language == null) {
      throw new ApiException(400, "Missing the required parameter 'language' when calling getTemplateFile");
    }
    if (projectType == null) {
      throw new ApiException(400, "Missing the required parameter 'projectType' when calling getTemplateFile");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getTemplateFile");
    }

    // Path parameters
    String localVarPath = "/api/files/templates/{language}/{projectType}/{filename}"
            .replaceAll("\\{language}", apiClient.escapeString(language))
            .replaceAll("\\{projectType}", apiClient.escapeString(projectType))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getTemplateFile", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param language  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getTemplateFile1(String language, String filename) throws ApiException {
    return getTemplateFile1WithHttpInfo(language, filename).getData();
  }

  /**
   * 
   * 
   * @param language  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getTemplateFile1WithHttpInfo(String language, String filename) throws ApiException {
    // Check required parameters
    if (language == null) {
      throw new ApiException(400, "Missing the required parameter 'language' when calling getTemplateFile1");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getTemplateFile1");
    }

    // Path parameters
    String localVarPath = "/api/files/templates/{language}/{filename}"
            .replaceAll("\\{language}", apiClient.escapeString(language))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getTemplateFile1", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getTemplateFile2(String filename) throws ApiException {
    return getTemplateFile2WithHttpInfo(filename).getData();
  }

  /**
   * 
   * 
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getTemplateFile2WithHttpInfo(String filename) throws ApiException {
    // Check required parameters
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getTemplateFile2");
    }

    // Path parameters
    String localVarPath = "/api/files/templates/{filename}"
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getTemplateFile2", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param examUserId  (required)
   * @param filename  (required)
   * @return List&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<byte[]> getUserSignature(Long examUserId, String filename) throws ApiException {
    return getUserSignatureWithHttpInfo(examUserId, filename).getData();
  }

  /**
   * 
   * 
   * @param examUserId  (required)
   * @param filename  (required)
   * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<byte[]>> getUserSignatureWithHttpInfo(Long examUserId, String filename) throws ApiException {
    // Check required parameters
    if (examUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'examUserId' when calling getUserSignature");
    }
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getUserSignature");
    }

    // Path parameters
    String localVarPath = "/api/files/exam-user/signatures/{examUserId}/{filename}"
            .replaceAll("\\{examUserId}", apiClient.escapeString(examUserId.toString()))
            .replaceAll("\\{filename}", apiClient.escapeString(filename));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<byte[]>> localVarReturnType = new GenericType<List<byte[]>>() {};
    return apiClient.invokeAPI("FileResourceApi.getUserSignature", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param _file  (required)
   * @param keepFileName  (optional, default to false)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public String saveFile(File _file, Boolean keepFileName) throws ApiException {
    return saveFileWithHttpInfo(_file, keepFileName).getData();
  }

  /**
   * 
   * 
   * @param _file  (required)
   * @param keepFileName  (optional, default to false)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<String> saveFileWithHttpInfo(File _file, Boolean keepFileName) throws ApiException {
    // Check required parameters
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling saveFile");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "keepFileName", keepFileName)
    );

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("file", _file);

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("FileResourceApi.saveFile", "/api/fileUpload", "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param keepFileName  (optional, default to false)
   * @param saveMarkdownFileRequest  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String saveMarkdownFile(Boolean keepFileName, SaveMarkdownFileRequest saveMarkdownFileRequest) throws ApiException {
    return saveMarkdownFileWithHttpInfo(keepFileName, saveMarkdownFileRequest).getData();
  }

  /**
   * 
   * 
   * @param keepFileName  (optional, default to false)
   * @param saveMarkdownFileRequest  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> saveMarkdownFileWithHttpInfo(Boolean keepFileName, SaveMarkdownFileRequest saveMarkdownFileRequest) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "keepFileName", keepFileName)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("FileResourceApi.saveMarkdownFile", "/api/markdown-file-upload", "POST", localVarQueryParams, saveMarkdownFileRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
