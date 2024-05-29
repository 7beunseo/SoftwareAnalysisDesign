package study.ch15.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + title + "</h1>");
        writer.write("\n");
    }

    public void paragraph(String str) throws IOException {
        writer.write("<p>" + str + "</p>\n");
    }
    public void link(String href, String username) throws IOException {
        writer.write("<a href=\"" + href +"\">" + username + "</a>\n");
    }
    public void maileto(String mailaddr, String username) throws IOException{
        link("mailto:" + mailaddr, username);
    }
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.close();
    }
}
