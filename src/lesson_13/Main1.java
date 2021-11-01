package lesson_13;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Integer> strings = new TreeSet<>(new IntegerRevers());
        strings.add(8);
        strings.add(4);
        strings.add(6);
        strings.add(1);
        strings.add(12);

        System.out.println(strings);



    }
}
