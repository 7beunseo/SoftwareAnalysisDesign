package study.ch15.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties prop = Database.getProperties("maildata");
            String username = prop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("welcome to " + username + "'s page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.maileto(mailaddr, username);
            writer.close();
            System.out.println(filename + " created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
