package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.TextPlagiarismResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class ProgrammingExercisePlagiarismResourceApi {
  private ApiClient apiClient;

  public ProgrammingExercisePlagiarismResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammingExercisePlagiarismResourceApi(ApiClient apiClient) {
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
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @return TextPlagiarismResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextPlagiarismResult checkPlagiarism1(Long exerciseId, Float similarityThreshold, Integer minimumScore) throws ApiException {
    return checkPlagiarism1WithHttpInfo(exerciseId, similarityThreshold, minimumScore).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @return ApiResponse&lt;TextPlagiarismResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextPlagiarismResult> checkPlagiarism1WithHttpInfo(Long exerciseId, Float similarityThreshold, Integer minimumScore) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling checkPlagiarism1");
    }
    
    // verify the required parameter 'similarityThreshold' is set
    if (similarityThreshold == null) {
      throw new ApiException(400, "Missing the required parameter 'similarityThreshold' when calling checkPlagiarism1");
    }
    
    // verify the required parameter 'minimumScore' is set
    if (minimumScore == null) {
      throw new ApiException(400, "Missing the required parameter 'minimumScore' when calling checkPlagiarism1");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/check-plagiarism"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "similarityThreshold", similarityThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumScore", minimumScore));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TextPlagiarismResult> localVarReturnType = new GenericType<TextPlagiarismResult>() {};

    return apiClient.invokeAPI("ProgrammingExercisePlagiarismResourceApi.checkPlagiarism1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public File checkPlagiarismWithJPlagReport(Long exerciseId, Float similarityThreshold, Integer minimumScore) throws ApiException {
    return checkPlagiarismWithJPlagReportWithHttpInfo(exerciseId, similarityThreshold, minimumScore).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param similarityThreshold  (required)
   * @param minimumScore  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> checkPlagiarismWithJPlagReportWithHttpInfo(Long exerciseId, Float similarityThreshold, Integer minimumScore) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling checkPlagiarismWithJPlagReport");
    }
    
    // verify the required parameter 'similarityThreshold' is set
    if (similarityThreshold == null) {
      throw new ApiException(400, "Missing the required parameter 'similarityThreshold' when calling checkPlagiarismWithJPlagReport");
    }
    
    // verify the required parameter 'minimumScore' is set
    if (minimumScore == null) {
      throw new ApiException(400, "Missing the required parameter 'minimumScore' when calling checkPlagiarismWithJPlagReport");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/check-plagiarism-jplag-report"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "similarityThreshold", similarityThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumScore", minimumScore));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProgrammingExercisePlagiarismResourceApi.checkPlagiarismWithJPlagReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return TextPlagiarismResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public TextPlagiarismResult getPlagiarismResult1(Long exerciseId) throws ApiException {
    return getPlagiarismResult1WithHttpInfo(exerciseId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @return ApiResponse&lt;TextPlagiarismResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TextPlagiarismResult> getPlagiarismResult1WithHttpInfo(Long exerciseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getPlagiarismResult1");
    }
    
    // create path and map variables
    String localVarPath = "/api/programming-exercises/{exerciseId}/plagiarism-result"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

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

    GenericType<TextPlagiarismResult> localVarReturnType = new GenericType<TextPlagiarismResult>() {};

    return apiClient.invokeAPI("ProgrammingExercisePlagiarismResourceApi.getPlagiarismResult1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
