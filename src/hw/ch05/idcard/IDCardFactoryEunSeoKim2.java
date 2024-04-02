package hw.ch05.idcard;

// 김은서 : 속성에서 미리 생성하는 방식을 이용한 싱글톤 패턴 생성
public class IDCardFactoryEunSeoKim2 {
    private static IDCardFactoryEunSeoKim2 idCardFactoryEunSeoKim2 = null;
    private IDCardFactoryEunSeoKim2() {
        slowdown(); // 김은서 : 객체가 생성될 때 3초가 걸리도록 설정
        System.out.println("IDCardFactoryEunSeoKim2 : IDCard를 생성했습니다");
    }

    public static synchronized IDCardFactoryEunSeoKim2 getInstance() {
        if (idCardFactoryEunSeoKim2 == null) {
            idCardFactoryEunSeoKim2 = new IDCardFactoryEunSeoKim2();
        }
        return idCardFactoryEunSeoKim2;
    }

    private  void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}
