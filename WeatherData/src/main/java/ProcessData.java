import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
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

    public static void writeToFile(FileWriter file, Set<String> content) throws IOException {
        // write content line by line into selected csv file
        for (String line : content) {
            System.out.println(line);
            file.write(line + "\n");
        }
    }

    public static void writeHeaders(FileWriter file) throws IOException {
        String[] headers = {"NO2","O3","SO2","PM2.5","overall_aqi","PM10","CO"};
        System.out.println(Arrays.toString(headers));
        file.write(Arrays.toString(headers).replaceAll("]","").replaceAll("\\[",""));
        file.close();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        JSONObject response = APICall.call();

        FileWriter airQualityData = ProcessData.makeFile("airQualityData");
        writeHeaders(airQualityData);


    }
}
