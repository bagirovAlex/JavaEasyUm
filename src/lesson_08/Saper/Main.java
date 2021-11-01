package lesson_08.Saper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaperField saperField = new SaperField();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите уровень сложности: ");
        System.out.println("1 - high");
        System.out.println("2 - medium");
        System.out.println("3 - low");

        int level = scanner.nextInt();
        saperField.deployBombsByLevel(level);
        saperField.printGameMap();

    }


}
