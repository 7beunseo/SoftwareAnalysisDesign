package study.ch18.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "사과", "포도", "바나나", "오렌지",
    };
    public int getMoney() {
        return money;
    }

    public Gamer(int money) {
        this.money = money;
    }

    public void bet() {
        // 주사위를 던진다
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            // 1의 눈 … 소지금이 증가한다
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        } else if (dice == 2) {
            // 2의 눈 … 소지금이 절반이 된다
            money /= 2;
            System.out.println("소지금이 절반으로 줄었습니다.");
        } else if (dice == 6) {
            // 6의 눈 … 과일을 받는다
            String f = getFruit();
            System.out.println("과일(" + f + ")를 받았습니다.");
            fruits.add(f);
        } else {
            // 그 밖의 눈 … 아무일도 일어나지 않는다
            System.out.println("변동 사항이 없습니다.");
        }
    }

    private String getFruit() {
        String fruit = fruitsName[random.nextInt(fruitsName.length)];
        if(random.nextBoolean())
            fruit = "맛있는 " + fruit;
        return fruit;
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for(String fruit : fruits) {
            if(fruit.startsWith("맛있는")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento m) {
        this.money = m.getMoney();
        this.fruits = m.getFruits();
    }
}
