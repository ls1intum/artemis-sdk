package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.ApiException;
import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.Team;
import de.tum.cit.ase.artemis.sdk.model.TeamSearchUserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class TeamResourceApi {
  private ApiClient apiClient;

  public TeamResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamResourceApi(ApiClient apiClient) {
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
   * @param team  (required)
   * @return Team
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Team createTeam(Long exerciseId, Team team) throws ApiException {
    return createTeamWithHttpInfo(exerciseId, team).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param team  (required)
   * @return ApiResponse&lt;Team&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Team> createTeamWithHttpInfo(Long exerciseId, Team team) throws ApiException {
    Object localVarPostBody = team;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling createTeam");
    }
    
    // verify the required parameter 'team' is set
    if (team == null) {
      throw new ApiException(400, "Missing the required parameter 'team' when calling createTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/teams"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Team> localVarReturnType = new GenericType<Team>() {};

    return apiClient.invokeAPI("TeamResourceApi.createTeam", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void deleteTeam(Long exerciseId, Long teamId) throws ApiException {
    deleteTeamWithHttpInfo(exerciseId, teamId);
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteTeamWithHttpInfo(Long exerciseId, Long teamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling deleteTeam");
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling deleteTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/teams/{teamId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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

    return apiClient.invokeAPI("TeamResourceApi.deleteTeam", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param shortName  (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Boolean existsTeamByShortName(Long courseId, String shortName) throws ApiException {
    return existsTeamByShortNameWithHttpInfo(courseId, shortName).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param shortName  (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> existsTeamByShortNameWithHttpInfo(Long courseId, String shortName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling existsTeamByShortName");
    }
    
    // verify the required parameter 'shortName' is set
    if (shortName == null) {
      throw new ApiException(400, "Missing the required parameter 'shortName' when calling existsTeamByShortName");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/teams/exists"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shortName", shortName));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};

    return apiClient.invokeAPI("TeamResourceApi.existsTeamByShortName", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param teamShortName  (required)
   * @return Course
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Course getCourseWithExercisesAndParticipationsForTeam(Long courseId, String teamShortName) throws ApiException {
    return getCourseWithExercisesAndParticipationsForTeamWithHttpInfo(courseId, teamShortName).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param teamShortName  (required)
   * @return ApiResponse&lt;Course&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Course> getCourseWithExercisesAndParticipationsForTeamWithHttpInfo(Long courseId, String teamShortName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseWithExercisesAndParticipationsForTeam");
    }
    
    // verify the required parameter 'teamShortName' is set
    if (teamShortName == null) {
      throw new ApiException(400, "Missing the required parameter 'teamShortName' when calling getCourseWithExercisesAndParticipationsForTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/teams/{teamShortName}/with-exercises-and-participations"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "teamShortName" + "\\}", apiClient.escapeString(teamShortName.toString()));

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

    GenericType<Course> localVarReturnType = new GenericType<Course>() {};

    return apiClient.invokeAPI("TeamResourceApi.getCourseWithExercisesAndParticipationsForTeam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamId  (required)
   * @return Team
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Team getTeam(Long exerciseId, Long teamId) throws ApiException {
    return getTeamWithHttpInfo(exerciseId, teamId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamId  (required)
   * @return ApiResponse&lt;Team&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Team> getTeamWithHttpInfo(Long exerciseId, Long teamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getTeam");
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling getTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/teams/{teamId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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

    GenericType<Team> localVarReturnType = new GenericType<Team>() {};

    return apiClient.invokeAPI("TeamResourceApi.getTeam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamOwnerId  (optional)
   * @return List&lt;Team&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Team> getTeamsForExercise(Long exerciseId, Long teamOwnerId) throws ApiException {
    return getTeamsForExerciseWithHttpInfo(exerciseId, teamOwnerId).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamOwnerId  (optional)
   * @return ApiResponse&lt;List&lt;Team&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Team>> getTeamsForExerciseWithHttpInfo(Long exerciseId, Long teamOwnerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling getTeamsForExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/teams"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "teamOwnerId", teamOwnerId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Team>> localVarReturnType = new GenericType<List<Team>>() {};

    return apiClient.invokeAPI("TeamResourceApi.getTeamsForExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param importStrategyType  (required)
   * @param team  (required)
   * @return List&lt;Team&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Team> importTeamsFromList(Long exerciseId, String importStrategyType, List<Team> team) throws ApiException {
    return importTeamsFromListWithHttpInfo(exerciseId, importStrategyType, team).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param importStrategyType  (required)
   * @param team  (required)
   * @return ApiResponse&lt;List&lt;Team&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Team>> importTeamsFromListWithHttpInfo(Long exerciseId, String importStrategyType, List<Team> team) throws ApiException {
    Object localVarPostBody = team;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling importTeamsFromList");
    }
    
    // verify the required parameter 'importStrategyType' is set
    if (importStrategyType == null) {
      throw new ApiException(400, "Missing the required parameter 'importStrategyType' when calling importTeamsFromList");
    }
    
    // verify the required parameter 'team' is set
    if (team == null) {
      throw new ApiException(400, "Missing the required parameter 'team' when calling importTeamsFromList");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/teams/import-from-list"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "importStrategyType", importStrategyType));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Team>> localVarReturnType = new GenericType<List<Team>>() {};

    return apiClient.invokeAPI("TeamResourceApi.importTeamsFromList", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param destinationExerciseId  (required)
   * @param sourceExerciseId  (required)
   * @param importStrategyType  (required)
   * @return List&lt;Team&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<Team> importTeamsFromSourceExercise(Long destinationExerciseId, Long sourceExerciseId, String importStrategyType) throws ApiException {
    return importTeamsFromSourceExerciseWithHttpInfo(destinationExerciseId, sourceExerciseId, importStrategyType).getData();
  }

  /**
   * 
   * 
   * @param destinationExerciseId  (required)
   * @param sourceExerciseId  (required)
   * @param importStrategyType  (required)
   * @return ApiResponse&lt;List&lt;Team&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Team>> importTeamsFromSourceExerciseWithHttpInfo(Long destinationExerciseId, Long sourceExerciseId, String importStrategyType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationExerciseId' is set
    if (destinationExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationExerciseId' when calling importTeamsFromSourceExercise");
    }
    
    // verify the required parameter 'sourceExerciseId' is set
    if (sourceExerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceExerciseId' when calling importTeamsFromSourceExercise");
    }
    
    // verify the required parameter 'importStrategyType' is set
    if (importStrategyType == null) {
      throw new ApiException(400, "Missing the required parameter 'importStrategyType' when calling importTeamsFromSourceExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{destinationExerciseId}/teams/import-from-exercise/{sourceExerciseId}"
      .replaceAll("\\{" + "destinationExerciseId" + "\\}", apiClient.escapeString(destinationExerciseId.toString()))
      .replaceAll("\\{" + "sourceExerciseId" + "\\}", apiClient.escapeString(sourceExerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "importStrategyType", importStrategyType));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Team>> localVarReturnType = new GenericType<List<Team>>() {};

    return apiClient.invokeAPI("TeamResourceApi.importTeamsFromSourceExercise", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @param loginOrName  (required)
   * @return List&lt;TeamSearchUserDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<TeamSearchUserDTO> searchTeamInExercise(Long courseId, Long exerciseId, String loginOrName) throws ApiException {
    return searchTeamInExerciseWithHttpInfo(courseId, exerciseId, loginOrName).getData();
  }

  /**
   * 
   * 
   * @param courseId  (required)
   * @param exerciseId  (required)
   * @param loginOrName  (required)
   * @return ApiResponse&lt;List&lt;TeamSearchUserDTO&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TeamSearchUserDTO>> searchTeamInExerciseWithHttpInfo(Long courseId, Long exerciseId, String loginOrName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling searchTeamInExercise");
    }
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling searchTeamInExercise");
    }
    
    // verify the required parameter 'loginOrName' is set
    if (loginOrName == null) {
      throw new ApiException(400, "Missing the required parameter 'loginOrName' when calling searchTeamInExercise");
    }
    
    // create path and map variables
    String localVarPath = "/api/courses/{courseId}/exercises/{exerciseId}/team-search-users"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loginOrName", loginOrName));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<TeamSearchUserDTO>> localVarReturnType = new GenericType<List<TeamSearchUserDTO>>() {};

    return apiClient.invokeAPI("TeamResourceApi.searchTeamInExercise", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamId  (required)
   * @param team  (required)
   * @return Team
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Team updateTeam(Long exerciseId, Long teamId, Team team) throws ApiException {
    return updateTeamWithHttpInfo(exerciseId, teamId, team).getData();
  }

  /**
   * 
   * 
   * @param exerciseId  (required)
   * @param teamId  (required)
   * @param team  (required)
   * @return ApiResponse&lt;Team&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Team> updateTeamWithHttpInfo(Long exerciseId, Long teamId, Team team) throws ApiException {
    Object localVarPostBody = team;
    
    // verify the required parameter 'exerciseId' is set
    if (exerciseId == null) {
      throw new ApiException(400, "Missing the required parameter 'exerciseId' when calling updateTeam");
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling updateTeam");
    }
    
    // verify the required parameter 'team' is set
    if (team == null) {
      throw new ApiException(400, "Missing the required parameter 'team' when calling updateTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/exercises/{exerciseId}/teams/{teamId}"
      .replaceAll("\\{" + "exerciseId" + "\\}", apiClient.escapeString(exerciseId.toString()))
      .replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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

    GenericType<Team> localVarReturnType = new GenericType<Team>() {};

    return apiClient.invokeAPI("TeamResourceApi.updateTeam", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
