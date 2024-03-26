package study.ch04.framwork;

// 일반적인 공장
public abstract class Factory {
    // 큰 흐름(생산과정) 결정 => template method
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 구체적인 생산과 등록은 하위 클래스에서 결정한다.
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
