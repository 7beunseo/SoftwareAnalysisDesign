package study.ch05.v3;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("객체가 생성되었습니다");
        slowdown();
    }
    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
