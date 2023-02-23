package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class AdminStatisticsResourceApi {
  private ApiClient apiClient;

  public AdminStatisticsResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminStatisticsResourceApi(ApiClient apiClient) {
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
   * @return List&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Integer> getChartData1(String span, Integer periodIndex, String graphType) throws ApiException {
    return getChartData1WithHttpInfo(span, periodIndex, graphType).getData();
  }

  /**
   * 
   * 
   * @param span  (required)
   * @param periodIndex  (required)
   * @param graphType  (required)
   * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Integer>> getChartData1WithHttpInfo(String span, Integer periodIndex, String graphType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'span' is set
    if (span == null) {
      throw new ApiException(400, "Missing the required parameter 'span' when calling getChartData1");
    }
    
    // verify the required parameter 'periodIndex' is set
    if (periodIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'periodIndex' when calling getChartData1");
    }
    
    // verify the required parameter 'graphType' is set
    if (graphType == null) {
      throw new ApiException(400, "Missing the required parameter 'graphType' when calling getChartData1");
    }
    
    // create path and map variables
    String localVarPath = "/api/admin/management/statistics/data";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "span", span));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodIndex", periodIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graphType", graphType));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {};

    return apiClient.invokeAPI("AdminStatisticsResourceApi.getChartData1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
