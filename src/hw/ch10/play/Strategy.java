package hw.ch10.play;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
