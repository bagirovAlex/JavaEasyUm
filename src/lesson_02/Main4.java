package lesson_02;

public class Main4 {
    public static void main(String[] args) {
        //циклы - то что заставляет код повторяться определенное количество раз
        // Три типа циклов:   for (самый полный)    foreach     while

        //конструкция for(инициализация;условие;итерация){тело цикла}
       /* for (  от скольки считать?      ;  условие выполнено?  ;  до сколько считать?     ) { //так цикл будет работать до бесконечности
            System.out.println("Привет!");
        }
        */

        for (int i = 0; i < 10; i = i + 10) { //i++   i+=1
            System.out.print("Привет!");
        }
        System.out.println();

        //Напечатать только четные цифры в диапазоне от 100 до 150
        for (int i = 100; i < 150; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Напечатать цифры, которые делятся и на 3 и на 5
        for (int i = 15; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Сложить цифры в диапазоне
        int summa = 0;
        for (int i = 10; i <= 15; i++) {
            summa +=i;
        }
        System.out.println("Сумма: "+summa);
    }
}
