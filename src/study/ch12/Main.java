package study.ch12;

public class Main {
    public static void main(String[] args) {
        Display str1 = new StringDisplay("hihi");
        str1.show();

        Display side1 = new SideBorder(str1, '+');
        side1.show();

        Display full1 = new FullBorder(side1);
        full1.show();

        // 중심 객체
        Display b1 = new StringDisplay("Hello, world.");
        // 장식자 객체
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b3 = new UpDownBorder(b3, '-');

        b1.show();
        b2.show();

        System.out.println();
        b3.show();
        System.out.println();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("Hello, world.")
                                                ),
                                                '*' // 별표로 장식
                                        )
                                )
                        ),
                        '/'
                );
        b4.show();
    }
}
