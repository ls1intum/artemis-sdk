import jakarta.ws.rs.client.ClientBuilder;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

public class Client {

    private static jakarta.ws.rs.client.Client createClient() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManager = new X509TrustManager[] { new X509TrustManager() {

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {

            }
        }};

        SSLContext sslContext = null;
        sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustManager, null);

        var client = ClientBuilder.newBuilder().sslContext(sslContext).build();
        return client;
    }

    public static void main(String[] args) {
        var url = "https://catfact.ninja/fact";
        try {
            var client = createClient();

            var resp = client.target(url).request().get();
            resp.bufferEntity();
            var result = resp.readEntity(String.class);
            System.out.println(result);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

}
