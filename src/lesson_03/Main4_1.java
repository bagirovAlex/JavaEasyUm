package lesson_03;

import java.util.Scanner;

public class Main4_1 {
    public static void main(String[] args) {
        //Выбор фигуры пользователем
        System.out.println(" Выберите фигуру: ");
        System.out.println(" 1 - круг: ");
        System.out.println(" 2 - овал: ");
        System.out.println(" 3 - квадрат: ");
        System.out.println(" 4 - треугольник : ");
        System.out.println(" 5 - трапеция : ");

        Scanner scanner = new Scanner(System.in);
        //Записать в переменную номер фигуры
        int inputFigura = scanner.nextInt();
        //Узнать что считать у выбранной фигуры: площадь или периметр
        System.out.println(" Что посчитать ?");
        System.out.println(" 1 - площадь");
        System.out.println(" 2 - периметр");
        int inputAction = scanner.nextInt();

        switch (inputFigura) {
            //Если выбрана фигура 1 - круг
            case 1:
                //Уточнить через что считать площадь или периметр, через радиус или диаметр
                System.out.println(" Через что посчитать ?");
                System.out.println(" 1 - радиус ");
                System.out.println(" 2 - диаметр");
                int inputRadiusOrDiameter = scanner.nextInt();
                if (inputRadiusOrDiameter == 1) {
                    System.out.println("Введите радиус круга:");
                    double inputRadius = scanner.nextDouble();
                    if (inputAction == 1) {
                        System.out.println("Площадь круга = " + (Math.PI * Math.pow(inputRadius, 2)));
                    }
                } else if (inputRadiusOrDiameter == 2) {
                    System.out.println("Введите диаметр круга:");
                    double inputDiameter = scanner.nextDouble();
                    System.out.println("Площадь круга = " + (Math.PI * Math.pow(inputDiameter, 2) / 4));

                    // Не получается сделать Периметр если отрабатывать все варианты с помощью которых можно найти площадь и периметр.
                } else {
                    if (inputAction == 2) {
                        System.out.println("Введите через :");

                        double inputRadiusPerimetr = scanner.nextDouble();
                    }

                    System.out.println("Введите через что ");
                    //  if (inputRadiusOrDiameter == 1) {
                    // System.out.println("Введите радиус :");
                    // double inputRadiusPerimetr = scanner.nextDouble();
                    // }


                }
                break;
            case 2:
                System.out.println("Введите большую полуось овала: ");
                double largeSemiAxis = scanner.nextDouble();
                System.out.println("Введите малую полуось овала: ");
                double smallSemiAxis = scanner.nextDouble();
                if (inputAction == 1) {
                    System.out.println("Площадь овала = " + (Math.PI * largeSemiAxis * smallSemiAxis));
                } else {
                    double firstPartOfTheFormula = Math.PI * (largeSemiAxis + smallSemiAxis);
                    double secondPartOfTheFormula = Math.pow((largeSemiAxis - smallSemiAxis) / (largeSemiAxis + smallSemiAxis), 2);
                    double thirdPartOfTheFormula = Math.sqrt(4 - 3 * secondPartOfTheFormula);
                    System.out.println("Периметр овала = " + firstPartOfTheFormula * (1 + (3 * secondPartOfTheFormula) / (10 + thirdPartOfTheFormula)))
                    ;
                }
                break;
            case 3:
                System.out.println("Введите сторону квадрата:");
                int inputSide = scanner.nextInt();
                if (inputAction == 1) {
                    System.out.println("Площадь квадрата = " + (inputSide * inputSide));

                } else {
                    System.out.println("Периметр квадрата = " + (4 * inputSide));
                }
                break;
            case 4:
                System.out.println("Введите стороны треугольника : ");
                double inputSideA = scanner.nextDouble();
                double inputSideB = scanner.nextDouble();
                double inputSideC = scanner.nextDouble();
                if (inputAction == 1) {
                    double pPerimetr = (inputSideA + inputSideB + inputSideC) / 2;
                    System.out.println("Площадь треугольника = " + (Math.sqrt(pPerimetr * (pPerimetr - inputSideA) * (pPerimetr - inputSideB) * (pPerimetr - inputSideC))));
                } else {
                    System.out.println("Периметр треугольника = " + (inputSideA + inputSideB + inputSideC));
                }
                break;
            case 5:
                System.out.println("Введите сторону A : ");
                double sideA = scanner.nextDouble();
                System.out.println("Введите сторону B : ");
                double sideB = scanner.nextDouble();
                System.out.println("Введите сторону C : ");
                double sideC = scanner.nextDouble();
                System.out.println("Введите сторону D : ");
                double sideD = scanner.nextDouble();
                if (inputAction == 1) {
                    double solutionOne = (sideA + sideB) / 2;
                    double solutionTwo = Math.pow(sideB - sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideD, 2);
                    double solutionThree = (2 * Math.pow(sideB - sideA, 2));
                    double solutionFour = (solutionTwo / solutionThree);
                    double solutionFive = (Math.pow(sideC, 2) - solutionFour);
                    double solutionSix = (Math.sqrt(solutionFive));
                    System.out.println("Площадь трапеции = " + (solutionOne * solutionSix));

                } else {
                    System.out.println("Периметр трапеции = " + (sideA + sideB + sideC + sideD));
                }

                break;
            default:
                System.out.println("Извините, в нашей программе такой фигуры нет!");


        }


    }
}