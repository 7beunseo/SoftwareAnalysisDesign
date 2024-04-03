package study.ch05.tripple.v2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tripple {
    private Tripple(String name) {this.name = name;}

    private static Map<String, Tripple> map = new HashMap<>();
    private static String name;
    static {
        String[] string = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(string).forEach(a -> map.put(a, new Tripple(a)));
    }
    public static Tripple getInstance(String name) {
        return map.get(name);
    }

}
