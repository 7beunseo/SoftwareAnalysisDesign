package hw.ch05.idcard;
// 김은서 : 속성에서 미리 생성하는 방식을 이용한 싱글톤 패턴 생성
public class IDCardFactoryEunSeoKim1 {
    private static IDCardFactoryEunSeoKim1 idCardFactoryEunSeoKim1;
    private IDCardFactoryEunSeoKim1() {
        idCardFactoryEunSeoKim1 = new IDCardFactoryEunSeoKim1();
        System.out.println("IDCardFActoryEunSeoKim1 : IDCard를 생성했습니다.");
    }
    public static IDCardFactoryEunSeoKim1 getInstance() {
        return idCardFactoryEunSeoKim1;
    }
}
