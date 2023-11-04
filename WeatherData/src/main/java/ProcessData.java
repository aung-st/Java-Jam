import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class ProcessData {
    public static FileWriter makeFile(String name) throws IOException {
        // create a file in the data directory in WeatherData as a csv
        File file = new File("data/" + name + ".csv");
        try {
            return new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }
        return new FileWriter(file);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        JSONObject response = APICall.call();

        FileWriter airQualityData = ProcessData.makeFile("airQualityData");
        Set<String> headers = response.keySet();


    }
}
