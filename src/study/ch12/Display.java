package study.ch12;

public abstract class Display {
    public abstract int getColumns();  // 가로 문자 수
    public abstract int getRows();  // 세로 문자 수
    public abstract String getRowText(int row);

    public void show() { // 모든 행을 출력함
        for(int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
