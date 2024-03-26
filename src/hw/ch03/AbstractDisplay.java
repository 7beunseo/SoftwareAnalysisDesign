package hw.ch03;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display(int times) { // 김은서 : display 메서드에 times 매개변수 받도록 수정
        open();
        for (int i = 0; i < times; i++) { // 김은서 : times 값만큼 for문 반복
            print();
        }
        close();
    }
}