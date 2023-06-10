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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-10T14:33:20.156837Z[Etc/UTC]")
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling createExerciseUnit");
    }
    if (exerciseUnit == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseUnit' when calling createExerciseUnit");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/exercise-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExerciseUnit> localVarReturnType = new GenericType<ExerciseUnit>() {};
    return apiClient.invokeAPI("ExerciseUnitResourceApi.createExerciseUnit", localVarPath, "POST", new ArrayList<>(), exerciseUnit,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
    // Check required parameters
    if (lectureId == null) {
      throw new ApiException(400, "Missing the required parameter 'lectureId' when calling getAllExerciseUnitsOfLecture");
    }

    // Path parameters
    String localVarPath = "/api/lectures/{lectureId}/exercise-units"
            .replaceAll("\\{lectureId}", apiClient.escapeString(lectureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ExerciseUnit>> localVarReturnType = new GenericType<List<ExerciseUnit>>() {};
    return apiClient.invokeAPI("ExerciseUnitResourceApi.getAllExerciseUnitsOfLecture", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
