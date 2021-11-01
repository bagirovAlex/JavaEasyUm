package lesson_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExe1 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>(); //Создается коллекция на 16 корзин (baket)!!!
        map.put("Vlad", 4.5);
        System.out.println("Первый влад:" + map);
        map.put("Vlad1", 5.7);
        System.out.println("Второй влад:" + map);

      //  System.out.println();
       // System.out.println();

        Map<String, List<Integer>> nameAndMany = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);

        nameAndMany.put("Джон Доу!!!fvgtbtybghgfbhgnvnhjbmnh", integerList);
        System.out.println(nameAndMany);
        //nameAndMany.put("Toм Смит", 123.22);
        //nameAndMany.put("Джейн Бейкер", 1378.00);
        //nameAndMany.put("Тод Холл", 99.22);
        //nameAndMany.put("Ральф Смит", -19.98);
        //System.out.println(nameAndMany);

        System.out.println(nameAndMany.get("Джон Доу"));


    }
}
