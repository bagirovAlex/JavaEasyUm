package lesson_05;

public class Bagirov_Home_05 {
    public static void main(String[] args) {
        //Записать в двумерный массив 0 и 1 в шахматном порядке и вывести на консоль
        System.out.println();
        System.out.println("1) Записать в двумерный массив 0 и 1 в шахматном порядке и вывести на консоль");
        int[][] numbers = new int[8][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    numbers[i][j] = 1;
                    System.out.print(numbers[i][j] + " ");
                } else {
                    numbers[i][j] = 0;
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2) Заполнить массив с шагом +5 и вывести на консоль");
        //Заполнить массив с шагом +5 и вывести на консоль
        int[][] numbers2 = new int[4][4];
        int a = 5;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                numbers2[i][j] = a;
                a = a + 5;
                System.out.print(numbers2[i][j] + " ");
            }
            System.out.println();

        }

    }
}
