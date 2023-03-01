package de.tum.cit.ase.artemis.sdk;

import de.tum.cit.ase.artemis.sdk.*;
import de.tum.cit.ase.artemis.sdk.api.AdminCourseResourceApi;
import de.tum.cit.ase.artemis.sdk.auth.*;
import de.tum.cit.ase.artemis.sdk.model.*;
import de.tum.cit.ase.artemis.sdk.api.CourseResourceApi;
import java.io.File;
import java.util.Base64;

public class Test {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        defaultClient.addDefaultHeader("Cookie", "jwt=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhcnRlbWlzX2FkbWluIiwiYXV0aCI6IlJPTEVfVVNFUixST0xFX0FETUlOIiwiZXhwIjoxNjc3MjUzMTM2fQ.kvrmmAv4DAo77KOPNEksULFqwsKa0CoKe4olyGUVMLD2nYjhu79TsUkQypBNaAAUDFLFtsTB8PeR-V_Eg8DCMQ; Path=/; Max-Age=86400; Expires=Fri, 24 Feb 2023 15:38:56 GMT; Secure; HttpOnly; SameSite=Lax");
        CourseResourceApi apiInstance = new CourseResourceApi(defaultClient);
        try {
            Course course = apiInstance.getCourse(1L);
            System.out.println(course.toString());
            //Course course1 = new Course().testCourse(true).shortName("tss").title("Test").onlineCourse(false);
            //AdminCourseResourceApi adminApiInstance = new AdminCourseResourceApi(defaultClient);
            //course1 = adminApiInstance.createCourse(course1, new File("/home/lpusl/Pictures/PRIVAT/memes/hive_adventure.jpg"));
        } catch (ApiException e) {
            System.err.println("Exception");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
