package hw.ch05.v2;

/**
 * 싱글톤 생성 방법 2
 * singleton 변수를 private static으로 선언하나 초기값으로 null을 넣어줌
 * 생성자는 private으로 설정
 * getInstance()에서 singleton이 null이면 새로 할당, 아니라면 그냥 singleton return
 */
public class Singleton {
    private static Singleton singleton = null; // null을 넣음 - 아무 객체도 없다는 표시
    private Singleton() {
        System.out.println("singleton 객체가 생성되었습니다");
    }

    public static Singleton getInstance() {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}
