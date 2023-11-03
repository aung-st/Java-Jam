import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

public class ProcessData {
    public static FileWriter makeFile(String name) throws IOException {
        File file = new File("data/"+name + ".csv");
        try {
            return new FileWriter(file);
        }catch (IOException e){
            System.out.println("Something went wrong...");
        }
        return new FileWriter(file);
    }

    public static void writeToFile(FileWriter file, List<String> content) throws IOException {
        try {
            for (String line : content) {
                file.write(line + "\n");
            }
        } catch (IOException e){
            System.out.println("Something went wrong...");
        }
    }

    public static void main(String[] args) throws IOException {
          FileWriter file = makeFile("links");

          Document scrape = Scraper.getHTML("https://en.wikipedia.org/wiki/Prime_number");

          List<String> links = Scraper.getLinks(scrape);

          writeToFile(file,links);
    }
}
