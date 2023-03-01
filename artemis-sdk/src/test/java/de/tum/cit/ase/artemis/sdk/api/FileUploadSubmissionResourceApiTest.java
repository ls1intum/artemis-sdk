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
import de.tum.cit.ase.artemis.sdk.model.CreateFileUploadSubmissionRequest;
import de.tum.cit.ase.artemis.sdk.model.FileUploadSubmission;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileUploadSubmissionResourceApi
 */
public class FileUploadSubmissionResourceApiTest {

    private final FileUploadSubmissionResourceApi api = new FileUploadSubmissionResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFileUploadSubmissionTest() throws ApiException {
        //Long exerciseId = null;
        //CreateFileUploadSubmissionRequest createFileUploadSubmissionRequest = null;
        //FileUploadSubmission response = api.createFileUploadSubmission(exerciseId, createFileUploadSubmissionRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllFileUploadSubmissionsTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean submittedOnly = null;
        //Boolean assessedByTutor = null;
        //Integer correctionRound = null;
        //List<GetAllTextSubmissions200ResponseInner> response = api.getAllFileUploadSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataForFileUploadTest() throws ApiException {
        //Long participationId = null;
        //FileUploadSubmission response = api.getDataForFileUpload(participationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileUploadSubmission1Test() throws ApiException {
        //Long submissionId = null;
        //Integer correctionRound = null;
        //Long resultId = null;
        //FileUploadSubmission response = api.getFileUploadSubmission1(submissionId, correctionRound, resultId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileUploadSubmissionWithoutAssessmentTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean lock = null;
        //Integer correctionRound = null;
        //FileUploadSubmission response = api.getFileUploadSubmissionWithoutAssessment(exerciseId, lock, correctionRound);
        // TODO: test validations
    }

}