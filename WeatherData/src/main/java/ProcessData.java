import com.google.gson.Gson;
import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

public class ProcessData {
    public static FileWriter makeFile(String name) throws IOException {
        // create a file in the data directory in WeatherData as a csv
        File file = new File("data/" + name + ".json");
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

    public static void writeToFile(FileWriter file, JSONObject raw_json) throws IOException{
        Gson gson = new Gson();
        gson.toJson(raw_json, file);
        file.close();
    }
}
