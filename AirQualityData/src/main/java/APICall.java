import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import org.json.JSONObject;

public class APICall {
    final static String key = System.getenv("APIKEY");
    public static JSONObject call(String name) throws IOException, InterruptedException {

        // get air quality data on city name parameter as json response data
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://air-quality-by-api-ninjas.p.rapidapi.com/v1/airquality?city="+name))
                .header("X-RapidAPI-Key", key)
                .header("X-RapidAPI-Host", "air-quality-by-api-ninjas.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        JSONObject jsonResponse = new JSONObject(response.body());
        try {
            return jsonResponse;
        } catch (Exception e) {
            System.out.println("Something went wrong: "+e);
        }
        return jsonResponse;
    }
}
