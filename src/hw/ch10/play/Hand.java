package hw.ch10.play;

public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;
    private int handValue;

    private Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    private static Hand[] hands = { ROCK, SCISSORS, PAPER };

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) { // 인자로 또 다른 hand가 옴
        return fight(h) == -1; // 현재 손과 비교함
    }

    // 무승부는 0, this가 이기면 1, h가 이기면 -1
    private int fight(Hand h) {
        if (this == h) { // 현재 손과 인자가 들어온 손이 같으면
            // 그 this.handvalue == h.handvalue를 했어야 했음
            // 그러나 Hand 가 enum -> 0, 1 ,2 값만 가지게 되어있음
            // this == h : 현재 손과 인자로 들어온 손이 동일한 객체이면 -> 주소가 같으면 객체가 동일하다 (똑같은 객체일 때)
            // Rock, siser, paper는 한개씩밖에 생성이 안됨
            // 값이 같은지 비교할 필요 없이 클래스간 비교해도 됨(인스턴스 객체 자체를)
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}
