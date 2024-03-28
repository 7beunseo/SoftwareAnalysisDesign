package hw.ch05.v2;

import hw.ch05.v1.Singleton;

public class Main {
    public static void main(String[] args) {
        hw.ch05.v1.Singleton s1 = hw.ch05.v1.Singleton.getInstance();
        hw.ch05.v1.Singleton s2 = Singleton.getInstance();

        if(s1 == s2) {
            System.out.println("두 인스턴스가 같습니다");
        }
        else {
            System.out.println("두 인스턴스가 다릅니다");
        }
    }
}
