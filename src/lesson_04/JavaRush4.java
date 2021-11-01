package lesson_04;

import java.util.Scanner;

public class JavaRush4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean young = age <= 20;
        boolean old = age >= 60;
        if (young || old) {
            System.out.println("можно не работать");
        }
    }
}
