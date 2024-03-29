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
import de.tum.cit.ase.artemis.sdk.model.ProgrammingSubmission;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProgrammingSubmissionResourceApi
 */
public class ProgrammingSubmissionResourceApiTest {

    private final ProgrammingSubmissionResourceApi api = new ProgrammingSubmissionResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProgrammingSubmissionsTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean submittedOnly = null;
        //Boolean assessedByTutor = null;
        //Integer correctionRound = null;
        //List<ProgrammingSubmission> response = api.getAllProgrammingSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProgrammingSubmissionWithoutAssessmentTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean lock = null;
        //Integer correctionRound = null;
        //ProgrammingSubmission response = api.getProgrammingSubmissionWithoutAssessment(exerciseId, lock, correctionRound);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lockAndGetProgrammingSubmissionTest() throws ApiException {
        //Long submissionId = null;
        //Integer correctionRound = null;
        //ProgrammingSubmission response = api.lockAndGetProgrammingSubmission(submissionId, correctionRound);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void processNewProgrammingSubmissionTest() throws ApiException {
        //Long participationId = null;
        //Object body = null;
        //Object response = api.processNewProgrammingSubmission(participationId, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testCaseChangedTest() throws ApiException {
        //Long exerciseId = null;
        //Object body = null;
        //api.testCaseChanged(exerciseId, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerBuildTest() throws ApiException {
        //Long participationId = null;
        //String submissionType = null;
        //api.triggerBuild(participationId, submissionType);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerFailedBuildTest() throws ApiException {
        //Long participationId = null;
        //Boolean lastGraded = null;
        //api.triggerFailedBuild(participationId, lastGraded);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerInstructorBuildForExerciseTest() throws ApiException {
        //Long exerciseId = null;
        //Set<Long> requestBody = null;
        //api.triggerInstructorBuildForExercise(exerciseId, requestBody);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerInstructorBuildForExercise1Test() throws ApiException {
        //Long exerciseId = null;
        //api.triggerInstructorBuildForExercise1(exerciseId);
        // TODO: test validations
    }

}
