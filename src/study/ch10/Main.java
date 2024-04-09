package study.ch10;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("김은서",  new ProbStrategy(100));
        Player p2 = new Player("김덕우", new WinningStrategy(200));

        // player에게서 손을 받음
        Hand h1 = p1.nextHand();
        Hand h2 = p2.nextHand();

        if (h1.isStrongerThan(h2)) {
            p1.win();
            p2.lose();
        } else if(h1.isWeakerThan(h2)) {
            p1.lose();
            p2.win();
        } else {
            p1.even();
            p2.even();
        }

        System.out.println(p1);
        System.out.println(p2); // toString 메서드 호출

        // 전략을 동적으로 교체
        p1.setStratergy(new WinningStrategy(300));

    }
}
