package study.ch05.v3;

public class Main extends Thread{
    public static void main(String[] args) {
        // Main 스레드 생성
        System.out.println("START");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("END");
    }
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(getName() + ": Obj = "+s);
    }

    // main 객체를 생성할 때 이름을 받음
    public Main(String name) {
        super(name);
    }
}
