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
import de.tum.cit.ase.artemis.sdk.model.Course;
import de.tum.cit.ase.artemis.sdk.model.CourseManagementDetailViewDTO;
import de.tum.cit.ase.artemis.sdk.model.CourseManagementOverviewStatisticsDTO;
import java.io.File;
import de.tum.cit.ase.artemis.sdk.model.GetAllTextSubmissions200ResponseInner;
import de.tum.cit.ase.artemis.sdk.model.OnlineCourseConfiguration;
import java.util.Set;
import de.tum.cit.ase.artemis.sdk.model.StatsForDashboardDTO;
import de.tum.cit.ase.artemis.sdk.model.StudentDTO;
import de.tum.cit.ase.artemis.sdk.model.User;
import de.tum.cit.ase.artemis.sdk.model.UserDTO;
import de.tum.cit.ase.artemis.sdk.model.UserPublicInfoDTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CourseResourceApi
 */
public class CourseResourceApiTest {

    private final CourseResourceApi api = new CourseResourceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEditorToCourseTest() throws ApiException {
        //Long courseId = null;
        //String editorLogin = null;
        //api.addEditorToCourse(courseId, editorLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addInstructorToCourseTest() throws ApiException {
        //Long courseId = null;
        //String instructorLogin = null;
        //api.addInstructorToCourse(courseId, instructorLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addStudentToCourseTest() throws ApiException {
        //Long courseId = null;
        //String studentLogin = null;
        //api.addStudentToCourse(courseId, studentLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addTutorToCourseTest() throws ApiException {
        //Long courseId = null;
        //String tutorLogin = null;
        //api.addTutorToCourse(courseId, tutorLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUsersToCourseGroupTest() throws ApiException {
        //Long courseId = null;
        //String courseGroup = null;
        //List<StudentDTO> studentDTO = null;
        //List<StudentDTO> response = api.addUsersToCourseGroup(courseId, courseGroup, studentDTO);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveCourseTest() throws ApiException {
        //Long courseId = null;
        //api.archiveCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cleanup1Test() throws ApiException {
        //Long courseId = null;
        //File response = api.cleanup1(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadCourseArchiveTest() throws ApiException {
        //Long courseId = null;
        //File response = api.downloadCourseArchive(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActiveStudentsForCourseDetailViewTest() throws ApiException {
        //Long courseId = null;
        //Long periodIndex = null;
        //List<Integer> response = api.getActiveStudentsForCourseDetailView(courseId, periodIndex);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActiveStudentsForCourseLiveTimeTest() throws ApiException {
        //Long courseId = null;
        //List<Integer> response = api.getActiveStudentsForCourseLiveTime(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesTest() throws ApiException {
        //Boolean onlyActive = null;
        //List<Course> response = api.getAllCourses(onlyActive);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesForDashboardTest() throws ApiException {
        //List<Course> response = api.getAllCoursesForDashboard();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesForManagementOverviewTest() throws ApiException {
        //Boolean onlyActive = null;
        //List<Course> response = api.getAllCoursesForManagementOverview(onlyActive);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesForNotificationsTest() throws ApiException {
        //List<Course> response = api.getAllCoursesForNotifications();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesToRegisterTest() throws ApiException {
        //List<Course> response = api.getAllCoursesToRegister();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesWithQuizExercisesTest() throws ApiException {
        //List<Course> response = api.getAllCoursesWithQuizExercises();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCoursesWithUserStatsTest() throws ApiException {
        //Boolean onlyActive = null;
        //List<Course> response = api.getAllCoursesWithUserStats(onlyActive);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllEditorsInCourseTest() throws ApiException {
        //Long courseId = null;
        //List<User> response = api.getAllEditorsInCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllInstructorsInCourseTest() throws ApiException {
        //Long courseId = null;
        //List<User> response = api.getAllInstructorsInCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllStudentsInCourseTest() throws ApiException {
        //Long courseId = null;
        //List<User> response = api.getAllStudentsInCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTutorsInCourseTest() throws ApiException {
        //Long courseId = null;
        //List<User> response = api.getAllTutorsInCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCategoriesInCourseTest() throws ApiException {
        //Long courseId = null;
        //Set<String> response = api.getCategoriesInCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseTest() throws ApiException {
        //Long courseId = null;
        //Course response = api.getCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseDTOForDetailViewTest() throws ApiException {
        //Long courseId = null;
        //CourseManagementDetailViewDTO response = api.getCourseDTOForDetailView(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseForAssessmentDashboardTest() throws ApiException {
        //Long courseId = null;
        //Course response = api.getCourseForAssessmentDashboard(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseForDashboardTest() throws ApiException {
        //Long courseId = null;
        //Boolean refresh = null;
        //Course response = api.getCourseForDashboard(courseId, refresh);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseTitleTest() throws ApiException {
        //Long courseId = null;
        //String response = api.getCourseTitle(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseWithExercisesTest() throws ApiException {
        //Long courseId = null;
        //Course response = api.getCourseWithExercises(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCourseWithOrganizationsTest() throws ApiException {
        //Long courseId = null;
        //Course response = api.getCourseWithOrganizations(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExerciseStatsForCourseOverviewTest() throws ApiException {
        //Boolean onlyActive = null;
        //List<CourseManagementOverviewStatisticsDTO> response = api.getExerciseStatsForCourseOverview(onlyActive);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExercisesForCourseOverviewTest() throws ApiException {
        //Boolean onlyActive = null;
        //List<Course> response = api.getExercisesForCourseOverview(onlyActive);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLockedSubmissionsForCourseTest() throws ApiException {
        //Long courseId = null;
        //List<GetAllTextSubmissions200ResponseInner> response = api.getLockedSubmissionsForCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatsForAssessmentDashboardTest() throws ApiException {
        //Long courseId = null;
        //StatsForDashboardDTO response = api.getStatsForAssessmentDashboard(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerForCourseTest() throws ApiException {
        //Long courseId = null;
        //User response = api.registerForCourse(courseId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeEditorFromCourseTest() throws ApiException {
        //Long courseId = null;
        //String editorLogin = null;
        //api.removeEditorFromCourse(courseId, editorLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeInstructorFromCourseTest() throws ApiException {
        //Long courseId = null;
        //String instructorLogin = null;
        //api.removeInstructorFromCourse(courseId, instructorLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeStudentFromCourseTest() throws ApiException {
        //Long courseId = null;
        //String studentLogin = null;
        //api.removeStudentFromCourse(courseId, studentLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTutorFromCourseTest() throws ApiException {
        //Long courseId = null;
        //String tutorLogin = null;
        //api.removeTutorFromCourse(courseId, tutorLogin);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchOtherUsersInCourseTest() throws ApiException {
        //Long courseId = null;
        //String nameOfUser = null;
        //List<User> response = api.searchOtherUsersInCourse(courseId, nameOfUser);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchStudentsInCourseTest() throws ApiException {
        //Long courseId = null;
        //String loginOrName = null;
        //List<UserDTO> response = api.searchStudentsInCourse(courseId, loginOrName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUsersInCourseTest() throws ApiException {
        //Long courseId = null;
        //String loginOrName = null;
        //List<String> roles = null;
        //List<UserPublicInfoDTO> response = api.searchUsersInCourse(courseId, loginOrName, roles);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCourseTest() throws ApiException {
        //Long courseId = null;
        //Course course = null;
        //File _file = null;
        //Course response = api.updateCourse(courseId, course, _file);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOnlineCourseConfigurationTest() throws ApiException {
        //Long courseId = null;
        //OnlineCourseConfiguration onlineCourseConfiguration = null;
        //OnlineCourseConfiguration response = api.updateOnlineCourseConfiguration(courseId, onlineCourseConfiguration);
        // TODO: test validations
    }

}
