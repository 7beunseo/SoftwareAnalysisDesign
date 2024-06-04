package study.ch18;

import study.ch18.game.Gamer;
import study.ch18.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100000);
        Memento m = gamer.createMemento();

        for(int i = 0; i < 10; i++) {
            gamer.bet();
            System.out.println(gamer);

            if(i == 5) {
                m = gamer.createMemento();
                System.out.println("from momento : " + m.getMoney());

            }
            if(i == 7) {
                System.out.println("== resored ==");
                gamer.restoreMemento(m);
                System.out.println("from memento : " + m.getMoney());
            }
        }

    }
}
