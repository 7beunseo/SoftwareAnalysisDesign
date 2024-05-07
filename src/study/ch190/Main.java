package study.ch190;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("20220961 김은서");
        while(true) {
            for(int i = 0; i < 24; i++) {
                frame.setClock(i);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {

                }
            }
        }
    }
}
