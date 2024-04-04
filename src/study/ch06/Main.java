package study.ch06;

import study.ch06.framework.Manager;
import study.ch06.framework.Product;

public class Main {
    public static void main(String[] args) {
        Product pen1 = new UnderlinePen('=');
        pen1.use("dukusng");

        Product pen2 = pen1.createCopy();
        pen2.use("duksung2");

        Product box1 = new MessageBox('-');
        box1.use("duksung");

        Product box2 = box1.createCopy();
        box2.use("duksung2");

        Manager manager = new Manager();

        Product upen = new UnderlinePen('-');
        Product mbox = new MessageBox('*');
        Product sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product sm = manager.create("strong message");
        sm.use("strong duksung");

        Product wb = manager.create("warning box");
        wb.use("warngin duksung");

        Product sb = manager.create("slash box");
        sb.use("slash duksung");


    }
}
