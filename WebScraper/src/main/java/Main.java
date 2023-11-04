import org.jsoup.nodes.Document;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // fetch page
        Document scrape = Scraper.getHTML("https://en.wikipedia.org/wiki/Prime_number");
        // create file to store links
        FileWriter fileLinks = ProcessData.makeFile("links");
        List<String> links = Scraper.getLinks(scrape);
        ProcessData.writeToFile(fileLinks,links);

        // create file to store headers
        FileWriter fileHeaders = ProcessData.makeFile("headers");
        List<String> headers = Scraper.getHeaders(scrape);
        ProcessData.writeToFile(fileHeaders,headers);
    }
}
