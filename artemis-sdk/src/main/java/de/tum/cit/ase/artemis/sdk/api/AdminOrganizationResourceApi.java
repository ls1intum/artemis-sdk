package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Organization;
import de.tum.cit.ase.artemis.sdk.model.OrganizationCountDTO;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class AdminOrganizationResourceApi {
  private ApiClient apiClient;

  public AdminOrganizationResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminOrganizationResourceApi(ApiClient apiClient) {
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
   * @param organizationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void addCourseToOrganization(Long courseId, Long organizationId) throws ApiException {
    addCourseToOrganizationWithHttpInfo(courseId, organizationId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param organizationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addCourseToOrganizationWithHttpInfo(Long courseId, Long organizationId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling addCourseToOrganization");
    }
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling addCourseToOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/courses/{courseId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminOrganizationResourceApi.addCourseToOrganization", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param organization  (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Organization addOrganization(Organization organization) throws ApiException {
    return addOrganizationWithHttpInfo(organization).getData();
  }

  /**
   * 
   * 
   * @param organization  (required)
   * @return ApiResponse&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Organization> addOrganizationWithHttpInfo(Organization organization) throws ApiException {
    // Check required parameters
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling addOrganization");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.addOrganization", "/api/admin/organizations", "POST", new ArrayList<>(), organization,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param userLogin  (required)
   * @param organizationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void addUserToOrganization(String userLogin, Long organizationId) throws ApiException {
    addUserToOrganizationWithHttpInfo(userLogin, organizationId);
  }

  /**
   * 
   * 
   * @param userLogin  (required)
   * @param organizationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addUserToOrganizationWithHttpInfo(String userLogin, Long organizationId) throws ApiException {
    // Check required parameters
    if (userLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'userLogin' when calling addUserToOrganization");
    }
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling addUserToOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/users/{userLogin}"
            .replaceAll("\\{userLogin}", apiClient.escapeString(userLogin))
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminOrganizationResourceApi.addUserToOrganization", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param organizationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteOrganization(Long organizationId) throws ApiException {
    deleteOrganizationWithHttpInfo(organizationId);
  }

  /**
   * 
   * 
   * @param organizationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteOrganizationWithHttpInfo(Long organizationId) throws ApiException {
    // Check required parameters
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}"
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminOrganizationResourceApi.deleteOrganization", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @return List&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Organization> getAllOrganizations() throws ApiException {
    return getAllOrganizationsWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;List&lt;Organization&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Organization>> getAllOrganizationsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Organization>> localVarReturnType = new GenericType<List<Organization>>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getAllOrganizations", "/api/admin/organizations", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param userId  (required)
   * @return Set&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<Organization> getAllOrganizationsByUser(Long userId) throws ApiException {
    return getAllOrganizationsByUserWithHttpInfo(userId).getData();
  }

  /**
   * 
   * 
   * @param userId  (required)
   * @return ApiResponse&lt;Set&lt;Organization&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<Organization>> getAllOrganizationsByUserWithHttpInfo(Long userId) throws ApiException {
    // Check required parameters
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getAllOrganizationsByUser");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/users/{userId}"
            .replaceAll("\\{userId}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<Organization>> localVarReturnType = new GenericType<Set<Organization>>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getAllOrganizationsByUser", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param organizationId  (required)
   * @return OrganizationCountDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public OrganizationCountDTO getNumberOfUsersAndCoursesByOrganization(Long organizationId) throws ApiException {
    return getNumberOfUsersAndCoursesByOrganizationWithHttpInfo(organizationId).getData();
  }

  /**
   * 
   * 
   * @param organizationId  (required)
   * @return ApiResponse&lt;OrganizationCountDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrganizationCountDTO> getNumberOfUsersAndCoursesByOrganizationWithHttpInfo(Long organizationId) throws ApiException {
    // Check required parameters
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getNumberOfUsersAndCoursesByOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/count"
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<OrganizationCountDTO> localVarReturnType = new GenericType<OrganizationCountDTO>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getNumberOfUsersAndCoursesByOrganization", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @return List&lt;OrganizationCountDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<OrganizationCountDTO> getNumberOfUsersAndCoursesOfAllOrganizations() throws ApiException {
    return getNumberOfUsersAndCoursesOfAllOrganizationsWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;List&lt;OrganizationCountDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<OrganizationCountDTO>> getNumberOfUsersAndCoursesOfAllOrganizationsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<OrganizationCountDTO>> localVarReturnType = new GenericType<List<OrganizationCountDTO>>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getNumberOfUsersAndCoursesOfAllOrganizations", "/api/admin/organizations/count-all", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param organizationId  (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Organization getOrganizationById(Long organizationId) throws ApiException {
    return getOrganizationByIdWithHttpInfo(organizationId).getData();
  }

  /**
   * 
   * 
   * @param organizationId  (required)
   * @return ApiResponse&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Organization> getOrganizationByIdWithHttpInfo(Long organizationId) throws ApiException {
    // Check required parameters
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationById");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}"
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getOrganizationById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param organizationId  (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Organization getOrganizationByIdWithUsersAndCourses(Long organizationId) throws ApiException {
    return getOrganizationByIdWithUsersAndCoursesWithHttpInfo(organizationId).getData();
  }

  /**
   * 
   * 
   * @param organizationId  (required)
   * @return ApiResponse&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Organization> getOrganizationByIdWithUsersAndCoursesWithHttpInfo(Long organizationId) throws ApiException {
    // Check required parameters
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationByIdWithUsersAndCourses");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/full"
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getOrganizationByIdWithUsersAndCourses", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param organizationId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public String getOrganizationTitle(Long organizationId) throws ApiException {
    return getOrganizationTitleWithHttpInfo(organizationId).getData();
  }

  /**
   * 
   * 
   * @param organizationId  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getOrganizationTitleWithHttpInfo(Long organizationId) throws ApiException {
    // Check required parameters
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationTitle");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/title"
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.getOrganizationTitle", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param organizationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeCourseFromOrganization(Long courseId, Long organizationId) throws ApiException {
    removeCourseFromOrganizationWithHttpInfo(courseId, organizationId);
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param organizationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeCourseFromOrganizationWithHttpInfo(Long courseId, Long organizationId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling removeCourseFromOrganization");
    }
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling removeCourseFromOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/courses/{courseId}"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()))
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminOrganizationResourceApi.removeCourseFromOrganization", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param userLogin  (required)
   * @param organizationId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void removeUserFromOrganization(String userLogin, Long organizationId) throws ApiException {
    removeUserFromOrganizationWithHttpInfo(userLogin, organizationId);
  }

  /**
   * 
   * 
   * @param userLogin  (required)
   * @param organizationId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeUserFromOrganizationWithHttpInfo(String userLogin, Long organizationId) throws ApiException {
    // Check required parameters
    if (userLogin == null) {
      throw new ApiException(400, "Missing the required parameter 'userLogin' when calling removeUserFromOrganization");
    }
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling removeUserFromOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}/users/{userLogin}"
            .replaceAll("\\{userLogin}", apiClient.escapeString(userLogin))
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminOrganizationResourceApi.removeUserFromOrganization", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param organizationId  (required)
   * @param organization  (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Organization updateOrganization(Long organizationId, Organization organization) throws ApiException {
    return updateOrganizationWithHttpInfo(organizationId, organization).getData();
  }

  /**
   * 
   * 
   * @param organizationId  (required)
   * @param organization  (required)
   * @return ApiResponse&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Organization> updateOrganizationWithHttpInfo(Long organizationId, Organization organization) throws ApiException {
    // Check required parameters
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling updateOrganization");
    }
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling updateOrganization");
    }

    // Path parameters
    String localVarPath = "/api/admin/organizations/{organizationId}"
            .replaceAll("\\{organizationId}", apiClient.escapeString(organizationId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI("AdminOrganizationResourceApi.updateOrganization", localVarPath, "PUT", new ArrayList<>(), organization,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
