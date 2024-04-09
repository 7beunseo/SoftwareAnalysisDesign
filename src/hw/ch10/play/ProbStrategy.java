package hw.ch10.play;


import java.util.Random;

public class ProbStrategy implements Strategy{
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;

    private int[][] history = { // 2차원 배열을 사용함
            { 1, 1, 1, },
            { 1, 1, 1, },
            { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

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

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; // 행을 더함
        }
        return sum;
    }


    @Override
    public void study(boolean win) {
        if(win) {

        }
    }
}
