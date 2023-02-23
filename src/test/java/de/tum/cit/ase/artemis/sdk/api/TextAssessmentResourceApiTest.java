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
import de.tum.cit.ase.artemis.sdk.model.FeedbackConflict;
import de.tum.cit.ase.artemis.sdk.model.Result;
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.TextAssessmentDTO;
import de.tum.cit.ase.artemis.sdk.model.TextAssessmentUpdateDTO;
import de.tum.cit.ase.artemis.sdk.model.TextSubmission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TextAssessmentResourceApi
 */
public class TextAssessmentResourceApiTest {

    private final TextAssessmentResourceApi api = new TextAssessmentResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelAssessment3Test() throws ApiException {
        //Long participationId = null;
        //Long submissionId = null;
        //api.cancelAssessment3(participationId, submissionId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAssessmentTest() throws ApiException {
        //Long participationId = null;
        //Long submissionId = null;
        //Long resultId = null;
        //api.deleteAssessment(participationId, submissionId, resultId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTextExampleAssessmentTest() throws ApiException {
        //Long exerciseId = null;
        //Long exampleSubmissionId = null;
        //api.deleteTextExampleAssessment(exerciseId, exampleSubmissionId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConflictingTextSubmissionsTest() throws ApiException {
        //Long participationId = null;
        //Long submissionId = null;
        //Long feedbackId = null;
        //Set<TextSubmission> response = api.getConflictingTextSubmissions(participationId, submissionId, feedbackId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExampleResultForTutorTest() throws ApiException {
        //Long exerciseId = null;
        //Long submissionId = null;
        //Result response = api.getExampleResultForTutor(exerciseId, submissionId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveParticipationForSubmissionTest() throws ApiException {
        //Long participationId = null;
        //Long submissionId = null;
        //Integer correctionRound = null;
        //Long resultId = null;
        //CleanupBuildPlan200Response response = api.retrieveParticipationForSubmission(participationId, submissionId, correctionRound, resultId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveTextAssessmentTest() throws ApiException {
        //Long participationId = null;
        //Long resultId = null;
        //TextAssessmentDTO textAssessmentDTO = null;
        //Result response = api.saveTextAssessment(participationId, resultId, textAssessmentDTO);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveTextExampleAssessmentTest() throws ApiException {
        //Long exerciseId = null;
        //Long exampleSubmissionId = null;
        //TextAssessmentDTO textAssessmentDTO = null;
        //Result response = api.saveTextExampleAssessment(exerciseId, exampleSubmissionId, textAssessmentDTO);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void solveFeedbackConflictTest() throws ApiException {
        //Long exerciseId = null;
        //Long feedbackConflictId = null;
        //FeedbackConflict response = api.solveFeedbackConflict(exerciseId, feedbackConflictId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTextAssessmentTest() throws ApiException {
        //Long participationId = null;
        //Long resultId = null;
        //TextAssessmentDTO textAssessmentDTO = null;
        //Result response = api.submitTextAssessment(participationId, resultId, textAssessmentDTO);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTextAssessmentAfterComplaintTest() throws ApiException {
        //Long participationId = null;
        //Long submissionId = null;
        //TextAssessmentUpdateDTO textAssessmentUpdateDTO = null;
        //Result response = api.updateTextAssessmentAfterComplaint(participationId, submissionId, textAssessmentUpdateDTO);
        // TODO: test validations
    }

}
