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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T15:31:11.360443Z[Etc/UTC]")
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'span' is set
    if (span == null) {
      throw new ApiException(400, "Missing the required parameter 'span' when calling getChartData");
    }
    
    // verify the required parameter 'periodIndex' is set
    if (periodIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'periodIndex' when calling getChartData");
    }
    
    // verify the required parameter 'graphType' is set
    if (graphType == null) {
      throw new ApiException(400, "Missing the required parameter 'graphType' when calling getChartData");
    }
    
    // verify the required parameter 'view' is set
    if (view == null) {
      throw new ApiException(400, "Missing the required parameter 'view' when calling getChartData");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling getChartData");
    }
    
    // create path and map variables
    String localVarPath = "/api/management/statistics/data-for-content";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "span", span));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodIndex", periodIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graphType", graphType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {};

    return apiClient.invokeAPI("StatisticsResourceApi.getChartData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/api/management/statistics/course-statistics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CourseManagementStatisticsDTO> localVarReturnType = new GenericType<CourseManagementStatisticsDTO>() {};

    return apiClient.invokeAPI("StatisticsResourceApi.getCourseStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getExerciseStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/api/management/statistics/exercise-statistics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exerciseId", exerciseId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ExerciseManagementStatisticsDTO> localVarReturnType = new GenericType<ExerciseManagementStatisticsDTO>() {};

    return apiClient.invokeAPI("StatisticsResourceApi.getExerciseStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
