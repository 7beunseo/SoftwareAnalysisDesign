package hw.ch02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {// 김은서 : 상속을 이용한 어댑터 패턴으로 변경

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileReader(filename)); // 김은서 : 상속받은 메서드 load 호출
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileWriter(filename), "written by FileProperties"); // 김은서 : 상속받은 메서드 store 호출
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value); // 김은서 : 상속받은 메서드 setProperty 호출
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, ""); // 김은서 : 상속받은 메서드 getProperty 호출
    }
}
