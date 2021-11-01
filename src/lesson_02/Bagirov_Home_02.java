package lesson_02;

public class Bagirov_Home_02 {
    public static void main(String[] args) {
        System.out.println();
        //1) Вывести на консоль цифры в диапазоне от 20 до 0
        System.out.println("1) Вывести на консоль цифры в диапазоне от 20 до 0");
        for (int i = 20; i >= 0; i--) {
            System.out.print(i + "; ");
        }
        System.out.println();
        System.out.println();

        //2) Вывести на консоль нечетные от -20 до 20
        System.out.println("2) Вывести на консоль нечетные от -20 до 20");
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "; ");
            }
        }
        System.out.println();
        System.out.println();

        //3) Вывести на консоль цифры в диапазоне от 10 до 40, пропустив при этом интервал от 15 до 20
        System.out.println("3) Вывести на консоль цифры в диапазоне от 10 до 40, пропустив при этом интервал от 15 до 20");
        for (int i = 10; i <= 40; i++) {
            if (i < 15 || i > 20) {
                System.out.print(i + "; ");
            }
        }
        System.out.println();
        System.out.println();

        //4) Вывести на консоль сумму четных чисел от 10 до 50
        System.out.println("4) Вывести на консоль сумму четных чисел от 10 до 50");
        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "; ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Спасибо!");

        //Напечатать на консоль:
        //1) все нечетные цифры от 7 до 30
        //2) от 30 до 0
        //3) от 40 до 100 цифры которые делятся на 3 и на 5
        //4) сумму цифр от 1 до 10
        //5) сумму четных чисел от 100 до 150

    }
}
