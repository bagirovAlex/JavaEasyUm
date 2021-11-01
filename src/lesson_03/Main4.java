package lesson_03;

import java.util.Scanner;

public class  Main4 {
    public static void main(String[] args) {
        //Создание переменной console типа Scanner с параметром ввода System.in
        Scanner console = new Scanner(System.in);

        //Запрос у пользователя номера фигуры для расчета
        System.out.println("Выберите фигуру:");
        System.out.println("1: Круг");
        System.out.println("2: Овал");
        System.out.println("3: Квадрат");
        System.out.println("4: Треугольник");
        System.out.println("5: Трапеция");
        //Запись введенного номера фигуры пользователем
        int inputFigure = console.nextInt();

        switch (inputFigure) {
            //1. Если выбран "Круг"
            case 1:
                //Запрос у пользователя, что именно посчитать
                System.out.println("Что посчитать?");
                System.out.println("1: Площадь круга");
                System.out.println("2: Окружность круга");
                //Запись введенного номера пользователем
                int inputAction1 = console.nextInt();

                //Запрос у пользователя радиуса круга
                System.out.println("Введите радиус:");
                int inputSide1 = console.nextInt();

                //Считаем площадь круга
                if (inputAction1 == 1) {
                    System.out.println("Площадь круга = " + (Math.PI * Math.pow(inputSide1,2)));
                }
                //Считаем длину окружности
                else if (inputAction1 == 2) {
                    System.out.println("Длина окружности = " + (2 * Math.PI * inputSide1));
                } else {
                    System.out.println("Выберите 1 или 2");
                }
                break;

            //2. Если выбран "Овал"
            case 2:
            //Запрос у пользователя, что именно посчитать
            System.out.println("Что посчитать?");
            System.out.println("1: Площадь овала");
            System.out.println("2: Окружность овала");
            //Запись введенного номера пользователем
            int inputAction2 = console.nextInt();

            //Запрос у пользователя большого и малого радиусов овала
            System.out.println("Введите малый радиус:");
            int inputSide2Small = console.nextInt();
            System.out.println("Введите большой радиус:");
            int inputSide2Big = console.nextInt();
            //Считаем площадь овала
            if (inputAction2 == 1){
                System.out.println("Площадь круга = " + (Math.PI * inputSide2Small * inputSide2Big));
            }
            //Считаем длину окружности овала
            else if (inputAction2 == 2) {
                System.out.println("Длина окружности = " + (2 * Math.PI * Math.sqrt((Math.pow(inputSide2Small,2)+Math.pow(inputSide2Big,2))/2)));
            } else {
                System.out.println("Выберите 1 или 2");
            }
                break;
            //3. Если выбран "Квадрат"
            case 3:
                //Запрос у пользователя, что именно посчитать
                System.out.println("Что посчитать?");
                System.out.println("1: Площадь квадрата");
                System.out.println("2: Периметр квадрата");
                //Запись введенного номера пользователем
                int inputAction3 = console.nextInt();

                //Запрос у пользователя стороны квадрата
                System.out.println("Введите сторону квадрата А:");
                int inputSide3A = console.nextInt();
                //Считаем площадь квадрата
                if (inputAction3 == 1) {
                    System.out.println("Площадь квадрата = " + (inputSide3A * inputSide3A));
                }
                //Считаем периметр квадрата
                else if (inputAction3 == 2) {
                    System.out.println("Периметр квадрата = " + (inputSide3A * 4));
                } else {
                    System.out.println("Выберите 1 или 2");
                }
                break;
            // 4. Если выбран "Треугольник"
            case 4:
                //Запрос у пользователя, что именно посчитать
                System.out.println("Что посчитать?");
                System.out.println("1: Площадь треугольника");
                System.out.println("2: Периметр треугольника");
                //Запись введенного номера пользователем
                int inputAction4 = console.nextInt();

                //Запрос у пользователя стороны квадрата
                System.out.println("Введите сторону А:");
                int inputSide4A = console.nextInt();
                System.out.println("Введите сторону В:");
                int inputSide4B = console.nextInt();
                System.out.println("Введите сторону С:");
                int inputSide4C = console.nextInt();

                //Считаем площадь треугольника
                if (inputAction4 == 1) {
                    double p = (inputSide4A + inputSide4B + inputSide4C)/2;
                    System.out.println("Площадь треугольника = " + (Math.sqrt(p*(p-inputSide4A)*(p-inputSide4B)*(p-inputSide4C))));
                }
                //Считаем периметр треугольника
                else if (inputAction4 == 2) {
                    System.out.println("Периметр треугольника = " + (inputSide4A+inputSide4B+inputSide4C));
                } else {
                    System.out.println("Выберите 1 или 2");
                }
                break;
            // 5. Если выбрана "Трапеция"
            case 5:
                //Запрос у пользователя, что именно посчитать
                System.out.println("Что посчитать?");
                System.out.println("1: Площадь трапеции");
                System.out.println("2: Периметр трапеции");
                //Запись введенного номера пользователем
                int inputAction5 = console.nextInt();

                //Запрос у пользователя стороны квадрата
                System.out.println("Введите сторону А:");
                int inputSide5A = console.nextInt();
                System.out.println("Введите сторону В:");
                int inputSide5B = console.nextInt();
                System.out.println("Введите сторону С:");
                int inputSide5C = console.nextInt();
                System.out.println("Введите сторону D:");
                int inputSide5D = console.nextInt();
                System.out.println("Введите высоту H:");
                int inputSide5H = console.nextInt();

                //Считаем площадь трапеции
                if (inputAction5 == 1) {
                    System.out.println("Площадь трапеции = " + (inputSide5H/2*(inputSide5A+inputSide5B)));
                }
                //Считаем периметр треугольника
                else if (inputAction5 == 2) {
                    System.out.println("Периметр трапеции = " + (inputSide5A+inputSide5B+inputSide5C+inputSide5D));
                } else {
                    System.out.println("Выберите 1 или 2");
                }
                break;
            default:
                System.out.println("В нашей программе такого нет.");
        }


    }
}
