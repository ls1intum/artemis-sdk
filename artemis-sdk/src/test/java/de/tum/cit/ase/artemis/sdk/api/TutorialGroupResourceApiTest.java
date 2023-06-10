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
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.StudentDTO;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroup;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupRegistrationImportDTO;
import de.tum.cit.ase.artemis.sdk.model.TutorialGroupUpdateDTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TutorialGroupResourceApi
 */
public class TutorialGroupResourceApiTest {

    private final TutorialGroupResourceApi api = new TutorialGroupResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        //Long courseId = null;
        //TutorialGroup tutorialGroup = null;
        //TutorialGroup response = api.create(courseId, tutorialGroup);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        //Long courseId = null;
        //Long tutorialGroupId = null;
        //api.delete(courseId, tutorialGroupId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deregisterStudentTest() throws ApiException {
        //Long courseId = null;
        //Long tutorialGroupId = null;
        //String studentLogin = null;
        //api.deregisterStudent(courseId, tutorialGroupId, studentLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllForCourseTest() throws ApiException {
        //Long courseId = null;
        //List<TutorialGroup> response = api.getAllForCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTutorialGroupsForNotificationsTest() throws ApiException {
        //List<TutorialGroup> response = api.getAllTutorialGroupsForNotifications();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOneOfCourseTest() throws ApiException {
        //Long courseId = null;
        //Long tutorialGroupId = null;
        //TutorialGroup response = api.getOneOfCourse(courseId, tutorialGroupId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTitleTest() throws ApiException {
        //Long tutorialGroupId = null;
        //String response = api.getTitle(tutorialGroupId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUniqueCampusValuesTest() throws ApiException {
        //Long courseId = null;
        //Set<String> response = api.getUniqueCampusValues(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUniqueLanguageValuesTest() throws ApiException {
        //Long courseId = null;
        //Set<String> response = api.getUniqueLanguageValues(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importRegistrationsTest() throws ApiException {
        //Long courseId = null;
        //Set<TutorialGroupRegistrationImportDTO> tutorialGroupRegistrationImportDTO = null;
        //List<TutorialGroupRegistrationImportDTO> response = api.importRegistrations(courseId, tutorialGroupRegistrationImportDTO);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerMultipleStudentsToTutorialGroupTest() throws ApiException {
        //Long courseId = null;
        //Long tutorialGroupId = null;
        //Set<StudentDTO> studentDTO = null;
        //Set<StudentDTO> response = api.registerMultipleStudentsToTutorialGroup(courseId, tutorialGroupId, studentDTO);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerStudentTest() throws ApiException {
        //Long courseId = null;
        //Long tutorialGroupId = null;
        //String studentLogin = null;
        //api.registerStudent(courseId, tutorialGroupId, studentLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        //Long courseId = null;
        //Long tutorialGroupId = null;
        //TutorialGroupUpdateDTO tutorialGroupUpdateDTO = null;
        //TutorialGroup response = api.update(courseId, tutorialGroupId, tutorialGroupUpdateDTO);
        // TODO: test validations
    }

}
