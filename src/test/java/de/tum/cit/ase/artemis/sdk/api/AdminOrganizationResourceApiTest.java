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
import de.tum.cit.ase.artemis.sdk.model.Organization;
import de.tum.cit.ase.artemis.sdk.model.OrganizationCountDTO;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminOrganizationResourceApi
 */
public class AdminOrganizationResourceApiTest {

    private final AdminOrganizationResourceApi api = new AdminOrganizationResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCourseToOrganizationTest() throws ApiException {
        //Long courseId = null;
        //Long organizationId = null;
        //api.addCourseToOrganization(courseId, organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOrganizationTest() throws ApiException {
        //Organization organization = null;
        //Organization response = api.addOrganization(organization);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToOrganizationTest() throws ApiException {
        //String userLogin = null;
        //Long organizationId = null;
        //api.addUserToOrganization(userLogin, organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrganizationTest() throws ApiException {
        //Long organizationId = null;
        //api.deleteOrganization(organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllOrganizationsTest() throws ApiException {
        //List<Organization> response = api.getAllOrganizations();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllOrganizationsByUserTest() throws ApiException {
        //Long userId = null;
        //Set<Organization> response = api.getAllOrganizationsByUser(userId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNumberOfUsersAndCoursesByOrganizationTest() throws ApiException {
        //Long organizationId = null;
        //OrganizationCountDTO response = api.getNumberOfUsersAndCoursesByOrganization(organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNumberOfUsersAndCoursesOfAllOrganizationsTest() throws ApiException {
        //List<OrganizationCountDTO> response = api.getNumberOfUsersAndCoursesOfAllOrganizations();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrganizationByIdTest() throws ApiException {
        //Long organizationId = null;
        //Organization response = api.getOrganizationById(organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrganizationByIdWithUsersAndCoursesTest() throws ApiException {
        //Long organizationId = null;
        //Organization response = api.getOrganizationByIdWithUsersAndCourses(organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrganizationTitleTest() throws ApiException {
        //Long organizationId = null;
        //String response = api.getOrganizationTitle(organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCourseFromOrganizationTest() throws ApiException {
        //Long courseId = null;
        //Long organizationId = null;
        //api.removeCourseFromOrganization(courseId, organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromOrganizationTest() throws ApiException {
        //String userLogin = null;
        //Long organizationId = null;
        //api.removeUserFromOrganization(userLogin, organizationId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrganizationTest() throws ApiException {
        //Long organizationId = null;
        //Organization organization = null;
        //Organization response = api.updateOrganization(organizationId, organization);
        // TODO: test validations
    }

}