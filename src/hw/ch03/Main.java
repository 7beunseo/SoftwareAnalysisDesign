package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220961 김은서");

        AbstractDisplay a = new KimEunSeoDisplay("김은서", "20220961", 2);
        a.display(10);
        a.display(5);
    }
}
