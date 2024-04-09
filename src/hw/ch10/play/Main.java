package hw.ch10.play;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("김은서", new ProbStrategy(100));
        Player p2 = new Player("김덕성", new WinningStartegy(200));

        Hand h1 = p1.nextHand();
        Hand h2 = p2.nextHand();

        if(h1.isStrongerThan(h2)) {
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
        System.out.println(p2);
    }
}
