package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220961 김은서");
        MultiStringDisplay md = new MultiStringDisplay();

        md.add("학번 : 20220961");
        md.add("이름: 김은서");
        md.add("핸드폰 번호 : 01082302512");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();

        Display d3 = new MultiSideBorder(d2, '*', 3);
        d3.show();
    }
}
