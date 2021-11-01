package lesson_04;

import java.util.Scanner;

public class JavaRush2 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String n = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(n + militaryCommissar);
        }
    }

}
