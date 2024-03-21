package study.ch02.v2;

// 위임 이용
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hi");
        p.printWeak();
        p.printStrong();
    }
}
