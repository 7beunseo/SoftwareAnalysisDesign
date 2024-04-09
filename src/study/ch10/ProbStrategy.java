package study.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    // 랜덤 수 발생
    private Random random;

    // 직전에 어떤 손을 냈는지 저장
    private int prevHandValue = 0;
    private int currentHandValue = 0;

    // 이긴 횟수를 2차원 배열로 저장
    private int[][] history = {
            { 1, 1, 1, },
            { 1, 1, 1, },
            { 1, 1, 1, },
    };

    // 생성자에 난수 발생기 생성
    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    // 난수를 발생시켜 범위에 해당하는 값 리턴하도록 함
    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue)); // 행을 더해서 난수를 발생시킴 (15의 경우 0~14의 난수 발생)

        int handvalue = 0;
        if (bet < history[currentHandValue][0]) { // 직전에 주먹을 내서 이긴 횟수보다 bet가 작으면 handvalue에 0 대입
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) { // 발생한 숫자가 ex 8보다 작으면
            handvalue = 1;
        } else {
            handvalue = 2;
        }

        prevHandValue = currentHandValue; // 이전 값에 대입
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    // 한 행의 모든 값을 더하는 메서드
    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; // 행을 더함
        }
        return sum;
    }


    // 이겼는지, 졌는지 정보를 배열에 반영
    @Override
    public void study(boolean win) {
        if (win) { // 이겼으면
            history[prevHandValue][currentHandValue]++; // 해당 칸에 1을 더함
        } else { // 졌으면
            history[prevHandValue][(currentHandValue + 1) % 3]++; // 다른 칸에 1을 더함
            history[prevHandValue][(currentHandValue + 2) % 3]++; // 다른 칸에 1을 더함
        }
    }
}
