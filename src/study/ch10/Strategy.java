package study.ch10;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
