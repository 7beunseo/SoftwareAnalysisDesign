package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_EunSeoKim extends Product {
    private String modelName;

    public Car_EunSeoKim(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println("모델명 " + modelName + "인 car을 사용합니다");
    }
    public String getModelName() {
        return modelName;
    }
}
