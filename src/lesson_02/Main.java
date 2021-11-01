package Lesson2;

public class Main {
    public static void main(String[] args) {
        //управляющая конструкция
        // < > <= >= == !=if
        //&& and
        //|| or
        //мат. опреаторы: + - / * %  ++ --

        int a = 8, b = 7, c = 8;

        if (a == b && b == c) {
            //если ДА тогда тело выполнится
            System.out.println("Треугольник равностороний");
        } else if (a != b && b != c && c != a) {
            //если ДА тогда тело выполнится
            System.out.println("Треугольник разностороний");
        } else {
            System.out.println("Это равнобедренный");
        }
    }

}
