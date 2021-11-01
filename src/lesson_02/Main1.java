package Lesson2;

public class Main1 {
    public static void main(String[] args) {
        //Подбор туристического тура по средствам
        //Дано:
        int tour = 40000;       //Стоимость тура
        int cash = 20000;       //Наличные деньги
        int salary = 12000;     //Зарплата
        int monthToTrip = 5;    //Месяцев до отпуска, до поездки
        int monthlyExpense = 7500; //Ежемесячный расход

        int monthlyProfit = salary - monthlyExpense;  //Ежемесячный остаток денег
        int savedMoneyToTrip = monthlyProfit * monthToTrip; //Сумма накоплений до отпуска

        if (savedMoneyToTrip + cash >= tour) { //если накоплений + наличных хватит на тур
            System.out.println("Мы едим!");
        } else {                               //иначе
            System.out.println("Увы(((");
        }

        //Сколько месяцев копить на машину?
        //Дано:
        int priceLexusLX = 12000000; //Цена джипа Lexus LX
        int priceLexusNX = 4500000;  //Цена кроссовера Lexus NX
        int priceNiva = 1200000;     //Цена кроссовера Лада Нива

        int myCash = 10000;         //Наличные деньги
        int mySalary = 200000;       //Зарплата
        int myExpense = 150000;      //Расход
        int monthToCar = 12;         //Сколько месяцев копим

        //Решение:
        int monthProfit = mySalary - myExpense;     //Чистый доход в месяц
        if ((monthProfit * monthToCar + myCash) >= priceLexusLX) {
            int remains = (myCash + monthProfit * monthToCar) - priceLexusLX;
            System.out.println("Поздравляю! Через " + monthToCar + " месяцев Вы купите Lexus LX и еще останется " + remains + " руб.");

        } else if ((monthProfit * monthToCar + myCash) >= priceLexusNX) {
            int remains = (myCash + monthProfit * monthToCar) - priceLexusNX;
            System.out.println("Поздравляю! Через " + monthToCar + " месяцев Вы купите Lexus NX и еще останется " + remains + " руб.");

        } else if ((monthProfit * monthToCar + myCash) >= priceNiva) {
            int remains = (myCash + monthProfit * monthToCar) - priceNiva;
            System.out.println("Поздравляю! Через " + monthToCar + " месяцев Вы купите Lada Niva и еще останется " + remains + " руб.");

        } else {
            System.out.println("Всё-таки пешком ходить полезнее!");
        }


    }
}
