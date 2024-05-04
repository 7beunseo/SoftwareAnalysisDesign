package study.ch17;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        // 관찰자들
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();

        // 관찰자를 관찰 대상으로 등록
        generator.addObserver(o1);
        generator.addObserver(o2);

        // 관찰 대상에게 상태 변화 실행
        generator.execute();
    }
}
