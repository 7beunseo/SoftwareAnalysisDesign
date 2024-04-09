package study.ch10;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand(); // 전략 객체에게 *위임*함
    }

    // 승리
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    // 무승부
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "["
                + name + ":"
                + gamecount + " games, "
                + wincount + " win, "
                + losecount + " lose"
                + "]";
    }

    // 추가 - 전략 교체
    public void setStratergy(Strategy strategy) {
        this.strategy = strategy;
    }
}
