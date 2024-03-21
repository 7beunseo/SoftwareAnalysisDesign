package study.ch02.v1;

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
