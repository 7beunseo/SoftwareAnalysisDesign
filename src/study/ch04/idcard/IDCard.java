package study.ch04.idcard;

import study.ch04.framwork.Product;

public class IDCard extends Product {
    private int serial;
    private String owner;
    IDCard(String owner, int serial) {
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }
    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }
}
