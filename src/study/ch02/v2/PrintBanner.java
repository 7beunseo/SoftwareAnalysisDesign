package study.ch02.v2;

public class PrintBanner implements Print{
    private Banner b;
    public PrintBanner(String string) {
        b = new Banner(string);
    }
    @Override
    public void printWeak() {
        b.showWithParen();
    }

    @Override
    public void printStrong() {
        b.showWithAster();
    }
}
