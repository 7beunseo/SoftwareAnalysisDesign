package study.ch04.idcard;

import study.ch04.framwork.Factory;
import study.ch04.framwork.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;
    @Override
    protected Product createProduct(String owner) {
        IDCard idCard = new IDCard(owner, serial);
        serial++;
        return idCard;
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
