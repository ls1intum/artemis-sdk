/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.tum.cit.ase.artemis.sdk.api;

import de.tum.cit.ase.artemis.sdk.*;
import de.tum.cit.ase.artemis.sdk.auth.*;
import de.tum.cit.ase.artemis.sdk.model.Feedback;
import de.tum.cit.ase.artemis.sdk.model.Result;
import de.tum.cit.ase.artemis.sdk.model.ResultWithPointsPerGradingCriterionDTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResultResourceApi
 */
public class ResultResourceApiTest {

    private final ResultResourceApi api = new ResultResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createExampleResultTest() throws ApiException {
        //Long exerciseId = null;
        //Long exampleSubmissionId = null;
        //Boolean isProgrammingExerciseWithFeedback = null;
        //Result response = api.createExampleResult(exerciseId, exampleSubmissionId, isProgrammingExerciseWithFeedback);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createResultForExternalSubmissionTest() throws ApiException {
        //Long exerciseId = null;
        //String studentLogin = null;
        //Result result = null;
        //Result response = api.createResultForExternalSubmission(exerciseId, studentLogin, result);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteResultTest() throws ApiException {
        //Long participationId = null;
        //Long resultId = null;
        //api.deleteResult(participationId, resultId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResultTest() throws ApiException {
        //Long participationId = null;
        //Long resultId = null;
        //Result response = api.getResult(participationId, resultId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResultDetailsTest() throws ApiException {
        //Long participationId = null;
        //Long resultId = null;
        //List<Feedback> response = api.getResultDetails(participationId, resultId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResultsForExerciseTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean withSubmissions = null;
        //List<Result> response = api.getResultsForExercise(exerciseId, withSubmissions);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResultsForExerciseWithPointsPerCriterionTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean withSubmissions = null;
        //List<ResultWithPointsPerGradingCriterionDTO> response = api.getResultsForExerciseWithPointsPerCriterion(exerciseId, withSubmissions);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void processNewProgrammingExerciseResultTest() throws ApiException {
        //String authorization = null;
        //Object body = null;
        //Object response = api.processNewProgrammingExerciseResult(authorization, body);
        // TODO: test validations
    }

}