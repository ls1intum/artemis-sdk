package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class RatingResourceApi {
  private ApiClient apiClient;

  public RatingResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RatingResourceApi(ApiClient apiClient) {
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
   * @param resultId  (required)
   * @param ratingValue  (required)
   * @return Rating
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Rating createRatingForResult(Long resultId, Integer ratingValue) throws ApiException {
    return createRatingForResultWithHttpInfo(resultId, ratingValue).getData();
  }

  /**
   * 
   * 
   * @param resultId  (required)
   * @param ratingValue  (required)
   * @return ApiResponse&lt;Rating&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Rating> createRatingForResultWithHttpInfo(Long resultId, Integer ratingValue) throws ApiException {
    // Check required parameters
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling createRatingForResult");
    }
    if (ratingValue == null) {
      throw new ApiException(400, "Missing the required parameter 'ratingValue' when calling createRatingForResult");
    }

    // Path parameters
    String localVarPath = "/api/results/{resultId}/rating/{ratingValue}"
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()))
            .replaceAll("\\{ratingValue}", apiClient.escapeString(ratingValue.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Rating> localVarReturnType = new GenericType<Rating>() {};
    return apiClient.invokeAPI("RatingResourceApi.createRatingForResult", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return List&lt;Rating&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Rating> getRatingForInstructorDashboard(Long courseId) throws ApiException {
    return getRatingForInstructorDashboardWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;List&lt;Rating&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Rating>> getRatingForInstructorDashboardWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getRatingForInstructorDashboard");
    }

    // Path parameters
    String localVarPath = "/api/course/{courseId}/rating"
            .replaceAll("\\{courseId}", apiClient.escapeString(courseId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Rating>> localVarReturnType = new GenericType<List<Rating>>() {};
    return apiClient.invokeAPI("RatingResourceApi.getRatingForInstructorDashboard", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param resultId  (required)
   * @return Rating
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Rating getRatingForResult(Long resultId) throws ApiException {
    return getRatingForResultWithHttpInfo(resultId).getData();
  }

  /**
   * 
   * 
   * @param resultId  (required)
   * @return ApiResponse&lt;Rating&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Rating> getRatingForResultWithHttpInfo(Long resultId) throws ApiException {
    // Check required parameters
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getRatingForResult");
    }

    // Path parameters
    String localVarPath = "/api/results/{resultId}/rating"
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Rating> localVarReturnType = new GenericType<Rating>() {};
    return apiClient.invokeAPI("RatingResourceApi.getRatingForResult", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param resultId  (required)
   * @param ratingValue  (required)
   * @return Rating
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Rating updateRatingForResult(Long resultId, Integer ratingValue) throws ApiException {
    return updateRatingForResultWithHttpInfo(resultId, ratingValue).getData();
  }

  /**
   * 
   * 
   * @param resultId  (required)
   * @param ratingValue  (required)
   * @return ApiResponse&lt;Rating&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Rating> updateRatingForResultWithHttpInfo(Long resultId, Integer ratingValue) throws ApiException {
    // Check required parameters
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling updateRatingForResult");
    }
    if (ratingValue == null) {
      throw new ApiException(400, "Missing the required parameter 'ratingValue' when calling updateRatingForResult");
    }

    // Path parameters
    String localVarPath = "/api/results/{resultId}/rating/{ratingValue}"
            .replaceAll("\\{resultId}", apiClient.escapeString(resultId.toString()))
            .replaceAll("\\{ratingValue}", apiClient.escapeString(ratingValue.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Rating> localVarReturnType = new GenericType<Rating>() {};
    return apiClient.invokeAPI("RatingResourceApi.updateRatingForResult", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
