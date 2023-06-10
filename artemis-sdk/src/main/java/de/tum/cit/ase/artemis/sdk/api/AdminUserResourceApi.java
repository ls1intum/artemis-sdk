package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ManagedUserVM;
import de.tum.cit.ase.artemis.sdk.model.User;
import de.tum.cit.ase.artemis.sdk.model.UserDTO;
import de.tum.cit.ase.artemis.sdk.model.UserPageableSearchDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
public class AdminUserResourceApi {
  private ApiClient apiClient;

  public AdminUserResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminUserResourceApi(ApiClient apiClient) {
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
   * @param managedUserVM  (required)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public User createUser(ManagedUserVM managedUserVM) throws ApiException {
    return createUserWithHttpInfo(managedUserVM).getData();
  }

  /**
   * 
   * 
   * @param managedUserVM  (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> createUserWithHttpInfo(ManagedUserVM managedUserVM) throws ApiException {
    // Check required parameters
    if (managedUserVM == null) {
      throw new ApiException(400, "Missing the required parameter 'managedUserVM' when calling createUser");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI("AdminUserResourceApi.createUser", "/api/admin/users", "POST", new ArrayList<>(), managedUserVM,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param login  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteUser(String login) throws ApiException {
    deleteUserWithHttpInfo(login);
  }

  /**
   * 
   * 
   * @param login  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteUserWithHttpInfo(String login) throws ApiException {
    // Check required parameters
    if (login == null) {
      throw new ApiException(400, "Missing the required parameter 'login' when calling deleteUser");
    }

    // Path parameters
    String localVarPath = "/api/admin/users/{login}"
            .replaceAll("\\{login}", apiClient.escapeString(login));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AdminUserResourceApi.deleteUser", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param login  (required)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<String> deleteUsers(List<String> login) throws ApiException {
    return deleteUsersWithHttpInfo(login).getData();
  }

  /**
   * 
   * 
   * @param login  (required)
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> deleteUsersWithHttpInfo(List<String> login) throws ApiException {
    // Check required parameters
    if (login == null) {
      throw new ApiException(400, "Missing the required parameter 'login' when calling deleteUsers");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "login", login)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("AdminUserResourceApi.deleteUsers", "/api/admin/users", "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param userSearch  (required)
   * @return List&lt;UserDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<UserDTO> getAllUsers(UserPageableSearchDTO userSearch) throws ApiException {
    return getAllUsersWithHttpInfo(userSearch).getData();
  }

  /**
   * 
   * 
   * @param userSearch  (required)
   * @return ApiResponse&lt;List&lt;UserDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UserDTO>> getAllUsersWithHttpInfo(UserPageableSearchDTO userSearch) throws ApiException {
    // Check required parameters
    if (userSearch == null) {
      throw new ApiException(400, "Missing the required parameter 'userSearch' when calling getAllUsers");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "userSearch", userSearch)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UserDTO>> localVarReturnType = new GenericType<List<UserDTO>>() {};
    return apiClient.invokeAPI("AdminUserResourceApi.getAllUsers", "/api/admin/users", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<String> getAuthorities() throws ApiException {
    return getAuthoritiesWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> getAuthoritiesWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("AdminUserResourceApi.getAuthorities", "/api/admin/users/authorities", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param userId  (required)
   * @return UserDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public UserDTO syncUserViaLdap(Long userId) throws ApiException {
    return syncUserViaLdapWithHttpInfo(userId).getData();
  }

  /**
   * 
   * 
   * @param userId  (required)
   * @return ApiResponse&lt;UserDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserDTO> syncUserViaLdapWithHttpInfo(Long userId) throws ApiException {
    // Check required parameters
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling syncUserViaLdap");
    }

    // Path parameters
    String localVarPath = "/api/admin/users/{userId}/sync-ldap"
            .replaceAll("\\{userId}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UserDTO> localVarReturnType = new GenericType<UserDTO>() {};
    return apiClient.invokeAPI("AdminUserResourceApi.syncUserViaLdap", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param managedUserVM  (required)
   * @return UserDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public UserDTO updateUser(ManagedUserVM managedUserVM) throws ApiException {
    return updateUserWithHttpInfo(managedUserVM).getData();
  }

  /**
   * 
   * 
   * @param managedUserVM  (required)
   * @return ApiResponse&lt;UserDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserDTO> updateUserWithHttpInfo(ManagedUserVM managedUserVM) throws ApiException {
    // Check required parameters
    if (managedUserVM == null) {
      throw new ApiException(400, "Missing the required parameter 'managedUserVM' when calling updateUser");
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UserDTO> localVarReturnType = new GenericType<UserDTO>() {};
    return apiClient.invokeAPI("AdminUserResourceApi.updateUser", "/api/admin/users", "PUT", new ArrayList<>(), managedUserVM,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
