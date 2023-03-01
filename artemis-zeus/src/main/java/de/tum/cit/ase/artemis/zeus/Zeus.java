package de.tum.cit.ase.artemis.zeus;

import de.tum.cit.ase.artemis.sdk.ApiClient;
import de.tum.cit.ase.artemis.sdk.ApiResponse;
import de.tum.cit.ase.artemis.sdk.Configuration;
import de.tum.cit.ase.artemis.sdk.api.*;
import de.tum.cit.ase.artemis.sdk.model.LoginVM;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine;

import java.util.List;

@Command(name = "zeus", subcommands = {Creation.class, Show.class},
        mixinStandardHelpOptions = true, version = "0")
public class Zeus {

    @Option(names = {"--url"}, description = "URL with protocol and port of the Artemis Instance (default: ${DEFAULT-VALUE})")
    private static String artemisUrl = "http://localhost:8080";

    @Option(names = {"--username"}, description = "Artemis username (default: ${DEFAULT-VALUE})")
    private static String artemisUsername = "artemis_admin";
    @Option(names = {"--password"}, description = "Artemis password (default: ${DEFAULT-VALUE})")
    private static String artemisPassword = "artemis_admin";



    private static final ApiClient defaultClient = Configuration.getDefaultApiClient();
    public static ApiClient getDefaultClient() {
        return defaultClient;
    }

    //TODO: rethink were to put these Instances! I guess putting them here and creating them no matter what command
    // is suboptimal
    private static final UserJwtControllerApi userJwtControllerApi = new UserJwtControllerApi(getDefaultClient());
    public static UserJwtControllerApi getUserJwtControllerApi() { return userJwtControllerApi; }

    private static final CourseResourceApi courseResourceApi = new CourseResourceApi(Zeus.getDefaultClient());
    public static CourseResourceApi getCourseResourceApi() { return courseResourceApi; }

    private static final AdminCourseResourceApi adminCourseResourceApi = new AdminCourseResourceApi(Zeus.getDefaultClient());
    public static AdminCourseResourceApi getAdminCourseResourceApi() { return adminCourseResourceApi; }

    private static final TextExerciseResourceApi textExerciseResourceApi = new TextExerciseResourceApi(Zeus.getDefaultClient());
    public static TextExerciseResourceApi getTextExerciseResourceApi() { return textExerciseResourceApi; }

    private static final ModelingExerciseResourceApi modelingExerciseResourceApi = new ModelingExerciseResourceApi(Zeus.getDefaultClient());
    public static ModelingExerciseResourceApi getModelingExerciseResourceApi() { return modelingExerciseResourceApi; }

    private static final FileUploadExerciseResourceApi fileUploadExerciseResourceApi = new FileUploadExerciseResourceApi(Zeus.getDefaultClient());
    public static FileUploadExerciseResourceApi getFileUploadExerciseResourceApi() { return fileUploadExerciseResourceApi; }

    private static final QuizExerciseResourceApi quizExerciseResourceApi = new QuizExerciseResourceApi(Zeus.getDefaultClient());
    public static QuizExerciseResourceApi getQuizExerciseResourceApi() { return quizExerciseResourceApi; }


    private static String authenticateAndGetCookie(String username, String password) {
        LoginVM login = new LoginVM().password(password).username(username).rememberMe(false);
        ApiResponse<Void> loginResult = userJwtControllerApi.authorizeWithHttpInfo(defaultClient.getUserAgent(),login);

        String setCookieKey = "Set-Cookie";
        if (loginResult.getHeaders().containsKey(setCookieKey)) {
            List<String> cookieList = loginResult.getHeaders().get(setCookieKey);
            if (cookieList.size() == 1) {
                return cookieList.get(0);
            }
            else {
                throw new RuntimeException("There were multiple Set-Cookie cookies! I'm confused...");
            }
        }
        else {
            throw new RuntimeException("Couldn't find a single cookie!");
        }
    }

    public static void prepareRestClient() {
        defaultClient.setBasePath(Zeus.artemisUrl);
        //TODO: maybe reuse/use the official jersey authentication methods?
        defaultClient.addDefaultHeader("Cookie", authenticateAndGetCookie(Zeus.artemisUsername, Zeus.artemisPassword));
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Zeus()).execute(args);
        System.exit(exitCode);
    }
}