package hw.ch12;

public class MultiSideBorder extends Border{
    private char ch;
    private int num;

    public MultiSideBorder(Display display, char ch, int num) {
        super(display);
        this.ch = ch;
        this.num = num;

    }
    @Override
    public int getColumns() {
        return display.getColumns() + num * 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return side(ch, num) + display.getRowText(row) + side(ch, num);
    }

    private String side(char ch, int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
