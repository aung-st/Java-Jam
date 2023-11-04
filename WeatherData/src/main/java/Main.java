import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // city name to pass into API call
        String name = "London";

        // Get response data for London air quality
        JSONObject response = APICall.call(name);

        // save raw json response in data folder
        FileWriter file = ProcessData.makeFile(name);
        ProcessData.writeToFile(file,response);
    }
}
