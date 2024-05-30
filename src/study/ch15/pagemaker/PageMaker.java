package study.ch15.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    // mail
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("eunseo");
            writer.mailto(mailaddr, username);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // link
    public static void makeLinkPage(String filename) {
        try {
            Properties linkProp = Database.getProperties("maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Mail Link");
            for(String data : linkProp.stringPropertyNames()) {
                String username = linkProp.getProperty(data);
                writer.mailto(data, username);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
