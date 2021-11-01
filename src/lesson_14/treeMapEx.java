package lesson_14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class treeMapEx {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(5,"a");
        treeMap.put(4,"b");
        treeMap.put(3,"c");
        treeMap.put(2,"a");

        System.out.println(treeMap);



    }
}
