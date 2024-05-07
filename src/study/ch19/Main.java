package study.ch19;

public class Main {
    public static void main(String[] args) {
        SafeFrame safeFrame = new SafeFrame("hihi");
        while(true) {
            for(int i = 0; i < 24; i++) {
                safeFrame.setClock(i);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e) {

                }
            }
        }
    }
}
