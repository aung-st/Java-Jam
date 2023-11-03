import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class scraper {
        public static Document getHTML (String url) throws IOException {
            Document document = Jsoup.connect(url).userAgent("Mozilla/5.0 (" +
                    "Windows NT 10.0; Win64; x64) " +
                    "AppleWebKit/537.36 (KHTML, like Gecko) " +
                    "Chrome/107.0.0.0 Safari/537.36").get();
            try {
                return document;
            } catch(Exception e) {
                System.out.println("Something went wrong...");
            }
            return document;
        }

        public static void main(String[] args) throws IOException {
            Document scrape = getHTML("https://www.scrapingdog.com/blog/");
            System.out.print(scrape);
        }
}
