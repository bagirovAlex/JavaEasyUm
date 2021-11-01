package lesson_03;

public class Main {
    public static void main(String[] args) {
        // Типы данных
        /*    - примитивные типы (всего 8):      пишутся всегда с маленькой буквы - byte, short, int, long, float, double, boolean, char
              - Ссылочные типы (неограниченны):  Пишутся всегда с большой буквы - String

              - Массив - это группа примитивных типов или ссылочных типов. В массив можно положить только однотипные данные.
                Массив имеет индексы от 0 и выше, каждое значение примитивного типа записывается в ячейку памяти имеющую получающую индекс.


         */
        // Создать массив сразу со значениями типа int.
        //       index   0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        int[] numbers = {3, 6, 5, 8, 9, 7, 4, 5, 1, 2, 3, 6};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
//        System.out.println(numbers[6]);
//        System.out.println(numbers[7]);
//        System.out.println(numbers[8]);
//        System.out.println(numbers[9]);
//        System.out.println(numbers[10]);
//        System.out.println(numbers[11]);
        //Индусский код:)
        System.out.println();

        System.out.println("Все значения массива: ");
        for (int i = 0; i < numbers.length; i++) {  //(int i = 0; i < 12; i++)
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();
        System.out.println();

        //Напечатать только четные ячейки
        System.out.println("Четные значения массива: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + "; ");
            }
        }
        System.out.println();
        System.out.println();

    }
}