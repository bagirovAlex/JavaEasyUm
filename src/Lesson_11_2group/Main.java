package Lesson_11_2group;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar(2000, "Мышка", 12);
        Tovar tovar2 = new Tovar(2000, "Мышка", 12);
        Tovar tovar3 = tovar1;
        System.out.println(tovar1 == tovar3); //== для ссылочных типов == проверяется равенство адресов переменных

        System.out.println(tovar1.equals(tovar2)); //equals сравнение для ссылочных типов
        System.out.println(tovar1);


    }
}
