package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.CourseManagementStatisticsDTO;
import de.tum.cit.ase.artemis.sdk.model.ExerciseManagementStatisticsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T13:57:19.283407Z[Etc/UTC]")
public class StatisticsResourceApi {
  private ApiClient apiClient;

  public StatisticsResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatisticsResourceApi(ApiClient apiClient) {
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
   * @param span  (required)
   * @param periodIndex  (required)
   * @param graphType  (required)
   * @param view  (required)
   * @param entityId  (required)
   * @return List&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Integer> getChartData(String span, Integer periodIndex, String graphType, String view, Long entityId) throws ApiException {
    return getChartDataWithHttpInfo(span, periodIndex, graphType, view, entityId).getData();
  }

  /**
   * 
   * 
   * @param span  (required)
   * @param periodIndex  (required)
   * @param graphType  (required)
   * @param view  (required)
   * @param entityId  (required)
   * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Integer>> getChartDataWithHttpInfo(String span, Integer periodIndex, String graphType, String view, Long entityId) throws ApiException {
    // Check required parameters
    if (span == null) {
      throw new ApiException(400, "Missing the required parameter 'span' when calling getChartData");
    }
    if (periodIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'periodIndex' when calling getChartData");
    }
    if (graphType == null) {
      throw new ApiException(400, "Missing the required parameter 'graphType' when calling getChartData");
    }
    if (view == null) {
      throw new ApiException(400, "Missing the required parameter 'view' when calling getChartData");
    }
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling getChartData");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "span", span)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodIndex", periodIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graphType", graphType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {};
    return apiClient.invokeAPI("StatisticsResourceApi.getChartData", "/api/management/statistics/data-for-content", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @return CourseManagementStatisticsDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CourseManagementStatisticsDTO getCourseStatistics(Long courseId) throws ApiException {
    return getCourseStatisticsWithHttpInfo(courseId).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @return ApiResponse&lt;CourseManagementStatisticsDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CourseManagementStatisticsDTO> getCourseStatisticsWithHttpInfo(Long courseId) throws ApiException {
    // Check required parameters
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseStatistics");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "courseId", courseId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CourseManagementStatisticsDTO> localVarReturnType = new GenericType<CourseManagementStatisticsDTO>() {};
    return apiClient.invokeAPI("StatisticsResourceApi.getCourseStatistics", "/api/management/statistics/course-statistics", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ExerciseManagementStatisticsDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ExerciseManagementStatisticsDTO getExerciseStatistics(Long exerciseId) throws ApiException {
    return getExerciseStatisticsWithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;ExerciseManagementStatisticsDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExerciseManagementStatisticsDTO> getExerciseStatisticsWithHttpInfo(Long exerciseId) throws ApiException {
    // Check required parameters
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getExerciseStatistics");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "exerciseId", exerciseId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExerciseManagementStatisticsDTO> localVarReturnType = new GenericType<ExerciseManagementStatisticsDTO>() {};
    return apiClient.invokeAPI("StatisticsResourceApi.getExerciseStatistics", "/api/management/statistics/exercise-statistics", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
