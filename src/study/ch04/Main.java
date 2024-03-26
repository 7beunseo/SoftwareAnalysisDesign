package study.ch04;

import study.ch04.framwork.Factory;
import study.ch04.framwork.Product;
import study.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220961 김은서");
        Factory f = new IDCardFactory();
        Product p1 = f.create("eunseo1");
        Product p2 = f.create("eunseo2");
        Product p3 = f.create("eunseo3");
        Product p4 = f.create("eunseo4");
        p1.use();
        p2.use();
        p3.use();
        p4.use();


    }
}
