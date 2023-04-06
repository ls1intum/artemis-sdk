package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ApollonDiagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class ApollonDiagramResourceApi {
  private ApiClient apiClient;

  public ApollonDiagramResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApollonDiagramResourceApi(ApiClient apiClient) {
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
   * @param courseId  (required)
   * @param apollonDiagram  (required)
   * @return ApollonDiagram
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApollonDiagram createApollonDiagram(Long courseId, ApollonDiagram apollonDiagram) throws ApiException {
    return createApollonDiagramWithHttpInfo(courseId, apollonDiagram).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param apollonDiagram  (required)
   * @return ApiResponse&lt;ApollonDiagram&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApollonDiagram> createApollonDiagramWithHttpInfo(Long courseId, ApollonDiagram apollonDiagram) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createApollonDiagram");
    }
    if (apollonDiagram == null) {
      throw new ApiException(400, "Missing the required parameter 'apollonDiagram' when calling createApollonDiagram");
    }

    // Path parameters
    String localVarPath = "/api/course/{courseId}/apollon-diagrams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ApollonDiagram> localVarReturnType = new GenericType<ApollonDiagram>() {};
    return apiClient.invokeAPI("ApollonDiagramResourceApi.createApollonDiagram", localVarPath, "POST", new ArrayList<>(), apollonDiagram,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param apollonDiagramId  (required)
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteApollonDiagram(Long apollonDiagramId, Long courseId) throws ApiException {
    deleteApollonDiagramWithHttpInfo(apollonDiagramId, courseId);
  }

  /**
   * 
   * 
   * @param apollonDiagramId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteApollonDiagramWithHttpInfo(Long apollonDiagramId, Long courseId) throws ApiException {
    // Check required parameters
    if (apollonDiagramId == null) {
      throw new ApiException(400, "Missing the required parameter 'apollonDiagramId' when calling deleteApollonDiagram");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteApollonDiagram");
    }

    // Path parameters
    String localVarPath = "/api/course/{courseId}/apollon-diagrams/{apollonDiagramId}"
            .replaceAll("\\{apollonDiagramId}", apiClient.escapeString(apollonDiagramId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ApollonDiagramResourceApi.deleteApollonDiagram", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param apollonDiagramId  (required)
   * @param courseId  (required)
   * @return ApollonDiagram
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApollonDiagram getApollonDiagram(Long apollonDiagramId, Long courseId) throws ApiException {
    return getApollonDiagramWithHttpInfo(apollonDiagramId, courseId).getData();
  }

  /**
   * 
   * 
   * @param apollonDiagramId  (required)
   * @param courseId  (required)
   * @return ApiResponse&lt;ApollonDiagram&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApollonDiagram> getApollonDiagramWithHttpInfo(Long apollonDiagramId, Long courseId) throws ApiException {
    // Check required parameters
    if (apollonDiagramId == null) {
      throw new ApiException(400, "Missing the required parameter 'apollonDiagramId' when calling getApollonDiagram");
    }
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getApollonDiagram");
    }

    // Path parameters
    String localVarPath = "/api/course/{courseId}/apollon-diagrams/{apollonDiagramId}"
            .replaceAll("\\{apollonDiagramId}", apiClient.escapeString(apollonDiagramId.toString()))
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ApollonDiagram> localVarReturnType = new GenericType<ApollonDiagram>() {};
    return apiClient.invokeAPI("ApollonDiagramResourceApi.getApollonDiagram", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param diagramId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getDiagramTitle(Long diagramId) throws ApiException {
    return getDiagramTitleWithHttpInfo(diagramId).getData();
  }

  /**
   * 
   * 
   * @param diagramId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getDiagramTitleWithHttpInfo(Long diagramId) throws ApiException {
    // Check required parameters
    if (diagramId == null) {
      throw new ApiException(400, "Missing the required parameter 'diagramId' when calling getDiagramTitle");
    }

    // Path parameters
    String localVarPath = "/api/apollon-diagrams/{diagramId}/title"
            .replaceAll("\\{diagramId}", apiClient.escapeString(diagramId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("ApollonDiagramResourceApi.getDiagramTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;ApollonDiagram&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ApollonDiagram> getDiagramsByCourse(Long courseId) throws ApiException {
    return getDiagramsByCourseWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;ApollonDiagram&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ApollonDiagram>> getDiagramsByCourseWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getDiagramsByCourse");
    }

    // Path parameters
    String localVarPath = "/api/course/{courseId}/apollon-diagrams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ApollonDiagram>> localVarReturnType = new GenericType<List<ApollonDiagram>>() {};
    return apiClient.invokeAPI("ApollonDiagramResourceApi.getDiagramsByCourse", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param apollonDiagram  (required)
   * @return ApollonDiagram
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApollonDiagram updateApollonDiagram(Long courseId, ApollonDiagram apollonDiagram) throws ApiException {
    return updateApollonDiagramWithHttpInfo(courseId, apollonDiagram).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param apollonDiagram  (required)
   * @return ApiResponse&lt;ApollonDiagram&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApollonDiagram> updateApollonDiagramWithHttpInfo(Long courseId, ApollonDiagram apollonDiagram) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling updateApollonDiagram");
    }
    if (apollonDiagram == null) {
      throw new ApiException(400, "Missing the required parameter 'apollonDiagram' when calling updateApollonDiagram");
    }

    // Path parameters
    String localVarPath = "/api/course/{courseId}/apollon-diagrams"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ApollonDiagram> localVarReturnType = new GenericType<ApollonDiagram>() {};
    return apiClient.invokeAPI("ApollonDiagramResourceApi.updateApollonDiagram", localVarPath, "PUT", new ArrayList<>(), apollonDiagram,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
