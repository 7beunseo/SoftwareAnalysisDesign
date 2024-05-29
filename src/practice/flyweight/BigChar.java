package practice.flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;
    private String fontdata;
    public BigChar(char charname) {
        this.charname = charname;
        StringBuilder sb = new StringBuilder();
        String filename = "big" + charname + ".txt";
        try {
            for (String data : Files.readAllLines(Path.of(filename))) {
                sb.append(data);
                sb.append("\n");
            }
            fontdata = sb.toString();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void print() {
        System.out.println(fontdata);
    }
}
