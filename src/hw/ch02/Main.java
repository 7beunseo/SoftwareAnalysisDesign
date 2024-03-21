package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/hw/ch02/file.txt");
            f.setValue("Year", "2024");
            f.setValue("BornYear", "2003");
            f.setValue("StudentId", "20220961");
            f.setValue("Name", "eunseo");
            f.setValue("Location", "Gumi, Gyeongsangbuk-do");
            f.writeToFile("src/hw/ch02/김은서.txt");
            System.out.println("김은서.txt is created");
            System.out.println(f.getValue("Name"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
