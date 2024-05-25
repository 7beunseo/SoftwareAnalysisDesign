package study.ch07;

public class Main {
    public static void main(String[] args) {
        TextBuilder b1 = new TextBuilder();
        Director d1 = new Director(b1);
        d1.construct();

        System.out.println(b1.getTextResult());

        HTMLBuilder hb1 = new HTMLBuilder();
        Director d2 = new Director(hb1);
        d2.construct();
        System.out.println(hb1.getHTMLResult() + " Is created");
    }


}
