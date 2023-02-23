import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.MediaType;
import model.Course;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class ClientTwo {

    public static void main(String[] args) {

        try {
            HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("artemis_admin", "artemis_admin");
            var client = ClientBuilder.newClient();
            client.register(feature);
            var webTarget = client.target("http://localhost:8080/api");
            var courseTarget = webTarget.path("courses/1");
            Invocation.Builder invocationBuilder = courseTarget.request(MediaType.APPLICATION_JSON);
            Course response = invocationBuilder.get(Course.class);
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
