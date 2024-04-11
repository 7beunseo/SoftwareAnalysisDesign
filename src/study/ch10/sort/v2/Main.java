package study.ch10.sort.v2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("a", "c", "b", "z", "f");

        array.sort((a, b) -> a.compareTo(b));
        System.out.println(array);

        array.sort((a, b) -> b.compareTo(a));
        System.out.println(array);

    }
}
