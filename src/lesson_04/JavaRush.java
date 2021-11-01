package lesson_04;

import java.util.Scanner;

public class JavaRush {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        int t = scanner.nextInt();
        if(t>=0){
            System.out.println(warm);
        }else {
            System.out.println(cold);
        }

    }
}
