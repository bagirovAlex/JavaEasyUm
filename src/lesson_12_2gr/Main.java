package lesson_12_2gr;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> texts = new LinkedList<>();
        texts.add(5);
        texts.add(455);
        texts.add(475);
        texts.add(6665);
        texts.add(0,7);
        texts.set(1,55);



        System.out.println(texts);
        System.out.println(texts.size());
    }
}
