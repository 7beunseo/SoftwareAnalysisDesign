package hw.ch05.v1;

/**
 * 싱글톤 생성 방법 1
 * singleton 변수를 private static으로 생성 후 변수 할당
 * 생성자도 private로 설정
 * getInstance 메서드로 singleton 변수 리턴하도록 함 (마찬가지로 static 로 설정)
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
