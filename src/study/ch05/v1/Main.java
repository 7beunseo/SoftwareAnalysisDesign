package study.ch05.v1;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1 == s2) {
            System.out.println("두 인스턴스가 같습니다");
        }
        else {
            System.out.println("두 인스턴스가 다릅니다");
        }
    }
}
