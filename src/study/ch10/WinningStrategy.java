package study.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy{
    private Random random; // 난수 생성기
    private boolean won = false; // 직전 승부
    private Hand prevHand; // 직전에 내민 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 직전에 졌으면 ...
            prevHand = Hand.getHand(random.nextInt(3)); // 랜덤으로 손 생성
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
