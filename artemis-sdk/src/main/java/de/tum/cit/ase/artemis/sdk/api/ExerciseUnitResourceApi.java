package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.ExerciseUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class ExerciseUnitResourceApi {
  private ApiClient apiClient;

  public ExerciseUnitResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExerciseUnitResourceApi(ApiClient apiClient) {
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
   * @param exerciseUnit  (required)
   * @return ExerciseUnit
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExerciseUnit createExerciseUnit(Long lectureId, ExerciseUnit exerciseUnit) throws ApiException {
    return createExerciseUnitWithHttpInfo(lectureId, exerciseUnit).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @param exerciseUnit  (required)
   * @return ApiResponse&lt;ExerciseUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExerciseUnit> createExerciseUnitWithHttpInfo(Long lectureId, ExerciseUnit exerciseUnit) throws ApiException {
    Object localVarPostBody = exerciseUnit;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createExerciseUnit");
    }
    
    // verify the required parameter 'exerciseUnit' is set
    if (exerciseUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseUnit' when calling createExerciseUnit");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/exercise-units"
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

    GenericType<ExerciseUnit> localVarReturnType = new GenericType<ExerciseUnit>() {};

    return apiClient.invokeAPI("ExerciseUnitResourceApi.createExerciseUnit", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param lectureId  (required)
   * @return List&lt;ExerciseUnit&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<ExerciseUnit> getAllExerciseUnitsOfLecture(Long lectureId) throws ApiException {
    return getAllExerciseUnitsOfLectureWithHttpInfo(lectureId).getData();
  }

  /**
   * 
   * 
   * @param lectureId  (required)
   * @return ApiResponse&lt;List&lt;ExerciseUnit&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ExerciseUnit>> getAllExerciseUnitsOfLectureWithHttpInfo(Long lectureId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lectureId' is set
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getAllExerciseUnitsOfLecture");
    }
    
    // create path and map variables
    String localVarPath = "/api/lectures/{lectureId}/exercise-units"
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

    GenericType<List<ExerciseUnit>> localVarReturnType = new GenericType<List<ExerciseUnit>>() {};

    return apiClient.invokeAPI("ExerciseUnitResourceApi.getAllExerciseUnitsOfLecture", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
