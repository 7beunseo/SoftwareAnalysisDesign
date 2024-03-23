package study.ch03.v2;

public class StringDisplay implements AbstractDisplay {
    private String string;
    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < string.getBytes().length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
