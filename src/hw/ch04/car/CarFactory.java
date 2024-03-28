package hw.ch04.car;



import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

import java.util.Iterator;
import java.util.Vector;

public class CarFactory extends Factory {
    private Vector<String> modelNames; // 김은서 : 생산된 제품들의 모델명들을 저장하는 변수 생성
    @Override
    protected Product createProduct(String owner) {
        modelNames = new Vector<>(); // 김은서 : modelNames 초기화
        return new Car_EunSeoKim(owner); // 김은서 : 생성된 모델명의 car을 생성하여 반환
    }

    @Override
    protected void registerProduct(Product product) {
        modelNames.add(((Car_EunSeoKim) product).getModelName()); // 김은서 : car 객체의 getMethodName() 가져와 modelNames에 저장 - 다운캐스팅 맞는지 확인 필요
    }

    public void printAllModelNames() {
        Iterator<String> it = modelNames.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
