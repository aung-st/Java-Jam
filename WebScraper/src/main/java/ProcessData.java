import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;

public class ProcessData {
    public static FileWriter makeFile(String name) throws IOException {
        // create a file in the data directory in WebScraper as a csv
        File file = new File("data/" + name + ".csv");
        try {
            return new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }
        return new FileWriter(file);
    }

    public static void writeToFile(FileWriter file, List<String> content) throws IOException {
        // write content line by line into selected csv file
        for (String line : content) {
            file.write(line + "\n");
        }
    }
}
