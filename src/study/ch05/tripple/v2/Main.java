package study.ch05.tripple.v2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Tripple a1 = Tripple.getInstance("ALPHA");
        Tripple b1 = Tripple.getInstance("BETA");
        Tripple c1 = Tripple.getInstance("GAMMA");
        Tripple a2 = Tripple.getInstance("ALPHA");
        Tripple b2 = Tripple.getInstance("BETA");
        Tripple c2 = Tripple.getInstance("GAMMA");
        if (a1 == a2) {
            System.out.println("a1 == a2 (" + a1 + ")");
        } else {
            System.out.println("a1 != a2");
        }
        if (b1 == b2) {
            System.out.println("b1 == b2 (" + b1 + ")");
        } else {
            System.out.println("b1 != b2");
        }
        if (c1 == c2) {
            System.out.println("c1 == c2 (" + c1 + ")");
        } else {
            System.out.println("c1 != c2");
        }
        System.out.println("End.");
    }
}
