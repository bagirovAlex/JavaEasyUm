package lesson_12_2gr;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        long startTimeArrayListAdd = System.currentTimeMillis();

        for(int i=0;i<1000000;i++){
            arrayList.add("Hi"+i);
        }
        long endTimeArrayListAdd = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (endTimeArrayListAdd-startTimeArrayListAdd));

        long startTimeArrayListAdd1 = System.currentTimeMillis();

        for(int i=0;i<1000000;i++){
            linkedList.add("Pe"+i);
        }
        long endTimeArrayListAdd1 = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (endTimeArrayListAdd1-startTimeArrayListAdd1));



        //get

        long startTimeArrayListGet = System.currentTimeMillis();

        for(int i=0;i<1000000;i++){
            arrayList.get(i);
        }
        long endTimeArrayListGet = System.currentTimeMillis();
        System.out.println("ArrayList get: " + (endTimeArrayListGet-startTimeArrayListGet));

        long startTimeArrayListGet1 = System.currentTimeMillis();

        for(int i=0;i<1000000;i++){
            linkedList.get(i);
        }
        long endTimeArrayListGet1 = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (endTimeArrayListGet1-startTimeArrayListGet1));

    }
}
