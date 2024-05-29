package study.ch15.pagemaker;

import javax.xml.crypto.Data;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {}
    public static Properties getProperties(String dbname) throws IOException {
        Properties prop = new Properties();
        String filename = dbname + ".txt";
        prop.load(new FileReader(filename));
        return prop;
    }
}
