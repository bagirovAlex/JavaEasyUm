package Lesson_01;

public class Bagirov_Home_01 {
    public static void main(String[] args) {
        //Площадь по трем сторонам треугольника - Формула Герона
        double a = 555, b = 555, c = 555;
        double p = (a + b + c) / 2;
        double triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println();
        System.out.println("Если сторона А = " + a + ", сторона В = " + b + ", сторона С = " + c + ", тогда его площадь ровна = " + triangleArea);
        System.out.println("Спасибо, что обратились в нашу IT-компанию:))");

        //Расчет покупок в магазине
        System.out.println();
        System.out.println("Задача: Расчет покупок в магазине");
        /*Даны переменные:
        - деньги которые у нас есть - 1000 рублей
                - стоимость пиццы - 230 рублей
                - стоимость жвачки - 26 рублей
                - стоимость конфеты - 2,5 рубля
        Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пиц, затем на сдачу купить максимум жвачек,
                затем на оставшуюся сдачу купить конфет.
                В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
        На эти деньги мы можем купить:
        - 4 пиццы
                - 3 жвачки
                - 0 конфет
        Сдача с магазина: 2 рубля.
        */
        int cash = 1200;
        int priceOfPizza = 230;
        int priceOfGym = 26;
        double priceOfCandies = 2.5;
        //Решение
        //Количество пиццы
        int countOfPizza = (cash / priceOfPizza);
        System.out.println("Пиццы: " + countOfPizza + " шт.");
        //Сдача после покупки пиццы
        double balanceAfterPizza = cash - (priceOfPizza * countOfPizza); //cash%priceOfPizza
        System.out.println(" - Сдача: " + balanceAfterPizza + " руб.");
        System.out.println();

        //Колическтво жвачек
        int countOfGym = (int) (balanceAfterPizza / priceOfGym);
        System.out.println("Жвачек: " + countOfGym + " шт.");
        //Сдача после покупки жвачек
        double balanceAfterGym = balanceAfterPizza % priceOfGym;
        System.out.println(" - Сдача: " + balanceAfterGym + " руб.");
        System.out.println();

        //Колическтво конфет
        int countOfCandies = (int) (balanceAfterGym / priceOfCandies);
        System.out.println("Конфет: " + countOfCandies + " шт.");
        //Сдача после покупки конфет
        double balanceAfterCandies = balanceAfterGym % priceOfCandies;
        System.out.println(" - Сдача: " + balanceAfterCandies + " руб.");
        System.out.println();


    }
}
