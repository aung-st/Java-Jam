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

    public static void main(String[] args) throws IOException {
          FileWriter file = makeFile("links");
//        Document scrape = Scraper.getHTML("https://en.wikipedia.org/wiki/Prime_number");
//        List<String> headings = Scraper.getHeaders(scrape);
//        for (String s : headings) {
//            System.out.println(s);
//        }
//
//        List<String> links = Scraper.getLinks(scrape);
//        for (String l: links) {
//            System.out.println(l);
//        }
    }
}
