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
import de.tum.cit.ase.artemis.sdk.model.AuxiliaryRepository;
import de.tum.cit.ase.artemis.sdk.model.BuildLogStatisticsDTO;
import de.tum.cit.ase.artemis.sdk.model.PageableSearchDTOString;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExerciseTestCaseStateDTO;
import de.tum.cit.ase.artemis.sdk.model.SearchResultPageDTOProgrammingExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProgrammingExerciseResourceApi
 */
public class ProgrammingExerciseResourceApiTest {

    private final ProgrammingExerciseResourceApi api = new ProgrammingExerciseResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void combineTemplateRepositoryCommitsTest() throws ApiException {
        //Long exerciseId = null;
        //api.combineTemplateRepositoryCommits(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProgrammingExerciseTest() throws ApiException {
        //ProgrammingExercise programmingExercise = null;
        //ProgrammingExercise response = api.createProgrammingExercise(programmingExercise);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProgrammingExerciseTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean deleteStudentReposBuildPlans = null;
        //Boolean deleteBaseReposBuildPlans = null;
        //api.deleteProgrammingExercise(exerciseId, deleteStudentReposBuildPlans, deleteBaseReposBuildPlans);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTaskWithSolutionEntriesTest() throws ApiException {
        //Long exerciseId = null;
        //api.deleteTaskWithSolutionEntries(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateStructureOracleForExerciseTest() throws ApiException {
        //Long exerciseId = null;
        //String response = api.generateStructureOracleForExercise(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllExercisesOnPage2Test() throws ApiException {
        //PageableSearchDTOString search = null;
        //Boolean isCourseFilter = null;
        //Boolean isExamFilter = null;
        //SearchResultPageDTOProgrammingExercise response = api.getAllExercisesOnPage2(search, isCourseFilter, isExamFilter);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllExercisesWithSCAOnPageTest() throws ApiException {
        //PageableSearchDTOString search = null;
        //String programmingLanguage = null;
        //Boolean isCourseFilter = null;
        //Boolean isExamFilter = null;
        //SearchResultPageDTOProgrammingExercise response = api.getAllExercisesWithSCAOnPage(search, programmingLanguage, isCourseFilter, isExamFilter);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuxiliaryRepositoriesTest() throws ApiException {
        //Long exerciseId = null;
        //List<AuxiliaryRepository> response = api.getAuxiliaryRepositories(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBuildLogStatisticsTest() throws ApiException {
        //Long exerciseId = null;
        //BuildLogStatisticsDTO response = api.getBuildLogStatistics(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProgrammingExerciseTest() throws ApiException {
        //Long exerciseId = null;
        //ProgrammingExercise response = api.getProgrammingExercise(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProgrammingExerciseWithSetupParticipationsTest() throws ApiException {
        //Long exerciseId = null;
        //ProgrammingExercise response = api.getProgrammingExerciseWithSetupParticipations(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProgrammingExerciseWithTemplateAndSolutionParticipationTest() throws ApiException {
        //Long exerciseId = null;
        //Boolean withSubmissionResults = null;
        //ProgrammingExercise response = api.getProgrammingExerciseWithTemplateAndSolutionParticipation(exerciseId, withSubmissionResults);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProgrammingExercisesForCourseTest() throws ApiException {
        //Long courseId = null;
        //List<ProgrammingExercise> response = api.getProgrammingExercisesForCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hasAtLeastOneStudentResultTest() throws ApiException {
        //Long exerciseId = null;
        //ProgrammingExerciseTestCaseStateDTO response = api.hasAtLeastOneStudentResult(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lockAllRepositoriesTest() throws ApiException {
        //Long exerciseId = null;
        //api.lockAllRepositories(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reEvaluateAndUpdateProgrammingExerciseTest() throws ApiException {
        //Long exerciseId = null;
        //ProgrammingExercise programmingExercise = null;
        //Boolean deleteFeedback = null;
        //ProgrammingExercise response = api.reEvaluateAndUpdateProgrammingExercise(exerciseId, programmingExercise, deleteFeedback);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recreateBuildPlansTest() throws ApiException {
        //Long exerciseId = null;
        //api.recreateBuildPlans(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unlockAllRepositoriesTest() throws ApiException {
        //Long exerciseId = null;
        //api.unlockAllRepositories(exerciseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProblemStatementTest() throws ApiException {
        //Long exerciseId = null;
        //String body = null;
        //String notificationText = null;
        //ProgrammingExercise response = api.updateProblemStatement(exerciseId, body, notificationText);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProgrammingExerciseTest() throws ApiException {
        //ProgrammingExercise programmingExercise = null;
        //String notificationText = null;
        //ProgrammingExercise response = api.updateProgrammingExercise(programmingExercise, notificationText);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProgrammingExerciseTimelineTest() throws ApiException {
        //ProgrammingExercise programmingExercise = null;
        //String notificationText = null;
        //ProgrammingExercise response = api.updateProgrammingExerciseTimeline(programmingExercise, notificationText);
        // TODO: test validations
    }

}