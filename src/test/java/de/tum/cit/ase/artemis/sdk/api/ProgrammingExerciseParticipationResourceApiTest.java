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
import de.tum.cit.ase.artemis.sdk.model.CleanupBuildPlan200Response;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import de.tum.cit.ase.artemis.sdk.model.Result;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProgrammingExerciseParticipationResourceApi
 */
public class ProgrammingExerciseParticipationResourceApiTest {

    private final ProgrammingExerciseParticipationResourceApi api = new ProgrammingExerciseParticipationResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkIfParticipationHashResultTest() throws ApiException {
        //Long participationId = null;
        //Boolean response = api.checkIfParticipationHashResult(participationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLatestPendingSubmissionTest() throws ApiException {
        //Long participationId = null;
        //Boolean lastGraded = null;
        //ProgrammingSubmission response = api.getLatestPendingSubmission(participationId, lastGraded);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLatestPendingSubmissionsByExerciseIdTest() throws ApiException {
        //Long exerciseId = null;
        //Map<String, ProgrammingSubmission> response = api.getLatestPendingSubmissionsByExerciseId(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLatestResultWithFeedbacksForProgrammingExerciseParticipationTest() throws ApiException {
        //Long participationId = null;
        //Boolean withSubmission = null;
        //Result response = api.getLatestResultWithFeedbacksForProgrammingExerciseParticipation(participationId, withSubmission);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParticipationWithLatestResultForStudentParticipationTest() throws ApiException {
        //Long participationId = null;
        //CleanupBuildPlan200Response response = api.getParticipationWithLatestResultForStudentParticipation(participationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetRepositoryTest() throws ApiException {
        //Long participationId = null;
        //Long gradedParticipationId = null;
        //api.resetRepository(participationId, gradedParticipationId);
        // TODO: test validations
    }

}
