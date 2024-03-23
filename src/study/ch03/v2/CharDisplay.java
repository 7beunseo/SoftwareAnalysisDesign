package study.ch03.v2;

public class CharDisplay implements AbstractDisplay {
    private char c;

    public CharDisplay(char c){
        this.c = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
