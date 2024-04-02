package hw.ch05;

import hw.ch05.idcard.IDCardFactoryEunSeoKim2;

public class Main2 extends Thread{ // 김은서 : thread 상속
    public static void main(String[] args) {
        System.out.println("--start--");
        new Main2("최승훈").start();
        new Main2("김은서").start();
        new Main2("유은실").start();
        System.out.println("--end--");
    }

    @Override
    public void run() {
        IDCardFactoryEunSeoKim2 obj = IDCardFactoryEunSeoKim2.getInstance();
        System.out.println(getName() + ": idCard = " + obj);
    }

    public Main2(String name) {
        super(name);
    }
}
