package hw.ch05;

import hw.ch05.idcard.IDCardFactoryEunSeoKim1;

public class Main1 {
    public static void main(String[] args) {
        IDCardFactoryEunSeoKim1 factory1 = IDCardFactoryEunSeoKim1.getInstance();
        IDCardFactoryEunSeoKim1 factory2 = IDCardFactoryEunSeoKim1.getInstance();

        if(factory1 == factory2) {
            System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        } else {
            System.out.println("factory1과 factory2는 다른 인스턴스입니다.");
        }
    }
}
