package study.ch03.v2;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay a = new CharDisplay('a');
        a.display();
        
        a = new StringDisplay("eunseo");
        a.display();
    }
}
