package study.ch12;

public class FullBorder extends  Border{
    public FullBorder(Display display) {
        super(display);
    }
    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if(row == getRows() -1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        return "|" + display.getRowText(row - 1) + "|";
    }

    // 문자 ch로 count 수만큼 연속한 문자열을 만듦
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
