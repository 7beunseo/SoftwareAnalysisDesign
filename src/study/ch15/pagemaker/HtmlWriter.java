package study.ch15.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        String myhtml = """
                <!DOCTYPE html>
                    <html>
                         <head>
                              <title>%s</title>
                         </head>
                         <body>
                            <h1>%s</h1>
                """.formatted(title, title);
        writer.write(myhtml);
    }
    public void paragraph(String str) throws IOException{
        writer.write("<p>" + str + "</p>\n");
    }
    public void link(String href, String str) throws IOException{
        paragraph("<a href=\"" + href + "\">" + str + "</a>");
    }
    public void mailto(String mailaddr, String username) throws IOException{
        link("mailto:" + mailaddr, username);
    }
    public void close() throws IOException{
        writer.write("</body>\n");
        writer.write("</html>\n");
        writer.close();
    }
}
