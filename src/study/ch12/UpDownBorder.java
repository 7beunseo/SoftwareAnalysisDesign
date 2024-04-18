package study.ch12;

public class UpDownBorder extends Border{
    private char ch;
    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }
    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == getRows() -1) {
            return makeLine(getColumns());
        }
        return display.getRowText(row -1);
    }

    private String makeLine(int count) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
