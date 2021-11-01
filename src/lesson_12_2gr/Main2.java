package lesson_12_2gr;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(2);
        numbers.add(37);
        numbers.add(56);


        //for коллекции List
        for(int i =0; i< numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        //for each по всем коллекциям
        for(Integer n:numbers){
            System.out.println(n);
        }

        //с помощью итератора
        for (Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
