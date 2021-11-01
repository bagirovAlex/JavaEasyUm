package lesson_03;

import java.util.Scanner;
/* Стандартный пакет java из jdk
    java.
          util - множество безразмерных массивов
          time - работа со временем
          text - работа с текстом
          sql - работа с базой данных
          security - работа по безопасности
          io, nio - копирование и перемещение файлов
          math - математические функции
          lang - стандартный набор для каждого создаваемого класса по работе с клавиатурой,
                 календарем, String и т.п.Здесь и лежит метод System.in и System.out
          net - работа с сетью
          awt - старая технология рисования графических элементов
          applet - методы открытия и работы приложений через браузер

 */


public class Main3 {
    public static void main(String[] args) {
        //Банковский калькулятор
        double money = 1;                                        //сумма денег
        double YearPercentage = 1;                               //годовой процент
        int year = 1;                                            //количество лет

        Scanner consol = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String inputName = consol.nextLine();             //метод nextLine() считывает с клавиатуры String до "enter"

        System.out.println("Введите сумму: ");
        money = consol.nextDouble();                    //метод nextDouble() считывает с клавиатуры Double до "enter"

        System.out.println("Введите годовой %: ");
        YearPercentage = consol.nextDouble();

        System.out.println("На сколько лет: ");
        year = consol.nextInt();                        //метод nextInt() считывает с клавиатуры int до "enter"

        for (int i = 0; i < year; i++) {                        //цикл года, если year = 5, значит 5 циклов
            for (int month = 0; month < 12; month++) {          //цикл внутри года, по 12 месяцам
                money = money + (money / 100 * (YearPercentage / 12)); //Сумма депозита за месяц
            }

        }
        System.out.println("Через " + year + " лет у вас " +inputName+ " будет: " + (int) money + " рублей.");

    }
}
